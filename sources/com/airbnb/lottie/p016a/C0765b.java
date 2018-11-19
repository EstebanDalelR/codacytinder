package com.airbnb.lottie.p016a;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable.Callback;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.C0795e;
import com.airbnb.lottie.ImageAssetDelegate;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.airbnb.lottie.a.b */
public class C0765b {
    /* renamed from: a */
    private final Context f2082a;
    /* renamed from: b */
    private String f2083b;
    @Nullable
    /* renamed from: c */
    private ImageAssetDelegate f2084c;
    /* renamed from: d */
    private final Map<String, C0795e> f2085d;
    /* renamed from: e */
    private final Map<String, Bitmap> f2086e = new HashMap();

    public C0765b(Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map<String, C0795e> map) {
        this.f2083b = str;
        if (TextUtils.isEmpty(str) == null && this.f2083b.charAt(this.f2083b.length() - 1) != 47) {
            str = new StringBuilder();
            str.append(this.f2083b);
            str.append('/');
            this.f2083b = str.toString();
        }
        if ((callback instanceof View) == null) {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f2085d = new HashMap();
            this.f2082a = null;
            return;
        }
        this.f2082a = ((View) callback).getContext();
        this.f2085d = map;
        m2698a(imageAssetDelegate);
    }

    /* renamed from: a */
    public void m2698a(@Nullable ImageAssetDelegate imageAssetDelegate) {
        this.f2084c = imageAssetDelegate;
    }

    @Nullable
    /* renamed from: a */
    public Bitmap m2696a(String str) {
        Bitmap bitmap = (Bitmap) this.f2086e.get(str);
        if (bitmap == null) {
            C0795e c0795e = (C0795e) this.f2085d.get(str);
            if (c0795e == null) {
                return null;
            }
            if (this.f2084c != null) {
                bitmap = this.f2084c.fetchBitmap(c0795e);
                if (bitmap != null) {
                    this.f2086e.put(str, bitmap);
                }
                return bitmap;
            }
            try {
                if (TextUtils.isEmpty(this.f2083b)) {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
                AssetManager assets = this.f2082a.getAssets();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.f2083b);
                stringBuilder.append(c0795e.m2865b());
                InputStream open = assets.open(stringBuilder.toString());
                Options options = new Options();
                options.inScaled = true;
                options.inDensity = 160;
                bitmap = BitmapFactory.decodeStream(open, null, options);
                this.f2086e.put(str, bitmap);
            } catch (String str2) {
                Log.w("LOTTIE", "Unable to open asset.", str2);
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    public void m2697a() {
        Iterator it = this.f2086e.entrySet().iterator();
        while (it.hasNext()) {
            ((Bitmap) ((Entry) it.next()).getValue()).recycle();
            it.remove();
        }
    }

    /* renamed from: a */
    public boolean m2699a(Context context) {
        return (!(context == null && this.f2082a == null) && (context == null || this.f2082a.equals(context) == null)) ? null : true;
    }
}
