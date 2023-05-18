package edu.itsco.appcaev.data.source.remote.dto

import android.icu.text.IDNA.Info
import edu.itsco.appcaev.domain.model.Characters

data class CharactersDto(
    val info: Info,
  val results: List<CharacterDto>
  )

fun CharactersDto.toListCharacters(): List<Characters> {
    val resultEntries = results.mapIndexed { _, entries ->
        Characters(
            Id_lec = entries.Id_lec,
            Usuario_lec = entries.Usuario_lec,
            Contraseña = entries.Contraseña
        )

    }
    return resultEntries
}


