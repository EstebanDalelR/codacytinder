package com.mapbox.mapboxsdk.annotations;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.widget.PopupWindow;
import com.mapbox.mapboxsdk.C5812R;

class BubblePopupHelper {
    BubblePopupHelper() {
    }

    static PopupWindow create(@NonNull Context context, @NonNull BubbleLayout bubbleLayout) {
        PopupWindow popupWindow = new PopupWindow(context);
        popupWindow.setContentView(bubbleLayout);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setAnimationStyle(16973826);
        if (VERSION.SDK_INT >= 21) {
            context = context.getDrawable(C5812R.drawable.mapbox_popup_window_transparent);
        } else {
            context = context.getResources().getDrawable(C5812R.drawable.mapbox_popup_window_transparent);
        }
        popupWindow.setBackgroundDrawable(context);
        return popupWindow;
    }
}
