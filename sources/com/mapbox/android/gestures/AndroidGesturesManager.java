package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import com.mapbox.android.gestures.C5772g.C5771a;
import com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener;
import com.mapbox.android.gestures.MultiFingerTapGestureDetector.OnMultiFingerTapGestureListener;
import com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener;
import com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener;
import com.mapbox.android.gestures.StandardGestureDetector.StandardOnGestureListener;
import com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@UiThread
public class AndroidGesturesManager {
    /* renamed from: a */
    private final List<Set<Integer>> f21511a;
    /* renamed from: b */
    private final List<C5767a> f21512b;
    /* renamed from: c */
    private final StandardGestureDetector f21513c;
    /* renamed from: d */
    private final StandardScaleGestureDetector f21514d;
    /* renamed from: e */
    private final RotateGestureDetector f21515e;
    /* renamed from: f */
    private final ShoveGestureDetector f21516f;
    /* renamed from: g */
    private final MultiFingerTapGestureDetector f21517g;
    /* renamed from: h */
    private final MoveGestureDetector f21518h;
    /* renamed from: i */
    private final SidewaysShoveGestureDetector f21519i;

    public AndroidGesturesManager(Context context) {
        this(context, true);
    }

    public AndroidGesturesManager(Context context, boolean z) {
        this(context, new ArrayList(), z);
    }

    public AndroidGesturesManager(Context context, List<Set<Integer>> list, boolean z) {
        this.f21511a = new ArrayList();
        this.f21512b = new ArrayList();
        this.f21511a.addAll(list);
        this.f21515e = new RotateGestureDetector(context, this);
        this.f21514d = new StandardScaleGestureDetector(context, this);
        this.f21516f = new ShoveGestureDetector(context, this);
        this.f21519i = new SidewaysShoveGestureDetector(context, this);
        this.f21517g = new MultiFingerTapGestureDetector(context, this);
        this.f21518h = new MoveGestureDetector(context, this);
        this.f21513c = new StandardGestureDetector(context, this);
        this.f21512b.add(this.f21515e);
        this.f21512b.add(this.f21514d);
        this.f21512b.add(this.f21516f);
        this.f21512b.add(this.f21519i);
        this.f21512b.add(this.f21517g);
        this.f21512b.add(this.f21518h);
        this.f21512b.add(this.f21513c);
        if (z) {
            m25346f();
        }
    }

    /* renamed from: f */
    private void m25346f() {
        for (C5767a c5767a : this.f21512b) {
            boolean z = c5767a instanceof MultiFingerTapGestureDetector;
            if (z) {
                ((C7081d) c5767a).m30650b(C5771a.mapbox_defaultMutliFingerSpanThreshold);
            }
            if (c5767a instanceof StandardScaleGestureDetector) {
                ((StandardScaleGestureDetector) c5767a).mo7375c(C5771a.mapbox_defaultScaleSpanSinceStartThreshold);
            }
            if (c5767a instanceof ShoveGestureDetector) {
                ShoveGestureDetector shoveGestureDetector = (ShoveGestureDetector) c5767a;
                shoveGestureDetector.mo7375c(C5771a.mapbox_defaultShovePixelThreshold);
                shoveGestureDetector.m34487c(20.0f);
            }
            if (c5767a instanceof SidewaysShoveGestureDetector) {
                SidewaysShoveGestureDetector sidewaysShoveGestureDetector = (SidewaysShoveGestureDetector) c5767a;
                sidewaysShoveGestureDetector.mo7375c(C5771a.mapbox_defaultShovePixelThreshold);
                sidewaysShoveGestureDetector.m34498c(20.0f);
            }
            if (z) {
                MultiFingerTapGestureDetector multiFingerTapGestureDetector = (MultiFingerTapGestureDetector) c5767a;
                multiFingerTapGestureDetector.mo7375c(C5771a.mapbox_defaultMultiTapMovementThreshold);
                multiFingerTapGestureDetector.m33607a(150);
            }
            if (c5767a instanceof RotateGestureDetector) {
                ((RotateGestureDetector) c5767a).m34479b(15.3f);
            }
        }
    }

    /* renamed from: a */
    public boolean m25356a(MotionEvent motionEvent) {
        boolean z = false;
        for (C5767a a : this.f21512b) {
            if (a.m25366a(motionEvent)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m25352a(StandardOnGestureListener standardOnGestureListener) {
        this.f21513c.m25363a((Object) standardOnGestureListener);
    }

    /* renamed from: a */
    public void m25353a(StandardOnScaleGestureListener standardOnScaleGestureListener) {
        this.f21514d.m25363a((Object) standardOnScaleGestureListener);
    }

    /* renamed from: a */
    public void m25350a(OnRotateGestureListener onRotateGestureListener) {
        this.f21515e.m25363a((Object) onRotateGestureListener);
    }

    /* renamed from: a */
    public void m25351a(OnShoveGestureListener onShoveGestureListener) {
        this.f21516f.m25363a((Object) onShoveGestureListener);
    }

    /* renamed from: a */
    public void m25349a(OnMultiFingerTapGestureListener onMultiFingerTapGestureListener) {
        this.f21517g.m25363a((Object) onMultiFingerTapGestureListener);
    }

    /* renamed from: a */
    public void m25348a(OnMoveGestureListener onMoveGestureListener) {
        this.f21518h.m25363a((Object) onMoveGestureListener);
    }

    /* renamed from: a */
    public List<C5767a> m25347a() {
        return this.f21512b;
    }

    /* renamed from: b */
    public StandardScaleGestureDetector m25357b() {
        return this.f21514d;
    }

    /* renamed from: c */
    public RotateGestureDetector m25358c() {
        return this.f21515e;
    }

    /* renamed from: d */
    public MoveGestureDetector m25359d() {
        return this.f21518h;
    }

    @SafeVarargs
    /* renamed from: a */
    public final void m25355a(Set<Integer>... setArr) {
        m25354a(Arrays.asList(setArr));
    }

    /* renamed from: a */
    public void m25354a(List<Set<Integer>> list) {
        this.f21511a.clear();
        this.f21511a.addAll(list);
    }

    /* renamed from: e */
    public List<Set<Integer>> m25360e() {
        return this.f21511a;
    }
}
