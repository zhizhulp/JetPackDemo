package com.example.jetpackdemo

import android.os.Bundle
import android.util.Log

/**
 * 自定义具有被观察生命周期的Activity
 */
class MainOwnerActivity : LifeOwnerActivity() {
    private val TAG="OwnerActivity_LocationM"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        lifecycle.addObserver(LocationMPlus(lifecycle,"LocationOwner"))
    }
    override fun onStart() {
        Log.d(TAG,"onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy")
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.d(TAG,"onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }
}
