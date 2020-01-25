import sbt._
import Keys._

object Version {
  val jol = "0.9"
}

object Dependencies {
  val jol    = "org.openjdk.jol"        % "jol-core" % Version.jol
  val jolCli = "org.openjdk.jol"        % "jol-cli"  % Version.jol
}

