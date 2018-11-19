package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.annotation.RequiresApi;
import android.support.p007a.C0123a.C0121a;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.l */
public final class C0604l {
    /* renamed from: a */
    static final C0603c f1805a;

    /* renamed from: android.support.v4.view.l$c */
    static class C0603c {
        /* renamed from: a */
        public int mo596a(ViewGroup viewGroup) {
            return 0;
        }

        C0603c() {
        }

        /* renamed from: b */
        public boolean mo3058b(ViewGroup viewGroup) {
            Boolean bool = (Boolean) viewGroup.getTag(C0121a.tag_transition_group);
            if ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null) {
                if (ViewCompat.m2224p(viewGroup) == null) {
                    return null;
                }
            }
            return true;
        }
    }

    @RequiresApi(18)
    /* renamed from: android.support.v4.view.l$a */
    static class C2896a extends C0603c {
        C2896a() {
        }

        /* renamed from: a */
        public int mo596a(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.view.l$b */
    static class C4031b extends C2896a {
        C4031b() {
        }

        /* renamed from: b */
        public boolean mo3058b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1805a = new C4031b();
        } else if (VERSION.SDK_INT >= 18) {
            f1805a = new C2896a();
        } else {
            f1805a = new C0603c();
        }
    }

    /* renamed from: a */
    public static int m2358a(ViewGroup viewGroup) {
        return f1805a.mo596a(viewGroup);
    }

    /* renamed from: b */
    public static boolean m2359b(ViewGroup viewGroup) {
        return f1805a.mo3058b(viewGroup);
    }
}
