package com.example.chapter06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button = findViewById(R.id.button)

        btn.setOnClickListener {
            AlertDialog.Builder(this@MainActivity)
                .setTitle("請選擇功能")
                .setMessage("請根據下方按鈕選擇要顯示的物件")
                .setNegativeButton("自訂義Toast"){_,_ -> showToast()}
                .setPositiveButton("顯示list"){_,_ -> showListDialog()}
                .setNeutralButton("取消"){_,_ -> Toast.makeText(this, "dialog關閉",Toast.LENGTH_SHORT).show()}
                .show()
        }
    }

    private fun showToast(){
        val toast = Toast(applicationContext)
        toast.setGravity(Gravity.TOP,0,50)//顯示位置
        toast.duration = Toast.LENGTH_SHORT
        val layout = layoutInflater.inflate(R.layout.custom_toast,findViewById(R.id.custom_toast_root))
        toast.view = layout
        toast.show()
    }




    private fun showListDialog(){
        val list = arrayOf("message1","message2","message3","message4","message5")

        AlertDialog.Builder(this@MainActivity)
            .setTitle("使用LIST呈現")
            .setItems(list){_,i -> Toast.makeText(applicationContext,"你選的是"+list[i],Toast.LENGTH_SHORT).show()}
            .show()
    }
}