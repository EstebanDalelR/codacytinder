package com.bumptech.glide.request.target;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import com.bumptech.glide.request.Request;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.request.target.i */
public abstract class C4331i<T extends View, Z> extends C4117a<Z> {
    /* renamed from: b */
    private static boolean f14202b = false;
    /* renamed from: c */
    private static Integer f14203c;
    /* renamed from: a */
    protected final T f14204a;
    /* renamed from: d */
    private final C1073a f14205d;

    /* renamed from: com.bumptech.glide.request.target.i$a */
    private static class C1073a {
        /* renamed from: a */
        private final View f2919a;
        /* renamed from: b */
        private final List<SizeReadyCallback> f2920b = new ArrayList();
        /* renamed from: c */
        private C1072a f2921c;
        /* renamed from: d */
        private Point f2922d;

        /* renamed from: com.bumptech.glide.request.target.i$a$a */
        private static class C1072a implements OnPreDrawListener {
            /* renamed from: a */
            private final WeakReference<C1073a> f2918a;

            public C1072a(C1073a c1073a) {
                this.f2918a = new WeakReference(c1073a);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("OnGlobalLayoutListener called listener=");
                    stringBuilder.append(this);
                    Log.v("ViewTarget", stringBuilder.toString());
                }
                C1073a c1073a = (C1073a) this.f2918a.get();
                if (c1073a != null) {
                    c1073a.m3682a();
                }
                return true;
            }
        }

        /* renamed from: a */
        private boolean m3685a(int i) {
            if (i <= 0) {
                if (i != -2) {
                    return false;
                }
            }
            return true;
        }

        public C1073a(View view) {
            this.f2919a = view;
        }

        /* renamed from: a */
        private void m3683a(int i, int i2) {
            for (SizeReadyCallback onSizeReady : this.f2920b) {
                onSizeReady.onSizeReady(i, i2);
            }
            this.f2920b.clear();
        }

        /* renamed from: a */
        private void m3682a() {
            if (!this.f2920b.isEmpty()) {
                int c = m3687c();
                int b = m3686b();
                if (m3685a(c)) {
                    if (m3685a(b)) {
                        m3683a(c, b);
                        ViewTreeObserver viewTreeObserver = this.f2919a.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(this.f2921c);
                        }
                        this.f2921c = null;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m3689a(SizeReadyCallback sizeReadyCallback) {
            int c = m3687c();
            int b = m3686b();
            if (m3685a(c) && m3685a(b)) {
                sizeReadyCallback.onSizeReady(c, b);
                return;
            }
            if (!this.f2920b.contains(sizeReadyCallback)) {
                this.f2920b.add(sizeReadyCallback);
            }
            if (this.f2921c == null) {
                sizeReadyCallback = this.f2919a.getViewTreeObserver();
                this.f2921c = new C1072a(this);
                sizeReadyCallback.addOnPreDrawListener(this.f2921c);
            }
        }

        /* renamed from: b */
        private int m3686b() {
            LayoutParams layoutParams = this.f2919a.getLayoutParams();
            if (m3685a(this.f2919a.getHeight())) {
                return this.f2919a.getHeight();
            }
            return layoutParams != null ? m3681a(layoutParams.height, true) : 0;
        }

        /* renamed from: c */
        private int m3687c() {
            LayoutParams layoutParams = this.f2919a.getLayoutParams();
            if (m3685a(this.f2919a.getWidth())) {
                return this.f2919a.getWidth();
            }
            if (layoutParams != null) {
                return m3681a(layoutParams.width, false);
            }
            return 0;
        }

        /* renamed from: a */
        private int m3681a(int i, boolean z) {
            if (i != -2) {
                return i;
            }
            i = m3688d();
            return z ? i.y : i.x;
        }

        @TargetApi(13)
        /* renamed from: d */
        private Point m3688d() {
            if (this.f2922d != null) {
                return this.f2922d;
            }
            Display defaultDisplay = ((WindowManager) this.f2919a.getContext().getSystemService("window")).getDefaultDisplay();
            if (VERSION.SDK_INT >= 13) {
                this.f2922d = new Point();
                defaultDisplay.getSize(this.f2922d);
            } else {
                this.f2922d = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
            }
            return this.f2922d;
        }
    }

    public C4331i(T t) {
        if (t == null) {
            throw new NullPointerException("View must not be null!");
        }
        this.f14204a = t;
        this.f14205d = new C1073a(t);
    }

    public T getView() {
        return this.f14204a;
    }

    public void getSize(SizeReadyCallback sizeReadyCallback) {
        this.f14205d.m3689a(sizeReadyCallback);
    }

    public void setRequest(Request request) {
        mo3962a(request);
    }

    public Request getRequest() {
        Object a = m17517a();
        if (a == null) {
            return null;
        }
        if (a instanceof Request) {
            return (Request) a;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: a */
    private void mo3962a(Object obj) {
        if (f14203c == null) {
            f14202b = true;
            this.f14204a.setTag(obj);
            return;
        }
        this.f14204a.setTag(f14203c.intValue(), obj);
    }

    /* renamed from: a */
    private Object m17517a() {
        if (f14203c == null) {
            return this.f14204a.getTag();
        }
        return this.f14204a.getTag(f14203c.intValue());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Target for: ");
        stringBuilder.append(this.f14204a);
        return stringBuilder.toString();
    }
}
