package com.alexandrestefani.listapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alexandrestefani.listapp.databinding.LayoutBinding

class ListAdapter: RecyclerView.Adapter<ListAdapter.ListViewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewholder {
        return ListViewholder(LayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: ListViewholder, position: Int) {
        holder.posicao.text = position.toString()
        holder.conteudo.text = "lista experimental aula1"
    }

    class ListViewholder(binding: LayoutBinding): RecyclerView.ViewHolder(binding.root){
        var posicao = binding.posicao
        var conteudo = binding.conteudo

    }
}