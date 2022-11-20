package com.fauzan.amikomnews.buttomnav

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.fauzan.amikomnews.R
import kotlin.collections.ArrayList

class BeritaAdapter (val listBerita: ArrayList<ListBerita>) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

        var Berita = view.findViewById<TextView>(R.id.txtJudul)
        var tanggal = view.findViewById<TextView>(R.id.txt_tanggal)
        var imgview = view.findViewById<ImageView>(R.id.img_berita)
    }
   // Buat objek ViewHolder Untuk Register view Inflate layout

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.item_berita,parent, false)
        return ViewHolder(view)
    }
    // Untuk Set data ke layoutnya
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Berita.text = listBerita[position].JudulBerita
        holder.tanggal.text = listBerita[position].tanggal
        holder.imgview.setImageResource(listBerita[position].img)
    }
// ada berapa item yang muncul di recycler view
    override fun getItemCount(): Int {
        return listBerita.size
    }
}

