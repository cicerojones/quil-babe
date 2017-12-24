(ns quilbabel.funbabel
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(def min-r 10)

(defn setup []
  ; initial state
  {:x 0 :y 0 :r min-r
   :frame-rate 1
   }
  )

(defn my-update [state]
  ; increase radius of the circle by 1 on each frame
  (update-in state [:r] inc))

(defn draw [state]
  (q/background 255)
  (q/ellipse (:x state) (:y state) (:r state) (:r state)))

; decrease radius by 1 but keeping it not less than min-r
(defn shrink [r]
  (max min-r (dec r)))

(defn mouse-moved [state event]
  (-> state
      ; set circle position to mouse position
      (assoc :x (:x event) :y (:y event))
      ; decrease radius
      (update-in [:r] shrink)))

(q/defsketch example
  :size [200 200]
  :setup setup
  :draw draw
  :update my-update
  :mouse-moved mouse-moved
  :middleware [m/fun-mode])
