package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.graphics.C0443a;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.ads.internal.adapters.C1359i;
import com.facebook.ads.internal.p047k.an;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.component.d */
public class C1598d extends LinearLayout {
    /* renamed from: a */
    private final int f4425a;
    /* renamed from: b */
    private final int f4426b;
    /* renamed from: c */
    private final int f4427c;
    /* renamed from: d */
    private int f4428d = -1;
    /* renamed from: e */
    private List<GradientDrawable> f4429e;

    public C1598d(Context context, C1359i c1359i, int i) {
        super(context);
        setOrientation(0);
        setGravity(17);
        float f = an.f4090b;
        int i2 = (int) (8.0f * f);
        int i3 = (int) (6.0f * f);
        this.f4427c = (int) (f * 1.0f);
        this.f4425a = c1359i.m4753a(false);
        this.f4426b = C0443a.m1688c(this.f4425a, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        this.f4429e = new ArrayList();
        for (int i4 = 0; i4 < i; i4++) {
            Drawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i2, i2);
            gradientDrawable.setStroke(this.f4427c, 0);
            View imageView = new ImageView(context);
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i3, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.f4429e.add(gradientDrawable);
            addView(imageView);
        }
        m5466a(0);
    }

    /* renamed from: a */
    public void m5466a(int i) {
        if (this.f4428d != i) {
            this.f4428d = i;
            for (int i2 = 0; i2 < this.f4429e.size(); i2++) {
                int i3;
                int i4;
                if (i2 == i) {
                    i3 = this.f4425a;
                    i4 = this.f4425a;
                } else {
                    i3 = this.f4426b;
                    i4 = 0;
                }
                ((GradientDrawable) this.f4429e.get(i2)).setStroke(this.f4427c, i4);
                ((GradientDrawable) this.f4429e.get(i2)).setColor(i3);
                ((GradientDrawable) this.f4429e.get(i2)).invalidateSelf();
            }
        }
    }
}
