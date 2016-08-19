name := "scalaML"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "edu.stanford.nlp" % "stanford-corenlp" % "3.6.0",
  "edu.stanford.nlp" % "stanford-parser" % "3.6.0",
  // https://mvnrepository.com/artifact/cc.factorie/factorie_2.11
  "cc.factorie" % "factorie_2.11" % "1.2"
)