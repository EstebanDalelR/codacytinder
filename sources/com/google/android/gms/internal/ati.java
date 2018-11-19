package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.C2335R;
import com.google.android.gms.ads.internal.ar;
import com.tinder.api.ManagerWebServices;
import io.fabric.sdk.android.services.common.C15616a;
import java.util.Map;

@zzzv
public final class ati extends atv {
    /* renamed from: a */
    private final Map<String, String> f23122a;
    /* renamed from: b */
    private final Context f23123b;
    /* renamed from: c */
    private String f23124c = m27238d(ManagerWebServices.PARAM_BADGE_DESC);
    /* renamed from: d */
    private long f23125d = m27239e("start_ticks");
    /* renamed from: e */
    private long f23126e = m27239e("end_ticks");
    /* renamed from: f */
    private String f23127f = m27238d(ManagerWebServices.FB_PARAM_SUMMARY);
    /* renamed from: g */
    private String f23128g = m27238d("location");

    public ati(zzanh zzanh, Map<String, String> map) {
        super(zzanh, "createCalendarEvent");
        this.f23122a = map;
        this.f23123b = zzanh.zzsi();
    }

    /* renamed from: d */
    private final String m27238d(String str) {
        return TextUtils.isEmpty((CharSequence) this.f23122a.get(str)) ? "" : (String) this.f23122a.get(str);
    }

    /* renamed from: e */
    private final long m27239e(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = r4.f23122a;
        r5 = r0.get(r5);
        r5 = (java.lang.String) r5;
        r0 = -1;
        if (r5 != 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r2 = java.lang.Long.parseLong(r5);	 Catch:{ NumberFormatException -> 0x0012 }
        return r2;
    L_0x0012:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ati.e(java.lang.String):long");
    }

    /* renamed from: a */
    public final void m27240a() {
        if (this.f23123b == null) {
            m19488a("Activity context is not available.");
            return;
        }
        ar.e();
        if (fk.m19730f(this.f23123b).m19312d()) {
            ar.e();
            Builder e = fk.m19726e(this.f23123b);
            Resources v = ar.i().m27324v();
            e.setTitle(v != null ? v.getString(C2335R.string.s5) : "Create calendar event");
            e.setMessage(v != null ? v.getString(C2335R.string.s6) : "Allow Ad to create a calendar event?");
            e.setPositiveButton(v != null ? v.getString(C2335R.string.s3) : C15616a.HEADER_ACCEPT, new atj(this));
            e.setNegativeButton(v != null ? v.getString(C2335R.string.s4) : "Decline", new atk(this));
            e.create().show();
            return;
        }
        m19488a("This feature is not available on the device.");
    }

    @TargetApi(14)
    /* renamed from: b */
    final Intent m27241b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra(ManagerWebServices.PARAM_JOB_TITLE, this.f23124c);
        data.putExtra("eventLocation", this.f23128g);
        data.putExtra(ManagerWebServices.PARAM_BADGE_DESC, this.f23127f);
        if (this.f23125d > -1) {
            data.putExtra("beginTime", this.f23125d);
        }
        if (this.f23126e > -1) {
            data.putExtra("endTime", this.f23126e);
        }
        data.setFlags(268435456);
        return data;
    }
}
