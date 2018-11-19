package io.branch.referral;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: io.branch.referral.m */
public class C15593m {
    /* renamed from: a */
    private static boolean f48253a = false;
    /* renamed from: b */
    private static String f48254b;
    /* renamed from: c */
    private static C15593m f48255c;
    /* renamed from: h */
    private static JSONObject f48256h;
    /* renamed from: d */
    private SharedPreferences f48257d;
    /* renamed from: e */
    private Editor f48258e;
    /* renamed from: f */
    private JSONObject f48259f;
    /* renamed from: g */
    private Context f48260g;

    /* renamed from: a */
    public String m58402a() {
        return "https://api.branch.io/";
    }

    private C15593m(Context context) {
        this.f48257d = context.getSharedPreferences("branch_referral_shared_pref", 0);
        this.f48258e = this.f48257d.edit();
        this.f48260g = context;
        this.f48259f = new JSONObject();
    }

    /* renamed from: a */
    public static C15593m m58388a(Context context) {
        if (f48255c == null) {
            f48255c = new C15593m(context);
        }
        return f48255c;
    }

    /* renamed from: b */
    public int m58412b() {
        return m58420d("bnc_timeout", 5500);
    }

    /* renamed from: c */
    public int m58416c() {
        return m58420d("bnc_retry_count", 3);
    }

    /* renamed from: d */
    public int m58419d() {
        return m58420d("bnc_retry_interval", AdError.NETWORK_ERROR_CODE);
    }

    /* renamed from: a */
    public void m58406a(String str) {
        m58410a("bnc_app_version", str);
    }

    /* renamed from: e */
    public String m58422e() {
        return m58458v("bnc_app_version");
    }

    /* renamed from: b */
    public boolean m58415b(String str) {
        f48254b = str;
        String v = m58458v("bnc_branch_key");
        if (!(str == null || v == null)) {
            if (v.equals(str)) {
                return null;
            }
        }
        m58387K();
        m58410a("bnc_branch_key", str);
        return true;
    }

    /* renamed from: f */
    public String m58425f() {
        if (f48254b == null) {
            f48254b = m58458v("bnc_branch_key");
        }
        return f48254b;
    }

    /* renamed from: a */
    public java.lang.String m58403a(boolean r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        if (r6 == 0) goto L_0x0005;
    L_0x0002:
        r0 = "io.branch.sdk.BranchKey";
        goto L_0x0007;
    L_0x0005:
        r0 = "io.branch.sdk.BranchKey.test";
    L_0x0007:
        if (r6 != 0) goto L_0x000c;
    L_0x0009:
        r5.m58399F();
    L_0x000c:
        r1 = 0;
        r2 = r5.f48260g;	 Catch:{ Exception -> 0x0037 }
        r2 = r2.getPackageManager();	 Catch:{ Exception -> 0x0037 }
        r3 = r5.f48260g;	 Catch:{ Exception -> 0x0037 }
        r3 = r3.getPackageName();	 Catch:{ Exception -> 0x0037 }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x0037 }
        r2 = r2.getApplicationInfo(r3, r4);	 Catch:{ Exception -> 0x0037 }
        r3 = r2.metaData;	 Catch:{ Exception -> 0x0037 }
        if (r3 == 0) goto L_0x0037;	 Catch:{ Exception -> 0x0037 }
    L_0x0023:
        r3 = r2.metaData;	 Catch:{ Exception -> 0x0037 }
        r3 = r3.getString(r0);	 Catch:{ Exception -> 0x0037 }
        if (r3 != 0) goto L_0x0036;
    L_0x002b:
        if (r6 != 0) goto L_0x0036;
    L_0x002d:
        r6 = r2.metaData;	 Catch:{ Exception -> 0x0036 }
        r1 = "io.branch.sdk.BranchKey";	 Catch:{ Exception -> 0x0036 }
        r1 = r6.getString(r1);	 Catch:{ Exception -> 0x0036 }
        goto L_0x0037;
    L_0x0036:
        r1 = r3;
    L_0x0037:
        r6 = android.text.TextUtils.isEmpty(r1);
        if (r6 == 0) goto L_0x0054;
    L_0x003d:
        r6 = r5.f48260g;	 Catch:{ Exception -> 0x0054 }
        r6 = r6.getResources();	 Catch:{ Exception -> 0x0054 }
        r2 = "string";	 Catch:{ Exception -> 0x0054 }
        r3 = r5.f48260g;	 Catch:{ Exception -> 0x0054 }
        r3 = r3.getPackageName();	 Catch:{ Exception -> 0x0054 }
        r0 = r6.getIdentifier(r0, r2, r3);	 Catch:{ Exception -> 0x0054 }
        r6 = r6.getString(r0);	 Catch:{ Exception -> 0x0054 }
        goto L_0x0055;
    L_0x0054:
        r6 = r1;
    L_0x0055:
        if (r6 != 0) goto L_0x0059;
    L_0x0057:
        r6 = "bnc_no_value";
    L_0x0059:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.m.a(boolean):java.lang.String");
    }

    /* renamed from: c */
    public void m58417c(String str) {
        m58410a("bnc_device_fingerprint_id", str);
    }

    /* renamed from: g */
    public String m58427g() {
        return m58458v("bnc_device_fingerprint_id");
    }

    /* renamed from: d */
    public void m58421d(String str) {
        m58410a("bnc_session_id", str);
    }

    /* renamed from: h */
    public String m58429h() {
        return m58458v("bnc_session_id");
    }

    /* renamed from: e */
    public void m58423e(String str) {
        m58410a("bnc_identity_id", str);
    }

    /* renamed from: i */
    public String m58431i() {
        return m58458v("bnc_identity_id");
    }

    /* renamed from: f */
    public void m58426f(String str) {
        m58410a("bnc_identity", str);
    }

    /* renamed from: j */
    public String m58433j() {
        return m58458v("bnc_identity");
    }

    /* renamed from: g */
    public void m58428g(String str) {
        m58410a("bnc_link_click_id", str);
    }

    /* renamed from: k */
    public String m58435k() {
        return m58458v("bnc_link_click_id");
    }

    /* renamed from: a */
    public void m58405a(Boolean bool) {
        m58409a("bnc_triggered_by_fb_app_link", bool);
    }

    /* renamed from: l */
    public boolean m58438l() {
        return m58460w("bnc_triggered_by_fb_app_link");
    }

    /* renamed from: h */
    public void m58430h(String str) {
        m58410a("bnc_external_intent_uri", str);
    }

    /* renamed from: m */
    public String m58439m() {
        return m58458v("bnc_external_intent_uri");
    }

    /* renamed from: i */
    public void m58432i(String str) {
        m58410a("bnc_external_intent_extra", str);
    }

    /* renamed from: n */
    public String m58441n() {
        return m58458v("bnc_external_intent_extra");
    }

    /* renamed from: j */
    public void m58434j(String str) {
        m58410a("bnc_link_click_identifier", str);
    }

    /* renamed from: o */
    public String m58443o() {
        return m58458v("bnc_link_click_identifier");
    }

    /* renamed from: k */
    public void m58436k(String str) {
        m58410a("bnc_google_search_install_identifier", str);
    }

    /* renamed from: p */
    public String m58445p() {
        return m58458v("bnc_google_search_install_identifier");
    }

    /* renamed from: l */
    public void m58437l(String str) {
        m58410a("bnc_google_play_install_referrer_extras", str);
    }

    /* renamed from: q */
    public String m58447q() {
        return m58458v("bnc_google_play_install_referrer_extras");
    }

    /* renamed from: m */
    public void m58440m(String str) {
        m58410a("bnc_app_link", str);
    }

    /* renamed from: r */
    public String m58449r() {
        return m58458v("bnc_app_link");
    }

    /* renamed from: b */
    public void m58414b(boolean z) {
        m58409a("bnc_is_full_app_conversion", Boolean.valueOf(z));
    }

    /* renamed from: s */
    public boolean m58452s() {
        return m58460w("bnc_is_full_app_conversion");
    }

    /* renamed from: n */
    public void m58442n(String str) {
        m58410a("bnc_push_identifier", str);
    }

    /* renamed from: t */
    public String m58454t() {
        return m58458v("bnc_push_identifier");
    }

    /* renamed from: u */
    public String m58456u() {
        return m58458v("bnc_session_params");
    }

    /* renamed from: o */
    public void m58444o(String str) {
        m58410a("bnc_session_params", str);
    }

    /* renamed from: v */
    public String m58457v() {
        return m58458v("bnc_install_params");
    }

    /* renamed from: p */
    public void m58446p(String str) {
        m58410a("bnc_install_params", str);
    }

    /* renamed from: q */
    public void m58448q(String str) {
        m58410a("bnc_install_referrer", str);
    }

    /* renamed from: r */
    public void m58450r(String str) {
        m58410a("bnc_user_url", str);
    }

    /* renamed from: w */
    public String m58459w() {
        return m58458v("bnc_user_url");
    }

    /* renamed from: x */
    public int m58461x() {
        return m58453t("bnc_is_referrable");
    }

    /* renamed from: y */
    public void m58464y() {
        m58424e("bnc_is_referrable", 1);
    }

    /* renamed from: z */
    public void m58465z() {
        m58424e("bnc_is_referrable", 0);
    }

    /* renamed from: A */
    boolean m58394A() {
        return m58460w("bnc_limit_facebook_tracking");
    }

    /* renamed from: B */
    public void m58395B() {
        Iterator it = m58385I().iterator();
        while (it.hasNext()) {
            m58407a((String) it.next(), 0);
        }
        m58389a(new ArrayList());
        it = m58386J().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m58413b(str, 0);
            m58418c(str, 0);
        }
        m58391b(new ArrayList());
    }

    /* renamed from: I */
    private ArrayList<String> m58385I() {
        String v = m58458v("bnc_buckets");
        if (v.equals("bnc_no_value")) {
            return new ArrayList();
        }
        return m58393z(v);
    }

    /* renamed from: a */
    private void m58389a(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            m58410a("bnc_buckets", "bnc_no_value");
        } else {
            m58410a("bnc_buckets", m58392c((ArrayList) arrayList));
        }
    }

    /* renamed from: a */
    public void m58407a(String str, int i) {
        ArrayList I = m58385I();
        if (!I.contains(str)) {
            I.add(str);
            m58389a(I);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bnc_credit_base_");
        stringBuilder.append(str);
        m58424e(stringBuilder.toString(), i);
    }

    /* renamed from: s */
    public int m58451s(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bnc_credit_base_");
        stringBuilder.append(str);
        return m58453t(stringBuilder.toString());
    }

    /* renamed from: J */
    private ArrayList<String> m58386J() {
        String v = m58458v("bnc_actions");
        if (v.equals("bnc_no_value")) {
            return new ArrayList();
        }
        return m58393z(v);
    }

    /* renamed from: b */
    private void m58391b(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            m58410a("bnc_actions", "bnc_no_value");
        } else {
            m58410a("bnc_actions", m58392c((ArrayList) arrayList));
        }
    }

    /* renamed from: b */
    public void m58413b(String str, int i) {
        ArrayList J = m58386J();
        if (!J.contains(str)) {
            J.add(str);
            m58391b(J);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bnc_total_base_");
        stringBuilder.append(str);
        m58424e(stringBuilder.toString(), i);
    }

    /* renamed from: c */
    public void m58418c(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bnc_balance_base_");
        stringBuilder.append(str);
        m58424e(stringBuilder.toString(), i);
    }

    /* renamed from: c */
    private String m58392c(ArrayList<String> arrayList) {
        String str = "";
        arrayList = arrayList.iterator();
        while (arrayList.hasNext()) {
            String str2 = (String) arrayList.next();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append(",");
            str = stringBuilder.toString();
        }
        return str.substring(null, str.length() - 1);
    }

    /* renamed from: z */
    private ArrayList<String> m58393z(String str) {
        Object arrayList = new ArrayList();
        Collections.addAll(arrayList, str.split(","));
        return arrayList;
    }

    /* renamed from: t */
    public int m58453t(String str) {
        return m58420d(str, 0);
    }

    /* renamed from: d */
    public int m58420d(String str, int i) {
        return f48255c.f48257d.getInt(str, i);
    }

    /* renamed from: u */
    public long m58455u(String str) {
        return f48255c.f48257d.getLong(str, 0);
    }

    /* renamed from: v */
    public String m58458v(String str) {
        return f48255c.f48257d.getString(str, "bnc_no_value");
    }

    /* renamed from: w */
    public boolean m58460w(String str) {
        return f48255c.f48257d.getBoolean(str, false);
    }

    /* renamed from: e */
    public void m58424e(String str, int i) {
        f48255c.f48258e.putInt(str, i);
        f48255c.f48258e.apply();
    }

    /* renamed from: a */
    public void m58408a(String str, long j) {
        f48255c.f48258e.putLong(str, j);
        f48255c.f48258e.apply();
    }

    /* renamed from: a */
    public void m58410a(String str, String str2) {
        f48255c.f48258e.putString(str, str2);
        f48255c.f48258e.apply();
    }

    /* renamed from: a */
    public void m58409a(String str, Boolean bool) {
        f48255c.f48258e.putBoolean(str, bool.booleanValue());
        f48255c.f48258e.apply();
    }

    /* renamed from: x */
    public void m58462x(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bnc_branch_view_use_");
        stringBuilder.append(str);
        m58424e(stringBuilder.toString(), m58463y(str) + 1);
    }

    /* renamed from: y */
    public int m58463y(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bnc_branch_view_use_");
        stringBuilder.append(str);
        return m58420d(stringBuilder.toString(), 0);
    }

    /* renamed from: C */
    public org.json.JSONObject m58396C() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = f48256h;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0 = f48256h;
        goto L_0x0028;
    L_0x0007:
        r0 = "bnc_branch_analytical_data";
        r0 = r3.m58458v(r0);
        r1 = new org.json.JSONObject;
        r1.<init>();
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x0027;
    L_0x0018:
        r2 = "bnc_no_value";
        r2 = r0.equals(r2);
        if (r2 != 0) goto L_0x0027;
    L_0x0020:
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0027 }
        r2.<init>(r0);	 Catch:{ JSONException -> 0x0027 }
        r0 = r2;
        goto L_0x0028;
    L_0x0027:
        r0 = r1;
    L_0x0028:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.m.C():org.json.JSONObject");
    }

    /* renamed from: D */
    public void m58397D() {
        f48256h = null;
        m58410a("bnc_branch_analytical_data", "");
    }

    /* renamed from: a */
    public void m58411a(org.json.JSONObject r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.m58429h();
        r1 = "bnc_no_value";
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x003e;
    L_0x000c:
        r1 = f48256h;
        if (r1 != 0) goto L_0x0016;
    L_0x0010:
        r1 = r3.m58396C();
        f48256h = r1;
    L_0x0016:
        r1 = f48256h;	 Catch:{ JSONException -> 0x003e }
        r1 = r1.has(r0);	 Catch:{ JSONException -> 0x003e }
        if (r1 == 0) goto L_0x0025;	 Catch:{ JSONException -> 0x003e }
    L_0x001e:
        r1 = f48256h;	 Catch:{ JSONException -> 0x003e }
        r0 = r1.getJSONArray(r0);	 Catch:{ JSONException -> 0x003e }
        goto L_0x0030;	 Catch:{ JSONException -> 0x003e }
    L_0x0025:
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x003e }
        r1.<init>();	 Catch:{ JSONException -> 0x003e }
        r2 = f48256h;	 Catch:{ JSONException -> 0x003e }
        r2.put(r0, r1);	 Catch:{ JSONException -> 0x003e }
        r0 = r1;	 Catch:{ JSONException -> 0x003e }
    L_0x0030:
        r0.put(r4);	 Catch:{ JSONException -> 0x003e }
        r4 = "bnc_branch_analytical_data";	 Catch:{ JSONException -> 0x003e }
        r0 = f48256h;	 Catch:{ JSONException -> 0x003e }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x003e }
        r3.m58410a(r4, r0);	 Catch:{ JSONException -> 0x003e }
    L_0x003e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.m.a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public void m58404a(long j) {
        m58408a("bnc_branch_strong_match_time", j);
    }

    /* renamed from: E */
    public long m58398E() {
        return m58455u("bnc_branch_strong_match_time");
    }

    /* renamed from: K */
    private void m58387K() {
        String k = m58435k();
        String o = m58443o();
        String r = m58449r();
        String t = m58454t();
        this.f48258e.clear();
        m58428g(k);
        m58434j(o);
        m58440m(r);
        m58442n(t);
        f48255c.f48258e.apply();
    }

    /* renamed from: F */
    public void m58399F() {
        f48253a = true;
    }

    /* renamed from: G */
    public boolean m58400G() {
        return f48253a;
    }

    /* renamed from: H */
    public JSONObject m58401H() {
        return this.f48259f;
    }

    /* renamed from: b */
    public static void m58390b(String str, String str2) {
        if ((Branch.f12572b == null && f48253a) || (Branch.f12572b != null && Branch.f12572b.booleanValue())) {
            if (str2 != null) {
                Log.i(str, str2);
            } else {
                Log.i(str, "An error occurred. Unable to print the log message");
            }
        }
    }
}
