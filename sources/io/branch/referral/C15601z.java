package io.branch.referral;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.branch.referral.z */
public class C15601z {
    /* renamed from: a */
    private int f48293a;
    /* renamed from: b */
    private String f48294b;
    /* renamed from: c */
    private Object f48295c;

    public C15601z(String str, int i) {
        this.f48294b = str;
        this.f48293a = i;
    }

    /* renamed from: a */
    public int m58526a() {
        return this.f48293a;
    }

    /* renamed from: a */
    public void m58527a(Object obj) {
        this.f48295c = obj;
    }

    /* renamed from: b */
    public JSONObject m58528b() {
        if (this.f48295c instanceof JSONObject) {
            return (JSONObject) this.f48295c;
        }
        return new JSONObject();
    }

    /* renamed from: c */
    public JSONArray m58529c() {
        return this.f48295c instanceof JSONArray ? (JSONArray) this.f48295c : null;
    }

    /* renamed from: d */
    public java.lang.String m58530d() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = "";
        r1 = r4.m58528b();	 Catch:{ Exception -> 0x0049 }
        if (r1 == 0) goto L_0x0049;	 Catch:{ Exception -> 0x0049 }
    L_0x0008:
        r2 = "error";	 Catch:{ Exception -> 0x0049 }
        r2 = r1.has(r2);	 Catch:{ Exception -> 0x0049 }
        if (r2 == 0) goto L_0x0049;	 Catch:{ Exception -> 0x0049 }
    L_0x0010:
        r2 = "error";	 Catch:{ Exception -> 0x0049 }
        r2 = r1.getJSONObject(r2);	 Catch:{ Exception -> 0x0049 }
        r3 = "message";	 Catch:{ Exception -> 0x0049 }
        r2 = r2.has(r3);	 Catch:{ Exception -> 0x0049 }
        if (r2 == 0) goto L_0x0049;	 Catch:{ Exception -> 0x0049 }
    L_0x001e:
        r2 = "error";	 Catch:{ Exception -> 0x0049 }
        r1 = r1.getJSONObject(r2);	 Catch:{ Exception -> 0x0049 }
        r2 = "message";	 Catch:{ Exception -> 0x0049 }
        r1 = r1.getString(r2);	 Catch:{ Exception -> 0x0049 }
        if (r1 == 0) goto L_0x0048;
    L_0x002c:
        r0 = r1.trim();	 Catch:{ Exception -> 0x0048 }
        r0 = r0.length();	 Catch:{ Exception -> 0x0048 }
        if (r0 <= 0) goto L_0x0048;	 Catch:{ Exception -> 0x0048 }
    L_0x0036:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0048 }
        r0.<init>();	 Catch:{ Exception -> 0x0048 }
        r0.append(r1);	 Catch:{ Exception -> 0x0048 }
        r2 = ".";	 Catch:{ Exception -> 0x0048 }
        r0.append(r2);	 Catch:{ Exception -> 0x0048 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0048 }
        goto L_0x0049;
    L_0x0048:
        r0 = r1;
    L_0x0049:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.z.d():java.lang.String");
    }
}
