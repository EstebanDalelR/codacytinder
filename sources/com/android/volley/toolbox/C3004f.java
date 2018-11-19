package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;

/* renamed from: com.android.volley.toolbox.f */
public abstract class C3004f<T> extends Request<T> {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", new Object[]{"utf-8"});
    private Listener<T> mListener;
    private final String mRequestBody;

    protected abstract Response<T> parseNetworkResponse(NetworkResponse networkResponse);

    public C3004f(String str, String str2, Listener<T> listener, ErrorListener errorListener) {
        this(-1, str, str2, listener, errorListener);
    }

    public C3004f(int i, String str, String str2, Listener<T> listener, ErrorListener errorListener) {
        super(i, str, errorListener);
        this.mListener = listener;
        this.mRequestBody = str2;
    }

    protected void onFinish() {
        super.onFinish();
        this.mListener = null;
    }

    protected void deliverResponse(T t) {
        if (this.mListener != null) {
            this.mListener.onResponse(t);
        }
    }

    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    public byte[] getPostBody() {
        return getBody();
    }

    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    public byte[] getBody() {
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
        r5 = this;
        r0 = 0;
        r1 = r5.mRequestBody;	 Catch:{ UnsupportedEncodingException -> 0x0010 }
        if (r1 != 0) goto L_0x0006;	 Catch:{ UnsupportedEncodingException -> 0x0010 }
    L_0x0005:
        goto L_0x000f;	 Catch:{ UnsupportedEncodingException -> 0x0010 }
    L_0x0006:
        r1 = r5.mRequestBody;	 Catch:{ UnsupportedEncodingException -> 0x0010 }
        r2 = "utf-8";	 Catch:{ UnsupportedEncodingException -> 0x0010 }
        r1 = r1.getBytes(r2);	 Catch:{ UnsupportedEncodingException -> 0x0010 }
        r0 = r1;
    L_0x000f:
        return r0;
    L_0x0010:
        r1 = "Unsupported Encoding while trying to get the bytes of %s using %s";
        r2 = 2;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r5.mRequestBody;
        r2[r3] = r4;
        r3 = 1;
        r4 = "utf-8";
        r2[r3] = r4;
        com.android.volley.C0911f.m3059d(r1, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.f.getBody():byte[]");
    }
}
