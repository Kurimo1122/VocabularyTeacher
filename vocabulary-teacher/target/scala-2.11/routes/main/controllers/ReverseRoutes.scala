
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kugimototoshimitsu/workspace/play/vocabulary-teacher/conf/routes
// @DATE:Tue May 31 21:05:16 EEST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.binders.PathBinders._

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseImport(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def importWord(sourceLang:play.api.i18n.Lang, word:String, targetLang:play.api.i18n.Lang, translation:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "import/word/" + implicitly[PathBindable[play.api.i18n.Lang]].unbind("sourceLang", sourceLang) + "/" + implicitly[PathBindable[String]].unbind("word", dynamicString(word)) + "/" + implicitly[PathBindable[play.api.i18n.Lang]].unbind("targetLang", targetLang) + "/" + implicitly[PathBindable[String]].unbind("translation", dynamicString(translation)))
    }
  
  }


}