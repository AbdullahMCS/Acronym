package com.example.acronym.data.model

import com.squareup.moshi.Json

class AcronymResponse : ArrayList<AcronymResponseItem>()

data class AcronymResponseItem(
    @Json(name = "lfs")
    val lfs: List<Lf?>? = null,
    @Json(name = "sf")
    val sf: String? = null
)

data class Lf(
    @Json(name = "freq")
    val freq: Int? = null,
    @Json(name = "lf")
    val lf: String? = null,
    @Json(name = "since")
    val since: Int? = null,
    @Json(name = "vars")
    val vars: List<Var?>? = null
)

data class Var(
    @Json(name = "freq")
    val freq: Int? = null,
    @Json(name = "lf")
    val lf: String? = null,
    @Json(name = "since")
    val since: Int? = null
)