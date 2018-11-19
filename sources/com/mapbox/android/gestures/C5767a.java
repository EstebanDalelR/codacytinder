package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import java.util.Set;

@UiThread
/* renamed from: com.mapbox.android.gestures.a */
public abstract class C5767a<L> {
    /* renamed from: a */
    protected final Context f21521a;
    /* renamed from: b */
    protected L f21522b;
    /* renamed from: c */
    private final AndroidGesturesManager f21523c;
    /* renamed from: d */
    private MotionEvent f21524d;
    /* renamed from: e */
    private MotionEvent f21525e;
    /* renamed from: f */
    private long f21526f;
    /* renamed from: g */
    private boolean f21527g = true;

    /* renamed from: b */
    protected abstract boolean mo6238b(MotionEvent motionEvent);

    public C5767a(Context context, AndroidGesturesManager androidGesturesManager) {
        this.f21521a = context;
        this.f21523c = androidGesturesManager;
    }

    /* renamed from: a */
    protected boolean m25366a(MotionEvent motionEvent) {
        return m25361c(motionEvent);
    }

    /* renamed from: c */
    private boolean m25361c(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return null;
        }
        if (this.f21525e != null) {
            this.f21525e.recycle();
            this.f21525e = null;
        }
        if (this.f21524d != null) {
            this.f21525e = MotionEvent.obtain(this.f21524d);
            this.f21524d.recycle();
            this.f21524d = null;
        }
        this.f21524d = MotionEvent.obtain(motionEvent);
        this.f21526f = this.f21524d.getEventTime() - this.f21524d.getDownTime();
        return mo6238b(motionEvent);
    }

    /* renamed from: a */
    protected boolean mo6242a(int i) {
        if (this.f21522b != null) {
            if (this.f21527g) {
                for (Set<Integer> set : this.f21523c.m25360e()) {
                    if (set.contains(Integer.valueOf(i))) {
                        for (Integer intValue : set) {
                            int intValue2 = intValue.intValue();
                            for (C5767a c5767a : this.f21523c.m25347a()) {
                                if (c5767a instanceof C7843f) {
                                    C7843f c7843f = (C7843f) c5767a;
                                    if (c7843f.m33619o().contains(Integer.valueOf(intValue2)) && c7843f.m33620p()) {
                                        return false;
                                    }
                                }
                            }
                        }
                        continue;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected void m25363a(L l) {
        this.f21522b = l;
    }

    /* renamed from: a */
    public long m25362a() {
        return this.f21526f;
    }

    /* renamed from: b */
    public MotionEvent m25367b() {
        return this.f21524d;
    }

    /* renamed from: c */
    public MotionEvent m25369c() {
        return this.f21525e;
    }

    /* renamed from: a */
    public void mo7377a(boolean z) {
        this.f21527g = z;
    }
}
