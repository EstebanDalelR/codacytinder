package com.tinder.chat.view.message;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class HeartView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private HeartView f34448b;

    @UiThread
    public HeartView_ViewBinding(HeartView heartView, View view) {
        this.f34448b = heartView;
        heartView.full = (ImageView) C0761c.b(view, R.id.heart_full, "field 'full'", ImageView.class);
        heartView.empty = (ImageView) C0761c.b(view, R.id.heart_empty, "field 'empty'", ImageView.class);
    }

    public void unbind() {
        HeartView heartView = this.f34448b;
        if (heartView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34448b = null;
        heartView.full = null;
        heartView.empty = null;
    }
}
