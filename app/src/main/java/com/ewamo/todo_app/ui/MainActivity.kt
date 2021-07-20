package com.ewamo.todo_app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ewamo.todo_app.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}