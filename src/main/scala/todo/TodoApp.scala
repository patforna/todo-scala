package todo

object TodoApp {
  def main(args: Array[String]) = {
    new WebServer().startAndWait()
  }
}
