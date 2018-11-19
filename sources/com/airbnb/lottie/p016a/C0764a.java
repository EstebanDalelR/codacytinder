package com.airbnb.lottie.p016a;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.Callback;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.C0766a;
import com.airbnb.lottie.model.C0855i;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.a.a */
public class C0764a {
    /* renamed from: a */
    private final C0855i<String> f2076a = new C0855i();
    /* renamed from: b */
    private final Map<C0855i<String>, Typeface> f2077b = new HashMap();
    /* renamed from: c */
    private final Map<String, Typeface> f2078c = new HashMap();
    /* renamed from: d */
    private final AssetManager f2079d;
    @Nullable
    /* renamed from: e */
    private C0766a f2080e;
    /* renamed from: f */
    private String f2081f = ".ttf";

    public C0764a(Callback callback, @Nullable C0766a c0766a) {
        this.f2080e = c0766a;
        if ((callback instanceof View) == null) {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f2079d = null;
            return;
        }
        this.f2079d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    public void m2695a(@Nullable C0766a c0766a) {
        this.f2080e = c0766a;
    }

    /* renamed from: a */
    public Typeface m2694a(String str, String str2) {
        this.f2076a.m2931a(str, str2);
        Typeface typeface = (Typeface) this.f2077b.get(this.f2076a);
        if (typeface != null) {
            return typeface;
        }
        str = m2692a(m2693a(str), str2);
        this.f2077b.put(this.f2076a, str);
        return str;
    }

    /* renamed from: a */
    private Typeface m2693a(String str) {
        Typeface typeface = (Typeface) this.f2078c.get(str);
        if (typeface != null) {
            return typeface;
        }
        typeface = null;
        if (this.f2080e != null) {
            typeface = this.f2080e.m2700a(str);
        }
        if (this.f2080e != null && r0 == null) {
            String b = this.f2080e.m2701b(str);
            if (b != null) {
                typeface = Typeface.createFromAsset(this.f2079d, b);
            }
        }
        if (typeface == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fonts/");
            stringBuilder.append(str);
            stringBuilder.append(this.f2081f);
            typeface = Typeface.createFromAsset(this.f2079d, stringBuilder.toString());
        }
        this.f2078c.put(str, typeface);
        return typeface;
    }

    /* renamed from: a */
    private Typeface m2692a(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        str = str.contains("Bold");
        str = (!contains || str == null) ? contains ? 2 : str != null ? true : null : 3;
        if (typeface.getStyle() == str) {
            return typeface;
        }
        return Typeface.create(typeface, str);
    }
}
