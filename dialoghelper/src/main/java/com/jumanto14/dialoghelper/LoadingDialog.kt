package com.jumanto14.dialoghelper

import android.app.Dialog
import android.content.Context
import android.view.Window
import android.widget.ProgressBar

class LoadingDialog(context: Context) {

    private val dialog: Dialog = Dialog(context).apply {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setCancelable(false)
        setContentView(ProgressBar(context))
    }

    fun show() {
        if (!dialog.isShowing) dialog.show()
    }

    fun dismiss() {
        if (dialog.isShowing) dialog.dismiss()
    }
}
