package todo

import org.scalatra._
import scalate.ScalateSupport

class Controllers extends ScalatraServlet with ScalateSupport {

  get("/") {
    contentType="text/html"
	ssp("index", "todos" -> List(new Todo("x", "foo", true)))
  }

}
