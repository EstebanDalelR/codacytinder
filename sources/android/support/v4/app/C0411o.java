package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.app.C2826c.C0388a;
import android.support.v4.util.C2880a;
import android.support.v4.view.ViewCompat;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.o */
class C0411o {
    /* renamed from: a */
    private static final int[] f1384a = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    /* renamed from: b */
    private static final C0419q f1385b = (VERSION.SDK_INT >= 21 ? new C2834p() : null);
    /* renamed from: c */
    private static final C0419q f1386c = C0411o.m1506a();

    /* renamed from: android.support.v4.app.o$a */
    static class C0410a {
        /* renamed from: a */
        public Fragment f1378a;
        /* renamed from: b */
        public boolean f1379b;
        /* renamed from: c */
        public C2826c f1380c;
        /* renamed from: d */
        public Fragment f1381d;
        /* renamed from: e */
        public boolean f1382e;
        /* renamed from: f */
        public C2826c f1383f;

        C0410a() {
        }
    }

    /* renamed from: a */
    private static android.support.v4.app.C0419q m1506a() {
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
        r0 = "android.support.transition.FragmentTransitionSupport";	 Catch:{ Exception -> 0x0016 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0016 }
        r1 = 0;	 Catch:{ Exception -> 0x0016 }
        r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0016 }
        r0 = r0.getDeclaredConstructor(r2);	 Catch:{ Exception -> 0x0016 }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0016 }
        r0 = r0.newInstance(r1);	 Catch:{ Exception -> 0x0016 }
        r0 = (android.support.v4.app.C0419q) r0;	 Catch:{ Exception -> 0x0016 }
        return r0;
    L_0x0016:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.o.a():android.support.v4.app.q");
    }

    /* renamed from: a */
    static void m1521a(C2832k c2832k, ArrayList<C2826c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (c2832k.f8992l >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C2826c c2826c = (C2826c) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    C0411o.m1535b(c2826c, sparseArray, z);
                } else {
                    C0411o.m1519a(c2826c, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(c2832k.f8993m.m11070i());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C2880a a = C0411o.m1508a(keyAt, (ArrayList) arrayList, (ArrayList) arrayList2, i, i2);
                    C0410a c0410a = (C0410a) sparseArray.valueAt(i4);
                    if (z) {
                        C0411o.m1520a(c2832k, keyAt, c0410a, view, a);
                    } else {
                        C0411o.m1536b(c2832k, keyAt, c0410a, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static C2880a<String, String> m1508a(int i, ArrayList<C2826c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        C2880a<String, String> c2880a = new C2880a();
        for (i3--; i3 >= i2; i3--) {
            C2826c c2826c = (C2826c) arrayList.get(i3);
            if (c2826c.m11046b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i3)).booleanValue();
                if (c2826c.f8950r != null) {
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    int size = c2826c.f8950r.size();
                    if (booleanValue) {
                        arrayList3 = c2826c.f8950r;
                        arrayList4 = c2826c.f8951s;
                    } else {
                        ArrayList arrayList5 = c2826c.f8950r;
                        arrayList3 = c2826c.f8951s;
                        arrayList4 = arrayList5;
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        String str = (String) arrayList4.get(i4);
                        String str2 = (String) arrayList3.get(i4);
                        String str3 = (String) c2880a.remove(str2);
                        if (str3 != null) {
                            c2880a.put(str, str3);
                        } else {
                            c2880a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c2880a;
    }

    /* renamed from: a */
    private static void m1520a(C2832k c2832k, int i, C0410a c0410a, View view, C2880a<String, String> c2880a) {
        C2832k c2832k2 = c2832k;
        C0410a c0410a2 = c0410a;
        View view2 = view;
        View view3 = c2832k2.f8994n.mo381a() ? (ViewGroup) c2832k2.f8994n.mo380a(i) : null;
        if (view3 != null) {
            Fragment fragment = c0410a2.f1378a;
            Fragment fragment2 = c0410a2.f1381d;
            C0419q a = C0411o.m1507a(fragment2, fragment);
            if (a != null) {
                boolean z = c0410a2.f1379b;
                boolean z2 = c0410a2.f1382e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object a2 = C0411o.m1512a(a, fragment, z);
                Object b = C0411o.m1531b(a, fragment2, z2);
                Object obj = a2;
                View view4 = view3;
                ArrayList arrayList3 = arrayList2;
                Object a3 = C0411o.m1513a(a, (ViewGroup) view3, view2, (C2880a) c2880a, c0410a2, arrayList2, arrayList, a2, b);
                Object obj2 = obj;
                if (obj2 == null && a3 == null) {
                    a2 = b;
                    if (a2 == null) {
                        return;
                    }
                }
                a2 = b;
                ArrayList b2 = C0411o.m1533b(a, a2, fragment2, arrayList3, view2);
                ArrayList b3 = C0411o.m1533b(a, obj2, fragment, arrayList, view2);
                C0411o.m1537b(b3, 4);
                Fragment fragment3 = fragment;
                ArrayList arrayList4 = b2;
                Object a4 = C0411o.m1514a(a, obj2, a2, a3, fragment3, z);
                if (a4 != null) {
                    C0411o.m1523a(a, a2, fragment2, arrayList4);
                    ArrayList a5 = a.m1544a(arrayList);
                    a.mo319a(a4, obj2, b3, a2, arrayList4, a3, arrayList);
                    View view5 = view4;
                    a.mo315a((ViewGroup) view5, a4);
                    a.m1546a(view5, arrayList3, arrayList, a5, c2880a);
                    C0411o.m1537b(b3, 0);
                    a.mo321a(a3, arrayList3, arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1523a(C0419q c0419q, Object obj, Fragment fragment, final ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            c0419q.mo326b(obj, fragment.getView(), (ArrayList) arrayList);
            C0423v.m1579a(fragment.mContainer, new Runnable() {
                public void run() {
                    C0411o.m1537b(arrayList, 4);
                }
            });
        }
    }

    /* renamed from: b */
    private static void m1536b(C2832k c2832k, int i, C0410a c0410a, View view, C2880a<String, String> c2880a) {
        C2832k c2832k2 = c2832k;
        C0410a c0410a2 = c0410a;
        View view2 = view;
        Map map = c2880a;
        ViewGroup viewGroup = c2832k2.f8994n.mo381a() ? (ViewGroup) c2832k2.f8994n.mo380a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = c0410a2.f1378a;
            Fragment fragment2 = c0410a2.f1381d;
            C0419q a = C0411o.m1507a(fragment2, fragment);
            if (a != null) {
                Object obj;
                Object obj2;
                Object a2;
                ArrayList arrayList;
                C0419q c0419q;
                ArrayList arrayList2;
                boolean z = c0410a2.f1379b;
                boolean z2 = c0410a2.f1382e;
                Object a3 = C0411o.m1512a(a, fragment, z);
                Object b = C0411o.m1531b(a, fragment2, z2);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = arrayList3;
                Object obj3 = b;
                Object obj4 = a3;
                C0419q c0419q2 = a;
                b = C0411o.m1532b(a, viewGroup, view2, map, c0410a2, arrayList3, arrayList4, a3, obj3);
                Object obj5 = obj4;
                if (obj5 == null && b == null) {
                    obj = obj3;
                    if (obj == null) {
                        return;
                    }
                }
                obj = obj3;
                ArrayList b2 = C0411o.m1533b(c0419q2, obj, fragment2, arrayList5, view2);
                if (b2 != null) {
                    if (!b2.isEmpty()) {
                        obj2 = obj;
                        c0419q2.mo325b(obj5, view2);
                        a2 = C0411o.m1514a(c0419q2, obj5, obj2, b, fragment, c0410a2.f1379b);
                        if (a2 != null) {
                            arrayList = new ArrayList();
                            c0419q = c0419q2;
                            arrayList5 = arrayList;
                            c0419q.mo319a(a2, obj5, arrayList, obj2, b2, b, arrayList4);
                            C0411o.m1522a(c0419q, viewGroup, fragment, view2, arrayList4, obj5, arrayList5, obj2, b2);
                            arrayList2 = arrayList4;
                            c0419q2.m1547a((View) viewGroup, arrayList2, map);
                            c0419q2.mo315a(viewGroup, a2);
                            c0419q2.m1549a(viewGroup, arrayList2, map);
                        }
                    }
                }
                obj2 = null;
                c0419q2.mo325b(obj5, view2);
                a2 = C0411o.m1514a(c0419q2, obj5, obj2, b, fragment, c0410a2.f1379b);
                if (a2 != null) {
                    arrayList = new ArrayList();
                    c0419q = c0419q2;
                    arrayList5 = arrayList;
                    c0419q.mo319a(a2, obj5, arrayList, obj2, b2, b, arrayList4);
                    C0411o.m1522a(c0419q, viewGroup, fragment, view2, arrayList4, obj5, arrayList5, obj2, b2);
                    arrayList2 = arrayList4;
                    c0419q2.m1547a((View) viewGroup, arrayList2, map);
                    c0419q2.mo315a(viewGroup, a2);
                    c0419q2.m1549a(viewGroup, arrayList2, map);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1522a(C0419q c0419q, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final C0419q c0419q2 = c0419q;
        final View view2 = view;
        final Fragment fragment2 = fragment;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        C0423v.m1579a(viewGroup, new Runnable() {
            public void run() {
                if (obj3 != null) {
                    c0419q2.mo329c(obj3, view2);
                    arrayList5.addAll(C0411o.m1533b(c0419q2, obj3, fragment2, arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        c0419q2.mo327b(obj4, arrayList6, arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        });
    }

    /* renamed from: a */
    private static C0419q m1507a(Fragment fragment, Fragment fragment2) {
        List arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            exitTransition = fragment.getReturnTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            fragment = fragment.getSharedElementReturnTransition();
            if (fragment != null) {
                arrayList.add(fragment);
            }
        }
        if (fragment2 != null) {
            fragment = fragment2.getEnterTransition();
            if (fragment != null) {
                arrayList.add(fragment);
            }
            fragment = fragment2.getReenterTransition();
            if (fragment != null) {
                arrayList.add(fragment);
            }
            fragment = fragment2.getSharedElementEnterTransition();
            if (fragment != null) {
                arrayList.add(fragment);
            }
        }
        if (arrayList.isEmpty() != null) {
            return null;
        }
        if (f1385b != null && C0411o.m1528a(f1385b, arrayList) != null) {
            return f1385b;
        }
        if (f1386c != null && C0411o.m1528a(f1386c, arrayList) != null) {
            return f1386c;
        }
        if (f1385b == null) {
            if (f1386c == null) {
                return null;
            }
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static boolean m1528a(C0419q c0419q, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!c0419q.mo322a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Object m1511a(C0419q c0419q, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment != null) {
            if (fragment2 != null) {
                if (z) {
                    fragment = fragment2.getSharedElementReturnTransition();
                } else {
                    fragment = fragment.getSharedElementEnterTransition();
                }
                return c0419q.mo328c(c0419q.mo323b(fragment));
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Object m1512a(C0419q c0419q, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        if (z) {
            fragment = fragment.getReenterTransition();
        } else {
            fragment = fragment.getEnterTransition();
        }
        return c0419q.mo323b(fragment);
    }

    /* renamed from: b */
    private static Object m1531b(C0419q c0419q, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        if (z) {
            fragment = fragment.getReturnTransition();
        } else {
            fragment = fragment.getExitTransition();
        }
        return c0419q.mo323b(fragment);
    }

    /* renamed from: a */
    private static Object m1513a(C0419q c0419q, ViewGroup viewGroup, View view, C2880a<String, String> c2880a, C0410a c0410a, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        final C0419q c0419q2 = c0419q;
        View view2 = view;
        C2880a c2880a2 = c2880a;
        C0410a c0410a2 = c0410a;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        Object obj3 = obj;
        Fragment fragment = c0410a2.f1378a;
        Fragment fragment2 = c0410a2.f1381d;
        if (fragment != null) {
            fragment.getView().setVisibility(0);
        }
        if (fragment != null) {
            if (fragment2 != null) {
                Object obj4;
                Object obj5;
                boolean z = c0410a2.f1379b;
                if (c2880a.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = C0411o.m1511a(c0419q2, fragment, fragment2, z);
                }
                C2880a b = C0411o.m1529b(c0419q2, c2880a2, obj4, c0410a2);
                C2880a c = C0411o.m1538c(c0419q2, c2880a2, obj4, c0410a2);
                if (c2880a.isEmpty()) {
                    if (b != null) {
                        b.clear();
                    }
                    if (c != null) {
                        c.clear();
                    }
                    obj5 = null;
                } else {
                    C0411o.m1527a(arrayList3, b, c2880a.keySet());
                    C0411o.m1527a(arrayList4, c, c2880a.values());
                    obj5 = obj4;
                }
                if (obj3 == null && obj2 == null && obj5 == null) {
                    return null;
                }
                Rect rect;
                View view3;
                C0411o.m1534b(fragment, fragment2, z, b, true);
                if (obj5 != null) {
                    arrayList4.add(view2);
                    c0419q2.mo318a(obj5, view2, arrayList3);
                    C0411o.m1524a(c0419q2, obj5, obj2, b, c0410a2.f1382e, c0410a2.f1383f);
                    Rect rect2 = new Rect();
                    View b2 = C0411o.m1530b(c, c0410a2, obj3, z);
                    if (b2 != null) {
                        c0419q2.mo316a(obj3, rect2);
                    }
                    rect = rect2;
                    view3 = b2;
                } else {
                    view3 = null;
                    rect = view3;
                }
                final Fragment fragment3 = fragment;
                final Fragment fragment4 = fragment2;
                final boolean z2 = z;
                final C2880a c2880a3 = c;
                C0423v.m1579a(viewGroup, new Runnable() {
                    public void run() {
                        C0411o.m1534b(fragment3, fragment4, z2, c2880a3, false);
                        if (view3 != null) {
                            c0419q2.m1545a(view3, rect);
                        }
                    }
                });
                return obj5;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m1527a(ArrayList<View> arrayList, C2880a<String, View> c2880a, Collection<String> collection) {
        for (int size = c2880a.size() - 1; size >= 0; size--) {
            View view = (View) c2880a.m2076c(size);
            if (collection.contains(ViewCompat.m2224p(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: b */
    private static Object m1532b(C0419q c0419q, ViewGroup viewGroup, View view, C2880a<String, String> c2880a, C0410a c0410a, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0419q c0419q2 = c0419q;
        C0410a c0410a2 = c0410a;
        final ArrayList arrayList3 = arrayList;
        final Object obj3 = obj;
        Fragment fragment = c0410a2.f1378a;
        Fragment fragment2 = c0410a2.f1381d;
        if (fragment != null) {
            if (fragment2 != null) {
                C2880a c2880a2;
                Object obj4;
                Object obj5;
                boolean z = c0410a2.f1379b;
                if (c2880a.isEmpty()) {
                    c2880a2 = c2880a;
                    obj4 = null;
                } else {
                    obj4 = C0411o.m1511a(c0419q2, fragment, fragment2, z);
                    c2880a2 = c2880a;
                }
                C2880a b = C0411o.m1529b(c0419q2, c2880a2, obj4, c0410a2);
                if (c2880a.isEmpty()) {
                    obj5 = null;
                } else {
                    arrayList3.addAll(b.values());
                    obj5 = obj4;
                }
                if (obj3 == null && obj2 == null && obj5 == null) {
                    return null;
                }
                Rect rect;
                C0411o.m1534b(fragment, fragment2, z, b, true);
                if (obj5 != null) {
                    rect = new Rect();
                    c0419q2.mo318a(obj5, view, arrayList3);
                    C0411o.m1524a(c0419q2, obj5, obj2, b, c0410a2.f1382e, c0410a2.f1383f);
                    if (obj3 != null) {
                        c0419q2.mo316a(obj3, rect);
                    }
                } else {
                    rect = null;
                }
                final C0419q c0419q3 = c0419q2;
                final C2880a c2880a3 = c2880a2;
                final Object obj6 = obj5;
                final C0410a c0410a3 = c0410a2;
                C04094 c04094 = r0;
                final ArrayList<View> arrayList4 = arrayList2;
                final View view2 = view;
                final Fragment fragment3 = fragment;
                fragment = fragment2;
                final boolean z2 = z;
                final Rect rect2 = rect;
                C04094 c040942 = new Runnable() {
                    public void run() {
                        C2880a a = C0411o.m1538c(c0419q3, c2880a3, obj6, c0410a3);
                        if (a != null) {
                            arrayList4.addAll(a.values());
                            arrayList4.add(view2);
                        }
                        C0411o.m1534b(fragment3, fragment, z2, a, false);
                        if (obj6 != null) {
                            c0419q3.mo321a(obj6, arrayList3, arrayList4);
                            View a2 = C0411o.m1530b(a, c0410a3, obj3, z2);
                            if (a2 != null) {
                                c0419q3.m1545a(a2, rect2);
                            }
                        }
                    }
                };
                C0423v.m1579a(viewGroup, c04094);
                return obj5;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static C2880a<String, View> m1529b(C0419q c0419q, C2880a<String, String> c2880a, Object obj, C0410a c0410a) {
        if (!c2880a.isEmpty()) {
            if (obj != null) {
                List list;
                obj = c0410a.f1381d;
                Map c2880a2 = new C2880a();
                c0419q.m1557a(c2880a2, obj.getView());
                c0419q = c0410a.f1383f;
                if (c0410a.f1382e != null) {
                    obj = obj.getEnterTransitionCallback();
                    list = c0419q.f8951s;
                } else {
                    obj = obj.getExitTransitionCallback();
                    list = c0419q.f8950r;
                }
                c2880a2.m11343a(list);
                if (obj != null) {
                    obj.m1438a(list, c2880a2);
                    for (obj = list.size() - 1; obj >= null; obj--) {
                        String str = (String) list.get(obj);
                        View view = (View) c2880a2.get(str);
                        if (view == null) {
                            c2880a.remove(str);
                        } else if (!str.equals(ViewCompat.m2224p(view))) {
                            c2880a.put(ViewCompat.m2224p(view), (String) c2880a.remove(str));
                        }
                    }
                } else {
                    c2880a.m11343a(c2880a2.keySet());
                }
                return c2880a2;
            }
        }
        c2880a.clear();
        return null;
    }

    /* renamed from: c */
    private static C2880a<String, View> m1538c(C0419q c0419q, C2880a<String, String> c2880a, Object obj, C0410a c0410a) {
        Fragment fragment = c0410a.f1378a;
        View view = fragment.getView();
        if (!(c2880a.isEmpty() || obj == null)) {
            if (view != null) {
                List list;
                C2880a c2880a2 = new C2880a();
                c0419q.m1557a((Map) c2880a2, view);
                c0419q = c0410a.f1380c;
                if (c0410a.f1379b != null) {
                    c0410a = fragment.getExitTransitionCallback();
                    list = c0419q.f8950r;
                } else {
                    c0410a = fragment.getEnterTransitionCallback();
                    list = c0419q.f8951s;
                }
                if (list != null) {
                    c2880a2.m11343a(list);
                    c2880a2.m11343a(c2880a.values());
                }
                if (c0410a != null) {
                    c0410a.m1438a(list, (Map) c2880a2);
                    for (c0410a = list.size() - 1; c0410a >= null; c0410a--) {
                        String str = (String) list.get(c0410a);
                        view = (View) c2880a2.get(str);
                        if (view == null) {
                            str = C0411o.m1515a((C2880a) c2880a, str);
                            if (str != null) {
                                c2880a.remove(str);
                            }
                        } else if (!str.equals(ViewCompat.m2224p(view))) {
                            str = C0411o.m1515a((C2880a) c2880a, str);
                            if (str != null) {
                                c2880a.put(str, ViewCompat.m2224p(view));
                            }
                        }
                    }
                } else {
                    C0411o.m1525a((C2880a) c2880a, c2880a2);
                }
                return c2880a2;
            }
        }
        c2880a.clear();
        return null;
    }

    /* renamed from: a */
    private static String m1515a(C2880a<String, String> c2880a, String str) {
        int size = c2880a.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c2880a.m2076c(i))) {
                return (String) c2880a.m2075b(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    private static View m1530b(C2880a<String, View> c2880a, C0410a c0410a, Object obj, boolean z) {
        c0410a = c0410a.f1380c;
        if (obj == null || c2880a == null || c0410a.f8950r == null || c0410a.f8950r.isEmpty() != null) {
            return null;
        }
        if (z) {
            c0410a = (String) c0410a.f8950r.get(0);
        } else {
            c0410a = (String) c0410a.f8951s.get(0);
        }
        return (View) c2880a.get(c0410a);
    }

    /* renamed from: a */
    private static void m1524a(C0419q c0419q, Object obj, Object obj2, C2880a<String, View> c2880a, boolean z, C2826c c2826c) {
        if (c2826c.f8950r != null && !c2826c.f8950r.isEmpty()) {
            if (z) {
                z = (String) c2826c.f8951s.get(0);
            } else {
                z = (String) c2826c.f8950r.get(0);
            }
            View view = (View) c2880a.get(z);
            c0419q.mo317a(obj, view);
            if (obj2 != null) {
                c0419q.mo317a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m1525a(C2880a<String, String> c2880a, C2880a<String, View> c2880a2) {
        for (int size = c2880a.size() - 1; size >= 0; size--) {
            if (!c2880a2.containsKey((String) c2880a.m2076c(size))) {
                c2880a.m2077d(size);
            }
        }
    }

    /* renamed from: b */
    private static void m1534b(Fragment fragment, Fragment fragment2, boolean z, C2880a<String, View> c2880a, boolean z2) {
        if (z) {
            fragment = fragment2.getEnterTransitionCallback();
        } else {
            fragment = fragment.getEnterTransitionCallback();
        }
        if (fragment != null) {
            int i;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            int i2 = 0;
            if (c2880a == null) {
                i = 0;
            } else {
                i = c2880a.size();
            }
            while (i2 < i) {
                arrayList2.add(c2880a.m2075b(i2));
                arrayList.add(c2880a.m2076c(i2));
                i2++;
            }
            if (z2) {
                fragment.m1437a(arrayList2, arrayList, null);
            } else {
                fragment.m1439b(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: b */
    private static ArrayList<View> m1533b(C0419q c0419q, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View view2 = fragment.getView();
        if (view2 != null) {
            c0419q.m1556a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty() != null) {
            return arrayList2;
        }
        arrayList2.add(view);
        c0419q.mo320a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: b */
    private static void m1537b(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m1514a(C0419q c0419q, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        fragment = (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        if (fragment != null) {
            return c0419q.mo314a(obj2, obj, obj3);
        }
        return c0419q.mo324b(obj2, obj, obj3);
    }

    /* renamed from: a */
    public static void m1519a(C2826c c2826c, SparseArray<C0410a> sparseArray, boolean z) {
        int size = c2826c.f8934b.size();
        for (int i = 0; i < size; i++) {
            C0411o.m1518a(c2826c, (C0388a) c2826c.f8934b.get(i), (SparseArray) sparseArray, false, z);
        }
    }

    /* renamed from: b */
    public static void m1535b(C2826c c2826c, SparseArray<C0410a> sparseArray, boolean z) {
        if (c2826c.f8933a.f8994n.mo381a()) {
            for (int size = c2826c.f8934b.size() - 1; size >= 0; size--) {
                C0411o.m1518a(c2826c, (C0388a) c2826c.f8934b.get(size), (SparseArray) sparseArray, true, z);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m1518a(android.support.v4.app.C2826c r16, android.support.v4.app.C2826c.C0388a r17, android.util.SparseArray<android.support.v4.app.C0411o.C0410a> r18, boolean r19, boolean r20) {
        /*
        r0 = r16;
        r1 = r17;
        r2 = r18;
        r3 = r19;
        r10 = r1.f1317b;
        if (r10 != 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r11 = r10.mContainerId;
        if (r11 != 0) goto L_0x0012;
    L_0x0011:
        return;
    L_0x0012:
        if (r3 == 0) goto L_0x001b;
    L_0x0014:
        r4 = f1384a;
        r1 = r1.f1316a;
        r1 = r4[r1];
        goto L_0x001d;
    L_0x001b:
        r1 = r1.f1316a;
    L_0x001d:
        r4 = 0;
        r5 = 1;
        if (r1 == r5) goto L_0x007d;
    L_0x0021:
        switch(r1) {
            case 3: goto L_0x0053;
            case 4: goto L_0x003b;
            case 5: goto L_0x0029;
            case 6: goto L_0x0053;
            case 7: goto L_0x007d;
            default: goto L_0x0024;
        };
    L_0x0024:
        r1 = 0;
    L_0x0025:
        r12 = 0;
        r13 = 0;
        goto L_0x0090;
    L_0x0029:
        if (r20 == 0) goto L_0x0038;
    L_0x002b:
        r1 = r10.mHiddenChanged;
        if (r1 == 0) goto L_0x008c;
    L_0x002f:
        r1 = r10.mHidden;
        if (r1 != 0) goto L_0x008c;
    L_0x0033:
        r1 = r10.mAdded;
        if (r1 == 0) goto L_0x008c;
    L_0x0037:
        goto L_0x008a;
    L_0x0038:
        r1 = r10.mHidden;
        goto L_0x008d;
    L_0x003b:
        if (r20 == 0) goto L_0x004a;
    L_0x003d:
        r1 = r10.mHiddenChanged;
        if (r1 == 0) goto L_0x006e;
    L_0x0041:
        r1 = r10.mAdded;
        if (r1 == 0) goto L_0x006e;
    L_0x0045:
        r1 = r10.mHidden;
        if (r1 == 0) goto L_0x006e;
    L_0x0049:
        goto L_0x006c;
    L_0x004a:
        r1 = r10.mAdded;
        if (r1 == 0) goto L_0x006e;
    L_0x004e:
        r1 = r10.mHidden;
        if (r1 != 0) goto L_0x006e;
    L_0x0052:
        goto L_0x0049;
    L_0x0053:
        if (r20 == 0) goto L_0x0070;
    L_0x0055:
        r1 = r10.mAdded;
        if (r1 != 0) goto L_0x006e;
    L_0x0059:
        r1 = r10.mView;
        if (r1 == 0) goto L_0x006e;
    L_0x005d:
        r1 = r10.mView;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x006e;
    L_0x0065:
        r1 = r10.mPostponedAlpha;
        r6 = 0;
        r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r1 < 0) goto L_0x006e;
    L_0x006c:
        r1 = 1;
        goto L_0x0079;
    L_0x006e:
        r1 = 0;
        goto L_0x0079;
    L_0x0070:
        r1 = r10.mAdded;
        if (r1 == 0) goto L_0x006e;
    L_0x0074:
        r1 = r10.mHidden;
        if (r1 != 0) goto L_0x006e;
    L_0x0078:
        goto L_0x006c;
    L_0x0079:
        r13 = r1;
        r1 = 0;
        r12 = 1;
        goto L_0x0090;
    L_0x007d:
        if (r20 == 0) goto L_0x0082;
    L_0x007f:
        r1 = r10.mIsNewlyAdded;
        goto L_0x008d;
    L_0x0082:
        r1 = r10.mAdded;
        if (r1 != 0) goto L_0x008c;
    L_0x0086:
        r1 = r10.mHidden;
        if (r1 != 0) goto L_0x008c;
    L_0x008a:
        r1 = 1;
        goto L_0x008d;
    L_0x008c:
        r1 = 0;
    L_0x008d:
        r4 = r1;
        r1 = 1;
        goto L_0x0025;
    L_0x0090:
        r6 = r2.get(r11);
        r6 = (android.support.v4.app.C0411o.C0410a) r6;
        if (r4 == 0) goto L_0x00a2;
    L_0x0098:
        r6 = android.support.v4.app.C0411o.m1505a(r6, r2, r11);
        r6.f1378a = r10;
        r6.f1379b = r3;
        r6.f1380c = r0;
    L_0x00a2:
        r14 = r6;
        r9 = 0;
        if (r20 != 0) goto L_0x00ca;
    L_0x00a6:
        if (r1 == 0) goto L_0x00ca;
    L_0x00a8:
        if (r14 == 0) goto L_0x00b0;
    L_0x00aa:
        r1 = r14.f1381d;
        if (r1 != r10) goto L_0x00b0;
    L_0x00ae:
        r14.f1381d = r9;
    L_0x00b0:
        r4 = r0.f8933a;
        r1 = r10.mState;
        if (r1 >= r5) goto L_0x00ca;
    L_0x00b6:
        r1 = r4.f8992l;
        if (r1 < r5) goto L_0x00ca;
    L_0x00ba:
        r1 = r0.f8952t;
        if (r1 != 0) goto L_0x00ca;
    L_0x00be:
        r4.m11171g(r10);
        r6 = 1;
        r7 = 0;
        r8 = 0;
        r1 = 0;
        r5 = r10;
        r9 = r1;
        r4.m11128a(r5, r6, r7, r8, r9);
    L_0x00ca:
        if (r13 == 0) goto L_0x00dc;
    L_0x00cc:
        if (r14 == 0) goto L_0x00d2;
    L_0x00ce:
        r1 = r14.f1381d;
        if (r1 != 0) goto L_0x00dc;
    L_0x00d2:
        r14 = android.support.v4.app.C0411o.m1505a(r14, r2, r11);
        r14.f1381d = r10;
        r14.f1382e = r3;
        r14.f1383f = r0;
    L_0x00dc:
        if (r20 != 0) goto L_0x00e9;
    L_0x00de:
        if (r12 == 0) goto L_0x00e9;
    L_0x00e0:
        if (r14 == 0) goto L_0x00e9;
    L_0x00e2:
        r0 = r14.f1378a;
        if (r0 != r10) goto L_0x00e9;
    L_0x00e6:
        r0 = 0;
        r14.f1378a = r0;
    L_0x00e9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.o.a(android.support.v4.app.c, android.support.v4.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static C0410a m1505a(C0410a c0410a, SparseArray<C0410a> sparseArray, int i) {
        if (c0410a != null) {
            return c0410a;
        }
        c0410a = new C0410a();
        sparseArray.put(i, c0410a);
        return c0410a;
    }
}
