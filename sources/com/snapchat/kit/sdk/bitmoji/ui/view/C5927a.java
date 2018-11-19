package com.snapchat.kit.sdk.bitmoji.ui.view;

import android.view.View;
import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.view.a */
public class C5927a<T extends View> {
    /* renamed from: a */
    private final ViewStub f21691a;
    /* renamed from: b */
    private T f21692b;
    /* renamed from: c */
    private boolean f21693c = false;

    public C5927a(ViewStub viewStub) {
        this.f21691a = viewStub;
    }

    /* renamed from: a */
    public T m25522a() {
        if (!this.f21693c) {
            this.f21692b = this.f21691a.inflate();
            this.f21693c = true;
        }
        return this.f21692b;
    }

    /* renamed from: a */
    public void m25523a(int i) {
        if (this.f21693c || i != 8) {
            m25522a().setVisibility(i);
        }
    }

    /* renamed from: b */
    public int m25525b() {
        if (this.f21693c) {
            return m25522a().getVisibility();
        }
        return 8;
    }

    /* renamed from: a */
    public void m25524a(OnInflateListener onInflateListener) {
        this.f21691a.setOnInflateListener(onInflateListener);
    }
}
