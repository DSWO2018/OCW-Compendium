package com.example.gabriel.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_video_list.*

class VideoListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_list)

        setTitle("Courses")
        recyclerView_videos.layoutManager = LinearLayoutManager(this)
        recyclerView_videos.adapter = VideoListAdapter()

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}