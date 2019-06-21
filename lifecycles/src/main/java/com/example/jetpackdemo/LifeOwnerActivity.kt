package com.example.jetpackdemo

import android.app.Activity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry

open class LifeOwnerActivity: Activity(),LifecycleOwner {
    private val register:LifecycleRegistry = LifecycleRegistry(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        register.currentState = Lifecycle.State.CREATED
    }

    override fun getLifecycle(): Lifecycle {
        return register
    }

    override fun onStart() {
        super.onStart()
        register.currentState = Lifecycle.State.STARTED
    }

    override fun onResume() {
        super.onResume()
        register.currentState = Lifecycle.State.RESUMED
    }

    override fun onPause() {
        super.onPause()
        register.currentState = Lifecycle.State.STARTED
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        register.currentState = Lifecycle.State.CREATED
    }

    override fun onStop() {
        super.onStop()
        register.currentState = Lifecycle.State.CREATED
    }

    override fun onDestroy() {
        super.onDestroy()
        register.currentState = Lifecycle.State.DESTROYED
    }

}