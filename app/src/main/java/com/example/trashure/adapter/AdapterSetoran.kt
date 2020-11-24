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
import java.util.logging.Handler

abstract class AdapterSetoran : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val trashureId = arrayOf(
        "Trashure ID IDDUMMY01",
        "Trashure ID IDDUMMY02",
        "Trashure ID IDDUMMY03",
        "Trashure ID IDDUMMY04"
    )

    private val trashureDate = arrayOf(
        "29 / 12 / 2001",
        "29 / 12 / 2001",
        "29 / 12 / 2001",
        "29 / 12 / 2001"
    )

    private val trashureStatus = arrayOf(
        "Pending",
        "Success",
        "Success",
        "Success"
    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemTrashureId: TextView
        var itemTrashureDate: TextView
        var itemTrashureStatus: TextView

        init {
            itemTrashureId = itemView.findViewById(R.id.cardTrashureID)
            itemTrashureDate = itemView.findViewById(R.id.cardTrashureDate)
            itemTrashureStatus = itemView.findViewById(R.id.cardTrashureStatus)

//            itemView.setOnClickListener {
//                var position: Int = getAdapterPosition()
//                val context = itemView.context
//                val intent = Intent(context, DetailSetoran::class.java).apply {
//                    putExtra("NUMBER", position)
//                    putExtra("ID", itemTrashureId.text)
//                    putExtra("DATE", itemTrashureDate.text)
//                    putExtra("STATUS", itemTrashureStatus.text)
//                }
//                context.startActivity(intent)
//            }
        }

    }

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        TODO("Not yet implemented")
//        val v = LayoutInflater.from(parent.context)
//            .inflate(R.layout.card_setoran, parent, false)
//        return ViewHolder(v)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        TODO("Not yet implemented")
//        holder.itemTrashureId.text = trashureId[position]
//        holder.itemTrashureDate.text = trashureDate[position]
//        holder.itemTrashureStatus.text = trashureStatus[position]
//    }
//
//    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
//        return trashureId.size
//    }

}