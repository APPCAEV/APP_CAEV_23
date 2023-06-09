package edu.itsco.appcaev

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun SignInScreen(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
   LazyColumn(modifier = modifier) {
       item {
           Spacer(modifier = Modifier.height(34.dp))
           Box(modifier = Modifier.fillMaxWidth()){
               content()
           }
       }
   }
}
@Composable
fun Usuario(
    usuarioState: TextFieldState = remember {UsuarioState()},
    imeAction: ImeAction = ImeAction.Next,
    onImeAction: () -> Unit = {}
){
    OutlinedTextField(
        value =usuarioState.text ,
        onValueChange ={
            usuarioState.text = it
        },
        label = {
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(
                    text = stringResource(id = R.string.usuario),
                    style = MaterialTheme.typography.body2
                )
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .onFocusChanged { focusState ->
                usuarioState.onFocusedChange(focusState.isFocused)
                if (!focusState.isFocused) {
                    usuarioState.enableShowErrors()
                }
            },
        textStyle = MaterialTheme.typography.body2,
        isError = usuarioState.showErrors(),
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = imeAction, keyboardType = KeyboardType.Email),
        keyboardActions = KeyboardActions(
            onNext = {
                onImeAction()
            }
        )
    )
    usuarioState.getError()?.let { error -> TextFieldError(textError = error) }
}

@Composable
fun Password(
    label: String,
    passwordState: TextFieldState,
    modifier: Modifier = Modifier,
    imeAction: ImeAction = ImeAction.Done,
    onImeAction: () -> Unit = {}
){
    val showPassword = remember { mutableStateOf(false)}
    OutlinedTextField(
        value =passwordState.text,
        onValueChange ={
            passwordState.text = it
            passwordState.enableShowErrors()
        },
        modifier = modifier
            .fillMaxWidth()
            .onFocusChanged { focusState ->
                passwordState.onFocusedChange(focusState.isFocused)
                if (!focusState.isFocused) {
                    passwordState.enableShowErrors()
                }
            },
        textStyle = MaterialTheme.typography.body2,
        label = {
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(
                    text = label,
                    style = MaterialTheme.typography.body2
                )
            }
        },
        trailingIcon = {
            if (showPassword.value){
                IconButton(onClick = { showPassword.value = false }) {
                    Icon(
                        imageVector =Icons.Filled.Visibility,
                        contentDescription =null
                    )
                }
            } else{
                IconButton(onClick = { showPassword.value = true }) {
                    Icon(
                        imageVector =Icons.Filled.VisibilityOff,
                        contentDescription =null
                    )
                }
            }
        },
        visualTransformation = if (showPassword.value){
            VisualTransformation.None
        }else {
            PasswordVisualTransformation()
        },
        isError = passwordState.showErrors(),
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = imeAction),
        keyboardActions = KeyboardActions(
            onDone = {
                onImeAction()
            }
        )
    )
    passwordState.getError()?.let { error -> TextFieldError(textError = error) }
}



@Composable
fun TextFieldError(textError: String) {
    Row (
        modifier = Modifier.fillMaxWidth()
    ){
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = textError,
            modifier = Modifier.fillMaxWidth(),
            style = LocalTextStyle.current.copy(color = MaterialTheme.colors.error)
        )
    }
}