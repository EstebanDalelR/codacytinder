package io.reactivex.internal.util;

/* renamed from: io.reactivex.internal.util.g */
public final class C15740g<T> {
    /* renamed from: a */
    final float f48665a;
    /* renamed from: b */
    int f48666b;
    /* renamed from: c */
    int f48667c;
    /* renamed from: d */
    int f48668d;
    /* renamed from: e */
    T[] f48669e;

    /* renamed from: a */
    static int m58987a(int i) {
        i *= -1640531527;
        return i ^ (i >>> 16);
    }

    public C15740g() {
        this(16, 0.75f);
    }

    public C15740g(int i) {
        this(i, 0.75f);
    }

    public C15740g(int i, float f) {
        this.f48665a = f;
        i = C15741h.m58994a(i);
        this.f48666b = i - 1;
        this.f48668d = (int) (f * ((float) i));
        this.f48669e = (Object[]) new Object[i];
    }

    /* renamed from: a */
    public boolean m58990a(T t) {
        Object[] objArr = this.f48669e;
        int i = this.f48666b;
        int a = C15740g.m58987a(t.hashCode()) & i;
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
        t = this.f48667c + 1;
        this.f48667c = t;
        if (t >= this.f48668d) {
            m58988a();
        }
        return true;
    }

    /* renamed from: b */
    public boolean m58991b(T t) {
        Object[] objArr = this.f48669e;
        int i = this.f48666b;
        int a = C15740g.m58987a(t.hashCode()) & i;
        Object obj = objArr[a];
        if (obj == null) {
            return false;
        }
        if (obj.equals(t)) {
            return m58989a(a, objArr, i);
        }
        do {
            a = (a + 1) & i;
            obj = objArr[a];
            if (obj == null) {
                return false;
            }
        } while (!obj.equals(t));
        return m58989a(a, objArr, i);
    }

    /* renamed from: a */
    boolean m58989a(int i, T[] tArr, int i2) {
        this.f48667c--;
        while (true) {
            Object obj;
            int i3 = (i + 1) & i2;
            while (true) {
                obj = tArr[i3];
                if (obj == null) {
                    tArr[i] = 0;
                    return true;
                }
                int a = C15740g.m58987a(obj.hashCode()) & i2;
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
    void m58988a() {
        Object[] objArr = this.f48669e;
        int length = objArr.length;
        int i = length << 1;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i];
        int i3 = this.f48667c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                while (true) {
                    length--;
                    if (objArr[length] != null) {
                        break;
                    }
                }
                i3 = C15740g.m58987a(objArr[length].hashCode()) & i2;
                if (objArr2[i3] != null) {
                    do {
                        i3 = (i3 + 1) & i2;
                    } while (objArr2[i3] != null);
                }
                objArr2[i3] = objArr[length];
                i3 = i4;
            } else {
                this.f48666b = i2;
                this.f48668d = (int) (((float) i) * this.f48665a);
                this.f48669e = objArr2;
                return;
            }
        }
    }

    /* renamed from: b */
    public Object[] m58992b() {
        return this.f48669e;
    }

    /* renamed from: c */
    public int m58993c() {
        return this.f48667c;
    }
}
