package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteProgram;
import android.arch.persistence.db.SupportSQLiteQuery;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.persistence.room.h */
public class C2717h implements SupportSQLiteProgram, SupportSQLiteQuery {
    @VisibleForTesting
    /* renamed from: g */
    static final TreeMap<Integer, C2717h> f8572g = new TreeMap();
    @VisibleForTesting
    /* renamed from: a */
    final long[] f8573a;
    @VisibleForTesting
    /* renamed from: b */
    final double[] f8574b;
    @VisibleForTesting
    /* renamed from: c */
    final String[] f8575c;
    @VisibleForTesting
    /* renamed from: d */
    final byte[][] f8576d;
    @VisibleForTesting
    /* renamed from: e */
    final int f8577e;
    @VisibleForTesting
    /* renamed from: f */
    int f8578f;
    /* renamed from: h */
    private volatile String f8579h;
    /* renamed from: i */
    private final int[] f8580i;

    public void close() throws Exception {
    }

    /* renamed from: a */
    public static C2717h m10562a(String str, int i) {
        synchronized (f8572g) {
            Entry ceilingEntry = f8572g.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                f8572g.remove(ceilingEntry.getKey());
                C2717h c2717h = (C2717h) ceilingEntry.getValue();
                c2717h.m10565b(str, i);
                return c2717h;
            }
            C2717h c2717h2 = new C2717h(i);
            c2717h2.m10565b(str, i);
            return c2717h2;
        }
    }

    private C2717h(int i) {
        this.f8577e = i;
        i++;
        this.f8580i = new int[i];
        this.f8573a = new long[i];
        this.f8574b = new double[i];
        this.f8575c = new String[i];
        this.f8576d = new byte[i][];
    }

    /* renamed from: b */
    void m10565b(String str, int i) {
        this.f8579h = str;
        this.f8578f = i;
    }

    /* renamed from: a */
    public void m10564a() {
        synchronized (f8572g) {
            f8572g.put(Integer.valueOf(this.f8577e), this);
            C2717h.m10563b();
        }
    }

    /* renamed from: b */
    private static void m10563b() {
        if (f8572g.size() > 15) {
            int size = f8572g.size() - 10;
            Iterator it = f8572g.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public String getSql() {
        return this.f8579h;
    }

    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        for (int i = 1; i <= this.f8578f; i++) {
            switch (this.f8580i[i]) {
                case 1:
                    supportSQLiteProgram.bindNull(i);
                    break;
                case 2:
                    supportSQLiteProgram.bindLong(i, this.f8573a[i]);
                    break;
                case 3:
                    supportSQLiteProgram.bindDouble(i, this.f8574b[i]);
                    break;
                case 4:
                    supportSQLiteProgram.bindString(i, this.f8575c[i]);
                    break;
                case 5:
                    supportSQLiteProgram.bindBlob(i, this.f8576d[i]);
                    break;
                default:
                    break;
            }
        }
    }

    public void bindNull(int i) {
        this.f8580i[i] = 1;
    }

    public void bindLong(int i, long j) {
        this.f8580i[i] = 2;
        this.f8573a[i] = j;
    }

    public void bindDouble(int i, double d) {
        this.f8580i[i] = 3;
        this.f8574b[i] = d;
    }

    public void bindString(int i, String str) {
        this.f8580i[i] = 4;
        this.f8575c[i] = str;
    }

    public void bindBlob(int i, byte[] bArr) {
        this.f8580i[i] = 5;
        this.f8576d[i] = bArr;
    }

    public void clearBindings() {
        Arrays.fill(this.f8580i, 1);
        Arrays.fill(this.f8575c, null);
        Arrays.fill(this.f8576d, null);
        this.f8579h = null;
    }
}
