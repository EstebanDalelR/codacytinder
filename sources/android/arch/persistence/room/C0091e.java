package android.arch.persistence.room;

import android.arch.core.p002a.C2673a;
import android.arch.persistence.db.C2714a;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Factory;
import android.arch.persistence.db.SupportSQLiteQuery;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.db.p004a.C2712c;
import android.arch.persistence.room.p005a.C0073a;
import android.content.Context;
import android.database.Cursor;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.util.C0563n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: android.arch.persistence.room.e */
public abstract class C0091e {
    /* renamed from: a */
    protected volatile SupportSQLiteDatabase f244a;
    @Nullable
    /* renamed from: b */
    protected List<C0089b> f245b;
    /* renamed from: c */
    private SupportSQLiteOpenHelper f246c;
    /* renamed from: d */
    private final C0086c f247d = m291c();
    /* renamed from: e */
    private boolean f248e;
    /* renamed from: f */
    private final ReentrantLock f249f = new ReentrantLock();

    /* renamed from: android.arch.persistence.room.e$a */
    public static class C0088a<T extends C0091e> {
        /* renamed from: a */
        private final Class<T> f235a;
        /* renamed from: b */
        private final String f236b;
        /* renamed from: c */
        private final Context f237c;
        /* renamed from: d */
        private ArrayList<C0089b> f238d;
        /* renamed from: e */
        private Factory f239e;
        /* renamed from: f */
        private boolean f240f;
        /* renamed from: g */
        private boolean f241g = true;
        /* renamed from: h */
        private C0090c f242h = new C0090c();

        C0088a(@NonNull Context context, @NonNull Class<T> cls, @Nullable String str) {
            this.f237c = context;
            this.f235a = cls;
            this.f236b = str;
        }

        @NonNull
        /* renamed from: a */
        public C0088a<T> m277a() {
            this.f240f = true;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public T m278b() {
            if (this.f237c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f235a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            } else {
                if (this.f239e == null) {
                    this.f239e = new C2712c();
                }
                C0074a c0074a = new C0074a(this.f237c, this.f236b, this.f239e, this.f242h, this.f238d, this.f240f, this.f241g);
                C0091e c0091e = (C0091e) C0087d.m276a(this.f235a, "_Impl");
                c0091e.m288a(c0074a);
                return c0091e;
            }
        }
    }

    /* renamed from: android.arch.persistence.room.e$b */
    public static abstract class C0089b {
        /* renamed from: a */
        public void m279a(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* renamed from: b */
        public void m280b(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    /* renamed from: android.arch.persistence.room.e$c */
    public static class C0090c {
        /* renamed from: a */
        private C0563n<C0563n<C0073a>> f243a = new C0563n();

        @Nullable
        /* renamed from: a */
        public List<C0073a> m282a(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return m281a(new ArrayList(), i2 > i, i, i2);
        }

        /* renamed from: a */
        private List<C0073a> m281a(List<C0073a> list, boolean z, int i, int i2) {
            int i3 = z ? -1 : 1;
            Object obj;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                C0563n c0563n = (C0563n) this.f243a.m2080a(i);
                if (c0563n != null) {
                    int i4;
                    int b = c0563n.m2082b();
                    obj = null;
                    if (z) {
                        b--;
                        i4 = -1;
                    } else {
                        i4 = b;
                        b = 0;
                    }
                    while (b != i4) {
                        int d = c0563n.m2088d(b);
                        if (d <= i2 && d > i) {
                            list.add(c0563n.m2089e(b));
                            i = d;
                            obj = 1;
                            continue;
                            break;
                        }
                        b += i3;
                    }
                } else {
                    return null;
                }
            } while (obj != null);
            return null;
        }
    }

    /* renamed from: b */
    protected abstract SupportSQLiteOpenHelper m290b(C0074a c0074a);

    /* renamed from: c */
    protected abstract C0086c m291c();

    /* renamed from: a */
    Lock m286a() {
        return this.f249f;
    }

    @CallSuper
    /* renamed from: a */
    public void m288a(C0074a c0074a) {
        this.f246c = m290b(c0074a);
        this.f245b = c0074a.f185e;
        this.f248e = c0074a.f186f;
    }

    /* renamed from: b */
    public SupportSQLiteOpenHelper m289b() {
        return this.f246c;
    }

    /* renamed from: d */
    public boolean m292d() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.f244a;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public void m293e() {
        if (!this.f248e && C2673a.m10423a().mo17d()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: a */
    public Cursor m285a(String str, @Nullable Object[] objArr) {
        return this.f246c.getWritableDatabase().query(new C2714a(str, objArr));
    }

    /* renamed from: a */
    public Cursor m284a(SupportSQLiteQuery supportSQLiteQuery) {
        m293e();
        return this.f246c.getWritableDatabase().query(supportSQLiteQuery);
    }

    /* renamed from: a */
    public SupportSQLiteStatement m283a(String str) {
        m293e();
        return this.f246c.getWritableDatabase().compileStatement(str);
    }

    /* renamed from: f */
    public void m294f() {
        m293e();
        this.f247d.m273b();
        this.f246c.getWritableDatabase().beginTransaction();
    }

    /* renamed from: g */
    public void m295g() {
        this.f246c.getWritableDatabase().endTransaction();
        if (!m297i()) {
            this.f247d.m271a();
        }
    }

    /* renamed from: h */
    public void m296h() {
        this.f246c.getWritableDatabase().setTransactionSuccessful();
    }

    /* renamed from: a */
    protected void m287a(SupportSQLiteDatabase supportSQLiteDatabase) {
        this.f247d.m272a(supportSQLiteDatabase);
    }

    /* renamed from: i */
    public boolean m297i() {
        return this.f246c.getWritableDatabase().inTransaction();
    }
}
