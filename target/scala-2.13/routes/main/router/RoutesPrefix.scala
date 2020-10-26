// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vasyl.savytskyi/IdeaProjects/play-samples-play-scala-starter-example/conf/routes
// @DATE:Mon Oct 26 12:45:48 CET 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
