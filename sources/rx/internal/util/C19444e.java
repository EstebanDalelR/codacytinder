package rx.internal.util;

import rx.internal.util.unsafe.C19447i;

/* renamed from: rx.internal.util.e */
public final class C19444e<T> {
    /* renamed from: a */
    final float f60672a;
    /* renamed from: b */
    int f60673b;
    /* renamed from: c */
    int f60674c;
    /* renamed from: d */
    int f60675d;
    /* renamed from: e */
    T[] f60676e;

    /* renamed from: a */
    static int m69972a(int i) {
        i *= -1640531527;
        return i ^ (i >>> 16);
    }

    public C19444e() {
        this(16, 0.75f);
    }

    public C19444e(int i, float f) {
        this.f60672a = f;
        i = C19447i.m69985a(i);
        this.f60673b = i - 1;
        this.f60675d = (int) (f * ((float) i));
        this.f60676e = (Object[]) new Object[i];
    }

    /* renamed from: a */
    public boolean m69975a(T t) {
        Object[] objArr = this.f60676e;
        int i = this.f60673b;
        int a = C19444e.m69972a(t.hashCode()) & i;
        Object obj = objArr[a];
        if (obj != null) {
            if (obj.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                obj = objArr[a];
                if (obj == null) {
                }
            } while (!obj.equals(t));
            return false;
        }
        objArr[a] = t;
        t = this.f60674c + 1;
        this.f60674c = t;
        if (t >= this.f60675d) {
            m69976b();
        }
        return true;
    }

    /* renamed from: b */
    public boolean m69977b(T t) {
        Object[] objArr = this.f60676e;
        int i = this.f60673b;
        int a = C19444e.m69972a(t.hashCode()) & i;
        Object obj = objArr[a];
        if (obj == null) {
            return false;
        }
        if (obj.equals(t)) {
            return m69974a(a, objArr, i);
        }
        do {
            a = (a + 1) & i;
            obj = objArr[a];
            if (obj == null) {
                return false;
            }
        } while (!obj.equals(t));
        return m69974a(a, objArr, i);
    }

    /* renamed from: a */
    boolean m69974a(int i, T[] tArr, int i2) {
        this.f60674c--;
        while (true) {
            Object obj;
            int i3 = (i + 1) & i2;
            while (true) {
                obj = tArr[i3];
                if (obj == null) {
                    tArr[i] = 0;
                    return true;
                }
                int a = C19444e.m69972a(obj.hashCode()) & i2;
                if (i > i3) {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i3 = (i3 + 1) & i2;
                } else if (i >= a) {
                    break;
                } else if (a > i3) {
                    break;
                } else {
                    i3 = (i3 + 1) & i2;
                }
            }
            tArr[i] = obj;
            i = i3;
        }
    }

    /* renamed from: a */
    public void m69973a() {
        this.f60674c = 0;
        this.f60676e = new Object[0];
    }

    /* renamed from: b */
    void m69976b() {
        Object[] objArr = this.f60676e;
        int length = objArr.length;
        int i = length << 1;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i];
        int i3 = this.f60674c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                while (true) {
                    length--;
                    if (objArr[length] != null) {
                        break;
                    }
                }
                i3 = C19444e.m69972a(objArr[length].hashCode()) & i2;
                if (objArr2[i3] != null) {
                    do {
                        i3 = (i3 + 1) & i2;
                    } while (objArr2[i3] != null);
                }
                objArr2[i3] = objArr[length];
                i3 = i4;
            } else {
                this.f60673b = i2;
                this.f60675d = (int) (((float) i) * this.f60672a);
                this.f60676e = objArr2;
                return;
            }
        }
    }

    /* renamed from: c */
    public boolean m69978c() {
        return this.f60674c == 0;
    }

    /* renamed from: d */
    public T[] m69979d() {
        return this.f60676e;
    }
}
