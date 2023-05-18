package edu.itsco.appcaev.data

sealed class Result<Char>(val data: Char? = null, val message: String? = null){
    class Loading<Char>(data: Char? = null): Result<Char>(data)
    class Success<Char>(data: Char?): Result<Char>(data)
    class Error<Char>(message: String, data: Char? = null): Result<Char>(data,message)
}

