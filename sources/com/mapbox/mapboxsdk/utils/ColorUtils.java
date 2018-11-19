package com.mapbox.mapboxsdk.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.v4.graphics.drawable.C0450a;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.exceptions.ConversionException;
import java.util.regex.Pattern;

public class ColorUtils {
    @android.support.annotation.ColorInt
    public static int getPrimaryColor(@android.support.annotation.NonNull android.content.Context r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new android.util.TypedValue;	 Catch:{ Exception -> 0x0020 }
        r0.<init>();	 Catch:{ Exception -> 0x0020 }
        r1 = r6.getTheme();	 Catch:{ Exception -> 0x0020 }
        r2 = r6.getResources();	 Catch:{ Exception -> 0x0020 }
        r3 = "colorPrimary";	 Catch:{ Exception -> 0x0020 }
        r4 = "attrs";	 Catch:{ Exception -> 0x0020 }
        r5 = r6.getPackageName();	 Catch:{ Exception -> 0x0020 }
        r2 = r2.getIdentifier(r3, r4, r5);	 Catch:{ Exception -> 0x0020 }
        r3 = 1;	 Catch:{ Exception -> 0x0020 }
        r1.resolveAttribute(r2, r0, r3);	 Catch:{ Exception -> 0x0020 }
        r0 = r0.data;	 Catch:{ Exception -> 0x0020 }
        return r0;
    L_0x0020:
        r0 = com.mapbox.mapboxsdk.C5812R.color.mapbox_blue;
        r6 = getColorCompat(r6, r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.utils.ColorUtils.getPrimaryColor(android.content.Context):int");
    }

    @android.support.annotation.ColorInt
    public static int getPrimaryDarkColor(@android.support.annotation.NonNull android.content.Context r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new android.util.TypedValue;	 Catch:{ Exception -> 0x0020 }
        r0.<init>();	 Catch:{ Exception -> 0x0020 }
        r1 = r6.getTheme();	 Catch:{ Exception -> 0x0020 }
        r2 = r6.getResources();	 Catch:{ Exception -> 0x0020 }
        r3 = "colorPrimaryDark";	 Catch:{ Exception -> 0x0020 }
        r4 = "attrs";	 Catch:{ Exception -> 0x0020 }
        r5 = r6.getPackageName();	 Catch:{ Exception -> 0x0020 }
        r2 = r2.getIdentifier(r3, r4, r5);	 Catch:{ Exception -> 0x0020 }
        r3 = 1;	 Catch:{ Exception -> 0x0020 }
        r1.resolveAttribute(r2, r0, r3);	 Catch:{ Exception -> 0x0020 }
        r0 = r0.data;	 Catch:{ Exception -> 0x0020 }
        return r0;
    L_0x0020:
        r0 = com.mapbox.mapboxsdk.C5812R.color.mapbox_blue;
        r6 = getColorCompat(r6, r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.utils.ColorUtils.getPrimaryDarkColor(android.content.Context):int");
    }

    @android.support.annotation.ColorInt
    public static int getAccentColor(@android.support.annotation.NonNull android.content.Context r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new android.util.TypedValue;	 Catch:{ Exception -> 0x0020 }
        r0.<init>();	 Catch:{ Exception -> 0x0020 }
        r1 = r6.getTheme();	 Catch:{ Exception -> 0x0020 }
        r2 = r6.getResources();	 Catch:{ Exception -> 0x0020 }
        r3 = "colorAccent";	 Catch:{ Exception -> 0x0020 }
        r4 = "attrs";	 Catch:{ Exception -> 0x0020 }
        r5 = r6.getPackageName();	 Catch:{ Exception -> 0x0020 }
        r2 = r2.getIdentifier(r3, r4, r5);	 Catch:{ Exception -> 0x0020 }
        r3 = 1;	 Catch:{ Exception -> 0x0020 }
        r1.resolveAttribute(r2, r0, r3);	 Catch:{ Exception -> 0x0020 }
        r0 = r0.data;	 Catch:{ Exception -> 0x0020 }
        return r0;
    L_0x0020:
        r0 = com.mapbox.mapboxsdk.C5812R.color.mapbox_gray;
        r6 = getColorCompat(r6, r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.utils.ColorUtils.getAccentColor(android.content.Context):int");
    }

    @NonNull
    public static ColorStateList getSelector(@ColorInt int i) {
        r2 = new int[2][];
        r2[0] = new int[]{16842919};
        r2[1] = new int[0];
        return new ColorStateList(r2, new int[]{i, i});
    }

    public static void setTintList(@NonNull ImageView imageView, @ColorInt int i) {
        C0450a.a(C0450a.g(imageView.getDrawable()), getSelector(i));
    }

    static int normalizeColorComponent(String str) {
        return (int) (Float.parseFloat(str) * 255.0f);
    }

    @ColorInt
    public static int rgbaToColor(String str) {
        str = Pattern.compile("rgba?\\s*\\(\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,?\\s*(\\d+\\.?\\d*)?\\s*\\)").matcher(str);
        if (str.matches() && str.groupCount() == 3) {
            return Color.rgb(normalizeColorComponent(str.group(1)), normalizeColorComponent(str.group(2)), normalizeColorComponent(str.group(3)));
        }
        if (str.matches() && str.groupCount() == 4) {
            return Color.argb(normalizeColorComponent(str.group(4)), normalizeColorComponent(str.group(1)), normalizeColorComponent(str.group(2)), normalizeColorComponent(str.group(3)));
        }
        throw new ConversionException("Not a valid rgb/rgba value");
    }

    private static int getColorCompat(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getResources().getColor(i, context.getTheme());
        }
        return context.getResources().getColor(i);
    }
}
