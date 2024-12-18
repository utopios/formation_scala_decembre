import scala.collection.Seq

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.15"

lazy val root = (project in file("."))
  .settings(
    name := "correction_poo",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % "2.7.0", // Acteurs typés
      "com.typesafe.akka" %% "akka-stream" % "2.7.0" // Flux (streams) d'événements
    ),
  )
