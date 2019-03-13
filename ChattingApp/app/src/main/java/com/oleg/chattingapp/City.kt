package com.oleg.chattingapp

import com.google.firebase.firestore.IgnoreExtraProperties

@IgnoreExtraProperties
data class City(
    val name:String,
    val state:String,
    val country:String,
    val capital:String,
    val population:String,
    val regions:List<String>
)