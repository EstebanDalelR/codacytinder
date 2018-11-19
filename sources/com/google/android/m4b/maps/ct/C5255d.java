package com.google.android.m4b.maps.ct;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: com.google.android.m4b.maps.ct.d */
public abstract class C5255d implements Serializable, Iterable<Byte> {
    /* renamed from: a */
    public static final C5255d f19541a = new C6654p(new byte[0]);

    /* renamed from: com.google.android.m4b.maps.ct.d$a */
    public interface C5253a extends Iterator<Byte> {
        /* renamed from: a */
        byte mo5378a();
    }

    /* renamed from: com.google.android.m4b.maps.ct.d$b */
    static final class C5254b {
        /* renamed from: a */
        private final C5259f f19539a;
        /* renamed from: b */
        private final byte[] f19540b;

        private C5254b(int i) {
            this.f19540b = new byte[i];
            this.f19539a = C5259f.m23321a(this.f19540b);
        }

        /* renamed from: a */
        public final C5255d m23265a() {
            this.f19539a.m23367h();
            return new C6654p(this.f19540b);
        }

        /* renamed from: b */
        public final C5259f m23266b() {
            return this.f19539a;
        }
    }

    /* renamed from: a */
    protected abstract int mo5379a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract C5253a mo5380a();

    /* renamed from: b */
    public abstract int mo5381b();

    /* renamed from: b */
    protected abstract void mo5382b(byte[] bArr, int i, int i2, int i3);

    /* renamed from: d */
    public abstract C5257e mo5383d();

    /* renamed from: e */
    protected abstract int mo5384e();

    /* renamed from: f */
    protected abstract boolean mo5385f();

    /* renamed from: g */
    protected abstract int mo5386g();

    public /* synthetic */ Iterator iterator() {
        return mo5380a();
    }

    C5255d() {
    }

    /* renamed from: a */
    public static C5255d m23268a(byte[] bArr, int i, int i2) {
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        return new C6654p(obj);
    }

    /* renamed from: a */
    public final void m23271a(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            i2 = new StringBuilder(30);
            i2.append("Source offset < 0: ");
            i2.append(i);
            throw new IndexOutOfBoundsException(i2.toString());
        } else if (i2 < 0) {
            i = new StringBuilder(30);
            i.append("Target offset < 0: ");
            i.append(i2);
            throw new IndexOutOfBoundsException(i.toString());
        } else if (i3 < 0) {
            i = new StringBuilder(23);
            i.append("Length < 0: ");
            i.append(i3);
            throw new IndexOutOfBoundsException(i.toString());
        } else {
            int i4 = i + i3;
            if (i4 > mo5381b()) {
                i = new StringBuilder(34);
                i.append("Source end offset < 0: ");
                i.append(i4);
                throw new IndexOutOfBoundsException(i.toString());
            }
            i4 = i2 + i3;
            if (i4 > bArr.length) {
                i = new StringBuilder(34);
                i.append("Target end offset < 0: ");
                i.append(i4);
                throw new IndexOutOfBoundsException(i.toString());
            } else if (i3 > 0) {
                mo5382b(bArr, i, i2, i3);
            }
        }
    }

    /* renamed from: c */
    public final byte[] m23274c() {
        int b = mo5381b();
        if (b == 0) {
            return C5273l.f19592b;
        }
        byte[] bArr = new byte[b];
        mo5382b(bArr, 0, 0, b);
        return bArr;
    }

    /* renamed from: a */
    static C5254b m23267a(int i) {
        return new C5254b(i);
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo5381b())});
    }
}
