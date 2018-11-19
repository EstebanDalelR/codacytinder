package android.support.v4.content.res;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.support.annotation.AnyRes;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.StyleableRes;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.content.res.b */
public class C0442b {
    /* renamed from: a */
    public static boolean m1676a(@NonNull XmlPullParser xmlPullParser, @NonNull String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null ? true : null;
    }

    /* renamed from: a */
    public static float m1671a(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, float f) {
        if (C0442b.m1676a(xmlPullParser, str) == null) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static boolean m1675a(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, boolean z) {
        if (C0442b.m1676a(xmlPullParser, str) == null) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static int m1672a(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, int i2) {
        if (C0442b.m1676a(xmlPullParser, str) == null) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    @ColorInt
    /* renamed from: b */
    public static int m1677b(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, @ColorInt int i2) {
        if (C0442b.m1676a(xmlPullParser, str) == null) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    @AnyRes
    /* renamed from: c */
    public static int m1679c(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, @AnyRes int i2) {
        if (C0442b.m1676a(xmlPullParser, str) == null) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    @Nullable
    /* renamed from: a */
    public static String m1674a(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i) {
        if (C0442b.m1676a(xmlPullParser, str) == null) {
            return null;
        }
        return typedArray.getString(i);
    }

    @Nullable
    /* renamed from: b */
    public static TypedValue m1678b(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, int i) {
        if (C0442b.m1676a(xmlPullParser, str) == null) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    @NonNull
    /* renamed from: a */
    public static TypedArray m1673a(@NonNull Resources resources, @Nullable Theme theme, @NonNull AttributeSet attributeSet, @NonNull int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
