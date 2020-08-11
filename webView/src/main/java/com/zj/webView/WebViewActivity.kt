package com.zj.webView

import android.os.Bundle
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_web_view.*


class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        webView.settings.javaScriptEnabled = true

        webView.webViewClient = object : WebViewClient() {
            //覆盖shouldOverrideUrlLoading 方法
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                return super.shouldOverrideUrlLoading(view, request)
            }
        }
        webView.loadUrl(intent.getStringExtra(Constants.URL).toString())
        tv_title.text = intent.getStringExtra(Constants.TITLE)
        back.setOnClickListener {
            finish()
        }
        action_bar.visibility =
            if (intent.getBooleanExtra(Constants.IS_SHOW_ACTION_BAR, true)) View.VISIBLE
            else View.GONE
    }
}