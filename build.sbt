name := "JettyTest"

version := "1.0"

scalaVersion := "2.11.7"

mainClass := Some("jettytest.JettyApp")

val jettyVersion       = "9.3.2.v20150730"
val http4sVersion      = "0.10.1"

libraryDependencies ++= Seq(

  "org.eclipse.jetty"             % "jetty-webapp"        % jettyVersion,
  "org.http4s"                    %% "http4s-dsl"         % http4sVersion,
  "org.http4s"                    %% "http4s-jetty"       % http4sVersion,
  "org.slf4j"                     % "slf4j-api"           % "1.6.4",
  "org.slf4j"                     % "slf4j-simple"        % "1.6.4"
)

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
