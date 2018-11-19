package com.tinder.utils;

import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.PluralsRes;
import android.support.annotation.StringRes;
import android.support.v4.content.C0432b;
import android.view.View;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\b\u001a'\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\b\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\u00032\u0006\u0010\t\u001a\u00020\b\u001a\u0014\u0010\n\u001a\u00020\u0006*\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u001a\u0018\u0010\f\u001a\u00020\r*\u00020\u00032\f\b\u0001\u0010\u000e\u001a\u00020\r\"\u00020\u0006\u001a\u0014\u0010\u000f\u001a\u00020\b*\u00020\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0006\u001a\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0006\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006\u001a-\u0010\u0018\u001a\u00020\u0015*\u00020\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u001b\"\u00020\u0015¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, d2 = {"bindView", "Lkotlin/Lazy;", "T", "Landroid/view/View;", "Landroid/app/Activity;", "resId", "", "dpToPx", "", "dp", "getColor", "colorRes", "getColorArray", "", "ids", "getDimen", "dimen", "getDrawable", "Landroid/graphics/drawable/Drawable;", "drawableRes", "getQuantityString", "", "plural", "quantity", "getString", "string", "args", "", "(Landroid/view/View;I[Ljava/lang/String;)Ljava/lang/String;", "base_release"}, k = 2, mv = {1, 1, 10})
public final class au {
    /* renamed from: a */
    public static final float m57647a(@NotNull View view, @DimenRes int i) {
        C2668g.b(view, "$receiver");
        return view.getResources().getDimension(i);
    }

    @NotNull
    /* renamed from: a */
    public static final String m57649a(@NotNull View view, @StringRes int i, @NotNull String... strArr) {
        C2668g.b(view, "$receiver");
        C2668g.b(strArr, "args");
        if ((strArr.length == 0 ? 1 : null) != null) {
            view = view.getResources().getString(i);
            C2668g.a(view, "resources.getString(string)");
            return view;
        }
        view = view.getResources().getString(i, Arrays.copyOf(strArr, strArr.length));
        C2668g.a(view, "resources.getString(string, *args)");
        return view;
    }

    @NotNull
    /* renamed from: a */
    public static final String m57648a(@NotNull View view, @PluralsRes int i, int i2) {
        C2668g.b(view, "$receiver");
        view = view.getResources().getQuantityString(i, i2);
        C2668g.a(view, "resources.getQuantityString(plural, quantity)");
        return view;
    }

    @NotNull
    /* renamed from: b */
    public static final Drawable m57651b(@NotNull View view, @DrawableRes int i) {
        C2668g.b(view, "$receiver");
        view = C0432b.a(view.getContext(), i);
        if (view == null) {
            C2668g.a();
        }
        return view;
    }

    /* renamed from: c */
    public static final int m57652c(@NotNull View view, @ColorRes int i) {
        C2668g.b(view, "$receiver");
        return C0432b.c(view.getContext(), i);
    }

    @NotNull
    /* renamed from: a */
    public static final int[] m57650a(@NotNull View view, @NotNull @ColorRes int... iArr) {
        C2668g.b(view, "$receiver");
        C2668g.b(iArr, "ids");
        int[] iArr2 = new int[iArr.length];
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            iArr2[i] = C0432b.c(view.getContext(), iArr[i]);
        }
        return iArr2;
    }

    /* renamed from: a */
    public static final float m57646a(@NotNull View view, float f) {
        C2668g.b(view, "$receiver");
        view = view.getResources();
        C2668g.a(view, "resources");
        return f * view.getDisplayMetrics().density;
    }
}
