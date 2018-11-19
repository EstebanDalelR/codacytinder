package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.DimenRes;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import java.util.HashMap;

@UiThread
public class MultiFingerTapGestureDetector extends C7081d<OnMultiFingerTapGestureListener> {
    /* renamed from: c */
    private long f28324c;
    /* renamed from: d */
    private float f28325d;
    /* renamed from: g */
    private boolean f28326g;
    /* renamed from: h */
    private boolean f28327h;
    /* renamed from: i */
    private int f28328i;

    public interface OnMultiFingerTapGestureListener {
        boolean onMultiFingerTap(MultiFingerTapGestureDetector multiFingerTapGestureDetector, int i);
    }

    public MultiFingerTapGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }

    /* renamed from: b */
    protected boolean mo6238b(MotionEvent motionEvent) {
        super.mo6238b(motionEvent);
        boolean z = false;
        switch (motionEvent.getActionMasked()) {
            case 1:
                if (mo6242a(4) != null) {
                    z = ((OnMultiFingerTapGestureListener) this.b).onMultiFingerTap(this, this.f28328i);
                }
                mo7376g();
                return z;
            case 2:
                if (this.f28326g == null) {
                    this.f28326g = m33609a(this.f);
                    break;
                }
                break;
            case 5:
                if (this.f28327h != null) {
                    this.f28326g = true;
                }
                this.f28328i = this.e.size();
                break;
            case 6:
                this.f28327h = true;
                break;
            default:
                break;
        }
        return false;
    }

    /* renamed from: a */
    boolean m33609a(HashMap<C5770e, C5769c> hashMap) {
        hashMap = hashMap.values().iterator();
        do {
            boolean z = false;
            if (!hashMap.hasNext()) {
                return false;
            }
            C5769c c5769c = (C5769c) hashMap.next();
            float abs = Math.abs(c5769c.m25375c() - c5769c.m25373a());
            float abs2 = Math.abs(c5769c.m25376d() - c5769c.m25374b());
            if (abs > this.f28325d || abs2 > this.f28325d) {
                z = true;
            }
            this.f28326g = z;
        } while (!this.f28326g);
        return true;
    }

    /* renamed from: a */
    protected boolean mo6242a(int i) {
        if (this.f28328i <= 1 || this.f28326g || m25362a() >= this.f28324c || super.mo6242a(i) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    protected void mo7376g() {
        super.mo7376g();
        this.f28328i = 0;
        this.f28326g = false;
        this.f28327h = false;
    }

    /* renamed from: a */
    public void m33607a(long j) {
        this.f28324c = j;
    }

    /* renamed from: b */
    public void m33610b(float f) {
        this.f28325d = f;
    }

    /* renamed from: c */
    public void mo7375c(@DimenRes int i) {
        m33610b(this.a.getResources().getDimension(i));
    }
}
