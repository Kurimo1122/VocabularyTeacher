
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kugimototoshimitsu/workspace/play/vocabulary-teacher/conf/routes
// @DATE:Tue May 31 21:05:16 EEST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.binders.PathBinders._

// @LINE:1
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:1
  class ReverseImport(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def importWord: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Import.importWord",
      """
        function(sourceLang,word,targetLang,translation) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "import/word/" + (""" + implicitly[PathBindable[play.api.i18n.Lang]].javascriptUnbind + """)("sourceLang", sourceLang) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("word", encodeURIComponent(word)) + "/" + (""" + implicitly[PathBindable[play.api.i18n.Lang]].javascriptUnbind + """)("targetLang", targetLang) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("translation", encodeURIComponent(translation))})
        }
      """
    )
  
  }


}