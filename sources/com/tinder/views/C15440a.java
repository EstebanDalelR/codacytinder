package com.tinder.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.widget.Scroller;

/* renamed from: com.tinder.views.a */
public class C15440a extends Scroller {
    /* renamed from: a */
    private int f47854a = Callback.DEFAULT_SWIPE_ANIMATION_DURATION;

    public C15440a(@NonNull Context context) {
        super(context);
    }

    /* renamed from: a */
    public void m57935a(int i) {
        this.f47854a = i;
    }

    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.f47854a);
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f47854a);
    }
}
