package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.p124x.C5545m;

/* renamed from: com.google.android.m4b.maps.cg.m */
public final class C6628m extends ImageView implements AnimationListener, C5545m {
    /* renamed from: a */
    private Matrix f24832a;
    /* renamed from: b */
    private Matrix f24833b;
    /* renamed from: c */
    private float f24834c;
    /* renamed from: d */
    private float f24835d;
    /* renamed from: e */
    private boolean f24836e = null;
    /* renamed from: f */
    private Animation f24837f;
    /* renamed from: g */
    private Animation f24838g;
    /* renamed from: h */
    private boolean f24839h;

    public final IBinder asBinder() {
        return null;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public C6628m(Context context, Resources resources) {
        super(context);
        setScaleType(ScaleType.MATRIX);
        setImageDrawable(resources.getDrawable(C4513R.drawable.maps_ic_compass_needle));
        if (VERSION.SDK_INT >= 16) {
            setBackground(resources.getDrawable(C4513R.drawable.maps_button_compass_selector));
        } else {
            setBackgroundDrawable(resources.getDrawable(C4513R.drawable.maps_button_compass_selector));
        }
        this.f24837f = new AlphaAnimation(0.0f, 1.0f);
        this.f24837f.setDuration(100);
        this.f24837f.setAnimationListener(this);
        this.f24838g = new AlphaAnimation(1.0f, 0.0f);
        this.f24838g.setDuration(500);
        this.f24838g.setStartOffset(1600);
        this.f24838g.setAnimationListener(this);
    }

    /* renamed from: a */
    public final void m29540a(boolean z, CameraPosition cameraPosition) {
        this.f24839h = z;
        if (z) {
            setVisibility(true);
            mo5313a(cameraPosition);
            return;
        }
        clearAnimation();
        setVisibility(true);
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f24832a = new Matrix();
        this.f24833b = new Matrix();
        i3 = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        this.f24832a.setRectToRect(new RectF(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight()), i3, ScaleToFit.CENTER);
        m29538a();
    }

    /* renamed from: a */
    public final void mo5313a(CameraPosition cameraPosition) {
        if (this.f24839h) {
            this.f24834c = cameraPosition.bearing;
            this.f24835d = cameraPosition.tilt;
            m29538a();
        }
    }

    /* renamed from: a */
    private void m29538a() {
        float f;
        Object obj;
        if (!(this.f24832a == null || this.f24833b == null)) {
            this.f24833b.set(this.f24832a);
            this.f24833b.postRotate(-this.f24834c, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
            f = (this.f24835d / 90.0f) * 0.7f;
            this.f24833b.postScale(1.0f, 1.0f - f);
            this.f24833b.postTranslate(0.0f, (f / 2.0f) * ((float) getHeight()));
            setImageMatrix(this.f24833b);
        }
        f = this.f24835d;
        float f2 = this.f24834c;
        if (f <= 0.5f) {
            if (f2 >= 0.5f) {
                if (f2 <= 359.5f) {
                    obj = null;
                    if (obj == null) {
                        obj = null;
                        if (obj == null) {
                            if (getVisibility() == 0 && getAnimation() != this.f24838g) {
                                this.f24836e = false;
                                startAnimation(this.f24838g);
                                return;
                            }
                        } else if (getVisibility() != 0 && getAnimation() == this.f24838g) {
                            this.f24836e = true;
                            clearAnimation();
                            return;
                        } else if (getVisibility() == 4 && getAnimation() != this.f24837f) {
                            startAnimation(this.f24837f);
                        }
                    }
                }
            }
            obj = 1;
            if (obj == null) {
                obj = null;
                if (obj == null) {
                    if (getVisibility() != 0) {
                    }
                    startAnimation(this.f24837f);
                } else {
                    this.f24836e = false;
                    startAnimation(this.f24838g);
                    return;
                }
            }
        }
        obj = 1;
        if (obj == null) {
            this.f24836e = false;
            startAnimation(this.f24838g);
            return;
        }
        if (getVisibility() != 0) {
        }
        startAnimation(this.f24837f);
    }

    public final void onAnimationEnd(Animation animation) {
        if (animation == this.f24838g && this.f24839h != null && this.f24836e == null) {
            setVisibility(4);
        }
    }

    public final void onAnimationStart(Animation animation) {
        if (animation == this.f24837f && this.f24839h != null) {
            setVisibility(null);
        }
    }
}
