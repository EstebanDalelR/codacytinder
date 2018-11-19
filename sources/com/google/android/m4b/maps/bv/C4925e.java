package com.google.android.m4b.maps.bv;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.ads.AdError;

/* renamed from: com.google.android.m4b.maps.bv.e */
public final class C4925e {
    /* renamed from: f */
    private static final int f18143f = ViewConfiguration.getLongPressTimeout();
    /* renamed from: g */
    private static final int f18144g = ViewConfiguration.getTapTimeout();
    /* renamed from: h */
    private static final int f18145h = ViewConfiguration.getDoubleTapTimeout();
    /* renamed from: a */
    private int f18146a;
    /* renamed from: b */
    private int f18147b;
    /* renamed from: c */
    private int f18148c;
    /* renamed from: d */
    private int f18149d;
    /* renamed from: e */
    private int f18150e;
    /* renamed from: i */
    private final Handler f18151i;
    /* renamed from: j */
    private final OnGestureListener f18152j;
    /* renamed from: k */
    private OnDoubleTapListener f18153k;
    /* renamed from: l */
    private boolean f18154l;
    /* renamed from: m */
    private boolean f18155m;
    /* renamed from: n */
    private boolean f18156n;
    /* renamed from: o */
    private boolean f18157o;
    /* renamed from: p */
    private MotionEvent f18158p;
    /* renamed from: q */
    private MotionEvent f18159q;
    /* renamed from: r */
    private boolean f18160r;
    /* renamed from: s */
    private float f18161s;
    /* renamed from: t */
    private float f18162t;
    /* renamed from: u */
    private float f18163u;
    /* renamed from: v */
    private float f18164v;
    /* renamed from: w */
    private boolean f18165w;
    /* renamed from: x */
    private VelocityTracker f18166x;

    /* renamed from: com.google.android.m4b.maps.bv.e$a */
    class C4924a extends Handler {
        /* renamed from: a */
        private /* synthetic */ C4925e f18142a;

        C4924a(C4925e c4925e) {
            this.f18142a = c4925e;
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f18142a.f18152j.onShowPress(this.f18142a.f18158p);
                    return;
                case 2:
                    C4925e.m22073c(this.f18142a);
                    return;
                case 3:
                    if (this.f18142a.f18153k != null && this.f18142a.f18154l == null) {
                        this.f18142a.f18153k.onSingleTapConfirmed(this.f18142a.f18158p);
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

    public C4925e(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    private C4925e(Context context, OnGestureListener onGestureListener, Handler handler) {
        this.f18151i = new C4924a(this);
        this.f18152j = onGestureListener;
        if ((onGestureListener instanceof OnDoubleTapListener) != null) {
            this.f18153k = (OnDoubleTapListener) onGestureListener;
        }
        if (this.f18152j == null) {
            throw new NullPointerException("OnGestureListener must not be null");
        }
        this.f18165w = true;
        if (context == null) {
            context = ViewConfiguration.getTouchSlop();
            onGestureListener = context * 2;
            this.f18149d = ViewConfiguration.getMinimumFlingVelocity();
            this.f18150e = ViewConfiguration.getMaximumFlingVelocity();
            handler = context;
        } else {
            context = ViewConfiguration.get(context);
            onGestureListener = context.getScaledTouchSlop();
            handler = context.getScaledTouchSlop();
            int scaledDoubleTapSlop = context.getScaledDoubleTapSlop();
            this.f18149d = context.getScaledMinimumFlingVelocity();
            this.f18150e = context.getScaledMaximumFlingVelocity();
            context = onGestureListener;
            onGestureListener = scaledDoubleTapSlop;
        }
        this.f18146a = context * context;
        this.f18147b = handler * handler;
        this.f18148c = onGestureListener * onGestureListener;
    }

    /* renamed from: a */
    public final void m22076a(OnDoubleTapListener onDoubleTapListener) {
        this.f18153k = onDoubleTapListener;
    }

    /* renamed from: a */
    public final void m22077a(boolean z) {
        this.f18165w = true;
    }

    /* renamed from: a */
    public final boolean m22078a(MotionEvent motionEvent) {
        int i;
        boolean onDoubleTapEvent;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction();
        if (this.f18166x == null) {
            r0.f18166x = VelocityTracker.obtain();
        }
        r0.f18166x.addMovement(motionEvent2);
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
                if (r0.f18153k != null) {
                    boolean hasMessages = r0.f18151i.hasMessages(3);
                    if (hasMessages) {
                        r0.f18151i.removeMessages(3);
                    }
                    if (!(r0.f18158p == null || r0.f18159q == null || !hasMessages)) {
                        Object obj2;
                        motionEvent3 = r0.f18158p;
                        MotionEvent motionEvent4 = r0.f18159q;
                        if (r0.f18157o && motionEvent.getEventTime() - motionEvent4.getEventTime() <= ((long) f18145h)) {
                            x = ((int) motionEvent3.getX()) - ((int) motionEvent.getX());
                            action = ((int) motionEvent3.getY()) - ((int) motionEvent.getY());
                            if ((x * x) + (action * action) < r0.f18148c) {
                                obj2 = 1;
                                if (obj2 != null) {
                                    r0.f18160r = true;
                                    action = (r0.f18153k.onDoubleTap(r0.f18158p) | 0) | r0.f18153k.onDoubleTapEvent(motionEvent2);
                                    r0.f18161s = f;
                                    r0.f18163u = f;
                                    r0.f18162t = f2;
                                    r0.f18164v = f2;
                                    if (r0.f18158p != null) {
                                        r0.f18158p.recycle();
                                    }
                                    r0.f18158p = MotionEvent.obtain(motionEvent);
                                    r0.f18156n = true;
                                    r0.f18157o = true;
                                    r0.f18154l = true;
                                    r0.f18155m = false;
                                    if (r0.f18165w) {
                                        r0.f18151i.removeMessages(2);
                                        r0.f18151i.sendEmptyMessageAtTime(2, (r0.f18158p.getDownTime() + ((long) f18144g)) + ((long) f18143f));
                                    }
                                    r0.f18151i.sendEmptyMessageAtTime(1, r0.f18158p.getDownTime() + ((long) f18144g));
                                    return action | r0.f18152j.onDown(motionEvent2);
                                }
                            }
                        }
                        obj2 = null;
                        if (obj2 != null) {
                            r0.f18160r = true;
                            action = (r0.f18153k.onDoubleTap(r0.f18158p) | 0) | r0.f18153k.onDoubleTapEvent(motionEvent2);
                            r0.f18161s = f;
                            r0.f18163u = f;
                            r0.f18162t = f2;
                            r0.f18164v = f2;
                            if (r0.f18158p != null) {
                                r0.f18158p.recycle();
                            }
                            r0.f18158p = MotionEvent.obtain(motionEvent);
                            r0.f18156n = true;
                            r0.f18157o = true;
                            r0.f18154l = true;
                            r0.f18155m = false;
                            if (r0.f18165w) {
                                r0.f18151i.removeMessages(2);
                                r0.f18151i.sendEmptyMessageAtTime(2, (r0.f18158p.getDownTime() + ((long) f18144g)) + ((long) f18143f));
                            }
                            r0.f18151i.sendEmptyMessageAtTime(1, r0.f18158p.getDownTime() + ((long) f18144g));
                            return action | r0.f18152j.onDown(motionEvent2);
                        }
                    }
                    r0.f18151i.sendEmptyMessageDelayed(3, (long) f18145h);
                }
                action = 0;
                r0.f18161s = f;
                r0.f18163u = f;
                r0.f18162t = f2;
                r0.f18164v = f2;
                if (r0.f18158p != null) {
                    r0.f18158p.recycle();
                }
                r0.f18158p = MotionEvent.obtain(motionEvent);
                r0.f18156n = true;
                r0.f18157o = true;
                r0.f18154l = true;
                r0.f18155m = false;
                if (r0.f18165w) {
                    r0.f18151i.removeMessages(2);
                    r0.f18151i.sendEmptyMessageAtTime(2, (r0.f18158p.getDownTime() + ((long) f18144g)) + ((long) f18143f));
                }
                r0.f18151i.sendEmptyMessageAtTime(1, r0.f18158p.getDownTime() + ((long) f18144g));
                return action | r0.f18152j.onDown(motionEvent2);
            case 1:
                r0.f18154l = false;
                motionEvent3 = MotionEvent.obtain(motionEvent);
                if (r0.f18160r) {
                    onDoubleTapEvent = r0.f18153k.onDoubleTapEvent(motionEvent2) | false;
                } else {
                    if (r0.f18155m) {
                        r0.f18151i.removeMessages(3);
                        r0.f18155m = false;
                    } else if (r0.f18156n) {
                        onDoubleTapEvent = r0.f18152j.onSingleTapUp(motionEvent2);
                    } else {
                        VelocityTracker velocityTracker = r0.f18166x;
                        int pointerId = motionEvent2.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) r0.f18150e);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) <= ((float) r0.f18149d)) {
                            if (Math.abs(xVelocity) > ((float) r0.f18149d)) {
                            }
                        }
                        onDoubleTapEvent = r0.f18152j.onFling(r0.f18158p, motionEvent2, xVelocity, yVelocity);
                    }
                    onDoubleTapEvent = false;
                }
                if (r0.f18159q != null) {
                    r0.f18159q.recycle();
                }
                r0.f18159q = motionEvent3;
                if (r0.f18166x != null) {
                    r0.f18166x.recycle();
                    r0.f18166x = null;
                }
                r0.f18160r = false;
                r0.f18151i.removeMessages(1);
                r0.f18151i.removeMessages(2);
                break;
            case 2:
                if (r0.f18155m) {
                    return false;
                }
                float f4 = r0.f18161s - f;
                f3 = r0.f18162t - f2;
                if (r0.f18160r) {
                    return false | r0.f18153k.onDoubleTapEvent(motionEvent2);
                }
                if (r0.f18156n) {
                    actionIndex = (int) (f - r0.f18163u);
                    pointerCount = (int) (f2 - r0.f18164v);
                    actionIndex = (actionIndex * actionIndex) + (pointerCount * pointerCount);
                    if (actionIndex > r0.f18146a) {
                        onDoubleTapEvent = r0.f18152j.onScroll(r0.f18158p, motionEvent2, f4, f3);
                        r0.f18161s = f;
                        r0.f18162t = f2;
                        r0.f18156n = false;
                        r0.f18151i.removeMessages(3);
                        r0.f18151i.removeMessages(1);
                        r0.f18151i.removeMessages(2);
                    } else {
                        onDoubleTapEvent = false;
                    }
                    if (actionIndex > r0.f18147b) {
                        r0.f18157o = false;
                        break;
                    }
                } else if (Math.abs(f4) < 1.0f && Math.abs(f3) < 1.0f) {
                    return false;
                } else {
                    boolean onScroll = r0.f18152j.onScroll(r0.f18158p, motionEvent2, f4, f3);
                    r0.f18161s = f;
                    r0.f18162t = f2;
                    return onScroll;
                }
                break;
            case 3:
                r0.f18151i.removeMessages(1);
                r0.f18151i.removeMessages(2);
                r0.f18151i.removeMessages(3);
                r0.f18166x.recycle();
                r0.f18166x = null;
                r0.f18160r = false;
                r0.f18154l = false;
                r0.f18156n = false;
                r0.f18157o = false;
                if (!r0.f18155m) {
                    return false;
                }
                r0.f18155m = false;
                return false;
            case 5:
                r0.f18161s = f;
                r0.f18163u = f;
                r0.f18162t = f2;
                r0.f18164v = f2;
                r0.f18151i.removeMessages(1);
                r0.f18151i.removeMessages(2);
                r0.f18151i.removeMessages(3);
                r0.f18160r = false;
                r0.f18156n = false;
                r0.f18157o = false;
                if (!r0.f18155m) {
                    return false;
                }
                r0.f18155m = false;
                return false;
            case 6:
                r0.f18161s = f;
                r0.f18163u = f;
                r0.f18162t = f2;
                r0.f18164v = f2;
                r0.f18166x.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) r0.f18150e);
                action = motionEvent.getActionIndex();
                x = motionEvent2.getPointerId(action);
                float xVelocity2 = r0.f18166x.getXVelocity(x);
                f3 = r0.f18166x.getYVelocity(x);
                for (actionIndex = 0; actionIndex < pointerCount; actionIndex++) {
                    if (actionIndex != action) {
                        i = motionEvent2.getPointerId(actionIndex);
                        if ((r0.f18166x.getXVelocity(i) * xVelocity2) + (r0.f18166x.getYVelocity(i) * f3) < 0.0f) {
                            r0.f18166x.clear();
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
    static /* synthetic */ void m22073c(C4925e c4925e) {
        c4925e.f18151i.removeMessages(3);
        c4925e.f18155m = true;
        c4925e.f18152j.onLongPress(c4925e.f18158p);
    }
}
