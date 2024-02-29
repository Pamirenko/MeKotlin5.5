package com.example.mekotlin55.data.model

import com.google.gson.annotations.SerializedName

data class Pagination(@SerializedName("next")
                      val next: Int? = 0,
                      @SerializedName("current")
                      val current: Int? = 0,
                      @SerializedName("last")
                      val last: Int? = 0,
                      @SerializedName("records")
                      val records: Int? = 0)