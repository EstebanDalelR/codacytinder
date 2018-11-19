package android.support.v4.view;

import android.view.MotionEvent;

/* renamed from: android.support.v4.view.f */
public final class C0597f {
    @Deprecated
    /* renamed from: a */
    public static int m2323a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    /* renamed from: b */
    public static int m2325b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    /* renamed from: a */
    public static int m2324a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* renamed from: b */
    public static int m2326b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* renamed from: c */
    public static float m2327c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    /* renamed from: d */
    public static boolean m2328d(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i ? true : null;
    }
}
