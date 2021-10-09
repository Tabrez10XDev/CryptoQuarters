package com.lj.cryptoquarters.data.remote

import com.lj.cryptoquarters.data.remote.dto.CoinDetailDto
import com.lj.cryptoquarters.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId : String): CoinDetailDto
}