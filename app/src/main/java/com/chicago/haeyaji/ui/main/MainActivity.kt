package com.chicago.haeyaji.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chicago.haeyaji.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFragment()
    }

    private fun showFragment(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_framelayout, TaskListFragment())
            .commit()
    }
}