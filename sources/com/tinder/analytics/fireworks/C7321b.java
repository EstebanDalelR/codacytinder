package com.tinder.analytics.fireworks;

import android.os.Build;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.tinder.analytics.fireworks.C7322d.C6225a;
import com.tinder.auth.repository.C8297k;
import com.tinder.domain.auth.UniqueIdFactory;
import com.tinder.interactors.C2647c;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.utils.ab;
import javax.inject.Inject;

/* renamed from: com.tinder.analytics.fireworks.b */
public class C7321b implements C6225a {
    @NonNull
    /* renamed from: a */
    private final C2647c f26444a;
    @NonNull
    /* renamed from: b */
    private final ManagerFusedLocation f26445b;
    @NonNull
    /* renamed from: c */
    private final UniqueIdFactory f26446c;
    @NonNull
    /* renamed from: d */
    private final C8297k f26447d;

    @Inject
    C7321b(@NonNull C2647c c2647c, @NonNull ManagerFusedLocation managerFusedLocation, @NonNull UniqueIdFactory uniqueIdFactory, @NonNull C8297k c8297k) {
        this.f26444a = c2647c;
        this.f26445b = managerFusedLocation;
        this.f26446c = uniqueIdFactory;
        this.f26447d = c8297k;
    }

    @Nullable
    /* renamed from: a */
    public String mo6765a() {
        return ManagerApp.f12347c;
    }

    @Nullable
    /* renamed from: b */
    public String mo6766b() {
        Info a = ManagerApp.a();
        return a != null ? a.getId() : null;
    }

    @Nullable
    /* renamed from: c */
    public String mo6767c() {
        return ab.a();
    }

    @Nullable
    /* renamed from: d */
    public Number mo6768d() {
        return Integer.valueOf(2);
    }

    @Nullable
    /* renamed from: e */
    public String mo6769e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Android ");
        stringBuilder.append(VERSION.RELEASE);
        return stringBuilder.toString();
    }

    @Nullable
    /* renamed from: f */
    public String mo6770f() {
        return Build.MODEL;
    }

    @Nullable
    /* renamed from: g */
    public String mo6771g() {
        return Build.MANUFACTURER;
    }

    @Nullable
    /* renamed from: h */
    public String mo6772h() {
        return this.f26444a.a();
    }

    @Nullable
    /* renamed from: i */
    public Number mo6773i() {
        return Long.valueOf(System.currentTimeMillis());
    }

    @Nullable
    /* renamed from: j */
    public Number mo6774j() {
        if (this.f26445b.d() == -100000.0d) {
            return null;
        }
        return Double.valueOf(this.f26445b.d());
    }

    @Nullable
    /* renamed from: k */
    public Number mo6775k() {
        if (this.f26445b.e() == -100000.0d) {
            return null;
        }
        return Double.valueOf(this.f26445b.e());
    }

    @Nullable
    /* renamed from: l */
    public Number mo6776l() {
        return Integer.valueOf(2776);
    }

    @Nullable
    /* renamed from: m */
    public String mo6777m() {
        return this.f26446c.getInstanceId();
    }

    @Nullable
    /* renamed from: n */
    public String mo6778n() {
        return this.f26446c.getInstanceId();
    }

    @Nullable
    /* renamed from: o */
    public String mo6779o() {
        return this.f26447d.a();
    }
}
