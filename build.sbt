
name := "Meerkat"

organization := "org.meerkat"

version := "0.1.0"

scalaVersion := "2.12.21"

Test / parallelExecution := false

Compile / unmanagedSourceDirectories += baseDirectory.value / "src" / "macros" / "scala"

libraryDependencies ++= Seq(
	"org.scalactic" %% "scalactic" % "3.2.20",
	"org.scalatest" %% "scalatest" % "3.2.20" % Test,
	"com.google.guava" % "guava-testlib" % "23.0",
	"commons-io" % "commons-io" % "2.22.0",
	"org.bitbucket.inkytonik.dsinfo" %% "dsinfo" % "0.4.0"
)
