package com.example.mekotlin55.data.remote.apiservice

import com.example.mekotlin55.data.model.HarryPoterResponce
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

private const val CHARACTER = "https://api.potterdb.com/v1/characters?"

interface HRCharacterApi {

    @GET(CHARACTER)
    fun getCharacter(
        @Query("filter[name_cont]") query: String
    ): Call<HarryPoterResponce>
}