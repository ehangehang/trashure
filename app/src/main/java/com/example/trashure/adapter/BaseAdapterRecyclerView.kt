package com.example.trashure.adapter

import android.content.Intent
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.trashure.R
import java.text.FieldPosition
import java.util.logging.Handler

abstract class BaseAdapterRecyclerView<T>: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    // TODO: FIX THE FUCKING ERRORS!!!! I've commented all the errors so it's easier

    private var list: ArrayList<T>? = ArrayList<T>()
    protected var itemClickListener: AdapterView.OnItemClickListener? = null

    fun addItems(items: ArrayList<T>) {
        this.list?.addAll(items)
//        reload()
    }

    fun clear() {
        this.list?.clear()
//        reload()
    }

    fun getItem(position: Int):T? {
        return this.list?.get(position)
    }

    private fun setOnItemClickListener(onItemClickListener: AdapterView.OnItemClickListener) {
        this.itemClickListener = onItemClickListener
    }

    override fun getItemCount(): Int = list!!.size

//    private fun reload() {
//        Handler(Looper.getMainLooper()).post {
//            notifyDataSetChanged()
//        }
//    }

}