import bintray.Keys._

name := "read-write-actor"

version := "0.1.0"

organization := "com.vmunier"

homepage := Some(url("https://github.com/vmunier/read-write-actor"))

crossScalaVersions := Seq("2.10.4", "2.11.4")

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.7"

pomExtra := (
  <scm>
    <url>git@github.com:vmunier/read-write-actor.git</url>
    <connection>scm:git:git@github.com:vmunier/read-write-actor.git</connection>
  </scm>
  <developers>
    <developer>
      <id>vmunier</id>
      <name>Vincent Munier</name>
      <url>https://github.com/vmunier</url>
    </developer>
  </developers>
)
publishMavenStyle := true
repository in bintray := "scala"
bintrayPublishSettings
