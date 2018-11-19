package com.snapchat.kit.sdk.bitmoji.networking;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5890a;
import com.squareup.okhttp.C6000c;
import com.squareup.okhttp.C6000c.C5999a;
import com.squareup.okhttp.C6068p;
import com.squareup.okhttp.C6071q.C6070a;
import com.squareup.picasso.C7257l;
import com.squareup.picasso.Downloader.C6078a;
import com.squareup.picasso.Downloader.ResponseException;
import com.squareup.picasso.NetworkPolicy;
import java.io.IOException;
import javax.inject.Inject;

/* renamed from: com.snapchat.kit.sdk.bitmoji.networking.c */
public class C7864c extends C7257l {
    /* renamed from: a */
    private final C5890a f28372a;

    @Inject
    C7864c(C5890a c5890a, C6068p c6068p) {
        super(c6068p);
        this.f28372a = c5890a;
    }

    public C6078a load(@NonNull Uri uri, int i) throws IOException {
        C6000c c6000c;
        this.f28372a.m25425a("imageload:solomoji", 1);
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
        long currentTimeMillis = System.currentTimeMillis();
        uri = m31079a().m26293a(uri.m26335a()).m25810a();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        int c = uri.m26397c();
        if (c >= MapboxConstants.ANIMATION_DURATION) {
            uri.m26402h().close();
            m33660a(c, currentTimeMillis2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c);
            stringBuilder.append(" ");
            stringBuilder.append(uri.m26399e());
            throw new ResponseException(stringBuilder.toString(), i, c);
        }
        i = uri.m26405k() != 0 ? 1 : 0;
        if (i == 0) {
            m33660a(Callback.DEFAULT_DRAG_ANIMATION_DURATION, currentTimeMillis2);
        }
        uri = uri.m26402h();
        return new C6078a(uri.m26412d(), i, uri.mo6486b());
    }

    /* renamed from: a */
    private void m33660a(int i, long j) {
        this.f28372a.m25425a(String.format("request:solomoji:%s", new Object[]{Integer.valueOf(i)}), 1);
        this.f28372a.m25426a("request:solomoji", j, 0.05f);
    }
}
