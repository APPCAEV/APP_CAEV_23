package edu.itsco.appcaev

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import edu.itsco.appcaev.navegacion.AppScreens


@Composable
fun SignIn(navController: NavController) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_sin_fondo),
            contentDescription = "Caev7",
        )
        Text(
            text = stringResource(id = R.string.iniciar_sesión),
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Bold
        )
        SignInScreen(modifier = Modifier.fillMaxWidth()) {
            SignInContent(navController )
        }
    }
}


@Composable
fun SignInContent(navController: NavController){
    Column(modifier = Modifier.fillMaxWidth()) {
        val focusRequester = remember { FocusRequester()}
        val usuarioState = remember { UsuarioState()}
        Usuario(usuarioState = usuarioState, onImeAction = {focusRequester.requestFocus()})

        Spacer(modifier = Modifier.height(16.dp))

        val passwordState = remember {PasswordState()}

        Password(
            label = stringResource(id = R.string.contraseña),
            passwordState = passwordState,
            modifier = Modifier.focusRequester(focusRequester),
            onImeAction = {}
        //Aqui es para declarar la siguiente parte//
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                      navController.navigate(route = AppScreens.PantallaBotones.route)
            },
            modifier = Modifier
                .height(80.dp)
                .width(370.dp)
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            shape = MaterialTheme.shapes.small,
            enabled = usuarioState.isValid && passwordState.isValid,
            colors= ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFF21B8F3),
                disabledBackgroundColor = Color(0x9968DACC),
                contentColor = Color.Black,


            )
        ) {
            Text(
                text = stringResource(id = R.string.ingresar)

            )

        }
    }
}
