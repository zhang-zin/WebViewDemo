package com.zj.common.autoService;

import android.content.Context;

public interface IWebViewService {
    void startWebViewActivity(Context context, String url, String title, boolean isShowActionBar);
}
