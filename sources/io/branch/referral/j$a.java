package io.branch.referral;

import org.json.JSONArray;
import org.json.JSONObject;

public class j$a {
    /* renamed from: a */
    private final JSONObject f48235a;

    public j$a(org.json.JSONObject r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r2.<init>();
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0012 }
        r3 = r3.toString();	 Catch:{ JSONException -> 0x0012 }
        r1.<init>(r3);	 Catch:{ JSONException -> 0x0012 }
        r0 = r1;
    L_0x0012:
        r2.f48235a = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.j$a.<init>(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public JSONObject m58367a() {
        return this.f48235a;
    }

    /* renamed from: a */
    public Integer m58365a(String str, Integer num) {
        if (!this.f48235a.has(str)) {
            return num;
        }
        num = Integer.valueOf(this.f48235a.optInt(str));
        this.f48235a.remove(str);
        return num;
    }

    /* renamed from: a */
    public String m58366a(String str) {
        String optString = this.f48235a.optString(str);
        this.f48235a.remove(str);
        return optString;
    }

    /* renamed from: b */
    public long m58368b(String str) {
        long optLong = this.f48235a.optLong(str);
        this.f48235a.remove(str);
        return optLong;
    }

    /* renamed from: a */
    public Double m58364a(String str, Double d) {
        if (!this.f48235a.has(str)) {
            return d;
        }
        d = Double.valueOf(this.f48235a.optDouble(str));
        this.f48235a.remove(str);
        return d;
    }

    /* renamed from: c */
    public boolean m58369c(String str) {
        boolean optBoolean = this.f48235a.optBoolean(str);
        this.f48235a.remove(str);
        return optBoolean;
    }

    /* renamed from: d */
    public JSONArray m58370d(String str) {
        JSONArray optJSONArray = this.f48235a.optJSONArray(str);
        this.f48235a.remove(str);
        return optJSONArray;
    }

    /* renamed from: e */
    public Object m58371e(String str) {
        Object opt = this.f48235a.opt(str);
        this.f48235a.remove(str);
        return opt;
    }
}
