package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.view.C3394u;

/* renamed from: com.facebook.ads.internal.view.c.b.o */
public abstract class C3361o extends RelativeLayout implements C1582n {
    @Nullable
    /* renamed from: a */
    private C3394u f10192a;

    public C3361o(Context context) {
        super(context);
    }

    public C3361o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new LayoutParams(-1, -1));
    }

    /* renamed from: a */
    protected void mo3339a() {
    }

    /* renamed from: a */
    public void mo1788a(C3394u c3394u) {
        this.f10192a = c3394u;
        mo3339a();
    }

    /* renamed from: b */
    protected void mo3340b() {
    }

    /* renamed from: b */
    public void mo1789b(C3394u c3394u) {
        mo3340b();
        this.f10192a = null;
    }

    @Nullable
    protected C3394u getVideoView() {
        return this.f10192a;
    }
}
