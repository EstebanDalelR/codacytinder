package com.google.android.gms.common.api.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ad;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class ch extends cl {
    /* renamed from: e */
    private final SparseArray<C3794a> f13980e = new SparseArray();

    /* renamed from: com.google.android.gms.common.api.internal.ch$a */
    class C3794a implements OnConnectionFailedListener {
        /* renamed from: a */
        public final int f11961a;
        /* renamed from: b */
        public final GoogleApiClient f11962b;
        /* renamed from: c */
        public final OnConnectionFailedListener f11963c;
        /* renamed from: d */
        private /* synthetic */ ch f11964d;

        public C3794a(ch chVar, int i, GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
            this.f11964d = chVar;
            this.f11961a = i;
            this.f11962b = googleApiClient;
            this.f11963c = onConnectionFailedListener;
            googleApiClient.mo2493a((OnConnectionFailedListener) this);
        }

        public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
            stringBuilder.append("beginFailureResolution for ");
            stringBuilder.append(valueOf);
            Log.d("AutoManageHelper", stringBuilder.toString());
            this.f11964d.m14337b(connectionResult, this.f11961a);
        }
    }

    private ch(zzcf zzcf) {
        super(zzcf);
        this.a.zza("AutoManageHelper", (LifecycleCallback) this);
    }

    @Nullable
    /* renamed from: b */
    private final C3794a m17228b(int i) {
        return this.f13980e.size() <= i ? null : (C3794a) this.f13980e.get(this.f13980e.keyAt(i));
    }

    /* renamed from: b */
    public static ch m17229b(ay ayVar) {
        zzcf a = LifecycleCallback.m8916a(ayVar);
        ch chVar = (ch) a.zza("AutoManageHelper", ch.class);
        return chVar != null ? chVar : new ch(a);
    }

    /* renamed from: a */
    public final void m17230a(int i) {
        OnConnectionFailedListener onConnectionFailedListener = (C3794a) this.f13980e.get(i);
        this.f13980e.remove(i);
        if (onConnectionFailedListener != null) {
            onConnectionFailedListener.f11962b.mo2500b(onConnectionFailedListener);
            onConnectionFailedListener.f11962b.mo2506g();
        }
    }

    /* renamed from: a */
    public final void m17231a(int i, GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
        ad.m9046a((Object) googleApiClient, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.f13980e.indexOfKey(i) < 0;
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Already managing a GoogleApiClient with id ");
        stringBuilder.append(i);
        ad.m9051a(z, stringBuilder.toString());
        cm cmVar = (cm) this.c.get();
        boolean z2 = this.b;
        String valueOf = String.valueOf(cmVar);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        stringBuilder2.append("starting AutoManage for client ");
        stringBuilder2.append(i);
        stringBuilder2.append(" ");
        stringBuilder2.append(z2);
        stringBuilder2.append(" ");
        stringBuilder2.append(valueOf);
        Log.d("AutoManageHelper", stringBuilder2.toString());
        this.f13980e.put(i, new C3794a(this, i, googleApiClient, onConnectionFailedListener));
        if (this.b && cmVar == null) {
            String valueOf2 = String.valueOf(googleApiClient);
            StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            stringBuilder3.append("connecting ");
            stringBuilder3.append(valueOf2);
            Log.d("AutoManageHelper", stringBuilder3.toString());
            googleApiClient.mo2504e();
        }
    }

    /* renamed from: a */
    protected final void mo3572a(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C3794a c3794a = (C3794a) this.f13980e.get(i);
        if (c3794a != null) {
            m17230a(i);
            OnConnectionFailedListener onConnectionFailedListener = c3794a.f11963c;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    /* renamed from: a */
    public final void mo3573a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f13980e.size(); i++) {
            C3794a b = m17228b(i);
            if (b != null) {
                printWriter.append(str).append("GoogleApiClient #").print(b.f11961a);
                printWriter.println(":");
                b.f11962b.mo2495a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: b */
    public final void mo2549b() {
        super.mo2549b();
        boolean z = this.b;
        String valueOf = String.valueOf(this.f13980e);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 14);
        stringBuilder.append("onStart ");
        stringBuilder.append(z);
        stringBuilder.append(" ");
        stringBuilder.append(valueOf);
        Log.d("AutoManageHelper", stringBuilder.toString());
        if (this.c.get() == null) {
            for (int i = 0; i < this.f13980e.size(); i++) {
                C3794a b = m17228b(i);
                if (b != null) {
                    b.f11962b.mo2504e();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo2551d() {
        super.mo2551d();
        for (int i = 0; i < this.f13980e.size(); i++) {
            C3794a b = m17228b(i);
            if (b != null) {
                b.f11962b.mo2506g();
            }
        }
    }

    /* renamed from: f */
    protected final void mo3574f() {
        for (int i = 0; i < this.f13980e.size(); i++) {
            C3794a b = m17228b(i);
            if (b != null) {
                b.f11962b.mo2504e();
            }
        }
    }
}
