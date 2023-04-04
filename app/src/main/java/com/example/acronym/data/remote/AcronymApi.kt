package com.example.acronym.data.remote

import com.example.acronym.data.model.AcronymResponse
import com.example.acronym.data.remote.ApiReference.SF_PATH
import retrofit2.http.GET
import retrofit2.http.Query

interface AcronymApi {

    @GET(SF_PATH)
    suspend fun getMeanings(
        @Query("sf") abbreviation: String
    ): AcronymResponse
}