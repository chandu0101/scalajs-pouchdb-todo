package chandu0101.scalajs.pouchdb.todo.routes

import chandu0101.scalajs.pouchdb.todo.components.TodoApp
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.{BaseUrl, Redirect, RoutingRules}
import japgolly.scalajs.react.vdom.all._

import chandu0101.scalajs.react.components.util.MTypes
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import scala.scalajs.js
import chandu0101.scalajs.react.components.all._
import chandu0101.scalajs.react.components.materialui.styles.MaterialUICss._



/**
 * Created by chandrasekharkode on 2/25/15.
 */
object AppRouter {


  object AppPage extends RoutingRules {

    val root = register(rootLocation(TodoApp()))

    register(removeTrailingSlashes)

    override protected val notFound = redirect(root, Redirect.Replace)


    override protected def interceptRender(i: InterceptionR): ReactElement =
      div(
        h3("Scalajs-PouchDB TODO Example"),
        i.element
      )

  }

//  val baseUrl = BaseUrl.fromWindowOrigin / "scalajs-pouchdb-todo/"
 val baseUrl = BaseUrl.fromWindowOrigin / "sjspt/"

  val C = AppPage.router(baseUrl)
}
