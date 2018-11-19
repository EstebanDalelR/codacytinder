package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.persistence.room.i */
public abstract class C0094i {
    /* renamed from: a */
    private final AtomicBoolean f251a = new AtomicBoolean(false);
    /* renamed from: b */
    private final C0091e f252b;
    /* renamed from: c */
    private volatile SupportSQLiteStatement f253c;

    /* renamed from: a */
    protected abstract String m306a();

    public C0094i(C0091e c0091e) {
        this.f252b = c0091e;
    }

    /* renamed from: b */
    protected void m308b() {
        this.f252b.m293e();
    }

    /* renamed from: d */
    private SupportSQLiteStatement m305d() {
        return this.f252b.m283a(m306a());
    }

    /* renamed from: a */
    private SupportSQLiteStatement m304a(boolean z) {
        if (!z) {
            return m305d();
        }
        if (!this.f253c) {
            this.f253c = m305d();
        }
        return this.f253c;
    }

    /* renamed from: c */
    public SupportSQLiteStatement m309c() {
        m308b();
        return m304a(this.f251a.compareAndSet(false, true));
    }

    /* renamed from: a */
    public void m307a(SupportSQLiteStatement supportSQLiteStatement) {
        if (supportSQLiteStatement == this.f253c) {
            this.f251a.set(false);
        }
    }
}
