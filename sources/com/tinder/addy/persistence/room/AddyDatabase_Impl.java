package com.tinder.addy.persistence.room;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.C0068b;
import android.arch.persistence.room.C0074a;
import android.arch.persistence.room.C0086c;
import android.arch.persistence.room.C0091e.C0089b;
import android.arch.persistence.room.C2716g;
import android.arch.persistence.room.C2716g.C0093a;
import android.arch.persistence.room.p006b.C0080b;
import android.arch.persistence.room.p006b.C0080b.C0076a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AddyDatabase_Impl extends AddyDatabase {
    /* renamed from: c */
    private volatile PingDao f28579c;
    /* renamed from: d */
    private volatile TrackingUrlDao f28580d;

    /* renamed from: b */
    protected SupportSQLiteOpenHelper m33842b(C0074a c0074a) {
        return c0074a.f181a.create(C0068b.a(c0074a.f182b).a(c0074a.f183c).a(new C2716g(c0074a, new C0093a(this, 3) {
            /* renamed from: b */
            final /* synthetic */ AddyDatabase_Impl f26401b;

            /* renamed from: b */
            public void m31198b(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `tracking_url` (`adId` TEXT NOT NULL, `url` TEXT NOT NULL, `key` TEXT NOT NULL, `eventTypeToken` TEXT NOT NULL, PRIMARY KEY(`adId`, `key`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `ping` (`adId` TEXT NOT NULL, `url` TEXT NOT NULL, `pingTimeMs` INTEGER NOT NULL, `ping_id` INTEGER PRIMARY KEY AUTOINCREMENT)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"12f54281409f86bf7d1524c347c753ed\")");
            }

            /* renamed from: a */
            public void m31197a(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `tracking_url`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `ping`");
            }

            /* renamed from: d */
            protected void m31200d(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (this.f26401b.b != null) {
                    int size = this.f26401b.b.size();
                    for (int i = 0; i < size; i++) {
                        ((C0089b) this.f26401b.b.get(i)).a(supportSQLiteDatabase);
                    }
                }
            }

            /* renamed from: c */
            public void m31199c(SupportSQLiteDatabase supportSQLiteDatabase) {
                this.f26401b.a = supportSQLiteDatabase;
                this.f26401b.a(supportSQLiteDatabase);
                if (this.f26401b.b != null) {
                    int size = this.f26401b.b.size();
                    for (int i = 0; i < size; i++) {
                        ((C0089b) this.f26401b.b.get(i)).b(supportSQLiteDatabase);
                    }
                }
            }

            /* renamed from: e */
            protected void m31201e(SupportSQLiteDatabase supportSQLiteDatabase) {
                Map hashMap = new HashMap(4);
                hashMap.put("adId", new C0076a("adId", "TEXT", true, 1));
                hashMap.put("url", new C0076a("url", "TEXT", true, 0));
                hashMap.put("key", new C0076a("key", "TEXT", true, 2));
                hashMap.put("eventTypeToken", new C0076a("eventTypeToken", "TEXT", true, 0));
                C0080b c0080b = new C0080b("tracking_url", hashMap, new HashSet(0), new HashSet(0));
                C0080b a = C0080b.a(supportSQLiteDatabase, "tracking_url");
                if (c0080b.equals(a)) {
                    hashMap = new HashMap(4);
                    hashMap.put("adId", new C0076a("adId", "TEXT", true, 0));
                    hashMap.put("url", new C0076a("url", "TEXT", true, 0));
                    hashMap.put("pingTimeMs", new C0076a("pingTimeMs", "INTEGER", true, 0));
                    hashMap.put("ping_id", new C0076a("ping_id", "INTEGER", false, 1));
                    C0080b c0080b2 = new C0080b("ping", hashMap, new HashSet(0), new HashSet(0));
                    supportSQLiteDatabase = C0080b.a(supportSQLiteDatabase, "ping");
                    if (!c0080b2.equals(supportSQLiteDatabase)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Migration didn't properly handle ping(com.tinder.addy.persistence.room.RoomPing).\n Expected:\n");
                        stringBuilder.append(c0080b2);
                        stringBuilder.append("\n Found:\n");
                        stringBuilder.append(supportSQLiteDatabase);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    return;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Migration didn't properly handle tracking_url(com.tinder.addy.persistence.room.RoomTrackingUrl).\n Expected:\n");
                stringBuilder.append(c0080b);
                stringBuilder.append("\n Found:\n");
                stringBuilder.append(a);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }, "12f54281409f86bf7d1524c347c753ed")).a());
    }

    /* renamed from: c */
    protected C0086c m33843c() {
        return new C0086c(this, new String[]{"tracking_url", "ping"});
    }

    /* renamed from: j */
    public PingDao mo7415j() {
        if (this.f28579c != null) {
            return this.f28579c;
        }
        PingDao pingDao;
        synchronized (this) {
            if (this.f28579c == null) {
                this.f28579c = new C7297a(this);
            }
            pingDao = this.f28579c;
        }
        return pingDao;
    }

    /* renamed from: k */
    public TrackingUrlDao mo7416k() {
        if (this.f28580d != null) {
            return this.f28580d;
        }
        TrackingUrlDao trackingUrlDao;
        synchronized (this) {
            if (this.f28580d == null) {
                this.f28580d = new C7299e(this);
            }
            trackingUrlDao = this.f28580d;
        }
        return trackingUrlDao;
    }
}
