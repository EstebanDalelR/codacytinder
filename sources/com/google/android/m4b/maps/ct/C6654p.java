package com.google.android.m4b.maps.ct;

import com.google.android.m4b.maps.ct.C5255d.C5253a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.m4b.maps.ct.p */
class C6654p extends C5255d {
    private static final long serialVersionUID = 1;
    /* renamed from: b */
    protected final byte[] f24940b;
    /* renamed from: c */
    private int f24941c = 0;

    /* renamed from: com.google.android.m4b.maps.ct.p$a */
    class C6653a implements C5253a {
        /* renamed from: a */
        private int f24937a;
        /* renamed from: b */
        private final int f24938b;
        /* renamed from: c */
        private /* synthetic */ C6654p f24939c;

        private C6653a(C6654p c6654p) {
            this.f24939c = c6654p;
            this.f24937a = 0;
            this.f24938b = c6654p.mo5381b();
        }

        public final boolean hasNext() {
            return this.f24937a < this.f24938b;
        }

        /* renamed from: a */
        public final byte mo5378a() {
            try {
                byte[] bArr = this.f24939c.f24940b;
                int i = this.f24937a;
                this.f24937a = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ Object next() {
            return Byte.valueOf(mo5378a());
        }
    }

    /* renamed from: e */
    protected final int mo5384e() {
        return 0;
    }

    /* renamed from: f */
    protected final boolean mo5385f() {
        return true;
    }

    /* renamed from: h */
    protected int m29696h() {
        return 0;
    }

    public /* synthetic */ Iterator iterator() {
        return mo5380a();
    }

    C6654p(byte[] bArr) {
        this.f24940b = bArr;
    }

    /* renamed from: b */
    public byte m29689b(int i) {
        return this.f24940b[i];
    }

    /* renamed from: b */
    public int mo5381b() {
        return this.f24940b.length;
    }

    /* renamed from: b */
    protected void mo5382b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f24940b, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5255d) || mo5381b() != ((C5255d) obj).mo5381b()) {
            return false;
        }
        if (mo5381b() == 0) {
            return true;
        }
        if (obj instanceof C6654p) {
            C6654p c6654p = (C6654p) obj;
            if (this.f24941c == 0 || c6654p.f24941c == 0 || this.f24941c == c6654p.f24941c) {
                return m29688a(c6654p, 0, mo5381b());
            }
            return false;
        } else if (obj instanceof C6658u) {
            return obj.equals(this);
        } else {
            obj = String.valueOf(obj.getClass());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 49);
            stringBuilder.append("Has a new type of ByteString been created? Found ");
            stringBuilder.append(obj);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    final boolean m29688a(C6654p c6654p, int i, int i2) {
        if (i2 > c6654p.mo5381b()) {
            i = mo5381b();
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i2);
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i + i2 > c6654p.mo5381b()) {
            c6654p = c6654p.mo5381b();
            StringBuilder stringBuilder2 = new StringBuilder(59);
            stringBuilder2.append("Ran off end of other: ");
            stringBuilder2.append(i);
            stringBuilder2.append(", ");
            stringBuilder2.append(i2);
            stringBuilder2.append(", ");
            stringBuilder2.append(c6654p);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else {
            byte[] bArr = this.f24940b;
            byte[] bArr2 = c6654p.f24940b;
            int h = m29696h() + i2;
            i2 = m29696h();
            c6654p = c6654p.m29696h() + i;
            while (i2 < h) {
                if (bArr[i2] != bArr2[c6654p]) {
                    return null;
                }
                i2++;
                c6654p++;
            }
            return true;
        }
    }

    public int hashCode() {
        int i = this.f24941c;
        if (i == 0) {
            i = mo5381b();
            i = mo5379a(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.f24941c = i;
        }
        return i;
    }

    /* renamed from: g */
    protected final int mo5386g() {
        return this.f24941c;
    }

    /* renamed from: a */
    protected final int mo5379a(int i, int i2, int i3) {
        byte[] bArr = this.f24940b;
        int h = m29696h() + i2;
        i2 = i;
        for (i = h; i < h + i3; i++) {
            i2 = (i2 * 31) + bArr[i];
        }
        return i2;
    }

    /* renamed from: d */
    public final C5257e mo5383d() {
        return C5257e.m23279a(this);
    }

    /* renamed from: a */
    public C5253a mo5380a() {
        return new C6653a();
    }
}
