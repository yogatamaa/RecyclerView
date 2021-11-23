package com.example.recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Superhero(
    val Imgsuperhero: Int,
    val Namesuperhero: String,
    val Descsuperhero: String

) : Parcelable
