package com.mapbox.mapboxsdk.annotations;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.mapbox.mapboxsdk.C5812R;

public class BubbleLayout extends LinearLayout {
    public static final float DEFAULT_STROKE_WIDTH = -1.0f;
    private ArrowDirection arrowDirection;
    private float arrowHeight;
    private float arrowPosition;
    private float arrowWidth;
    private Bubble bubble;
    private int bubbleColor;
    private float cornersRadius;
    private int strokeColor;
    private float strokeWidth;

    public BubbleLayout(Context context) {
        this(context, null, 0);
    }

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        attributeSet = getContext().obtainStyledAttributes(attributeSet, C5812R.styleable.mapbox_BubbleLayout);
        this.arrowDirection = new ArrowDirection(attributeSet.getInt(C5812R.styleable.mapbox_BubbleLayout_mapbox_bl_arrowDirection, 0));
        this.arrowWidth = attributeSet.getDimension(C5812R.styleable.mapbox_BubbleLayout_mapbox_bl_arrowWidth, convertDpToPixel(8.0f, context));
        this.arrowHeight = attributeSet.getDimension(C5812R.styleable.mapbox_BubbleLayout_mapbox_bl_arrowHeight, convertDpToPixel(8.0f, context));
        this.arrowPosition = attributeSet.getDimension(C5812R.styleable.mapbox_BubbleLayout_mapbox_bl_arrowPosition, convertDpToPixel(12.0f, context));
        this.cornersRadius = attributeSet.getDimension(C5812R.styleable.mapbox_BubbleLayout_mapbox_bl_cornersRadius, 0);
        this.bubbleColor = attributeSet.getColor(C5812R.styleable.mapbox_BubbleLayout_mapbox_bl_bubbleColor, -1);
        this.strokeWidth = attributeSet.getDimension(C5812R.styleable.mapbox_BubbleLayout_mapbox_bl_strokeWidth, -1082130432);
        this.strokeColor = attributeSet.getColor(C5812R.styleable.mapbox_BubbleLayout_mapbox_bl_strokeColor, -7829368);
        attributeSet.recycle();
        initPadding();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        initDrawable(0, getWidth(), 0, getHeight());
    }

    protected void dispatchDraw(Canvas canvas) {
        if (this.bubble != null) {
            this.bubble.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    static float convertDpToPixel(float f, Context context) {
        return f * ((float) (context.getResources().getDisplayMetrics().densityDpi / 160));
    }

    public ArrowDirection getArrowDirection() {
        return this.arrowDirection;
    }

    public BubbleLayout setArrowDirection(ArrowDirection arrowDirection) {
        resetPadding();
        this.arrowDirection = arrowDirection;
        initPadding();
        return this;
    }

    public float getArrowWidth() {
        return this.arrowWidth;
    }

    public BubbleLayout setArrowWidth(float f) {
        resetPadding();
        this.arrowWidth = f;
        initPadding();
        return this;
    }

    public float getArrowHeight() {
        return this.arrowHeight;
    }

    public BubbleLayout setArrowHeight(float f) {
        resetPadding();
        this.arrowHeight = f;
        initPadding();
        return this;
    }

    public float getArrowPosition() {
        return this.arrowPosition;
    }

    public BubbleLayout setArrowPosition(float f) {
        resetPadding();
        this.arrowPosition = f;
        initPadding();
        return this;
    }

    public float getCornersRadius() {
        return this.cornersRadius;
    }

    public BubbleLayout setCornersRadius(float f) {
        this.cornersRadius = f;
        requestLayout();
        return this;
    }

    public int getBubbleColor() {
        return this.bubbleColor;
    }

    public BubbleLayout setBubbleColor(int i) {
        this.bubbleColor = i;
        requestLayout();
        return this;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public BubbleLayout setStrokeWidth(float f) {
        resetPadding();
        this.strokeWidth = f;
        initPadding();
        return this;
    }

    public int getStrokeColor() {
        return this.strokeColor;
    }

    public BubbleLayout setStrokeColor(int i) {
        this.strokeColor = i;
        requestLayout();
        return this;
    }

    private void initPadding() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        switch (this.arrowDirection.getValue()) {
            case 0:
                paddingLeft = (int) (((float) paddingLeft) + this.arrowWidth);
                break;
            case 1:
                paddingRight = (int) (((float) paddingRight) + this.arrowWidth);
                break;
            case 2:
                paddingTop = (int) (((float) paddingTop) + this.arrowHeight);
                break;
            case 3:
                paddingBottom = (int) (((float) paddingBottom) + this.arrowHeight);
                break;
            default:
                break;
        }
        if (this.strokeWidth > 0.0f) {
            paddingLeft = (int) (((float) paddingLeft) + this.strokeWidth);
            paddingRight = (int) (((float) paddingRight) + this.strokeWidth);
            paddingTop = (int) (((float) paddingTop) + this.strokeWidth);
            paddingBottom = (int) (((float) paddingBottom) + this.strokeWidth);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    private void initDrawable(int i, int i2, int i3, int i4) {
        if (i2 >= i) {
            if (i4 >= i3) {
                this.bubble = new Bubble(new RectF((float) i, (float) i3, (float) i2, (float) i4), this.arrowDirection, this.arrowWidth, this.arrowHeight, this.arrowPosition, this.cornersRadius, this.bubbleColor, this.strokeWidth, this.strokeColor);
            }
        }
    }

    private void resetPadding() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        switch (this.arrowDirection.getValue()) {
            case 0:
                paddingLeft = (int) (((float) paddingLeft) - this.arrowWidth);
                break;
            case 1:
                paddingRight = (int) (((float) paddingRight) - this.arrowWidth);
                break;
            case 2:
                paddingTop = (int) (((float) paddingTop) - this.arrowHeight);
                break;
            case 3:
                paddingBottom = (int) (((float) paddingBottom) - this.arrowHeight);
                break;
            default:
                break;
        }
        if (this.strokeWidth > 0.0f) {
            paddingLeft = (int) (((float) paddingLeft) - this.strokeWidth);
            paddingRight = (int) (((float) paddingRight) - this.strokeWidth);
            paddingTop = (int) (((float) paddingTop) - this.strokeWidth);
            paddingBottom = (int) (((float) paddingBottom) - this.strokeWidth);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }
}
