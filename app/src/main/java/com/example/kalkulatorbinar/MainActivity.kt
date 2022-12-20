package com.example.kalkulatorbinar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Masukkan angka pertama: ")
        println("Masukkan angka kedua: ")
        //home kalkulator

        println("masukkan operator (+, -, /, *): ")
        //fitur kalkulator

        when (operator){
            '+' -> hasil = pertama + kedua
        //operator +
        }


    }
}