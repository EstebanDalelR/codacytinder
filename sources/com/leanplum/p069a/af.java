package com.leanplum.p069a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.leanplum.Leanplum;
import com.leanplum.utils.SharedPreferencesUtil;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.leanplum.a.af */
final class af extends SQLiteOpenHelper {
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    af(Context context) {
        super(context, "__leanplum.db", null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS event(data TEXT)");
        try {
            synchronized (aw.class) {
                SharedPreferences sharedPreferences = Leanplum.getContext().getSharedPreferences("__leanplum__", 0);
                Editor edit = sharedPreferences.edit();
                int i = sharedPreferences.getInt("__leanplum_unsynced", 0);
                if (i == 0) {
                    return;
                }
                List<Map> arrayList = new ArrayList();
                for (int i2 = 0; i2 < i; i2++) {
                    String format = String.format(Locale.US, "__leanplum_unsynced_%d", new Object[]{Integer.valueOf(i2)});
                    try {
                        arrayList.add(ab.m9453a(new JSONObject(sharedPreferences.getString(format, "{}"))));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    edit.remove(format);
                }
                edit.remove("__leanplum_unsynced");
                try {
                    Object string = sharedPreferences.getString("__leanplum_uuid", null);
                    if (string == null || i % aw.f7954a == 0) {
                        string = UUID.randomUUID().toString();
                        edit.putString("__leanplum_uuid", string);
                    }
                    for (Map map : arrayList) {
                        map.put("uuid", string);
                        ae.f7908i.put(ManagerWebServices.FB_DATA, ab.m9450a(map));
                        sQLiteDatabase.insert("event", null, ae.f7908i);
                        ae.f7908i.clear();
                    }
                    SharedPreferencesUtil.commitChanges(edit);
                } catch (Throwable th) {
                    ao.m9516a("Failed on migration data from shared preferences.", th);
                    bo.m9608a(th);
                }
            }
        } catch (Throwable th2) {
            ao.m9516a("Cannot move old data from shared preferences to SQLite table.", th2);
            bo.m9608a(th2);
        }
    }

    /* renamed from: a */
    private static void m9470a(SQLiteDatabase sQLiteDatabase) {
        synchronized (aw.class) {
            SharedPreferences sharedPreferences = Leanplum.getContext().getSharedPreferences("__leanplum__", 0);
            Editor edit = sharedPreferences.edit();
            int i = sharedPreferences.getInt("__leanplum_unsynced", 0);
            if (i == 0) {
                return;
            }
            List<Map> arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                String format = String.format(Locale.US, "__leanplum_unsynced_%d", new Object[]{Integer.valueOf(i2)});
                try {
                    arrayList.add(ab.m9453a(new JSONObject(sharedPreferences.getString(format, "{}"))));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                edit.remove(format);
            }
            edit.remove("__leanplum_unsynced");
            try {
                Object string = sharedPreferences.getString("__leanplum_uuid", null);
                if (string == null || i % aw.f7954a == 0) {
                    string = UUID.randomUUID().toString();
                    edit.putString("__leanplum_uuid", string);
                }
                for (Map map : arrayList) {
                    map.put("uuid", string);
                    ae.f7908i.put(ManagerWebServices.FB_DATA, ab.m9450a(map));
                    sQLiteDatabase.insert("event", null, ae.f7908i);
                    ae.f7908i.clear();
                }
                SharedPreferencesUtil.commitChanges(edit);
            } catch (Throwable th) {
                ao.m9516a("Failed on migration data from shared preferences.", th);
                bo.m9608a(th);
            }
        }
    }
}
