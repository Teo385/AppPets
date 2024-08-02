package com.example.apidoglist.Dog

import com.google.gson.annotations.SerializedName

data class DogsRespose (
    @SerializedName("status") var status : String,
    @SerializedName("message") var images: List<String>
)