package com.tinder.managers;

import android.support.annotation.NonNull;
import com.facebook.network.connectionclass.C1798b;
import com.facebook.network.connectionclass.ConnectionClassManager;
import com.tinder.utils.ad;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class bs {
    /* renamed from: a */
    private final bk f32601a;
    /* renamed from: b */
    private final C1798b f32602b;
    /* renamed from: c */
    private final ConnectionClassManager f32603c;

    @Inject
    public bs(@NonNull bk bkVar, @NonNull C1798b c1798b, @NonNull ConnectionClassManager connectionClassManager) {
        this.f32601a = bkVar;
        this.f32602b = c1798b;
        this.f32603c = connectionClassManager;
    }

    /* renamed from: a */
    public void m40512a() {
        if (!this.f32602b.d()) {
            ad.a("Starting network sampling.");
            this.f32601a.a(System.currentTimeMillis());
            this.f32602b.b();
        }
    }

    /* renamed from: b */
    public void m40513b() {
        if (this.f32602b.d()) {
            this.f32602b.c();
            ad.a(String.format("Network sampling complete. Current network quality is %s.", new Object[]{this.f32603c.b().toString()}));
        }
    }
}
