package com.chicago.haeyaji.ui.main

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class TaskViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2 // Example: 2 pages (e.g., "All Tasks" and "Completed Tasks")

    override fun createFragment(position: Int): Fragment {
        return when (position) {
//            0 -> TaskListFragment() // Replace with the fragment for "All Tasks"
//            1 -> CompletedTaskFragment() // Replace with the fragment for "Completed Tasks"
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}