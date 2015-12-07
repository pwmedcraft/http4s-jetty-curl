package jettytest

import org.http4s.Charset
import org.http4s.dsl._
import org.http4s.server.HttpService
import org.http4s.server.jetty.JettyBuilder

object JettyApp {

  def main(args: Array[String]): Unit = {

    val service = HttpService { case req => Ok("Hello from HTTP4S Jetty") }

    val echo = HttpService {
      case req @ POST -> Root => Ok(req.bodyAsText(Charset.`UTF-8`))
    }

    try {
      JettyBuilder
        .bindHttp(8081)
        .mountService(service, "/hello")
        .mountService(echo, "/echo")
        .run
        .awaitShutdown()
    } catch { case e: Throwable ⇒
      e.printStackTrace()
      sys.exit(-1)
    }
  }


}

