package com.example.trashure.ui.penukaran

import android.content.Context
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.trashure.R
import com.google.android.material.textfield.TextInputEditText

class PenukaranExpandableListAdapter internal constructor(
    private val context: Context,
    private val titleList: List<String>,
    private val dataList: HashMap<String, List<String>>
) : BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return this.titleList.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return this.dataList[this.titleList[groupPosition]]!!.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return this.titleList[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return this.dataList[this.titleList[groupPosition]]!![childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView
        val listTitle = getGroup(groupPosition) as TextInputEditText
        if (convertView == null) {
            val layoutInflater =
                this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = layoutInflater.inflate(R.layout.list_penukaran, null)
        }

        // TODO: Fix errors, I commented the errors
        //       Gatau EditTextView getter/setter nya apa
        val listTitleEditText = convertView!!.findViewById<TextInputEditText>(R.id.noHpEditText)
        listTitleEditText.setTypeface(null, Typeface.BOLD)
//        listTitleEditText.setText(String) = listTitle
        return convertView
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView
        val noHpEditText = getChild(groupPosition, childPosition) as TextInputEditText
        val nominalEditText = getChild(groupPosition, childPosition) as TextInputEditText
        if (convertView == null) {
            val layoutInflater =
                this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = layoutInflater.inflate(R.layout.list_penukaran, null)
        }

        // TODO: Fix errors, I commented the errors
        //       Gatau EditTextView getter/setter nya apa
        val noHpEditTextView =
            convertView!!.findViewById<TextInputEditText>(R.id.noHpEditText)
//        noHpEditTextView.setText() = noHpEditText
        val nominalEditTextView =
            convertView!!.findViewById<TextInputEditText>(R.id.nominalEditText)
//        noHpEditTextView.setText() = nominalEditText
        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }


}