package com.facebook.internal;

import android.app.Activity;
import android.util.Log;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.List;

/* renamed from: com.facebook.internal.d */
public abstract class C3412d<CONTENT, RESULT> implements FacebookDialog<CONTENT, RESULT> {
    /* renamed from: a */
    protected static final Object f10389a = new Object();
    /* renamed from: b */
    private final Activity f10390b;
    /* renamed from: c */
    private final C1725l f10391c;
    /* renamed from: d */
    private List<C1703a> f10392d;
    /* renamed from: e */
    private int f10393e;

    /* renamed from: com.facebook.internal.d$a */
    protected abstract class C1703a {
        /* renamed from: a */
        final /* synthetic */ C3412d f4705a;

        /* renamed from: a */
        public abstract C1697a mo1900a(CONTENT content);

        /* renamed from: a */
        public abstract boolean mo1901a(CONTENT content, boolean z);

        protected C1703a(C3412d c3412d) {
            this.f4705a = c3412d;
        }

        /* renamed from: a */
        public Object mo1907a() {
            return C3412d.f10389a;
        }
    }

    /* renamed from: a */
    protected abstract void mo3369a(CallbackManagerImpl callbackManagerImpl, FacebookCallback<RESULT> facebookCallback);

    /* renamed from: c */
    protected abstract List<C1703a> mo3370c();

    /* renamed from: d */
    protected abstract C1697a mo3371d();

    protected C3412d(Activity activity, int i) {
        C1749x.m6064a((Object) activity, "activity");
        this.f10390b = activity;
        this.f10391c = null;
        this.f10393e = i;
    }

    protected C3412d(C1725l c1725l, int i) {
        C1749x.m6064a((Object) c1725l, "fragmentWrapper");
        this.f10391c = c1725l;
        this.f10390b = null;
        this.f10393e = i;
        if (c1725l.m5949c() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }

    public final void registerCallback(CallbackManager callbackManager, FacebookCallback<RESULT> facebookCallback) {
        if (callbackManager instanceof CallbackManagerImpl) {
            mo3369a((CallbackManagerImpl) callbackManager, (FacebookCallback) facebookCallback);
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    public final void registerCallback(CallbackManager callbackManager, FacebookCallback<RESULT> facebookCallback, int i) {
        m13091a(i);
        registerCallback(callbackManager, facebookCallback);
    }

    /* renamed from: a */
    protected void m13091a(int i) {
        if (FacebookSdk.m3985a(i)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request code ");
            stringBuilder.append(i);
            stringBuilder.append(" cannot be within the range reserved by the Facebook SDK.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f10393e = i;
    }

    /* renamed from: a */
    public int m13090a() {
        return this.f10393e;
    }

    public boolean canShow(CONTENT content) {
        return m13093a((Object) content, f10389a);
    }

    /* renamed from: a */
    protected boolean m13093a(CONTENT content, Object obj) {
        Object obj2 = obj == f10389a ? 1 : null;
        for (C1703a c1703a : m13089e()) {
            if (obj2 != null || Utility.m5784a(c1703a.mo1907a(), obj)) {
                if (c1703a.mo1901a(content, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void show(CONTENT content) {
        m13095b(content, f10389a);
    }

    /* renamed from: b */
    protected void m13095b(CONTENT content, Object obj) {
        C1697a c = m13088c(content, obj);
        if (c == null) {
            content = "No code path should ever result in a null appCall";
            Log.e("FacebookDialog", content);
            if (FacebookSdk.m3984a() != null) {
                throw new IllegalStateException(content);
            }
        } else if (this.f10391c != null) {
            DialogPresenter.m5716a(c, this.f10391c);
        } else {
            DialogPresenter.m5712a(c, this.f10390b);
        }
    }

    /* renamed from: b */
    protected Activity m13094b() {
        if (this.f10390b != null) {
            return this.f10390b;
        }
        return this.f10391c != null ? this.f10391c.m5949c() : null;
    }

    /* renamed from: c */
    private C1697a m13088c(CONTENT content, Object obj) {
        Object obj2 = obj == f10389a ? 1 : null;
        C1697a c1697a = null;
        for (C1703a c1703a : m13089e()) {
            if (obj2 != null || Utility.m5784a(c1703a.mo1907a(), obj)) {
                if (c1703a.mo1901a(content, true)) {
                    try {
                        c1697a = c1703a.mo1900a(content);
                        break;
                    } catch (FacebookException e) {
                        c1697a = mo3371d();
                        DialogPresenter.m5714a(c1697a, e);
                    }
                }
            }
        }
        if (c1697a != null) {
            return c1697a;
        }
        c1697a = mo3371d();
        DialogPresenter.m5711a(c1697a);
        return c1697a;
    }

    /* renamed from: e */
    private List<C1703a> m13089e() {
        if (this.f10392d == null) {
            this.f10392d = mo3370c();
        }
        return this.f10392d;
    }
}
