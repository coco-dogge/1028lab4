package com.example.chapter05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MainActivity","onCreate")

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = PageAdapter(supportFragmentManager)
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity","onRestart")
    }//當返回頁面時
    override fun onStart() {
        super.onStart()
        Log.e("MainActivity","onStart")
    }//在Create or Restart後
    override fun onResume() {
        super.onResume()
        Log.e("MainActivity","onResume")
    }//start and Pause後，使頁面互動
    override fun onPause() {
        super.onPause()
        Log.e("MainActivity","onPause")
    }//
    override fun onStop() {
        super.onStop()
        Log.e("MainActivity","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity","onDestroy")
    }
}

class PageAdapter(fm: FragmentManager) :FragmentPagerAdapter(fm){
    override fun getItem(position: Int):Fragment {
        when(position) {
            0 -> {return FirstFragment()}
            1 -> {return SecondFragment()}
            else -> {return ThirdFragment()}
        }
    }

    override fun getCount() = 3
}

