package com.curvelo.interfacenubank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curvelo.interfacenubank.adapter.AdapterPagamento
import com.curvelo.interfacenubank.adapter.AdapterProduto
import com.curvelo.interfacenubank.databinding.ActivityMainBinding
import com.curvelo.interfacenubank.model.Pagamento
import com.curvelo.interfacenubank.model.Produto

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPagamento: AdapterPagamento
    private lateinit var adapterProduto: AdapterProduto
    private  val listadePagamento: MutableList<Pagamento> = mutableListOf()
    private val listadeProduto: MutableList<Produto> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
supportActionBar!!.hide()

        val recyclerIconePagamento = binding.recyclerIconesPagamento
        recyclerIconePagamento.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerIconePagamento.setHasFixedSize(true)
        adapterPagamento = AdapterPagamento(this,listadePagamento)
        recyclerIconePagamento.adapter = adapterPagamento
        listaiconePagamento()


        val recyclerProduto = binding.recyclerProduto
        recyclerProduto.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerProduto.setHasFixedSize(true)
        adapterProduto = AdapterProduto(this,listadeProduto)
        recyclerProduto.adapter = adapterProduto
        textoIformativo()





    }
    private fun listaiconePagamento(){
        val icone1 = Pagamento(R.drawable.ic_pix,"Área Pix")
        listadePagamento.add(icone1)
        val icone2 = Pagamento(R.drawable.ic_qr_code_scanner,"QR Code")
        listadePagamento.add(icone2)
        val icone3 = Pagamento(R.drawable.ic_emprestimo,"Divida")
        listadePagamento.add(icone3)
        val icone4 = Pagamento(R.drawable.ic_tranfer,"Transferir")
        listadePagamento.add(icone4)
        val icone5 = Pagamento(R.drawable.ic_depositar,"Depositar")
        listadePagamento.add(icone5)
        val icone6 = Pagamento(R.drawable.ic_recarga_celular,"Recarga")
        listadePagamento.add(icone6)
        val icone7 = Pagamento(R.drawable.ic_cobrar ,"Cobrar")
        listadePagamento.add(icone7)
        val icone8 = Pagamento(R.drawable.ic_doacao,"Doação")
        listadePagamento.add(icone8)
    }
    private fun textoIformativo(){
        val textoum = Produto("Participe da promoção Tudo no Roxinho e concorra a....")
        listadeProduto.add(textoum)

        val textodois = Produto("Chegou o debito automatico da fatura do cartão")
        listadeProduto.add(textodois)

        val textotres = Produto("Conheça a conta PJ: pratica e livre de buroclacia para se..")
        listadeProduto.add(textotres)

        val textoquatro = Produto("Salve seu amigos da buroclacia: Faça um convite...")
        listadeProduto.add(textoquatro)
    }
}