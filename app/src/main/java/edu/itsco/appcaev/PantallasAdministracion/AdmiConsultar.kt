package edu.itsco.appcaev.PantallasAdministracion

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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


@Composable
fun AdmiConsultar(navController: NavController) {

    val nombreValue = remember { mutableStateOf("") }
    val direcionValue = remember { mutableStateOf("") }
    val numerocontratoValue = remember { mutableStateOf("") }
    val medidorValue = remember { mutableStateOf("") }
    val lecturaanteriorValue = remember { mutableStateOf("") }
    val lecturaValue = remember { mutableStateOf("") }
    val observasionValue = remember { mutableStateOf("") }
    val context = LocalContext.current

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
        contentAlignment = Alignment.TopCenter
    ) {
        Column {
            Spacer(modifier = Modifier.height(15.dp))

            val textState = remember { mutableStateOf("") }
            Spacer(modifier = Modifier.height(50.dp))
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .height(500.dp)
                    .width(9000.dp)


            ) {

                TextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },

                    label = {
                        Text(text = "Ingrese Número de Cuenta :                    ")
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                val Botonbuscar: List<String>
                Spacer(modifier = Modifier.height(5.dp))

                Button(
                    onClick = { },
                    modifier = Modifier
                        .padding(10.dp)
                        .width(500.dp)
                        .height(50.dp),
                    colors= ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xFF21B8F3),
                        disabledBackgroundColor = Color(0x9968DACC),
                        contentColor = Color.Black
                )
                ) {
                    Text(
                        text = "Buscar",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.Serif,
                        style = MaterialTheme.typography.h4.copy(
                            //shadow = Shadow(
                               // offset = Offset(10f, 10f),
                                //blurRadius = 10f
                          //  )
                        )
                    )
                }
                Spacer(modifier = Modifier.width(2.dp))
                Box(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        //.padding(100.dp)
                        .fillMaxSize(),
                    contentAlignment = Alignment.TopCenter
                ) {
                    {

                    }
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.BottomCenter
                    ) {
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
                                .padding(5.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center

                        ) {
                            OutlinedTextField(
                                value = nombreValue.value,
                                onValueChange = { nombreValue.value = it },
                                label = { Text(text = "Nombre Completo") },
                                placeholder = { Text(text = "Nombre Completo") },
                                modifier = Modifier.fillMaxWidth(8.8f)
                            )
                            Spacer(modifier = Modifier.padding(2.dp))
                            OutlinedTextField(
                                value = direcionValue.value,
                                onValueChange = { direcionValue.value = it },
                                label = { Text(text = "Dirección") },
                                placeholder = { Text(text = "Dirección") },
                                modifier = Modifier.fillMaxWidth(8.8f)
                            )
                            Spacer(modifier = Modifier.padding(2.dp))
                            OutlinedTextField(
                                value = numerocontratoValue.value,
                                onValueChange = { numerocontratoValue.value = it },
                                label = { Text(text = "Cuenta") },
                                placeholder = { Text(text = "Cuenta") },
                                modifier = Modifier.fillMaxWidth(8.8f),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

                            )
                            Spacer(modifier = Modifier.padding(2.dp))
                            OutlinedTextField(
                                value = medidorValue.value,
                                onValueChange = { medidorValue.value = it },
                                label = { Text(text = "Número de Medidor") },
                                placeholder = { Text(text = "Número de Medidor") },
                                modifier = Modifier.fillMaxWidth(8.8f),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

                            )
                            Spacer(modifier = Modifier.padding(2.dp))
                            OutlinedTextField(
                                value = lecturaanteriorValue.value,
                                onValueChange = { lecturaanteriorValue.value = it },
                                label = { Text(text = "Lectura Anterior ") },
                                placeholder = { Text(text = "Lectura Anterior") },
                                modifier = Modifier.fillMaxWidth(8.8f),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                            )
                            Spacer(modifier = Modifier.padding(2.dp))
                            OutlinedTextField(
                                value = lecturaValue.value,
                                onValueChange = { lecturaValue.value = it },
                                label = { Text(text = "Ingresar Lectura ") },
                                placeholder = { Text(text = "Ingresar Lectura") },
                                modifier = Modifier.fillMaxWidth(8.8f),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                            )
                            Spacer(modifier = Modifier.padding(2.dp))
                            OutlinedTextField(
                                value = observasionValue.value,
                                onValueChange = { observasionValue.value = it },
                                label = { Text(text = "Observación ") },
                                placeholder = { Text(text = "Observación") },
                                modifier = Modifier.fillMaxWidth(8.8f)
                            )

                            }
                        }
                    }
                }

            Button(
                onClick = {
                    Toast.makeText(
                        context,
                        "Datos modificados correctamente",
                        Toast.LENGTH_SHORT
                    ).show()
                },
                modifier = Modifier
                    .padding(8.dp)
                    .height(48.dp)
                    .width(370.dp)
                    .fillMaxWidth(),
                shape = MaterialTheme.shapes.small,
                colors= ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xFF21B8F3),
                    disabledBackgroundColor = Color(0x9968DACC),
                    contentColor = Color.Black
                )

                ) {
                Text(
                    text = "Guardar ",
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

            Button(
                onClick = { },
                modifier = Modifier
                    .padding(8.dp)
                    .height(48.dp)
                    .width(370.dp)
                    .fillMaxWidth(),
                shape = MaterialTheme.shapes.small,
                colors= ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xFF21B8F3),
                    disabledBackgroundColor = Color(0x9968DACC),
                    contentColor = Color.Black
                )

                ) {
                Text(
                    text = "Regresar",
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


            Button(
                onClick = { },
                modifier = Modifier
                    .padding(8.dp)
                    .height(48.dp)
                    .width(370.dp)
                    .fillMaxWidth(),
                shape = MaterialTheme.shapes.small,
                colors= ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xFF21B8F3),
                    disabledBackgroundColor = Color(0x9968DACC),
                    contentColor = Color.Black
                )

                ) {
                Text(
                    text = "Eliminar",
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