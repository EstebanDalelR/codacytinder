package com.tinder.p071a;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.enums.SqlDataType;
import com.tinder.model.ProcessedPhoto;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tinder.a.g */
public class C3864g extends C2600a {
    /* renamed from: a */
    private C2601b[] f12115a = new C2601b[]{new C2601b("id", SqlDataType.TEXT, false), new C2601b("position", SqlDataType.INTEGER, false), new C2601b("image_url", SqlDataType.TEXT, false), new C2601b("height", SqlDataType.INTEGER, false), new C2601b("width", SqlDataType.INTEGER, false), new C2601b("unique_id", SqlDataType.TEXT, true)};

    @NonNull
    /* renamed from: c */
    protected String mo2629c() {
        return "photos_processed";
    }

    @NonNull
    /* renamed from: a */
    public static ContentValues m14584a(@NonNull ProcessedPhoto processedPhoto) {
        ContentValues contentValues = new ContentValues(6);
        contentValues.put("id", processedPhoto.photoId);
        contentValues.put("image_url", processedPhoto.imageUrl);
        contentValues.put("height", Integer.valueOf(processedPhoto.height));
        contentValues.put("width", Integer.valueOf(processedPhoto.width));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(processedPhoto.photoId);
        stringBuilder.append(processedPhoto.width);
        contentValues.put("unique_id", stringBuilder.toString());
        return contentValues;
    }

    @NonNull
    /* renamed from: b */
    protected C2601b[] mo2628b() {
        return this.f12115a;
    }

    /* renamed from: b */
    public boolean m14588b(@NonNull ProcessedPhoto processedPhoto) {
        return C2603i.m9766b().m9773a("photos_processed", C3864g.m14584a(processedPhoto));
    }

    /* renamed from: a */
    public void m14585a(String str) {
        C2603i.m9766b().m9768a("photos_processed", "id", str);
    }

    /* renamed from: a */
    public boolean m14586a(@NonNull List<ProcessedPhoto> list, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("photoId=");
        stringBuilder.append(str);
        ad.m10190a(stringBuilder.toString());
        while (true) {
            boolean z = true;
            for (ProcessedPhoto processedPhoto : list) {
                if (!z || !m14588b(processedPhoto)) {
                    z = false;
                }
            }
            return z;
        }
    }

    @Nullable
    /* renamed from: b */
    public ArrayList<ProcessedPhoto> m14587b(@Nullable String str) {
        Throwable e;
        Cursor cursor = null;
        try {
            String[] strArr = new String[]{"*"};
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("id='");
            stringBuilder.append(str);
            stringBuilder.append('\'');
            Cursor query = C2603i.m9766b().m9777c().query("photos_processed", strArr, stringBuilder.toString(), null, null, null, null);
            try {
                ArrayList arrayList = new ArrayList(query.getCount());
                if (str == null || query.getCount() <= null) {
                    ad.m10190a("photoId null or nothing in DB, not returning any processed photos");
                } else {
                    query.moveToFirst();
                    while (query.isAfterLast() == null) {
                        str = query.getString(2);
                        int i = query.getInt(4);
                        int i2 = query.getInt(3);
                        query.moveToNext();
                        arrayList.add(new ProcessedPhoto(str, i, i2));
                    }
                }
                if (query != null && query.isClosed() == null) {
                    query.close();
                }
                return arrayList;
            } catch (Exception e2) {
                e = e2;
                cursor = query;
                try {
                    ad.m10193a("Failed to load photos for a user", e);
                    str = new ArrayList(0);
                    return cursor == null ? str : str;
                } catch (Throwable th) {
                    str = th;
                    cursor.close();
                    throw str;
                }
            } catch (Throwable th2) {
                str = th2;
                cursor = query;
                if (!(cursor == null || cursor.isClosed())) {
                    cursor.close();
                }
                throw str;
            }
        } catch (Exception e3) {
            e = e3;
            ad.m10193a("Failed to load photos for a user", e);
            str = new ArrayList(0);
            if (cursor == null && !cursor.isClosed()) {
                cursor.close();
                return str;
            }
        }
    }
}
