package com.example.databinding

import android.widget.TextView
import androidx.databinding.BindingAdapter

object MyBindingAdapters {
    @BindingAdapter("android:text")
    @JvmStatic fun setText(view:TextView ,text:CharSequence){
        view.text = text.toString().toUpperCase()
    }
}