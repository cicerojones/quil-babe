(ns quilbabel.mousebabel
(:require [quil.core :refer :all])
(:require [quilbabel.mousebabeldynamic :as dynamic]))

(defsketch mouse-example
  :title "Mouse example."
  :size [200 200]
  :setup dynamic/setup
  :draw dynamic/draw
  :mouse-moved dynamic/mouse-moved)
