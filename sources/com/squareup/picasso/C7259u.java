package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build.VERSION;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.squareup.picasso.Downloader.C6078a;
import com.squareup.picasso.Downloader.ResponseException;
import com.tinder.api.ManagerWebServices;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.squareup.picasso.u */
public class C7259u implements Downloader {
    /* renamed from: a */
    static volatile Object f26160a;
    /* renamed from: b */
    private static final Object f26161b = new Object();
    /* renamed from: c */
    private static final ThreadLocal<StringBuilder> f26162c = new C61121();
    /* renamed from: d */
    private final Context f26163d;

    /* renamed from: com.squareup.picasso.u$1 */
    static class C61121 extends ThreadLocal<StringBuilder> {
        C61121() {
        }

        protected /* synthetic */ Object initialValue() {
            return m26558a();
        }

        /* renamed from: a */
        protected StringBuilder m26558a() {
            return new StringBuilder();
        }
    }

    /* renamed from: com.squareup.picasso.u$a */
    private static class C6113a {
        /* renamed from: a */
        static Object m26559a(Context context) throws IOException {
            File b = C6120v.m26581b(context);
            Object installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(b, C6120v.m26566a(b)) : installed;
        }

        /* renamed from: a */
        static void m26560a(java.lang.Object r0) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = (android.net.http.HttpResponseCache) r0;	 Catch:{ IOException -> 0x0005 }
            r0.close();	 Catch:{ IOException -> 0x0005 }
        L_0x0005:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.u.a.a(java.lang.Object):void");
        }
    }

    public C7259u(Context context) {
        this.f26163d = context.getApplicationContext();
    }

    /* renamed from: a */
    protected HttpURLConnection m31084a(Uri uri) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(ManagerWebServices.TIMEOUT_DEFAULT_MS);
        return httpURLConnection;
    }

    public C6078a load(Uri uri, int i) throws IOException {
        if (VERSION.SDK_INT >= 14) {
            C7259u.m31083a(this.f26163d);
        }
        uri = m31084a(uri);
        uri.setUseCaches(true);
        if (i != 0) {
            String str;
            if (NetworkPolicy.isOfflineOnly(i)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder stringBuilder = (StringBuilder) f26162c.get();
                stringBuilder.setLength(0);
                if (!NetworkPolicy.shouldReadFromDiskCache(i)) {
                    stringBuilder.append("no-cache");
                }
                if (!NetworkPolicy.shouldWriteToDiskCache(i)) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(',');
                    }
                    stringBuilder.append("no-store");
                }
                str = stringBuilder.toString();
            }
            uri.setRequestProperty("Cache-Control", str);
        }
        int responseCode = uri.getResponseCode();
        if (responseCode >= MapboxConstants.ANIMATION_DURATION) {
            uri.disconnect();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(responseCode);
            stringBuilder2.append(" ");
            stringBuilder2.append(uri.getResponseMessage());
            throw new ResponseException(stringBuilder2.toString(), i, responseCode);
        }
        long headerFieldInt = (long) uri.getHeaderFieldInt("Content-Length", -1);
        return new C6078a(uri.getInputStream(), C6120v.m26580a(uri.getHeaderField("X-Android-Response-Source")), headerFieldInt);
    }

    public void shutdown() {
        if (VERSION.SDK_INT >= 14 && f26160a != null) {
            C6113a.m26560a(f26160a);
        }
    }

    /* renamed from: a */
    private static void m31083a(android.content.Context r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = f26160a;
        if (r0 != 0) goto L_0x0016;
    L_0x0004:
        r0 = f26161b;	 Catch:{ IOException -> 0x0016 }
        monitor-enter(r0);	 Catch:{ IOException -> 0x0016 }
        r1 = f26160a;	 Catch:{ all -> 0x0013 }
        if (r1 != 0) goto L_0x0011;	 Catch:{ all -> 0x0013 }
    L_0x000b:
        r2 = com.squareup.picasso.C7259u.C6113a.m26559a(r2);	 Catch:{ all -> 0x0013 }
        f26160a = r2;	 Catch:{ all -> 0x0013 }
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x0013 }
        goto L_0x0016;	 Catch:{ all -> 0x0013 }
    L_0x0013:
        r2 = move-exception;	 Catch:{ all -> 0x0013 }
        monitor-exit(r0);	 Catch:{ all -> 0x0013 }
        throw r2;	 Catch:{ IOException -> 0x0016 }
    L_0x0016:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.u.a(android.content.Context):void");
    }
}
