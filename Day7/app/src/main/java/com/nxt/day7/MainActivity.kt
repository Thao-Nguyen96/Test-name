package com.nxt.day7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.nxt.day7.callback.Click
import com.nxt.day7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Click {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PersonAdapter

    private var contacts = arrayListOf(
        Person(name = "Thao1", address = "ha noi"),
        Person(name = "Thao2", address = "ha noi"),
        Person(name = "Thao3", address = "ha noi"),
        Person(name = "Thao4", address = "ha noi"),
        Person(name = "Thao5", address = "ha noi")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = PersonAdapter(contacts, this)
        binding.recyclerView.adapter =adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this,"$position",Toast.LENGTH_SHORT).show()
    }

    override fun onLongClick(position: Int) {
        Toast.makeText(this,"long click $position",Toast.LENGTH_SHORT).show()
    }
}