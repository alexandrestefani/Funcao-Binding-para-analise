package com.alexandrestefani.listapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alexandrestefani.listapp.databinding.LayoutBinding

class ListAdapter(
    val listItem: MutableList<ListItem>,
    val listener: ListAdapterListener
        ): RecyclerView.Adapter<ListAdapter.ListViewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewholder {
        return ListViewholder(LayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onBindViewHolder(holder: ListViewholder, position: Int) {
        val item = listItem[position]

        holder.posicao.text = position.toString()
        holder.conteudo.text = item.city

        holder.root.setOnClickListener{
            listener.onItemClicked(item.city)
        }

    }

    class ListViewholder(binding: LayoutBinding): RecyclerView.ViewHolder(binding.root){
        var posicao = binding.posicao
        var conteudo = binding.conteudo
        var root = binding.root

    }

    interface ListAdapterListener{
        fun onItemClicked(content: String);
    }
}