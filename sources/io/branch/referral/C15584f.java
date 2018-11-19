package io.branch.referral;

import android.annotation.SuppressLint;
import io.branch.referral.Defines.LinkParam;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.f */
class C15584f extends JSONObject {
    /* renamed from: a */
    private Collection<String> f48198a;
    /* renamed from: b */
    private String f48199b;
    /* renamed from: c */
    private int f48200c;
    /* renamed from: d */
    private String f48201d;
    /* renamed from: e */
    private String f48202e;
    /* renamed from: f */
    private String f48203f;
    /* renamed from: g */
    private String f48204g;
    /* renamed from: h */
    private String f48205h;
    /* renamed from: i */
    private int f48206i;

    /* renamed from: a */
    public void m58335a(Collection<String> collection) throws JSONException {
        if (collection != null) {
            this.f48198a = collection;
            JSONArray jSONArray = new JSONArray();
            for (String put : collection) {
                jSONArray.put(put);
            }
            put(LinkParam.Tags.getKey(), jSONArray);
        }
    }

    /* renamed from: a */
    public Collection<String> m58332a() {
        return this.f48198a;
    }

    /* renamed from: a */
    public void m58334a(String str) throws JSONException {
        if (str != null) {
            this.f48199b = str;
            put(LinkParam.Alias.getKey(), str);
        }
    }

    /* renamed from: b */
    public String m58336b() {
        return this.f48199b;
    }

    /* renamed from: a */
    public void m58333a(int i) throws JSONException {
        if (i != 0) {
            this.f48200c = i;
            put(LinkParam.Type.getKey(), i);
        }
    }

    /* renamed from: c */
    public int m58339c() {
        return this.f48200c;
    }

    /* renamed from: b */
    public void m58337b(int i) throws JSONException {
        if (i > 0) {
            this.f48206i = i;
            put(LinkParam.Duration.getKey(), i);
        }
    }

    /* renamed from: d */
    public int m58341d() {
        return this.f48206i;
    }

    /* renamed from: b */
    public void m58338b(String str) throws JSONException {
        if (str != null) {
            this.f48201d = str;
            put(LinkParam.Channel.getKey(), str);
        }
    }

    /* renamed from: e */
    public String m58343e() {
        return this.f48201d;
    }

    /* renamed from: c */
    public void m58340c(String str) throws JSONException {
        if (str != null) {
            this.f48202e = str;
            put(LinkParam.Feature.getKey(), str);
        }
    }

    /* renamed from: f */
    public String m58345f() {
        return this.f48202e;
    }

    /* renamed from: d */
    public void m58342d(String str) throws JSONException {
        if (str != null) {
            this.f48203f = str;
            put(LinkParam.Stage.getKey(), str);
        }
    }

    /* renamed from: g */
    public String m58347g() {
        return this.f48203f;
    }

    /* renamed from: e */
    public void m58344e(String str) throws JSONException {
        if (str != null) {
            this.f48204g = str;
            put(LinkParam.Campaign.getKey(), str);
        }
    }

    /* renamed from: h */
    public String m58348h() {
        return this.f48204g;
    }

    /* renamed from: f */
    public void m58346f(String str) throws JSONException {
        this.f48205h = str;
        put(LinkParam.Data.getKey(), str);
    }

    /* renamed from: i */
    public String m58349i() {
        return this.f48205h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15584f c15584f = (C15584f) obj;
        if (this.f48199b == null) {
            if (c15584f.f48199b != null) {
                return false;
            }
        } else if (!this.f48199b.equals(c15584f.f48199b)) {
            return false;
        }
        if (this.f48201d == null) {
            if (c15584f.f48201d != null) {
                return false;
            }
        } else if (!this.f48201d.equals(c15584f.f48201d)) {
            return false;
        }
        if (this.f48202e == null) {
            if (c15584f.f48202e != null) {
                return false;
            }
        } else if (!this.f48202e.equals(c15584f.f48202e)) {
            return false;
        }
        if (this.f48205h == null) {
            if (c15584f.f48205h != null) {
                return false;
            }
        } else if (!this.f48205h.equals(c15584f.f48205h)) {
            return false;
        }
        if (this.f48203f == null) {
            if (c15584f.f48203f != null) {
                return false;
            }
        } else if (!this.f48203f.equals(c15584f.f48203f)) {
            return false;
        }
        if (this.f48204g == null) {
            if (c15584f.f48204g != null) {
                return false;
            }
        } else if (!this.f48204g.equals(c15584f.f48204g)) {
            return false;
        }
        if (this.f48200c != c15584f.f48200c || this.f48206i != c15584f.f48206i) {
            return false;
        }
        if (this.f48198a == null) {
            if (c15584f.f48198a != null) {
                return false;
            }
        } else if (this.f48198a.toString().equals(c15584f.f48198a.toString()) == null) {
            return false;
        }
        return true;
    }

    @SuppressLint({"DefaultLocale"})
    public int hashCode() {
        int i;
        int i2 = (this.f48200c + 19) * 19;
        int i3 = 0;
        if (this.f48199b == null) {
            i = 0;
        } else {
            i = this.f48199b.toLowerCase().hashCode();
        }
        i2 = (i2 + i) * 19;
        if (this.f48201d == null) {
            i = 0;
        } else {
            i = this.f48201d.toLowerCase().hashCode();
        }
        i2 = (i2 + i) * 19;
        if (this.f48202e == null) {
            i = 0;
        } else {
            i = this.f48202e.toLowerCase().hashCode();
        }
        i2 = (i2 + i) * 19;
        if (this.f48203f == null) {
            i = 0;
        } else {
            i = this.f48203f.toLowerCase().hashCode();
        }
        i2 = (i2 + i) * 19;
        if (this.f48204g == null) {
            i = 0;
        } else {
            i = this.f48204g.toLowerCase().hashCode();
        }
        i2 = (i2 + i) * 19;
        if (this.f48205h != null) {
            i3 = this.f48205h.toLowerCase().hashCode();
        }
        i2 = ((i2 + i3) * 19) + this.f48206i;
        if (this.f48198a != null) {
            for (String toLowerCase : this.f48198a) {
                i2 = (i2 * 19) + toLowerCase.toLowerCase().hashCode();
            }
        }
        return i2;
    }

    /* renamed from: j */
    public org.json.JSONObject m58350j() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = r3.f48201d;	 Catch:{ JSONException -> 0x0110 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x0110 }
        if (r1 != 0) goto L_0x0029;	 Catch:{ JSONException -> 0x0110 }
    L_0x000d:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Channel;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f48201d;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x0029:
        r1 = r3.f48199b;	 Catch:{ JSONException -> 0x0110 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x0110 }
        if (r1 != 0) goto L_0x004d;	 Catch:{ JSONException -> 0x0110 }
    L_0x0031:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Alias;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f48199b;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x004d:
        r1 = r3.f48202e;	 Catch:{ JSONException -> 0x0110 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x0110 }
        if (r1 != 0) goto L_0x0071;	 Catch:{ JSONException -> 0x0110 }
    L_0x0055:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Feature;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f48202e;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x0071:
        r1 = r3.f48203f;	 Catch:{ JSONException -> 0x0110 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x0110 }
        if (r1 != 0) goto L_0x0095;	 Catch:{ JSONException -> 0x0110 }
    L_0x0079:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Stage;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f48203f;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x0095:
        r1 = r3.f48204g;	 Catch:{ JSONException -> 0x0110 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x0110 }
        if (r1 != 0) goto L_0x00b9;	 Catch:{ JSONException -> 0x0110 }
    L_0x009d:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Campaign;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f48204g;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x00b9:
        r1 = io.branch.referral.Defines.LinkParam.Tags;	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0110 }
        r1 = r3.has(r1);	 Catch:{ JSONException -> 0x0110 }
        if (r1 == 0) goto L_0x00d8;	 Catch:{ JSONException -> 0x0110 }
    L_0x00c5:
        r1 = io.branch.referral.Defines.LinkParam.Tags;	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Tags;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.getJSONArray(r2);	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x00d8:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Type;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f48200c;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Duration;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f48206i;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x0110:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.f.j():org.json.JSONObject");
    }
}
