package com.example.gabriel.myapplication

import android.content.Intent
import android.support.constraint.Group
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import kotlinx.android.synthetic.main.university_row.view.*

/**
 * Created by brianvoong on 12/18/17.
 */

class UniversityListAdapterAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    val videoTitles = listOf("MIT", "Stanford", "CalTech", "UC Berkeley", "Tokyo Tech")
    val universityLogos = listOf<Int>(
            R.drawable.ic_mit,
            R.drawable.ic_stanford,
            R.drawable.ic_caltech,
            R.drawable.ic_berkeley,
            R.drawable.ic_tokyo
    )

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
        val universityLogo = universityLogos.get(position)
        holder?.view?.textView_university_title?.text = videoTitle
        holder?.view?.universityLogo?.setImageResource(universityLogo)
        holder?.view?.textView_university_title?.setOnClickListener {

        }
    }

}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    init {
        view.setOnClickListener {
            val intent = Intent(view.context,LogInActivity::class.java)
            view.context.startActivity(intent)
        }
    }
}
