package com.tinder.spotify.p415a;

import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import rx.functions.Func1;

/* renamed from: com.tinder.spotify.a.d */
final /* synthetic */ class C18153d implements Func1 {
    /* renamed from: a */
    private final C15035a f56320a;
    /* renamed from: b */
    private final String f56321b;

    C18153d(C15035a c15035a, String str) {
        this.f56320a = c15035a;
        this.f56321b = str;
    }

    public Object call(Object obj) {
        return this.f56320a.m56660a(this.f56321b, (Info) obj);
    }
}
