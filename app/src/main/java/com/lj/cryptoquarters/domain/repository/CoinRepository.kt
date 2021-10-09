package com.lj.cryptoquarters.domain.repository

import com.lj.cryptoquarters.data.remote.dto.CoinDetailDto
import com.lj.cryptoquarters.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}