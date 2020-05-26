package com.muxiaohong.kotlinlib.base

/**
 *   @auther : Nan
 *   time   : 2020/01/13
 */
interface IBaseResponse<T> {
    fun code(): Int
    fun msg(): String
    fun detail(): String
    fun data(): T
    fun isSuccess(): Boolean
}