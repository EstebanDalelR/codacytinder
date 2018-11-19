package com.tinder.p071a;

import android.content.ContentValues;
import android.support.annotation.NonNull;
import com.tinder.enums.SqlDataType;
import com.tinder.utils.ad;

/* renamed from: com.tinder.a.c */
public class C3862c extends C2600a {
    /* renamed from: a */
    private final String f12112a = "TS";
    /* renamed from: b */
    private C2601b[] f12113b = new C2601b[]{new C2601b("TS", SqlDataType.INTEGER, true)};

    @NonNull
    /* renamed from: c */
    protected String mo2629c() {
        return "CRASHES";
    }

    /* renamed from: a */
    public void m14574a(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("TS", Long.valueOf(j));
        C2603i.m9766b().m9773a("CRASHES", contentValues);
    }

    /* renamed from: a */
    public int m14573a(long j, long j2) {
        try {
            j2 = C2603i.m9766b().m9777c().rawQuery("SELECT * FROM CRASHES where TS BETWEEN ? AND ?", new String[]{String.valueOf(j), String.valueOf(j2)});
            try {
                int count = j2.getCount();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("count ");
                stringBuilder.append(count);
                stringBuilder.append(" between ");
                stringBuilder.append(j);
                stringBuilder.append(" and ");
                stringBuilder.append(r4);
                ad.m10190a(stringBuilder.toString());
                m9749a(j2);
                return count;
            } catch (Throwable th) {
                j = th;
                m9749a(j2);
                throw j;
            }
        } catch (Throwable th2) {
            j = th2;
            j2 = null;
            m9749a(j2);
            throw j;
        }
    }

    @NonNull
    /* renamed from: b */
    protected C2601b[] mo2628b() {
        return this.f12113b;
    }
}
