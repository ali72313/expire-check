package com.example.expire_check.data.mapper

import com.example.expire_check.data.localData.ExpireItemEntity
import com.example.expire_check.domain.model.ExpireItem
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale


fun ExpireItemEntity.toExpireItem(): ExpireItem {

    val pattern = "yyyy-MM-dd HH:mm:ss"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())

    return ExpireItem(
        title = title,
        icon = icon,
        startDay = LocalDateTime.parse(startDay, formatter),
        expireDay = LocalDateTime.parse(expireDay, formatter),
        totalDays = totalDays
    )
}