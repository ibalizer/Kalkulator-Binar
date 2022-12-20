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

        hasil: double

        when (operator){
            '+' -> hasil = pertama + kedua
        //operator +
            '-' -> hasil = pertama - kedua
        //operator -
            '*' -> hasil = pertama * kedua
        //operator *
            '/' -> hasil = pertama / kedua
        //operator / (bagi)

            else -> {
                println("Operator Salah!")
                return
            }
            //pesan jika masukkan tidak sesuai input operator
        }
        printf("%.1f %c %.1f = %.1f", pertama, operator, kedua, hasil))
    }
}