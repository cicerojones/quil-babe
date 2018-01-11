(q/defsketch texty
  :size [480, 120]
  :setup #(q/text-font (q/create-font "data/Trattatello.ttf" 24))
  :draw #(do (q/text-size 48) (q/text "YO Adrian" 100, 50))
  )

(q/defsketch texty
  :size [640, 360]

  :setup #(do (q/background 0)
              (q/text-font
               (q/create-font
                "data/SourceCodePro-Regular.ttf"
                ;; "data/Trattatello.ttf"
                24))
              (q/text-align :center, :center))
  :draw #(do (q/text-size 48) (q/text "YO Adrian" 100, 50))
  )


(q/defsketch no-font-with-draw
  :size [480 240]
  :setup #(do (q/text-font (q/create-font "data/SourceCodePro-Regular.ttf" 24)))
  :draw #(dorun

	  (map
	   (partial
	    (fn do-it [coll] (q/text (str (char (first coll))) (second coll) (nth coll 2))))


	   (map
	    (fn add-to [n xs] (cons n xs))
	    (range 65 75)
	    (for [y (range 20 220 20) x (range 20 460 20)] (vector x y))))))

(q/defsketch something
  :size [480 240]
  :setup #(dorun (q/text-font (q/create-font "data/SourceCodePro-Regular.ttf" 24))
                 (dorun

		  (map
		   (partial
		    (fn do-it [coll] (q/text (str (char (first coll))) (second coll) (nth coll 2))))


		   (map
		    (fn add-to [n xs] (cons n xs))
		    (range 65 75)
		    (for [y (range 20 220 20) x (range 20 460 20)] (vector x y)))))))
