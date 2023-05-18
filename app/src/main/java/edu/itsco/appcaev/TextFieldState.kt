package edu.itsco.appcaev

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

open class TextFieldState(
    private val validator: (String) -> Boolean = {true},
    private val errorFor: (String) -> String = {""}
) {
    var text: String by mutableStateOf("")
    var isFocusDirty: Boolean by mutableStateOf(false)
    var isFocused: Boolean by mutableStateOf(false)
    private var displayError: Boolean by mutableStateOf(false)

    open val isValid: Boolean
         get()= validator(text)


    fun onFocusedChange(focused: Boolean) {
        isFocused = focused
        if (focused) isFocusDirty = true
    }
    fun enableShowErrors(){
        if (isFocusDirty){
            displayError = true
        }
    }

    fun showErrors() = !isValid && displayError
    open fun getError(): String? {
        return if (showErrors()){
            errorFor(text)
        }else {
            null
        }
    }
}