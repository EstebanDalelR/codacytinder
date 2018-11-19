package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.dynamic.C4296b;
import java.util.List;

@zzzv
public final class aml extends RelativeLayout {
    /* renamed from: a */
    private static final float[] f15506a = new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    @Nullable
    /* renamed from: b */
    private AnimationDrawable f15507b;

    public aml(Context context, amk amk, LayoutParams layoutParams) {
        View textView;
        super(context);
        ad.a(amk);
        Drawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f15506a, null, null));
        shapeDrawable.getPaint().setColor(amk.m31440b());
        setLayoutParams(layoutParams);
        ar.g().mo7622a((View) this, shapeDrawable);
        ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(amk.getText())) {
            ViewGroup.LayoutParams layoutParams3 = new LayoutParams(-2, -2);
            textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(amk.getText());
            textView.setTextColor(amk.m31441c());
            textView.setTextSize((float) amk.m31442d());
            aja.m19216a();
            int a = hn.m19861a(context, 4);
            aja.m19216a();
            textView.setPadding(a, 0, hn.m19861a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        textView = new ImageView(context);
        textView.setLayoutParams(layoutParams2);
        textView.setId(1195835394);
        List<amm> a2 = amk.m31439a();
        if (a2 != null && a2.size() > 1) {
            this.f15507b = new AnimationDrawable();
            for (amm zzjr : a2) {
                try {
                    this.f15507b.addFrame((Drawable) C4296b.a(zzjr.zzjr()), amk.m31443e());
                } catch (Throwable e) {
                    hx.m19912b("Error while getting drawable.", e);
                }
            }
            ar.g().mo7622a(textView, this.f15507b);
        } else if (a2.size() == 1) {
            try {
                textView.setImageDrawable((Drawable) C4296b.a(((amm) a2.get(0)).zzjr()));
            } catch (Throwable e2) {
                hx.m19912b("Error while getting drawable.", e2);
            }
        }
        addView(textView);
    }

    public final void onAttachedToWindow() {
        if (this.f15507b != null) {
            this.f15507b.start();
        }
        super.onAttachedToWindow();
    }
}
