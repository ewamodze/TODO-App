package com.ewamo.todo_app.ui.tasks

import androidx.lifecycle.ViewModel
import com.ewamo.todo_app.data.TaskDao
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TasksViewModel @Inject constructor(
    private val taskDao: TaskDao
) : ViewModel() {
}