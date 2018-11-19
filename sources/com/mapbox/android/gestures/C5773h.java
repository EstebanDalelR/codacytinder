package com.mapbox.android.gestures;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.view.MotionEvent;

/* renamed from: com.mapbox.android.gestures.h */
public class C5773h {
    /* renamed from: a */
    public static PointF m25379a(@NonNull MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f += motionEvent.getX(i);
            f2 += motionEvent.getY(i);
        }
        float f3 = (float) pointerCount;
        return new PointF(f / f3, f2 / f3);
    }

    /* renamed from: a */
    public static float m25378a(MotionEvent motionEvent, int i) {
        return i < motionEvent.getPointerCount() ? motionEvent.getX(i) + (motionEvent.getRawX() - motionEvent.getX()) : null;
    }

    /* renamed from: b */
    public static float m25380b(MotionEvent motionEvent, int i) {
        return i < motionEvent.getPointerCount() ? motionEvent.getY(i) + (motionEvent.getRawY() - motionEvent.getY()) : null;
    }
}
