package com.tinder.views;

import java.util.concurrent.Callable;

/* renamed from: com.tinder.views.s */
final /* synthetic */ class C15466s implements Callable {
    /* renamed from: a */
    private final GroupAvatarsView f47901a;
    /* renamed from: b */
    private final int f47902b;
    /* renamed from: c */
    private final int f47903c;
    /* renamed from: d */
    private final int f47904d;

    C15466s(GroupAvatarsView groupAvatarsView, int i, int i2, int i3) {
        this.f47901a = groupAvatarsView;
        this.f47902b = i;
        this.f47903c = i2;
        this.f47904d = i3;
    }

    public Object call() {
        return this.f47901a.m57889a(this.f47902b, this.f47903c, this.f47904d);
    }
}
