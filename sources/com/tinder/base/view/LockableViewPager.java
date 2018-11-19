package com.tinder.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tinder.base.C8314i.C8313c;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/tinder/base/view/LockableViewPager;", "Lcom/tinder/base/view/MultiTouchSafeViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isPagingEnabled", "", "()Z", "setPagingEnabled", "(Z)V", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "LockableViewPagerParent", "base_release"}, k = 1, mv = {1, 1, 10})
public final class LockableViewPager extends MultiTouchSafeViewPager {
    /* renamed from: a */
    private boolean f40718a;

    public LockableViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        if (attributeSet != null) {
            context = context.getTheme().obtainStyledAttributes(attributeSet, C8313c.LockableViewPager, 0, 0);
            try {
                this.f40718a = context.getBoolean(C8313c.LockableViewPager_lvp_pagingEnabled, true);
            } finally {
                context.recycle();
            }
        }
        this.f40718a = true;
    }

    /* renamed from: a */
    public final boolean m49835a() {
        return this.f40718a;
    }

    public final void setPagingEnabled(boolean z) {
        this.f40718a = z;
    }

    public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "ev");
        return (!this.f40718a || super.onInterceptTouchEvent(motionEvent) == null) ? null : true;
    }

    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "ev");
        return (!this.f40718a || super.onTouchEvent(motionEvent) == null) ? null : true;
    }
}
