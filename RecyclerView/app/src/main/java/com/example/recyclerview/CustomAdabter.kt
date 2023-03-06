package com.example.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.recyclerview.databinding.RecyclerRowBinding

class CustomAdapter(val userList : ArrayList<data>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
        val binding = RecyclerRowBinding.inflate(v, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data: data = userList[position]
        holder.bind(data)
    }

    class ViewHolder(private val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: data) {
            binding.textView2.text = item.task
            binding.textView.text = item.date.toString()
            binding.switch1.isChecked = item.switch
        }

    }
}
