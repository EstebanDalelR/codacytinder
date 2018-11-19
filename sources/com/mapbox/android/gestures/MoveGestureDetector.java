package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@UiThread
public class MoveGestureDetector extends C7843f<OnMoveGestureListener> {
    /* renamed from: j */
    private static final Set<Integer> f29070j = new HashSet();
    /* renamed from: c */
    float f29071c;
    /* renamed from: d */
    float f29072d;
    /* renamed from: k */
    private PointF f29073k;
    /* renamed from: l */
    private boolean f29074l;
    /* renamed from: m */
    private float f29075m;
    /* renamed from: n */
    private final Map<Integer, C5768b> f29076n = new HashMap();

    public interface OnMoveGestureListener {
        boolean onMove(MoveGestureDetector moveGestureDetector, float f, float f2);

        boolean onMoveBegin(MoveGestureDetector moveGestureDetector);

        void onMoveEnd(MoveGestureDetector moveGestureDetector, float f, float f2);
    }

    /* renamed from: com.mapbox.android.gestures.MoveGestureDetector$a */
    public static class C7075a implements OnMoveGestureListener {
        public boolean onMove(MoveGestureDetector moveGestureDetector, float f, float f2) {
            return false;
        }

        public boolean onMoveBegin(MoveGestureDetector moveGestureDetector) {
            return true;
        }

        public void onMoveEnd(MoveGestureDetector moveGestureDetector, float f, float f2) {
        }
    }

    /* renamed from: i */
    protected int mo7607i() {
        return 1;
    }

    static {
        f29070j.add(Integer.valueOf(13));
    }

    public MoveGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }

    @NonNull
    /* renamed from: d */
    protected Set<Integer> mo7378d() {
        return f29070j;
    }

    /* renamed from: b */
    protected boolean mo6238b(MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 5:
                this.f29074l = true;
                this.f29076n.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new C5768b(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
                break;
            case 1:
                this.f29076n.clear();
                break;
            case 3:
                this.f29076n.clear();
                break;
            case 6:
                this.f29074l = true;
                this.f29076n.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                break;
            default:
                break;
        }
        return super.mo6238b(motionEvent);
    }

    /* renamed from: e */
    protected boolean mo7605e() {
        super.mo7605e();
        m34468r();
        if (m33620p()) {
            PointF m = m30658m();
            this.f29071c = this.f29073k.x - m.x;
            this.f29072d = this.f29073k.y - m.y;
            this.f29073k = m;
            if (!this.f29074l) {
                return ((OnMoveGestureListener) this.b).onMove(this, this.f29071c, this.f29072d);
            }
            this.f29074l = false;
            return ((OnMoveGestureListener) this.b).onMove(this, 0.0f, 0.0f);
        } else if (!mo6242a(13) || !((OnMoveGestureListener) this.b).onMoveBegin(this)) {
            return false;
        } else {
            m33618n();
            this.f29073k = m30658m();
            this.f29074l = false;
            return true;
        }
    }

    /* renamed from: r */
    private void m34468r() {
        for (Integer intValue : this.e) {
            int intValue2 = intValue.intValue();
            ((C5768b) this.f29076n.get(Integer.valueOf(intValue2))).m25371a(m25367b().getX(m25367b().findPointerIndex(intValue2)), m25367b().getY(m25367b().findPointerIndex(intValue2)));
        }
    }

    /* renamed from: f */
    boolean mo7606f() {
        for (C5768b c5768b : this.f29076n.values()) {
            if (Math.abs(c5768b.m25370a()) < this.f29075m) {
                if (Math.abs(c5768b.m25372b()) >= this.f29075m) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected boolean mo6242a(int i) {
        return (super.mo6242a(i) == 0 || mo7606f() == 0) ? false : true;
    }

    /* renamed from: g */
    protected void mo7376g() {
        super.mo7376g();
    }

    /* renamed from: h */
    protected void mo7379h() {
        super.mo7379h();
        ((OnMoveGestureListener) this.b).onMoveEnd(this, this.h, this.i);
    }
}
