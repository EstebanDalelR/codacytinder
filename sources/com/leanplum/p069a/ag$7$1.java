package com.leanplum.p069a;

import android.os.AsyncTask;
import com.leanplum.p069a.ag.C38577;

/* renamed from: com.leanplum.a.ag$7$1 */
final class ag$7$1 extends AsyncTask<Void, Void, Void> {
    /* renamed from: a */
    final /* synthetic */ C38577 f21139a;
    /* renamed from: b */
    private /* synthetic */ boolean f21140b;

    ag$7$1(C38577 c38577, boolean z) {
        this.f21139a = c38577;
        this.f21140b = z;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m25026a();
    }

    /* renamed from: a */
    private java.lang.Void m25026a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        r0 = r11.f21140b;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r11.f21139a;
        r0 = r0.f12100a;
        r2 = 1;
        r3 = 0;
        if (r0 != 0) goto L_0x0018;
    L_0x000e:
        r0 = new java.lang.Object[r2];
        r2 = "Location can't be null in setUserLocationAttribute.";
        r0[r3] = r2;
        com.leanplum.p069a.ao.a(r0);
        return r1;
    L_0x0018:
        r0 = java.util.Locale.US;
        r4 = "%.6f,%.6f";
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = r11.f21139a;
        r6 = r6.f12100a;
        r6 = r6.getLatitude();
        r6 = java.lang.Double.valueOf(r6);
        r5[r3] = r6;
        r6 = r11.f21139a;
        r6 = r6.f12100a;
        r6 = r6.getLongitude();
        r6 = java.lang.Double.valueOf(r6);
        r5[r2] = r6;
        r0 = java.lang.String.format(r0, r4, r5);
        r4 = new java.util.HashMap;
        r4.<init>();
        r5 = "location";
        r4.put(r5, r0);
        r0 = "locationAccuracyType";
        r5 = r11.f21139a;
        r5 = r5.f12101b;
        r5 = r5.name();
        r5 = r5.toLowerCase();
        r4.put(r0, r5);
        r0 = com.leanplum.Leanplum.getContext();
        if (r0 == 0) goto L_0x00db;
    L_0x0060:
        r0 = java.util.Locale.US;
        if (r0 == 0) goto L_0x00db;
    L_0x0064:
        r5 = new android.location.Geocoder;
        r0 = com.leanplum.Leanplum.getContext();
        r6 = java.util.Locale.US;
        r5.<init>(r0, r6);
        r0 = r11.f21139a;	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r0 = r0.f12100a;	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r6 = r0.getLatitude();	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r0 = r11.f21139a;	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r0 = r0.f12100a;	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r8 = r0.getLongitude();	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r10 = 1;	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r0 = r5.getFromLocation(r6, r8, r10);	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        if (r0 == 0) goto L_0x00db;	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
    L_0x0086:
        r5 = r0.size();	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        if (r5 <= 0) goto L_0x00db;	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
    L_0x008c:
        r0 = r0.get(r3);	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r0 = (android.location.Address) r0;	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r5 = "city";	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r6 = r0.getLocality();	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r4.put(r5, r6);	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r5 = "region";	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r6 = r0.getAdminArea();	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r4.put(r5, r6);	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r5 = "country";	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r0 = r0.getCountryCode();	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        r4.put(r5, r0);	 Catch:{ IOException -> 0x00c5, IllegalArgumentException -> 0x00ae, Throwable -> 0x00db }
        goto L_0x00db;
    L_0x00ae:
        r0 = move-exception;
        r2 = new java.lang.Object[r2];
        r5 = new java.lang.StringBuilder;
        r6 = "Invalid latitude or longitude values: ";
        r5.<init>(r6);
        r5.append(r0);
        r0 = r5.toString();
        r2[r3] = r0;
        com.leanplum.p069a.ao.a(r2);
        goto L_0x00db;
    L_0x00c5:
        r0 = move-exception;
        r2 = new java.lang.Object[r2];
        r5 = new java.lang.StringBuilder;
        r6 = "Failed to connect to Geocoder: ";
        r5.<init>(r6);
        r5.append(r0);
        r0 = r5.toString();
        r2[r3] = r0;
        com.leanplum.p069a.ao.a(r2);
    L_0x00db:
        r0 = "setUserAttributes";
        r0 = com.leanplum.p069a.aw.b(r0, r4);
        r2 = new com.leanplum.a.l;
        r2.<init>(r11);
        r0.a(r2);
        r2 = new com.leanplum.a.m;
        r2.<init>(r11);
        r0.a(r2);
        r0.h();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.ag$7$1.a():java.lang.Void");
    }
}
