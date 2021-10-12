package com.nxt.day7.callback

interface Click {
    fun onItemClick(position: Int)
    fun onLongClick(position: Int)
}