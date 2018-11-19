package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.squareup.okhttp.C6000c;
import com.squareup.okhttp.C6000c.C5999a;
import com.squareup.okhttp.C6068p;
import com.squareup.okhttp.C6071q.C6070a;
import com.squareup.picasso.Downloader.C6078a;
import com.squareup.picasso.Downloader.ResponseException;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.l */
public class C7257l implements Downloader {
    /* renamed from: a */
    private final C6068p f26158a;

    /* renamed from: b */
    private static C6068p m31078b() {
        C6068p c6068p = new C6068p();
        c6068p.m26295a(15000, TimeUnit.MILLISECONDS);
        c6068p.m26297b(DefaultFastMatchValues.NEW_COUNT_FETCH_INTERVAL, TimeUnit.MILLISECONDS);
        c6068p.m26299c(DefaultFastMatchValues.NEW_COUNT_FETCH_INTERVAL, TimeUnit.MILLISECONDS);
        return c6068p;
    }

    public C7257l(Context context) {
        this(C6120v.m26581b(context));
    }

    public C7257l(File file) {
        this(file, C6120v.m26566a(file));
    }

    public C7257l(java.io.File r3, long r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = com.squareup.picasso.C7257l.m31078b();
        r2.<init>(r0);
        r0 = r2.f26158a;	 Catch:{ IOException -> 0x0011 }
        r1 = new com.squareup.okhttp.b;	 Catch:{ IOException -> 0x0011 }
        r1.<init>(r3, r4);	 Catch:{ IOException -> 0x0011 }
        r0.m26294a(r1);	 Catch:{ IOException -> 0x0011 }
    L_0x0011:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.l.<init>(java.io.File, long):void");
    }

    public C7257l(C6068p c6068p) {
        this.f26158a = c6068p;
    }

    /* renamed from: a */
    protected final C6068p m31079a() {
        return this.f26158a;
    }

    public C6078a load(Uri uri, int i) throws IOException {
        C6000c c6000c;
        if (i == 0) {
            c6000c = null;
        } else if (NetworkPolicy.isOfflineOnly(i)) {
            c6000c = C6000c.f21935b;
        } else {
            C5999a c5999a = new C5999a();
            if (!NetworkPolicy.shouldReadFromDiskCache(i)) {
                c5999a.m25789a();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i)) {
                c5999a.m25791b();
            }
            c6000c = c5999a.m25793d();
        }
        uri = new C6070a().m26332a(uri.toString());
        if (c6000c != null) {
            uri.m26329a(c6000c);
        }
        uri = this.f26158a.m26293a(uri.m26335a()).m25810a();
        int c = uri.m26397c();
        if (c >= MapboxConstants.ANIMATION_DURATION) {
            uri.m26402h().close();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c);
            stringBuilder.append(" ");
            stringBuilder.append(uri.m26399e());
            throw new ResponseException(stringBuilder.toString(), i, c);
        }
        i = uri.m26405k() != 0 ? 1 : 0;
        uri = uri.m26402h();
        return new C6078a(uri.m26412d(), i, uri.mo6486b());
    }

    public void shutdown() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f26158a;
        r0 = r0.m26304h();
        if (r0 == 0) goto L_0x000b;
    L_0x0008:
        r0.m25788b();	 Catch:{ IOException -> 0x000b }
    L_0x000b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.l.shutdown():void");
    }
}
