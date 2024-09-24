package com.example.kotlinapplication.sealedclass

import androidx.lifecycle.ViewModelProvider

// TODO: Stwórz klasę NetworkResponse z trzema podklasami reprezentującymi stany: sukces, błąd i ładowanie
// Podklasa sukces powinna zawierać przykładowe dane w postaci stringa i booleana
// Podklasa błąd powinna zawierać komunikat błędu i opcjonalnie jego kod
// Podklasa reprezentująca stan ładowanie nie zawiera parametrów

sealed class NetworkResponse {
    data class Success(val data: String, val bool: Boolean) : NetworkResponse()
    data class Error(val exception: String, val code: Int? = null) : NetworkResponse()
    data object Loading: NetworkResponse()
}

// TODO: Zaimplementuj funkcję, która będzie przyjmować jako parametr klasę NetworkResponse
// W zależności od typu odpowiedzi, powinna zwrócić odpowiedni komunikat wraz z danymi zawartymi w odpowiedzi
fun handleResponse(res : NetworkResponse): String {
    return when(res) {
        is NetworkResponse.Success -> "Success ${res.data}"
        is NetworkResponse.Loading -> ("Loading...")
        is NetworkResponse.Error -> ("Error ${res.code ?: "no code"}. ${res.exception}")
    }
}

fun main() {

    // TODO: Stwórz zmienne reprezentujące różne warianty odpowiedzi
    val successResponse: NetworkResponse = NetworkResponse.Success("good good", true)
    val errorResponseWithCode: NetworkResponse = NetworkResponse.Error("no no", 1012)
    val errorResponseWithoutCode: NetworkResponse = NetworkResponse.Error("no no")
    val loadingResponse: NetworkResponse = NetworkResponse.Loading

    println(handleResponse(successResponse))
    println(handleResponse(errorResponseWithCode))
    println(handleResponse(errorResponseWithoutCode))
    println(handleResponse(loadingResponse))
}
