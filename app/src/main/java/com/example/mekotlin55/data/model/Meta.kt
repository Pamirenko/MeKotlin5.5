package com.example.mekotlin55.data.model

import com.google.gson.annotations.SerializedName

data class Meta(@SerializedName("copyright")
                val copyright: String? = "",
                @SerializedName("pagination")
                val pagination: Pagination?,
                @SerializedName("generated_at")
                val generatedAt: String? = "")