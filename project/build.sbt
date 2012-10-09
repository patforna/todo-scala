name := "SBTProject"

version := "LOCAL"

libraryDependencies ++= Seq()

publishMavenStyle := false

retrieveManaged := true

managedDirectory <<= baseDirectory(_ / "ide" / "lib_managed")

retrievePattern := "([classifier]/)[artifact](-[revision])(-[classifier]).[ext]"

logLevel := Level.Info

showTiming := true

fork := true
