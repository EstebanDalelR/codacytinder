package com.mapbox.mapboxsdk.annotations;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class Bubble extends Drawable {
    private float arrowHeight;
    private float arrowPosition;
    private float arrowWidth;
    private float cornersRadius;
    private Paint paint = new Paint(1);
    private Path path = new Path();
    private RectF rect;
    private Paint strokePaint;
    private Path strokePath;
    private float strokeWidth;

    public int getOpacity() {
        return -3;
    }

    Bubble(RectF rectF, ArrowDirection arrowDirection, float f, float f2, float f3, float f4, int i, float f5, int i2) {
        this.rect = rectF;
        this.arrowWidth = f;
        this.arrowHeight = f2;
        this.arrowPosition = f3;
        this.cornersRadius = f4;
        this.paint.setColor(i);
        this.strokeWidth = f5;
        if (f5 > 0.0f) {
            this.strokePaint = new Paint(1);
            this.strokePaint.setColor(i2);
            this.strokePath = new Path();
            initPath(arrowDirection, this.path, f5);
            initPath(arrowDirection, this.strokePath, 0.0f);
            return;
        }
        initPath(arrowDirection, this.path, 0.0f);
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }

    public void draw(Canvas canvas) {
        if (this.strokeWidth > 0.0f) {
            canvas.drawPath(this.strokePath, this.strokePaint);
        }
        canvas.drawPath(this.path, this.paint);
    }

    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public int getIntrinsicWidth() {
        return (int) this.rect.width();
    }

    public int getIntrinsicHeight() {
        return (int) this.rect.height();
    }

    private void initPath(ArrowDirection arrowDirection, Path path, float f) {
        switch (arrowDirection.getValue()) {
            case null:
                if (this.cornersRadius <= null) {
                    initLeftSquarePath(this.rect, path, f);
                    return;
                } else if (f <= 0.0f || f <= this.cornersRadius) {
                    initLeftRoundedPath(this.rect, path, f);
                    return;
                } else {
                    initLeftSquarePath(this.rect, path, f);
                    return;
                }
            case 1:
                if (this.cornersRadius <= null) {
                    initRightSquarePath(this.rect, path, f);
                    return;
                } else if (f <= 0.0f || f <= this.cornersRadius) {
                    initRightRoundedPath(this.rect, path, f);
                    return;
                } else {
                    initRightSquarePath(this.rect, path, f);
                    return;
                }
            case 2:
                if (this.cornersRadius <= null) {
                    initTopSquarePath(this.rect, path, f);
                    return;
                } else if (f <= 0.0f || f <= this.cornersRadius) {
                    initTopRoundedPath(this.rect, path, f);
                    return;
                } else {
                    initTopSquarePath(this.rect, path, f);
                    return;
                }
            case 3:
                if (this.cornersRadius <= null) {
                    initBottomSquarePath(this.rect, path, f);
                    return;
                } else if (f <= 0.0f || f <= this.cornersRadius) {
                    initBottomRoundedPath(this.rect, path, f);
                    return;
                } else {
                    initBottomSquarePath(this.rect, path, f);
                    return;
                }
            default:
                return;
        }
    }

    private void initLeftSquarePath(RectF rectF, Path path, float f) {
        path.moveTo((this.arrowWidth + rectF.left) + f, rectF.top + f);
        path.lineTo(rectF.width() - f, rectF.top + f);
        path.lineTo(rectF.right - f, rectF.bottom - f);
        path.lineTo((rectF.left + this.arrowWidth) + f, rectF.bottom - f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.left + this.arrowWidth) + f, (this.arrowHeight + this.arrowPosition) - f2);
        path.lineTo((rectF.left + f) + f, this.arrowPosition + (this.arrowHeight / 2.0f));
        path.lineTo((rectF.left + this.arrowWidth) + f, this.arrowPosition + f2);
        path.lineTo((rectF.left + this.arrowWidth) + f, rectF.top + f);
        path.close();
    }

    private void initLeftRoundedPath(RectF rectF, Path path, float f) {
        path.moveTo(((this.arrowWidth + rectF.left) + this.cornersRadius) + f, rectF.top + f);
        path.lineTo((rectF.width() - this.cornersRadius) - f, rectF.top + f);
        path.arcTo(new RectF(rectF.right - this.cornersRadius, rectF.top + f, rectF.right - f, this.cornersRadius + rectF.top), 270.0f, 90.0f);
        path.lineTo(rectF.right - f, (rectF.bottom - this.cornersRadius) - f);
        path.arcTo(new RectF(rectF.right - this.cornersRadius, rectF.bottom - this.cornersRadius, rectF.right - f, rectF.bottom - f), 0.0f, 90.0f);
        path.lineTo(((rectF.left + this.arrowWidth) + this.cornersRadius) + f, rectF.bottom - f);
        path.arcTo(new RectF((rectF.left + this.arrowWidth) + f, rectF.bottom - this.cornersRadius, (this.cornersRadius + rectF.left) + this.arrowWidth, rectF.bottom - f), 90.0f, 90.0f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.left + this.arrowWidth) + f, (this.arrowHeight + this.arrowPosition) - f2);
        path.lineTo((rectF.left + f) + f, this.arrowPosition + (this.arrowHeight / 2.0f));
        path.lineTo((rectF.left + this.arrowWidth) + f, this.arrowPosition + f2);
        path.lineTo((rectF.left + this.arrowWidth) + f, (rectF.top + this.cornersRadius) + f);
        path.arcTo(new RectF((rectF.left + this.arrowWidth) + f, rectF.top + f, (this.cornersRadius + rectF.left) + this.arrowWidth, this.cornersRadius + rectF.top), 180.0f, 90.0f);
        path.close();
    }

    private void initTopSquarePath(RectF rectF, Path path, float f) {
        path.moveTo((rectF.left + this.arrowPosition) + f, (rectF.top + this.arrowHeight) + f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.left + this.arrowPosition) + f2, (rectF.top + this.arrowHeight) + f);
        path.lineTo((rectF.left + (this.arrowWidth / 2.0f)) + this.arrowPosition, (rectF.top + f) + f);
        path.lineTo(((rectF.left + this.arrowWidth) + this.arrowPosition) - f2, (rectF.top + this.arrowHeight) + f);
        path.lineTo(rectF.right - f, (rectF.top + this.arrowHeight) + f);
        path.lineTo(rectF.right - f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.bottom - f);
        path.lineTo(rectF.left + f, (rectF.top + this.arrowHeight) + f);
        path.lineTo((rectF.left + this.arrowPosition) + f, (rectF.top + this.arrowHeight) + f);
        path.close();
    }

    private void initTopRoundedPath(RectF rectF, Path path, float f) {
        path.moveTo((rectF.left + Math.min(this.arrowPosition, this.cornersRadius)) + f, (rectF.top + this.arrowHeight) + f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.left + this.arrowPosition) + f2, (rectF.top + this.arrowHeight) + f);
        path.lineTo((rectF.left + (this.arrowWidth / 2.0f)) + this.arrowPosition, (rectF.top + f) + f);
        path.lineTo(((rectF.left + this.arrowWidth) + this.arrowPosition) - f2, (rectF.top + this.arrowHeight) + f);
        path.lineTo((rectF.right - this.cornersRadius) - f, (rectF.top + this.arrowHeight) + f);
        path.arcTo(new RectF(rectF.right - this.cornersRadius, (rectF.top + this.arrowHeight) + f, rectF.right - f, (this.cornersRadius + rectF.top) + this.arrowHeight), 270.0f, 90.0f);
        path.lineTo(rectF.right - f, (rectF.bottom - this.cornersRadius) - f);
        path.arcTo(new RectF(rectF.right - this.cornersRadius, rectF.bottom - this.cornersRadius, rectF.right - f, rectF.bottom - f), 0.0f, 90.0f);
        path.lineTo((rectF.left + this.cornersRadius) + f, rectF.bottom - f);
        path.arcTo(new RectF(rectF.left + f, rectF.bottom - this.cornersRadius, this.cornersRadius + rectF.left, rectF.bottom - f), 90.0f, 90.0f);
        path.lineTo(rectF.left + f, ((rectF.top + this.arrowHeight) + this.cornersRadius) + f);
        path.arcTo(new RectF(rectF.left + f, (rectF.top + this.arrowHeight) + f, this.cornersRadius + rectF.left, (this.cornersRadius + rectF.top) + this.arrowHeight), 180.0f, 90.0f);
        path.close();
    }

    private void initRightSquarePath(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + f, rectF.top + f);
        path.lineTo((rectF.width() - this.arrowWidth) - f, rectF.top + f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.right - this.arrowWidth) - f, this.arrowPosition + f2);
        path.lineTo((rectF.right - f) - f, this.arrowPosition + (this.arrowHeight / 2.0f));
        path.lineTo((rectF.right - this.arrowWidth) - f, (this.arrowPosition + this.arrowHeight) - f2);
        path.lineTo((rectF.right - this.arrowWidth) - f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.top + f);
        path.close();
    }

    private void initRightRoundedPath(RectF rectF, Path path, float f) {
        path.moveTo((rectF.left + this.cornersRadius) + f, rectF.top + f);
        path.lineTo(((rectF.width() - this.cornersRadius) - this.arrowWidth) - f, rectF.top + f);
        path.arcTo(new RectF((rectF.right - this.cornersRadius) - this.arrowWidth, rectF.top + f, (rectF.right - this.arrowWidth) - f, this.cornersRadius + rectF.top), 270.0f, 90.0f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.right - this.arrowWidth) - f, this.arrowPosition + f2);
        path.lineTo((rectF.right - f) - f, this.arrowPosition + (this.arrowHeight / 2.0f));
        path.lineTo((rectF.right - this.arrowWidth) - f, (this.arrowPosition + this.arrowHeight) - f2);
        path.lineTo((rectF.right - this.arrowWidth) - f, (rectF.bottom - this.cornersRadius) - f);
        path.arcTo(new RectF((rectF.right - this.cornersRadius) - this.arrowWidth, rectF.bottom - this.cornersRadius, (rectF.right - this.arrowWidth) - f, rectF.bottom - f), 0.0f, 90.0f);
        path.lineTo((rectF.left + this.arrowWidth) + f, rectF.bottom - f);
        path.arcTo(new RectF(rectF.left + f, rectF.bottom - this.cornersRadius, this.cornersRadius + rectF.left, rectF.bottom - f), 90.0f, 90.0f);
        path.arcTo(new RectF(rectF.left + f, rectF.top + f, this.cornersRadius + rectF.left, this.cornersRadius + rectF.top), 180.0f, 90.0f);
        path.close();
    }

    private void initBottomSquarePath(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + f, rectF.top + f);
        path.lineTo(rectF.right - f, rectF.top + f);
        path.lineTo(rectF.right - f, (rectF.bottom - this.arrowHeight) - f);
        float f2 = f / 2.0f;
        path.lineTo(((rectF.left + this.arrowWidth) + this.arrowPosition) - f2, (rectF.bottom - this.arrowHeight) - f);
        path.lineTo((rectF.left + this.arrowPosition) + (this.arrowWidth / 2.0f), (rectF.bottom - f) - f);
        path.lineTo((rectF.left + this.arrowPosition) + f2, (rectF.bottom - this.arrowHeight) - f);
        path.lineTo((rectF.left + this.arrowPosition) + f, (rectF.bottom - this.arrowHeight) - f);
        path.lineTo(rectF.left + f, (rectF.bottom - this.arrowHeight) - f);
        path.lineTo(rectF.left + f, rectF.top + f);
        path.close();
    }

    private void initBottomRoundedPath(RectF rectF, Path path, float f) {
        path.moveTo((rectF.left + this.cornersRadius) + f, rectF.top + f);
        path.lineTo((rectF.width() - this.cornersRadius) - f, rectF.top + f);
        path.arcTo(new RectF(rectF.right - this.cornersRadius, rectF.top + f, rectF.right - f, this.cornersRadius + rectF.top), 270.0f, 90.0f);
        path.lineTo(rectF.right - f, ((rectF.bottom - this.arrowHeight) - this.cornersRadius) - f);
        path.arcTo(new RectF(rectF.right - this.cornersRadius, (rectF.bottom - this.cornersRadius) - this.arrowHeight, rectF.right - f, (rectF.bottom - this.arrowHeight) - f), 0.0f, 90.0f);
        float f2 = f / 2.0f;
        path.lineTo(((rectF.left + this.arrowWidth) + this.arrowPosition) - f2, (rectF.bottom - this.arrowHeight) - f);
        path.lineTo((rectF.left + this.arrowPosition) + (this.arrowWidth / 2.0f), (rectF.bottom - f) - f);
        path.lineTo((rectF.left + this.arrowPosition) + f2, (rectF.bottom - this.arrowHeight) - f);
        path.lineTo((rectF.left + Math.min(this.cornersRadius, this.arrowPosition)) + f, (rectF.bottom - this.arrowHeight) - f);
        path.arcTo(new RectF(rectF.left + f, (rectF.bottom - this.cornersRadius) - this.arrowHeight, this.cornersRadius + rectF.left, (rectF.bottom - this.arrowHeight) - f), 90.0f, 90.0f);
        path.lineTo(rectF.left + f, (rectF.top + this.cornersRadius) + f);
        path.arcTo(new RectF(rectF.left + f, rectF.top + f, this.cornersRadius + rectF.left, this.cornersRadius + rectF.top), 180.0f, 90.0f);
        path.close();
    }
}
