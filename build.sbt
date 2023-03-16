ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.1"

ThisBuild / organization := "com.peknight"

lazy val commonSettings = Seq(
  scalacOptions ++= Seq(
    "-feature",
    "-deprecation",
    "-unchecked",
    "-Xfatal-warnings",
    "-language:strictEquality",
    "-Xmax-inlines:64"
  ),
)

lazy val log = (project in file("."))
  .aggregate(
    logCore.jvm,
    logCore.js,
  )
  .enablePlugins(JavaAppPackaging)
  .settings(commonSettings)
  .settings(
    name := "log",
  )

lazy val logCore = (crossProject(JSPlatform, JVMPlatform) in file("log-core"))
  .settings(commonSettings)
  .settings(
    name := "log-core",
  )