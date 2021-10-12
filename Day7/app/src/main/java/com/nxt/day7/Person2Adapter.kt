package com.nxt.day7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nxt.day7.callback.Click
import com.nxt.day7.databinding.ItemContactBinding

class Person2Adapter(private var contacts: List<Person>, private var click: Click) :
    RecyclerView.Adapter<Person2Adapter.ViewHolder>() {

    private var binding: ItemContactBinding? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Person2Adapter.ViewHolder {
        binding = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding!!)
    }

    override fun onBindViewHolder(holder: Person2Adapter.ViewHolder, position: Int) {
        holder.bind(contacts[position])
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    inner class ViewHolder(private var binding: ItemContactBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(person: Person) {
            binding.imgAvatar.setImageResource(person.avatar)
            binding.tvName.text = person.name
            binding.tvAddress.text = person.address

            binding.imgAvatar.setOnClickListener {
                click.onItemClick(adapterPosition)
            }

            binding.imgAvatar.setOnLongClickListener {
                click.onLongClick(adapterPosition)
                true
            }
        }
    }


}