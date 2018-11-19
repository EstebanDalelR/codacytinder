package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.C2273b.C2272f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class AspectRatioFrameLayout extends FrameLayout {
    /* renamed from: a */
    private final C2258a f6697a;
    /* renamed from: b */
    private AspectRatioListener f6698b;
    /* renamed from: c */
    private float f6699c;
    /* renamed from: d */
    private int f6700d;

    public interface AspectRatioListener {
        void onAspectRatioUpdated(float f, float f2, boolean z);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$a */
    private final class C2258a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ AspectRatioFrameLayout f6692a;
        /* renamed from: b */
        private float f6693b;
        /* renamed from: c */
        private float f6694c;
        /* renamed from: d */
        private boolean f6695d;
        /* renamed from: e */
        private boolean f6696e;

        private C2258a(AspectRatioFrameLayout aspectRatioFrameLayout) {
            this.f6692a = aspectRatioFrameLayout;
        }

        /* renamed from: a */
        public void m8128a(float f, float f2, boolean z) {
            this.f6693b = f;
            this.f6694c = f2;
            this.f6695d = z;
            if (this.f6696e == null) {
                this.f6696e = true;
                this.f6692a.post(this);
            }
        }

        public void run() {
            this.f6696e = false;
            if (this.f6692a.f6698b != null) {
                this.f6692a.f6698b.onAspectRatioUpdated(this.f6693b, this.f6694c, this.f6695d);
            }
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6700d = 0;
        if (attributeSet != null) {
            context = context.getTheme().obtainStyledAttributes(attributeSet, C2272f.AspectRatioFrameLayout, 0, 0);
            try {
                this.f6700d = context.getInt(C2272f.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                context.recycle();
            }
        }
        this.f6697a = new C2258a();
    }

    public void setAspectRatio(float f) {
        if (this.f6699c != f) {
            this.f6699c = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(AspectRatioListener aspectRatioListener) {
        this.f6698b = aspectRatioListener;
    }

    public int getResizeMode() {
        return this.f6700d;
    }

    public void setResizeMode(int i) {
        if (this.f6700d != i) {
            this.f6700d = i;
            requestLayout();
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6699c > 0) {
            i = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = (float) i;
            float f2 = (float) measuredHeight;
            float f3 = f / f2;
            float f4 = (this.f6699c / f3) - 1.0f;
            if (Math.abs(f4) <= 0.01f) {
                this.f6697a.m8128a(this.f6699c, f3, false);
                return;
            }
            int i3 = this.f6700d;
            if (i3 != 4) {
                switch (i3) {
                    case 0:
                        if (f4 <= 0.0f) {
                            i = (int) (f2 * this.f6699c);
                            break;
                        } else {
                            measuredHeight = (int) (f / this.f6699c);
                            break;
                        }
                    case 1:
                        measuredHeight = (int) (f / this.f6699c);
                        break;
                    case 2:
                        i = (int) (f2 * this.f6699c);
                        break;
                    default:
                        break;
                }
            } else if (f4 > 0.0f) {
                i = (int) (f2 * this.f6699c);
            } else {
                measuredHeight = (int) (f / this.f6699c);
            }
            this.f6697a.m8128a(this.f6699c, f3, true);
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }
}
