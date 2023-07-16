package com.Y.medicinesound_xml.models.entities

import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("entpName") val entpName : String,
    @SerializedName("itemName") val itemName : String,
    @SerializedName("itemSeq") val itemSeq : String,
    @SerializedName("efcyQesitm") val efcyQesitm : String,
    @SerializedName("useMethodQesitm") val useMethodQesitm : String,
    @SerializedName("atpnWarnQesitm") val atpnWarnQesitm : String,
    @SerializedName("atpnQesitm") val atpnQesitm : String,
    @SerializedName("intrcQesitm") val intrcQesitm : String,
    @SerializedName("seQesitm") val seQesitm : String,
    @SerializedName("depositMethodQesitm") val depositMethodQesitm : String,
    @SerializedName("openDe") val openDe : String,
    @SerializedName("updateDe") val updateDe : String,
    @SerializedName("itemImage") val itemImage : String,
    @SerializedName("entpImage") val entpImage : String,
)
