package com.tinder.addy.persistence.room;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.C0091e;
import android.arch.persistence.room.C2715b;
import android.arch.persistence.room.C2717h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tinder.addy.persistence.room.e */
public class C7299e implements TrackingUrlDao {
    /* renamed from: a */
    private final C0091e f26405a;
    /* renamed from: b */
    private final C2715b f26406b;

    public C7299e(C0091e c0091e) {
        this.f26405a = c0091e;
        this.f26406b = new C2715b<C6187d>(this, c0091e) {
            /* renamed from: a */
            final /* synthetic */ C7299e f28583a;

            /* renamed from: a */
            public String m33850a() {
                return "INSERT OR REPLACE INTO `tracking_url`(`adId`,`url`,`key`,`eventTypeToken`) VALUES (?,?,?,?)";
            }

            /* renamed from: a */
            public void m33851a(SupportSQLiteStatement supportSQLiteStatement, C6187d c6187d) {
                if (c6187d.m26795a() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, c6187d.m26795a());
                }
                if (c6187d.m26796b() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, c6187d.m26796b());
                }
                if (c6187d.m26797c() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, c6187d.m26797c());
                }
                if (c6187d.m26798d() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, c6187d.m26798d());
                }
            }
        };
    }

    public void insertAll(List<C6187d> list) {
        this.f26405a.f();
        try {
            this.f26406b.a(list);
            this.f26405a.h();
        } finally {
            this.f26405a.g();
        }
    }

    public List<C6187d> loadTrackingUrlsByAdAndEvent(String str, String str2) {
        Object a = C2717h.a("SELECT * FROM tracking_url WHERE adId = ? AND eventTypeToken = ?", 2);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        if (str2 == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str2);
        }
        str = this.f26405a.a(a);
        try {
            str2 = str.getColumnIndexOrThrow("adId");
            int columnIndexOrThrow = str.getColumnIndexOrThrow("url");
            int columnIndexOrThrow2 = str.getColumnIndexOrThrow("key");
            int columnIndexOrThrow3 = str.getColumnIndexOrThrow("eventTypeToken");
            List<C6187d> arrayList = new ArrayList(str.getCount());
            while (str.moveToNext()) {
                arrayList.add(new C6187d(str.getString(str2), str.getString(columnIndexOrThrow), str.getString(columnIndexOrThrow2), str.getString(columnIndexOrThrow3)));
            }
            return arrayList;
        } finally {
            str.close();
            a.a();
        }
    }
}
