package br.com.fiap.rm98825.navigation


sealed class Routes(val route: String) {

    object Splash : Routes("splash")

    object Intro : Routes("intro")

    object Home : Routes("home")

    object Detail : Routes("detail/{id}") {
        fun createRoute(id: Int) = "detail/$id"
    }
}