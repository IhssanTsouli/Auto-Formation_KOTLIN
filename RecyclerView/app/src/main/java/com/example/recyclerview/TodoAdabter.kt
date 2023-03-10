package com.example.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.recyclerview.databinding.RecyclerRowBinding
import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class CustomAdapter(val userList : ArrayList<data>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context)
        val binding = RecyclerRowBinding.inflate(v, parent, false)
        val deleteButton: Button = view.findViewById(R.id.btn_delete)
        return RecyclerView.ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val data: data = userList[position]
        holder.bind(data)

        holder.btn_delete.setOnClickListener {
            data.userList.removeAt(position)
            this.notifyItemRemoved(position)
            /*Toast.makeText(context, "Task Deleted", Toast.LENGTH_SHORT).show()*/
        }
    }

    class ViewHolder(private val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: data) {
            binding.textView2.text = item.task
            binding.textView.text = item.date.toString()
            binding.switch1.isChecked = item.switch
        }

    }
}
