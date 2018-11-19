package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.C1735p;
import com.facebook.internal.C1738r;
import com.facebook.internal.C1747v;
import com.facebook.internal.C1749x;
import com.facebook.internal.Utility;
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
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GraphRequest {
    /* renamed from: a */
    public static final String f3113a = "GraphRequest";
    /* renamed from: b */
    private static String f3114b;
    /* renamed from: c */
    private static Pattern f3115c = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    /* renamed from: q */
    private static volatile String f3116q;
    /* renamed from: d */
    private AccessToken f3117d;
    /* renamed from: e */
    private HttpMethod f3118e;
    /* renamed from: f */
    private String f3119f;
    /* renamed from: g */
    private JSONObject f3120g;
    /* renamed from: h */
    private String f3121h;
    /* renamed from: i */
    private String f3122i;
    /* renamed from: j */
    private boolean f3123j;
    /* renamed from: k */
    private Bundle f3124k;
    /* renamed from: l */
    private Callback f3125l;
    /* renamed from: m */
    private String f3126m;
    /* renamed from: n */
    private Object f3127n;
    /* renamed from: o */
    private String f3128o;
    /* renamed from: p */
    private boolean f3129p;

    public interface Callback {
        void onCompleted(GraphResponse graphResponse);
    }

    public interface GraphJSONArrayCallback {
        void onCompleted(JSONArray jSONArray, GraphResponse graphResponse);
    }

    public interface GraphJSONObjectCallback {
        void onCompleted(JSONObject jSONObject, GraphResponse graphResponse);
    }

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Creator<ParcelableResourceWithMimeType> CREATOR = new C11751();
        private final String mimeType;
        private final RESOURCE resource;

        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$1 */
        static class C11751 implements Creator<ParcelableResourceWithMimeType> {
            C11751() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m4006a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m4007a(i);
            }

            /* renamed from: a */
            public ParcelableResourceWithMimeType m4006a(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel);
            }

            /* renamed from: a */
            public ParcelableResourceWithMimeType[] m4007a(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        }

        public int describeContents() {
            return 1;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public RESOURCE getResource() {
            return this.resource;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mimeType);
            parcel.writeParcelable(this.resource, i);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.mimeType = str;
            this.resource = resource;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = parcel.readParcelable(FacebookSdk.m3994e().getClassLoader());
        }
    }

    /* renamed from: com.facebook.GraphRequest$a */
    private static class C1176a {
        /* renamed from: a */
        private final GraphRequest f3111a;
        /* renamed from: b */
        private final Object f3112b;

        public C1176a(GraphRequest graphRequest, Object obj) {
            this.f3111a = graphRequest;
            this.f3112b = obj;
        }

        /* renamed from: a */
        public GraphRequest m4008a() {
            return this.f3111a;
        }

        /* renamed from: b */
        public Object m4009b() {
            return this.f3112b;
        }
    }

    /* renamed from: com.facebook.GraphRequest$b */
    private interface C1177b {
        /* renamed from: a */
        void mo1562a(String str, String str2) throws IOException;
    }

    public interface OnProgressCallback extends Callback {
        void onProgress(long j, long j2);
    }

    /* renamed from: com.facebook.GraphRequest$c */
    private static class C3160c implements C1177b {
        /* renamed from: a */
        private final OutputStream f9729a;
        /* renamed from: b */
        private final C1738r f9730b;
        /* renamed from: c */
        private boolean f9731c = true;
        /* renamed from: d */
        private boolean f9732d = false;

        public C3160c(OutputStream outputStream, C1738r c1738r, boolean z) {
            this.f9729a = outputStream;
            this.f9730b = c1738r;
            this.f9732d = z;
        }

        /* renamed from: a */
        public void m12172a(String str, Object obj, GraphRequest graphRequest) throws IOException {
            if (this.f9729a instanceof C1751k) {
                ((C1751k) this.f9729a).mo1842a(graphRequest);
            }
            if (GraphRequest.m4042e(obj) != null) {
                mo1562a(str, GraphRequest.m4043f(obj));
            } else if ((obj instanceof Bitmap) != null) {
                m12169a(str, (Bitmap) obj);
            } else if ((obj instanceof byte[]) != null) {
                m12176a(str, (byte[]) obj);
            } else if ((obj instanceof Uri) != null) {
                m12170a(str, (Uri) obj, null);
            } else if ((obj instanceof ParcelFileDescriptor) != null) {
                m12171a(str, (ParcelFileDescriptor) obj, null);
            } else if ((obj instanceof ParcelableResourceWithMimeType) != null) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                graphRequest = parcelableResourceWithMimeType.getResource();
                String mimeType = parcelableResourceWithMimeType.getMimeType();
                if (graphRequest instanceof ParcelFileDescriptor) {
                    m12171a(str, (ParcelFileDescriptor) graphRequest, mimeType);
                } else if (graphRequest instanceof Uri) {
                    m12170a(str, (Uri) graphRequest, mimeType);
                } else {
                    throw m12167b();
                }
            } else {
                throw m12167b();
            }
        }

        /* renamed from: b */
        private RuntimeException m12167b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: a */
        public void m12175a(String str, JSONArray jSONArray, Collection<GraphRequest> collection) throws IOException, JSONException {
            if (this.f9729a instanceof C1751k) {
                C1751k c1751k = (C1751k) this.f9729a;
                m12174a(str, null, null);
                m12177a("[", new Object[0]);
                int i = 0;
                for (GraphRequest graphRequest : collection) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    c1751k.mo1842a(graphRequest);
                    if (i > 0) {
                        m12177a(",%s", jSONObject.toString());
                    } else {
                        m12177a("%s", jSONObject.toString());
                    }
                    i++;
                }
                m12177a("]", new Object[0]);
                if (this.f9730b != null) {
                    collection = this.f9730b;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("    ");
                    stringBuilder.append(str);
                    collection.m5985a(stringBuilder.toString(), jSONArray.toString());
                }
                return;
            }
            mo1562a(str, jSONArray.toString());
        }

        /* renamed from: a */
        public void mo1562a(String str, String str2) throws IOException {
            m12174a(str, null, null);
            m12178b("%s", str2);
            m12168a();
            if (this.f9730b != null) {
                C1738r c1738r = this.f9730b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("    ");
                stringBuilder.append(str);
                c1738r.m5985a(stringBuilder.toString(), (Object) str2);
            }
        }

        /* renamed from: a */
        public void m12169a(String str, Bitmap bitmap) throws IOException {
            m12174a(str, str, "image/png");
            bitmap.compress(CompressFormat.PNG, 100, this.f9729a);
            m12178b("", new Object[0]);
            m12168a();
            if (this.f9730b != null) {
                bitmap = this.f9730b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("    ");
                stringBuilder.append(str);
                bitmap.m5985a(stringBuilder.toString(), (Object) "<Image>");
            }
        }

        /* renamed from: a */
        public void m12176a(String str, byte[] bArr) throws IOException {
            m12174a(str, str, "content/unknown");
            this.f9729a.write(bArr);
            m12178b("", new Object[0]);
            m12168a();
            if (this.f9730b != null) {
                C1738r c1738r = this.f9730b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("    ");
                stringBuilder.append(str);
                c1738r.m5985a(stringBuilder.toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        /* renamed from: a */
        public void m12170a(String str, Uri uri, String str2) throws IOException {
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m12174a(str, str, str2);
            if ((this.f9729a instanceof C3401i) != null) {
                ((C3401i) this.f9729a).m13076a(Utility.m5805e(uri));
                uri = null;
            } else {
                uri = Utility.m5748a(FacebookSdk.m3994e().getContentResolver().openInputStream(uri), this.f9729a) + null;
            }
            m12178b("", new Object[0]);
            m12168a();
            if (this.f9730b != null) {
                str2 = this.f9730b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("    ");
                stringBuilder.append(str);
                str2.m5985a(stringBuilder.toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(uri)}));
            }
        }

        /* renamed from: a */
        public void m12171a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m12174a(str, str, str2);
            if ((this.f9729a instanceof C3401i) != null) {
                ((C3401i) this.f9729a).m13076a(parcelFileDescriptor.getStatSize());
                parcelFileDescriptor = null;
            } else {
                parcelFileDescriptor = Utility.m5748a(new AutoCloseInputStream(parcelFileDescriptor), this.f9729a) + null;
            }
            m12178b("", new Object[0]);
            m12168a();
            if (this.f9730b != null) {
                str2 = this.f9730b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("    ");
                stringBuilder.append(str);
                str2.m5985a(stringBuilder.toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(parcelFileDescriptor)}));
            }
        }

        /* renamed from: a */
        public void m12168a() throws IOException {
            if (this.f9732d) {
                this.f9729a.write("&".getBytes());
                return;
            }
            m12178b("--%s", "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
        }

        /* renamed from: a */
        public void m12174a(String str, String str2, String str3) throws IOException {
            if (this.f9732d) {
                this.f9729a.write(String.format("%s=", new Object[]{str}).getBytes());
                return;
            }
            m12177a("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                m12177a("; filename=\"%s\"", str2);
            }
            m12178b("", new Object[0]);
            if (str3 != null) {
                m12178b("%s: %s", new Object[]{ManagerWebServices.PARAM_CONTENT_TYPE, str3});
            }
            m12178b("", new Object[0]);
        }

        /* renamed from: a */
        public void m12177a(String str, Object... objArr) throws IOException {
            if (this.f9732d) {
                this.f9729a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), "UTF-8").getBytes());
                return;
            }
            if (this.f9731c) {
                this.f9729a.write("--".getBytes());
                this.f9729a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
                this.f9729a.write("\r\n".getBytes());
                this.f9731c = false;
            }
            this.f9729a.write(String.format(str, objArr).getBytes());
        }

        /* renamed from: b */
        public void m12178b(String str, Object... objArr) throws IOException {
            m12177a(str, objArr);
            if (this.f9732d == null) {
                m12177a("\r\n", new Object[null]);
            }
        }
    }

    public GraphRequest() {
        this(null, null, null, null, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod) {
        this(accessToken, str, bundle, httpMethod, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback) {
        this(accessToken, str, bundle, httpMethod, callback, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback, String str2) {
        this.f3123j = true;
        this.f3129p = false;
        this.f3117d = accessToken;
        this.f3119f = str;
        this.f3128o = str2;
        m4052a(callback);
        m4053a(httpMethod);
        if (bundle != null) {
            this.f3124k = new Bundle(bundle);
        } else {
            this.f3124k = new Bundle();
        }
        if (this.f3128o == null) {
            this.f3128o = FacebookSdk.m3995f();
        }
    }

    /* renamed from: a */
    public static GraphRequest m4011a(AccessToken accessToken, final GraphJSONObjectCallback graphJSONObjectCallback) {
        return new GraphRequest(accessToken, "me", null, null, new Callback() {
            public void onCompleted(GraphResponse graphResponse) {
                if (graphJSONObjectCallback != null) {
                    graphJSONObjectCallback.onCompleted(graphResponse.m4093b(), graphResponse);
                }
            }
        });
    }

    /* renamed from: a */
    public static GraphRequest m4013a(AccessToken accessToken, String str, JSONObject jSONObject, Callback callback) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, HttpMethod.POST, callback);
        graphRequest.m4056a(jSONObject);
        return graphRequest;
    }

    /* renamed from: a */
    public static GraphRequest m4012a(AccessToken accessToken, String str, Callback callback) {
        return new GraphRequest(accessToken, str, null, null, callback);
    }

    /* renamed from: a */
    public final JSONObject m4050a() {
        return this.f3120g;
    }

    /* renamed from: a */
    public final void m4056a(JSONObject jSONObject) {
        this.f3120g = jSONObject;
    }

    /* renamed from: b */
    public final String m4058b() {
        return this.f3119f;
    }

    /* renamed from: c */
    public final HttpMethod m4059c() {
        return this.f3118e;
    }

    /* renamed from: a */
    public final void m4053a(HttpMethod httpMethod) {
        if (this.f3126m == null || httpMethod == HttpMethod.GET) {
            if (httpMethod == null) {
                httpMethod = HttpMethod.GET;
            }
            this.f3118e = httpMethod;
            return;
        }
        throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    }

    /* renamed from: d */
    public final String m4060d() {
        return this.f3128o;
    }

    /* renamed from: a */
    public final void m4055a(String str) {
        this.f3128o = str;
    }

    /* renamed from: a */
    public final void m4057a(boolean z) {
        this.f3129p = z;
    }

    /* renamed from: e */
    public final Bundle m4061e() {
        return this.f3124k;
    }

    /* renamed from: a */
    public final void m4051a(Bundle bundle) {
        this.f3124k = bundle;
    }

    /* renamed from: f */
    public final AccessToken m4062f() {
        return this.f3117d;
    }

    /* renamed from: g */
    public final Callback m4063g() {
        return this.f3125l;
    }

    /* renamed from: a */
    public final void m4052a(final Callback callback) {
        if (!FacebookSdk.m3986a(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            if (!FacebookSdk.m3986a(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
                this.f3125l = callback;
                return;
            }
        }
        this.f3125l = new Callback(this) {
            /* renamed from: b */
            final /* synthetic */ GraphRequest f9726b;

            public void onCompleted(GraphResponse graphResponse) {
                JSONObject b = graphResponse.m4093b();
                b = b != null ? b.optJSONObject("__debug__") : null;
                JSONArray optJSONArray = b != null ? b.optJSONArray(ManagerWebServices.PARAM_MESSAGES) : null;
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        String optString = optJSONObject != null ? optJSONObject.optString("message") : null;
                        String optString2 = optJSONObject != null ? optJSONObject.optString("type") : null;
                        String optString3 = optJSONObject != null ? optJSONObject.optString(ManagerWebServices.IG_PARAM_LINK) : null;
                        if (!(optString == null || optString2 == null)) {
                            LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                            if (optString2.equals("warning")) {
                                loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                            }
                            if (!Utility.m5785a(optString3)) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(optString);
                                stringBuilder.append(" Link: ");
                                stringBuilder.append(optString3);
                                optString = stringBuilder.toString();
                            }
                            C1738r.m5978a(loggingBehavior, GraphRequest.f3113a, optString);
                        }
                    }
                }
                if (callback != null) {
                    callback.onCompleted(graphResponse);
                }
            }
        };
    }

    /* renamed from: a */
    public final void m4054a(Object obj) {
        this.f3127n = obj;
    }

    /* renamed from: h */
    public final Object m4064h() {
        return this.f3127n;
    }

    /* renamed from: i */
    public final GraphResponse m4065i() {
        return m4014a(this);
    }

    /* renamed from: j */
    public final C1680e m4066j() {
        return m4032b(this);
    }

    /* renamed from: a */
    public static HttpURLConnection m4016a(GraphRequestBatch graphRequestBatch) {
        Throwable e;
        m4039d(graphRequestBatch);
        try {
            URL url;
            if (graphRequestBatch.size() == 1) {
                url = new URL(graphRequestBatch.m4070a(0).m4068l());
            } else {
                url = new URL(C1747v.m6055b());
            }
            URLConnection uRLConnection = null;
            try {
                URLConnection a = m4017a(url);
                try {
                    m4024a(graphRequestBatch, (HttpURLConnection) a);
                    return a;
                } catch (IOException e2) {
                    e = e2;
                    uRLConnection = a;
                    Utility.m5779a(uRLConnection);
                    throw new FacebookException("could not construct request body", e);
                }
            } catch (IOException e3) {
                e = e3;
                Utility.m5779a(uRLConnection);
                throw new FacebookException("could not construct request body", e);
            }
        } catch (Throwable e4) {
            throw new FacebookException("could not construct URL for request", e4);
        }
    }

    /* renamed from: a */
    public static GraphResponse m4014a(GraphRequest graphRequest) {
        graphRequest = m4020a(graphRequest);
        if (graphRequest != null) {
            if (graphRequest.size() == 1) {
                return (GraphResponse) graphRequest.get(0);
            }
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    /* renamed from: a */
    public static List<GraphResponse> m4020a(GraphRequest... graphRequestArr) {
        C1749x.m6064a((Object) graphRequestArr, "requests");
        return m4019a(Arrays.asList(graphRequestArr));
    }

    /* renamed from: a */
    public static List<GraphResponse> m4019a(Collection<GraphRequest> collection) {
        return m4033b(new GraphRequestBatch((Collection) collection));
    }

    /* renamed from: b */
    public static List<GraphResponse> m4033b(GraphRequestBatch graphRequestBatch) {
        C1749x.m6072c(graphRequestBatch, "requests");
        URLConnection uRLConnection = null;
        try {
            URLConnection a = m4016a(graphRequestBatch);
            try {
                graphRequestBatch = m4018a((HttpURLConnection) a, graphRequestBatch);
                Utility.m5779a(a);
                return graphRequestBatch;
            } catch (Throwable th) {
                graphRequestBatch = th;
                uRLConnection = a;
                Utility.m5779a(uRLConnection);
                throw graphRequestBatch;
            }
        } catch (Throwable e) {
            List a2 = GraphResponse.m4091a(graphRequestBatch.m4079d(), null, new FacebookException(e));
            m4025a(graphRequestBatch, a2);
            Utility.m5779a(null);
            return a2;
        } catch (Throwable th2) {
            graphRequestBatch = th2;
            Utility.m5779a(uRLConnection);
            throw graphRequestBatch;
        }
    }

    /* renamed from: b */
    public static C1680e m4032b(GraphRequest... graphRequestArr) {
        C1749x.m6064a((Object) graphRequestArr, "requests");
        return m4031b(Arrays.asList(graphRequestArr));
    }

    /* renamed from: b */
    public static C1680e m4031b(Collection<GraphRequest> collection) {
        return m4037c(new GraphRequestBatch((Collection) collection));
    }

    /* renamed from: c */
    public static C1680e m4037c(GraphRequestBatch graphRequestBatch) {
        C1749x.m6072c(graphRequestBatch, "requests");
        C1680e c1680e = new C1680e(graphRequestBatch);
        c1680e.executeOnExecutor(FacebookSdk.m3990c(), new Void[0]);
        return c1680e;
    }

    /* renamed from: a */
    public static List<GraphResponse> m4018a(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        List a = GraphResponse.m4089a(httpURLConnection, graphRequestBatch);
        Utility.m5779a((URLConnection) httpURLConnection);
        if (graphRequestBatch.size() != a.size()) {
            throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(a.size()), Integer.valueOf(graphRequestBatch.size())}));
        }
        m4025a(graphRequestBatch, a);
        C1662b.m5631a().m5645e();
        return a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{Request: ");
        stringBuilder.append(" accessToken: ");
        stringBuilder.append(this.f3117d == null ? ManagerWebServices.NULL_STRING_VALUE : this.f3117d);
        stringBuilder.append(", graphPath: ");
        stringBuilder.append(this.f3119f);
        stringBuilder.append(", graphObject: ");
        stringBuilder.append(this.f3120g);
        stringBuilder.append(", httpMethod: ");
        stringBuilder.append(this.f3118e);
        stringBuilder.append(", parameters: ");
        stringBuilder.append(this.f3124k);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static void m4025a(final GraphRequestBatch graphRequestBatch, List<GraphResponse> list) {
        int size = graphRequestBatch.size();
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            GraphRequest a = graphRequestBatch.m4070a(i);
            if (a.f3125l != null) {
                arrayList.add(new Pair(a.f3125l, list.get(i)));
            }
        }
        if (arrayList.size() > null) {
            list = new Runnable() {
                public void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((Callback) pair.first).onCompleted((GraphResponse) pair.second);
                    }
                    for (com.facebook.GraphRequestBatch.Callback onBatchCompleted : graphRequestBatch.m4080e()) {
                        onBatchCompleted.onBatchCompleted(graphRequestBatch);
                    }
                }
            };
            graphRequestBatch = graphRequestBatch.m4078c();
            if (graphRequestBatch == null) {
                list.run();
            } else {
                graphRequestBatch.post(list);
            }
        }
    }

    /* renamed from: a */
    private static HttpURLConnection m4017a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", m4049p());
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* renamed from: m */
    private void m4046m() {
        String token;
        if (this.f3117d != null) {
            if (!this.f3124k.containsKey("access_token")) {
                token = this.f3117d.getToken();
                C1738r.m5980a(token);
                this.f3124k.putString("access_token", token);
            }
        } else if (!(this.f3129p || this.f3124k.containsKey("access_token"))) {
            token = FacebookSdk.m3998i();
            String k = FacebookSdk.m4000k();
            if (Utility.m5785a(token) || Utility.m5785a(k)) {
                Log.d(f3113a, "Warning: Request without access token missing application ID or client token.");
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(token);
                stringBuilder.append("|");
                stringBuilder.append(k);
                this.f3124k.putString("access_token", stringBuilder.toString());
            }
        }
        this.f3124k.putString("sdk", "android");
        this.f3124k.putString("format", "json");
        if (FacebookSdk.m3986a(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            this.f3124k.putString("debug", "info");
        } else if (FacebookSdk.m3986a(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.f3124k.putString("debug", "warning");
        }
    }

    /* renamed from: a */
    private String m4015a(String str, Boolean bool) {
        if (bool.booleanValue() == null && this.f3118e == HttpMethod.POST) {
            return str;
        }
        str = Uri.parse(str).buildUpon();
        for (String str2 : this.f3124k.keySet()) {
            Object obj = this.f3124k.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (m4042e(obj)) {
                str.appendQueryParameter(str2, m4043f(obj).toString());
            } else if (this.f3118e == HttpMethod.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return str.toString();
    }

    /* renamed from: k */
    final String m4067k() {
        if (this.f3126m != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String format = String.format("%s/%s", new Object[]{C1747v.m6055b(), m4047n()});
        m4046m();
        Uri parse = Uri.parse(m4015a(format, Boolean.valueOf(true)));
        return String.format("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
    }

    /* renamed from: l */
    final String m4068l() {
        if (this.f3126m != null) {
            return this.f3126m.toString();
        }
        String c;
        if (m4059c() == HttpMethod.POST && this.f3119f != null && this.f3119f.endsWith("/videos")) {
            c = C1747v.m6056c();
        } else {
            c = C1747v.m6055b();
        }
        c = String.format("%s/%s", new Object[]{c, m4047n()});
        m4046m();
        return m4015a(c, Boolean.valueOf(false));
    }

    /* renamed from: n */
    private String m4047n() {
        if (f3115c.matcher(this.f3119f).matches()) {
            return this.f3119f;
        }
        return String.format("%s/%s", new Object[]{this.f3128o, this.f3119f});
    }

    /* renamed from: a */
    private void m4029a(JSONArray jSONArray, Map<String, C1176a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        if (this.f3121h != null) {
            jSONObject.put("name", this.f3121h);
            jSONObject.put("omit_response_on_success", this.f3123j);
        }
        if (this.f3122i != null) {
            jSONObject.put("depends_on", this.f3122i);
        }
        String k = m4067k();
        jSONObject.put("relative_url", k);
        jSONObject.put("method", this.f3118e);
        if (this.f3117d != null) {
            C1738r.m5980a(this.f3117d.getToken());
        }
        Iterable arrayList = new ArrayList();
        for (String str : this.f3124k.keySet()) {
            Object obj = this.f3124k.get(str);
            if (m4040d(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", new Object[]{ManagerWebServices.PARAM_FILE, Integer.valueOf(map.size())});
                arrayList.add(format);
                map.put(format, new C1176a(this, obj));
            }
        }
        if (arrayList.isEmpty() == null) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f3120g != null) {
            map = new ArrayList();
            m4030a(this.f3120g, k, new C1177b(this) {
                /* renamed from: b */
                final /* synthetic */ GraphRequest f9728b;

                /* renamed from: a */
                public void mo1562a(String str, String str2) throws IOException {
                    map.add(String.format(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, "UTF-8")}));
                }
            });
            jSONObject.put("body", TextUtils.join("&", map));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: e */
    private static boolean m4041e(GraphRequestBatch graphRequestBatch) {
        for (com.facebook.GraphRequestBatch.Callback callback : graphRequestBatch.m4080e()) {
            if (callback instanceof com.facebook.GraphRequestBatch.OnProgressCallback) {
                return true;
            }
        }
        graphRequestBatch = graphRequestBatch.iterator();
        while (graphRequestBatch.hasNext()) {
            if (((GraphRequest) graphRequestBatch.next()).m4063g() instanceof OnProgressCallback) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m4027a(HttpURLConnection httpURLConnection, boolean z) {
        if (z) {
            httpURLConnection.setRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE, "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            return;
        }
        httpURLConnection.setRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE, m4048o());
    }

    /* renamed from: f */
    private static boolean m4044f(GraphRequestBatch graphRequestBatch) {
        graphRequestBatch = graphRequestBatch.iterator();
        while (graphRequestBatch.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) graphRequestBatch.next();
            for (String str : graphRequest.f3124k.keySet()) {
                if (m4040d(graphRequest.f3124k.get(str))) {
                    return null;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    static final boolean m4034b(GraphRequest graphRequest) {
        graphRequest = graphRequest.m4060d();
        boolean z = true;
        if (Utility.m5785a((String) graphRequest)) {
            return true;
        }
        if (graphRequest.startsWith("v")) {
            graphRequest = graphRequest.substring(1);
        }
        graphRequest = graphRequest.split("\\.");
        if (graphRequest.length < 2 || Integer.parseInt(graphRequest[0]) <= 2) {
            if (Integer.parseInt(graphRequest[0]) < 2 || Integer.parseInt(graphRequest[1]) < 4) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: d */
    static final void m4039d(GraphRequestBatch graphRequestBatch) {
        graphRequestBatch = graphRequestBatch.iterator();
        while (graphRequestBatch.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) graphRequestBatch.next();
            if (HttpMethod.GET.equals(graphRequest.m4059c()) && m4034b(graphRequest)) {
                Bundle e = graphRequest.m4061e();
                if (!e.containsKey(ManagerWebServices.FB_PARAM_BATCH_FIELDS) || Utility.m5785a(e.getString(ManagerWebServices.FB_PARAM_BATCH_FIELDS))) {
                    C1738r.m5977a(LoggingBehavior.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", graphRequest.m4058b());
                }
            }
        }
    }

    /* renamed from: a */
    static final void m4024a(GraphRequestBatch graphRequestBatch, HttpURLConnection httpURLConnection) throws IOException, JSONException {
        C1738r c1738r = new C1738r(LoggingBehavior.REQUESTS, "Request");
        int size = graphRequestBatch.size();
        boolean f = m4044f(graphRequestBatch);
        int i = 0;
        HttpMethod httpMethod = size == 1 ? graphRequestBatch.m4070a(0).f3118e : HttpMethod.POST;
        httpURLConnection.setRequestMethod(httpMethod.name());
        m4027a(httpURLConnection, f);
        URL url = httpURLConnection.getURL();
        c1738r.m5988c("Request:\n");
        c1738r.m5985a("Id", graphRequestBatch.m4077b());
        c1738r.m5985a("URL", (Object) url);
        c1738r.m5985a("Method", httpURLConnection.getRequestMethod());
        c1738r.m5985a("User-Agent", httpURLConnection.getRequestProperty("User-Agent"));
        c1738r.m5985a(ManagerWebServices.PARAM_CONTENT_TYPE, httpURLConnection.getRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE));
        httpURLConnection.setConnectTimeout(graphRequestBatch.m4069a());
        httpURLConnection.setReadTimeout(graphRequestBatch.m4069a());
        if (httpMethod == HttpMethod.POST) {
            i = 1;
        }
        if (i == 0) {
            c1738r.m5984a();
            return;
        }
        httpURLConnection.setDoOutput(true);
        try {
            OutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            if (f) {
                try {
                    httpURLConnection = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th) {
                    graphRequestBatch = th;
                    httpURLConnection = bufferedOutputStream;
                    if (httpURLConnection != null) {
                        httpURLConnection.close();
                    }
                    throw graphRequestBatch;
                }
            }
            httpURLConnection = bufferedOutputStream;
            try {
                if (m4041e(graphRequestBatch)) {
                    OutputStream c3401i = new C3401i(graphRequestBatch.m4078c());
                    m4023a(graphRequestBatch, null, size, url, c3401i, f);
                    httpURLConnection = new C3423j(httpURLConnection, graphRequestBatch, c3401i.m13078b(), (long) c3401i.m13075a());
                }
                m4023a(graphRequestBatch, c1738r, size, url, httpURLConnection, f);
                if (httpURLConnection != null) {
                    httpURLConnection.close();
                }
                c1738r.m5984a();
            } catch (Throwable th2) {
                graphRequestBatch = th2;
                if (httpURLConnection != null) {
                    httpURLConnection.close();
                }
                throw graphRequestBatch;
            }
        } catch (Throwable th3) {
            graphRequestBatch = th3;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                httpURLConnection.close();
            }
            throw graphRequestBatch;
        }
    }

    /* renamed from: a */
    private static void m4023a(GraphRequestBatch graphRequestBatch, C1738r c1738r, int i, URL url, OutputStream outputStream, boolean z) throws IOException, JSONException {
        C3160c c3160c = new C3160c(outputStream, c1738r, z);
        Map hashMap;
        if (i == 1) {
            GraphRequest a = graphRequestBatch.m4070a(0);
            hashMap = new HashMap();
            for (String str : a.f3124k.keySet()) {
                Object obj = a.f3124k.get(str);
                if (m4040d(obj)) {
                    hashMap.put(str, new C1176a(a, obj));
                }
            }
            if (c1738r != null) {
                c1738r.m5988c("  Parameters:\n");
            }
            m4021a(a.f3124k, c3160c, a);
            if (c1738r != null) {
                c1738r.m5988c("  Attachments:\n");
            }
            m4028a(hashMap, c3160c);
            if (a.f3120g != null) {
                m4030a(a.f3120g, url.getPath(), (C1177b) c3160c);
                return;
            }
            return;
        }
        String g = m4045g(graphRequestBatch);
        if (Utility.m5785a(g) != null) {
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }
        c3160c.mo1562a("batch_app_id", g);
        hashMap = new HashMap();
        m4022a(c3160c, (Collection) graphRequestBatch, hashMap);
        if (c1738r != null) {
            c1738r.m5988c("  Attachments:\n");
        }
        m4028a(hashMap, c3160c);
    }

    /* renamed from: b */
    private static boolean m4036b(String str) {
        Matcher matcher = f3115c.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        if (!str.startsWith(ManagerWebServices.FB_ADJUNCT_USER)) {
            if (str.startsWith("/me/") == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m4030a(JSONObject jSONObject, String str, C1177b c1177b) throws IOException {
        Iterator keys;
        if (m4036b(str)) {
            int indexOf = str.indexOf(":");
            str = str.indexOf("?");
            if (indexOf > 3 && (str == -1 || indexOf < str)) {
                str = true;
                keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    Object opt = jSONObject.opt(str2);
                    boolean z = str == null && str2.equalsIgnoreCase(ManagerWebServices.IG_PARAM_IMAGE);
                    m4026a(str2, opt, c1177b, z);
                }
            }
        }
        str = null;
        keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str22 = (String) keys.next();
            Object opt2 = jSONObject.opt(str22);
            if (str == null) {
            }
            m4026a(str22, opt2, c1177b, z);
        }
    }

    /* renamed from: a */
    private static void m4026a(String str, Object obj, C1177b c1177b, boolean z) throws IOException {
        Class cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    Object[] objArr = new Object[]{str, (String) keys.next()};
                    m4026a(String.format("%s[%s]", objArr), jSONObject.opt((String) keys.next()), c1177b, z);
                }
            } else if (jSONObject.has("id")) {
                m4026a(str, jSONObject.optString("id"), c1177b, z);
            } else if (jSONObject.has("url")) {
                m4026a(str, jSONObject.optString("url"), c1177b, z);
            } else if (jSONObject.has("fbsdk:create_object")) {
                m4026a(str, jSONObject.toString(), c1177b, z);
            }
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                m4026a(String.format(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), jSONArray.opt(i), c1177b, z);
            }
        } else {
            if (!(String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls))) {
                if (!Boolean.class.isAssignableFrom(cls)) {
                    if (Date.class.isAssignableFrom(cls)) {
                        c1177b.mo1562a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
                        return;
                    }
                    return;
                }
            }
            c1177b.mo1562a(str, obj.toString());
        }
    }

    /* renamed from: a */
    private static void m4021a(Bundle bundle, C3160c c3160c, GraphRequest graphRequest) throws IOException {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (m4042e(obj)) {
                c3160c.m12172a(str, obj, graphRequest);
            }
        }
    }

    /* renamed from: a */
    private static void m4028a(Map<String, C1176a> map, C3160c c3160c) throws IOException {
        for (String str : map.keySet()) {
            C1176a c1176a = (C1176a) map.get(str);
            if (m4040d(c1176a.m4009b())) {
                c3160c.m12172a(str, c1176a.m4009b(), c1176a.m4008a());
            }
        }
    }

    /* renamed from: a */
    private static void m4022a(C3160c c3160c, Collection<GraphRequest> collection, Map<String, C1176a> map) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest a : collection) {
            a.m4029a(jSONArray, (Map) map);
        }
        c3160c.m12175a("batch", jSONArray, (Collection) collection);
    }

    /* renamed from: o */
    private static String m4048o() {
        return String.format("multipart/form-data; boundary=%s", new Object[]{"3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"});
    }

    /* renamed from: p */
    private static String m4049p() {
        if (f3116q == null) {
            f3116q = String.format("%s.%s", new Object[]{"FBAndroidSDK", "4.33.0"});
            if (!Utility.m5785a(C1735p.m5970a())) {
                f3116q = String.format(Locale.ROOT, "%s/%s", new Object[]{f3116q, C1735p.m5970a()});
            }
        }
        return f3116q;
    }

    /* renamed from: g */
    private static String m4045g(GraphRequestBatch graphRequestBatch) {
        if (!Utility.m5785a(graphRequestBatch.m4081f())) {
            return graphRequestBatch.m4081f();
        }
        graphRequestBatch = graphRequestBatch.iterator();
        while (graphRequestBatch.hasNext()) {
            AccessToken accessToken = ((GraphRequest) graphRequestBatch.next()).f3117d;
            if (accessToken != null) {
                String applicationId = accessToken.getApplicationId();
                if (applicationId != null) {
                    return applicationId;
                }
            }
        }
        if (Utility.m5785a(f3114b) == null) {
            return f3114b;
        }
        return FacebookSdk.m3998i();
    }

    /* renamed from: d */
    private static boolean m4040d(Object obj) {
        if (!((obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor))) {
            if ((obj instanceof ParcelableResourceWithMimeType) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m4042e(Object obj) {
        if (!((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number))) {
            if ((obj instanceof Date) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static String m4043f(Object obj) {
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
}
