package com.jumanto14.dialoghelper

import android.content.Context
import com.google.android.material.dialog.MaterialAlertDialogBuilder

object DialogHelper {

    fun showAlert(
        context: Context,
        message: String,
        style: DialogStyle = DialogStyle.INFO,
        title: String? = null,
        positiveText: String = DialogConfig.positiveText,
        onPositive: (() -> Unit)? = null
    ) {
        val builder = MaterialAlertDialogBuilder(context)
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
        val builder = MaterialAlertDialogBuilder(context)
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

    // ================================
    // Internal Style Applier
    // ================================
    private fun applyStyle(
        builder: MaterialAlertDialogBuilder,
        style: DialogStyle,
        title: String?
    ) {
        when {
            title == null -> builder.setTitle(style.defaultTitle())
            title.isNotEmpty() -> builder.setTitle(title)
            else -> { /* empty title → no title */ }
        }

        style.icon?.let { builder.setIcon(it) }
    }
}
