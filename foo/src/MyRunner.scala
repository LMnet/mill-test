import json._

object MyRunner extends App {
  SeqCell(JsString("a string"), SeqCell(JsNumber(1.0), SeqCell(JsBoolean(true),
    SeqEnd))).print
  // res0: String = ["a string", 1.0, true]

  val res = ObjectCell("a", SeqCell(JsNumber(1.0), SeqCell(JsNumber(2.0), SeqCell(JsNumber(3.0),
      SeqEnd))),
    ObjectCell("b", SeqCell(JsString("a"), SeqCell(JsString("b"), SeqCell(JsString("c"),
        SeqEnd))),
      ObjectCell("c", ObjectCell("doh", JsBoolean(true), ObjectCell("ray", JsBoolean(false), ObjectCell("me", JsNumber(1.0), ObjectEnd))),
        ObjectEnd)
    )
  ).print

  println(res)
  // res1: String = {"a": [1.0, 2.0, 3.0], "b": ["a", "b", "c"], "c": {"doh": true, "ray": false, "me": 1.0}}
}