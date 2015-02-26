package chandu0101.scalajs.pouchdb.todo

import chandu0101.scalajs.pouchdb.todo.routes.AppRouter
import japgolly.scalajs.react.React
import org.scalajs.dom

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

/**
 * Created by chandrasekharkode on 2/25/15.
 */
object ReactApp extends JSApp {
  @JSExport
  override def main(): Unit = {
    React.render(AppRouter.C(),dom.document.getElementById("container"))
  }
}
