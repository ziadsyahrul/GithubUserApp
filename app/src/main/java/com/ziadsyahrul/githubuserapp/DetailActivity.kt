package com.ziadsyahrul.githubuserapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object{
        var EXTRA_USER = "0"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val nameDetail: TextView = findViewById(R.id.tv_name_detail)
        val usernameDetail: TextView = findViewById(R.id.tv_username_detail)
        val imgDetail: ImageView = findViewById(R.id.img_detail)
        val locationDetail: TextView = findViewById(R.id.tv_location_detail)
        val reposirotyDetail: TextView = findViewById(R.id.tv_repository_detail)
        val companyDetail: TextView = findViewById(R.id.tv_company_detail)
        val followersDetail: TextView = findViewById(R.id.tv_followers_detail)
        val followingDetail: TextView = findViewById(R.id.tv_following_detail)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User

        nameDetail.text = user.name
        usernameDetail.text = user.username
        user.photo?.let { imgDetail.setImageResource(it) }
        locationDetail.text = user.location
        reposirotyDetail.text = user.repository
        companyDetail.text = user.company
        followersDetail.text = user.follower
        followingDetail.text = user.following

    }
}