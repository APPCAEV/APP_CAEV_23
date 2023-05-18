package edu.itsco.appcaev.data.source.remote.dto

import edu.itsco.appcaev.domain.model.Character

data class CharacterDto(
    val Apellido_materno: String,
    val Apellido_paterno: String,
    val Contraseña: String,
    val Id_lec: Int,
    val Nombre: String,
    val Usuario_lec: String
)

fun CharacterDto.toCharacter(): Character{
    return Character(
        Id_lec= Id_lec,
        Usuario_lec = Usuario_lec,
        Contraseña = Contraseña
    )
}