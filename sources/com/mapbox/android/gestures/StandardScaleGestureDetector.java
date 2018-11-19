package com.mapbox.android.gestures;

import android.os.Build.VERSION;
import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.mapbox.android.gestures.C5772g.C5771a;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

@UiThread
public class StandardScaleGestureDetector extends C7843f<StandardOnScaleGestureListener> {
    /* renamed from: k */
    private static final Set<Integer> f29091k = new HashSet();
    /* renamed from: c */
    OnScaleGestureListener f29092c = new C57661(this);
    /* renamed from: d */
    float f29093d;
    /* renamed from: j */
    float f29094j;
    /* renamed from: l */
    private ScaleGestureDetector f29095l;
    /* renamed from: m */
    private boolean f29096m;
    /* renamed from: n */
    private boolean f29097n;
    /* renamed from: o */
    private float f29098o;

    /* renamed from: com.mapbox.android.gestures.StandardScaleGestureDetector$1 */
    class C57661 implements OnScaleGestureListener {
        /* renamed from: a */
        final /* synthetic */ StandardScaleGestureDetector f21520a;

        C57661(StandardScaleGestureDetector standardScaleGestureDetector) {
            this.f21520a = standardScaleGestureDetector;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            return this.f21520a.m34507a(scaleGestureDetector);
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return this.f21520a.m34510b(scaleGestureDetector);
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            this.f21520a.m34512c(scaleGestureDetector);
        }
    }

    public interface StandardOnScaleGestureListener {
        boolean onScale(StandardScaleGestureDetector standardScaleGestureDetector);

        boolean onScaleBegin(StandardScaleGestureDetector standardScaleGestureDetector);

        void onScaleEnd(StandardScaleGestureDetector standardScaleGestureDetector, float f, float f2);
    }

    /* renamed from: com.mapbox.android.gestures.StandardScaleGestureDetector$a */
    public static class C7080a implements StandardOnScaleGestureListener {
        public boolean onScale(StandardScaleGestureDetector standardScaleGestureDetector) {
            return false;
        }

        public boolean onScaleBegin(StandardScaleGestureDetector standardScaleGestureDetector) {
            return true;
        }

        public void onScaleEnd(StandardScaleGestureDetector standardScaleGestureDetector, float f, float f2) {
        }
    }

    static {
        f29091k.add(Integer.valueOf(1));
    }

    public StandardScaleGestureDetector(android.content.Context r2, com.mapbox.android.gestures.AndroidGesturesManager r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r1.<init>(r2, r3);
        r3 = new com.mapbox.android.gestures.StandardScaleGestureDetector$1;
        r3.<init>(r1);
        r1.f29092c = r3;
        r3 = new android.view.ScaleGestureDetector;
        r0 = r1.f29092c;
        r3.<init>(r2, r0);
        r1.f29095l = r3;
        r1.mo7606f();	 Catch:{ NoSuchFieldException -> 0x0016, NoSuchFieldException -> 0x0016 }
    L_0x0016:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.android.gestures.StandardScaleGestureDetector.<init>(android.content.Context, com.mapbox.android.gestures.AndroidGesturesManager):void");
    }

    /* renamed from: f */
    void mo7606f() throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = this.f29095l.getClass().getDeclaredField("mMinSpan");
        declaredField.setAccessible(true);
        if (VERSION.SDK_INT >= 24) {
            declaredField.set(this.f29095l, Integer.valueOf((int) this.a.getResources().getDimension(C5771a.mapbox_internalScaleMinSpan24)));
        } else {
            declaredField.set(this.f29095l, Integer.valueOf((int) this.a.getResources().getDimension(C5771a.mapbox_internalScaleMinSpan23)));
        }
        declaredField = this.f29095l.getClass().getDeclaredField("mSpanSlop");
        declaredField.setAccessible(true);
        declaredField.set(this.f29095l, Integer.valueOf(ViewConfiguration.get(this.a).getScaledTouchSlop()));
    }

    /* renamed from: a */
    boolean m34507a(ScaleGestureDetector scaleGestureDetector) {
        if (this.f29093d == 0.0f) {
            this.f29093d = scaleGestureDetector.getCurrentSpan();
        }
        this.f29094j = Math.abs(this.f29093d - scaleGestureDetector.getCurrentSpan());
        boolean z = false;
        if (m33620p() || !mo6242a(1) || this.f29094j < this.f29098o) {
            if (!m33620p()) {
                return true;
            }
            if (scaleGestureDetector.getScaleFactor() < 1.0f) {
                z = true;
            }
            this.f29097n = z;
            return ((StandardOnScaleGestureListener) this.b).onScale(this);
        } else if (((StandardOnScaleGestureListener) this.b).onScaleBegin(this) == null) {
            return false;
        } else {
            m33618n();
            return true;
        }
    }

    /* renamed from: b */
    boolean m34510b(ScaleGestureDetector scaleGestureDetector) {
        this.f29093d = scaleGestureDetector.getCurrentSpan();
        if (!mo6242a(1)) {
            return null;
        }
        this.g = VelocityTracker.obtain();
        if (this.f29098o == 0.0f && ((StandardOnScaleGestureListener) this.b).onScaleBegin(this)) {
            m33618n();
        }
        return true;
    }

    /* renamed from: c */
    void m34512c(ScaleGestureDetector scaleGestureDetector) {
        this.f29096m = true;
        mo7379h();
    }

    /* renamed from: b */
    protected boolean mo6238b(MotionEvent motionEvent) {
        super.mo6238b(motionEvent);
        return this.f29095l.onTouchEvent(motionEvent);
    }

    /* renamed from: h */
    protected void mo7379h() {
        if (m33620p()) {
            if (this.f29096m) {
                super.mo7379h();
                ((StandardOnScaleGestureListener) this.b).onScaleEnd(this, this.h, this.i);
                this.f29096m = false;
            }
            return;
        }
        super.mo7379h();
    }

    /* renamed from: q */
    public void mo7609q() {
        super.mo7609q();
        this.f29096m = true;
    }

    @NonNull
    /* renamed from: d */
    protected Set<Integer> mo7378d() {
        return f29091k;
    }

    /* renamed from: r */
    public boolean m34517r() {
        return this.f29097n;
    }

    /* renamed from: b */
    public void m34508b(float f) {
        this.f29098o = f;
    }

    /* renamed from: c */
    public void mo7375c(@DimenRes int i) {
        m34508b(this.a.getResources().getDimension(i));
    }

    /* renamed from: s */
    public float m34518s() {
        return this.f29095l.getScaleFactor();
    }
}
