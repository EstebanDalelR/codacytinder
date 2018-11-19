package com.tinder.base;

import android.support.annotation.Nullable;
import android.support.v4.app.C0405n;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import com.tinder.utils.ad;
import java.lang.ref.WeakReference;

/* renamed from: com.tinder.base.h */
public class C8310h {
    /* renamed from: a */
    protected boolean f29589a = true;
    /* renamed from: b */
    protected WeakReference<AppCompatActivity> f29590b;
    /* renamed from: c */
    protected int f29591c = -1;
    @Nullable
    /* renamed from: d */
    protected C0405n f29592d;

    public C8310h(AppCompatActivity appCompatActivity) {
        this.f29590b = new WeakReference(appCompatActivity);
    }

    /* renamed from: a */
    public void m35407a(int i) {
        this.f29591c = i;
    }

    @Nullable
    /* renamed from: a */
    protected AppCompatActivity m35406a() {
        if (this.f29590b != null) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) this.f29590b.get();
            if (!(appCompatActivity == null || appCompatActivity.isFinishing())) {
                return appCompatActivity;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    protected C0405n m35411b() {
        if (this.f29592d != null) {
            return this.f29592d;
        }
        AppCompatActivity a = m35406a();
        if (a == null) {
            return null;
        }
        C0405n a2 = a.getSupportFragmentManager().a();
        if (this.f29589a) {
            return a2;
        }
        this.f29592d = a2;
        return a2;
    }

    /* renamed from: a */
    public void m35408a(@Nullable Fragment fragment) {
        if (fragment == null) {
            ad.c("Attempted to add a NULL fragment!");
        } else if (this.f29591c == -1) {
            ad.c("Attempted to add a fragment, but the default container has not been set. Set it using FragmentHelper.setDefaultContainer(int)");
        } else {
            C0405n b = m35411b();
            if (b != null) {
                b.a(this.f29591c, fragment);
                if (this.f29589a != null) {
                    b.e();
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Attempted to add fragment but failed to start a transaction (");
                stringBuilder.append(fragment.getClass().toString());
                stringBuilder.append(')');
                ad.b(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    public void m35409a(@Nullable Fragment fragment, String str) {
        if (fragment == null) {
            ad.c("Attempted to add a NULL fragment!");
        } else if (this.f29591c == -1) {
            ad.c("Attempted to add a fragment, but the default container has not been set. Set it using FragmentHelper.setDefaultContainer(int)");
        } else {
            C0405n b = m35411b();
            if (b != null) {
                b.a(this.f29591c, fragment, str);
                if (this.f29589a != null) {
                    b.e();
                }
            } else {
                str = new StringBuilder();
                str.append("Attempted to add fragment but failed to start a transaction (");
                str.append(fragment.getClass().toString());
                str.append(')');
                ad.b(str.toString());
            }
        }
    }

    /* renamed from: b */
    public void m35412b(@Nullable Fragment fragment) {
        if (fragment == null) {
            ad.c("Attempted to add a NULL fragment!");
        } else if (this.f29591c == -1) {
            ad.c("Attempted to add a fragment, but the default container has not been set. Set it using FragmentHelper.setDefaultContainer(int)");
        } else {
            C0405n b = m35411b();
            if (b != null) {
                b.a(this.f29591c, fragment).a(null);
                if (this.f29589a != null) {
                    b.c();
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Attempted to add fragment but failed to start a transaction (");
                stringBuilder.append(fragment.getClass().toString());
                stringBuilder.append(')');
                ad.b(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    public void m35410a(@Nullable Fragment fragment, String str, int i, int i2, int i3, int i4) {
        if (fragment == null) {
            ad.c("Attempted to add a NULL fragment!");
        } else if (this.f29591c == -1) {
            ad.c("Attempted to add a fragment, but the default container has not been set. Set it using FragmentHelper.setDefaultContainer(int)");
        } else {
            C0405n b = m35411b();
            if (b != null) {
                if (!(i == -1 || i2 == -1 || i3 == -1 || i4 == -1)) {
                    ad.a("doin fragment animations");
                    b.a(i, i2, i3, i4);
                }
                b.a(this.f29591c, fragment, str).a(str);
                if (this.f29589a != null) {
                    b.c();
                }
            } else {
                str = new StringBuilder();
                str.append("Attempted to add fragment but failed to start a transaction (");
                str.append(fragment.getClass().toString());
                str.append(')');
                ad.b(str.toString());
            }
        }
    }

    /* renamed from: c */
    public void m35413c(@Nullable Fragment fragment) {
        if (fragment == null) {
            ad.c("Attempted to replace with a NULL fragment!");
        } else if (this.f29591c == -1) {
            ad.c("Attempted to replace a fragment, but the default container has not been set. Set it using FragmentHelper.setDefaultContainer(int)");
        } else {
            if (!(this.f29590b == null || this.f29590b.get() == null)) {
                ((AppCompatActivity) this.f29590b.get()).getSupportFragmentManager().a(null, 1);
            }
            C0405n b = m35411b();
            if (b != null) {
                b.b(this.f29591c, fragment);
                if (this.f29589a != null) {
                    b.c();
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Attempted to replace fragment but failed to start a transaction (");
                stringBuilder.append(fragment.getClass().toString());
                stringBuilder.append(')');
                ad.b(stringBuilder.toString());
            }
        }
    }
}
