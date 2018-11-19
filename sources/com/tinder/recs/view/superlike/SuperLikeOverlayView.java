package com.tinder.recs.view.superlike;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.R;

public class SuperLikeOverlayView extends View {
    private static final int VERTEX_CURVE_RADIUS_FACTOR = 5;
    @Nullable
    private AdjacentPoints[] adjacentPointsList;
    private final Paint overlayPaint;
    private final Path path;
    private float scale = 1.0f;
    private final SuperLikeOverlayStarPointsGenerator superLikeOverlayStarPointsGenerator = new SuperLikeOverlayStarPointsGenerator();
    @Nullable
    private ValueAnimator valueAnimator;

    static class AdjacentPoints {
        final Point p1 = new Point();
        final Point p2 = new Point();
        final Point p3 = new Point();

        AdjacentPoints() {
        }
    }

    static class Point {
        /* renamed from: x */
        float f46299x;
        /* renamed from: y */
        float f46300y;

        Point() {
        }

        Point(float f, float f2) {
            set(f, f2);
        }

        void set(float f, float f2) {
            this.f46299x = f;
            this.f46300y = f2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.f46299x);
            stringBuilder.append(",");
            stringBuilder.append(this.f46300y);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public SuperLikeOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(2, null);
        setWillNotDraw(null);
        setBackgroundColor(getResources().getColor(R.color.recs_superlike_overlay_t60));
        this.overlayPaint = new Paint();
        this.overlayPaint.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.path = new Path();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        generatePoints();
    }

    public void scale(float f) {
        f = roundTo2Decimal(f);
        if (this.scale != f) {
            this.scale = f;
            generatePoints();
            invalidate();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.valueAnimator != null) {
            this.valueAnimator.cancel();
        }
        scale(1.0f);
    }

    public float getScale() {
        return this.scale;
    }

    public ValueAnimator getAnimator(float f, float f2) {
        if (this.valueAnimator != null) {
            this.valueAnimator.cancel();
        }
        this.valueAnimator = ValueAnimator.ofFloat(new float[]{f, f2});
        return this.valueAnimator;
    }

    private void generatePoints() {
        this.adjacentPointsList = this.superLikeOverlayStarPointsGenerator.generatePointsForStar((this.scale * ((float) getWidth())) / 10.0f, 5.0f);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.adjacentPointsList == null) {
            generatePoints();
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.path.rewind();
        int i = 0;
        Point point = this.adjacentPointsList[0].p1;
        float f = (float) width;
        float f2 = (float) height;
        this.path.moveTo(point.f46299x + f, point.f46300y + f2);
        AdjacentPoints[] adjacentPointsArr = this.adjacentPointsList;
        int length = adjacentPointsArr.length;
        while (i < length) {
            AdjacentPoints adjacentPoints = adjacentPointsArr[i];
            this.path.lineTo(adjacentPoints.p1.f46299x + f, adjacentPoints.p1.f46300y + f2);
            this.path.quadTo(adjacentPoints.p2.f46299x + f, adjacentPoints.p2.f46300y + f2, adjacentPoints.p3.f46299x + f, adjacentPoints.p3.f46300y + f2);
            i++;
        }
        this.path.close();
        canvas.drawPath(this.path, this.overlayPaint);
    }

    private float roundTo2Decimal(float f) {
        return ((float) Math.round(f * 100.0f)) / 100.0f;
    }
}
