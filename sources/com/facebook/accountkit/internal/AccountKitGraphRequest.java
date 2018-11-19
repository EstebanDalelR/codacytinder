package com.facebook.accountkit.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.TrafficStats;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.util.Log;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.AccountKitException;
import com.facebook.accountkit.LoggingBehavior;
import com.tinder.api.ManagerWebServices;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

final class AccountKitGraphRequest {
    /* renamed from: a */
    public static final String f3191a = "AccountKitGraphRequest";
    /* renamed from: b */
    private static final Pattern f3192b = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    /* renamed from: c */
    private AccessToken f3193c;
    /* renamed from: d */
    private Handler f3194d;
    /* renamed from: e */
    private final String f3195e;
    /* renamed from: f */
    private HttpMethod f3196f;
    /* renamed from: g */
    private final boolean f3197g;
    /* renamed from: h */
    private Bundle f3198h;
    /* renamed from: i */
    private JSONObject f3199i;
    /* renamed from: j */
    private Object f3200j;
    /* renamed from: k */
    private String f3201k;

    public interface Callback {
        void onCompleted(C1227f c1227f);
    }

    private static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Creator<ParcelableResourceWithMimeType> CREATOR = new C12001();
        private final String mimeType;
        private final RESOURCE resource;

        /* renamed from: com.facebook.accountkit.internal.AccountKitGraphRequest$ParcelableResourceWithMimeType$1 */
        static class C12001 implements Creator<ParcelableResourceWithMimeType> {
            C12001() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m4143a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m4144a(i);
            }

            /* renamed from: a */
            public ParcelableResourceWithMimeType m4143a(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel);
            }

            /* renamed from: a */
            public ParcelableResourceWithMimeType[] m4144a(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        }

        public int describeContents() {
            return 1;
        }

        String getMimeType() {
            return this.mimeType;
        }

        public RESOURCE getResource() {
            return this.resource;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mimeType);
            parcel.writeParcelable(this.resource, i);
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = parcel.readParcelable(C1220c.m4288a().getClassLoader());
        }
    }

    /* renamed from: com.facebook.accountkit.internal.AccountKitGraphRequest$a */
    private interface C1201a {
        /* renamed from: a */
        void mo1566a(String str, String str2) throws IOException;
    }

    /* renamed from: com.facebook.accountkit.internal.AccountKitGraphRequest$b */
    private static class C1202b {
        /* renamed from: a */
        static final String f3190a = C1202b.m4146a();

        /* renamed from: a */
        private static String m4146a() {
            String property = System.getProperty("http.agent");
            if (property == null) {
                property = "";
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(property);
            stringBuilder.append(" ");
            stringBuilder.append("AccountKitAndroidSDK");
            stringBuilder.append("/");
            stringBuilder.append("4.33.0");
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.facebook.accountkit.internal.AccountKitGraphRequest$c */
    private static class C3164c implements C1201a {
        /* renamed from: a */
        private boolean f9734a = true;
        /* renamed from: b */
        private final OutputStream f9735b;
        /* renamed from: c */
        private boolean f9736c = false;

        C3164c(OutputStream outputStream, boolean z) {
            this.f9735b = outputStream;
            this.f9736c = z;
        }

        /* renamed from: a */
        void m12200a(String str, Object obj) throws IOException {
            if (AccountKitGraphRequest.m4161d(obj)) {
                mo1566a(str, AccountKitGraphRequest.m4162e(obj));
            } else if (obj instanceof Bitmap) {
                m12197a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                m12203a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                m12198a(str, (Uri) obj, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                m12199a(str, (ParcelFileDescriptor) obj, null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable resource = parcelableResourceWithMimeType.getResource();
                String mimeType = parcelableResourceWithMimeType.getMimeType();
                if (resource instanceof ParcelFileDescriptor) {
                    m12199a(str, (ParcelFileDescriptor) resource, mimeType);
                } else if (resource instanceof Uri) {
                    m12198a(str, (Uri) resource, mimeType);
                } else {
                    throw m12195b();
                }
            } else {
                throw m12195b();
            }
        }

        /* renamed from: b */
        private RuntimeException m12195b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: a */
        public void mo1566a(String str, String str2) throws IOException {
            m12202a(str, null, null);
            m12205b("%s", str2);
            m12196a();
        }

        /* renamed from: a */
        void m12197a(String str, Bitmap bitmap) throws IOException {
            m12202a(str, str, "image/png");
            bitmap.compress(CompressFormat.PNG, 100, this.f9735b);
            m12205b("", new Object[null]);
            m12196a();
        }

        /* renamed from: a */
        void m12203a(String str, byte[] bArr) throws IOException {
            m12202a(str, str, "content/unknown");
            this.f9735b.write(bArr);
            m12205b("", new Object[null]);
            m12196a();
        }

        /* renamed from: a */
        void m12198a(String str, Uri uri, String str2) throws IOException {
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m12202a(str, str, str2);
            C1251w.m4480a(C1220c.m4288a().getContentResolver().openInputStream(uri), this.f9735b);
            m12205b("", new Object[null]);
            m12196a();
        }

        /* renamed from: a */
        void m12199a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m12202a(str, str, str2);
            C1251w.m4480a(new AutoCloseInputStream(parcelFileDescriptor), this.f9735b);
            m12205b("", new Object[null]);
            m12196a();
        }

        /* renamed from: a */
        void m12196a() throws IOException {
            if (this.f9736c) {
                this.f9735b.write("&".getBytes());
                return;
            }
            m12205b("--%s", "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
        }

        /* renamed from: a */
        void m12202a(String str, String str2, String str3) throws IOException {
            if (this.f9736c) {
                this.f9735b.write(String.format("%s=", new Object[]{str}).getBytes());
                return;
            }
            m12204a("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                m12204a("; filename=\"%s\"", str2);
            }
            m12205b("", new Object[0]);
            if (str3 != null) {
                m12205b("%s: %s", new Object[]{ManagerWebServices.PARAM_CONTENT_TYPE, str3});
            }
            m12205b("", new Object[0]);
        }

        /* renamed from: a */
        void m12204a(String str, Object... objArr) throws IOException {
            if (this.f9736c) {
                this.f9735b.write(URLEncoder.encode(String.format(Locale.US, str, objArr), "UTF-8").getBytes());
                return;
            }
            if (this.f9734a) {
                this.f9735b.write("--".getBytes());
                this.f9735b.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
                this.f9735b.write("\r\n".getBytes());
                this.f9734a = false;
            }
            this.f9735b.write(String.format(str, objArr).getBytes());
        }

        /* renamed from: b */
        void m12205b(String str, Object... objArr) throws IOException {
            m12204a(str, objArr);
            if (this.f9736c == null) {
                m12204a("\r\n", new Object[null]);
            }
        }
    }

    public AccountKitGraphRequest(AccessToken accessToken, String str, Bundle bundle, boolean z, HttpMethod httpMethod) {
        this(accessToken, str, bundle, z, httpMethod, null);
    }

    public AccountKitGraphRequest(AccessToken accessToken, String str, Bundle bundle, boolean z, HttpMethod httpMethod, String str2) {
        this.f3193c = accessToken;
        this.f3195e = str;
        this.f3197g = z;
        m4169a(httpMethod);
        if (bundle != null) {
            this.f3198h = new Bundle(bundle);
        } else {
            this.f3198h = new Bundle();
        }
        if (str2 == null) {
            str2 = "v1.3";
        }
        this.f3201k = str2;
    }

    /* renamed from: a */
    boolean m4172a() {
        return this.f3197g;
    }

    /* renamed from: b */
    JSONObject m4173b() {
        return this.f3199i;
    }

    /* renamed from: a */
    void m4171a(JSONObject jSONObject) {
        this.f3199i = jSONObject;
    }

    /* renamed from: c */
    public Bundle m4174c() {
        return this.f3198h;
    }

    /* renamed from: a */
    public void m4167a(Bundle bundle) {
        this.f3198h = bundle;
    }

    /* renamed from: d */
    public AccessToken m4175d() {
        return this.f3193c;
    }

    /* renamed from: a */
    void m4169a(HttpMethod httpMethod) {
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.f3196f = httpMethod;
    }

    /* renamed from: a */
    public void m4170a(Object obj) {
        this.f3200j = obj;
    }

    /* renamed from: e */
    public Object m4176e() {
        return this.f3200j;
    }

    /* renamed from: f */
    C1227f m4177f() {
        try {
            TrafficStats.setThreadStatsTag(61453);
            C1227f a = m4148a(m4149a(this), this);
            if (a != null) {
                return a;
            }
            throw new AccountKitException(Type.INTERNAL_ERROR, InternalAccountKitError.INVALID_GRAPH_RESPONSE);
        } catch (AccountKitException e) {
            return new C1227f(this, null, new C1228g(e));
        } catch (Throwable e2) {
            return new C1227f(this, null, new C1228g(new AccountKitException(Type.INTERNAL_ERROR, e2)));
        }
    }

    /* renamed from: a */
    static C1227f m4148a(HttpURLConnection httpURLConnection, AccountKitGraphRequest accountKitGraphRequest) {
        accountKitGraphRequest = C1227f.m4331a(httpURLConnection, accountKitGraphRequest);
        C1251w.m4494a((URLConnection) httpURLConnection);
        return accountKitGraphRequest;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{Request:  accessToken: ");
        stringBuilder.append(this.f3193c == null ? ManagerWebServices.NULL_STRING_VALUE : this.f3193c);
        stringBuilder.append(", graphPath: ");
        stringBuilder.append(this.f3195e);
        stringBuilder.append(", requestObject: ");
        stringBuilder.append(this.f3199i);
        stringBuilder.append(", httpMethod: ");
        stringBuilder.append(this.f3196f);
        stringBuilder.append(", parameters: ");
        stringBuilder.append(this.f3198h);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static HttpURLConnection m4150a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", C1202b.f3190a);
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* renamed from: h */
    private void m4164h() {
        C1251w.m4490a(this.f3198h, ManagerWebServices.PARAM_LOCALE, C1238n.m4384a());
        C1251w.m4490a(this.f3198h, "sdk", "android");
        this.f3198h.putBoolean("fb_app_events_enabled", AccountKit.m4122k());
        if (this.f3193c != null) {
            if (!this.f3198h.containsKey("access_token")) {
                this.f3198h.putString("access_token", this.f3193c.getToken());
            }
        } else if (!this.f3198h.containsKey("access_token")) {
            String h = AccountKit.m4119h();
            String j = AccountKit.m4121j();
            if (C1251w.m4500a(h) || C1251w.m4500a(j)) {
                Log.d(f3191a, "Warning: Request without access token missing application ID or client token.");
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AA|");
            stringBuilder.append(h);
            stringBuilder.append("|");
            stringBuilder.append(j);
            this.f3198h.putString("access_token", stringBuilder.toString());
        }
    }

    /* renamed from: i */
    private String m4165i() {
        Builder authority = new Builder().scheme("https").authority(C1220c.m4315p());
        if (!f3192b.matcher(this.f3195e).matches()) {
            authority.appendPath(this.f3201k);
        }
        authority.appendPath(this.f3195e);
        m4164h();
        if (this.f3196f != HttpMethod.POST) {
            m4151a(authority);
        }
        return authority.toString();
    }

    /* renamed from: a */
    private void m4151a(Builder builder) {
        List<String> arrayList = new ArrayList(this.f3198h.keySet());
        Collections.sort(arrayList);
        for (String str : arrayList) {
            Object obj = this.f3198h.get(str);
            if (obj == null) {
                obj = "";
            }
            builder.appendQueryParameter(str, m4162e(obj));
        }
    }

    /* renamed from: a */
    private static void m4156a(HttpURLConnection httpURLConnection, boolean z) {
        if (z) {
            httpURLConnection.setRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE, m4166j());
            return;
        }
        httpURLConnection.setRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE, "application/x-www-form-urlencoded");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
    }

    /* renamed from: a */
    private static void m4152a(Bundle bundle, C3164c c3164c) throws IOException {
        for (String str : bundle.keySet()) {
            c3164c.m12200a(str, bundle.get(str));
        }
    }

    /* renamed from: j */
    private static String m4166j() {
        return String.format("multipart/form-data; boundary=%s", new Object[]{"3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"});
    }

    /* renamed from: d */
    private static boolean m4161d(Object obj) {
        if (!((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number))) {
            if ((obj instanceof Date) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: e */
    private static String m4162e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean)) {
            if (!(obj instanceof Number)) {
                if (obj instanceof Date) {
                    return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
                }
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
        }
        return obj.toString();
    }

    /* renamed from: a */
    static java.net.HttpURLConnection m4149a(com.facebook.accountkit.internal.AccountKitGraphRequest r3) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = r3.m4165i();	 Catch:{ MalformedURLException -> 0x0026 }
        r1 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x0026 }
        r1.<init>(r0);	 Catch:{ MalformedURLException -> 0x0026 }
        r0 = m4150a(r1);	 Catch:{ UnknownHostException -> 0x001c, IOException -> 0x0011, IOException -> 0x0011 }
        m4154a(r3, r0);	 Catch:{ UnknownHostException -> 0x001c, IOException -> 0x0011, IOException -> 0x0011 }
        return r0;
    L_0x0011:
        r3 = move-exception;
        r0 = new com.facebook.accountkit.AccountKitException;
        r1 = com.facebook.accountkit.AccountKitError.Type.INTERNAL_ERROR;
        r2 = com.facebook.accountkit.internal.InternalAccountKitError.CANNOT_CONSTRUCT_MESSAGE_BODY;
        r0.<init>(r1, r2, r3);
        throw r0;
    L_0x001c:
        r3 = new com.facebook.accountkit.AccountKitException;
        r0 = com.facebook.accountkit.AccountKitError.Type.NETWORK_CONNECTION_ERROR;
        r1 = com.facebook.accountkit.internal.InternalAccountKitError.NO_NETWORK_CONNECTION;
        r3.<init>(r0, r1);
        throw r3;
    L_0x0026:
        r3 = move-exception;
        r0 = new com.facebook.accountkit.AccountKitException;
        r1 = com.facebook.accountkit.AccountKitError.Type.INTERNAL_ERROR;
        r2 = com.facebook.accountkit.internal.InternalAccountKitError.CANNOT_CONSTRUCT_URL;
        r0.<init>(r1, r2, r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.AccountKitGraphRequest.a(com.facebook.accountkit.internal.AccountKitGraphRequest):java.net.HttpURLConnection");
    }

    /* renamed from: a */
    static C1224e m4147a(@NonNull AccountKitGraphRequest accountKitGraphRequest, Callback callback) {
        C1224e c1224e = new C1224e(accountKitGraphRequest, callback);
        c1224e.executeOnExecutor(C1251w.m4502b(), new Void[null]);
        return c1224e;
    }

    /* renamed from: a */
    private static void m4154a(AccountKitGraphRequest accountKitGraphRequest, HttpURLConnection httpURLConnection) throws IOException, JSONException {
        C1229h c1229h = new C1229h(LoggingBehavior.REQUESTS, "Request");
        HttpMethod httpMethod = accountKitGraphRequest.f3196f;
        httpURLConnection.setRequestMethod(httpMethod.name());
        boolean b = m4158b(accountKitGraphRequest.f3198h);
        m4156a(httpURLConnection, b);
        Object url = httpURLConnection.getURL();
        c1229h.m4347a("Request:");
        c1229h.m4348a("AccessToken", accountKitGraphRequest.m4175d());
        c1229h.m4348a("URL", url);
        c1229h.m4348a("Method", httpURLConnection.getRequestMethod());
        c1229h.m4348a("User-Agent", httpURLConnection.getRequestProperty("User-Agent"));
        c1229h.m4348a(ManagerWebServices.PARAM_CONTENT_TYPE, httpURLConnection.getRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE));
        c1229h.m4346a();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        if (httpMethod == HttpMethod.POST) {
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = null;
            try {
                httpURLConnection = httpURLConnection.getOutputStream();
                try {
                    outputStream = new BufferedOutputStream(httpURLConnection);
                    if (!b) {
                        outputStream = new GZIPOutputStream(outputStream);
                    }
                    m4153a(accountKitGraphRequest, outputStream, b);
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th) {
                    accountKitGraphRequest = th;
                    outputStream = httpURLConnection;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw accountKitGraphRequest;
                }
            } catch (Throwable th2) {
                accountKitGraphRequest = th2;
                if (outputStream != null) {
                    outputStream.close();
                }
                throw accountKitGraphRequest;
            }
        }
    }

    /* renamed from: b */
    private static boolean m4158b(Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (m4163f(bundle.get(str))) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: f */
    private static boolean m4163f(Object obj) {
        if (!((obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor))) {
            if ((obj instanceof ParcelableResourceWithMimeType) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m4153a(AccountKitGraphRequest accountKitGraphRequest, OutputStream outputStream, boolean z) throws IOException {
        C1201a c3164c = new C3164c(outputStream, z ^ 1);
        m4152a(accountKitGraphRequest.f3198h, (C3164c) c3164c);
        if (accountKitGraphRequest.f3199i != null) {
            m4157a(accountKitGraphRequest.f3199i, c3164c);
        }
    }

    /* renamed from: g */
    Handler m4178g() {
        return this.f3194d;
    }

    /* renamed from: a */
    void m4168a(Handler handler) {
        this.f3194d = handler;
    }

    /* renamed from: a */
    private static void m4157a(JSONObject jSONObject, C1201a c1201a) throws IOException {
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            m4155a(str, jSONObject.opt(str), c1201a);
        }
    }

    /* renamed from: a */
    private static void m4155a(String str, Object obj, C1201a c1201a) throws IOException {
        Class cls = obj.getClass();
        if (!(String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls))) {
            if (!Boolean.class.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    c1201a.mo1566a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
                    return;
                }
                return;
            }
        }
        c1201a.mo1566a(str, obj.toString());
    }
}
