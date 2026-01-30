package com.jumanto14.dialoghelper

import androidx.annotation.DrawableRes

enum class DialogStyle(
    val defaultTitle: () -> String,
    @DrawableRes val icon: Int? = null
) {
    INFO(
        defaultTitle = { DialogConfig.infoTitle }
    ),
    SUCCESS(
        defaultTitle = { DialogConfig.successTitle }
    ),
    WARNING(
        defaultTitle = { DialogConfig.warningTitle }
    ),
    ERROR(
        defaultTitle = { DialogConfig.errorTitle }
    )
}
