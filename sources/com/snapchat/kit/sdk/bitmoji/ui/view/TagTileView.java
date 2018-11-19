package com.snapchat.kit.sdk.bitmoji.ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.snapchat.kit.sdk.bitmoji.ui.p147c.C5912a;

public class TagTileView extends AppCompatTextView {
    /* renamed from: a */
    private final ShapeDrawable f28478a;
    /* renamed from: b */
    private final ObjectAnimator f28479b;

    public TagTileView(Context context) {
        this(context, null);
    }

    public TagTileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public TagTileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28479b = C5912a.m25500a(this);
        this.f28478a = new ShapeDrawable();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i3 = ((float) i2) / 1073741824;
        this.f28478a.setShape(new RoundRectShape(new float[]{i3, i3, i3, i3, i3, i3, i3, i3}, null, null));
        this.f28478a.setBounds(0, 0, i, i2);
    }

    protected void onDraw(Canvas canvas) {
        this.f28478a.draw(canvas);
        super.onDraw(canvas);
    }

    public void setBackgroundColor(int i) {
        this.f28478a.getPaint().setColor(i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    this.f28479b.start();
                    break;
                case 1:
                    break;
                default:
                    break;
            }
        }
        this.f28479b.reverse();
        return super.onTouchEvent(motionEvent);
    }
}
