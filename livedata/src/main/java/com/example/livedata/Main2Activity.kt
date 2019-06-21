package com.example.livedata

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user1 = User2("张laoshi")
        tv.text = (user1.name)
        Handler().postDelayed(Runnable {
            Log.d("LiveData", "5s到了。")
            user1.name = "asd"
            tv.text = (user1.name)
        }, 5000)
    }
}

data class User2(var name: String)
