package com.chicago.haeyaji.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.chicago.haeyaji.R

class TaskListFragment : Fragment() {

    private lateinit var todoRecyclerView: RecyclerView
    private lateinit var favoritesViewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_task_list, container, false)
        todoRecyclerView = view.findViewById(R.id.todo_list_recyclerview)
        favoritesViewPager = view.findViewById(R.id.favorites_todo_list_viewPager)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        todoRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        todoRecyclerView.adapter = TaskAdapter(emptyList())

        favoritesViewPager.adapter = TaskViewPagerAdapter(this)
    }
}