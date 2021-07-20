package com.ewamo.todo_app.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.ewamo.todo_app.R
import com.ewamo.todo_app.ui.tasks.TasksViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TasksFragment : Fragment(R.layout.fragment_tasks) {

    private val viewModel: TasksViewModel by viewModels()
}
