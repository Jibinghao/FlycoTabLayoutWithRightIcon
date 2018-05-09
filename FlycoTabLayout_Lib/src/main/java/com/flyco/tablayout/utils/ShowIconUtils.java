package com.flyco.tablayout.utils;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by jibinghao on 2018/5/9.
 */
public class ShowIconUtils  {

    public static void show(ImageView msgView) {
        if (msgView == null) {
            return;
        }
        RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) msgView.getLayoutParams();
        msgView.setVisibility(View.VISIBLE);
        lp.width = RelativeLayout.LayoutParams.WRAP_CONTENT;
        lp.height = RelativeLayout.LayoutParams.WRAP_CONTENT;
        msgView.setLayoutParams(lp);
    }
}
