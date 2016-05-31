
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kugimototoshimitsu/workspace/play/vocabulary-teacher/conf/routes
// @DATE:Tue May 31 21:05:16 EEST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.binders.PathBinders._

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  Import_0: controllers.Import,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    Import_0: controllers.Import
  ) = this(errorHandler, Import_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Import_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """import/word/$sourceLang<[^/]+>/$word<[^/]+>/$targetLang<[^/]+>/$translation<[^/]+>""", """controllers.Import.importWord(sourceLang:play.api.i18n.Lang, word:String, targetLang:play.api.i18n.Lang, translation:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_Import_importWord0_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("import/word/"), DynamicPart("sourceLang", """[^/]+""",true), StaticPart("/"), DynamicPart("word", """[^/]+""",true), StaticPart("/"), DynamicPart("targetLang", """[^/]+""",true), StaticPart("/"), DynamicPart("translation", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Import_importWord0_invoker = createInvoker(
    Import_0.importWord(fakeValue[play.api.i18n.Lang], fakeValue[String], fakeValue[play.api.i18n.Lang], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Import",
      "importWord",
      Seq(classOf[play.api.i18n.Lang], classOf[String], classOf[play.api.i18n.Lang], classOf[String]),
      "PUT",
      """""",
      this.prefix + """import/word/$sourceLang<[^/]+>/$word<[^/]+>/$targetLang<[^/]+>/$translation<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_Import_importWord0_route(params) =>
      call(params.fromPath[play.api.i18n.Lang]("sourceLang", None), params.fromPath[String]("word", None), params.fromPath[play.api.i18n.Lang]("targetLang", None), params.fromPath[String]("translation", None)) { (sourceLang, word, targetLang, translation) =>
        controllers_Import_importWord0_invoker.call(Import_0.importWord(sourceLang, word, targetLang, translation))
      }
  }
}