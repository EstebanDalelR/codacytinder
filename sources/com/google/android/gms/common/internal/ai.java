package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.C0450a;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.C2335R;
import com.google.android.gms.common.util.C2521f;

public final class ai extends Button {
    public ai(Context context) {
        this(context, null);
    }

    private ai(Context context, AttributeSet attributeSet) {
        super(context, null, 16842824);
    }

    /* renamed from: a */
    private static int m9058a(int i, int i2, int i3, int i4) {
        switch (i) {
            case 0:
                return i2;
            case 1:
                return i3;
            case 2:
                return i4;
            default:
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Unknown color scheme: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final void m9059a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        i3 = m9058a(i2, C2335R.drawable.common_google_signin_btn_icon_dark, C2335R.drawable.common_google_signin_btn_icon_light, C2335R.drawable.common_google_signin_btn_icon_light);
        int a = m9058a(i2, C2335R.drawable.common_google_signin_btn_text_dark, C2335R.drawable.common_google_signin_btn_text_light, C2335R.drawable.common_google_signin_btn_text_light);
        switch (i) {
            case 0:
            case 1:
                i3 = a;
                break;
            case 2:
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("Unknown button size: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        Drawable g = C0450a.m1730g(resources.getDrawable(i3));
        C0450a.m1719a(g, resources.getColorStateList(C2335R.color.common_google_signin_btn_tint));
        C0450a.m1722a(g, Mode.SRC_ATOP);
        setBackgroundDrawable(g);
        setTextColor((ColorStateList) ad.m9045a(resources.getColorStateList(m9058a(i2, C2335R.color.common_google_signin_btn_text_dark, C2335R.color.common_google_signin_btn_text_light, C2335R.color.common_google_signin_btn_text_light))));
        switch (i) {
            case 0:
                i = C2335R.string.common_signin_button_text;
                break;
            case 1:
                i = C2335R.string.common_signin_button_text_long;
                break;
            case 2:
                setText(null);
                break;
            default:
                stringBuilder = new StringBuilder(32);
                stringBuilder.append("Unknown button size: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        setText(resources.getString(i));
        setTransformationMethod(null);
        if (C2521f.m9199a(getContext())) {
            setGravity(19);
        }
    }
}
