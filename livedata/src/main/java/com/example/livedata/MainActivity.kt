package com.example.livedata

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        viewModel.user.value = User("张laoshi")
        val observer = Observer<User> { user ->
            Log.d("LiveData", "设置名字${user.name}")
            tv.text = user.name
        }
        viewModel.user.observe(this, observer)
        /**
         * 假如在5s内按下home键，5s到了不会设置新的名字，如果切回当前activity，会立即设置新的名字
         */
        Handler().postDelayed(Runnable {
            Log.d("LiveData", "5s到了。")
            viewModel.user.value = User("asd")
        }, 5000)
    }
}

class MyViewModel : ViewModel() {
    val user: MutableLiveData<User> by lazy {
        MutableLiveData<User>()
    }
}

data class User(var name: String)
