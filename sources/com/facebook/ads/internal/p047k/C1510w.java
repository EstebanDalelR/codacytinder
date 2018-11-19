package com.facebook.ads.internal.p047k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* renamed from: com.facebook.ads.internal.k.w */
public class C1510w {
    /* renamed from: a */
    public static Bitmap m5311a(Context context, C1507t c1507t) {
        byte[] decode = Base64.decode(c1507t.m5304a(an.f4090b), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* renamed from: b */
    public static Drawable m5312b(Context context, C1507t c1507t) {
        return new BitmapDrawable(context.getResources(), C1510w.m5311a(context, c1507t));
    }
}
