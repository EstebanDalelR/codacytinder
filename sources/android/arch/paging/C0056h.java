package android.arch.paging;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.arch.paging.h */
final class C0056h<T> extends AbstractList<T> {
    /* renamed from: a */
    private static final List f138a = new ArrayList();
    /* renamed from: b */
    private int f139b;
    /* renamed from: c */
    private final ArrayList<List<T>> f140c;
    /* renamed from: d */
    private int f141d;
    /* renamed from: e */
    private int f142e;
    /* renamed from: f */
    private int f143f;
    /* renamed from: g */
    private int f144g;
    /* renamed from: h */
    private int f145h;
    /* renamed from: i */
    private int f146i;

    /* renamed from: android.arch.paging.h$a */
    interface C0055a {
        /* renamed from: a */
        void mo50a(int i, int i2);

        /* renamed from: a */
        void mo51a(int i, int i2, int i3);

        /* renamed from: b */
        void mo55b(int i);

        /* renamed from: b */
        void mo56b(int i, int i2, int i3);

        /* renamed from: c */
        void mo58c(int i);
    }

    C0056h() {
        this.f139b = 0;
        this.f140c = new ArrayList();
        this.f141d = 0;
        this.f142e = 0;
        this.f143f = 0;
        this.f144g = 1;
        this.f145h = 0;
        this.f146i = 0;
    }

    private C0056h(C0056h<T> c0056h) {
        this.f139b = c0056h.f139b;
        this.f140c = new ArrayList(c0056h.f140c);
        this.f141d = c0056h.f141d;
        this.f142e = c0056h.f142e;
        this.f143f = c0056h.f143f;
        this.f144g = c0056h.f144g;
        this.f145h = c0056h.f145h;
        this.f146i = c0056h.f146i;
    }

    /* renamed from: a */
    C0056h<T> m203a() {
        return new C0056h(this);
    }

    /* renamed from: a */
    private void m201a(int i, List<T> list, int i2, int i3) {
        this.f139b = i;
        this.f140c.clear();
        this.f140c.add(list);
        this.f141d = i2;
        this.f142e = i3;
        this.f143f = list.size();
        this.f144g = list.size();
        this.f145h = 0;
        this.f146i = 0;
    }

    /* renamed from: a */
    void m206a(int i, @NonNull List<T> list, int i2, int i3, @NonNull C0055a c0055a) {
        m201a(i, (List) list, i2, i3);
        c0055a.mo55b(size());
    }

    public T get(int i) {
        if (i >= 0) {
            if (i < size()) {
                i -= this.f139b;
                if (i >= 0) {
                    if (i < this.f143f) {
                        int i2;
                        if (m211b()) {
                            i2 = i / this.f144g;
                            i %= this.f144g;
                        } else {
                            i2 = this.f140c.size();
                            int i3 = 0;
                            while (i3 < i2) {
                                int size = ((List) this.f140c.get(i3)).size();
                                if (size > i) {
                                    break;
                                }
                                i -= size;
                                i3++;
                            }
                            i2 = i3;
                        }
                        List list = (List) this.f140c.get(i2);
                        if (list != null) {
                            if (list.size() != 0) {
                                return list.get(i);
                            }
                        }
                        return null;
                    }
                }
                return null;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index: ");
        stringBuilder.append(i);
        stringBuilder.append(", Size: ");
        stringBuilder.append(size());
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    /* renamed from: b */
    boolean m211b() {
        return this.f144g > 0;
    }

    /* renamed from: c */
    int m212c() {
        return this.f139b;
    }

    /* renamed from: d */
    int m213d() {
        return this.f141d;
    }

    /* renamed from: e */
    int m214e() {
        return this.f143f;
    }

    /* renamed from: f */
    int m215f() {
        return this.f146i;
    }

    /* renamed from: g */
    int m216g() {
        return this.f145h;
    }

    /* renamed from: h */
    int m217h() {
        return this.f140c.size();
    }

    /* renamed from: i */
    int m218i() {
        return this.f142e;
    }

    public int size() {
        return (this.f139b + this.f143f) + this.f141d;
    }

    /* renamed from: j */
    int m219j() {
        int i = this.f139b;
        int size = this.f140c.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) this.f140c.get(i2);
            if (list != null && list != f138a) {
                break;
            }
            i += this.f144g;
        }
        return i;
    }

    /* renamed from: k */
    int m220k() {
        int i = this.f141d;
        for (int size = this.f140c.size() - 1; size >= 0; size--) {
            List list = (List) this.f140c.get(size);
            if (list != null && list != f138a) {
                break;
            }
            i += this.f144g;
        }
        return i;
    }

    /* renamed from: l */
    T m221l() {
        return ((List) this.f140c.get(0)).get(0);
    }

    /* renamed from: m */
    T m222m() {
        List list = (List) this.f140c.get(this.f140c.size() - 1);
        return list.get(list.size() - 1);
    }

    /* renamed from: a */
    void m208a(@NonNull List<T> list, @NonNull C0055a c0055a) {
        int size = list.size();
        if (size != 0) {
            if (this.f144g > 0 && size != this.f144g) {
                if (this.f140c.size() != 1 || size <= this.f144g) {
                    this.f144g = -1;
                } else {
                    this.f144g = size;
                }
            }
            this.f140c.add(0, list);
            this.f143f += size;
            list = Math.min(this.f139b, size);
            int i = size - list;
            if (list != null) {
                this.f139b -= list;
            }
            this.f142e -= i;
            this.f145h += size;
            c0055a.mo51a(this.f139b, list, i);
        }
    }

    /* renamed from: b */
    void m210b(@NonNull List<T> list, @NonNull C0055a c0055a) {
        int size = list.size();
        if (size != 0) {
            if (this.f144g > 0 && (((List) this.f140c.get(this.f140c.size() - 1)).size() != this.f144g || size > this.f144g)) {
                this.f144g = -1;
            }
            this.f140c.add(list);
            this.f143f += size;
            list = Math.min(this.f141d, size);
            int i = size - list;
            if (list != null) {
                this.f141d -= list;
            }
            this.f146i += size;
            c0055a.mo56b((this.f139b + this.f143f) - size, list, i);
        }
    }

    /* renamed from: a */
    void m205a(int i, @NonNull List<T> list, int i2, int i3, int i4, @NonNull C0055a c0055a) {
        int size = (list.size() + (i4 - 1)) / i4;
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 * i4;
            int i7 = i5 + 1;
            List subList = list.subList(i6, Math.min(list.size(), i7 * i4));
            if (i5 == 0) {
                m201a(i, subList, (list.size() + i2) - subList.size(), i3);
            } else {
                m207a(i6 + i, subList, null);
            }
            i5 = i7;
        }
        c0055a.mo55b(size());
    }

    /* renamed from: a */
    public void m207a(int i, @NonNull List<T> list, @Nullable C0055a c0055a) {
        int size = list.size();
        if (size != this.f144g) {
            int size2 = size();
            Object obj = null;
            Object obj2 = (i != size2 - (size2 % this.f144g) || size >= this.f144g) ? null : 1;
            if (this.f141d == 0 && this.f140c.size() == 1 && size > this.f144g) {
                obj = 1;
            }
            if (obj == null && obj2 == null) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            } else if (obj != null) {
                this.f144g = size;
            }
        }
        size = i / this.f144g;
        m202b(size, size);
        size -= this.f139b / this.f144g;
        List list2 = (List) this.f140c.get(size);
        if (list2 == null || list2 == f138a) {
            this.f140c.set(size, list);
            if (c0055a != null) {
                c0055a.mo50a(i, list.size());
                return;
            }
            return;
        }
        c0055a = new StringBuilder();
        c0055a.append("Invalid position ");
        c0055a.append(i);
        c0055a.append(": data already loaded");
        throw new IllegalArgumentException(c0055a.toString());
    }

    /* renamed from: b */
    private void m202b(int i, int i2) {
        int i3 = this.f139b / this.f144g;
        if (i < i3) {
            int i4;
            int i5 = 0;
            while (true) {
                i4 = i3 - i;
                if (i5 >= i4) {
                    break;
                }
                this.f140c.add(0, null);
                i5++;
            }
            i4 *= this.f144g;
            this.f143f += i4;
            this.f139b -= i4;
        } else {
            i = i3;
        }
        if (i2 >= this.f140c.size() + i) {
            i3 = Math.min(this.f141d, ((i2 + 1) - (this.f140c.size() + i)) * this.f144g);
            for (int size = this.f140c.size(); size <= i2 - i; size++) {
                this.f140c.add(this.f140c.size(), null);
            }
            this.f143f += i3;
            this.f141d -= i3;
        }
    }

    /* renamed from: a */
    public void m204a(int i, int i2, int i3, C0055a c0055a) {
        if (i3 != this.f144g) {
            if (i3 < this.f144g) {
                throw new IllegalArgumentException("Page size cannot be reduced");
            }
            if (this.f140c.size() == 1) {
                if (this.f141d == 0) {
                    this.f144g = i3;
                }
            }
            throw new IllegalArgumentException("Page size can change only if last page is only one present");
        }
        i3 = ((size() + this.f144g) - 1) / this.f144g;
        int max = Math.max((i - i2) / this.f144g, 0);
        i = Math.min((i + i2) / this.f144g, i3 - 1);
        m202b(max, i);
        i2 = this.f139b / this.f144g;
        while (max <= i) {
            i3 = max - i2;
            if (this.f140c.get(i3) == null) {
                this.f140c.set(i3, f138a);
                c0055a.mo58c(max);
            }
            max++;
        }
    }

    /* renamed from: a */
    public boolean m209a(int i, int i2) {
        int i3 = this.f139b / i;
        i = 0;
        if (i2 >= i3) {
            if (i2 < this.f140c.size() + i3) {
                List list = (List) this.f140c.get(i2 - i3);
                if (!(list == null || list == f138a)) {
                    i = 1;
                }
                return i;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("leading ");
        stringBuilder.append(this.f139b);
        stringBuilder.append(", storage ");
        stringBuilder.append(this.f143f);
        stringBuilder.append(", trailing ");
        stringBuilder.append(m213d());
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
        for (int i = 0; i < this.f140c.size(); i++) {
            stringBuilder2.append(" ");
            stringBuilder2.append(this.f140c.get(i));
        }
        return stringBuilder2.toString();
    }
}
