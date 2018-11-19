package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;

/* renamed from: com.android.volley.toolbox.i */
public class C3006i extends Request<String> {
    private Listener<String> mListener;

    public C3006i(int i, String str, Listener<String> listener, ErrorListener errorListener) {
        super(i, str, errorListener);
        this.mListener = listener;
    }

    public C3006i(String str, Listener<String> listener, ErrorListener errorListener) {
        this(0, str, listener, errorListener);
    }

    protected void onFinish() {
        super.onFinish();
        this.mListener = null;
    }

    protected void deliverResponse(String str) {
        if (this.mListener != null) {
            this.mListener.onResponse(str);
        }
    }

    protected com.android.volley.Response<java.lang.String> parseNetworkResponse(com.android.volley.NetworkResponse r4) {
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
        r3 = this;
        r0 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r1 = r4.f2336b;	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r2 = r4.f2337c;	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r2 = com.android.volley.toolbox.C0915c.m3067a(r2);	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r0.<init>(r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x000e }
        goto L_0x0015;
    L_0x000e:
        r0 = new java.lang.String;
        r1 = r4.f2336b;
        r0.<init>(r1);
    L_0x0015:
        r4 = com.android.volley.toolbox.C0915c.m3066a(r4);
        r4 = com.android.volley.Response.m3042a(r0, r4);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.i.parseNetworkResponse(com.android.volley.NetworkResponse):com.android.volley.Response<java.lang.String>");
    }
}
