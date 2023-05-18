package edu.itsco.appcaev.PantallasAdministracion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import edu.itsco.appcaev.R
import edu.itsco.appcaev.navegacion.AppScreens

@Composable
fun  PantallaBotones(navController: NavController){
    Image(painter = painterResource(id = R.drawable.cuatro_logos),
        contentDescription = "cuatro_logos",
        modifier = Modifier
            .width(90000.dp)
            .height(100.dp)

    )
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        val botones: List<String>
        Spacer(modifier = Modifier.height(90.dp))

        Button(
            onClick = {
                navController.navigate(route = AppScreens.PantallaRutas.route)
            },
            modifier = Modifier
                .fillMaxWidth(),
            shape = MaterialTheme.shapes.small,
            colors= ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFF21B8F3),
                disabledBackgroundColor = Color(0x9968DACC),
                contentColor = Color.Black
            )

            ) {
            Text(
                text = "Agregar lectura",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Serif,
                style = MaterialTheme.typography.h4.copy(
                    //shadow = Shadow(
                      //  offset = Offset(10f, 10f),
                        //blurRadius = 10f
                    //)
                )
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        /*Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth(),
            shape = MaterialTheme.shapes.small,
        ) {
            Text(
                text = "Salir",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Serif,
                style = MaterialTheme.typography.h4.copy(
                    //shadow = Shadow(
                       // offset = Offset(10f, 10f),
                        //blurRadius = 10f
                    //)
                )
            )
        }*/
        Image(
            painter = painterResource(id = R.drawable.agua),
            contentDescription = "agua",
            modifier = Modifier
                .width(1000.dp)
                .height(350.dp)

        )
        //Spacer(modifier = Modifier.height(1.dp))

        Text(
            textAlign = TextAlign.Center,
            text = "''El agua es la fuerza motriz de toda la naturaleza''🌿",
            color = Color.Unspecified,
            fontStyle = FontStyle.Italic,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif
        )
    }
}




//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview(){
//}