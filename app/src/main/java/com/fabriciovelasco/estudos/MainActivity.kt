package com.fabriciovelasco.estudos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

//    private lateinit var btn606: LinearLayout
    private lateinit var rvMain: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainItems = mutableListOf<MainItem>()
        mainItems.add(
            MainItem(
                id = 1,
                drawableId = R.drawable.baseline_trending_up_24,
                textStringId = R.string.label_exe606,
                color = R.color.cinza
            )
        )
        mainItems.add(
            MainItem(
                id = 2,
                drawableId = R.drawable.baseline_trending_up_24,
                textStringId = R.string.label_exe607,
                color = R.color.cinza
            )
        )
        mainItems.add(
            MainItem(
                id = 3,
                drawableId = R.drawable.baseline_trending_up_24,
                textStringId = R.string.label_exe606,
                color = R.color.cinza
            )
        )
        mainItems.add(
            MainItem(
                id = 4,
                drawableId = R.drawable.baseline_trending_up_24,
                textStringId = R.string.label_exe607,
                color = R.color.cinza
            )
        )

        val adapter = MainAdapter(mainItems)
        rvMain = findViewById(R.id.rv_main)
        rvMain.adapter = adapter
        rvMain.layoutManager = GridLayoutManager(this,3)

//        btn606 = findViewById(R.id.btn_606)
//
//        btn606.setOnClickListener {
//            val intent = Intent(this, Exe606Activity::class.java)
//
//            startActivity(intent)
//        }
    }


    private inner class MainAdapter(private val mainItems: List<MainItem>) : RecyclerView.Adapter<MainViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {

            val view = layoutInflater.inflate(R.layout.main_item, parent, false)
            val viewHolder = MainViewHolder(view)
            return viewHolder

        }

        override fun getItemCount(): Int {
            return mainItems.size
        }

        override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
            val itemCurrent = mainItems[position]
            holder.bind(itemCurrent)
        }

    }


    // é a classe da célula em si
    private class MainViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(item: MainItem) {
            val img: ImageView = itemView.findViewById(R.id.item_img_icon)
            val name: TextView = itemView.findViewById(R.id.item_text_name)
            val container: LinearLayout = itemView as LinearLayout

            img.setImageResource(item.drawableId)
            name.setText(item.textStringId)
//            container.setBackgroundColor(item.color)



        }
    }
}