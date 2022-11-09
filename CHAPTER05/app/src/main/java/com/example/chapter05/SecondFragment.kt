package com.example.chapter05

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("SecondFragment","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("SecondFragment","onCreate")
        return inflater.inflate(R.layout.second, container, false)
        //return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.e("SecondFragment","onStart")
    }//在Create or Restart後
    override fun onResume() {
        super.onResume()
        Log.e("SecondFragment","onResume")
    }//start and Pause後，使頁面互動
    override fun onPause() {
        super.onPause()
        Log.e("SecondFragment","onPause")
    }//
    override fun onStop() {
        super.onStop()
        Log.e("SecondFragment","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("SecondFragment","onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("SecondFragment","OnDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("SecondFragment","onDetach")
    }
}