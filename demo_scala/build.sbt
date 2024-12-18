import sbt.Keys.libraryDependencies

import scala.Seq

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.15"

lazy val root = (project in file("."))
  .settings(
    name := "demo_scala",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % "2.7.0", // Acteurs typés
      "com.typesafe.akka" %% "akka-stream" % "2.7.0", // Flux (streams) d'événements
      "org.junit.jupiter" % "junit-jupiter-api" % "5.10.0" % Test,
      "org.junit.jupiter" % "junit-jupiter-engine" % "5.10.0" % Test
    ),
    libraryDependencies += "io.reactivex" %% "rxscala" % "0.27.0"

  )

testFrameworks +=new TestFramework("munit.Framework")