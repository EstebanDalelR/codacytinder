package butterknife.internal;

import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: butterknife.internal.b */
final class C0760b<T> extends AbstractList<T> implements RandomAccess {
    /* renamed from: a */
    private final T[] f2069a;

    C0760b(T[] tArr) {
        this.f2069a = tArr;
    }

    public T get(int i) {
        return this.f2069a[i];
    }

    public int size() {
        return this.f2069a.length;
    }

    public boolean contains(Object obj) {
        for (Object obj2 : this.f2069a) {
            if (obj2 == obj) {
                return true;
            }
        }
        return false;
    }
}
