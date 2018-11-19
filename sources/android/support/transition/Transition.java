package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.util.C0550f;
import android.support.v4.util.C2880a;
import android.support.v4.view.ViewCompat;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.exoplayer2.Format;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Transition implements Cloneable {
    /* renamed from: g */
    private static final int[] f1084g = new int[]{2, 1, 3, 4};
    /* renamed from: h */
    private static final C0346l f1085h = new C28011();
    /* renamed from: z */
    private static ThreadLocal<C2880a<Animator, C0320a>> f1086z = new ThreadLocal();
    /* renamed from: A */
    private ViewGroup f1087A = null;
    /* renamed from: B */
    private ArrayList<Animator> f1088B = new ArrayList();
    /* renamed from: C */
    private int f1089C = 0;
    /* renamed from: D */
    private boolean f1090D = false;
    /* renamed from: E */
    private boolean f1091E = false;
    /* renamed from: F */
    private ArrayList<TransitionListener> f1092F = null;
    /* renamed from: G */
    private ArrayList<Animator> f1093G = new ArrayList();
    /* renamed from: H */
    private C0321b f1094H;
    /* renamed from: I */
    private C2880a<String, String> f1095I;
    /* renamed from: J */
    private C0346l f1096J = f1085h;
    /* renamed from: a */
    long f1097a = -1;
    /* renamed from: b */
    ArrayList<Integer> f1098b = new ArrayList();
    /* renamed from: c */
    ArrayList<View> f1099c = new ArrayList();
    /* renamed from: d */
    C2811x f1100d = null;
    /* renamed from: e */
    boolean f1101e = false;
    /* renamed from: f */
    C0356w f1102f;
    /* renamed from: i */
    private String f1103i = getClass().getName();
    /* renamed from: j */
    private long f1104j = -1;
    /* renamed from: k */
    private TimeInterpolator f1105k = null;
    /* renamed from: l */
    private ArrayList<String> f1106l = null;
    /* renamed from: m */
    private ArrayList<Class> f1107m = null;
    /* renamed from: n */
    private ArrayList<Integer> f1108n = null;
    /* renamed from: o */
    private ArrayList<View> f1109o = null;
    /* renamed from: p */
    private ArrayList<Class> f1110p = null;
    /* renamed from: q */
    private ArrayList<String> f1111q = null;
    /* renamed from: r */
    private ArrayList<Integer> f1112r = null;
    /* renamed from: s */
    private ArrayList<View> f1113s = null;
    /* renamed from: t */
    private ArrayList<Class> f1114t = null;
    /* renamed from: u */
    private aa f1115u = new aa();
    /* renamed from: v */
    private aa f1116v = new aa();
    /* renamed from: w */
    private int[] f1117w = f1084g;
    /* renamed from: x */
    private ArrayList<C0358z> f1118x;
    /* renamed from: y */
    private ArrayList<C0358z> f1119y;

    /* renamed from: android.support.transition.Transition$3 */
    class C03193 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ Transition f1078a;

        C03193(Transition transition) {
            this.f1078a = transition;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1078a.m1223k();
            animator.removeListener(this);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MatchOrder {
    }

    public interface TransitionListener {
        void onTransitionCancel(@NonNull Transition transition);

        void onTransitionEnd(@NonNull Transition transition);

        void onTransitionPause(@NonNull Transition transition);

        void onTransitionResume(@NonNull Transition transition);

        void onTransitionStart(@NonNull Transition transition);
    }

    /* renamed from: android.support.transition.Transition$a */
    private static class C0320a {
        /* renamed from: a */
        View f1079a;
        /* renamed from: b */
        String f1080b;
        /* renamed from: c */
        C0358z f1081c;
        /* renamed from: d */
        av f1082d;
        /* renamed from: e */
        Transition f1083e;

        C0320a(View view, String str, Transition transition, av avVar, C0358z c0358z) {
            this.f1079a = view;
            this.f1080b = str;
            this.f1081c = c0358z;
            this.f1082d = avVar;
            this.f1083e = transition;
        }
    }

    /* renamed from: android.support.transition.Transition$b */
    public static abstract class C0321b {
    }

    /* renamed from: android.support.transition.Transition$1 */
    static class C28011 extends C0346l {
        C28011() {
        }

        /* renamed from: a */
        public Path mo332a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    @Nullable
    /* renamed from: a */
    public Animator mo335a(@NonNull ViewGroup viewGroup, @Nullable C0358z c0358z, @Nullable C0358z c0358z2) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo336a(@NonNull C0358z c0358z);

    @Nullable
    /* renamed from: a */
    public String[] mo338a() {
        return null;
    }

    /* renamed from: b */
    public abstract void mo339b(@NonNull C0358z c0358z);

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo372m();
    }

    @NonNull
    /* renamed from: a */
    public Transition mo358a(long j) {
        this.f1097a = j;
        return this;
    }

    /* renamed from: b */
    public long m1205b() {
        return this.f1097a;
    }

    @NonNull
    /* renamed from: b */
    public Transition mo363b(long j) {
        this.f1104j = j;
        return this;
    }

    /* renamed from: c */
    public long m1211c() {
        return this.f1104j;
    }

    @Nullable
    /* renamed from: d */
    public TimeInterpolator m1214d() {
        return this.f1105k;
    }

    /* renamed from: a */
    private void m1182a(C2880a<View, C0358z> c2880a, C2880a<View, C0358z> c2880a2) {
        for (int size = c2880a.size() - 1; size >= 0; size--) {
            View view = (View) c2880a.m2075b(size);
            if (view != null && m1203a(view)) {
                C0358z c0358z = (C0358z) c2880a2.remove(view);
                if (!(c0358z == null || c0358z.f1197b == null || !m1203a(c0358z.f1197b))) {
                    this.f1118x.add((C0358z) c2880a.m2077d(size));
                    this.f1119y.add(c0358z);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1184a(C2880a<View, C0358z> c2880a, C2880a<View, C0358z> c2880a2, C0550f<View> c0550f, C0550f<View> c0550f2) {
        int b = c0550f.m2029b();
        for (int i = 0; i < b; i++) {
            View view = (View) c0550f.m2033c(i);
            if (view != null && m1203a(view)) {
                View view2 = (View) c0550f2.m2025a(c0550f.m2030b(i));
                if (view2 != null && m1203a(view2)) {
                    C0358z c0358z = (C0358z) c2880a.get(view);
                    C0358z c0358z2 = (C0358z) c2880a2.get(view2);
                    if (!(c0358z == null || c0358z2 == null)) {
                        this.f1118x.add(c0358z);
                        this.f1119y.add(c0358z2);
                        c2880a.remove(view);
                        c2880a2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1185a(C2880a<View, C0358z> c2880a, C2880a<View, C0358z> c2880a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view = (View) sparseArray.valueAt(i);
            if (view != null && m1203a(view)) {
                View view2 = (View) sparseArray2.get(sparseArray.keyAt(i));
                if (view2 != null && m1203a(view2)) {
                    C0358z c0358z = (C0358z) c2880a.get(view);
                    C0358z c0358z2 = (C0358z) c2880a2.get(view2);
                    if (!(c0358z == null || c0358z2 == null)) {
                        this.f1118x.add(c0358z);
                        this.f1119y.add(c0358z2);
                        c2880a.remove(view);
                        c2880a2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1183a(C2880a<View, C0358z> c2880a, C2880a<View, C0358z> c2880a2, C2880a<String, View> c2880a3, C2880a<String, View> c2880a4) {
        int size = c2880a3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) c2880a3.m2076c(i);
            if (view != null && m1203a(view)) {
                View view2 = (View) c2880a4.get(c2880a3.m2075b(i));
                if (view2 != null && m1203a(view2)) {
                    C0358z c0358z = (C0358z) c2880a.get(view);
                    C0358z c0358z2 = (C0358z) c2880a2.get(view2);
                    if (!(c0358z == null || c0358z2 == null)) {
                        this.f1118x.add(c0358z);
                        this.f1119y.add(c0358z2);
                        c2880a.remove(view);
                        c2880a2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m1187b(C2880a<View, C0358z> c2880a, C2880a<View, C0358z> c2880a2) {
        for (int i = 0; i < c2880a.size(); i++) {
            C0358z c0358z = (C0358z) c2880a.m2076c(i);
            if (m1203a(c0358z.f1197b)) {
                this.f1118x.add(c0358z);
                this.f1119y.add(null);
            }
        }
        for (int i2 = 0; i2 < c2880a2.size(); i2++) {
            C0358z c0358z2 = (C0358z) c2880a2.m2076c(i2);
            if (m1203a(c0358z2.f1197b)) {
                this.f1119y.add(c0358z2);
                this.f1118x.add(null);
            }
        }
    }

    /* renamed from: a */
    private void m1180a(aa aaVar, aa aaVar2) {
        C2880a c2880a = new C2880a(aaVar.f1130a);
        C2880a c2880a2 = new C2880a(aaVar2.f1130a);
        for (int i : this.f1117w) {
            switch (i) {
                case 1:
                    m1182a(c2880a, c2880a2);
                    break;
                case 2:
                    m1183a(c2880a, c2880a2, aaVar.f1133d, aaVar2.f1133d);
                    break;
                case 3:
                    m1185a(c2880a, c2880a2, aaVar.f1131b, aaVar2.f1131b);
                    break;
                case 4:
                    m1184a(c2880a, c2880a2, aaVar.f1132c, aaVar2.f1132c);
                    break;
                default:
                    break;
            }
        }
        m1187b(c2880a, c2880a2);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    protected void mo362a(ViewGroup viewGroup, aa aaVar, aa aaVar2, ArrayList<C0358z> arrayList, ArrayList<C0358z> arrayList2) {
        Transition transition = this;
        ViewGroup viewGroup2 = viewGroup;
        C2880a o = mo373o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Format.OFFSET_SAMPLE_RELATIVE;
        int i = 0;
        while (i < size) {
            int i2;
            int i3;
            C0358z c0358z = (C0358z) arrayList.get(i);
            C0358z c0358z2 = (C0358z) arrayList2.get(i);
            if (!(c0358z == null || c0358z.f1198c.contains(transition))) {
                c0358z = null;
            }
            if (!(c0358z2 == null || c0358z2.f1198c.contains(transition))) {
                c0358z2 = null;
            }
            if (!(c0358z == null && c0358z2 == null)) {
                Object obj;
                Animator a;
                View view;
                String[] a2;
                C0358z c0358z3;
                Animator animator;
                C0358z c0358z4;
                Object obj2;
                long a3;
                long j2;
                if (!(c0358z == null || c0358z2 == null)) {
                    if (!mo337a(c0358z, c0358z2)) {
                        obj = null;
                        if (obj != null) {
                            a = mo335a(viewGroup2, c0358z, c0358z2);
                            if (a != null) {
                                if (c0358z2 == null) {
                                    view = c0358z2.f1197b;
                                    a2 = mo338a();
                                    if (view != null || a2 == null || a2.length <= 0) {
                                        i2 = size;
                                        i3 = i;
                                        a = a;
                                        c0358z3 = null;
                                    } else {
                                        c0358z3 = new C0358z();
                                        c0358z3.f1197b = view;
                                        animator = a;
                                        i2 = size;
                                        c0358z4 = (C0358z) aaVar2.f1130a.get(view);
                                        if (c0358z4 != null) {
                                            size = 0;
                                            while (size < a2.length) {
                                                i3 = i;
                                                C0358z c0358z5 = c0358z4;
                                                c0358z3.f1196a.put(a2[size], c0358z4.f1196a.get(a2[size]));
                                                size++;
                                                i = i3;
                                                c0358z4 = c0358z5;
                                                ArrayList<C0358z> arrayList3 = arrayList2;
                                            }
                                        }
                                        i3 = i;
                                        int size2 = o.size();
                                        for (int i4 = 0; i4 < size2; i4++) {
                                            C0320a c0320a = (C0320a) o.get((Animator) o.m2075b(i4));
                                            if (c0320a.f1081c != null && c0320a.f1079a == view && c0320a.f1080b.equals(m1226n()) && c0320a.f1081c.equals(c0358z3)) {
                                                a = null;
                                                break;
                                            }
                                        }
                                        a = animator;
                                    }
                                    obj2 = a;
                                    c0358z4 = c0358z3;
                                } else {
                                    animator = a;
                                    i2 = size;
                                    i3 = i;
                                    view = c0358z.f1197b;
                                    obj2 = animator;
                                    c0358z4 = null;
                                }
                                if (obj2 == null) {
                                    if (transition.f1102f != null) {
                                        a3 = transition.f1102f.m1302a(viewGroup2, transition, c0358z, c0358z2);
                                        sparseIntArray.put(transition.f1093G.size(), (int) a3);
                                        j = Math.min(a3, j);
                                    }
                                    j2 = j;
                                    o.put(obj2, new C0320a(view, m1226n(), transition, am.m1253b(viewGroup), c0358z4));
                                    transition.f1093G.add(obj2);
                                    j = j2;
                                }
                                i = i3 + 1;
                                size = i2;
                            }
                        }
                    }
                }
                obj = 1;
                if (obj != null) {
                    a = mo335a(viewGroup2, c0358z, c0358z2);
                    if (a != null) {
                        if (c0358z2 == null) {
                            animator = a;
                            i2 = size;
                            i3 = i;
                            view = c0358z.f1197b;
                            obj2 = animator;
                            c0358z4 = null;
                        } else {
                            view = c0358z2.f1197b;
                            a2 = mo338a();
                            if (view != null) {
                            }
                            i2 = size;
                            i3 = i;
                            a = a;
                            c0358z3 = null;
                            obj2 = a;
                            c0358z4 = c0358z3;
                        }
                        if (obj2 == null) {
                            if (transition.f1102f != null) {
                                a3 = transition.f1102f.m1302a(viewGroup2, transition, c0358z, c0358z2);
                                sparseIntArray.put(transition.f1093G.size(), (int) a3);
                                j = Math.min(a3, j);
                            }
                            j2 = j;
                            o.put(obj2, new C0320a(view, m1226n(), transition, am.m1253b(viewGroup), c0358z4));
                            transition.f1093G.add(obj2);
                            j = j2;
                        }
                        i = i3 + 1;
                        size = i2;
                    }
                }
            }
            i2 = size;
            i3 = i;
            i = i3 + 1;
            size = i2;
        }
        if (j != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator2 = (Animator) transition.f1093G.get(sparseIntArray.keyAt(i5));
                animator2.setStartDelay((((long) sparseIntArray.valueAt(i5)) - j) + animator2.getStartDelay());
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    boolean m1203a(android.view.View r6) {
        /*
        r5 = this;
        r0 = r6.getId();
        r1 = r5.f1108n;
        r2 = 0;
        if (r1 == 0) goto L_0x0016;
    L_0x0009:
        r1 = r5.f1108n;
        r3 = java.lang.Integer.valueOf(r0);
        r1 = r1.contains(r3);
        if (r1 == 0) goto L_0x0016;
    L_0x0015:
        return r2;
    L_0x0016:
        r1 = r5.f1109o;
        if (r1 == 0) goto L_0x0023;
    L_0x001a:
        r1 = r5.f1109o;
        r1 = r1.contains(r6);
        if (r1 == 0) goto L_0x0023;
    L_0x0022:
        return r2;
    L_0x0023:
        r1 = r5.f1110p;
        if (r1 == 0) goto L_0x0042;
    L_0x0027:
        r1 = r5.f1110p;
        r1 = r1.size();
        r3 = 0;
    L_0x002e:
        if (r3 >= r1) goto L_0x0042;
    L_0x0030:
        r4 = r5.f1110p;
        r4 = r4.get(r3);
        r4 = (java.lang.Class) r4;
        r4 = r4.isInstance(r6);
        if (r4 == 0) goto L_0x003f;
    L_0x003e:
        return r2;
    L_0x003f:
        r3 = r3 + 1;
        goto L_0x002e;
    L_0x0042:
        r1 = r5.f1111q;
        if (r1 == 0) goto L_0x0059;
    L_0x0046:
        r1 = android.support.v4.view.ViewCompat.m2224p(r6);
        if (r1 == 0) goto L_0x0059;
    L_0x004c:
        r1 = r5.f1111q;
        r3 = android.support.v4.view.ViewCompat.m2224p(r6);
        r1 = r1.contains(r3);
        if (r1 == 0) goto L_0x0059;
    L_0x0058:
        return r2;
    L_0x0059:
        r1 = r5.f1098b;
        r1 = r1.size();
        r3 = 1;
        if (r1 != 0) goto L_0x0083;
    L_0x0062:
        r1 = r5.f1099c;
        r1 = r1.size();
        if (r1 != 0) goto L_0x0083;
    L_0x006a:
        r1 = r5.f1107m;
        if (r1 == 0) goto L_0x0076;
    L_0x006e:
        r1 = r5.f1107m;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0083;
    L_0x0076:
        r1 = r5.f1106l;
        if (r1 == 0) goto L_0x0082;
    L_0x007a:
        r1 = r5.f1106l;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0083;
    L_0x0082:
        return r3;
    L_0x0083:
        r1 = r5.f1098b;
        r0 = java.lang.Integer.valueOf(r0);
        r0 = r1.contains(r0);
        if (r0 != 0) goto L_0x00c9;
    L_0x008f:
        r0 = r5.f1099c;
        r0 = r0.contains(r6);
        if (r0 == 0) goto L_0x0098;
    L_0x0097:
        goto L_0x00c9;
    L_0x0098:
        r0 = r5.f1106l;
        if (r0 == 0) goto L_0x00a9;
    L_0x009c:
        r0 = r5.f1106l;
        r1 = android.support.v4.view.ViewCompat.m2224p(r6);
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x00a9;
    L_0x00a8:
        return r3;
    L_0x00a9:
        r0 = r5.f1107m;
        if (r0 == 0) goto L_0x00c8;
    L_0x00ad:
        r0 = 0;
    L_0x00ae:
        r1 = r5.f1107m;
        r1 = r1.size();
        if (r0 >= r1) goto L_0x00c8;
    L_0x00b6:
        r1 = r5.f1107m;
        r1 = r1.get(r0);
        r1 = (java.lang.Class) r1;
        r1 = r1.isInstance(r6);
        if (r1 == 0) goto L_0x00c5;
    L_0x00c4:
        return r3;
    L_0x00c5:
        r0 = r0 + 1;
        goto L_0x00ae;
    L_0x00c8:
        return r2;
    L_0x00c9:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.Transition.a(android.view.View):boolean");
    }

    /* renamed from: o */
    private static C2880a<Animator, C0320a> mo373o() {
        C2880a<Animator, C0320a> c2880a = (C2880a) f1086z.get();
        if (c2880a != null) {
            return c2880a;
        }
        c2880a = new C2880a();
        f1086z.set(c2880a);
        return c2880a;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: e */
    protected void mo370e() {
        m1222j();
        C2880a o = mo373o();
        Iterator it = this.f1093G.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (o.containsKey(animator)) {
                m1222j();
                m1179a(animator, o);
            }
        }
        this.f1093G.clear();
        m1223k();
    }

    /* renamed from: a */
    private void m1179a(Animator animator, final C2880a<Animator, C0320a> c2880a) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter(this) {
                /* renamed from: b */
                final /* synthetic */ Transition f1077b;

                public void onAnimationStart(Animator animator) {
                    this.f1077b.f1088B.add(animator);
                }

                public void onAnimationEnd(Animator animator) {
                    c2880a.remove(animator);
                    this.f1077b.f1088B.remove(animator);
                }
            });
            m1195a(animator);
        }
    }

    @NonNull
    /* renamed from: b */
    public Transition mo365b(@NonNull View view) {
        this.f1099c.add(view);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public Transition mo366c(@NonNull View view) {
        this.f1099c.remove(view);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public List<Integer> m1218f() {
        return this.f1098b;
    }

    @NonNull
    /* renamed from: g */
    public List<View> m1219g() {
        return this.f1099c;
    }

    @Nullable
    /* renamed from: h */
    public List<String> m1220h() {
        return this.f1106l;
    }

    @Nullable
    /* renamed from: i */
    public List<Class> m1221i() {
        return this.f1107m;
    }

    /* renamed from: a */
    void m1200a(ViewGroup viewGroup, boolean z) {
        m1201a(z);
        if ((this.f1098b.size() > 0 || this.f1099c.size() > 0) && (this.f1106l == null || this.f1106l.isEmpty())) {
            int i;
            View view;
            if (this.f1107m != null) {
                if (this.f1107m.isEmpty()) {
                }
            }
            for (i = 0; i < this.f1098b.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f1098b.get(i)).intValue());
                if (findViewById != null) {
                    C0358z c0358z = new C0358z();
                    c0358z.f1197b = findViewById;
                    if (z) {
                        mo336a(c0358z);
                    } else {
                        mo339b(c0358z);
                    }
                    c0358z.f1198c.add(this);
                    mo367c(c0358z);
                    if (z) {
                        m1181a(this.f1115u, findViewById, c0358z);
                    } else {
                        m1181a(this.f1116v, findViewById, c0358z);
                    }
                }
            }
            for (viewGroup = null; viewGroup < this.f1099c.size(); viewGroup++) {
                view = (View) this.f1099c.get(viewGroup);
                C0358z c0358z2 = new C0358z();
                c0358z2.f1197b = view;
                if (z) {
                    mo336a(c0358z2);
                } else {
                    mo339b(c0358z2);
                }
                c0358z2.f1198c.add(this);
                mo367c(c0358z2);
                if (z) {
                    m1181a(this.f1115u, view, c0358z2);
                } else {
                    m1181a(this.f1116v, view, c0358z2);
                }
            }
            if (!z && this.f1095I != null) {
                viewGroup = this.f1095I.size();
                z = new ArrayList(viewGroup);
                for (i = 0; i < viewGroup; i++) {
                    z.add(this.f1115u.f1133d.remove((String) this.f1095I.m2075b(i)));
                }
                for (int i2 = 0; i2 < viewGroup; i2++) {
                    view = (View) z.get(i2);
                    if (view != null) {
                        this.f1115u.f1133d.put((String) this.f1095I.m2076c(i2), view);
                    }
                }
                return;
            }
        }
        m1188c(viewGroup, z);
        if (!z) {
        }
    }

    /* renamed from: a */
    private static void m1181a(aa aaVar, View view, C0358z c0358z) {
        aaVar.f1130a.put(view, c0358z);
        c0358z = view.getId();
        if (c0358z >= null) {
            if (aaVar.f1131b.indexOfKey(c0358z) >= 0) {
                aaVar.f1131b.put(c0358z, null);
            } else {
                aaVar.f1131b.put(c0358z, view);
            }
        }
        c0358z = ViewCompat.m2224p(view);
        if (c0358z != null) {
            if (aaVar.f1133d.containsKey(c0358z)) {
                aaVar.f1133d.put(c0358z, null);
            } else {
                aaVar.f1133d.put(c0358z, view);
            }
        }
        if ((view.getParent() instanceof ListView) != null) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (aaVar.f1132c.m2036d(itemIdAtPosition) >= null) {
                    view = (View) aaVar.f1132c.m2025a(itemIdAtPosition);
                    if (view != null) {
                        ViewCompat.m2191a(view, (boolean) null);
                        aaVar.f1132c.m2032b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ViewCompat.m2191a(view, true);
                aaVar.f1132c.m2032b(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: a */
    void m1201a(boolean z) {
        if (z) {
            this.f1115u.f1130a.clear();
            this.f1115u.f1131b.clear();
            this.f1115u.f1132c.m2034c();
            return;
        }
        this.f1116v.f1130a.clear();
        this.f1116v.f1131b.clear();
        this.f1116v.f1132c.m2034c();
    }

    /* renamed from: c */
    private void m1188c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            if (this.f1108n != null && this.f1108n.contains(Integer.valueOf(id))) {
                return;
            }
            if (this.f1109o == null || !this.f1109o.contains(view)) {
                int size;
                if (this.f1110p != null) {
                    size = this.f1110p.size();
                    int i = 0;
                    while (i < size) {
                        if (!((Class) this.f1110p.get(i)).isInstance(view)) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C0358z c0358z = new C0358z();
                    c0358z.f1197b = view;
                    if (z) {
                        mo336a(c0358z);
                    } else {
                        mo339b(c0358z);
                    }
                    c0358z.f1198c.add(this);
                    mo367c(c0358z);
                    if (z) {
                        m1181a(this.f1115u, view, c0358z);
                    } else {
                        m1181a(this.f1116v, view, c0358z);
                    }
                }
                if ((view instanceof ViewGroup) && (this.f1112r == null || !this.f1112r.contains(Integer.valueOf(id)))) {
                    if (this.f1113s == null || !this.f1113s.contains(view)) {
                        if (this.f1114t != null) {
                            id = this.f1114t.size();
                            size = 0;
                            while (size < id) {
                                if (!((Class) this.f1114t.get(size)).isInstance(view)) {
                                    size++;
                                } else {
                                    return;
                                }
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                            m1188c(viewGroup.getChildAt(i2), z);
                        }
                    }
                }
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public C0358z m1193a(@NonNull View view, boolean z) {
        if (this.f1100d != null) {
            return this.f1100d.m1193a(view, z);
        }
        return (C0358z) (z ? this.f1115u : this.f1116v).f1130a.get(view);
    }

    /* renamed from: b */
    C0358z m1209b(View view, boolean z) {
        if (this.f1100d != null) {
            return this.f1100d.m1209b(view, z);
        }
        ArrayList arrayList = z ? this.f1118x : this.f1119y;
        C0358z c0358z = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            C0358z c0358z2 = (C0358z) arrayList.get(i2);
            if (c0358z2 == null) {
                return null;
            }
            if (c0358z2.f1197b == view) {
                i = i2;
                break;
            }
        }
        if (i >= 0) {
            c0358z = (C0358z) (z ? this.f1119y : this.f1118x).get(i);
        }
        return c0358z;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public void mo369d(View view) {
        if (!this.f1091E) {
            C2880a o = mo373o();
            int size = o.size();
            view = am.m1253b(view);
            for (size--; size >= 0; size--) {
                C0320a c0320a = (C0320a) o.m2076c(size);
                if (c0320a.f1079a != null && view.equals(c0320a.f1082d)) {
                    C0324a.m1227a((Animator) o.m2075b(size));
                }
            }
            if (this.f1092F != null && this.f1092F.size() > null) {
                ArrayList arrayList = (ArrayList) this.f1092F.clone();
                int size2 = arrayList.size();
                for (size = 0; size < size2; size++) {
                    ((TransitionListener) arrayList.get(size)).onTransitionPause(this);
                }
            }
            this.f1090D = true;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public void mo371e(View view) {
        if (this.f1090D) {
            if (!this.f1091E) {
                C2880a o = mo373o();
                int size = o.size();
                view = am.m1253b(view);
                for (size--; size >= 0; size--) {
                    C0320a c0320a = (C0320a) o.m2076c(size);
                    if (c0320a.f1079a != null && view.equals(c0320a.f1082d)) {
                        C0324a.m1229b((Animator) o.m2075b(size));
                    }
                }
                if (this.f1092F != null && this.f1092F.size() > null) {
                    ArrayList arrayList = (ArrayList) this.f1092F.clone();
                    int size2 = arrayList.size();
                    for (size = 0; size < size2; size++) {
                        ((TransitionListener) arrayList.get(size)).onTransitionResume(this);
                    }
                }
            }
            this.f1090D = false;
        }
    }

    /* renamed from: a */
    void m1198a(ViewGroup viewGroup) {
        this.f1118x = new ArrayList();
        this.f1119y = new ArrayList();
        m1180a(this.f1115u, this.f1116v);
        C2880a o = mo373o();
        int size = o.size();
        av b = am.m1253b(viewGroup);
        for (size--; size >= 0; size--) {
            Animator animator = (Animator) o.m2075b(size);
            if (animator != null) {
                C0320a c0320a = (C0320a) o.get(animator);
                if (!(c0320a == null || c0320a.f1079a == null || !b.equals(c0320a.f1082d))) {
                    C0358z c0358z = c0320a.f1081c;
                    View view = c0320a.f1079a;
                    C0358z a = m1193a(view, true);
                    C0358z b2 = m1209b(view, true);
                    Object obj = (!(a == null && b2 == null) && c0320a.f1083e.mo337a(c0358z, b2)) ? 1 : null;
                    if (obj != null) {
                        if (!animator.isRunning()) {
                            if (!animator.isStarted()) {
                                o.remove(animator);
                            }
                        }
                        animator.cancel();
                    }
                }
            }
        }
        mo362a(viewGroup, this.f1115u, this.f1116v, this.f1118x, this.f1119y);
        mo370e();
    }

    /* renamed from: a */
    public boolean mo337a(@Nullable C0358z c0358z, @Nullable C0358z c0358z2) {
        if (c0358z == null || c0358z2 == null) {
            return false;
        }
        String[] a = mo338a();
        if (a != null) {
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (!m1186a(c0358z, c0358z2, a[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a2 : c0358z.f1196a.keySet()) {
            if (m1186a(c0358z, c0358z2, a2)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: a */
    private static boolean m1186a(C0358z c0358z, C0358z c0358z2, String str) {
        c0358z = c0358z.f1196a.get(str);
        c0358z2 = c0358z2.f1196a.get(str);
        if (c0358z == null && c0358z2 == null) {
            return null;
        }
        if (c0358z == null) {
            return true;
        }
        if (c0358z2 == null) {
            return true;
        }
        return 1 ^ c0358z.equals(c0358z2);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    protected void m1195a(Animator animator) {
        if (animator == null) {
            m1223k();
            return;
        }
        if (m1205b() >= 0) {
            animator.setDuration(m1205b());
        }
        if (m1211c() >= 0) {
            animator.setStartDelay(m1211c());
        }
        if (m1214d() != null) {
            animator.setInterpolator(m1214d());
        }
        animator.addListener(new C03193(this));
        animator.start();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: j */
    protected void m1222j() {
        if (this.f1089C == 0) {
            if (this.f1092F != null && this.f1092F.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f1092F.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((TransitionListener) arrayList.get(i)).onTransitionStart(this);
                }
            }
            this.f1091E = false;
        }
        this.f1089C++;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: k */
    protected void m1223k() {
        this.f1089C--;
        if (this.f1089C == 0) {
            int i;
            View view;
            if (this.f1092F != null && this.f1092F.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f1092F.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((TransitionListener) arrayList.get(i2)).onTransitionEnd(this);
                }
            }
            for (i = 0; i < this.f1115u.f1132c.m2029b(); i++) {
                view = (View) this.f1115u.f1132c.m2033c(i);
                if (view != null) {
                    ViewCompat.m2191a(view, false);
                }
            }
            for (i = 0; i < this.f1116v.f1132c.m2029b(); i++) {
                view = (View) this.f1116v.f1132c.m2033c(i);
                if (view != null) {
                    ViewCompat.m2191a(view, false);
                }
            }
            this.f1091E = true;
        }
    }

    @NonNull
    /* renamed from: a */
    public Transition mo359a(@NonNull TransitionListener transitionListener) {
        if (this.f1092F == null) {
            this.f1092F = new ArrayList();
        }
        this.f1092F.add(transitionListener);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public Transition mo364b(@NonNull TransitionListener transitionListener) {
        if (this.f1092F == null) {
            return this;
        }
        this.f1092F.remove(transitionListener);
        if (this.f1092F.size() == null) {
            this.f1092F = null;
        }
        return this;
    }

    @NonNull
    /* renamed from: l */
    public C0346l m1224l() {
        return this.f1096J;
    }

    /* renamed from: a */
    public void mo361a(@Nullable C0321b c0321b) {
        this.f1094H = c0321b;
    }

    /* renamed from: c */
    void mo367c(C0358z c0358z) {
        if (!(this.f1102f == null || c0358z.f1196a.isEmpty())) {
            String[] a = this.f1102f.m1304a();
            if (a != null) {
                Object obj = null;
                for (Object containsKey : a) {
                    if (!c0358z.f1196a.containsKey(containsKey)) {
                        break;
                    }
                }
                obj = 1;
                if (obj == null) {
                    this.f1102f.m1303a(c0358z);
                }
            }
        }
    }

    public String toString() {
        return mo360a("");
    }

    /* renamed from: m */
    public android.support.transition.Transition mo372m() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = 0;
        r1 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1 = (android.support.transition.Transition) r1;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2 = new java.util.ArrayList;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2.<init>();	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f1093G = r2;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2 = new android.support.transition.aa;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2.<init>();	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f1115u = r2;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2 = new android.support.transition.aa;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2.<init>();	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f1116v = r2;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f1118x = r0;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f1119y = r0;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        return r1;
    L_0x0021:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.Transition.m():android.support.transition.Transition");
    }

    @NonNull
    /* renamed from: n */
    public String m1226n() {
        return this.f1103i;
    }

    /* renamed from: a */
    String mo360a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(": ");
        str = stringBuilder.toString();
        if (this.f1097a != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("dur(");
            stringBuilder.append(this.f1097a);
            stringBuilder.append(") ");
            str = stringBuilder.toString();
        }
        if (this.f1104j != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("dly(");
            stringBuilder.append(this.f1104j);
            stringBuilder.append(") ");
            str = stringBuilder.toString();
        }
        if (this.f1105k != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("interp(");
            stringBuilder.append(this.f1105k);
            stringBuilder.append(") ");
            str = stringBuilder.toString();
        }
        if (this.f1098b.size() <= 0 && this.f1099c.size() <= 0) {
            return str;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("tgts(");
        str = stringBuilder.toString();
        if (this.f1098b.size() > 0) {
            String str2 = str;
            for (str = null; str < this.f1098b.size(); str++) {
                StringBuilder stringBuilder2;
                if (str > null) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str2);
                    stringBuilder2.append(", ");
                    str2 = stringBuilder2.toString();
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str2);
                stringBuilder2.append(this.f1098b.get(str));
                str2 = stringBuilder2.toString();
            }
            str = str2;
        }
        if (this.f1099c.size() > 0) {
            for (int i = 0; i < this.f1099c.size(); i++) {
                if (i > 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(", ");
                    str = stringBuilder.toString();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(this.f1099c.get(i));
                str = stringBuilder.toString();
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
