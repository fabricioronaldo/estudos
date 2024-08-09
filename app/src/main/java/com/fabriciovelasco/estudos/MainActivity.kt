package com.fabriciovelasco.estudos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

//    private lateinit var btn606: LinearLayout
    private lateinit var rvMain: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MainAdapter()
        rvMain = findViewById(R.id.rv_main)
        rvMain.adapter = adapter
        rvMain.layoutManager = LinearLayoutManager(this)

//        btn606 = findViewById(R.id.btn_606)
//
//        btn606.setOnClickListener {
//            val intent = Intent(this, Exe606Activity::class.java)
//
//            startActivity(intent)
//        }
    }


    private inner class MainAdapter: RecyclerView.Adapter<MainViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
            val view = layoutInflater.inflate(R.layout.main_item, parent, false)
            val viewHolder = MainViewHolder(view)
            return viewHolder

        }

        override fun getItemCount(): Int {
            return 5
        }

        override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        }

    }


    // é a classe da célula em si
    private class MainViewHolder(view: View): RecyclerView.ViewHolder(view){

    }
}