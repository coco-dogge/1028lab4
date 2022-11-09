package com.example.chapter05

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class FirstFragment:Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("FirstFragment","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("FirstFragment","onCreate")
        return inflater.inflate(R.layout.irst, container, false)
        //return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("FirstFragment","onActivityCreated")
    }


    override fun onStart() {
        super.onStart()
        Log.e("FirstFragment","onStart")
    }//在Create or Restart後
    override fun onResume() {
        super.onResume()
        Log.e("FirstFragment","onResume")
    }//start and Pause後，使頁面互動
    override fun onPause() {
        super.onPause()
        Log.e("FirstFragment","onPause")
    }//
    override fun onStop() {
        super.onStop()
        Log.e("FirstFragment","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("FirstFragment","onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("FirstFragment","OnDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("FirstFragment","onDetach")
    }

}
