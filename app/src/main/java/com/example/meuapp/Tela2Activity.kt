package com.example.meuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuapp.databinding.ActivityTela2Binding

class Tela2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTela2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTela2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val btLista = binding.btListaUsuarios

        btLista.setOnClickListener {
            val inten = Intent(this, ListaUsuariosActivity::class.java)
            startActivity(inten)
        }

    }
}