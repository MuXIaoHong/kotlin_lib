package com.muxiaohong.kotlinlib.binding

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

/**
 *   @auther : Nan
 *   time   : 2019/11/07
 */
object ImageAdapter {

    @BindingAdapter(value = ["url", "placeholder"], requireAll = false)
    @JvmStatic
    fun setImageUrl(imageView: ImageView, url: String, placeholder: Drawable) {
        Glide.with(imageView.context)
            .load(url)
            .apply(RequestOptions().placeholder(placeholder))
            .into(imageView)

    }

}