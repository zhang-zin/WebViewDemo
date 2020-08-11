package com.zj.webViewDemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zj.base.autoservice.ServiceLoader
import com.zj.common.autoService.IWebViewService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_to_webView.setOnClickListener {
            val load = ServiceLoader.load(IWebViewService::class.java)
            load?.startWebViewActivity(this, "https://baidu.com", "百度", true)
        }
    }
}