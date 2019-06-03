package com.example.jetpackdemo

import android.app.Activity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry

class LifeOwnerActivity: Activity(),LifecycleOwner {
    private val register:LifecycleRegistry = LifecycleRegistry(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun getLifecycle(): Lifecycle {
        return register
    }
}