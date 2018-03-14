(ns quilbabel.core
  ;; (:gen-class)

  ;; (:require
  ;;  [quil.core :as q]
  ;;  [quilbabel.dynamic :as dynamic]
  ;;  [quil.middleware :as m]
  ;;  [overtone.live :as o])

  (:require
   [quil.core :as q]
   [quilbabel.dynamic :as dynamic]
   [quil.middleware :as m]
   [quil.helpers.seqs :as s]
   [quil.helpers.drawing :as d]
   [quil.helpers.calc :as c]
   ;; [overtone.live :as o]
   )
  )

;; (q/defsketch quil-example
;;   :title "Oh shit"
;;   :setup dynamic/setup
;;   :draw dynamic/draw
;;   :size [969 600]
;;   :mouse-moved dynamic/mouse-moved
;;   ;; [323 200]
;;   )

;; (q/defsketch allone
;; :setup #(q/frame-rate 1)
;; :draw #(q/ellipse 100 100 10 10))

;; (q/defsketch quil-example
;;   :title "Oh shit"
;;   :setup dynamic/setup
;;   :draw dynamic/draw
;;   :size [323 200]
;;   )

