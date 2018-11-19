package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.m4b.maps.aw.C6403c;
import com.google.android.m4b.maps.ay.C4725p;
import com.google.android.m4b.maps.ay.C6420x;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.cg.bk.C5150b;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p113m.C5475a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.m4b.maps.cg.d */
public final class C5173d {
    /* renamed from: a */
    private final Context f19247a;
    /* renamed from: b */
    private final Resources f19248b;
    /* renamed from: c */
    private final String f19249c;
    /* renamed from: d */
    private final C5184n f19250d;
    /* renamed from: e */
    private final ce f19251e;
    /* renamed from: f */
    private final aa f19252f;
    /* renamed from: g */
    private final Executor f19253g;
    /* renamed from: h */
    private final bk f19254h;
    /* renamed from: i */
    private final C5203e f19255i;
    /* renamed from: j */
    private final C6403c f19256j;

    /* renamed from: a */
    public static C5173d m23110a(Context context, Resources resources, String str, ce ceVar) {
        Context context2 = context;
        String str2 = str;
        C4725p.m21023a(context2);
        C6403c a = C6403c.m27927a(context2, str2, Executors.newSingleThreadScheduledExecutor(), "com.google.android.gms", true);
        C6420x c6420x = (C5475a.m23830a(context2) || !C5398g.m23589e(context2)) ? null : new C6420x(context2, "com.google.android.gms");
        C5184n c5184n = new C5184n(context2, ceVar, str2, a, c6420x);
        Object a2 = c5184n.m23167a();
        return new C5173d(context2, resources, str2, c5184n, ceVar, ab.m27950c(), by.m23061a(), new bk(a2, new C5150b(context2.getApplicationContext(), "com.google.android.m4b.maps._m_u")), new C5203e(context2, str2, a2), a);
    }

    private C5173d(Context context, Resources resources, String str, C5184n c5184n, ce ceVar, aa aaVar, Executor executor, bk bkVar, C5203e c5203e, C6403c c6403c) {
        this.f19247a = (Context) C5462v.m23768a((Object) context, (Object) "processContext");
        C5462v.m23771a(context.equals(context.getApplicationContext()), (Object) "The provided context is not an application context");
        this.f19248b = (Resources) C5462v.m23768a((Object) resources, (Object) "gmsCoreResources");
        this.f19249c = (String) C5462v.m23768a((Object) str, (Object) "clientPackageName");
        this.f19250d = (C5184n) C5462v.m23768a((Object) c5184n, (Object) "connectionManager");
        this.f19251e = (ce) C5462v.m23768a((Object) ceVar, (Object) "versionManager");
        this.f19252f = (aa) C5462v.m23768a((Object) aaVar, (Object) "threadChecker");
        this.f19253g = (Executor) C5462v.m23768a((Object) executor, (Object) "mainExecutor");
        this.f19254h = (bk) C5462v.m23768a((Object) bkVar, (Object) "quotaEventReporter");
        this.f19255i = (C5203e) C5462v.m23768a((Object) c5203e, (Object) "serverParametersManager");
        this.f19256j = (C6403c) C5462v.m23768a((Object) c6403c, (Object) "authorizer");
    }

    /* renamed from: a */
    public final C5184n m23111a() {
        return this.f19250d;
    }

    /* renamed from: b */
    public final ce m23112b() {
        return this.f19251e;
    }

    /* renamed from: c */
    public final Context m23113c() {
        return this.f19247a;
    }

    /* renamed from: d */
    public final Resources m23114d() {
        return this.f19248b;
    }

    /* renamed from: e */
    public final String m23115e() {
        return this.f19249c;
    }

    /* renamed from: f */
    public final aa m23116f() {
        return this.f19252f;
    }

    /* renamed from: g */
    public final Executor m23117g() {
        return this.f19253g;
    }

    /* renamed from: h */
    public final bk m23118h() {
        return this.f19254h;
    }

    /* renamed from: i */
    public final C5203e m23119i() {
        return this.f19255i;
    }

    /* renamed from: j */
    public final C6403c m23120j() {
        return this.f19256j;
    }
}
