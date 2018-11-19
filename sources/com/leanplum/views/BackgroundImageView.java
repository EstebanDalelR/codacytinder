package com.leanplum.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.leanplum.utils.BitmapUtil;
import com.leanplum.utils.SizeUtil;

public class BackgroundImageView extends ImageView {
    /* renamed from: a */
    private Paint f21447a = new Paint();
    /* renamed from: b */
    private boolean f21448b;
    /* renamed from: c */
    private Matrix f21449c = new Matrix();
    /* renamed from: d */
    private boolean f21450d;

    public BackgroundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25299a();
    }

    public BackgroundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25299a();
    }

    public BackgroundImageView(Context context, boolean z) {
        super(context);
        m25299a();
        this.f21448b = z;
    }

    /* renamed from: a */
    private void m25299a() {
        this.f21447a.setColor(-16711936);
        this.f21447a.setStrokeWidth(2.0f);
        this.f21447a.setStyle(Style.FILL_AND_STROKE);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f21448b) {
            if (this.f21450d) {
                this.f21450d = false;
                return;
            }
            Bitmap loadBitmapFromView = loadBitmapFromView(this);
            canvas.drawColor(0, Mode.CLEAR);
            canvas.drawBitmap(BitmapUtil.getRoundedCornerBitmap(loadBitmapFromView, SizeUtil.dp20), this.f21449c, this.f21447a);
        }
    }

    public Bitmap loadBitmapFromView(View view) {
        if (view.getMeasuredHeight() <= 0) {
            view.measure(-2, -2);
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f21450d = true;
        view.draw(canvas);
        return createBitmap;
    }
}
