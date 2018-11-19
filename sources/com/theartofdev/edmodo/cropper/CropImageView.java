package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.theartofdev.edmodo.cropper.C6134a.C6133a;
import com.theartofdev.edmodo.cropper.C6136b.C6135a;
import com.theartofdev.edmodo.cropper.C6148f.C6143b;
import com.theartofdev.edmodo.cropper.C6148f.C6144c;
import com.theartofdev.edmodo.cropper.C6148f.C6147f;
import com.theartofdev.edmodo.cropper.CropOverlayView.CropWindowChangeListener;
import java.lang.ref.WeakReference;
import java.util.UUID;

public class CropImageView extends FrameLayout {
    /* renamed from: A */
    private RectF f22519A;
    /* renamed from: B */
    private boolean f22520B;
    /* renamed from: C */
    private WeakReference<C6136b> f22521C;
    /* renamed from: D */
    private WeakReference<C6134a> f22522D;
    /* renamed from: a */
    private final ImageView f22523a;
    /* renamed from: b */
    private final CropOverlayView f22524b;
    /* renamed from: c */
    private final Matrix f22525c;
    /* renamed from: d */
    private final Matrix f22526d;
    /* renamed from: e */
    private final ProgressBar f22527e;
    /* renamed from: f */
    private final float[] f22528f;
    /* renamed from: g */
    private C6140d f22529g;
    /* renamed from: h */
    private Bitmap f22530h;
    /* renamed from: i */
    private int f22531i;
    /* renamed from: j */
    private int f22532j;
    /* renamed from: k */
    private int f22533k;
    /* renamed from: l */
    private int f22534l;
    /* renamed from: m */
    private ScaleType f22535m;
    /* renamed from: n */
    private boolean f22536n;
    /* renamed from: o */
    private boolean f22537o;
    /* renamed from: p */
    private boolean f22538p;
    /* renamed from: q */
    private int f22539q;
    /* renamed from: r */
    private OnSetImageUriCompleteListener f22540r;
    /* renamed from: s */
    private OnCropImageCompleteListener f22541s;
    @Deprecated
    /* renamed from: t */
    private OnGetCroppedImageCompleteListener f22542t;
    @Deprecated
    /* renamed from: u */
    private OnSaveCroppedImageCompleteListener f22543u;
    /* renamed from: v */
    private Uri f22544v;
    /* renamed from: w */
    private int f22545w;
    /* renamed from: x */
    private float f22546x;
    /* renamed from: y */
    private float f22547y;
    /* renamed from: z */
    private float f22548z;

    public enum CropShape {
        RECTANGLE,
        OVAL
    }

    public enum Guidelines {
        OFF,
        ON_TOUCH,
        ON
    }

    public interface OnCropImageCompleteListener {
        void onCropImageComplete(CropImageView cropImageView, C6129a c6129a);
    }

    @Deprecated
    public interface OnGetCroppedImageCompleteListener {
        void onGetCroppedImageComplete(CropImageView cropImageView, Bitmap bitmap, Exception exception);
    }

    @Deprecated
    public interface OnSaveCroppedImageCompleteListener {
        void onSaveCroppedImageComplete(CropImageView cropImageView, Uri uri, Exception exception);
    }

    public interface OnSetImageUriCompleteListener {
        void onSetImageUriComplete(CropImageView cropImageView, Uri uri, Exception exception);
    }

    public enum RequestSizeOptions {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    public enum ScaleType {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$a */
    public static class C6129a {
        private final Bitmap mBitmap;
        private final float[] mCropPoints;
        private final Rect mCropRect;
        private final Exception mError;
        private final int mRotation;
        private final int mSampleSize;
        private final Uri mUri;

        C6129a(Bitmap bitmap, Uri uri, Exception exception, float[] fArr, Rect rect, int i, int i2) {
            this.mBitmap = bitmap;
            this.mUri = uri;
            this.mError = exception;
            this.mCropPoints = fArr;
            this.mCropRect = rect;
            this.mRotation = i;
            this.mSampleSize = i2;
        }

        public boolean isSuccessful() {
            return this.mError == null;
        }

        public Bitmap getBitmap() {
            return this.mBitmap;
        }

        public Uri getUri() {
            return this.mUri;
        }

        public Exception getError() {
            return this.mError;
        }

        public float[] getCropPoints() {
            return this.mCropPoints;
        }

        public Rect getCropRect() {
            return this.mCropRect;
        }

        public int getRotation() {
            return this.mRotation;
        }

        public int getSampleSize() {
            return this.mSampleSize;
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$1 */
    class C72671 implements CropWindowChangeListener {
        /* renamed from: a */
        final /* synthetic */ CropImageView f26166a;

        C72671(CropImageView cropImageView) {
            this.f26166a = cropImageView;
        }

        public void onCropWindowChanged(boolean z) {
            this.f26166a.m26636a(z, true);
        }
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22525c = new Matrix();
        this.f22526d = new Matrix();
        this.f22528f = new float[8];
        this.f22536n = true;
        this.f22537o = true;
        this.f22538p = true;
        this.f22545w = 1;
        this.f22546x = 1.0f;
        CropImageOptions cropImageOptions = null;
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent != null) {
            cropImageOptions = (CropImageOptions) intent.getParcelableExtra("CROP_IMAGE_EXTRA_OPTIONS");
        }
        if (cropImageOptions == null) {
            cropImageOptions = new CropImageOptions();
            if (attributeSet != null) {
                attributeSet = context.obtainStyledAttributes(attributeSet, C6147f.CropImageView, 0, 0);
                try {
                    cropImageOptions.fixAspectRatio = attributeSet.getBoolean(C6147f.CropImageView_cropFixAspectRatio, cropImageOptions.fixAspectRatio);
                    cropImageOptions.aspectRatioX = attributeSet.getInteger(C6147f.CropImageView_cropAspectRatioX, cropImageOptions.aspectRatioX);
                    cropImageOptions.aspectRatioY = attributeSet.getInteger(C6147f.CropImageView_cropAspectRatioY, cropImageOptions.aspectRatioY);
                    cropImageOptions.scaleType = ScaleType.values()[attributeSet.getInt(C6147f.CropImageView_cropScaleType, cropImageOptions.scaleType.ordinal())];
                    cropImageOptions.autoZoomEnabled = attributeSet.getBoolean(C6147f.CropImageView_cropAutoZoomEnabled, cropImageOptions.autoZoomEnabled);
                    cropImageOptions.multiTouchEnabled = attributeSet.getBoolean(C6147f.CropImageView_cropMultiTouchEnabled, cropImageOptions.multiTouchEnabled);
                    cropImageOptions.maxZoom = attributeSet.getInteger(C6147f.CropImageView_cropMaxZoom, cropImageOptions.maxZoom);
                    cropImageOptions.cropShape = CropShape.values()[attributeSet.getInt(C6147f.CropImageView_cropShape, cropImageOptions.cropShape.ordinal())];
                    cropImageOptions.guidelines = Guidelines.values()[attributeSet.getInt(C6147f.CropImageView_cropGuidelines, cropImageOptions.guidelines.ordinal())];
                    cropImageOptions.snapRadius = attributeSet.getDimension(C6147f.CropImageView_cropSnapRadius, cropImageOptions.snapRadius);
                    cropImageOptions.touchRadius = attributeSet.getDimension(C6147f.CropImageView_cropTouchRadius, cropImageOptions.touchRadius);
                    cropImageOptions.initialCropWindowPaddingRatio = attributeSet.getFloat(C6147f.CropImageView_cropInitialCropWindowPaddingRatio, cropImageOptions.initialCropWindowPaddingRatio);
                    cropImageOptions.borderLineThickness = attributeSet.getDimension(C6147f.CropImageView_cropBorderLineThickness, cropImageOptions.borderLineThickness);
                    cropImageOptions.borderLineColor = attributeSet.getInteger(C6147f.CropImageView_cropBorderLineColor, cropImageOptions.borderLineColor);
                    cropImageOptions.borderCornerThickness = attributeSet.getDimension(C6147f.CropImageView_cropBorderCornerThickness, cropImageOptions.borderCornerThickness);
                    cropImageOptions.borderCornerOffset = attributeSet.getDimension(C6147f.CropImageView_cropBorderCornerOffset, cropImageOptions.borderCornerOffset);
                    cropImageOptions.borderCornerLength = attributeSet.getDimension(C6147f.CropImageView_cropBorderCornerLength, cropImageOptions.borderCornerLength);
                    cropImageOptions.borderCornerColor = attributeSet.getInteger(C6147f.CropImageView_cropBorderCornerColor, cropImageOptions.borderCornerColor);
                    cropImageOptions.guidelinesThickness = attributeSet.getDimension(C6147f.CropImageView_cropGuidelinesThickness, cropImageOptions.guidelinesThickness);
                    cropImageOptions.guidelinesColor = attributeSet.getInteger(C6147f.CropImageView_cropGuidelinesColor, cropImageOptions.guidelinesColor);
                    cropImageOptions.backgroundColor = attributeSet.getInteger(C6147f.CropImageView_cropBackgroundColor, cropImageOptions.backgroundColor);
                    cropImageOptions.showCropOverlay = attributeSet.getBoolean(C6147f.CropImageView_cropShowCropOverlay, this.f22536n);
                    cropImageOptions.showProgressBar = attributeSet.getBoolean(C6147f.CropImageView_cropShowProgressBar, this.f22537o);
                    cropImageOptions.borderCornerThickness = attributeSet.getDimension(C6147f.CropImageView_cropBorderCornerThickness, cropImageOptions.borderCornerThickness);
                    cropImageOptions.minCropWindowWidth = (int) attributeSet.getDimension(C6147f.CropImageView_cropMinCropWindowWidth, (float) cropImageOptions.minCropWindowWidth);
                    cropImageOptions.minCropWindowHeight = (int) attributeSet.getDimension(C6147f.CropImageView_cropMinCropWindowHeight, (float) cropImageOptions.minCropWindowHeight);
                    cropImageOptions.minCropResultWidth = (int) attributeSet.getFloat(C6147f.CropImageView_cropMinCropResultWidthPX, (float) cropImageOptions.minCropResultWidth);
                    cropImageOptions.minCropResultHeight = (int) attributeSet.getFloat(C6147f.CropImageView_cropMinCropResultHeightPX, (float) cropImageOptions.minCropResultHeight);
                    cropImageOptions.maxCropResultWidth = (int) attributeSet.getFloat(C6147f.CropImageView_cropMaxCropResultWidthPX, (float) cropImageOptions.maxCropResultWidth);
                    cropImageOptions.maxCropResultHeight = (int) attributeSet.getFloat(C6147f.CropImageView_cropMaxCropResultHeightPX, (float) cropImageOptions.maxCropResultHeight);
                    if (attributeSet.hasValue(C6147f.CropImageView_cropAspectRatioX) && attributeSet.hasValue(C6147f.CropImageView_cropAspectRatioX) && !attributeSet.hasValue(C6147f.CropImageView_cropFixAspectRatio)) {
                        cropImageOptions.fixAspectRatio = true;
                    }
                    attributeSet.recycle();
                } catch (Throwable th) {
                    attributeSet.recycle();
                }
            }
        }
        cropImageOptions.validate();
        this.f22535m = cropImageOptions.scaleType;
        this.f22538p = cropImageOptions.autoZoomEnabled;
        this.f22539q = cropImageOptions.maxZoom;
        this.f22536n = cropImageOptions.showCropOverlay;
        this.f22537o = cropImageOptions.showProgressBar;
        context = LayoutInflater.from(context).inflate(C6144c.crop_image_view, this, true);
        this.f22523a = (ImageView) context.findViewById(C6143b.ImageView_image);
        this.f22523a.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        this.f22524b = (CropOverlayView) context.findViewById(C6143b.CropOverlayView);
        this.f22524b.setCropWindowChangeListener(new C72671(this));
        this.f22524b.setInitialAttributeValues(cropImageOptions);
        this.f22527e = (ProgressBar) context.findViewById(C6143b.CropProgressBar);
        m26639d();
    }

    public ScaleType getScaleType() {
        return this.f22535m;
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType != this.f22535m) {
            this.f22535m = scaleType;
            this.f22546x = 1.0f;
            this.f22548z = 0.0f;
            this.f22547y = 0.0f;
            this.f22524b.m26666b();
            requestLayout();
        }
    }

    public CropShape getCropShape() {
        return this.f22524b.getCropShape();
    }

    public void setCropShape(CropShape cropShape) {
        this.f22524b.setCropShape(cropShape);
    }

    public void setAutoZoomEnabled(boolean z) {
        if (this.f22538p != z) {
            this.f22538p = z;
            m26636a(false, false);
            this.f22524b.invalidate();
        }
    }

    public void setMultiTouchEnabled(boolean z) {
        if (this.f22524b.m26665a(z)) {
            m26636a(false, false);
            this.f22524b.invalidate();
        }
    }

    public int getMaxZoom() {
        return this.f22539q;
    }

    public void setMaxZoom(int i) {
        if (this.f22539q != i && i > 0) {
            this.f22539q = i;
            m26636a(false, false);
            this.f22524b.invalidate();
        }
    }

    public int getRotatedDegrees() {
        return this.f22531i;
    }

    public void setRotatedDegrees(int i) {
        if (this.f22531i != i) {
            m26641a(i - this.f22531i);
        }
    }

    public void setFixedAspectRatio(boolean z) {
        this.f22524b.setFixedAspectRatio(z);
    }

    public Guidelines getGuidelines() {
        return this.f22524b.getGuidelines();
    }

    public void setGuidelines(Guidelines guidelines) {
        this.f22524b.setGuidelines(guidelines);
    }

    public Pair<Integer, Integer> getAspectRatio() {
        return new Pair(Integer.valueOf(this.f22524b.getAspectRatioX()), Integer.valueOf(this.f22524b.getAspectRatioY()));
    }

    public void setSnapRadius(float f) {
        if (f >= 0.0f) {
            this.f22524b.setSnapRadius(f);
        }
    }

    public void setShowProgressBar(boolean z) {
        if (this.f22537o != z) {
            this.f22537o = z;
            m26639d();
        }
    }

    public void setShowCropOverlay(boolean z) {
        if (this.f22536n != z) {
            this.f22536n = z;
            m26638c();
        }
    }

    public int getImageResource() {
        return this.f22534l;
    }

    public Uri getImageUri() {
        return this.f22544v;
    }

    public Rect getCropRect() {
        if (this.f22530h == null) {
            return null;
        }
        return C6139c.m26700a(getCropPoints(), this.f22545w * this.f22530h.getWidth(), this.f22545w * this.f22530h.getHeight(), this.f22524b.m26667c(), this.f22524b.getAspectRatioX(), this.f22524b.getAspectRatioY());
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f22524b.getCropWindowRect();
        r1 = new float[8];
        int i = 0;
        r1[0] = cropWindowRect.left;
        r1[1] = cropWindowRect.top;
        r1[2] = cropWindowRect.right;
        r1[3] = cropWindowRect.top;
        r1[4] = cropWindowRect.right;
        r1[5] = cropWindowRect.bottom;
        r1[6] = cropWindowRect.left;
        r1[7] = cropWindowRect.bottom;
        this.f22525c.invert(this.f22526d);
        this.f22526d.mapPoints(r1);
        while (i < r1.length) {
            r1[i] = r1[i] * ((float) this.f22545w);
            i++;
        }
        return r1;
    }

    public void setCropRect(Rect rect) {
        this.f22524b.setInitialCropWindowRect(rect);
    }

    public Bitmap getCroppedImage() {
        return m26640a(0, 0, RequestSizeOptions.NONE);
    }

    /* renamed from: a */
    public Bitmap m26640a(int i, int i2, RequestSizeOptions requestSizeOptions) {
        RequestSizeOptions requestSizeOptions2 = requestSizeOptions;
        if (this.f22530h == null) {
            return null;
        }
        Bitmap a;
        r0.f22523a.clearAnimation();
        int i3 = 0;
        int i4 = requestSizeOptions2 != RequestSizeOptions.NONE ? i : 0;
        if (requestSizeOptions2 != RequestSizeOptions.NONE) {
            i3 = i2;
        }
        if (r0.f22544v == null || (r0.f22545w <= 1 && requestSizeOptions2 != RequestSizeOptions.SAMPLING)) {
            a = C6139c.m26697a(r0.f22530h, getCropPoints(), r0.f22531i, r0.f22524b.m26667c(), r0.f22524b.getAspectRatioX(), r0.f22524b.getAspectRatioY());
        } else {
            a = C6139c.m26703a(getContext(), r0.f22544v, getCropPoints(), r0.f22531i, r0.f22530h.getWidth() * r0.f22545w, r0.f22530h.getHeight() * r0.f22545w, r0.f22524b.m26667c(), r0.f22524b.getAspectRatioX(), r0.f22524b.getAspectRatioY(), i4, i3).f22619a;
        }
        return C6139c.m26696a(a, i4, i3, requestSizeOptions2);
    }

    public void getCroppedImageAsync() {
        m26646b(0, 0, RequestSizeOptions.NONE);
    }

    /* renamed from: b */
    public void m26646b(int i, int i2, RequestSizeOptions requestSizeOptions) {
        if (this.f22541s == null && this.f22542t == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        m26642a(i, i2, requestSizeOptions, null, null, 0);
    }

    /* renamed from: a */
    public void m26643a(Uri uri, CompressFormat compressFormat, int i, int i2, int i3, RequestSizeOptions requestSizeOptions) {
        if (this.f22541s == null && this.f22543u == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        m26642a(i2, i3, requestSizeOptions, uri, compressFormat, i);
    }

    public void setOnSetImageUriCompleteListener(OnSetImageUriCompleteListener onSetImageUriCompleteListener) {
        this.f22540r = onSetImageUriCompleteListener;
    }

    public void setOnCropImageCompleteListener(OnCropImageCompleteListener onCropImageCompleteListener) {
        this.f22541s = onCropImageCompleteListener;
    }

    @Deprecated
    public void setOnGetCroppedImageCompleteListener(OnGetCroppedImageCompleteListener onGetCroppedImageCompleteListener) {
        this.f22542t = onGetCroppedImageCompleteListener;
    }

    @Deprecated
    public void setOnSaveCroppedImageCompleteListener(OnSaveCroppedImageCompleteListener onSaveCroppedImageCompleteListener) {
        this.f22543u = onSaveCroppedImageCompleteListener;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f22524b.setInitialCropWindowRect(null);
        setBitmap(bitmap);
    }

    public void setImageResource(int i) {
        if (i != 0) {
            this.f22524b.setInitialCropWindowRect(null);
            m26631a(BitmapFactory.decodeResource(getResources(), i), i);
        }
    }

    public void setImageUriAsync(Uri uri) {
        if (uri != null) {
            C6136b c6136b = this.f22521C != null ? (C6136b) this.f22521C.get() : null;
            if (c6136b != null) {
                c6136b.cancel(true);
            }
            m26629a();
            this.f22524b.setInitialCropWindowRect(null);
            this.f22521C = new WeakReference(new C6136b(this, uri));
            ((C6136b) this.f22521C.get()).execute(new Void[0]);
            m26639d();
        }
    }

    /* renamed from: a */
    public void m26641a(int i) {
        int i2 = i;
        if (this.f22530h != null) {
            Object obj = ((r0.f22524b.m26667c() || i2 <= 45 || i2 >= 135) && (i2 <= 215 || i2 >= 305)) ? null : 1;
            C6139c.f22625c.set(r0.f22524b.getCropWindowRect());
            float height = (obj != null ? C6139c.f22625c.height() : C6139c.f22625c.width()) / 2.0f;
            float width = (obj != null ? C6139c.f22625c.width() : C6139c.f22625c.height()) / 2.0f;
            r0.f22525c.invert(r0.f22526d);
            C6139c.f22626d[0] = C6139c.f22625c.centerX();
            C6139c.f22626d[1] = C6139c.f22625c.centerY();
            C6139c.f22626d[2] = 0.0f;
            C6139c.f22626d[3] = 0.0f;
            C6139c.f22626d[4] = 1.0f;
            C6139c.f22626d[5] = 0.0f;
            r0.f22526d.mapPoints(C6139c.f22626d);
            r0.f22531i += i2;
            r0.f22531i = r0.f22531i >= 0 ? r0.f22531i % 360 : (r0.f22531i % 360) + 360;
            m26630a((float) getWidth(), (float) getHeight(), true, false);
            r0.f22525c.mapPoints(C6139c.f22627e, C6139c.f22626d);
            r0.f22546x = (float) (((double) r0.f22546x) / Math.sqrt(Math.pow((double) (C6139c.f22627e[4] - C6139c.f22627e[2]), 2.0d) + Math.pow((double) (C6139c.f22627e[5] - C6139c.f22627e[3]), 2.0d)));
            r0.f22546x = Math.max(r0.f22546x, 1.0f);
            m26630a((float) getWidth(), (float) getHeight(), true, false);
            r0.f22525c.mapPoints(C6139c.f22627e, C6139c.f22626d);
            double sqrt = Math.sqrt(Math.pow((double) (C6139c.f22627e[4] - C6139c.f22627e[2]), 2.0d) + Math.pow((double) (C6139c.f22627e[5] - C6139c.f22627e[3]), 2.0d));
            float f = (float) (((double) height) * sqrt);
            width = (float) (((double) width) * sqrt);
            C6139c.f22625c.set(C6139c.f22627e[0] - f, C6139c.f22627e[1] - width, C6139c.f22627e[0] + f, C6139c.f22627e[1] + width);
            r0.f22524b.m26666b();
            r0.f22524b.setCropWindowRect(C6139c.f22625c);
            m26630a((float) getWidth(), (float) getHeight(), true, false);
            m26636a(false, false);
            r0.f22524b.m26662a();
        }
    }

    /* renamed from: a */
    void m26645a(C6135a c6135a) {
        this.f22521C = null;
        m26639d();
        if (c6135a.f22613e == null) {
            m26633a(c6135a.f22610b, c6135a.f22609a, c6135a.f22611c, c6135a.f22612d);
        }
        OnSetImageUriCompleteListener onSetImageUriCompleteListener = this.f22540r;
        if (onSetImageUriCompleteListener != null) {
            onSetImageUriCompleteListener.onSetImageUriComplete(this, c6135a.f22609a, c6135a.f22613e);
        }
    }

    /* renamed from: a */
    void m26644a(C6133a c6133a) {
        this.f22522D = null;
        m26639d();
        OnCropImageCompleteListener onCropImageCompleteListener = this.f22541s;
        if (onCropImageCompleteListener != null) {
            onCropImageCompleteListener.onCropImageComplete(this, new C6129a(c6133a.f22587a, c6133a.f22588b, c6133a.f22589c, getCropPoints(), getCropRect(), getRotatedDegrees(), c6133a.f22591e));
        }
        if (c6133a.f22590d) {
            OnSaveCroppedImageCompleteListener onSaveCroppedImageCompleteListener = this.f22543u;
            if (onSaveCroppedImageCompleteListener != null) {
                onSaveCroppedImageCompleteListener.onSaveCroppedImageComplete(this, c6133a.f22588b, c6133a.f22589c);
                return;
            }
            return;
        }
        OnGetCroppedImageCompleteListener onGetCroppedImageCompleteListener = this.f22542t;
        if (onGetCroppedImageCompleteListener != null) {
            onGetCroppedImageCompleteListener.onGetCroppedImageComplete(this, c6133a.f22587a, c6133a.f22589c);
        }
    }

    private void setBitmap(Bitmap bitmap) {
        m26632a(bitmap, 0, null, 1, 0);
    }

    /* renamed from: a */
    private void m26631a(Bitmap bitmap, int i) {
        m26632a(bitmap, i, null, 1, 0);
    }

    /* renamed from: a */
    private void m26633a(Bitmap bitmap, Uri uri, int i, int i2) {
        m26632a(bitmap, 0, uri, i, i2);
    }

    /* renamed from: a */
    private void m26632a(Bitmap bitmap, int i, Uri uri, int i2, int i3) {
        if (this.f22530h == null || !this.f22530h.equals(bitmap)) {
            this.f22523a.clearAnimation();
            m26629a();
            this.f22530h = bitmap;
            this.f22523a.setImageBitmap(this.f22530h);
            this.f22544v = uri;
            this.f22534l = i;
            this.f22545w = i2;
            this.f22531i = i3;
            m26630a((float) getWidth(), (float) getHeight(), true, false);
            if (this.f22524b != null) {
                this.f22524b.m26666b();
                m26638c();
            }
        }
    }

    /* renamed from: a */
    private void m26629a() {
        if (this.f22530h != null && (this.f22534l > 0 || this.f22544v != null)) {
            this.f22530h.recycle();
        }
        this.f22530h = null;
        this.f22534l = 0;
        this.f22544v = null;
        this.f22545w = 1;
        this.f22531i = 0;
        this.f22546x = 1.0f;
        this.f22547y = 0.0f;
        this.f22548z = 0.0f;
        this.f22525c.reset();
        this.f22523a.setImageBitmap(null);
        m26638c();
    }

    /* renamed from: a */
    public void m26642a(int i, int i2, RequestSizeOptions requestSizeOptions, Uri uri, CompressFormat compressFormat, int i3) {
        RequestSizeOptions requestSizeOptions2 = requestSizeOptions;
        CropImageView cropImageView;
        if (this.f22530h != null) {
            r15.f22523a.clearAnimation();
            C6134a c6134a = r15.f22522D != null ? (C6134a) r15.f22522D.get() : null;
            if (c6134a != null) {
                c6134a.cancel(true);
            }
            int i4 = requestSizeOptions2 != RequestSizeOptions.NONE ? i : 0;
            int i5 = requestSizeOptions2 != RequestSizeOptions.NONE ? i2 : 0;
            int width = r15.f22530h.getWidth() * r15.f22545w;
            int height = r15.f22530h.getHeight() * r15.f22545w;
            if (r15.f22544v == null || (r15.f22545w <= 1 && requestSizeOptions2 != RequestSizeOptions.SAMPLING)) {
                C6134a c6134a2 = c6134a;
                c6134a = new C6134a(r15, r15.f22530h, getCropPoints(), r15.f22531i, r15.f22524b.m26667c(), r15.f22524b.getAspectRatioX(), r15.f22524b.getAspectRatioY(), i4, i5, requestSizeOptions2, uri, compressFormat, i3);
                this.f22522D = new WeakReference(c6134a2);
            } else {
                C6134a c6134a3 = c6134a;
                c6134a = new C6134a(r15, r15.f22544v, getCropPoints(), r15.f22531i, width, height, r15.f22524b.m26667c(), r15.f22524b.getAspectRatioX(), r15.f22524b.getAspectRatioY(), i4, i5, requestSizeOptions2, uri, compressFormat, i3);
                this.f22522D = new WeakReference(c6134a3);
                cropImageView = this;
            }
            ((C6134a) cropImageView.f22522D.get()).execute(new Void[0]);
            m26639d();
            return;
        }
        cropImageView = r15;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", this.f22544v);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f22534l);
        if (this.f22544v == null && this.f22534l < 1) {
            bundle.putParcelable("SET_BITMAP", this.f22530h);
        }
        if (!(this.f22544v == null || this.f22530h == null)) {
            String uuid = UUID.randomUUID().toString();
            C6139c.f22629g = new Pair(uuid, new WeakReference(this.f22530h));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        if (this.f22521C != null) {
            C6136b c6136b = (C6136b) this.f22521C.get();
            if (c6136b != null) {
                bundle.putParcelable("LOADING_IMAGE_URI", c6136b.m26687a());
            }
        }
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f22545w);
        bundle.putInt("DEGREES_ROTATED", this.f22531i);
        bundle.putParcelable("INITIAL_CROP_RECT", this.f22524b.getInitialCropWindowRect());
        C6139c.f22625c.set(this.f22524b.getCropWindowRect());
        this.f22525c.invert(this.f22526d);
        this.f22526d.mapRect(C6139c.f22625c);
        bundle.putParcelable("CROP_WINDOW_RECT", C6139c.f22625c);
        bundle.putString("CROP_SHAPE", this.f22524b.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f22538p);
        bundle.putInt("CROP_MAX_ZOOM", this.f22539q);
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (this.f22521C == null && this.f22544v == null && this.f22530h == null && this.f22534l == 0) {
                Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Bitmap bitmap = (C6139c.f22629g == null || !((String) C6139c.f22629g.first).equals(string)) ? null : (Bitmap) ((WeakReference) C6139c.f22629g.second).get();
                        if (!(bitmap == null || bitmap.isRecycled())) {
                            C6139c.f22629g = null;
                            m26633a(bitmap, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if (this.f22544v == null) {
                        setImageUriAsync(uri);
                    }
                } else {
                    int i = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i > 0) {
                        setImageResource(i);
                    } else {
                        Bitmap bitmap2 = (Bitmap) bundle.getParcelable("SET_BITMAP");
                        if (bitmap2 != null) {
                            setBitmap(bitmap2);
                        } else {
                            uri = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                            if (uri != null) {
                                setImageUriAsync(uri);
                            }
                        }
                    }
                }
                this.f22531i = bundle.getInt("DEGREES_ROTATED");
                this.f22524b.setInitialCropWindowRect((Rect) bundle.getParcelable("INITIAL_CROP_RECT"));
                this.f22519A = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
                this.f22524b.setCropShape(CropShape.valueOf(bundle.getString("CROP_SHAPE")));
                this.f22538p = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.f22539q = bundle.getInt("CROP_MAX_ZOOM");
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (this.f22530h != null) {
            int width;
            int height;
            if (i2 == 0) {
                i2 = this.f22530h.getHeight();
            }
            double width2 = i < this.f22530h.getWidth() ? ((double) i) / ((double) this.f22530h.getWidth()) : Double.POSITIVE_INFINITY;
            double height2 = i2 < this.f22530h.getHeight() ? ((double) i2) / ((double) this.f22530h.getHeight()) : Double.POSITIVE_INFINITY;
            if (width2 == Double.POSITIVE_INFINITY) {
                if (height2 == Double.POSITIVE_INFINITY) {
                    width = this.f22530h.getWidth();
                    height = this.f22530h.getHeight();
                    i = m26628a(mode, i, width);
                    i2 = m26628a(mode2, i2, height);
                    this.f22532j = i;
                    this.f22533k = i2;
                    setMeasuredDimension(this.f22532j, this.f22533k);
                    return;
                }
            }
            if (width2 <= height2) {
                height = (int) (((double) this.f22530h.getHeight()) * width2);
                width = i;
            } else {
                width = (int) (((double) this.f22530h.getWidth()) * height2);
                height = i2;
            }
            i = m26628a(mode, i, width);
            i2 = m26628a(mode2, i2, height);
            this.f22532j = i;
            this.f22533k = i2;
            setMeasuredDimension(this.f22532j, this.f22533k);
            return;
        }
        setMeasuredDimension(i, i2);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f22532j > false || this.f22533k > false) {
            m26635a(true);
            return;
        }
        z = getLayoutParams();
        z.width = this.f22532j;
        z.height = this.f22533k;
        setLayoutParams(z);
        if (this.f22530h) {
            m26630a((float) (i3 - i), (float) (i4 - i2), true, false);
            if (this.f22519A) {
                this.f22525c.mapRect(this.f22519A);
                this.f22524b.setCropWindowRect(this.f22519A);
                m26636a(false, false);
                this.f22524b.m26662a();
                this.f22519A = false;
                return;
            } else if (this.f22520B) {
                this.f22520B = false;
                m26636a(false, false);
                return;
            } else {
                return;
            }
        }
        m26635a(true);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i = (i3 <= 0 || i4 <= 0) ? 0 : 1;
        this.f22520B = i;
    }

    /* renamed from: a */
    private void m26636a(boolean z, boolean z2) {
        int width = getWidth();
        int height = getHeight();
        if (this.f22530h != null && width > 0 && height > 0) {
            RectF cropWindowRect = this.f22524b.getCropWindowRect();
            if (z) {
                if (cropWindowRect.left >= false || cropWindowRect.top >= false || cropWindowRect.right > ((float) width) || cropWindowRect.bottom > ((float) height)) {
                    m26630a((float) width, (float) height, false, false);
                }
            } else if (this.f22538p || this.f22546x > true) {
                float f;
                if (this.f22546x < ((float) this.f22539q)) {
                    float f2 = (float) width;
                    if (cropWindowRect.width() < f2 * 0.5f) {
                        float f3 = (float) height;
                        if (cropWindowRect.height() < 0.5f * f3) {
                            z = Math.min((float) this.f22539q, Math.min(f2 / ((cropWindowRect.width() / this.f22546x) / 0.64f), f3 / ((cropWindowRect.height() / this.f22546x) / 0.64f)));
                            if (this.f22546x > 1.0f) {
                                f = (float) width;
                                if (cropWindowRect.width() > f * 0.65f || cropWindowRect.height() > ((float) height) * 0.65f) {
                                    z = Math.max(1.0f, Math.min(f / ((cropWindowRect.width() / this.f22546x) / true), ((float) height) / ((cropWindowRect.height() / this.f22546x) / 0.51f)));
                                }
                            }
                            if (!this.f22538p) {
                                z = true;
                            }
                            if (z <= false && z != this.f22546x) {
                                if (z2) {
                                    if (this.f22529g == null) {
                                        this.f22529g = new C6140d(this.f22523a, this.f22524b);
                                    }
                                    this.f22529g.m26719a(this.f22528f, this.f22525c);
                                }
                                this.f22546x = z;
                                m26630a((float) width, (float) height, true, z2);
                                return;
                            }
                        }
                    }
                }
                z = false;
                if (this.f22546x > 1.0f) {
                    f = (float) width;
                    z = Math.max(1.0f, Math.min(f / ((cropWindowRect.width() / this.f22546x) / true), ((float) height) / ((cropWindowRect.height() / this.f22546x) / 0.51f)));
                }
                if (this.f22538p) {
                    z = true;
                }
                if (z <= false) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m26630a(float f, float f2, boolean z, boolean z2) {
        if (this.f22530h != null) {
            float f3 = 0.0f;
            if (f > 0.0f && f2 > 0.0f) {
                this.f22525c.invert(this.f22526d);
                RectF cropWindowRect = this.f22524b.getCropWindowRect();
                this.f22526d.mapRect(cropWindowRect);
                this.f22525c.reset();
                this.f22525c.postTranslate((f - ((float) this.f22530h.getWidth())) / 2.0f, (f2 - ((float) this.f22530h.getHeight())) / 2.0f);
                m26637b();
                if (this.f22531i > 0) {
                    this.f22525c.postRotate((float) this.f22531i, C6139c.m26717g(this.f22528f), C6139c.m26718h(this.f22528f));
                    m26637b();
                }
                float min = Math.min(f / C6139c.m26715e(this.f22528f), f2 / C6139c.m26716f(this.f22528f));
                if (this.f22535m == ScaleType.FIT_CENTER || ((this.f22535m == ScaleType.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.f22538p))) {
                    this.f22525c.postScale(min, min, C6139c.m26717g(this.f22528f), C6139c.m26718h(this.f22528f));
                    m26637b();
                }
                this.f22525c.postScale(this.f22546x, this.f22546x, C6139c.m26717g(this.f22528f), C6139c.m26718h(this.f22528f));
                m26637b();
                this.f22525c.mapRect(cropWindowRect);
                if (z) {
                    if (f > C6139c.m26715e(this.f22528f)) {
                        f = 0.0f;
                    } else {
                        f = Math.max(Math.min((f / 2.0f) - cropWindowRect.centerX(), -C6139c.m26690a(this.f22528f)), ((float) getWidth()) - C6139c.m26713c(this.f22528f)) / this.f22546x;
                    }
                    this.f22547y = f;
                    if (f2 <= C6139c.m26716f(this.f22528f)) {
                        f3 = Math.max(Math.min((f2 / 2.0f) - cropWindowRect.centerY(), -C6139c.m26712b(this.f22528f)), ((float) getHeight()) - C6139c.m26714d(this.f22528f)) / this.f22546x;
                    }
                    this.f22548z = f3;
                } else {
                    this.f22547y = Math.min(Math.max(this.f22547y * this.f22546x, -cropWindowRect.left), (-cropWindowRect.right) + f) / this.f22546x;
                    this.f22548z = Math.min(Math.max(this.f22548z * this.f22546x, -cropWindowRect.top), (-cropWindowRect.bottom) + f2) / this.f22546x;
                }
                this.f22525c.postTranslate(this.f22547y * this.f22546x, this.f22548z * this.f22546x);
                cropWindowRect.offset(this.f22547y * this.f22546x, this.f22548z * this.f22546x);
                this.f22524b.setCropWindowRect(cropWindowRect);
                m26637b();
                if (z2) {
                    this.f22529g.m26720b(this.f22528f, this.f22525c);
                    this.f22523a.startAnimation(this.f22529g);
                } else {
                    this.f22523a.setImageMatrix(this.f22525c);
                }
                m26635a((boolean) 0.0f);
            }
        }
    }

    /* renamed from: b */
    private void m26637b() {
        this.f22528f[0] = 0.0f;
        this.f22528f[1] = 0.0f;
        this.f22528f[2] = (float) this.f22530h.getWidth();
        this.f22528f[3] = 0.0f;
        this.f22528f[4] = (float) this.f22530h.getWidth();
        this.f22528f[5] = (float) this.f22530h.getHeight();
        this.f22528f[6] = 0.0f;
        this.f22528f[7] = (float) this.f22530h.getHeight();
        this.f22525c.mapPoints(this.f22528f);
    }

    /* renamed from: a */
    private static int m26628a(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        return i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* renamed from: c */
    private void m26638c() {
        if (this.f22524b != null) {
            CropOverlayView cropOverlayView = this.f22524b;
            int i = (!this.f22536n || this.f22530h == null) ? 4 : 0;
            cropOverlayView.setVisibility(i);
        }
    }

    /* renamed from: d */
    private void m26639d() {
        int i = 0;
        Object obj = (!this.f22537o || ((this.f22530h != null || this.f22521C == null) && this.f22522D == null)) ? null : 1;
        ProgressBar progressBar = this.f22527e;
        if (obj == null) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: a */
    private void m26635a(boolean z) {
        if (!(this.f22530h == null || z)) {
            this.f22524b.m26663a((float) getWidth(), (float) getHeight(), ((float) (this.f22530h.getWidth() * this.f22545w)) / C6139c.m26715e(this.f22528f), ((float) (this.f22530h.getHeight() * this.f22545w)) / C6139c.m26716f(this.f22528f));
        }
        this.f22524b.m26664a(z ? false : this.f22528f, getWidth(), getHeight());
    }
}
