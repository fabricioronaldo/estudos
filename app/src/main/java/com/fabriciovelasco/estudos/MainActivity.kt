package com.fabriciovelasco.estudos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private lateinit var btn606: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn606 = findViewById(R.id.btn_606)

        btn606.setOnClickListener {
            val intent = Intent(this, Exe606Activity::class.java)

            startActivity(intent)
        }
    }
}