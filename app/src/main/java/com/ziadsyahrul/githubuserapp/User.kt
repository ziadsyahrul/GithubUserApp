package com.ziadsyahrul.githubuserapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    var name: String?,
    var username: String?,
    var photo: Int?,
    var location: String,
    var repository: String,
    var company: String,
    var follower: String,
    var following: String
): Parcelable