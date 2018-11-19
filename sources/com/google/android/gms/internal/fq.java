package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.internal.ar;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@zzzv
@TargetApi(8)
public class fq {
    private fq() {
    }

    /* renamed from: a */
    public static boolean m19761a(zzanh zzanh) {
        if (zzanh == null) {
            return false;
        }
        zzanh.onPause();
        return true;
    }

    /* renamed from: b */
    public static boolean m19762b(zzanh zzanh) {
        if (zzanh == null) {
            return false;
        }
        zzanh.onResume();
        return true;
    }

    /* renamed from: e */
    public static boolean m19763e() {
        int myUid = Process.myUid();
        if (myUid != 0) {
            if (myUid != AdError.NETWORK_ERROR_CODE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public int mo4619a() {
        return 0;
    }

    /* renamed from: a */
    public Drawable mo7667a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: a */
    public ku mo6863a(zzanh zzanh, boolean z) {
        return new ku(zzanh, z);
    }

    /* renamed from: a */
    public String mo7668a(Context context) {
        return "";
    }

    /* renamed from: a */
    public String mo7434a(SslError sslError) {
        return "";
    }

    /* renamed from: a */
    public Set<String> mo6864a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        Set linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: a */
    public void mo7621a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            mo7623a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    /* renamed from: a */
    public void mo7622a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo7623a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public boolean mo4620a(Request request) {
        return false;
    }

    /* renamed from: a */
    public boolean mo6865a(Context context, WebSettings webSettings) {
        return false;
    }

    /* renamed from: a */
    public boolean mo8354a(View view) {
        if (view.getWindowToken() == null) {
            if (view.getWindowVisibility() == 8) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo6866a(Window window) {
        return false;
    }

    /* renamed from: b */
    public int mo4621b() {
        return 1;
    }

    /* renamed from: b */
    public void mo7669b(Context context) {
        ar.i().m27325w();
    }

    /* renamed from: b */
    public boolean mo6867b(View view) {
        return false;
    }

    /* renamed from: c */
    public int mo8355c() {
        return 5;
    }

    /* renamed from: c */
    public CookieManager mo8493c(Context context) {
        if (m19763e()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            hx.m19912b("Failed to obtain CookieManager.", th);
            ar.i().m27296a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: c */
    public WebChromeClient mo6868c(zzanh zzanh) {
        return null;
    }

    /* renamed from: c */
    public boolean mo6869c(View view) {
        return false;
    }

    /* renamed from: d */
    public LayoutParams mo8491d() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: f */
    public int mo7435f() {
        return 0;
    }
}
