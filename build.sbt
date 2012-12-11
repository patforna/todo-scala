import com.typesafe.startscript.StartScriptPlugin

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

name := "todo-scala"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.2"

seq(webSettings :_*)

classpathTypes ~= (_ + "orbit")

publishMavenStyle := false

retrieveManaged := true

managedDirectory <<= baseDirectory(_ / "ide" / "lib_managed")

retrievePattern := "([classifier]/)[artifact](-[revision])(-[classifier]).[ext]"

logLevel := Level.Info

showTiming := true

fork := true

libraryDependencies ++= Seq(
  "org.scalatra" % "scalatra" % "2.1.1",
  "org.scalatra" % "scalatra-scalate" % "2.1.1",
  "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime",
  "org.mongodb" %% "casbah" % "2.3.0",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" % "container",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar"))
)
