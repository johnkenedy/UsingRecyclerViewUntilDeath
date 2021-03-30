package com.canytech.usingrecyclerviewuntildeath

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_item.view.*

class RvAdapter : RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    private val rvTitleItem = arrayOf(
        "RecyclerView Title 1",
        "RecyclerView Title 2",
        "RecyclerView Title 3",
        "RecyclerView Title 4",
        "RecyclerView Title 5",
        "RecyclerView Title 6"
    )

    private val rvSubtitleItem = arrayOf(
        "This is a subtitle, good luck.",
        "Today is not you birthday, congratulations! for nothing! <3",
        "This is a subtitle, good luck.",
        "Today is not you birthday, congratulations! for nothing! <3",
        "This is a subtitle, good luck.",
        "Today is not you birthday, congratulations! for nothing! <3",
    )

    private val rvCoverItem = arrayOf(
        R.drawable.asd,
        R.drawable.caveiragif,
        R.drawable.asd,
        R.drawable.caveiragif,
        R.drawable.asd,
        R.drawable.caveiragif,
    )

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val rvTitle: TextView = itemView.tv_rv_item_title
        val rvSubtitle: TextView = itemView.tv_rv_item_subtitle
        val rvCover: ImageView = itemView.iv_rv_item_img
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.rvTitle.text = rvTitleItem[position]
        holder.rvSubtitle.text = rvSubtitleItem[position]
        holder.rvCover.setImageResource(rvCoverItem[position])
    }

    override fun getItemCount(): Int = rvTitleItem.size

}