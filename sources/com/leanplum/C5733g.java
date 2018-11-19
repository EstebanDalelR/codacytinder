package com.leanplum;

import android.annotation.TargetApi;

@TargetApi(26)
/* renamed from: com.leanplum.g */
final class C5733g {
    /* renamed from: a */
    String f21328a;
    /* renamed from: b */
    String f21329b;
    /* renamed from: c */
    String f21330c;
    /* renamed from: d */
    String f21331d;
    /* renamed from: e */
    int f21332e = 3;
    /* renamed from: f */
    boolean f21333f = false;
    /* renamed from: g */
    int f21334g = 0;
    /* renamed from: h */
    boolean f21335h = false;
    /* renamed from: i */
    long[] f21336i = null;
    /* renamed from: j */
    int f21337j = 1;
    /* renamed from: k */
    boolean f21338k = false;
    /* renamed from: l */
    boolean f21339l = false;

    C5733g(java.util.Map<java.lang.String, java.lang.Object> r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r8.<init>();
        r0 = 3;
        r8.f21332e = r0;
        r1 = 0;
        r8.f21333f = r1;
        r8.f21334g = r1;
        r8.f21335h = r1;
        r2 = 0;
        r8.f21336i = r2;
        r3 = 1;
        r8.f21337j = r3;
        r8.f21338k = r1;
        r8.f21339l = r1;
        r4 = "id";
        r4 = r9.get(r4);
        r4 = (java.lang.String) r4;
        r8.f21328a = r4;
        r4 = "name";
        r4 = r9.get(r4);
        r4 = (java.lang.String) r4;
        r8.f21329b = r4;
        r4 = "description";
        r4 = r9.get(r4);
        r4 = (java.lang.String) r4;
        r8.f21330c = r4;
        r4 = "groupId";
        r4 = r9.get(r4);
        r4 = (java.lang.String) r4;
        r8.f21331d = r4;
        r4 = "importance";
        r5 = r8.f21332e;
        r5 = java.lang.Integer.valueOf(r5);
        r4 = com.leanplum.p069a.C3859g.a(r9, r4, r5);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r8.f21332e = r4;
        r4 = "enable_lights";
        r5 = r8.f21333f;
        r5 = java.lang.Boolean.valueOf(r5);
        r4 = com.leanplum.p069a.C3859g.a(r9, r4, r5);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        r8.f21333f = r4;
        r4 = "light_color";
        r5 = r8.f21334g;
        r5 = java.lang.Integer.valueOf(r5);
        r4 = com.leanplum.p069a.C3859g.a(r9, r4, r5);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r8.f21334g = r4;
        r4 = "enable_vibration";
        r5 = r8.f21335h;
        r5 = java.lang.Boolean.valueOf(r5);
        r4 = com.leanplum.p069a.C3859g.a(r9, r4, r5);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        r8.f21335h = r4;
        r4 = "lockscreen_visibility";
        r5 = r8.f21337j;
        r5 = java.lang.Integer.valueOf(r5);
        r4 = com.leanplum.p069a.C3859g.a(r9, r4, r5);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r8.f21337j = r4;
        r4 = "bypass_dnd";
        r5 = r8.f21338k;
        r5 = java.lang.Boolean.valueOf(r5);
        r4 = com.leanplum.p069a.C3859g.a(r9, r4, r5);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        r8.f21338k = r4;
        r4 = "show_badge";
        r5 = r8.f21339l;
        r5 = java.lang.Boolean.valueOf(r5);
        r4 = com.leanplum.p069a.C3859g.a(r9, r4, r5);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        r8.f21339l = r4;
        r4 = "vibration_pattern";	 Catch:{ Exception -> 0x00fa }
        r9 = com.leanplum.p069a.C3859g.a(r9, r4, r2);	 Catch:{ Exception -> 0x00fa }
        r9 = (java.util.List) r9;	 Catch:{ Exception -> 0x00fa }
        if (r9 == 0) goto L_0x0103;	 Catch:{ Exception -> 0x00fa }
    L_0x00d5:
        r2 = r9.size();	 Catch:{ Exception -> 0x00fa }
        r2 = new long[r2];	 Catch:{ Exception -> 0x00fa }
        r8.f21336i = r2;	 Catch:{ Exception -> 0x00fa }
        r9 = r9.iterator();	 Catch:{ Exception -> 0x00fa }
        r2 = 0;	 Catch:{ Exception -> 0x00fa }
    L_0x00e2:
        r4 = r8.f21336i;	 Catch:{ Exception -> 0x00fa }
        r4 = r4.length;	 Catch:{ Exception -> 0x00fa }
        if (r2 >= r4) goto L_0x0103;	 Catch:{ Exception -> 0x00fa }
    L_0x00e7:
        r4 = r9.next();	 Catch:{ Exception -> 0x00fa }
        r4 = (java.lang.Number) r4;	 Catch:{ Exception -> 0x00fa }
        if (r4 == 0) goto L_0x00f7;	 Catch:{ Exception -> 0x00fa }
    L_0x00ef:
        r5 = r8.f21336i;	 Catch:{ Exception -> 0x00fa }
        r6 = r4.longValue();	 Catch:{ Exception -> 0x00fa }
        r5[r2] = r6;	 Catch:{ Exception -> 0x00fa }
    L_0x00f7:
        r2 = r2 + 1;
        goto L_0x00e2;
    L_0x00fa:
        r9 = new java.lang.Object[r3];
        r2 = "Failed to parse vibration pattern.";
        r9[r1] = r2;
        com.leanplum.p069a.ao.b(r9);
    L_0x0103:
        r9 = r8.f21332e;
        if (r9 >= 0) goto L_0x010e;
    L_0x0107:
        r9 = r8.f21332e;
        r1 = 5;
        if (r9 <= r1) goto L_0x010e;
    L_0x010c:
        r8.f21332e = r0;
    L_0x010e:
        r9 = r8.f21337j;
        r0 = -1;
        if (r9 >= r0) goto L_0x0119;
    L_0x0113:
        r9 = r8.f21337j;
        if (r9 <= r3) goto L_0x0119;
    L_0x0117:
        r8.f21337j = r3;
    L_0x0119:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.g.<init>(java.util.Map):void");
    }
}
