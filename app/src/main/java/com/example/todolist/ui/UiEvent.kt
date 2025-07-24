package com.example.todolist.ui

interface UiEvent {
    data class showSnackbar(val message: String) : UiEvent
    data object NavigateBack : UiEvent
    data class Navigate<T : Any> (val route:T) : UiEvent
}