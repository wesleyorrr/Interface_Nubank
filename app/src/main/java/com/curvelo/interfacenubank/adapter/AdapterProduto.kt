package com.curvelo.interfacenubank.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curvelo.interfacenubank.databinding.ProdutoItemBinding
import com.curvelo.interfacenubank.model.Produto

class AdapterProduto(private val context:Context, private val listaProduto: MutableList<Produto>):
    RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = ProdutoItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ProdutoViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
      holder.textoInformativo.text = listaProduto[position].texto
    }

    override fun getItemCount() = listaProduto.size

    inner class ProdutoViewHolder(binding: ProdutoItemBinding): RecyclerView.ViewHolder(binding.root) {
        val textoInformativo = binding.txtTextoInformativo

    }
}