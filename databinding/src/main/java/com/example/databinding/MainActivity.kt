package com.example.databinding

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binging: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val user = User()
        user.name = "saomao"
        binging.user = user
        Handler().postDelayed(Runnable {
            user.name = "lisi"
        },5000)
    }
}
