package com.zj.common.autoService

import android.content.Context

interface IWebViewService {
    fun startWebViewActivity(
        context: Context?,
        url: String?,
        title: String?,
        isShowActionBar: Boolean
    )
}