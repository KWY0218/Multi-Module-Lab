package com.hous.multi_module.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import coil.transform.CircleCropTransformation

@BindingAdapter("setDrawable")
fun ImageView.setDrawable(drawable: String) {
    load(drawable) {
        transformations(CircleCropTransformation())
    }
}
