package android.support.transition;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.C2880a;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.transition.v */
public class C0355v {
    /* renamed from: a */
    private static Transition f1193a = new C4007e();
    /* renamed from: b */
    private static ThreadLocal<WeakReference<C2880a<ViewGroup, ArrayList<Transition>>>> f1194b = new ThreadLocal();
    /* renamed from: c */
    private static ArrayList<ViewGroup> f1195c = new ArrayList();

    /* renamed from: android.support.transition.v$a */
    private static class C0354a implements OnAttachStateChangeListener, OnPreDrawListener {
        /* renamed from: a */
        Transition f1191a;
        /* renamed from: b */
        ViewGroup f1192b;

        public void onViewAttachedToWindow(View view) {
        }

        C0354a(Transition transition, ViewGroup viewGroup) {
            this.f1191a = transition;
            this.f1192b = viewGroup;
        }

        /* renamed from: a */
        private void m1296a() {
            this.f1192b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f1192b.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
            m1296a();
            C0355v.f1195c.remove(this.f1192b);
            ArrayList arrayList = (ArrayList) C0355v.m1297a().get(this.f1192b);
            if (arrayList != null && arrayList.size() > 0) {
                view = arrayList.iterator();
                while (view.hasNext()) {
                    ((Transition) view.next()).mo371e(this.f1192b);
                }
            }
            this.f1191a.m1201a(true);
        }

        public boolean onPreDraw() {
            m1296a();
            if (!C0355v.f1195c.remove(this.f1192b)) {
                return true;
            }
            final C2880a a = C0355v.m1297a();
            ArrayList arrayList = (ArrayList) a.get(this.f1192b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f1192b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f1191a);
            this.f1191a.mo359a(new C2810u(this) {
                /* renamed from: b */
                final /* synthetic */ C0354a f12761b;

                public void onTransitionEnd(@NonNull Transition transition) {
                    ((ArrayList) a.get(this.f12761b.f1192b)).remove(transition);
                }
            });
            this.f1191a.m1200a(this.f1192b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo371e(this.f1192b);
                }
            }
            this.f1191a.m1198a(this.f1192b);
            return true;
        }
    }

    /* renamed from: a */
    static C2880a<ViewGroup, ArrayList<Transition>> m1297a() {
        WeakReference weakReference = (WeakReference) f1194b.get();
        if (weakReference == null || weakReference.get() == null) {
            WeakReference weakReference2 = new WeakReference(new C2880a());
            f1194b.set(weakReference2);
            weakReference = weakReference2;
        }
        return (C2880a) weakReference.get();
    }

    /* renamed from: b */
    private static void m1300b(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            Object c0354a = new C0354a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(c0354a);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(c0354a);
        }
    }

    /* renamed from: c */
    private static void m1301c(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) C0355v.m1297a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo369d(viewGroup);
            }
        }
        if (transition != null) {
            transition.m1200a(viewGroup, true);
        }
        viewGroup = C0353t.m1293a(viewGroup);
        if (viewGroup != null) {
            viewGroup.m1295a();
        }
    }

    /* renamed from: a */
    public static void m1298a(@NonNull ViewGroup viewGroup, @Nullable Transition transition) {
        if (!f1195c.contains(viewGroup) && ViewCompat.m2234z(viewGroup)) {
            f1195c.add(viewGroup);
            if (transition == null) {
                transition = f1193a;
            }
            transition = transition.mo372m();
            C0355v.m1301c(viewGroup, transition);
            C0353t.m1294a(viewGroup, null);
            C0355v.m1300b(viewGroup, transition);
        }
    }
}
