package com.fauzan.amikomnews.buttomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.fauzan.amikomnews.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

        val listBerita = arrayListOf(
            ListBerita("test", "18-11-2022", R.drawable.jokowi),

            )

        var adapterBerita = BeritaAdapter(listBerita)
        val lm = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rvBerita.layoutManager = lm
        rvBerita.adapter = adapterBerita
    }


}