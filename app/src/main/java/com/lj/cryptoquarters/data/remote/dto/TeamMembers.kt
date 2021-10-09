package com.lj.cryptoquarters.data.remote.dto


import com.google.gson.annotations.SerializedName

data class TeamMembers(
    val id: String,
    val name: String,
    val position: String
)