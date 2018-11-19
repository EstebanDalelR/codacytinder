package com.tinder.recs.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.support.annotation.NonNull;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import com.tinder.R;
import com.tinder.recs.view.IconGamepadButton.IconImageView;
import com.tinder.utils.C15363n;

public class LikeMeter extends IconImageView {
    private static final float PERCENT_FULL = 1.0f;
    private static final float TOP_MARGIN_PERCENTAGE = 0.024f;
    private AssetMode mAssetMode = AssetMode.REVISED;
    private Canvas mCanvasMasked;
    private int mIconBackgroundPadding;
    private Bitmap mMaskHeart;
    private Bitmap mMaskShadow;
    private boolean mNeedsRedraw;
    private Paint mPaintGray;
    private Paint mPaintGreen;
    private Paint mPaintMask;
    private Paint mPaintWhite;
    private Path mPathGray;
    private Path mPathGreen;
    private float mPercentFull;
    private Bitmap mResultBmp;
    private Rect mShadowRectDst;

    /* renamed from: com.tinder.recs.view.LikeMeter$1 */
    static /* synthetic */ class C147161 {
        static final /* synthetic */ int[] $SwitchMap$com$tinder$recs$view$LikeMeter$AssetMode = new int[AssetMode.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.recs.view.LikeMeter.AssetMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$tinder$recs$view$LikeMeter$AssetMode = r0;
            r0 = $SwitchMap$com$tinder$recs$view$LikeMeter$AssetMode;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.recs.view.LikeMeter.AssetMode.NORMAL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$tinder$recs$view$LikeMeter$AssetMode;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.recs.view.LikeMeter.AssetMode.PLUS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$com$tinder$recs$view$LikeMeter$AssetMode;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.tinder.recs.view.LikeMeter.AssetMode.EXTRA_LARGE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = $SwitchMap$com$tinder$recs$view$LikeMeter$AssetMode;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.tinder.recs.view.LikeMeter.AssetMode.REVISED;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.view.LikeMeter.1.<clinit>():void");
        }
    }

    public enum AssetMode {
        NORMAL,
        PLUS,
        EXTRA_LARGE,
        REVISED
    }

    public LikeMeter(Context context, int i) {
        super(context, C0432b.c(context, R.color.white));
        this.mIconBackgroundPadding = i;
        init();
    }

    public LikeMeter(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public LikeMeter(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void init() {
        setWillNotDraw(false);
        this.mPathGreen = new Path();
        this.mPathGray = new Path();
        this.mPaintGreen = new Paint(1);
        this.mPaintGray = new Paint(1);
        this.mPaintGray.setColor(C0432b.c(getContext(), R.color.like_meter_empty));
        this.mPaintMask = new Paint(1);
        this.mPaintMask.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        this.mPaintWhite = new Paint(1);
        this.mPaintWhite.setColor(C0432b.c(getContext(), R.color.white));
        this.mPaintWhite.setStyle(Style.FILL_AND_STROKE);
        this.mPaintWhite.setStrokeWidth(5.0f);
        this.mPaintWhite.setStrokeJoin(Join.ROUND);
        this.mPaintWhite.setStrokeCap(Cap.ROUND);
        setPercentFull(PERCENT_FULL);
        setPadding(this.mIconBackgroundPadding, this.mIconBackgroundPadding, this.mIconBackgroundPadding, this.mIconBackgroundPadding);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.mPaintGreen.getShader() && i3 > 0 && i4 > 0) {
            this.mPaintGreen.setShader(new LinearGradient(0.0f, (float) getHeight(), (float) getWidth(), 0.0f, C0432b.c(getContext(), R.color.like_meter_gradient_start), C0432b.c(getContext(), R.color.like_meter_gradient_end), TileMode.CLAMP));
        }
    }

    public void setAssetMode(AssetMode assetMode) {
        if (assetMode != this.mAssetMode) {
            this.mAssetMode = assetMode;
            buildMask();
            setPercentFull(this.mPercentFull);
        }
    }

    private void buildMask() {
        int i = C147161.$SwitchMap$com$tinder$recs$view$LikeMeter$AssetMode[this.mAssetMode.ordinal()];
        int i2 = R.drawable.recs_buttons_like_drain_shadow;
        int i3 = 0;
        switch (i) {
            case 1:
                i3 = R.drawable.recs_buttons_like_icon_black_old;
                i2 = R.drawable.recs_buttons_like_shadow_old;
                break;
            case 2:
                i3 = R.drawable.recs_buttons_like_black;
                break;
            case 3:
                i3 = R.drawable.paywall_header_heart_black;
                i2 = R.drawable.paywall_header_heart_shadow;
                break;
            case 4:
                i3 = R.drawable.like_gradient;
                break;
            default:
                i2 = 0;
                break;
        }
        this.mMaskHeart = BitmapFactory.decodeResource(getResources(), i3);
        this.mMaskShadow = BitmapFactory.decodeResource(getResources(), i2);
        this.mResultBmp = Bitmap.createBitmap(this.mMaskHeart.getWidth(), this.mMaskHeart.getHeight(), Config.ARGB_8888);
        i = this.mMaskHeart.getWidth() - this.mMaskShadow.getWidth();
        i2 = this.mMaskHeart.getHeight() - this.mMaskShadow.getHeight();
        this.mShadowRectDst = new Rect();
        i /= 2;
        this.mShadowRectDst.left = i;
        i2 /= 2;
        this.mShadowRectDst.top = i2;
        this.mShadowRectDst.right = this.mMaskShadow.getWidth() + i;
        this.mShadowRectDst.bottom = this.mMaskShadow.getHeight() + i2;
        this.mCanvasMasked = new Canvas(this.mResultBmp);
        i2 = this.mMaskHeart.getWidth() + this.mIconBackgroundPadding;
        setMinimumHeight(this.mMaskHeart.getHeight() + this.mIconBackgroundPadding);
        setMinimumWidth(i2);
        redraw();
    }

    public float getPercentFull() {
        return this.mPercentFull;
    }

    public void setPercentFull(float f) {
        if (!C15363n.m57669a(this.mMaskHeart, this.mMaskShadow)) {
            buildMask();
        }
        this.mPercentFull = Math.abs(f);
        this.mPathGreen.reset();
        this.mPathGreen.addRect(0.0f, (PERCENT_FULL - this.mPercentFull) * ((float) this.mMaskHeart.getHeight()), (float) this.mMaskHeart.getWidth(), (float) this.mMaskHeart.getHeight(), Direction.CW);
        this.mPathGray.reset();
        this.mPathGray.addRect(0.0f, 0.0f, (float) this.mMaskHeart.getWidth(), (float) this.mMaskHeart.getHeight(), Direction.CW);
        redraw();
    }

    public void setPercentFullInt(int i) {
        setPercentFull(((float) i) / 1120403456);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        redraw();
    }

    private void redraw() {
        this.mNeedsRedraw = true;
        invalidate();
    }

    protected void onDraw(@NonNull Canvas canvas) {
        if (this.mNeedsRedraw) {
            this.mCanvasMasked.drawColor(0, Mode.CLEAR);
        }
        this.mCanvasMasked.drawPath(this.mPathGray, this.mPaintGray);
        if (isEnabled()) {
            this.mCanvasMasked.drawPath(this.mPathGreen, this.mPaintGreen);
        }
        this.mCanvasMasked.drawBitmap(this.mMaskHeart, 0.0f, 0.0f, this.mPaintMask);
        if (this.mPercentFull != PERCENT_FULL && isEnabled()) {
            this.mCanvasMasked.drawBitmap(this.mMaskShadow, null, this.mShadowRectDst, null);
        }
        canvas.drawBitmap(this.mResultBmp, (float) ((getWidth() - this.mMaskHeart.getWidth()) / 2), ((float) ((getHeight() - this.mMaskHeart.getHeight()) / 2)) + (((float) getHeight()) * TOP_MARGIN_PERCENTAGE), null);
    }
}
