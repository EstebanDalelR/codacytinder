package com.facebook;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.Log;
import com.facebook.internal.C1738r;
import com.facebook.internal.Utility;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class GraphResponse {
    /* renamed from: a */
    private static final String f3137a = "GraphResponse";
    /* renamed from: b */
    private final HttpURLConnection f3138b;
    /* renamed from: c */
    private final JSONObject f3139c;
    /* renamed from: d */
    private final JSONArray f3140d;
    /* renamed from: e */
    private final FacebookRequestError f3141e;
    /* renamed from: f */
    private final String f3142f;
    /* renamed from: g */
    private final GraphRequest f3143g;

    public enum PagingDirection {
        NEXT,
        PREVIOUS
    }

    GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
    }

    GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
    }

    GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
    }

    GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f3143g = graphRequest;
        this.f3138b = httpURLConnection;
        this.f3142f = str;
        this.f3139c = jSONObject;
        this.f3140d = jSONArray;
        this.f3141e = facebookRequestError;
    }

    /* renamed from: a */
    public final FacebookRequestError m4092a() {
        return this.f3141e;
    }

    /* renamed from: b */
    public final JSONObject m4093b() {
        return this.f3139c;
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
        r4 = r5.f3138b;	 Catch:{ IOException -> 0x0020 }
        if (r4 == 0) goto L_0x0013;	 Catch:{ IOException -> 0x0020 }
    L_0x000c:
        r4 = r5.f3138b;	 Catch:{ IOException -> 0x0020 }
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
        r2 = "{Response: ";
        r1.append(r2);
        r2 = " responseCode: ";
        r1.append(r2);
        r1.append(r0);
        r0 = ", graphObject: ";
        r1.append(r0);
        r0 = r5.f3139c;
        r1.append(r0);
        r0 = ", error: ";
        r1.append(r0);
        r0 = r5.f3141e;
        r1.append(r0);
        r0 = "}";
        r1.append(r0);
        r0 = r1.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphResponse.toString():java.lang.String");
    }

    /* renamed from: a */
    static List<GraphResponse> m4089a(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        List<GraphResponse> a;
        Closeable closeable = null;
        try {
            InputStream errorStream;
            if (httpURLConnection.getResponseCode() >= 400) {
                errorStream = httpURLConnection.getErrorStream();
            } else {
                errorStream = httpURLConnection.getInputStream();
            }
            closeable = errorStream;
            a = m4087a((InputStream) closeable, httpURLConnection, graphRequestBatch);
            return a;
        } catch (FacebookException e) {
            a = e;
            C1738r.m5979a(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", a);
            httpURLConnection = m4091a((List) graphRequestBatch, httpURLConnection, (FacebookException) a);
            return httpURLConnection;
        } catch (Exception e2) {
            a = e2;
            C1738r.m5979a(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", a);
            httpURLConnection = m4091a((List) graphRequestBatch, httpURLConnection, new FacebookException((Throwable) a));
            return httpURLConnection;
        } finally {
            Utility.m5774a(closeable);
        }
    }

    /* renamed from: a */
    static List<GraphResponse> m4087a(InputStream inputStream, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) throws FacebookException, JSONException, IOException {
        C1738r.m5979a(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(Utility.m5757a(inputStream).length()), r6);
        return m4088a(Utility.m5757a(inputStream), httpURLConnection, graphRequestBatch);
    }

    /* renamed from: a */
    static List<GraphResponse> m4088a(String str, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) throws FacebookException, JSONException, IOException {
        C1738r.m5979a(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", graphRequestBatch.m4077b(), Integer.valueOf(str.length()), m4090a(httpURLConnection, (List) graphRequestBatch, new JSONTokener(str).nextValue()));
        return m4090a(httpURLConnection, (List) graphRequestBatch, new JSONTokener(str).nextValue());
    }

    /* renamed from: a */
    private static List<GraphResponse> m4090a(HttpURLConnection httpURLConnection, List<GraphRequest> list, Object obj) throws FacebookException, JSONException {
        JSONArray jSONArray;
        GraphRequest graphRequest;
        int size = list.size();
        List<GraphResponse> arrayList = new ArrayList(size);
        int i = 0;
        if (size == 1) {
            GraphRequest graphRequest2 = (GraphRequest) list.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", obj);
                jSONObject.put("code", httpURLConnection != null ? httpURLConnection.getResponseCode() : Callback.DEFAULT_DRAG_ANIMATION_DURATION);
                jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
            } catch (Exception e) {
                arrayList.add(new GraphResponse(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e)));
            } catch (Exception e2) {
                arrayList.add(new GraphResponse(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e2)));
            }
            if (jSONArray instanceof JSONArray) {
                jSONArray = jSONArray;
                if (jSONArray.length() != size) {
                    while (i < jSONArray.length()) {
                        graphRequest = (GraphRequest) list.get(i);
                        try {
                            arrayList.add(m4086a(graphRequest, httpURLConnection, jSONArray.get(i), obj));
                        } catch (Exception e3) {
                            arrayList.add(new GraphResponse(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e3)));
                        } catch (Exception e32) {
                            arrayList.add(new GraphResponse(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e32)));
                        }
                        i++;
                    }
                    return arrayList;
                }
            }
            throw new FacebookException("Unexpected number of results");
        }
        jSONArray = obj;
        if (jSONArray instanceof JSONArray) {
            jSONArray = jSONArray;
            if (jSONArray.length() != size) {
                while (i < jSONArray.length()) {
                    graphRequest = (GraphRequest) list.get(i);
                    arrayList.add(m4086a(graphRequest, httpURLConnection, jSONArray.get(i), obj));
                    i++;
                }
                return arrayList;
            }
        }
        throw new FacebookException("Unexpected number of results");
    }

    /* renamed from: a */
    private static GraphResponse m4086a(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            obj2 = FacebookRequestError.checkResponseAndCreateError(jSONObject, obj2, httpURLConnection);
            if (obj2 != null) {
                Log.e(f3137a, obj2.toString());
                if (obj2.getErrorCode() == 190 && Utility.m5783a(graphRequest.m4062f()) != null) {
                    if (obj2.getSubErrorCode() != 493) {
                        AccessToken.setCurrentAccessToken(null);
                    } else if (AccessToken.getCurrentAccessToken().isExpired() == null) {
                        AccessToken.expireCurrentAccessToken();
                    }
                }
                return new GraphResponse(graphRequest, httpURLConnection, obj2);
            }
            obj = Utility.m5753a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if ((obj instanceof JSONObject) != null) {
                return new GraphResponse(graphRequest, httpURLConnection, obj.toString(), (JSONObject) obj);
            }
            if ((obj instanceof JSONArray) != null) {
                return new GraphResponse(graphRequest, httpURLConnection, obj.toString(), (JSONArray) obj);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new GraphResponse(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        httpURLConnection = new StringBuilder();
        httpURLConnection.append("Got unexpected object type in response, class: ");
        httpURLConnection.append(obj.getClass().getSimpleName());
        throw new FacebookException(httpURLConnection.toString());
    }

    /* renamed from: a */
    static List<GraphResponse> m4091a(List<GraphRequest> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        int size = list.size();
        List<GraphResponse> arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new GraphResponse((GraphRequest) list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) facebookException)));
        }
        return arrayList;
    }
}
