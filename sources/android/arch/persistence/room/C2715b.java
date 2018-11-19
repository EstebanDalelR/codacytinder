package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.persistence.room.b */
public abstract class C2715b<T> extends C0094i {
    /* renamed from: a */
    protected abstract void m10551a(SupportSQLiteStatement supportSQLiteStatement, T t);

    public C2715b(C0091e c0091e) {
        super(c0091e);
    }

    /* renamed from: a */
    public final void m10553a(T t) {
        SupportSQLiteStatement c = m309c();
        try {
            m10551a(c, t);
            c.executeInsert();
        } finally {
            m307a(c);
        }
    }

    /* renamed from: a */
    public final void m10552a(Iterable<T> iterable) {
        SupportSQLiteStatement c = m309c();
        try {
            for (T a : iterable) {
                m10551a(c, a);
                c.executeInsert();
            }
        } finally {
            m307a(c);
        }
    }
}
