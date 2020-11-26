package com.example.trashure.homefragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trashure.R
import com.example.trashure.adapter.AdapterSetoran
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import kotlinx.android.synthetic.main.fragment_beranda.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BerandaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BerandaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    protected lateinit var rootView: View
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beranda, container, false)

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BerandaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BerandaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


//    private fun setBarChart() {
//
//        val entries = ArrayList<BarEntry>()
//        entries.add(BarEntry(8f, 0.toFloat(),))
//        entries.add(BarEntry(2f, 1.toFloat()))
//        entries.add(BarEntry(5f, 2.toFloat()))
//        entries.add(BarEntry(20f, 3.toFloat()))
//        entries.add(BarEntry(15f, 4.toFloat()))
//        entries.add(BarEntry(19f, 5.toFloat()))
//
//        val barDataSet = BarDataSet(entries, "Cells")
//
//        val labels = ArrayList<String>()
//        labels.add("18-Jan")
//        labels.add("19-Jan")
//        labels.add("20-Jan")
//        labels.add("21-Jan")
//        labels.add("22-Jan")
//        labels.add("23-Jan")
//        val data = BarData(labels, barDataSet)
//
//        chartSampahTerkumpul?.data = data
//
//        barDataSet.color = resources.getColor(R.color.orange_accent)
//
//        chartSampahTerkumpul?.animateY(5000)
//
//    }

    private fun onCreateComponent() {

    }

    private fun initializeRecylerView() {
        recyclerView = rootView.findViewById(R.id.recyclerSetoran)
        recyclerView.layoutManager = LinearLayoutManager(activity)
//        recyclerView.adapter = adapterSetoran
    }

}