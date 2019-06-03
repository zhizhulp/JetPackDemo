package com.example.jetpackdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val TAG="MainActivity_LocationM"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.setOnClickListener {
            startActivity(Intent(this@MainActivity,Main2Activity::class.java))
        }
        //lifecycle.addObserver(LocationM())
        lifecycle.addObserver(LocationMPlus(lifecycle))
        /*
        不应此在activity中调用lifecycle.currentState.name，而是应该在observer中调用即在LocationM中调用
         */
        //Log.d(TAG,"lifecycle-${lifecycle.currentState.name}")
    }

    override fun onStart() {
        Log.d(TAG,"onStart")
        super.onStart()
        //Log.d(TAG,"lifecycle-${lifecycle.currentState.name}")
    }

    override fun onResume() {
        Log.d(TAG,"onResume")
        super.onResume()
        //Log.d(TAG,"lifecycle-${lifecycle.currentState.name}")
    }

    override fun onPause() {
        Log.d(TAG,"onPause")
        super.onPause()
        //Log.d(TAG,"lifecycle-${lifecycle.currentState.name}")
    }

    override fun onStop() {
        Log.d(TAG,"onStop")
        super.onStop()
        //Log.d(TAG,"lifecycle-${lifecycle.currentState.name}")
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy")
        super.onDestroy()
        //Log.d(TAG,"lifecycle-${lifecycle.currentState.name}")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG,"onSaveInstanceState")
        super.onSaveInstanceState(outState)
        //Log.d(TAG,"lifecycle-${lifecycle.currentState.name}")
    }
}
