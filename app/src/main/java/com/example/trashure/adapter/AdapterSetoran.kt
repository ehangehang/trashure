package com.example.trashure.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trashure.R
import com.example.trashure.model.Setoran
import kotlinx.android.synthetic.main.card_setoran.view.*

class AdapterSetoran: BaseAdapterRecyclerView<Setoran>() {

    // TODO: FIX THE FUCKING ERRORS!! I've commented all the errors so it's easier

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.card_setoran, parent, false))
    }

    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view), View.OnClickListener {

        private val tvId: TextView = view.cardTrashureID
        private val tvDate: TextView = view.cardTrashureDate
        private val tvStatus: TextView = view.cardTrashureStatus

        init {
            view.setOnClickListener(this)
        }

        fun setUpView(setoran: Setoran?) {
            tvId.text = setoran?.id
            tvDate.text = setoran?.date
            tvStatus.text = setoran?.status
        }

        override fun onClick(v: View?) {
//            itemClickListener?.onItemClick(adapterPosition, v)
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val myHolder = holder as? MyViewHolder
        myHolder?.setUpView(setoran = getItem(position))
    }

}