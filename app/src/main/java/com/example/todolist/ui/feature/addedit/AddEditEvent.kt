package com.example.todolist.ui.feature.addedit

interface AddEditEvent {
    data class  titleChange(val title: String) : AddEditEvent
    data class descriptionChange(val description: String) : AddEditEvent
    object save : AddEditEvent

}