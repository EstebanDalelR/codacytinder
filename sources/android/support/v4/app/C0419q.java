package android.support.v4.app;

import android.graphics.Rect;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.view.C0604l;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.app.q */
public abstract class C0419q {
    /* renamed from: a */
    public abstract Object mo314a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public abstract void mo315a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo316a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo317a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo318a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo319a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo320a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo321a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo322a(Object obj);

    /* renamed from: b */
    public abstract Object mo323b(Object obj);

    /* renamed from: b */
    public abstract Object mo324b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo325b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo326b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo327b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo328c(Object obj);

    /* renamed from: c */
    public abstract void mo329c(Object obj, View view);

    /* renamed from: a */
    protected void m1545a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    ArrayList<String> m1544a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(ViewCompat.m2224p(view));
            ViewCompat.m2190a(view, null);
        }
        return arrayList2;
    }

    /* renamed from: a */
    void m1546a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String p = ViewCompat.m2224p(view2);
            arrayList4.add(p);
            if (p != null) {
                ViewCompat.m2190a(view2, null);
                String str = (String) map.get(p);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        ViewCompat.m2190a((View) arrayList2.get(i2), p);
                        break;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        C0423v.m1579a(view, new Runnable(this) {
            /* renamed from: f */
            final /* synthetic */ C0419q f1406f;

            public void run() {
                for (int i = 0; i < size; i++) {
                    ViewCompat.m2190a((View) arrayList5.get(i), (String) arrayList6.get(i));
                    ViewCompat.m2190a((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        });
    }

    /* renamed from: a */
    void m1556a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0604l.m2359b(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m1556a((ArrayList) arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* renamed from: a */
    void m1557a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String p = ViewCompat.m2224p(view);
            if (p != null) {
                map.put(p, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m1557a((Map) map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    void m1547a(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0423v.m1579a(view, new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C0419q f1409c;

            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String p = ViewCompat.m2224p(view);
                    if (p != null) {
                        ViewCompat.m2190a(view, C0419q.m1539a(map, p));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    void m1549a(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0423v.m1579a(viewGroup, new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C0419q f1412c;

            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    ViewCompat.m2190a(view, (String) map.get(ViewCompat.m2224p(view)));
                }
            }
        });
    }

    /* renamed from: a */
    protected static void m1540a(List<View> list, View view) {
        int size = list.size();
        if (!C0419q.m1542a((List) list, view, size)) {
            list.add(view);
            for (view = size; view < list.size(); view++) {
                View view2 = (View) list.get(view);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (!C0419q.m1542a((List) list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m1542a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static boolean m1541a(List list) {
        if (list != null) {
            if (list.isEmpty() == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    static String m1539a(Map<String, String> map, String str) {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }
}
