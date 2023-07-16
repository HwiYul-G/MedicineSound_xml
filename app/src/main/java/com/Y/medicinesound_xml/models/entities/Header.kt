package com.Y.medicinesound_xml.models.entities

import com.google.gson.annotations.SerializedName

data class Header(
    @SerializedName("resultCode") val resultCode : String,
    @SerializedName("resultMsg") val resultMsg : String,
)
