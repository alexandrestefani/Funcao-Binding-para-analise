package com.alexandrestefani.listapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alexandrestefani.listapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(),ListAdapter.ListAdapterListener {

    private lateinit var binding: ActivityMainBinding

    private val itemList: MutableList<ListItem> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listView = binding.lista
        listView.layoutManager = LinearLayoutManager(this)

        listView.adapter = ListAdapter(itemList, this)

        createMockData()



    }
    private fun createMockData(){
        itemList.add(ListItem("Porto Alegre","RS"))
        itemList.add(ListItem("Rio de Janeiro","RJ"))
        itemList.add(ListItem("Sâo Paulo","SP"))
        itemList.add(ListItem("Brasilia","DF"))
        itemList.add(ListItem("Florianopolis","SC"))
        itemList.add(ListItem("Belem","PA"))
        itemList.add(ListItem("Recife","PE"))
        itemList.add(ListItem("São Luis","MA"))
        itemList.add(ListItem("New York","NY"))
    }
    override fun onItemClicked(content: String) {
        Snackbar.make(binding.root, content, Snackbar.LENGTH_SHORT).show()

    }


}