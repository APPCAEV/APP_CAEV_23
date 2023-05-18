package edu.itsco.appcaev.domain.use_case

import edu.itsco.appcaev.domain.repositories.CharacterRepository
import javax.inject.Inject
import  edu.itsco.appcaev.domain.model.Character
import  edu.itsco.appcaev.data.Result

class GetCharacterUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(Id_lec: Int): Result<Character> {
        return repository.getCharacter(Id_lec)
    }
}