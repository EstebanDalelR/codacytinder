package com.tinder.addy.persistence.room;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.C0091e;
import android.arch.persistence.room.C2715b;
import android.arch.persistence.room.C2717h;
import android.arch.persistence.room.p006b.C0075a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tinder.addy.persistence.room.a */
public class C7297a implements PingDao {
    /* renamed from: a */
    private final C0091e f26402a;
    /* renamed from: b */
    private final C2715b f26403b;

    public C7297a(C0091e c0091e) {
        this.f26402a = c0091e;
        this.f26403b = new C2715b<C6186c>(this, c0091e) {
            /* renamed from: a */
            final /* synthetic */ C7297a f28581a;

            /* renamed from: a */
            public String m33846a() {
                return "INSERT OR ABORT INTO `ping`(`adId`,`url`,`pingTimeMs`,`ping_id`) VALUES (?,?,?,?)";
            }

            /* renamed from: a */
            public void m33847a(SupportSQLiteStatement supportSQLiteStatement, C6186c c6186c) {
                if (c6186c.m26791a() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, c6186c.m26791a());
                }
                if (c6186c.m26792b() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, c6186c.m26792b());
                }
                supportSQLiteStatement.bindLong(3, c6186c.m26793c());
                if (c6186c.m26794d() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindLong(4, c6186c.m26794d().longValue());
                }
            }
        };
    }

    public void insert(C6186c c6186c) {
        this.f26402a.f();
        try {
            this.f26403b.a(c6186c);
            this.f26402a.h();
        } finally {
            this.f26402a.g();
        }
    }

    public List<C6186c> loadPingsForTrackingUrl(String str, String str2) {
        Object a = C2717h.a("SELECT * FROM ping WHERE adId = ? AND url = ?", 2);
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
        str = this.f26402a.a(a);
        try {
            str2 = str.getColumnIndexOrThrow("adId");
            int columnIndexOrThrow = str.getColumnIndexOrThrow("url");
            int columnIndexOrThrow2 = str.getColumnIndexOrThrow("pingTimeMs");
            int columnIndexOrThrow3 = str.getColumnIndexOrThrow("ping_id");
            List<C6186c> arrayList = new ArrayList(str.getCount());
            while (str.moveToNext()) {
                Long l;
                String string = str.getString(str2);
                String string2 = str.getString(columnIndexOrThrow);
                long j = str.getLong(columnIndexOrThrow2);
                if (str.isNull(columnIndexOrThrow3)) {
                    l = null;
                } else {
                    l = Long.valueOf(str.getLong(columnIndexOrThrow3));
                }
                arrayList.add(new C6186c(string, string2, j, l));
            }
            return arrayList;
        } finally {
            str.close();
            a.a();
        }
    }

    public List<C6186c> loadLastPingForTrackingUrls(String[] strArr, String[] strArr2) {
        String string;
        int columnIndexOrThrow;
        StringBuilder a = C0075a.a();
        a.append("SELECT DISTINCT * FROM ping WHERE adId IN(");
        int length = strArr.length;
        C0075a.a(a, length);
        a.append(") AND url IN(");
        int length2 = strArr2.length;
        C0075a.a(a, length2);
        a.append(")");
        Object a2 = C2717h.a(a.toString(), (length + 0) + length2);
        List<C6186c> list = true;
        int i = 1;
        for (String string2 : strArr) {
            if (string2 == null) {
                a2.bindNull(i);
            } else {
                a2.bindString(i, string2);
            }
            i++;
        }
        length++;
        for (String str : strArr2) {
            if (str == null) {
                a2.bindNull(length);
            } else {
                a2.bindString(length, str);
            }
            length++;
        }
        strArr = this.f26402a.a(a2);
        try {
            strArr2 = strArr.getColumnIndexOrThrow("adId");
            length = strArr.getColumnIndexOrThrow("url");
            length2 = strArr.getColumnIndexOrThrow("pingTimeMs");
            columnIndexOrThrow = strArr.getColumnIndexOrThrow("ping_id");
            list = new ArrayList(strArr.getCount());
            while (strArr.moveToNext()) {
                Long l;
                string2 = strArr.getString(strArr2);
                String string3 = strArr.getString(length);
                long j = strArr.getLong(length2);
                if (strArr.isNull(columnIndexOrThrow)) {
                    l = null;
                } else {
                    l = Long.valueOf(strArr.getLong(columnIndexOrThrow));
                }
                list.add(new C6186c(string2, string3, j, l));
            }
            return list;
        } finally {
            strArr.close();
            a2.a();
        }
    }
}
