package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: io.fabric.sdk.android.services.settings.m */
public class C15662m {
    /* renamed from: a */
    public final String f48488a;
    /* renamed from: b */
    public final int f48489b;
    /* renamed from: c */
    public final int f48490c;
    /* renamed from: d */
    public final int f48491d;

    public C15662m(String str, int i, int i2, int i3) {
        this.f48488a = str;
        this.f48489b = i;
        this.f48490c = i2;
        this.f48491d = i3;
    }

    /* renamed from: a */
    public static C15662m m58822a(Context context, String str) {
        if (str != null) {
            try {
                int l = CommonUtils.m58626l(context);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("App icon resource ID is ");
                stringBuilder.append(l);
                C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), l, options);
                return new C15662m(str, l, options.outWidth, options.outHeight);
            } catch (Context context2) {
                C15608c.m58560h().mo12794e("Fabric", "Failed to load icon", context2);
            }
        }
        return null;
    }
}
