(q/defsketch texty
:size [480, 120]
:setup #(q/text-font (q/create-font "data/Trattatello.ttf" 24))
:draw #(dorun (q/text-size 48) (q/text "YO Adrian" 100, 50))
  )

;; (q/defsketch quil-example
;;   :title "Oh shit"
;;   :setup #(q/text "YO Adrian" 10, 10)
;;   :size [480 120]
;;   )

;; (q/defsketch texty
;; :size [480, 120]
;; :setup #(q/load-font "Trattatello.ttf")
;; :draw #(q/text "YO Adrian" 100, 20)
;; )

;; "Exception in  :setup  function:  #error {\n :cause loadFont() is for .vlw files, try createFont()\n :via\n [{:type java.lang.IllegalArgumentException\n   :message loadFont() is for .vlw files, try createFont()\n   :at [processing.core.PApplet loadFont PApplet.java 6153]}]\n :trace\n [[processing.core.PApplet loadFont PApplet.java 6153]\n  [quil.Applet loadFont nil -1]\n  [quil.core$load_font invokeStatic core.cljc 2365]\n  [quil.core$load_font invoke core.cljc 2338]\n  [quilbabel.core$fn__6846 invokeStatic text.clj 9]\n  [quilbabel.core$fn__6846 invoke text.clj 7]\n  [quil.middlewares.safe_fns$wrap_fn$fn__114 invoke safe_fns.clj 9]\n  [quil.middlewares.bind_output$bind_output$iter__148__152$fn__153$fn__164 invoke bind_output.clj 21]\n  [quil.applet$_setup invoke applet.clj 217]\n  [quil.Applet setup nil -1]\n  [processing.core.PApplet handleDraw PApplet.java 2393]\n  [quil.Applet handleDraw nil -1]\n  [processing.awt.PSurfaceAWT$12 callDraw PSurfaceAWT.java 1540]\n  [processing.core.PSurfaceNone$AnimationThread run PSurfaceNone.java" 
;; PFont font;

;; void setup() {
;;   size(480, 120);
;;   // font = createFont("SourceCodePro-Regular.ttf", 32);
;;   font = createFont("Trattatello.ttf", 32);
;;   textFont(font);
;; }

;; void draw() {
;;   background(102);
;;   textSize(32);
;;   text("That’s one small step for man...", 25, 60);
;;   textSize(16);
;;   text("That’s one small step for man...", 27, 90);
;; }
