package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.ads.AdError;

/* renamed from: android.support.v4.view.b */
public final class C0592b {
    /* renamed from: a */
    private final C0590a f1792a;

    /* renamed from: android.support.v4.view.b$a */
    interface C0590a {
        /* renamed from: a */
        void mo593a(OnDoubleTapListener onDoubleTapListener);

        /* renamed from: a */
        boolean mo594a(MotionEvent motionEvent);
    }

    /* renamed from: android.support.v4.view.b$b */
    static class C2893b implements C0590a {
        /* renamed from: j */
        private static final int f9111j = ViewConfiguration.getLongPressTimeout();
        /* renamed from: k */
        private static final int f9112k = ViewConfiguration.getTapTimeout();
        /* renamed from: l */
        private static final int f9113l = ViewConfiguration.getDoubleTapTimeout();
        /* renamed from: a */
        final OnGestureListener f9114a;
        /* renamed from: b */
        OnDoubleTapListener f9115b;
        /* renamed from: c */
        boolean f9116c;
        /* renamed from: d */
        boolean f9117d;
        /* renamed from: e */
        MotionEvent f9118e;
        /* renamed from: f */
        private int f9119f;
        /* renamed from: g */
        private int f9120g;
        /* renamed from: h */
        private int f9121h;
        /* renamed from: i */
        private int f9122i;
        /* renamed from: m */
        private final Handler f9123m;
        /* renamed from: n */
        private boolean f9124n;
        /* renamed from: o */
        private boolean f9125o;
        /* renamed from: p */
        private boolean f9126p;
        /* renamed from: q */
        private MotionEvent f9127q;
        /* renamed from: r */
        private boolean f9128r;
        /* renamed from: s */
        private float f9129s;
        /* renamed from: t */
        private float f9130t;
        /* renamed from: u */
        private float f9131u;
        /* renamed from: v */
        private float f9132v;
        /* renamed from: w */
        private boolean f9133w;
        /* renamed from: x */
        private VelocityTracker f9134x;

        /* renamed from: android.support.v4.view.b$b$a */
        private class C0591a extends Handler {
            /* renamed from: a */
            final /* synthetic */ C2893b f1791a;

            C0591a(C2893b c2893b) {
                this.f1791a = c2893b;
            }

            C0591a(C2893b c2893b, Handler handler) {
                this.f1791a = c2893b;
                super(handler.getLooper());
            }

            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        this.f1791a.f9114a.onShowPress(this.f1791a.f9118e);
                        return;
                    case 2:
                        this.f1791a.m11368a();
                        return;
                    case 3:
                        if (this.f1791a.f9115b == null) {
                            return;
                        }
                        if (this.f1791a.f9116c == null) {
                            this.f1791a.f9115b.onSingleTapConfirmed(this.f1791a.f9118e);
                            return;
                        } else {
                            this.f1791a.f9117d = true;
                            return;
                        }
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown message ");
                        stringBuilder.append(message);
                        throw new RuntimeException(stringBuilder.toString());
                }
            }
        }

        C2893b(Context context, OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f9123m = new C0591a(this, handler);
            } else {
                this.f9123m = new C0591a(this);
            }
            this.f9114a = onGestureListener;
            if ((onGestureListener instanceof OnDoubleTapListener) != null) {
                mo593a((OnDoubleTapListener) onGestureListener);
            }
            m11364a(context);
        }

        /* renamed from: a */
        private void m11364a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f9114a == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            } else {
                this.f9133w = true;
                context = ViewConfiguration.get(context);
                int scaledTouchSlop = context.getScaledTouchSlop();
                int scaledDoubleTapSlop = context.getScaledDoubleTapSlop();
                this.f9121h = context.getScaledMinimumFlingVelocity();
                this.f9122i = context.getScaledMaximumFlingVelocity();
                this.f9119f = scaledTouchSlop * scaledTouchSlop;
                this.f9120g = scaledDoubleTapSlop * scaledDoubleTapSlop;
            }
        }

        /* renamed from: a */
        public void mo593a(OnDoubleTapListener onDoubleTapListener) {
            this.f9115b = onDoubleTapListener;
        }

        /* renamed from: a */
        public boolean mo594a(MotionEvent motionEvent) {
            int i;
            int action = motionEvent.getAction();
            if (this.f9134x == null) {
                this.f9134x = VelocityTracker.obtain();
            }
            this.f9134x.addMovement(motionEvent);
            action &= 255;
            Object obj = action == 6 ? 1 : null;
            int actionIndex = obj != null ? motionEvent.getActionIndex() : -1;
            int pointerCount = motionEvent.getPointerCount();
            float f = 0.0f;
            float f2 = 0.0f;
            for (i = 0; i < pointerCount; i++) {
                if (actionIndex != i) {
                    f += motionEvent.getX(i);
                    f2 += motionEvent.getY(i);
                }
            }
            float f3 = (float) (obj != null ? pointerCount - 1 : pointerCount);
            f /= f3;
            f2 /= f3;
            int pointerId;
            switch (action) {
                case 0:
                    if (this.f9115b != null) {
                        boolean hasMessages = this.f9123m.hasMessages(3);
                        if (hasMessages) {
                            this.f9123m.removeMessages(3);
                        }
                        if (this.f9118e == null || this.f9127q == null || !hasMessages || !m11365a(this.f9118e, this.f9127q, motionEvent)) {
                            this.f9123m.sendEmptyMessageDelayed(3, (long) f9113l);
                        } else {
                            this.f9128r = true;
                            action = (this.f9115b.onDoubleTap(this.f9118e) | 0) | this.f9115b.onDoubleTapEvent(motionEvent);
                            this.f9129s = f;
                            this.f9131u = f;
                            this.f9130t = f2;
                            this.f9132v = f2;
                            if (this.f9118e != null) {
                                this.f9118e.recycle();
                            }
                            this.f9118e = MotionEvent.obtain(motionEvent);
                            this.f9125o = true;
                            this.f9126p = true;
                            this.f9116c = true;
                            this.f9124n = false;
                            this.f9117d = false;
                            if (this.f9133w) {
                                this.f9123m.removeMessages(2);
                                this.f9123m.sendEmptyMessageAtTime(2, (this.f9118e.getDownTime() + ((long) f9112k)) + ((long) f9111j));
                            }
                            this.f9123m.sendEmptyMessageAtTime(1, this.f9118e.getDownTime() + ((long) f9112k));
                            return action | this.f9114a.onDown(motionEvent);
                        }
                    }
                    action = 0;
                    this.f9129s = f;
                    this.f9131u = f;
                    this.f9130t = f2;
                    this.f9132v = f2;
                    if (this.f9118e != null) {
                        this.f9118e.recycle();
                    }
                    this.f9118e = MotionEvent.obtain(motionEvent);
                    this.f9125o = true;
                    this.f9126p = true;
                    this.f9116c = true;
                    this.f9124n = false;
                    this.f9117d = false;
                    if (this.f9133w) {
                        this.f9123m.removeMessages(2);
                        this.f9123m.sendEmptyMessageAtTime(2, (this.f9118e.getDownTime() + ((long) f9112k)) + ((long) f9111j));
                    }
                    this.f9123m.sendEmptyMessageAtTime(1, this.f9118e.getDownTime() + ((long) f9112k));
                    return action | this.f9114a.onDown(motionEvent);
                case 1:
                    this.f9116c = false;
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    if (this.f9128r) {
                        motionEvent = this.f9115b.onDoubleTapEvent(motionEvent) | null;
                    } else {
                        if (this.f9124n) {
                            this.f9123m.removeMessages(3);
                            this.f9124n = false;
                        } else if (this.f9125o) {
                            boolean onSingleTapUp = this.f9114a.onSingleTapUp(motionEvent);
                            if (this.f9117d && this.f9115b != null) {
                                this.f9115b.onSingleTapConfirmed(motionEvent);
                            }
                            motionEvent = onSingleTapUp;
                        } else {
                            VelocityTracker velocityTracker = this.f9134x;
                            pointerId = motionEvent.getPointerId(0);
                            velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) this.f9122i);
                            f3 = velocityTracker.getYVelocity(pointerId);
                            float xVelocity = velocityTracker.getXVelocity(pointerId);
                            if (Math.abs(f3) <= ((float) this.f9121h)) {
                                if (Math.abs(xVelocity) > ((float) this.f9121h)) {
                                }
                            }
                            motionEvent = this.f9114a.onFling(this.f9118e, motionEvent, xVelocity, f3);
                        }
                        motionEvent = null;
                    }
                    if (this.f9127q != null) {
                        this.f9127q.recycle();
                    }
                    this.f9127q = obtain;
                    if (this.f9134x != null) {
                        this.f9134x.recycle();
                        this.f9134x = null;
                    }
                    this.f9128r = false;
                    this.f9117d = false;
                    this.f9123m.removeMessages(1);
                    this.f9123m.removeMessages(2);
                    break;
                case 2:
                    if (this.f9124n) {
                        return false;
                    }
                    float f4 = this.f9129s - f;
                    f3 = this.f9130t - f2;
                    if (this.f9128r) {
                        return false | this.f9115b.onDoubleTapEvent(motionEvent);
                    }
                    if (this.f9125o) {
                        pointerCount = (int) (f - this.f9131u);
                        pointerId = (int) (f2 - this.f9132v);
                        pointerCount = (pointerCount * pointerCount) + (pointerId * pointerId);
                        if (pointerCount > this.f9119f) {
                            motionEvent = this.f9114a.onScroll(this.f9118e, motionEvent, f4, f3);
                            this.f9129s = f;
                            this.f9130t = f2;
                            this.f9125o = false;
                            this.f9123m.removeMessages(3);
                            this.f9123m.removeMessages(1);
                            this.f9123m.removeMessages(2);
                        } else {
                            motionEvent = null;
                        }
                        if (pointerCount > this.f9119f) {
                            this.f9126p = false;
                            break;
                        }
                    } else if (Math.abs(f4) < 1.0f && Math.abs(f3) < 1.0f) {
                        return false;
                    } else {
                        boolean onScroll = this.f9114a.onScroll(this.f9118e, motionEvent, f4, f3);
                        this.f9129s = f;
                        this.f9130t = f2;
                        return onScroll;
                    }
                    break;
                case 3:
                    m11366b();
                    return false;
                case 5:
                    this.f9129s = f;
                    this.f9131u = f;
                    this.f9130t = f2;
                    this.f9132v = f2;
                    m11367c();
                    return false;
                case 6:
                    this.f9129s = f;
                    this.f9131u = f;
                    this.f9130t = f2;
                    this.f9132v = f2;
                    this.f9134x.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) this.f9122i);
                    action = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(action);
                    float xVelocity2 = this.f9134x.getXVelocity(pointerId2);
                    f3 = this.f9134x.getYVelocity(pointerId2);
                    for (actionIndex = 0; actionIndex < pointerCount; actionIndex++) {
                        if (actionIndex != action) {
                            i = motionEvent.getPointerId(actionIndex);
                            if ((this.f9134x.getXVelocity(i) * xVelocity2) + (this.f9134x.getYVelocity(i) * f3) < 0.0f) {
                                this.f9134x.clear();
                                return false;
                            }
                        }
                    }
                    return false;
                default:
                    return false;
            }
            return motionEvent;
        }

        /* renamed from: b */
        private void m11366b() {
            this.f9123m.removeMessages(1);
            this.f9123m.removeMessages(2);
            this.f9123m.removeMessages(3);
            this.f9134x.recycle();
            this.f9134x = null;
            this.f9128r = false;
            this.f9116c = false;
            this.f9125o = false;
            this.f9126p = false;
            this.f9117d = false;
            if (this.f9124n) {
                this.f9124n = false;
            }
        }

        /* renamed from: c */
        private void m11367c() {
            this.f9123m.removeMessages(1);
            this.f9123m.removeMessages(2);
            this.f9123m.removeMessages(3);
            this.f9128r = false;
            this.f9125o = false;
            this.f9126p = false;
            this.f9117d = false;
            if (this.f9124n) {
                this.f9124n = false;
            }
        }

        /* renamed from: a */
        private boolean m11365a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            boolean z = false;
            if (!this.f9126p || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f9113l)) {
                return false;
            }
            motionEvent2 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            motionEvent = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((motionEvent2 * motionEvent2) + (motionEvent * motionEvent) < this.f9120g) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        void m11368a() {
            this.f9123m.removeMessages(3);
            this.f9117d = false;
            this.f9124n = true;
            this.f9114a.onLongPress(this.f9118e);
        }
    }

    /* renamed from: android.support.v4.view.b$c */
    static class C2894c implements C0590a {
        /* renamed from: a */
        private final GestureDetector f9135a;

        C2894c(Context context, OnGestureListener onGestureListener, Handler handler) {
            this.f9135a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public boolean mo594a(MotionEvent motionEvent) {
            return this.f9135a.onTouchEvent(motionEvent);
        }

        /* renamed from: a */
        public void mo593a(OnDoubleTapListener onDoubleTapListener) {
            this.f9135a.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public C0592b(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public C0592b(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (VERSION.SDK_INT > 17) {
            this.f1792a = new C2894c(context, onGestureListener, handler);
        } else {
            this.f1792a = new C2893b(context, onGestureListener, handler);
        }
    }

    /* renamed from: a */
    public boolean m2312a(MotionEvent motionEvent) {
        return this.f1792a.mo594a(motionEvent);
    }

    /* renamed from: a */
    public void m2311a(OnDoubleTapListener onDoubleTapListener) {
        this.f1792a.mo593a(onDoubleTapListener);
    }
}
