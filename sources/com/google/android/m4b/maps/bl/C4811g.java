package com.google.android.m4b.maps.bl;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.ads.AdError;

/* renamed from: com.google.android.m4b.maps.bl.g */
public final class C4811g {
    /* renamed from: f */
    private static final int f17541f = ViewConfiguration.getLongPressTimeout();
    /* renamed from: g */
    private static final int f17542g = ViewConfiguration.getTapTimeout();
    /* renamed from: h */
    private static final int f17543h = ViewConfiguration.getDoubleTapTimeout();
    /* renamed from: a */
    private int f17544a;
    /* renamed from: b */
    private int f17545b;
    /* renamed from: c */
    private int f17546c;
    /* renamed from: d */
    private int f17547d;
    /* renamed from: e */
    private int f17548e;
    /* renamed from: i */
    private final Handler f17549i;
    /* renamed from: j */
    private final OnGestureListener f17550j;
    /* renamed from: k */
    private OnDoubleTapListener f17551k;
    /* renamed from: l */
    private boolean f17552l;
    /* renamed from: m */
    private boolean f17553m;
    /* renamed from: n */
    private boolean f17554n;
    /* renamed from: o */
    private boolean f17555o;
    /* renamed from: p */
    private MotionEvent f17556p;
    /* renamed from: q */
    private MotionEvent f17557q;
    /* renamed from: r */
    private boolean f17558r;
    /* renamed from: s */
    private float f17559s;
    /* renamed from: t */
    private float f17560t;
    /* renamed from: u */
    private float f17561u;
    /* renamed from: v */
    private float f17562v;
    /* renamed from: w */
    private boolean f17563w;
    /* renamed from: x */
    private VelocityTracker f17564x;

    /* renamed from: com.google.android.m4b.maps.bl.g$a */
    class C4810a extends Handler {
        /* renamed from: a */
        private /* synthetic */ C4811g f17540a;

        C4810a(C4811g c4811g, Handler handler) {
            this.f17540a = c4811g;
            super(handler.getLooper());
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f17540a.f17550j.onShowPress(this.f17540a.f17556p);
                    return;
                case 2:
                    C4811g.m21329c(this.f17540a);
                    return;
                case 3:
                    if (this.f17540a.f17551k != null && this.f17540a.f17552l == null) {
                        this.f17540a.f17551k.onSingleTapConfirmed(this.f17540a.f17556p);
                        return;
                    }
                    return;
                default:
                    message = String.valueOf(message);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(message).length() + 16);
                    stringBuilder.append("Unknown message ");
                    stringBuilder.append(message);
                    throw new RuntimeException(stringBuilder.toString());
            }
        }
    }

    public C4811g(Context context, OnGestureListener onGestureListener, Handler handler) {
        this.f17549i = new C4810a(this, handler);
        this.f17550j = onGestureListener;
        if ((onGestureListener instanceof OnDoubleTapListener) != null) {
            this.f17551k = (OnDoubleTapListener) onGestureListener;
        }
        if (this.f17550j == null) {
            throw new NullPointerException("OnGestureListener must not be null");
        }
        this.f17563w = true;
        if (context == null) {
            context = ViewConfiguration.getTouchSlop();
            onGestureListener = context * 2;
            this.f17547d = ViewConfiguration.getMinimumFlingVelocity();
            this.f17548e = ViewConfiguration.getMaximumFlingVelocity();
            handler = context;
        } else {
            context = ViewConfiguration.get(context);
            onGestureListener = context.getScaledTouchSlop();
            handler = context.getScaledTouchSlop();
            int scaledDoubleTapSlop = context.getScaledDoubleTapSlop();
            this.f17547d = context.getScaledMinimumFlingVelocity();
            this.f17548e = context.getScaledMaximumFlingVelocity();
            context = onGestureListener;
            onGestureListener = scaledDoubleTapSlop;
        }
        this.f17544a = context * context;
        this.f17545b = handler * handler;
        this.f17546c = onGestureListener * onGestureListener;
    }

    /* renamed from: a */
    public final void m21332a(OnDoubleTapListener onDoubleTapListener) {
        this.f17551k = onDoubleTapListener;
    }

    /* renamed from: a */
    public final void m21333a(boolean z) {
        this.f17563w = true;
    }

    /* renamed from: a */
    public final boolean m21334a(MotionEvent motionEvent) {
        int i;
        boolean onDoubleTapEvent;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction();
        if (this.f17564x == null) {
            r0.f17564x = VelocityTracker.obtain();
        }
        r0.f17564x.addMovement(motionEvent2);
        action &= 255;
        Object obj = action == 6 ? 1 : null;
        int actionIndex = obj != null ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (i = 0; i < pointerCount; i++) {
            if (actionIndex != i) {
                f += motionEvent2.getX(i);
                f2 += motionEvent2.getY(i);
            }
        }
        float f3 = (float) (obj != null ? pointerCount - 1 : pointerCount);
        f /= f3;
        f2 /= f3;
        MotionEvent motionEvent3;
        int x;
        switch (action) {
            case 0:
                if (r0.f17551k != null) {
                    boolean hasMessages = r0.f17549i.hasMessages(3);
                    if (hasMessages) {
                        r0.f17549i.removeMessages(3);
                    }
                    if (!(r0.f17556p == null || r0.f17557q == null || !hasMessages)) {
                        Object obj2;
                        motionEvent3 = r0.f17556p;
                        MotionEvent motionEvent4 = r0.f17557q;
                        if (r0.f17555o && motionEvent.getEventTime() - motionEvent4.getEventTime() <= ((long) f17543h)) {
                            x = ((int) motionEvent3.getX()) - ((int) motionEvent.getX());
                            action = ((int) motionEvent3.getY()) - ((int) motionEvent.getY());
                            if ((x * x) + (action * action) < r0.f17546c) {
                                obj2 = 1;
                                if (obj2 != null) {
                                    r0.f17558r = true;
                                    action = (r0.f17551k.onDoubleTap(r0.f17556p) | 0) | r0.f17551k.onDoubleTapEvent(motionEvent2);
                                    r0.f17559s = f;
                                    r0.f17561u = f;
                                    r0.f17560t = f2;
                                    r0.f17562v = f2;
                                    if (r0.f17556p != null) {
                                        r0.f17556p.recycle();
                                    }
                                    r0.f17556p = MotionEvent.obtain(motionEvent);
                                    r0.f17554n = true;
                                    r0.f17555o = true;
                                    r0.f17552l = true;
                                    r0.f17553m = false;
                                    if (r0.f17563w) {
                                        r0.f17549i.removeMessages(2);
                                        r0.f17549i.sendEmptyMessageAtTime(2, (r0.f17556p.getDownTime() + ((long) f17542g)) + ((long) f17541f));
                                    }
                                    r0.f17549i.sendEmptyMessageAtTime(1, r0.f17556p.getDownTime() + ((long) f17542g));
                                    return action | r0.f17550j.onDown(motionEvent2);
                                }
                            }
                        }
                        obj2 = null;
                        if (obj2 != null) {
                            r0.f17558r = true;
                            action = (r0.f17551k.onDoubleTap(r0.f17556p) | 0) | r0.f17551k.onDoubleTapEvent(motionEvent2);
                            r0.f17559s = f;
                            r0.f17561u = f;
                            r0.f17560t = f2;
                            r0.f17562v = f2;
                            if (r0.f17556p != null) {
                                r0.f17556p.recycle();
                            }
                            r0.f17556p = MotionEvent.obtain(motionEvent);
                            r0.f17554n = true;
                            r0.f17555o = true;
                            r0.f17552l = true;
                            r0.f17553m = false;
                            if (r0.f17563w) {
                                r0.f17549i.removeMessages(2);
                                r0.f17549i.sendEmptyMessageAtTime(2, (r0.f17556p.getDownTime() + ((long) f17542g)) + ((long) f17541f));
                            }
                            r0.f17549i.sendEmptyMessageAtTime(1, r0.f17556p.getDownTime() + ((long) f17542g));
                            return action | r0.f17550j.onDown(motionEvent2);
                        }
                    }
                    r0.f17549i.sendEmptyMessageDelayed(3, (long) f17543h);
                }
                action = 0;
                r0.f17559s = f;
                r0.f17561u = f;
                r0.f17560t = f2;
                r0.f17562v = f2;
                if (r0.f17556p != null) {
                    r0.f17556p.recycle();
                }
                r0.f17556p = MotionEvent.obtain(motionEvent);
                r0.f17554n = true;
                r0.f17555o = true;
                r0.f17552l = true;
                r0.f17553m = false;
                if (r0.f17563w) {
                    r0.f17549i.removeMessages(2);
                    r0.f17549i.sendEmptyMessageAtTime(2, (r0.f17556p.getDownTime() + ((long) f17542g)) + ((long) f17541f));
                }
                r0.f17549i.sendEmptyMessageAtTime(1, r0.f17556p.getDownTime() + ((long) f17542g));
                return action | r0.f17550j.onDown(motionEvent2);
            case 1:
                r0.f17552l = false;
                motionEvent3 = MotionEvent.obtain(motionEvent);
                if (r0.f17558r) {
                    onDoubleTapEvent = r0.f17551k.onDoubleTapEvent(motionEvent2) | false;
                } else if (r0.f17553m) {
                    r0.f17549i.removeMessages(3);
                    r0.f17553m = false;
                    onDoubleTapEvent = r0.f17550j.onSingleTapUp(motionEvent2);
                } else if (r0.f17554n) {
                    onDoubleTapEvent = r0.f17550j.onSingleTapUp(motionEvent2);
                } else {
                    VelocityTracker velocityTracker = r0.f17564x;
                    int pointerId = motionEvent2.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) r0.f17548e);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) <= ((float) r0.f17547d)) {
                        if (Math.abs(xVelocity) <= ((float) r0.f17547d)) {
                            onDoubleTapEvent = false;
                        }
                    }
                    onDoubleTapEvent = r0.f17550j.onFling(r0.f17556p, motionEvent2, xVelocity, yVelocity);
                }
                if (r0.f17557q != null) {
                    r0.f17557q.recycle();
                }
                r0.f17557q = motionEvent3;
                if (r0.f17564x != null) {
                    r0.f17564x.recycle();
                    r0.f17564x = null;
                }
                r0.f17558r = false;
                r0.f17549i.removeMessages(1);
                r0.f17549i.removeMessages(2);
                break;
            case 2:
                float f4 = r0.f17559s - f;
                f3 = r0.f17560t - f2;
                if (r0.f17558r) {
                    return false | r0.f17551k.onDoubleTapEvent(motionEvent2);
                }
                if (r0.f17554n) {
                    actionIndex = (int) (f - r0.f17561u);
                    pointerCount = (int) (f2 - r0.f17562v);
                    actionIndex = (actionIndex * actionIndex) + (pointerCount * pointerCount);
                    if (actionIndex > r0.f17544a) {
                        onDoubleTapEvent = r0.f17550j.onScroll(r0.f17556p, motionEvent2, f4, f3);
                        r0.f17559s = f;
                        r0.f17560t = f2;
                        r0.f17554n = false;
                        r0.f17549i.removeMessages(3);
                        r0.f17549i.removeMessages(1);
                        r0.f17549i.removeMessages(2);
                    } else {
                        onDoubleTapEvent = false;
                    }
                    if (actionIndex > r0.f17545b) {
                        r0.f17555o = false;
                        break;
                    }
                } else if (Math.abs(f4) < 1.0f && Math.abs(f3) < 1.0f) {
                    return false;
                } else {
                    boolean onScroll = r0.f17550j.onScroll(r0.f17556p, motionEvent2, f4, f3);
                    r0.f17559s = f;
                    r0.f17560t = f2;
                    return onScroll;
                }
                break;
            case 3:
                r0.f17549i.removeMessages(1);
                r0.f17549i.removeMessages(2);
                r0.f17549i.removeMessages(3);
                r0.f17564x.recycle();
                r0.f17564x = null;
                r0.f17558r = false;
                r0.f17552l = false;
                r0.f17554n = false;
                r0.f17555o = false;
                if (!r0.f17553m) {
                    return false;
                }
                r0.f17553m = false;
                return false;
            case 5:
                r0.f17559s = f;
                r0.f17561u = f;
                r0.f17560t = f2;
                r0.f17562v = f2;
                r0.f17549i.removeMessages(1);
                r0.f17549i.removeMessages(2);
                r0.f17549i.removeMessages(3);
                r0.f17558r = false;
                r0.f17554n = false;
                r0.f17555o = false;
                if (!r0.f17553m) {
                    return false;
                }
                r0.f17553m = false;
                return false;
            case 6:
                r0.f17559s = f;
                r0.f17561u = f;
                r0.f17560t = f2;
                r0.f17562v = f2;
                r0.f17564x.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) r0.f17548e);
                action = motionEvent.getActionIndex();
                x = motionEvent2.getPointerId(action);
                float xVelocity2 = r0.f17564x.getXVelocity(x);
                f3 = r0.f17564x.getYVelocity(x);
                for (actionIndex = 0; actionIndex < pointerCount; actionIndex++) {
                    if (actionIndex != action) {
                        i = motionEvent2.getPointerId(actionIndex);
                        if ((r0.f17564x.getXVelocity(i) * xVelocity2) + (r0.f17564x.getYVelocity(i) * f3) < 0.0f) {
                            r0.f17564x.clear();
                            return false;
                        }
                    }
                }
                return false;
            default:
                return false;
        }
        return onDoubleTapEvent;
    }

    /* renamed from: c */
    static /* synthetic */ void m21329c(C4811g c4811g) {
        c4811g.f17549i.removeMessages(3);
        c4811g.f17553m = true;
        c4811g.f17550j.onLongPress(c4811g.f17556p);
    }
}
