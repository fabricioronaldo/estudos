package com.fabriciovelasco.estudos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Exe606Activity : AppCompatActivity() {

    lateinit var btnClose: Button

    val listVendor = mutableListOf<String>()
    val listPercent = mutableListOf<Int>()
    val listTotalSale = mutableListOf<Double>()
    val listCommission = mutableListOf<Double>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exe606)

        val editVendor: EditText = findViewById(R.id.edit_vendor)
        val editPercentage: EditText = findViewById(R.id.edit_percentage)
        val editTotalSale: EditText = findViewById(R.id.edit_totalSale)
        val btnSalve: Button = findViewById(R.id.btn_salve)
        val txtVendor: TextView = findViewById(R.id.txt_vendor)
        val txtPercentage: TextView = findViewById(R.id.txt_percentage)
        val txtSale: TextView = findViewById(R.id.txt_sale)
        val txtResult: TextView = findViewById(R.id.txt_result)


        btnSalve.setOnClickListener {

            val vendor = editVendor.text.toString()
            val percentage = editPercentage.text.toString()
            val totalSale = editTotalSale.text.toString()

            getInformation(vendor,percentage,totalSale, txtVendor, txtPercentage,txtSale, txtResult)

        }

        btnClose = findViewById(R.id.btn_close606)

        btnClose.setOnClickListener {
            finish()
        }
    }

    fun getInformation(v: String, p: String, ts: String, txtV: TextView,txtP: TextView, txtS: TextView, txtR:TextView) {
        var total:Double = 0.0
        var totalTs: Double = ts.toDouble()
        var totalP: Double = p.toDouble()

        total = totalTs + (totalTs * (totalP / 100))

        listVendor.add(v)
        listPercent.add(p.toInt())
        listTotalSale.add(ts.toDouble())
        listCommission.add(total.toDouble())

        txtV.text = listVendor.toString()
        txtP.text = listPercent.toString()
        txtS.text = listTotalSale.toString()

        txtR.text = listCommission.toString()

    }
}