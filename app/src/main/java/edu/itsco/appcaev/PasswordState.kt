package edu.itsco.appcaev

class PasswordState
    :TextFieldState(validator= ::isPasswordValid, errorFor = ::passwordValidationError)

private fun isPasswordValid(password: String) = password.length > 7
@Suppress("UNUSED_PARAMETER")
private fun passwordValidationError(password: String)= "Contraseña invalida"
