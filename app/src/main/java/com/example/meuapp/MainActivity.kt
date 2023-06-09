package com.example.meuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edNome = binding.edUsuario
        val btLogin = binding.btLogin
        val btCadastrar = binding.btCadastrar

        btCadastrar.setOnClickListener {
            val inten = Intent(this, RegistroActivity::class.java)
            startActivity(inten)
        }


        btLogin.setOnClickListener {
            if(edNome.text.toString()=="Diogo") {
                val inten = Intent(this, Tela2Activity::class.java)
                val texto = edNome.text.toString()
                inten.putExtra("nome", texto)
                startActivity(inten)

            }

        }


    }
}