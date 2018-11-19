package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.UiThread;
import android.support.v4.view.C0592b;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

@UiThread
public class StandardGestureDetector extends C5767a<StandardOnGestureListener> {
    /* renamed from: c */
    final StandardOnGestureListener f25687c = new C70781(this);
    /* renamed from: d */
    private final C0592b f25688d;

    public interface StandardOnGestureListener extends OnDoubleTapListener, OnGestureListener {
    }

    /* renamed from: com.mapbox.android.gestures.StandardGestureDetector$1 */
    class C70781 implements StandardOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ StandardGestureDetector f25686a;

        C70781(StandardGestureDetector standardGestureDetector) {
            this.f25686a = standardGestureDetector;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return (!this.f25686a.mo6242a(5) || ((StandardOnGestureListener) this.f25686a.b).onSingleTapUp(motionEvent) == null) ? null : true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (this.f25686a.mo6242a(6)) {
                ((StandardOnGestureListener) this.f25686a.b).onLongPress(motionEvent);
            }
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return this.f25686a.mo6242a(0) && ((StandardOnGestureListener) this.f25686a.b).onScroll(motionEvent, motionEvent2, f, f2) != null;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return (!this.f25686a.mo6242a(7) || ((StandardOnGestureListener) this.f25686a.b).onFling(motionEvent, motionEvent2, f, f2) == null) ? null : true;
        }

        public void onShowPress(MotionEvent motionEvent) {
            if (this.f25686a.mo6242a(8)) {
                ((StandardOnGestureListener) this.f25686a.b).onShowPress(motionEvent);
            }
        }

        public boolean onDown(MotionEvent motionEvent) {
            return (!this.f25686a.mo6242a(9) || ((StandardOnGestureListener) this.f25686a.b).onDown(motionEvent) == null) ? null : true;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            return (!this.f25686a.mo6242a(10) || ((StandardOnGestureListener) this.f25686a.b).onDoubleTap(motionEvent) == null) ? null : true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return (!this.f25686a.mo6242a(11) || ((StandardOnGestureListener) this.f25686a.b).onDoubleTapEvent(motionEvent) == null) ? null : true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return (!this.f25686a.mo6242a(12) || ((StandardOnGestureListener) this.f25686a.b).onSingleTapConfirmed(motionEvent) == null) ? null : true;
        }
    }

    /* renamed from: com.mapbox.android.gestures.StandardGestureDetector$a */
    public static class C7079a implements StandardOnGestureListener {
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public StandardGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.f25688d = new C0592b(context, this.f25687c);
    }

    /* renamed from: b */
    protected boolean mo6238b(MotionEvent motionEvent) {
        return this.f25688d.a(motionEvent);
    }
}
