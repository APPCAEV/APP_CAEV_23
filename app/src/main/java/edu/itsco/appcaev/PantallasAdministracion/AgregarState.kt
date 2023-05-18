package edu.itsco.appcaev.PantallasAdministracion

import edu.itsco.appcaev.TextFieldState

class AgregarState
    :TextFieldState(validator = ::isAgregarValid, errorFor = ::agregarValidationError)

private  fun isAgregarValid(agregar: String) = agregar.length > 0
@Suppress("UNUSED_PARAMETER")
private fun agregarValidationError(agregar: String) = "Agregar el nombre correctamente"

