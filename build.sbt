ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaAssignment"
  )

libraryDependencies ++= Seq(
  "org.apache.pekko" %% "pekko-actor-typed",
  "org.apache.pekko" %% "pekko-stream-typed"
).map(_ % versions.value.pekko)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % versions.value.scalatest,
  "org.scalatestplus" %% "mockito-5-12" %  versions.value.mockito,
  "org.apache.pekko" %% "pekko-actor-testkit-typed" % versions.value.pekko,
  "org.apache.pekko" %% "pekko-stream-testkit" % versions.value.pekko,
).map(_ % Test)