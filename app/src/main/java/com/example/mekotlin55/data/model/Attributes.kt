package com.example.mekotlin55.data.model

import com.google.gson.annotations.SerializedName

data class Attributes(@SerializedName("patronus")
                      val patronus:String?,
                      @SerializedName("gender")
                      val gender: String?,
                      @SerializedName("skin_color")
                      val skinColor: String?,
                      @SerializedName("wiki")
                      val wiki: String = "",
                      @SerializedName("died")
                      val died: String?,
                      @SerializedName("animagus")
                      val animagus: String?,
                      @SerializedName("house")
                      val house: String?,
                      @SerializedName("eye_color")
                      val eyeColor: String?,
                      @SerializedName("slug")
                      val slug: String = "",
                      @SerializedName("height")
                      val height: String?,
                      @SerializedName("image")
                      val image: String?,
                      @SerializedName("blood_status")
                      val bloodStatus: String?,
                      @SerializedName("born")
                      val born: String?,
                      @SerializedName("weight")
                      val weight: String?,
                      @SerializedName("hair_color")
                      val hairColor: String?,
                      @SerializedName("marital_status")
                      val maritalStatus: String?,
                      @SerializedName("nationality")
                      val nationality: String?,
                      @SerializedName("species")
                      val species: String?,
                      @SerializedName("name")
                      val name: String = "",
                      @SerializedName("boggart")
                      val boggart: String?)