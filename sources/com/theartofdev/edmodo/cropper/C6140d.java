package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.ImageView;

/* renamed from: com.theartofdev.edmodo.cropper.d */
final class C6140d extends Animation implements AnimationListener {
    /* renamed from: a */
    private final ImageView f22630a;
    /* renamed from: b */
    private final CropOverlayView f22631b;
    /* renamed from: c */
    private final float[] f22632c = new float[8];
    /* renamed from: d */
    private final float[] f22633d = new float[8];
    /* renamed from: e */
    private final RectF f22634e = new RectF();
    /* renamed from: f */
    private final RectF f22635f = new RectF();
    /* renamed from: g */
    private final float[] f22636g = new float[9];
    /* renamed from: h */
    private final float[] f22637h = new float[9];
    /* renamed from: i */
    private final RectF f22638i = new RectF();
    /* renamed from: j */
    private final float[] f22639j = new float[8];
    /* renamed from: k */
    private final float[] f22640k = new float[9];

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    public C6140d(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f22630a = imageView;
        this.f22631b = cropOverlayView;
        setDuration(300);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    /* renamed from: a */
    public void m26719a(float[] fArr, Matrix matrix) {
        reset();
        System.arraycopy(fArr, 0, this.f22632c, 0, 8);
        this.f22634e.set(this.f22631b.getCropWindowRect());
        matrix.getValues(this.f22636g);
    }

    /* renamed from: b */
    public void m26720b(float[] fArr, Matrix matrix) {
        System.arraycopy(fArr, 0, this.f22633d, 0, 8);
        this.f22635f.set(this.f22631b.getCropWindowRect());
        matrix.getValues(this.f22637h);
    }

    protected void applyTransformation(float f, Transformation transformation) {
        this.f22638i.left = this.f22634e.left + ((this.f22635f.left - this.f22634e.left) * f);
        this.f22638i.top = this.f22634e.top + ((this.f22635f.top - this.f22634e.top) * f);
        this.f22638i.right = this.f22634e.right + ((this.f22635f.right - this.f22634e.right) * f);
        this.f22638i.bottom = this.f22634e.bottom + ((this.f22635f.bottom - this.f22634e.bottom) * f);
        this.f22631b.setCropWindowRect(this.f22638i);
        for (int i = 0; i < this.f22639j.length; i++) {
            this.f22639j[i] = this.f22632c[i] + ((this.f22633d[i] - this.f22632c[i]) * f);
        }
        this.f22631b.m26664a(this.f22639j, this.f22630a.getWidth(), this.f22630a.getHeight());
        for (transformation = null; transformation < this.f22640k.length; transformation++) {
            this.f22640k[transformation] = this.f22636g[transformation] + ((this.f22637h[transformation] - this.f22636g[transformation]) * f);
        }
        f = this.f22630a.getImageMatrix();
        f.setValues(this.f22640k);
        this.f22630a.setImageMatrix(f);
        this.f22630a.invalidate();
        this.f22631b.invalidate();
    }

    public void onAnimationEnd(Animation animation) {
        this.f22630a.clearAnimation();
    }
}
