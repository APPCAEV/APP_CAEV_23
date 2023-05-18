package edu.itsco.appcaev.domain.use_case

import edu.itsco.appcaev.domain.model.Characters
import  edu.itsco.appcaev.data.Result
import edu.itsco.appcaev.domain.repositories.CharacterRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    operator fun invoke(): Flow<Result<List<Characters>>> {
        return  repository.getCharacters()
    }
}