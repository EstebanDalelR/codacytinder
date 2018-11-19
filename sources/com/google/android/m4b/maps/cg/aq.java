package com.google.android.m4b.maps.cg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.m4b.maps.GoogleMapOptions;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C4731z;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.C5538f;
import com.google.android.m4b.maps.p124x.C5543k.C6814a;
import com.google.android.m4b.maps.p124x.C5552t;
import com.google.android.m4b.maps.p125y.C5571j;

public class aq extends C6814a {
    /* renamed from: a */
    private static final String f27875a = "aq";
    /* renamed from: b */
    private C6635x f27876b;
    /* renamed from: c */
    private final GoogleMapOptions f27877c;
    /* renamed from: d */
    private final Context f27878d;
    /* renamed from: e */
    private final C5173d f27879e;

    public aq(Context context, GoogleMapOptions googleMapOptions, C5173d c5173d) {
        this.f27878d = (Context) C5571j.m24292a((Object) context);
        if (googleMapOptions == null) {
            googleMapOptions = new GoogleMapOptions();
        }
        this.f27877c = googleMapOptions;
        this.f27879e = (C5173d) C5571j.m24293a((Object) c5173d, (Object) "Environment is null");
    }

    @Deprecated
    /* renamed from: a */
    public final C5538f mo7169a() {
        if (!C5398g.m23589e(this.f27878d)) {
            return this.f27876b;
        }
        C4728u.m21049a("This device does not support the use of MapView.getMap(). Please use MapView.getMapAsync() instead.");
        return null;
    }

    /* renamed from: a */
    public final void mo7170a(Bundle bundle) {
        this.f27876b = C7518t.m33058a(this.f27877c, this.f27878d instanceof Activity ? C4731z.m21055a((Activity) this.f27878d) : false, this.f27879e);
        this.f27876b.mo5323a(bundle);
    }

    /* renamed from: b */
    public final void mo7172b() {
        this.f27876b.mo5325p();
    }

    /* renamed from: c */
    public final void mo7174c() {
        this.f27876b.mo5326q();
    }

    /* renamed from: d */
    public final void mo7176d() {
        this.f27876b.mo5327r();
        this.f27876b = null;
    }

    /* renamed from: e */
    public final void mo7177e() {
        this.f27876b.mo5328s();
    }

    /* renamed from: b */
    public final void mo7173b(Bundle bundle) {
        this.f27876b.mo5324b(bundle);
    }

    /* renamed from: f */
    public final C5484b mo7178f() {
        return C7701d.m33407a(this.f27876b.mo7220E());
    }

    /* renamed from: a */
    public final void mo7171a(C5552t c5552t) {
        if (this.f27876b != null) {
            try {
                this.f27876b.mo5760a(c5552t);
            } catch (C5552t c5552t2) {
                throw new RuntimeRemoteException(c5552t2);
            }
        }
    }

    /* renamed from: c */
    public final void mo7175c(Bundle bundle) {
        if (this.f27876b != null) {
            try {
                this.f27876b.mo5773c(bundle);
            } catch (Bundle bundle2) {
                throw new RuntimeRemoteException(bundle2);
            }
        }
    }

    /* renamed from: g */
    public final void mo7179g() {
        if (this.f27876b != null) {
            try {
                this.f27876b.mo5788u();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }
}
