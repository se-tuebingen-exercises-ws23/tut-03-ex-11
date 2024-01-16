scalaVersion := "3.2.0"

// You can turn this option on if you want,
// but don't commit the changes -- it results in bad error messages.
// scalafmtOnCompile := true

// comment this line out if the error messages are too detailed for you:
ThisBuild / scalacOptions += "-explain"

libraryDependencies += "org.scalameta" %% "munit" % "1.0.0-M10" % Test
libraryDependencies += "org.scalameta" %% "munit-scalacheck" % "1.0.0-M10" % Test

coverageEnabled := true

// The coverage will be in an "out" folder for easier access :)
coverageDataDir := file("out")

// add aliases for more arcane command sequences
addCommandAlias("testCoverage", ";clean;test;coverageReport")
addCommandAlias("mutate", ";stryker")
