package com.example.gabriel.myapplication

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.university_row.view.*

/**
 * Created by brianvoong on 12/18/17.
 */

class UniversityListAdapter: RecyclerView.Adapter<UniversityViewHolder>() {

    val universityNames = listOf("MIT", "Stanford", "CalTech", "UC Berkeley", "Tokyo Tech")
    val universityLogos = listOf<Int>(
            R.drawable.ic_mit,
            R.drawable.ic_stanford,
            R.drawable.ic_caltech,
            R.drawable.ic_berkeley,
            R.drawable.ic_tokyo
    )

    override fun getItemCount(): Int {
        return universityNames.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UniversityViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.university_row, parent, false)
        return UniversityViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: UniversityViewHolder, position: Int) {
        val videoTitle = universityNames.get(position)
        val universityLogo = universityLogos.get(position)
        holder.view.textView_university_title.text = videoTitle
        holder.view.universityLogo.setImageResource(universityLogo)
    }

}

class UniversityViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    init {
        view.setOnClickListener {
            val intent = Intent(view.context,VideoListActivity::class.java)
            view.context.startActivity(intent)
        }
    }
}
