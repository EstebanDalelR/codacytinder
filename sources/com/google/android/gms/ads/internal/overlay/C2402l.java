package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.overlay.l */
public final class C2402l extends FrameLayout implements OnClickListener {
    /* renamed from: a */
    private final ImageButton f7311a;
    /* renamed from: b */
    private final zzt f7312b;

    public C2402l(Context context, C2403m c2403m, zzt zzt) {
        super(context);
        this.f7312b = zzt;
        setOnClickListener(this);
        this.f7311a = new ImageButton(context);
        this.f7311a.setImageResource(17301527);
        this.f7311a.setBackgroundColor(0);
        this.f7311a.setOnClickListener(this);
        ImageButton imageButton = this.f7311a;
        aja.a();
        int a = hn.a(context, c2403m.f7313a);
        aja.a();
        int a2 = hn.a(context, 0);
        aja.a();
        int a3 = hn.a(context, c2403m.f7314b);
        aja.a();
        imageButton.setPadding(a, a2, a3, hn.a(context, c2403m.f7316d));
        this.f7311a.setContentDescription("Interstitial close button");
        aja.a();
        hn.a(context, c2403m.f7317e);
        View view = this.f7311a;
        aja.a();
        a = hn.a(context, (c2403m.f7317e + c2403m.f7313a) + c2403m.f7314b);
        aja.a();
        addView(view, new LayoutParams(a, hn.a(context, c2403m.f7317e + c2403m.f7316d), 17));
    }

    /* renamed from: a */
    public final void m8732a(boolean z, boolean z2) {
        ImageButton imageButton;
        int i;
        if (!z2) {
            imageButton = this.f7311a;
            i = 0;
        } else if (z) {
            imageButton = this.f7311a;
            i = 4;
        } else {
            imageButton = this.f7311a;
            i = 8;
        }
        imageButton.setVisibility(i);
    }

    public final void onClick(View view) {
        if (this.f7312b != null) {
            this.f7312b.zzmt();
        }
    }
}
