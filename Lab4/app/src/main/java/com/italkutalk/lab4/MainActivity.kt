package com.italkutalk.lab4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.nio.charset.CoderResult

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btn_choice)

        btn.setOnClickListener {
            startActivityForResult(Intent(this, SecActivity::class.java), 1)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val tv: TextView = findViewById(R.id.tv_meal)
        print("fuck")
        data?.extras?.let {
            // if (requestCode == 1 && resultCode == 101)
            tv.text = "飲料:${it.getString("drink")}\n\n甜度:${it.getString("sugar")}\n\n冰塊:${it.getString("ice")}"

        }
    }

}

