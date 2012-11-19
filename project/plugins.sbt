resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "Sonatype releases"  at "https://oss.sonatype.org/content/repositories/releases/"

// To generatoe Scala IDE project

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.0")

// To generate IntelliJ Idea project https://github.com/mpeltonen/sbt-idea

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.2.0-SNAPSHOT")

