package com.example.expire_check.domain.model

import java.time.LocalDate
import java.time.LocalDateTime


data class ExpireItem(
    val icon: Int,
    val title: String,
    val startDay: LocalDateTime,
    val expireDay: LocalDateTime,
    val totalDays: Int
)
