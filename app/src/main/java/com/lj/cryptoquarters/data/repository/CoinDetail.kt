package com.lj.cryptoquarters.data.repository

import com.lj.cryptoquarters.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String ?= "",
    val name: String ?= "",
    val description: String ?= "",
    val symbol: String ?= "",
    val rank: Int ?= -1,
    val isActive: Boolean ?= false,
    val tags: List<String> ?= listOf(),
    val team: List<TeamMember> ?= listOf()
)
