name := "sbt-jumpstart"

organizationName := "SBTJumpstart"

organization := "com.sbtjumpstart"

version := "0.2"

scalaVersion := "2.10.1"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

resolvers ++= Seq(
  "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases/",
  "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "io.spray"            %   "spray-can"              % "1.1-M7"
  ,"io.spray"           %   "spray-routing"          % "1.1-M7"
  ,"io.spray"           %   "spray-testkit"          % "1.1-M7"
  ,"io.spray"           %   "spray-client"           % "1.1-M7"
  ,"io.spray"           %   "spray-json_2.10"        % "1.2.3"
  ,"com.typesafe.akka"  %   "akka-actor_2.10"        % "2.1.0"
  ,"org.specs2"         %   "specs2_2.10"            % "1.14"    % "test"
  ,"com.typesafe.slick" %   "slick_2.10"             % "1.0.0"
  ,"com.h2database"     %   "h2"                     % "1.3.166"
  ,"org.xerial"         %   "sqlite-jdbc"            % "3.6.20"
  ,"junit"              %   "junit"                  % "4.8.1"     % "test"
  ,"ch.qos.logback"     %   "logback-classic"        % "1.0.7"
  ,"postgresql"         %   "postgresql"             % "9.1-901.jdbc4"
  ,"joda-time"          %   "joda-time"              % "2.1"
  ,"org.joda"           %   "joda-convert"           % "1.2"
  ,"org.scalatest"      %   "scalatest_2.10"         % "1.9.1" % "test"
)

EclipseKeys.withSource := true // Tells SBT Eclipse to pull the sources for the library dependencies (Very helpful for understanding libraries and debugging)
