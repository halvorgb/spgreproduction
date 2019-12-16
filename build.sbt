ThisBuild / organization := "gob.bears"
ThisBuild / name := "grizzly"
ThisBuild / scalaVersion := "2.13.1"
ThisBuild / githubOwner := "halvorgb"
ThisBuild / githubRepository := "spgreproduction"
ThisBuild / githubUser := sys.env.getOrElse("GITHUB_USER", "")
ThisBuild / githubTokenSource := Some(TokenSource.Environment("GITHUB_TOKEN"))

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-language:higherKinds",
  "-language:postfixOps",
  "-feature",
  "-Xfatal-warnings",
  "-Ymacro-annotations"
)

lazy val grizzly = (project in file("."))
  .settings(
    addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3"),
    addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.0")
  )
  .enablePlugins(GitVersioning)
