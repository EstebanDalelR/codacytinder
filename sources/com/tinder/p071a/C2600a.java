package com.tinder.p071a;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* renamed from: com.tinder.a.a */
public abstract class C2600a {
    @NonNull
    /* renamed from: b */
    protected abstract C2601b[] mo2628b();

    @NonNull
    /* renamed from: c */
    protected abstract String mo2629c();

    /* renamed from: a */
    public boolean m9750a() {
        return C2603i.m9766b().m9772a(mo2629c());
    }

    @NonNull
    /* renamed from: d */
    public String mo2630d() {
        return C2600a.m9748a(mo2629c(), mo2628b());
    }

    @NonNull
    /* renamed from: a */
    static String m9748a(@NonNull String str, @NonNull C2601b[] c2601bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CREATE TABLE IF NOT EXISTS ");
        stringBuilder.append(str);
        stringBuilder.append('(');
        for (str = null; str < c2601bArr.length; str++) {
            C2601b c2601b = c2601bArr[str];
            stringBuilder.append(c2601b.m9754a());
            stringBuilder.append(' ');
            stringBuilder.append(c2601b.m9755b());
            if (c2601b.m9756c()) {
                stringBuilder.append(" PRIMARY KEY");
            }
            if (c2601b.m9757d()) {
                stringBuilder.append(" AUTOINCREMENT");
            }
            if (str < c2601bArr.length - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    void m9749a(@Nullable Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
}
