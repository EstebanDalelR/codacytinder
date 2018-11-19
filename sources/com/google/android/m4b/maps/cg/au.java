package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.m4b.maps.C4513R;

public class au extends FrameLayout {
    /* renamed from: a */
    protected final Context f19061a;
    /* renamed from: b */
    protected final Resources f19062b;
    /* renamed from: c */
    protected final av f19063c;
    /* renamed from: d */
    private View f19064d;

    /* renamed from: com.google.android.m4b.maps.cg.au$1 */
    class C51391 implements OnClickListener {
        /* renamed from: a */
        private /* synthetic */ au f19060a;

        C51391(au auVar) {
            this.f19060a = auVar;
        }

        public final void onClick(View view) {
            this.f19060a.f19063c.m22901b();
        }
    }

    public au(Context context, Resources resources, av avVar) {
        super(context);
        this.f19061a = context;
        this.f19062b = resources;
        this.f19063c = avVar;
    }

    /* renamed from: a */
    protected final void m22895a(View view, boolean z) {
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a = m22893a(36.0f);
        int a2 = m22893a(11.0f);
        layoutParams.setMargins(a2, a2, a2, a);
        setLayoutParams(layoutParams);
        setBackgroundDrawable(this.f19062b.getDrawable(C4513R.drawable.maps_card_bg));
        setClickable(true);
        if (z) {
            z = new LinearLayout(this.f19061a);
            z.setOrientation(0);
            z.addView(view);
            z.addView(m22894a());
            addView(z);
            return;
        }
        addView(view);
    }

    /* renamed from: a */
    protected final View m22894a() {
        View imageButton = new ImageButton(this.f19061a, null, 16974188);
        imageButton.setImageDrawable(this.f19062b.getDrawable(C4513R.drawable.maps_btn_close));
        int a = m22893a(11.0f);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        imageButton.setPadding(a, a, a, a);
        imageButton.setLayoutParams(layoutParams);
        imageButton.setContentDescription(this.f19062b.getString(C4513R.string.maps_CLOSE_SOFTKEY));
        imageButton.setOnClickListener(new C51391(this));
        this.f19064d = imageButton;
        this.f19064d.setTag("GoogleMapMapsEngineInfocardLayoutCloseButton");
        return imageButton;
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        MeasureSpec.getMode(i);
        MeasureSpec.getMode(i2);
        if (size - (m22893a(11.0f) * 2) >= m22893a(500.0f)) {
            double d = (double) size;
            i2 = (int) Math.min(d, Math.max(0.4d * d, (double) m22893a(1137180672)));
        } else {
            i2 = size;
        }
        int a = (size2 - m22893a(11.0f)) - m22893a(36.0f);
        Object obj = a > m22893a(480.0f) ? 1 : null;
        if (obj == null) {
            obj = (size - (m22893a(11.0f) * 2)) - i2 < m22893a(100.0f) ? 1 : null;
        }
        i = obj != null ? (int) (((double) a) * 0.75d) : size2;
        i2 = Math.min(i2, size);
        i = Math.min(i, size2);
        super.onMeasure(MeasureSpec.makeMeasureSpec(i2, 1073741824), MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE));
        setMeasuredDimension(i2, Math.min(super.getMeasuredHeight(), i));
    }

    /* renamed from: a */
    protected final int m22893a(float f) {
        return (int) Math.ceil((double) TypedValue.applyDimension(1, f, this.f19062b.getDisplayMetrics()));
    }
}
