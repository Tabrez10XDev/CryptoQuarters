package com.lj.cryptoquarters.presentation.coin_detail

import com.lj.cryptoquarters.data.repository.Coin
import com.lj.cryptoquarters.data.repository.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail ?= null,
    val error: String = ""
)
