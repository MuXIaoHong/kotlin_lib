package com.muxiaohong.kotlinlib.base

import android.app.Application
import android.content.Context

/**
 *   @auther : Nan
 *   time   : 2019/11/12
 */
open class BaseApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)

    }
}