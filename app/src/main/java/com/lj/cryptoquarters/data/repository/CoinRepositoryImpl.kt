package com.lj.cryptoquarters.data.repository

import com.lj.cryptoquarters.data.remote.CoinPaprikaApi
import com.lj.cryptoquarters.data.remote.dto.CoinDetailDto
import com.lj.cryptoquarters.data.remote.dto.CoinDto
import com.lj.cryptoquarters.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}