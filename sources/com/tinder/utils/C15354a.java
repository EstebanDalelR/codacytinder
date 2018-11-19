package com.tinder.utils;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.tinder.module.ForApplication;
import javax.inject.Inject;
import rx.Observable;

/* renamed from: com.tinder.utils.a */
public class C15354a {
    /* renamed from: a */
    private final Context f47615a;

    @Inject
    public C15354a(@ForApplication Context context) {
        this.f47615a = context;
    }

    /* renamed from: a */
    public Observable<Info> m57605a() {
        return Observable.a(new C15356b(this));
    }

    /* renamed from: b */
    final /* synthetic */ Info m57606b() throws Exception {
        return AdvertisingIdClient.getAdvertisingIdInfo(this.f47615a);
    }
}
