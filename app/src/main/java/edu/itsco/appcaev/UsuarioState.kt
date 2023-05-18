package edu.itsco.appcaev

import java.util.regex.Pattern


private const val USUARIO_VALIDATOR_REGEX = "^(.+)@(.+)\$"

class UsuarioState : TextFieldState(validator = ::isUsuarioValid, errorFor = ::usuarioValidationError)

private fun isUsuarioValid(usuario: String) = Pattern.matches(USUARIO_VALIDATOR_REGEX,usuario)

private fun usuarioValidationError(usuario: String) = "Usuario invalido: $usuario"
