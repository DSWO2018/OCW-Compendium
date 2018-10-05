package com.example.gabriel.myapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.university_row.view.*

/**
 * Created by brianvoong on 12/18/17.
 */

class UniversityListAdapterAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    val videoTitles = listOf("MIT", "Stanford", "CalTech")

    override fun getItemCount(): Int {
        return videoTitles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.university_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        val videoTitle = videoTitles.get(position)
        holder?.view?.textView_university_title?.text = videoTitle
    }

}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}
