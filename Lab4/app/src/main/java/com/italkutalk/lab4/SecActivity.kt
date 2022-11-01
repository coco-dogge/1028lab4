package com.italkutalk.lab4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class SecActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)
        //將變數與 XML 元件綁定
        val btn_send: Button= findViewById(R.id.btn_send)
        val set_drink = findViewById<EditText>(R.id.ed_drink)
        val rg1:RadioGroup = findViewById(R.id.radioGroup)
        val rg2:RadioGroup = findViewById(R.id.radioGroup2)
        var sugar:String = rg1.findViewById<RadioButton>(R.id.radioButton4).text.toString()
        var ice:String = rg2.findViewById<RadioButton>(R.id.radioButton8).text.toString()


        rg1.setOnCheckedChangeListener{_, i -> sugar = rg1.findViewById<RadioButton>(i).text.toString()}
        rg2.setOnCheckedChangeListener{_, i -> ice = rg2.findViewById<RadioButton>(i).text.toString()}

        btn_send.setOnClickListener {

            val b = Bundle()
            b.putString("sugar",sugar)
            b.putString("drink",set_drink.text.toString())
            b.putString("ice",ice)

            val i = Intent()
            i.putExtras(b)
            setResult(101,i)

            finish()

        }



    }
}