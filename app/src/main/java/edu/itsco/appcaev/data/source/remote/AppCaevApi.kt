package edu.itsco.appcaev.data.source.remote


import edu.itsco.appcaev.data.source.remote.dto.CharacterDto
import edu.itsco.appcaev.data.source.remote.dto.CharactersDto
import retrofit2.http.GET
import retrofit2.http.Path

interface AppCaevApi {
    @GET("character/")
    suspend fun getCharacters(

    ): CharactersDto

    @GET("character/{id_lec}")
    suspend fun getCharacter(
        @Path("id_lec") Id_lec: Int
    ): CharacterDto

}