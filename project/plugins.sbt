
val pluginVersion = sys.props.get("plugin.version").getOrElse("0.1.0")

addSbtPlugin("org.scala-js"     % "sbt-scalajs"              % "0.6.14")
addSbtPlugin("org.scala-native" % "sbt-crossproject"         % pluginVersion)
addSbtPlugin("org.scala-native" % "sbt-scalajs-crossproject" % pluginVersion)
addSbtPlugin("org.scala-native" % "sbt-scala-native"         % "0.1.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.4")

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-encoding",
  "utf8"
)
