package com.example.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.aulaid)

        val botao = findViewById<Button>(R.id.btnProxima)
        val nota1 = findViewById<EditText>(R.id.editNota1)
        val nota2 = findViewById<EditText>(R.id.editNota2)
        val resposta = findViewById<TextView>(R.id.txtResultado)

        val altura = findViewById<EditText>(R.id.altura)
        val peso = findViewById<EditText>(R.id.peso)
        val botaoIMC = findViewById<Button>(R.id.btnIMC)
        val repostaIMC = findViewById<TextView>(R.id.txtResultadoIMC)



        botao.setOnClickListener {
            resposta.text = "Média é " + ((nota1.text.toString().toFloat() +
                                nota2.text.toString().toFloat())/2 ).toString()

        }

        botao.setOnClickListener {

            val alturaQuadrado = altura.text.toString().toFloat() * altura.text.toString().toFloat()

            repostaIMC.text = alturaQuadrado / peso.text.toString().toFloat()


        }
    }}