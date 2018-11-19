package com.google.android.exoplayer2.upstream.cache;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import com.google.android.exoplayer2.util.C2289a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.TreeSet;

/* renamed from: com.google.android.exoplayer2.upstream.cache.c */
final class C2282c {
    /* renamed from: a */
    public final int f6857a;
    /* renamed from: b */
    public final String f6858b;
    /* renamed from: c */
    private final TreeSet<C3720j> f6859c = new TreeSet();
    /* renamed from: d */
    private C3718g f6860d = C3718g.f11715a;
    /* renamed from: e */
    private boolean f6861e;

    /* renamed from: a */
    public static C2282c m8255a(int i, DataInputStream dataInputStream) throws IOException {
        C2282c c2282c = new C2282c(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            C2285f c2285f = new C2285f();
            C2284e.m8289a(c2285f, readLong);
            c2282c.m8264a(c2285f);
        } else {
            c2282c.f6860d = C3718g.m14109a(dataInputStream);
        }
        return c2282c;
    }

    public C2282c(int i, String str) {
        this.f6857a = i;
        this.f6858b = str;
    }

    /* renamed from: a */
    public void m8261a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.f6857a);
        dataOutputStream.writeUTF(this.f6858b);
        this.f6860d.m14116a(dataOutputStream);
    }

    /* renamed from: a */
    public ContentMetadata m8258a() {
        return this.f6860d;
    }

    /* renamed from: a */
    public boolean m8264a(C2285f c2285f) {
        C3718g c3718g = this.f6860d;
        this.f6860d = this.f6860d.m14115a(c2285f);
        return this.f6860d.equals(c3718g) ^ 1;
    }

    /* renamed from: b */
    public boolean m8266b() {
        return this.f6861e;
    }

    /* renamed from: a */
    public void m8262a(boolean z) {
        this.f6861e = z;
    }

    /* renamed from: a */
    public void m8260a(C3720j c3720j) {
        this.f6859c.add(c3720j);
    }

    /* renamed from: c */
    public TreeSet<C3720j> m8267c() {
        return this.f6859c;
    }

    /* renamed from: a */
    public C3720j m8259a(long j) {
        C3720j a = C3720j.m14132a(this.f6858b, j);
        C3720j c3720j = (C3720j) this.f6859c.floor(a);
        if (c3720j != null && c3720j.b + c3720j.c > j) {
            return c3720j;
        }
        a = (C3720j) this.f6859c.ceiling(a);
        if (a == null) {
            j = C3720j.m14135b(this.f6858b, j);
        } else {
            j = C3720j.m14133a(this.f6858b, j, a.b - j);
        }
        return j;
    }

    /* renamed from: a */
    public long m8257a(long j, long j2) {
        long j3 = j2;
        C3720j a = m8259a(j);
        if (a.m8252b()) {
            return -Math.min(a.m8251a() ? Format.OFFSET_SAMPLE_RELATIVE : a.c, j3);
        }
        long j4 = j + j3;
        long j5 = a.b + a.c;
        if (j5 < j4) {
            for (C3720j c3720j : this.f6859c.tailSet(a, false)) {
                if (c3720j.b > j5) {
                    break;
                }
                j5 = Math.max(j5, c3720j.b + c3720j.c);
                if (j5 >= j4) {
                    break;
                }
                C2282c c2282c = this;
            }
        }
        return Math.min(j5 - j, j3);
    }

    /* renamed from: b */
    public C3720j m8265b(C3720j c3720j) throws CacheException {
        C2289a.m8313b(this.f6859c.remove(c3720j));
        C3720j a = c3720j.m14137a(this.f6857a);
        if (c3720j.e.renameTo(a.e)) {
            this.f6859c.add(a);
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Renaming of ");
        stringBuilder.append(c3720j.e);
        stringBuilder.append(" to ");
        stringBuilder.append(a.e);
        stringBuilder.append(" failed.");
        throw new CacheException(stringBuilder.toString());
    }

    /* renamed from: d */
    public boolean m8268d() {
        return this.f6859c.isEmpty();
    }

    /* renamed from: a */
    public boolean m8263a(C2280a c2280a) {
        if (!this.f6859c.remove(c2280a)) {
            return null;
        }
        c2280a.f6855e.delete();
        return true;
    }

    /* renamed from: a */
    public int m8256a(int i) {
        int hashCode = (this.f6857a * 31) + this.f6858b.hashCode();
        if (i >= 2) {
            return (hashCode * 31) + this.f6860d.hashCode();
        }
        long a = C2284e.m8287a(this.f6860d);
        return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
    }

    public int hashCode() {
        return (m8256a((int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) * 31) + this.f6859c.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2282c c2282c = (C2282c) obj;
                if (this.f6857a != c2282c.f6857a || !this.f6858b.equals(c2282c.f6858b) || !this.f6859c.equals(c2282c.f6859c) || this.f6860d.equals(c2282c.f6860d) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }
}
