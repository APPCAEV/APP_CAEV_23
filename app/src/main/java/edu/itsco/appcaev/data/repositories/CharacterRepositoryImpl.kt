package edu.itsco.appcaev.data.repositories
import edu.itsco.appcaev.data.Result
import edu.itsco.appcaev.data.source.remote.AppCaevApi
import edu.itsco.appcaev.data.source.remote.dto.toCharacter
import edu.itsco.appcaev.data.source.remote.dto.toListCharacters
import edu.itsco.appcaev.domain.model.Character
import edu.itsco.appcaev.domain.model.Characters
import edu.itsco.appcaev.domain.repositories.CharacterRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject


class CharacterRepositoryImpl @Inject constructor(
    private val api: AppCaevApi
): CharacterRepository {

    override fun getCharacters(): Flow<Result<List<Characters>>> = flow  {
        emit(Result.Loading())
        try {
            val response = api.getCharacters().toListCharacters()
            emit(Result.Success(response))
        } catch (e: HttpException) {
            emit(
                Result.Error(
                    message = "Ufff algo anda mal",
                //   data = null
                )
            )
        } catch (e: IOException) {
            emit(
                Result.Error(
                    message = "No se pudo encontrar el servidor y necesitas revisar la conexión",
              //   data = null
                )
            )
        }
    }

    override suspend fun getCharacter(id_lec: Int): Result<Character> {
        val response = try {
            api.getCharacter(id_lec)
        }catch (e: Exception){
            return Result.Error("Ocurrio un error desconocido")
        }
        return Result.Success(response.toCharacter())
    }
}
