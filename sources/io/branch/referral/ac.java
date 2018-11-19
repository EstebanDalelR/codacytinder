package io.branch.referral;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

class ac {
    /* renamed from: a */
    private static JSONObject f48187a;
    /* renamed from: d */
    private static ac f48188d;
    /* renamed from: b */
    private final ArrayList<String> f48189b;
    /* renamed from: c */
    private final JSONObject f48190c = new JSONObject();

    /* renamed from: io.branch.referral.ac$a */
    private static class C17304a extends C15582d<Void, Void, JSONObject> {
        /* renamed from: a */
        private final C15593m f52982a;
        /* renamed from: b */
        private final int f52983b;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m63269a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m63270a((JSONObject) obj);
        }

        private C17304a(Context context) {
            this.f52983b = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            this.f52982a = C15593m.m58388a(context);
        }

        /* renamed from: a */
        protected org.json.JSONObject m63269a(java.lang.Void... r7) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = this;
            r7 = new org.json.JSONObject;
            r7.<init>();
            r0 = 0;
            r1 = new java.net.URL;	 Catch:{ Throwable -> 0x0067, all -> 0x005f }
            r2 = "https://cdn.branch.io/sdk/uriskiplist_v#.json";	 Catch:{ Throwable -> 0x0067, all -> 0x005f }
            r3 = "#";	 Catch:{ Throwable -> 0x0067, all -> 0x005f }
            r4 = io.branch.referral.ac.f48187a;	 Catch:{ Throwable -> 0x0067, all -> 0x005f }
            r5 = "version";	 Catch:{ Throwable -> 0x0067, all -> 0x005f }
            r4 = r4.optInt(r5);	 Catch:{ Throwable -> 0x0067, all -> 0x005f }
            r4 = r4 + 1;	 Catch:{ Throwable -> 0x0067, all -> 0x005f }
            r4 = java.lang.Integer.toString(r4);	 Catch:{ Throwable -> 0x0067, all -> 0x005f }
            r2 = r2.replace(r3, r4);	 Catch:{ Throwable -> 0x0067, all -> 0x005f }
            r1.<init>(r2);	 Catch:{ Throwable -> 0x0067, all -> 0x005f }
            r1 = r1.openConnection();	 Catch:{ Throwable -> 0x0067, all -> 0x005f }
            r1 = (javax.net.ssl.HttpsURLConnection) r1;	 Catch:{ Throwable -> 0x0067, all -> 0x005f }
            r0 = 1500; // 0x5dc float:2.102E-42 double:7.41E-321;
            r1.setConnectTimeout(r0);	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            r1.setReadTimeout(r0);	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            r0 = r1.getResponseCode();	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            if (r0 != r2) goto L_0x0057;	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
        L_0x0039:
            r0 = r1.getInputStream();	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            if (r0 == 0) goto L_0x0057;	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
        L_0x003f:
            r0 = new java.io.BufferedReader;	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            r2 = new java.io.InputStreamReader;	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            r3 = r1.getInputStream();	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            r2.<init>(r3);	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            r0.<init>(r2);	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            r2 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            r0 = r0.readLine();	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            r2.<init>(r0);	 Catch:{ Throwable -> 0x0068, all -> 0x005d }
            r7 = r2;
        L_0x0057:
            if (r1 == 0) goto L_0x006b;
        L_0x0059:
            r1.disconnect();
            goto L_0x006b;
        L_0x005d:
            r7 = move-exception;
            goto L_0x0061;
        L_0x005f:
            r7 = move-exception;
            r1 = r0;
        L_0x0061:
            if (r1 == 0) goto L_0x0066;
        L_0x0063:
            r1.disconnect();
        L_0x0066:
            throw r7;
        L_0x0067:
            r1 = r0;
        L_0x0068:
            if (r1 == 0) goto L_0x006b;
        L_0x006a:
            goto L_0x0059;
        L_0x006b:
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ac.a.a(java.lang.Void[]):org.json.JSONObject");
        }

        /* renamed from: a */
        protected void m63270a(JSONObject jSONObject) {
            super.onPostExecute(jSONObject);
            if (jSONObject.optInt("version") > ac.f48187a.optInt("version")) {
                ac.f48187a = jSONObject;
                this.f52982a.m58410a("skip_url_format_key", ac.f48187a.toString());
            }
        }
    }

    /* renamed from: a */
    public static ac m58310a(Context context) {
        if (f48188d == null) {
            f48188d = new ac(context);
        }
        return f48188d;
    }

    private ac(android.content.Context r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.<init>();
        r0 = new org.json.JSONObject;
        r0.<init>();
        r3.f48190c = r0;
        r0 = r3.f48190c;	 Catch:{ JSONException -> 0x0045 }
        r1 = "version";	 Catch:{ JSONException -> 0x0045 }
        r2 = 0;	 Catch:{ JSONException -> 0x0045 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ JSONException -> 0x0045 }
        r0.putOpt(r1, r2);	 Catch:{ JSONException -> 0x0045 }
        r0 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0045 }
        r0.<init>();	 Catch:{ JSONException -> 0x0045 }
        r1 = r3.f48190c;	 Catch:{ JSONException -> 0x0045 }
        r2 = "uri_skip_list";	 Catch:{ JSONException -> 0x0045 }
        r1.putOpt(r2, r0);	 Catch:{ JSONException -> 0x0045 }
        r1 = "^fb\\d+:";	 Catch:{ JSONException -> 0x0045 }
        r0.put(r1);	 Catch:{ JSONException -> 0x0045 }
        r1 = "^li\\d+:";	 Catch:{ JSONException -> 0x0045 }
        r0.put(r1);	 Catch:{ JSONException -> 0x0045 }
        r1 = "^pdk\\d+:";	 Catch:{ JSONException -> 0x0045 }
        r0.put(r1);	 Catch:{ JSONException -> 0x0045 }
        r1 = "^twitterkit-.*:";	 Catch:{ JSONException -> 0x0045 }
        r0.put(r1);	 Catch:{ JSONException -> 0x0045 }
        r1 = "^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth";	 Catch:{ JSONException -> 0x0045 }
        r0.put(r1);	 Catch:{ JSONException -> 0x0045 }
        r1 = "^(?i)(?!(http|https):).*(:|:.*\\b)(password|o?auth|o?auth.?token|access|access.?token)\\b";	 Catch:{ JSONException -> 0x0045 }
        r0.put(r1);	 Catch:{ JSONException -> 0x0045 }
        r1 = "^(?i)((http|https):\\/\\/).*[\\/|?|#].*\\b(password|o?auth|o?auth.?token|access|access.?token)\\b";	 Catch:{ JSONException -> 0x0045 }
        r0.put(r1);	 Catch:{ JSONException -> 0x0045 }
    L_0x0045:
        r4 = r3.m58313c(r4);
        f48187a = r4;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r3.f48189b = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ac.<init>(android.content.Context):void");
    }

    /* renamed from: c */
    private org.json.JSONObject m58313c(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r3 = io.branch.referral.C15593m.m58388a(r3);
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = "skip_url_format_key";
        r3 = r3.m58458v(r1);
        r1 = android.text.TextUtils.isEmpty(r3);
        if (r1 != 0) goto L_0x0025;
    L_0x0015:
        r1 = "bnc_no_value";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0025;
    L_0x001e:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0027 }
        r1.<init>(r3);	 Catch:{ JSONException -> 0x0027 }
        r0 = r1;
        goto L_0x0027;
    L_0x0025:
        r0 = r2.f48190c;
    L_0x0027:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ac.c(android.content.Context):org.json.JSONObject");
    }

    /* renamed from: a */
    void m58314a(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = f48187a;
        r1 = "uri_skip_list";
        r0 = r0.optJSONArray(r1);
        if (r0 != 0) goto L_0x0016;
    L_0x000a:
        r0 = new org.json.JSONArray;	 Catch:{ Exception -> 0x0019 }
        r0.<init>();	 Catch:{ Exception -> 0x0019 }
        r1 = f48187a;	 Catch:{ Exception -> 0x0019 }
        r2 = "uri_skip_list";	 Catch:{ Exception -> 0x0019 }
        r1.put(r2, r0);	 Catch:{ Exception -> 0x0019 }
    L_0x0016:
        r0.put(r4);	 Catch:{ Exception -> 0x0019 }
    L_0x0019:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ac.a(java.lang.String):void");
    }

    /* renamed from: a */
    void m58315a(List<String> list) {
        this.f48189b.addAll(list);
    }

    /* renamed from: b */
    void m58317b(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = new io.branch.referral.ac$a;	 Catch:{ Throwable -> 0x000c }
        r1 = 0;	 Catch:{ Throwable -> 0x000c }
        r0.<init>(r3);	 Catch:{ Throwable -> 0x000c }
        r3 = 0;	 Catch:{ Throwable -> 0x000c }
        r3 = new java.lang.Void[r3];	 Catch:{ Throwable -> 0x000c }
        r0.m58328a(r3);	 Catch:{ Throwable -> 0x000c }
    L_0x000c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ac.b(android.content.Context):void");
    }

    /* renamed from: b */
    java.lang.String m58316b(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = f48187a;	 Catch:{ Exception -> 0x004d }
        r1 = "uri_skip_list";	 Catch:{ Exception -> 0x004d }
        r0 = r0.optJSONArray(r1);	 Catch:{ Exception -> 0x004d }
        if (r0 == 0) goto L_0x0028;	 Catch:{ Exception -> 0x004d }
    L_0x000a:
        r1 = 0;	 Catch:{ Exception -> 0x004d }
    L_0x000b:
        r2 = r0.length();	 Catch:{ Exception -> 0x004d }
        if (r1 >= r2) goto L_0x0028;
    L_0x0011:
        r2 = r0.getString(r1);	 Catch:{ JSONException -> 0x0025 }
        r3 = java.util.regex.Pattern.compile(r2);	 Catch:{ JSONException -> 0x0025 }
        r3 = r3.matcher(r5);	 Catch:{ JSONException -> 0x0025 }
        r3 = r3.find();	 Catch:{ JSONException -> 0x0025 }
        if (r3 == 0) goto L_0x0025;
    L_0x0023:
        r0 = r2;
        goto L_0x0029;
    L_0x0025:
        r1 = r1 + 1;
        goto L_0x000b;
    L_0x0028:
        r0 = 0;
    L_0x0029:
        if (r0 != 0) goto L_0x004c;
    L_0x002b:
        r1 = r4.f48189b;	 Catch:{ Exception -> 0x004d }
        r1 = r1.size();	 Catch:{ Exception -> 0x004d }
        if (r1 <= 0) goto L_0x004d;	 Catch:{ Exception -> 0x004d }
    L_0x0033:
        r1 = r4.f48189b;	 Catch:{ Exception -> 0x004d }
        r1 = r1.iterator();	 Catch:{ Exception -> 0x004d }
    L_0x0039:
        r2 = r1.hasNext();	 Catch:{ Exception -> 0x004d }
        if (r2 == 0) goto L_0x004c;	 Catch:{ Exception -> 0x004d }
    L_0x003f:
        r2 = r1.next();	 Catch:{ Exception -> 0x004d }
        r2 = (java.lang.String) r2;	 Catch:{ Exception -> 0x004d }
        r2 = r5.matches(r2);	 Catch:{ Exception -> 0x004d }
        if (r2 == 0) goto L_0x0039;
    L_0x004b:
        goto L_0x004d;
    L_0x004c:
        r5 = r0;
    L_0x004d:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ac.b(java.lang.String):java.lang.String");
    }
}
