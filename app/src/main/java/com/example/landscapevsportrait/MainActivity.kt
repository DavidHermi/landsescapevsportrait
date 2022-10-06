package com.example.landscapevsportrait

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_main)

        title="AppMovida"
        val orientacion = this.resources.configuration.orientation
        var elTexto: TextView = findViewById(R.id.textoAmbulante)
        if(orientacion == Configuration.ORIENTATION_LANDSCAPE){
            elTexto.text="El móvil está tumbado :)"
        }else if (orientacion == Configuration.ORIENTATION_PORTRAIT){
            elTexto.text="El móvil está de pie :)"
        }


    }
}