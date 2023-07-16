package com.Y.medicinesound_xml.models.entities

import com.google.gson.annotations.SerializedName

data class SearchedMedicineInfo(
    @SerializedName("header") val header : Header,
    @SerializedName("body") val body : Body
)
