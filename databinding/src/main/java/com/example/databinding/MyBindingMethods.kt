package com.example.databinding

import android.widget.ImageView
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods


@BindingMethods(value = [
    BindingMethod(
        type = ImageView::class,
        attribute = "android:tint",
        method = "setImageTintList")])
class MyBindingMethods