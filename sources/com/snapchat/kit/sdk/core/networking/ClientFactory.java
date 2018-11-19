package com.snapchat.kit.sdk.core.networking;

import com.google.gson.Gson;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.squareup.okhttp.C5997b;
import com.squareup.okhttp.C6068p;
import javax.inject.Inject;
import retrofit.RestAdapter.C19356a;
import retrofit.client.C19528c;
import retrofit.converter.C19532a;
import retrofit.converter.C19533b;
import retrofit.converter.Converter;

@SnapConnectScope
public class ClientFactory {
    /* renamed from: a */
    private final C5997b f21767a;
    /* renamed from: b */
    private final Gson f21768b;
    /* renamed from: c */
    private final C7154e f21769c;
    /* renamed from: d */
    private final C7922c f21770d;

    @Inject
    ClientFactory(C5997b c5997b, Gson gson, C7154e c7154e, C7922c c7922c) {
        this.f21767a = c5997b;
        this.f21768b = gson;
        this.f21769c = c7154e;
        this.f21770d = c7922c;
    }

    public <T> T generateClient(String str, Class<T> cls) {
        return m25546a(this.f21769c, str, cls, new C19532a(this.f21768b));
    }

    public <T> T generateFingerprintedClient(String str, Class<T> cls) {
        return m25546a(this.f21770d, str, cls, new C19533b());
    }

    /* renamed from: a */
    private <T> T m25546a(C7154e c7154e, String str, Class<T> cls, Converter converter) {
        C6068p c6068p = new C6068p();
        c6068p.m26294a(this.f21767a);
        c6068p.m26319w().add(c7154e);
        return new C19356a().a(str).a(new C19528c(c6068p)).a(converter).a().a(cls);
    }
}
