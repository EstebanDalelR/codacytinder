package com.facebook.accountkit.internal;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.AccountKitException;
import com.facebook.accountkit.LoggingBehavior;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.accountkit.internal.f */
final class C1227f {
    /* renamed from: a */
    private static final C1226a f3278a = new C1226a(Callback.DEFAULT_DRAG_ANIMATION_DURATION, 299);
    /* renamed from: b */
    private final HttpURLConnection f3279b;
    /* renamed from: c */
    private final C1228g f3280c;
    /* renamed from: d */
    private final String f3281d;
    /* renamed from: e */
    private final AccountKitGraphRequest f3282e;
    /* renamed from: f */
    private final JSONArray f3283f;
    /* renamed from: g */
    private final JSONObject f3284g;

    /* renamed from: com.facebook.accountkit.internal.f$a */
    private static final class C1226a {
        /* renamed from: a */
        private final int f3276a;
        /* renamed from: b */
        private final int f3277b;

        private C1226a(int i, int i2) {
            this.f3277b = i;
            this.f3276a = i2;
        }

        /* renamed from: a */
        public boolean m4328a(int i) {
            return this.f3277b <= i && i <= this.f3276a;
        }
    }

    public C1227f(AccountKitGraphRequest accountKitGraphRequest, HttpURLConnection httpURLConnection, C1228g c1228g) {
        this(accountKitGraphRequest, httpURLConnection, null, null, null, c1228g);
    }

    private C1227f(AccountKitGraphRequest accountKitGraphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, C1228g c1228g) {
        this.f3282e = accountKitGraphRequest;
        this.f3279b = httpURLConnection;
        this.f3281d = str;
        this.f3284g = jSONObject;
        this.f3283f = jSONArray;
        this.f3280c = c1228g;
    }

    /* renamed from: a */
    public C1228g m4333a() {
        return this.f3280c;
    }

    /* renamed from: b */
    public JSONObject m4334b() {
        return this.f3284g;
    }

    /* renamed from: a */
    static C1227f m4331a(HttpURLConnection httpURLConnection, AccountKitGraphRequest accountKitGraphRequest) {
        C1227f c1227f = 0;
        Closeable closeable = null;
        C1227f a;
        try {
            InputStream errorStream;
            if (httpURLConnection.getResponseCode() >= 400) {
                errorStream = httpURLConnection.getErrorStream();
            } else {
                errorStream = httpURLConnection.getInputStream();
            }
            closeable = errorStream;
            a = C1227f.m4330a((InputStream) closeable, httpURLConnection, accountKitGraphRequest);
            return a;
        } catch (AccountKitException e) {
            a = e;
            C1229h.m4343a(LoggingBehavior.REQUESTS, "AccountKitGraphResponse", "Response <ERROR>: %s", a);
            c1227f = new C1227f(accountKitGraphRequest, httpURLConnection, new C1228g(a));
            return c1227f;
        } catch (JSONException e2) {
            a = e2;
            C1229h.m4343a(LoggingBehavior.REQUESTS, "AccountKitGraphResponse", "Response <ERROR>: %s", a);
            c1227f = new C1227f(accountKitGraphRequest, httpURLConnection, new C1228g(new AccountKitException(Type.SERVER_ERROR, (Throwable) a)));
            return c1227f;
        } finally {
            C1251w.m4491a(closeable);
        }
    }

    /* renamed from: a */
    private static C1227f m4330a(InputStream inputStream, HttpURLConnection httpURLConnection, AccountKitGraphRequest accountKitGraphRequest) throws AccountKitException, JSONException, IOException {
        C1229h.m4343a(LoggingBehavior.REQUESTS, "AccountKitGraphResponse", "Response:\n%s\n", C1251w.m4486a(inputStream));
        inputStream = new JSONTokener(inputStream).nextValue();
        try {
            Object jSONObject = new JSONObject();
            jSONObject.put("body", inputStream);
            jSONObject.put("code", httpURLConnection != null ? httpURLConnection.getResponseCode() : Callback.DEFAULT_DRAG_ANIMATION_DURATION);
            return C1227f.m4329a(accountKitGraphRequest, httpURLConnection, jSONObject);
        } catch (Throwable e) {
            return new C1227f(accountKitGraphRequest, httpURLConnection, new C1228g(new AccountKitException(Type.INTERNAL_ERROR, InternalAccountKitError.INVALID_GRAPH_RESPONSE, e)));
        }
    }

    /* renamed from: a */
    private static com.facebook.accountkit.internal.C1228g m4332a(org.json.JSONObject r10) {
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
        r0 = 0;
        r1 = "code";	 Catch:{ JSONException -> 0x00a6 }
        r1 = r10.has(r1);	 Catch:{ JSONException -> 0x00a6 }
        if (r1 == 0) goto L_0x00a6;	 Catch:{ JSONException -> 0x00a6 }
    L_0x0009:
        r1 = "code";	 Catch:{ JSONException -> 0x00a6 }
        r3 = r10.getInt(r1);	 Catch:{ JSONException -> 0x00a6 }
        r1 = "body";	 Catch:{ JSONException -> 0x00a6 }
        r10 = com.facebook.accountkit.internal.C1251w.m4485a(r10, r1);	 Catch:{ JSONException -> 0x00a6 }
        if (r10 == 0) goto L_0x0091;	 Catch:{ JSONException -> 0x00a6 }
    L_0x0017:
        r1 = r10 instanceof org.json.JSONObject;	 Catch:{ JSONException -> 0x00a6 }
        if (r1 == 0) goto L_0x0091;	 Catch:{ JSONException -> 0x00a6 }
    L_0x001b:
        r10 = (org.json.JSONObject) r10;	 Catch:{ JSONException -> 0x00a6 }
        r1 = 0;	 Catch:{ JSONException -> 0x00a6 }
        r2 = "error";	 Catch:{ JSONException -> 0x00a6 }
        r2 = r10.has(r2);	 Catch:{ JSONException -> 0x00a6 }
        r4 = 1;	 Catch:{ JSONException -> 0x00a6 }
        r5 = -1;	 Catch:{ JSONException -> 0x00a6 }
        if (r2 == 0) goto L_0x0052;	 Catch:{ JSONException -> 0x00a6 }
    L_0x0028:
        r1 = "error";	 Catch:{ JSONException -> 0x00a6 }
        r10 = com.facebook.accountkit.internal.C1251w.m4485a(r10, r1);	 Catch:{ JSONException -> 0x00a6 }
        r10 = (org.json.JSONObject) r10;	 Catch:{ JSONException -> 0x00a6 }
        r1 = "type";	 Catch:{ JSONException -> 0x00a6 }
        r1 = r10.optString(r1, r0);	 Catch:{ JSONException -> 0x00a6 }
        r2 = "message";	 Catch:{ JSONException -> 0x00a6 }
        r2 = r10.optString(r2, r0);	 Catch:{ JSONException -> 0x00a6 }
        r6 = "error_user_msg";	 Catch:{ JSONException -> 0x00a6 }
        r6 = r10.optString(r6);	 Catch:{ JSONException -> 0x00a6 }
        r7 = "code";	 Catch:{ JSONException -> 0x00a6 }
        r7 = r10.optInt(r7, r5);	 Catch:{ JSONException -> 0x00a6 }
        r8 = "error_subcode";	 Catch:{ JSONException -> 0x00a6 }
        r10 = r10.optInt(r8, r5);	 Catch:{ JSONException -> 0x00a6 }
        r5 = r10;	 Catch:{ JSONException -> 0x00a6 }
        r8 = r6;	 Catch:{ JSONException -> 0x00a6 }
        r10 = r7;	 Catch:{ JSONException -> 0x00a6 }
        goto L_0x0084;	 Catch:{ JSONException -> 0x00a6 }
    L_0x0052:
        r2 = "error_code";	 Catch:{ JSONException -> 0x00a6 }
        r2 = r10.has(r2);	 Catch:{ JSONException -> 0x00a6 }
        if (r2 != 0) goto L_0x0071;	 Catch:{ JSONException -> 0x00a6 }
    L_0x005a:
        r2 = "error_msg";	 Catch:{ JSONException -> 0x00a6 }
        r2 = r10.has(r2);	 Catch:{ JSONException -> 0x00a6 }
        if (r2 != 0) goto L_0x0071;	 Catch:{ JSONException -> 0x00a6 }
    L_0x0062:
        r2 = "error_reason";	 Catch:{ JSONException -> 0x00a6 }
        r2 = r10.has(r2);	 Catch:{ JSONException -> 0x00a6 }
        if (r2 == 0) goto L_0x006b;	 Catch:{ JSONException -> 0x00a6 }
    L_0x006a:
        goto L_0x0071;	 Catch:{ JSONException -> 0x00a6 }
    L_0x006b:
        r6 = r0;	 Catch:{ JSONException -> 0x00a6 }
        r7 = r6;	 Catch:{ JSONException -> 0x00a6 }
        r8 = r7;	 Catch:{ JSONException -> 0x00a6 }
        r10 = -1;	 Catch:{ JSONException -> 0x00a6 }
        r4 = 0;	 Catch:{ JSONException -> 0x00a6 }
        goto L_0x0086;	 Catch:{ JSONException -> 0x00a6 }
    L_0x0071:
        r1 = "error_reason";	 Catch:{ JSONException -> 0x00a6 }
        r1 = r10.optString(r1, r0);	 Catch:{ JSONException -> 0x00a6 }
        r2 = "error_msg";	 Catch:{ JSONException -> 0x00a6 }
        r2 = r10.optString(r2, r0);	 Catch:{ JSONException -> 0x00a6 }
        r6 = "error_code";	 Catch:{ JSONException -> 0x00a6 }
        r10 = r10.optInt(r6, r5);	 Catch:{ JSONException -> 0x00a6 }
        r8 = r0;	 Catch:{ JSONException -> 0x00a6 }
    L_0x0084:
        r6 = r1;	 Catch:{ JSONException -> 0x00a6 }
        r7 = r2;	 Catch:{ JSONException -> 0x00a6 }
    L_0x0086:
        if (r4 == 0) goto L_0x0091;	 Catch:{ JSONException -> 0x00a6 }
    L_0x0088:
        r1 = new com.facebook.accountkit.internal.g;	 Catch:{ JSONException -> 0x00a6 }
        r9 = 0;	 Catch:{ JSONException -> 0x00a6 }
        r2 = r1;	 Catch:{ JSONException -> 0x00a6 }
        r4 = r10;	 Catch:{ JSONException -> 0x00a6 }
        r2.<init>(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ JSONException -> 0x00a6 }
        return r1;	 Catch:{ JSONException -> 0x00a6 }
    L_0x0091:
        r10 = f3278a;	 Catch:{ JSONException -> 0x00a6 }
        r10 = r10.m4328a(r3);	 Catch:{ JSONException -> 0x00a6 }
        if (r10 != 0) goto L_0x00a6;	 Catch:{ JSONException -> 0x00a6 }
    L_0x0099:
        r10 = new com.facebook.accountkit.internal.g;	 Catch:{ JSONException -> 0x00a6 }
        r4 = -1;	 Catch:{ JSONException -> 0x00a6 }
        r5 = -1;	 Catch:{ JSONException -> 0x00a6 }
        r6 = 0;	 Catch:{ JSONException -> 0x00a6 }
        r7 = 0;	 Catch:{ JSONException -> 0x00a6 }
        r8 = 0;	 Catch:{ JSONException -> 0x00a6 }
        r9 = 0;	 Catch:{ JSONException -> 0x00a6 }
        r2 = r10;	 Catch:{ JSONException -> 0x00a6 }
        r2.<init>(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ JSONException -> 0x00a6 }
        return r10;
    L_0x00a6:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.f.a(org.json.JSONObject):com.facebook.accountkit.internal.g");
    }

    /* renamed from: a */
    private static C1227f m4329a(AccountKitGraphRequest accountKitGraphRequest, HttpURLConnection httpURLConnection, Object obj) {
        try {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                C1228g a = C1227f.m4332a(jSONObject);
                if (a != null) {
                    return new C1227f(accountKitGraphRequest, httpURLConnection, a);
                }
                obj = C1251w.m4485a(jSONObject, "body");
                if (obj instanceof JSONObject) {
                    return new C1227f(accountKitGraphRequest, httpURLConnection, obj.toString(), (JSONObject) obj, null, null);
                } else if (obj instanceof JSONArray) {
                    return new C1227f(accountKitGraphRequest, httpURLConnection, obj.toString(), null, (JSONArray) obj, null);
                } else {
                    obj = JSONObject.NULL;
                }
            }
            if (obj == JSONObject.NULL) {
                return new C1227f(accountKitGraphRequest, httpURLConnection, obj.toString(), null, null, null);
            }
            throw new AccountKitException(Type.INTERNAL_ERROR, InternalAccountKitError.UNEXPECTED_OBJECT_TYPE_RESPONSE, obj.getClass().getSimpleName());
        } catch (Throwable e) {
            return new C1227f(accountKitGraphRequest, httpURLConnection, new C1228g(new AccountKitException(Type.INTERNAL_ERROR, InternalAccountKitError.INVALID_GRAPH_RESPONSE, e)));
        }
    }

    public java.lang.String toString() {
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
        r5 = this;
        r0 = java.util.Locale.US;	 Catch:{ IOException -> 0x0020 }
        r1 = "%d";	 Catch:{ IOException -> 0x0020 }
        r2 = 1;	 Catch:{ IOException -> 0x0020 }
        r2 = new java.lang.Object[r2];	 Catch:{ IOException -> 0x0020 }
        r3 = 0;	 Catch:{ IOException -> 0x0020 }
        r4 = r5.f3279b;	 Catch:{ IOException -> 0x0020 }
        if (r4 == 0) goto L_0x0013;	 Catch:{ IOException -> 0x0020 }
    L_0x000c:
        r4 = r5.f3279b;	 Catch:{ IOException -> 0x0020 }
        r4 = r4.getResponseCode();	 Catch:{ IOException -> 0x0020 }
        goto L_0x0015;	 Catch:{ IOException -> 0x0020 }
    L_0x0013:
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ IOException -> 0x0020 }
    L_0x0015:
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ IOException -> 0x0020 }
        r2[r3] = r4;	 Catch:{ IOException -> 0x0020 }
        r0 = java.lang.String.format(r0, r1, r2);	 Catch:{ IOException -> 0x0020 }
        goto L_0x0022;
    L_0x0020:
        r0 = "unknown";
    L_0x0022:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "{Response:  responseCode: ";
        r1.append(r2);
        r1.append(r0);
        r0 = ", responseObject: ";
        r1.append(r0);
        r0 = r5.f3284g;
        r1.append(r0);
        r0 = ", error: ";
        r1.append(r0);
        r0 = r5.f3280c;
        r1.append(r0);
        r0 = "}";
        r1.append(r0);
        r0 = r1.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.f.toString():java.lang.String");
    }
}
