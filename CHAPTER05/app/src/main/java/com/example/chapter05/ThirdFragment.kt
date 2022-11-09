package com.example.chapter05

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ThirdFragment:Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("ThirdFragment","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("ThirdFragment","onCreate")
        return inflater.inflate(R.layout.third, container, false)
        //return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.e("ThirdFragment","onStart")
    }//在Create or Restart後
    override fun onResume() {
        super.onResume()
        Log.e("ThirdFragment","onResume")
    }//start and Pause後，使頁面互動
    override fun onPause() {
        super.onPause()
        Log.e("ThirdFragment","onPause")
    }//
    override fun onStop() {
        super.onStop()
        Log.e("ThirdFragment","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("ThirdFragment","onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("ThirdFragment","OnDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("ThirdFragment","onDetach")
    }
}