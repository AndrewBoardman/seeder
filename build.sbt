name := "seeder"
version := "1.0-SNAPSHOT"
organization := "me.paulschwarz"
scalaVersion := "2.12.4"
description := "A helper for creating and seeding – ideal for testing"
licenses += "GPLv2" -> url("https://www.gnu.org/licenses/gpl-2.0.html")

libraryDependencies += "junit" % "junit" % "4.12"
libraryDependencies += "org.mockito" % "mockito-core" % "2.15.0"
libraryDependencies += "com.github.javafaker" % "javafaker" % "0.14"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"