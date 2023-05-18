package edu.itsco.appcaev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import dagger.hilt.android.AndroidEntryPoint
import edu.itsco.appcaev.PantallasAdministracion.AdmiAgregar
import edu.itsco.appcaev.PantallasAdministracion.AdmiBotones
import edu.itsco.appcaev.PantallasAdministracion.AdmiConsultar
import edu.itsco.appcaev.PantallasLectores.AgregarLecturas
import edu.itsco.appcaev.PantallasLectores.PantallaRutas
import edu.itsco.appcaev.navegacion.AppNavegacion
import edu.itsco.appcaev.ui.theme.APPCAEVTheme
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            APPCAEVTheme {

                //SignInActivityScreen()
                //PantallaBotones()
                AppNavegacion()
                //AdmiBotones()
               // AdmiConsultar()
                //AdmiAgregar()
                //AgregarLecturas()
               //PantallaRutas()
            }
            }
        }
    }
//@Composable
//private fun SignInActivityScreen(){
//    SignIn()
//}
@Composable
fun DefaultPreview(){
    APPCAEVTheme {
        SignInScreen() {
        }
    }
}





