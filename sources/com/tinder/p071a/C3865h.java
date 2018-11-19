package com.tinder.p071a;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.annotation.NonNull;
import com.tinder.api.ManagerWebServices;
import com.tinder.enums.SqlDataType;
import com.tinder.model.Session;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.tinder.a.h */
public class C3865h extends C2600a {
    /* renamed from: a */
    private C2601b[] f12116a = new C2601b[]{new C2601b(this.f12118c, SqlDataType.DATETIME, true), new C2601b(this.f12119d, SqlDataType.TEXT, false)};
    /* renamed from: b */
    private String f12117b = "SESSIONS";
    /* renamed from: c */
    private String f12118c = ManagerWebServices.PARAM_DATE;
    /* renamed from: d */
    private String f12119d = "version";
    /* renamed from: e */
    private SimpleDateFormat f12120e = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    /* renamed from: e */
    public int m14593e() {
        Throwable th;
        Cursor cursor = null;
        try {
            int count;
            Cursor b = C2603i.m9766b().m9776b(this.f12117b);
            if (b != null) {
                try {
                    count = b.getCount();
                } catch (Throwable th2) {
                    Cursor cursor2 = b;
                    th = th2;
                    cursor = cursor2;
                    m9749a(cursor);
                    throw th;
                }
            }
            count = 0;
            m9749a(b);
            return count;
        } catch (Throwable th3) {
            th = th3;
            m9749a(cursor);
            throw th;
        }
    }

    /* renamed from: f */
    public void m14594f() {
        Session create = Session.create();
        String format = this.f12120e.format(Long.valueOf(create.openDateTime));
        String str = create.appVersion;
        ContentValues contentValues = new ContentValues();
        contentValues.put(this.f12118c, format);
        contentValues.put(this.f12119d, str);
        C2603i.m9766b().m9773a(this.f12117b, contentValues);
    }

    @NonNull
    /* renamed from: b */
    protected C2601b[] mo2628b() {
        return this.f12116a;
    }

    @NonNull
    /* renamed from: c */
    protected String mo2629c() {
        return this.f12117b;
    }
}
