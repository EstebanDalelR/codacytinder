package com.tinder.smsauth.sdk.di;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.sdk.di.e */
public final class C18126e implements Factory<GoogleApiClient> {
    /* renamed from: a */
    private final Provider<Context> f56256a;

    public /* synthetic */ Object get() {
        return m65772a();
    }

    /* renamed from: a */
    public GoogleApiClient m65772a() {
        return C18126e.m65771a(this.f56256a);
    }

    /* renamed from: a */
    public static GoogleApiClient m65771a(Provider<Context> provider) {
        return C18126e.m65770a((Context) provider.get());
    }

    /* renamed from: a */
    public static GoogleApiClient m65770a(Context context) {
        return (GoogleApiClient) C15521i.m58001a(C14993d.m56599a(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
