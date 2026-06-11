package br.com.fiap.rm98825.navigation



import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import br.com.fiap.rm98825.data.ScanRepository
import br.com.fiap.rm98825.screens.DetailScreen
import br.com.fiap.rm98825.screens.HomeScreen
import br.com.fiap.rm98825.screens.IntroScreen
import br.com.fiap.rm98825.screens.SplashScreen


@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Splash.route
    ) {

        composable(Routes.Splash.route) {

            SplashScreen {
                navController.navigate(Routes.Intro.route) {
                    popUpTo(Routes.Splash.route) {
                        inclusive = true
                    }
                }
            }
        }

        composable(Routes.Intro.route) {

            IntroScreen {
                navController.navigate(Routes.Home.route)
            }
        }

        composable(Routes.Home.route) {

            HomeScreen(
                scans = ScanRepository.scans,
                onScanClick = { id ->
                    navController.navigate(
                        Routes.Detail.createRoute(id)
                    )
                }
            )
        }

        composable(Routes.Detail.route) { backStackEntry ->

            val id =
                backStackEntry.arguments
                    ?.getString("id")
                    ?.toIntOrNull()

            val scan =
                ScanRepository.scans.firstOrNull {
                    it.id == id
                }

            scan?.let {

                DetailScreen(
                    scan = it,
                    onBack = {
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}