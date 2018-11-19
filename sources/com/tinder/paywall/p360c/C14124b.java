package com.tinder.paywall.p360c;

import com.tinder.paywall.target.PaywallLauncherTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.paywall.c.b */
final /* synthetic */ class C14124b implements Action1 {
    /* renamed from: a */
    private final C13548a f44820a;
    /* renamed from: b */
    private final boolean f44821b;
    /* renamed from: c */
    private final PaywallLauncherTarget f44822c;

    C14124b(C13548a c13548a, boolean z, PaywallLauncherTarget paywallLauncherTarget) {
        this.f44820a = c13548a;
        this.f44821b = z;
        this.f44822c = paywallLauncherTarget;
    }

    public void call(Object obj) {
        this.f44820a.m52942a(this.f44821b, this.f44822c, (Void) obj);
    }
}
