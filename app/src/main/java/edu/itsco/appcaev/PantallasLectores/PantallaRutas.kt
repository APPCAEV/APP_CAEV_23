package edu.itsco.appcaev.PantallasLectores

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import edu.itsco.appcaev.R
import edu.itsco.appcaev.navegacion.AppScreens

@Composable
fun PantallaRutas(navController : NavController) {
    Image(
        painter = painterResource(id = R.drawable.cuatro_logos),
        contentDescription = "Cuatro logos",
        modifier = Modifier
            .width(90000.dp)
            .height(100.dp)
    )
    Spacer(modifier = Modifier.width(5.dp))
    Box(
        modifier = Modifier
            //.padding(100.dp)
            .fillMaxSize(),
       // contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
            // .background(Color.LightGray)
            //.size(1000.dp)

        ) {
            repeat(100) {
                // Text("Item ", modifier = Modifier.padding(2.dp))
            }
            Spacer(modifier = Modifier.height(15.dp))

            val textState = remember { mutableStateOf("") }
            Spacer(modifier = Modifier.height(75.dp))
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .height(500.dp)
                    .width(90000.dp),
                    verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

            ) {

                TextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },

                    label = {
                        Text(text = "Ingrese Ruta :                                     ")
                    }
                )
                val Botonbuscar: List<String>
                Spacer(modifier = Modifier.height(25.dp))

                Button(



                    
                    //onClick = { },
                    //modifier = Modifier
                      //  .fillMaxWidth(),
                    //shape = MaterialTheme.shapes.small,
                      onClick = {
                          navController.navigate(route = AppScreens.AgregarLecturas.route)
                      },
                      modifier = Modifier
                        .padding(10.dp)
                      .width(250.dp)
                    .height(58.dp),
                    colors= ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xFF21B8F3),
                        disabledBackgroundColor = Color(0x9968DACC),
                        contentColor = Color.Black
                    )
                ) {
                    Text(
                        text = "Siguiente",
                        fontSize = 25.sp,
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
            }
        }
    }
}



