
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kugimototoshimitsu/workspace/play/vocabulary-teacher/conf/routes
// @DATE:Tue May 31 21:05:16 EEST 2016


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
