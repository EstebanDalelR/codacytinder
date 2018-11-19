package com.google.android.m4b.maps.ay;

import android.util.Log;
import com.google.android.m4b.maps.p101a.C4522h;
import com.google.android.m4b.maps.p101a.C4525k;
import com.google.android.m4b.maps.p101a.C4529m;
import com.google.android.m4b.maps.p101a.C4530n;
import com.google.android.m4b.maps.p101a.C4532r;
import com.google.android.m4b.maps.p125y.C5569h;

/* renamed from: com.google.android.m4b.maps.ay.t */
public class C6415t implements C4530n {
    /* renamed from: a */
    private static final String f23812a = "t";

    /* renamed from: a */
    public void mo4769a(C4525k<?> c4525k, C4529m<?> c4529m) {
        if (C4728u.m21050a(f23812a, 3)) {
            String str = f23812a;
            c4525k = C6415t.m28026a((C4525k) c4525k);
            c4529m = C6415t.m28027a((C4529m) c4529m);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(c4525k).length() + 20) + String.valueOf(c4529m).length());
            stringBuilder.append("REQUEST: ");
            stringBuilder.append(c4525k);
            stringBuilder.append("\nRESPONSE: ");
            stringBuilder.append(c4529m);
            Log.d(str, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void mo4770a(C4525k<?> c4525k, C4529m<?> c4529m, Runnable runnable) {
        if (C4728u.m21050a(f23812a, 3) != null) {
            runnable = f23812a;
            c4525k = C6415t.m28026a((C4525k) c4525k);
            c4529m = C6415t.m28027a((C4529m) c4529m);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(c4525k).length() + 20) + String.valueOf(c4529m).length());
            stringBuilder.append("REQUEST: ");
            stringBuilder.append(c4525k);
            stringBuilder.append("\nRESPONSE: ");
            stringBuilder.append(c4529m);
            Log.d(runnable, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void mo4771a(C4525k<?> c4525k, C4532r c4532r) {
        if (C4728u.m21050a(f23812a, 3)) {
            String str = f23812a;
            c4525k = C6415t.m28026a((C4525k) c4525k);
            c4532r = C6415t.m28028a(c4532r);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(c4525k).length() + 17) + String.valueOf(c4532r).length());
            stringBuilder.append("REQUEST: ");
            stringBuilder.append(c4525k);
            stringBuilder.append("\nERROR: ");
            stringBuilder.append(c4532r);
            Log.d(str, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static java.lang.String m28026a(com.google.android.m4b.maps.p101a.C4525k<?> r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r6.mo4889k();	 Catch:{ a -> 0x0023 }
        if (r0 != 0) goto L_0x0009;	 Catch:{ a -> 0x0023 }
    L_0x0006:
        r0 = "<empty>";	 Catch:{ a -> 0x0023 }
        goto L_0x0025;	 Catch:{ a -> 0x0023 }
    L_0x0009:
        r0 = r0.length;	 Catch:{ a -> 0x0023 }
        r1 = new java.lang.StringBuilder;	 Catch:{ a -> 0x0023 }
        r2 = 19;	 Catch:{ a -> 0x0023 }
        r1.<init>(r2);	 Catch:{ a -> 0x0023 }
        r2 = "[";	 Catch:{ a -> 0x0023 }
        r1.append(r2);	 Catch:{ a -> 0x0023 }
        r1.append(r0);	 Catch:{ a -> 0x0023 }
        r0 = " bytes]";	 Catch:{ a -> 0x0023 }
        r1.append(r0);	 Catch:{ a -> 0x0023 }
        r0 = r1.toString();	 Catch:{ a -> 0x0023 }
        goto L_0x0025;
    L_0x0023:
        r0 = "[Error retrieving body]";
    L_0x0025:
        r1 = r6.mo4887h();	 Catch:{ a -> 0x002e }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ a -> 0x002e }
        goto L_0x0030;
    L_0x002e:
        r1 = "[Error retriving headers]";
    L_0x0030:
        r2 = com.google.android.m4b.maps.p125y.C5569h.m24283a(r6);
        r3 = "URL";
        r4 = r6.m20434c();
        r2 = r2.m24281a(r3, r4);
        r3 = "Headers";
        r1 = r2.m24281a(r3, r1);
        r2 = "Method";
        r3 = r6.m20422a();
        switch(r3) {
            case 0: goto L_0x0069;
            case 1: goto L_0x0066;
            default: goto L_0x004d;
        };
    L_0x004d:
        r4 = new java.lang.StringBuilder;
        r5 = 13;
        r4.<init>(r5);
        r5 = "(";
        r4.append(r5);
        r4.append(r3);
        r3 = ")";
        r4.append(r3);
        r3 = r4.toString();
        goto L_0x006b;
    L_0x0066:
        r3 = "POST";
        goto L_0x006b;
    L_0x0069:
        r3 = "GET";
    L_0x006b:
        r1 = r1.m24281a(r2, r3);
        r2 = "Body";
        r0 = r1.m24281a(r2, r0);
        r1 = "BodyContentType";
        r6 = r6.mo4888j();
        r6 = r0.m24281a(r1, r6);
        r6 = r6.toString();
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.t.a(com.google.android.m4b.maps.a.k):java.lang.String");
    }

    /* renamed from: a */
    private static String m28027a(C4529m<?> c4529m) {
        if (c4529m.m20456a()) {
            return "Response{OK}";
        }
        c4529m = C6415t.m28028a(c4529m.f16835c);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(c4529m).length() + 16);
        stringBuilder.append("Response{Error=");
        stringBuilder.append(c4529m);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m28028a(C4532r c4532r) {
        C4522h c4522h = c4532r.f16841a;
        if (c4522h != null) {
            Object obj;
            byte[] bArr = c4522h.f16797b;
            c4532r = C5569h.m24283a(c4532r).m24279a("ResponseCode", c4522h.f16796a).m24281a("Headers", String.valueOf(c4522h.f16798c));
            String str = "Data";
            if (bArr == null) {
                obj = "<empty>";
            } else {
                int length = bArr.length;
                StringBuilder stringBuilder = new StringBuilder(19);
                stringBuilder.append("[");
                stringBuilder.append(length);
                stringBuilder.append(" bytes]");
                obj = stringBuilder.toString();
            }
            return c4532r.m24281a(str, obj).toString();
        }
        c4532r = String.valueOf(c4532r.getMessage());
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(c4532r).length() + 15);
        stringBuilder2.append("VolleyError(\"");
        stringBuilder2.append(c4532r);
        stringBuilder2.append("\")");
        return stringBuilder2.toString();
    }
}
