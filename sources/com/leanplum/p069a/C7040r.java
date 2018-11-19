package com.leanplum.p069a;

/* renamed from: com.leanplum.a.r */
public class C7040r implements bv {
    /* renamed from: b */
    private static String f25619b = "(detect)";
    /* renamed from: c */
    private static String f25620c = "__Android Resources";
    /* renamed from: d */
    private static String f25621d = "__name__";
    /* renamed from: e */
    private static String f25622e = "Chained message";
    /* renamed from: f */
    private static String f25623f = "Open action";
    /* renamed from: g */
    private static String f25624g = "Chain to Existing Message";
    /* renamed from: h */
    private static String f25625h = "Push message goes here.";
    /* renamed from: i */
    private static String f25626i = "sdkLog";
    /* renamed from: j */
    private static String f25627j = "sdkError";
    /* renamed from: k */
    private static String f25628k = "__file__";
    /* renamed from: a */
    final /* synthetic */ C5727q f25629a;

    C7040r(C5727q c5727q) {
        this.f25629a = c5727q;
    }

    /* renamed from: a */
    public void mo6204a() {
        this.f25629a.m25150e();
        this.f25629a.f21277V.mo6201a(new Exception("Unexpected binary data"));
    }

    /* renamed from: a */
    public void mo6207a(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = ":";	 Catch:{ Exception -> 0x0075 }
        r1 = 4;	 Catch:{ Exception -> 0x0075 }
        r0 = r5.split(r0, r1);	 Catch:{ Exception -> 0x0075 }
        r1 = 0;	 Catch:{ Exception -> 0x0075 }
        r1 = r0[r1];	 Catch:{ Exception -> 0x0075 }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ Exception -> 0x0075 }
        switch(r1) {
            case 1: goto L_0x006b;
            case 2: goto L_0x005f;
            case 3: goto L_0x0057;
            case 4: goto L_0x0057;
            case 5: goto L_0x001a;
            case 6: goto L_0x007e;
            case 7: goto L_0x0014;
            case 8: goto L_0x007e;
            default: goto L_0x0011;
        };	 Catch:{ Exception -> 0x0075 }
    L_0x0011:
        r5 = new java.lang.Exception;	 Catch:{ Exception -> 0x0075 }
        goto L_0x006f;	 Catch:{ Exception -> 0x0075 }
    L_0x0014:
        r0 = new java.lang.Exception;	 Catch:{ Exception -> 0x0075 }
        r0.<init>(r5);	 Catch:{ Exception -> 0x0075 }
        throw r0;	 Catch:{ Exception -> 0x0075 }
    L_0x001a:
        r5 = 1;	 Catch:{ Exception -> 0x0075 }
        r5 = r0[r5];	 Catch:{ Exception -> 0x0075 }
        r1 = 3;	 Catch:{ Exception -> 0x0075 }
        r0 = r0[r1];	 Catch:{ Exception -> 0x0075 }
        r1 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0075 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0075 }
        r0 = "name";	 Catch:{ Exception -> 0x0075 }
        r0 = r1.getString(r0);	 Catch:{ Exception -> 0x0075 }
        r2 = "args";	 Catch:{ JSONException -> 0x0032 }
        r1 = r1.getJSONArray(r2);	 Catch:{ JSONException -> 0x0032 }
        goto L_0x0037;
    L_0x0032:
        r1 = new org.json.JSONArray;	 Catch:{ Exception -> 0x0075 }
        r1.<init>();	 Catch:{ Exception -> 0x0075 }
    L_0x0037:
        r2 = "";	 Catch:{ Exception -> 0x0075 }
        r2 = r2.equals(r5);	 Catch:{ Exception -> 0x0075 }
        if (r2 != 0) goto L_0x004d;	 Catch:{ Exception -> 0x0075 }
    L_0x003f:
        r2 = r4.f25629a;	 Catch:{ Exception -> 0x0075 }
        r2 = r2.f21281Z;	 Catch:{ Exception -> 0x0075 }
        r3 = new com.leanplum.a.bk;	 Catch:{ Exception -> 0x0075 }
        r3.<init>(r4, r5);	 Catch:{ Exception -> 0x0075 }
        r2.post(r3);	 Catch:{ Exception -> 0x0075 }
    L_0x004d:
        r5 = r4.f25629a;	 Catch:{ Exception -> 0x0075 }
        r5 = r5.f21277V;	 Catch:{ Exception -> 0x0075 }
        r5.mo6202a(r0, r1);	 Catch:{ Exception -> 0x0075 }
        goto L_0x007e;	 Catch:{ Exception -> 0x0075 }
    L_0x0057:
        r5 = new java.lang.Exception;	 Catch:{ Exception -> 0x0075 }
        r0 = "message type not supported";	 Catch:{ Exception -> 0x0075 }
        r5.<init>(r0);	 Catch:{ Exception -> 0x0075 }
        throw r5;	 Catch:{ Exception -> 0x0075 }
    L_0x005f:
        r5 = r4.f25629a;	 Catch:{ Exception -> 0x0075 }
        r5 = r5.f21280Y;	 Catch:{ Exception -> 0x0075 }
        r0 = "2::";	 Catch:{ Exception -> 0x0075 }
        r5.m25056b(r0);	 Catch:{ Exception -> 0x0075 }
        goto L_0x007e;	 Catch:{ Exception -> 0x0075 }
    L_0x006b:
        r4.mo6208b();	 Catch:{ Exception -> 0x0075 }
        goto L_0x007e;	 Catch:{ Exception -> 0x0075 }
    L_0x006f:
        r0 = "unknown code";	 Catch:{ Exception -> 0x0075 }
        r5.<init>(r0);	 Catch:{ Exception -> 0x0075 }
        throw r5;	 Catch:{ Exception -> 0x0075 }
    L_0x0075:
        r5 = move-exception;
        r0 = r4.f25629a;
        r0.m25150e();
        r4.mo6206a(r5);
    L_0x007e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.r.a(java.lang.String):void");
    }

    /* renamed from: a */
    public void mo6206a(Exception exception) {
        this.f25629a.m25150e();
        this.f25629a.f21277V.mo6201a(exception);
    }

    /* renamed from: a */
    public void mo6205a(int i, String str) {
        this.f25629a.m25150e();
        this.f25629a.f21277V.mo6200a();
    }

    /* renamed from: b */
    public void mo6208b() {
        this.f25629a.f21281Z.postDelayed(new bl(this), (long) this.f25629a.f21279X);
        this.f25629a.f21277V.mo6203b();
    }
}
