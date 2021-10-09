package com.lj.cryptoquarters.presentation.coin_list

import com.lj.cryptoquarters.data.repository.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
