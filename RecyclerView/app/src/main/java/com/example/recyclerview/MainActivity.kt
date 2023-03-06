package com.example.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rec.setOnClickListener({ add() })
    }
    val task = ArrayList<data>()
    fun add() {
        var taskValue = binding.idtask.text.toString()
        var hourValue = binding.iddate.text.toString().toInt()
        task.add(data(taskValue, hourValue, false))
        binding.rec.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL, false)
        val adapter = CustomAdapter(task)
        binding.rec.adapter = adapter
    }
}