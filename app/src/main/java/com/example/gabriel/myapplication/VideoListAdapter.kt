package com.example.gabriel.myapplication

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.video_row.view.*

/**
 * Created by brianvoong on 12/18/17.
 */

class VideoListAdapter: RecyclerView.Adapter<VideoViewHolder>() {

    val videoTitles = listOf("Video 1", "Video 2", "Video 3", "Work in Progress")

    override fun getItemCount(): Int {
        return videoTitles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return VideoViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val videoTitle = videoTitles.get(position)
        holder.view.textView_video_title.text = videoTitle
    }

}

class VideoViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    init {
        view.setOnClickListener {
            /*
                Aquí agrega el codigo para abrir la actividad del video
                Abajo te dejo un ejemplo
             */
            //val intent = Intent(view.context,LogInActivity::class.java)
            //view.context.startActivity(intent)
        }
    }
}
