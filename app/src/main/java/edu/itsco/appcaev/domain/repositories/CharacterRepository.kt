package edu.itsco.appcaev.domain.repositories

import edu.itsco.appcaev.data.Result
import edu.itsco.appcaev.domain.model.Characters
import kotlinx.coroutines.flow.Flow
import edu.itsco.appcaev.domain.model.Character

interface CharacterRepository {


    fun getCharacters(): Flow<Result<List<Characters>>>

    suspend fun getCharacter(id_lec: Int): Result<Character>
}