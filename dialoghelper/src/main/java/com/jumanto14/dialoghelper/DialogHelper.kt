package com.jumanto14.dialoghelper

import android.content.Context
import androidx.appcompat.app.AlertDialog

object DialogHelper {

    fun showAlert(
        context: Context,
        message: String,
        style: DialogStyle = DialogStyle.INFO,
        title: String? = null,
        positiveText: String = DialogConfig.positiveText,
        onPositive: (() -> Unit)? = null
    ) {
        val builder = AlertDialog.Builder(context)
            .setMessage(message)
            .setCancelable(DialogConfig.cancelable)
            .setPositiveButton(positiveText) { dialog, _ ->
                dialog.dismiss()
                onPositive?.invoke()
            }

        applyStyle(builder, style, title)

        builder.show()
    }

    fun showConfirm(
        context: Context,
        message: String,
        style: DialogStyle = DialogStyle.WARNING,
        title: String? = null,
        positiveText: String = "Yes",
        negativeText: String = DialogConfig.negativeText,
        onConfirm: () -> Unit,
        onCancel: (() -> Unit)? = null
    ) {
        val builder = AlertDialog.Builder(context)
            .setMessage(message)
            .setCancelable(DialogConfig.cancelable)
            .setPositiveButton(positiveText) { dialog, _ ->
                dialog.dismiss()
                onConfirm()
            }
            .setNegativeButton(negativeText) { dialog, _ ->
                dialog.dismiss()
                onCancel?.invoke()
            }

        applyStyle(builder, style, title)

        builder.show()
    }

    private fun applyStyle(
        builder: AlertDialog.Builder,
        style: DialogStyle,
        title: String?
    ) {
        when {
            title == null -> builder.setTitle(style.defaultTitle())
            title.isNotEmpty() -> builder.setTitle(title)
            else -> { /* empty → no title */ }
        }

        style.icon?.let { builder.setIcon(it) }
    }
}


