package com.example.czynniki_pierwsze

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.wylicz).setOnClickListener {
            var liczba=findViewById<EditText>(R.id.wprowadz).text.toString().toInt()
            var czynnik=2
            var wynik=" "

            while (liczba>1){
                while(liczba%czynnik==0){

                    wynik=wynik+liczba+" "
                    liczba/=czynnik

                }//liczba%czynnik==0
                czynnik+=1

            }//liczba>1

            findViewById<TextView>(R.id.wynik).text=wynik

        }


    }
}