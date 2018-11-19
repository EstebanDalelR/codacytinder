package android.support.v4.widget;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.util.C0562m;
import android.support.v4.util.Pools.C2878a;
import android.support.v4.util.Pools.Pool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestrictTo({Scope.LIBRARY})
/* renamed from: android.support.v4.widget.f */
public final class C0639f<T> {
    /* renamed from: a */
    private final Pool<ArrayList<T>> f1978a = new C2878a(10);
    /* renamed from: b */
    private final C0562m<T, ArrayList<T>> f1979b = new C0562m();
    /* renamed from: c */
    private final ArrayList<T> f1980c = new ArrayList();
    /* renamed from: d */
    private final HashSet<T> f1981d = new HashSet();

    /* renamed from: a */
    public void m2568a(@NonNull T t) {
        if (!this.f1979b.containsKey(t)) {
            this.f1979b.put(t, null);
        }
    }

    /* renamed from: b */
    public boolean m2571b(@NonNull T t) {
        return this.f1979b.containsKey(t);
    }

    /* renamed from: a */
    public void m2569a(@NonNull T t, @NonNull T t2) {
        if (this.f1979b.containsKey(t)) {
            if (this.f1979b.containsKey(t2)) {
                ArrayList arrayList = (ArrayList) this.f1979b.get(t);
                if (arrayList == null) {
                    arrayList = m2566c();
                    this.f1979b.put(t, arrayList);
                }
                arrayList.add(t2);
                return;
            }
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    @Nullable
    /* renamed from: c */
    public List m2572c(@NonNull T t) {
        return (List) this.f1979b.get(t);
    }

    @Nullable
    /* renamed from: d */
    public List<T> m2573d(@NonNull T t) {
        int size = this.f1979b.size();
        List<T> list = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1979b.m2076c(i);
            if (arrayList != null && arrayList.contains(t)) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(this.f1979b.m2075b(i));
            }
        }
        return list;
    }

    /* renamed from: e */
    public boolean m2574e(@NonNull T t) {
        int size = this.f1979b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1979b.m2076c(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m2567a() {
        int size = this.f1979b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1979b.m2076c(i);
            if (arrayList != null) {
                m2565a(arrayList);
            }
        }
        this.f1979b.clear();
    }

    @NonNull
    /* renamed from: b */
    public ArrayList<T> m2570b() {
        this.f1980c.clear();
        this.f1981d.clear();
        int size = this.f1979b.size();
        for (int i = 0; i < size; i++) {
            m2564a(this.f1979b.m2075b(i), this.f1980c, this.f1981d);
        }
        return this.f1980c;
    }

    /* renamed from: a */
    private void m2564a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (hashSet.contains(t)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(t);
            ArrayList arrayList2 = (ArrayList) this.f1979b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m2564a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
        }
    }

    @NonNull
    /* renamed from: c */
    private ArrayList<T> m2566c() {
        ArrayList<T> arrayList = (ArrayList) this.f1978a.acquire();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    /* renamed from: a */
    private void m2565a(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1978a.release(arrayList);
    }
}
