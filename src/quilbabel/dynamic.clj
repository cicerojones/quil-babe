(ns quilbabel.dynamic
  (:require [quil.core :as q]))



;; (defn setup []
;;   (q/smooth)
;;   (q/no-stroke)
;;   (q/set-state! :mouse-position (atom [0 0])))

(defn setup []
  (q/frame-rate 10))

;; (defn draw
;;   []
;;   (q/background-float 125)
;;   (q/stroke-weight 20)
;;   (q/stroke-float 10)
;;   (let [[x y] @(q/state :mouse-position)]
;;     (q/point x y)))

(defn draw []
  (q/stroke (q/random 255) (q/random 255) (q/random 255))
  (q/fill (q/random 255))
  (let [diam (q/random 100)
        x    (q/random (q/width))
        y    (q/random (q/height))]
    (q/ellipse x y diam diam)))

;; (defn mouse-moved []
;;   (let [x (q/mouse-x)  y (q/mouse-y)]
;;     (reset! (q/state :mouse-position) [x y])))
