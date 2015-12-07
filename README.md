# HTTP4S-Jetty-cURL

Minimal test app to investigate problem seen with cURL and HTTP4S/Jetty.

Run HTTP4S/Jetty app:

``sbt> run``

Run plain Jetty app:

``sbt> runMain jettytest.JettyTestApp``

Post the test JSON at both servers using JMeter:

``$ bin/postJSONwithJMeter.sh``

Repeat as many times as you like.

Post test JSON at Jetty with cURL 1000 times:

``$ bin/postJSONwithCurl.sh 1000 8080``

Repeat as many times as you like.

Post test JSON at HTTP4S/Jetty with cURL 100 times:

``$ bin/postJSONwithCurl.sh 100 8081``

Repeat until it hangs. Wait a while, watching CPU utilization. You can post with JMeter while cURL is hanging.
