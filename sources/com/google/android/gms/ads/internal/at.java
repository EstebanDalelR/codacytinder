package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.zzanh;
import java.util.ArrayList;
import java.util.List;

public final class at extends ViewSwitcher {
    /* renamed from: a */
    private final gd f7187a;
    @Nullable
    /* renamed from: b */
    private final hm f7188b;
    /* renamed from: c */
    private boolean f7189c = true;

    public at(Context context, String str, String str2, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.f7187a = new gd(context);
        this.f7187a.a(str);
        this.f7187a.b(str2);
        if (context instanceof Activity) {
            this.f7188b = new hm((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.f7188b = new hm(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.f7188b.a();
    }

    /* renamed from: a */
    public final gd m8680a() {
        return this.f7187a;
    }

    /* renamed from: b */
    public final void m8681b() {
        ec.a("Disable position monitoring on adFrame.");
        if (this.f7188b != null) {
            this.f7188b.b();
        }
    }

    /* renamed from: c */
    public final void m8682c() {
        ec.a("Enable debug gesture detector on adFrame.");
        this.f7189c = true;
    }

    /* renamed from: d */
    public final void m8683d() {
        ec.a("Disable debug gesture detector on adFrame.");
        this.f7189c = false;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7188b != null) {
            this.f7188b.c();
        }
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7188b != null) {
            this.f7188b.d();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f7189c) {
            this.f7187a.a(motionEvent);
        }
        return false;
    }

    public final void removeAllViews() {
        int i;
        List arrayList = new ArrayList();
        int i2 = 0;
        for (i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof zzanh)) {
                arrayList.add((zzanh) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = (ArrayList) arrayList;
        i = arrayList2.size();
        while (i2 < i) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((zzanh) obj).destroy();
        }
    }
}
