package com.tinder.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tinder.R;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Badge.Type;
import com.tinder.domain.common.model.User;

public class BadgeView extends ImageView {
    /* renamed from: a */
    private boolean f47719a = false;
    /* renamed from: b */
    private boolean f47720b = false;

    /* renamed from: com.tinder.views.BadgeView$1 */
    static /* synthetic */ class C154261 {
        /* renamed from: a */
        static final /* synthetic */ int[] f47718a = new int[Type.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.domain.common.model.Badge.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            f47718a = r0;
            r0 = f47718a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.domain.common.model.Badge.Type.VERIFIED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f47718a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.domain.common.model.Badge.Type.PEOPLE_MAG;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f47718a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.tinder.domain.common.model.Badge.Type.DEFAULT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.views.BadgeView.1.<clinit>():void");
        }
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m57829a();
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m57829a();
    }

    @TargetApi(21)
    public BadgeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m57829a();
    }

    public BadgeView(Context context) {
        super(context);
        m57829a();
    }

    /* renamed from: a */
    private void m57829a() {
        setScaleType(ScaleType.FIT_CENTER);
    }

    public void setFiltered(boolean z) {
        this.f47719a = z;
        invalidate();
    }

    public void setBordered(boolean z) {
        this.f47720b = z;
    }

    /* renamed from: a */
    public void m57832a(@Nullable User user) {
        if (user != null) {
            if (user.badges().isEmpty()) {
                setImageAndVisibility(false);
            } else {
                switch (C154261.f47718a[((Badge) user.badges().get(0)).type().ordinal()]) {
                    case 1:
                        setImageResource(this.f47720b != null ? R.drawable.verification_badge_bordered : R.drawable.verification_badge);
                        setVisibility(0);
                        break;
                    case 2:
                        setImageResource(R.drawable.people_magazine_badge);
                        setVisibility(0);
                        break;
                    default:
                        m57830b();
                        break;
                }
                m57831c();
            }
        }
    }

    private void setImageAndVisibility(boolean z) {
        if (z) {
            setImageResource(this.f47720b ? true : true);
            setVisibility(false);
            return;
        }
        m57830b();
    }

    /* renamed from: b */
    private void m57830b() {
        setImageResource(17170445);
        setVisibility(8);
    }

    /* renamed from: c */
    private void m57831c() {
        if (this.f47719a) {
            setColorFilter(-1);
        } else {
            clearColorFilter();
        }
    }
}
