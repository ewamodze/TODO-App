package com.ewamo.todo_app.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.ewamo.todo_app.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

@Database(entities = [Task::class], version = 1)
abstract class TaskDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao

    class Callback @Inject constructor(
        private val database: Provider<TaskDatabase>,
        @ApplicationScope private val applicationScope: CoroutineScope
    ) : RoomDatabase.Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)

            val dao = database.get().taskDao()

            applicationScope.launch {
                //mock-up data
                dao.insert(Task("Spend time with Pinky", important = true))
                dao.insert(Task("Care for plants"))
                dao.insert(Task("Do the laundry", completed = true))
                dao.insert(Task("Call Agata", important = true))
                dao.insert(Task("Prepare dinner for guests"))
            }
        }
    }
}