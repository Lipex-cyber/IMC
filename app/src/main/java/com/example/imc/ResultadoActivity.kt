package com.example.imc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class ResultadoActivity : AppCompatActivity() {

    private lateinit var titleDensidadeCorporal: TextView
    private lateinit var textViewHeaderDensidadeCorporal: TextView
    private lateinit var textViewResultadoDensidadeCorporal: TextView
    private lateinit var textViewPeso: TextView
    private lateinit var textViewAltura: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado2)

        // Inicializando os componentes com findViewById
        titleDensidadeCorporal             = findViewById(R.id.titleDensidadeCorporal)
        textViewHeaderDensidadeCorporal    = findViewById(R.id.textViewHeaderDensidadeCorporal)
        textViewResultadoDensidadeCorporal = findViewById(R.id.textViewResultadoDensidadeCorporal)
        textViewPeso                       = findViewById(R.id.textViewPeso)
        textViewAltura                     = findViewById(R.id.textViewAltura)

        // Obtendo o objeto IMC passado pela Intent
        val imc = intent.getParcelableExtra<IMC>("value")

        // Chama calcular() para preencher imc.imc antes de formatar
        val classificacao = imc?.calcular()

        // IMC arredondado para 2 casas decimais (ALTERAÇÃO)
        val imcFormatado = String.format(Locale("pt", "BR"), "%.2f", imc?.imc ?: 0f)

        // Configurando os textos dos componentes da UI
        titleDensidadeCorporal.text             = imc?.nome.toString()
        textViewHeaderDensidadeCorporal.text    = classificacao

        // Exibe IMC com 2 casas decimais (ALTERAÇÃO)
        textViewResultadoDensidadeCorporal.text = "Seu IMC $imcFormatado"

        // Exibe Peso e Altura (CAMPOS NOVOS)
        textViewPeso.text   = "Seu Peso ${imc?.peso}"
        textViewAltura.text = "Sua Altura ${imc?.altura}"

        // Botão Voltar
        findViewById<Button>(R.id.btnFecharResultados).setOnClickListener {
            finish()
        }
    }
}
