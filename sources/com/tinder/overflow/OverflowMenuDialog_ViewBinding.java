package com.tinder.overflow;

import android.content.Context;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import com.tinder.R;

public final class OverflowMenuDialog_ViewBinding implements Unbinder {
    public void unbind() {
    }

    @UiThread
    @Deprecated
    public OverflowMenuDialog_ViewBinding(OverflowMenuDialog overflowMenuDialog, View view) {
        this(overflowMenuDialog, view.getContext());
    }

    @UiThread
    public OverflowMenuDialog_ViewBinding(OverflowMenuDialog overflowMenuDialog, Context context) {
        context = context.getResources();
        overflowMenuDialog.defaultYPosition = context.getDimensionPixelSize(R.dimen.actionbar_size);
        overflowMenuDialog.dialogShadowHeight = context.getDimensionPixelSize(R.dimen.height_dialog_drop_shadow);
    }
}
