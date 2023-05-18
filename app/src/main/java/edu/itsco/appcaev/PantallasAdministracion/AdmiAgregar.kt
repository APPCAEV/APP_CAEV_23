package edu.itsco.appcaev.PantallasAdministracion

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import edu.itsco.appcaev.R
import edu.itsco.appcaev.UsuarioState

@Composable
fun AdmiAgregar(navController: NavController) {

    val nombreValue = remember { mutableStateOf("") }
    val direcionValue = remember { mutableStateOf("") }
    val numerocontratoValue = remember { mutableStateOf("") }
    val medidorValue = remember { mutableStateOf("") }
    val focusRequester = remember { FocusRequester() }
    val agregarState = remember { AgregarState() }
    val context = LocalContext.current
    var textValue by remember{
        mutableStateOf("")

    }

    Image(
        painter = painterResource(id = R.drawable.cuatro_logos),
        contentDescription = "Cuatro logos",
        modifier = Modifier
            .width(900.dp)
            .height(100.dp)
    )
    Spacer(modifier = Modifier.width(5.dp))
    Box(
        modifier = Modifier
            //.padding(100.dp)
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
         {

            }
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.TopCenter
                ) {

                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(8.78f)
                        .padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center


                )

                {
                    val agregarState = remember { AgregarState() }
                    OutlinedTextField(
                        value = nombreValue.value,
                        onValueChange = { nombreValue.value = it },
                        label = { Text(text = "Nombre Completo") },
                        placeholder = { Text(text = "Nombre Completo") },
                        //agregarState = agregarState,
                        //modifier = Modifier.focusRequester(focusRequester),
                        //signleLine = true,
                        modifier = Modifier.fillMaxWidth(8.8f),
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    OutlinedTextField(
                        value = direcionValue.value,
                        onValueChange = { direcionValue.value = it },
                        label = { Text(text = "Dirección") },
                        placeholder = { Text(text = "Dirección") },
                        //signleLine = true,
                        modifier = Modifier.fillMaxWidth(8.8f)
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    OutlinedTextField(
                        value = numerocontratoValue.value,
                        onValueChange = { numerocontratoValue.value = it },
                        label = { Text(text = "Cuenta") },
                        placeholder = { Text(text = "Cuenta") },
                        //signleLine = true,
                        modifier = Modifier.fillMaxWidth(8.8f),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    OutlinedTextField(
                        value = medidorValue.value,
                        onValueChange = { medidorValue.value = it },
                        label = { Text(text = "Número de Medidor") },
                        placeholder = { Text(text = "Número de Medidor") },
                        //signleLine = true,
                        modifier = Modifier.fillMaxWidth(8.8f),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

                    )

                    Spacer(modifier = Modifier.padding(25.dp))
                    Button(
                        onClick = {
                                  Toast.makeText(
                                      context,
                                     "Contrato guardado correctamente",
                                      Toast.LENGTH_SHORT
                                  ).show()
                        },
                        modifier = Modifier
                            .fillMaxWidth(),
                        shape = MaterialTheme.shapes.small,
                        //enabled = agregarState.isValid ,
                        colors= ButtonDefaults.buttonColors(
                            backgroundColor = Color(0xFF21B8F3),
                            disabledBackgroundColor = Color(0x9968DACC),
                            contentColor = Color.Black
                        )
                        ) {
                        Text(
                            text = "Agregar Contrato",
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


                }

            }

    }
}

