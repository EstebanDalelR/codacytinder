package com.tinder.views;

import java.util.concurrent.Callable;

/* renamed from: com.tinder.views.u */
final /* synthetic */ class C15467u implements Callable {
    /* renamed from: a */
    private final GroupAvatarsView f47905a;
    /* renamed from: b */
    private final String f47906b;
    /* renamed from: c */
    private final int f47907c;
    /* renamed from: d */
    private final int f47908d;

    C15467u(GroupAvatarsView groupAvatarsView, String str, int i, int i2) {
        this.f47905a = groupAvatarsView;
        this.f47906b = str;
        this.f47907c = i;
        this.f47908d = i2;
    }

    public Object call() {
        return this.f47905a.m57890a(this.f47906b, this.f47907c, this.f47908d);
    }
}
