package com.example.gabriel.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_university_list.*

class UniversityListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_university_list)

        setTitle("Featured Universities")
        recyclerView_videos.layoutManager = LinearLayoutManager(this)
        recyclerView_videos.adapter = UniversityListAdapterAdapter()

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
