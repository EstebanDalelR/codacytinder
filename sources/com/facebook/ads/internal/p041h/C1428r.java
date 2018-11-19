package com.facebook.ads.internal.p041h;

import android.support.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.facebook.ads.internal.h.r */
public class C1428r<T extends C1429s, E extends C1427q> {
    /* renamed from: a */
    private final Map<Class<E>, List<WeakReference<T>>> f3944a = new HashMap();
    /* renamed from: b */
    private final Queue<E> f3945b = new ArrayDeque();

    /* renamed from: a */
    private void m4992a(List<WeakReference<T>> list) {
        if (list != null) {
            int i;
            int i2 = 0;
            for (i = 0; i < list.size(); i++) {
                WeakReference weakReference = (WeakReference) list.get(i);
                if (weakReference.get() != null) {
                    int i3 = i2 + 1;
                    list.set(i2, weakReference);
                    i2 = i3;
                }
            }
            for (i = list.size() - 1; i >= i2; i--) {
                list.remove(i);
            }
        }
    }

    /* renamed from: b */
    private void m4993b(E e) {
        if (this.f3944a != null) {
            List list = (List) this.f3944a.get(e.getClass());
            if (list != null) {
                m4992a(list);
                if (!list.isEmpty()) {
                    for (WeakReference weakReference : new ArrayList(list)) {
                        C1429s c1429s = (C1429s) weakReference.get();
                        if (c1429s != null && c1429s.m5001b(e)) {
                            c1429s.mo1726a(e);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void m4994a(E e) {
        if (this.f3945b.isEmpty()) {
            this.f3945b.add(e);
            while (!this.f3945b.isEmpty()) {
                m4993b((C1427q) this.f3945b.peek());
                this.f3945b.remove();
            }
        } else {
            this.f3945b.add(e);
        }
    }

    /* renamed from: a */
    public synchronized void m4995a(T... tArr) {
        if (tArr != null) {
            for (C1429s a : tArr) {
                m4996a(a);
            }
        }
    }

    /* renamed from: a */
    public synchronized boolean m4996a(T t) {
        if (t == null) {
            return false;
        }
        Class a = t.mo1725a();
        if (this.f3944a.get(a) == null) {
            this.f3944a.put(a, new ArrayList());
        }
        List list = (List) this.f3944a.get(a);
        m4992a(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((WeakReference) list.get(i)).get() == t) {
                return false;
            }
        }
        return list.add(new WeakReference(t));
    }

    /* renamed from: b */
    public synchronized void m4997b(T... tArr) {
        if (tArr != null) {
            for (C1429s b : tArr) {
                m4998b(b);
            }
        }
    }

    /* renamed from: b */
    public synchronized boolean m4998b(@Nullable T t) {
        if (t == null) {
            return false;
        }
        List list = (List) this.f3944a.get(t.mo1725a());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((WeakReference) list.get(i)).get() == t) {
                ((WeakReference) list.get(i)).clear();
                return true;
            }
        }
        return false;
    }
}
