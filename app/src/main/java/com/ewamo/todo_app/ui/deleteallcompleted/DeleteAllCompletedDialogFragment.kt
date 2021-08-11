package com.ewamo.todo_app.ui.deleteallcompleted

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.ewamo.todo_app.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DeleteAllCompletedDialogFragment : DialogFragment() {

    private val viewModel: DeleteAllCompletedViewModel by viewModels()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setTitle(getString(R.string.title))
            .setMessage(getString(R.string.message))
            .setNegativeButton(getString(R.string.negative), null)
            .setPositiveButton(getString(R.string.positive)) { _, _ ->
                viewModel.onConfirmClick()
            }
            .create()
}
