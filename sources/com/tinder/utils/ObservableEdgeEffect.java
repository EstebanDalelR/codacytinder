package com.tinder.utils;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

@Deprecated
public class ObservableEdgeEffect extends EdgeEffect {
    /* renamed from: a */
    private EdgeListener f47604a;
    /* renamed from: b */
    private boolean f47605b;

    public interface EdgeListener {
        void onPull(float f, float f2);

        void onRelease();
    }

    public void onPull(float f) {
        super.onPull(f);
        if (this.f47604a != null) {
            this.f47604a.onPull(f, 0.0f);
        }
    }

    public void onPull(float f, float f2) {
        super.onPull(f, f2);
        if (this.f47604a != null) {
            this.f47604a.onPull(f, f2);
        }
    }

    public void onRelease() {
        super.onRelease();
        if (this.f47604a != null && !isFinished()) {
            this.f47604a.onRelease();
        }
    }

    public void setColor(int i) {
        super.setColor(i);
    }

    public boolean draw(Canvas canvas) {
        if (this.f47605b) {
            return true;
        }
        return super.draw(canvas);
    }
}
