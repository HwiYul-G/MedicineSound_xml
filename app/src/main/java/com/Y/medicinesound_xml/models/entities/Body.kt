package com.Y.medicinesound_xml.models.entities

import com.google.gson.annotations.SerializedName

data class Body(
    @SerializedName("pageNo") val pageNo : Int,
    @SerializedName("totalCount") val totalCount : Int,
    @SerializedName("numOfRows") val numOfRows : Int,
    @SerializedName("items") val items : List<Item>
)
