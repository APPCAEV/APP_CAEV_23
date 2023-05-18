package edu.itsco.appcaev.navegacion

sealed class AppScreens(val route: String){
    object SignInScreen: AppScreens("sign_in_screen")
    object PantallaBotones: AppScreens("pantalla_botones")
    object AgregarLecturas: AppScreens("agregar_lecturas")
    object AdmiBotones: AppScreens("admi_botones")
    object AdmiAgregar: AppScreens("admi_agregar")
    object AdmiConsultar: AppScreens("admi_consultar")
    object PantallaRutas: AppScreens("pantalla_rutas")
}
