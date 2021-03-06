package com.zj.webView

import android.content.Context
import android.content.Intent
import com.google.auto.service.AutoService
import com.zj.common.autoService.IWebViewService

@AutoService(IWebViewService::class)
class WebViewServiceImpl : IWebViewService {
    override fun startWebViewActivity(
        context: Context?,
        url: String?,
        title: String?,
        isShowActionBar: Boolean
    ) {
        if (context != null) {
            val intent = Intent(context, WebViewActivity::class.java)
            intent.putExtra(Constants.TITLE, title)
            intent.putExtra(Constants.URL, url)
            intent.putExtra(Constants.IS_SHOW_ACTION_BAR, isShowActionBar)
            context.startActivity(intent)
        }
    }
}