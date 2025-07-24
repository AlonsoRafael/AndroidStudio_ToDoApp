package com.example.todolist.ui.feature.List

sealed interface ListEvent {

    data class delete(val id: Long) : ListEvent
    data class CompletedChange(val id: Long,val isCompleted: Boolean) : ListEvent
    data class AddEdit(val id: Long?) : ListEvent

}