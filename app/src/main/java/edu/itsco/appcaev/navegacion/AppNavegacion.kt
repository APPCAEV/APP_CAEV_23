package edu.itsco.appcaev.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.itsco.appcaev.PantallasAdministracion.AdmiAgregar
import edu.itsco.appcaev.PantallasAdministracion.AdmiBotones
import edu.itsco.appcaev.PantallasAdministracion.AdmiConsultar
import edu.itsco.appcaev.PantallasAdministracion.PantallaBotones
import edu.itsco.appcaev.PantallasLectores.AgregarLecturas
import edu.itsco.appcaev.PantallasLectores.PantallaRutas
import edu.itsco.appcaev.SignIn

@Composable
fun AppNavegacion(){
    val navController = rememberNavController()
    NavHost(navController=navController, startDestination=AppScreens.SignInScreen.route){
        composable(route = AppScreens.SignInScreen.route) {
            SignIn(navController)
        }
        composable(route = AppScreens.PantallaBotones.route) {
            PantallaBotones(navController)
        }
        composable(route = AppScreens.AgregarLecturas.route){
            AgregarLecturas(navController)
        }
        composable(route = AppScreens.AdmiBotones.route){
            AdmiBotones(navController)
        }
        composable(route = AppScreens.AdmiAgregar.route) {
            AdmiAgregar(navController)
        }
        composable(route = AppScreens.AdmiConsultar.route) {
            AdmiConsultar(navController)
        }
        composable(route = AppScreens.PantallaRutas.route) {
            PantallaRutas (navController)
        }
    }
}

