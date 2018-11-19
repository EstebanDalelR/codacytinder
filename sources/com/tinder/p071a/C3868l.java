package com.tinder.p071a;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.enums.SqlDataType;
import com.tinder.model.ProfilePhoto;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tinder.a.l */
public class C3868l extends C2600a {
    @NonNull
    /* renamed from: a */
    private final C3864g f12123a = new C3864g();
    /* renamed from: b */
    private C2601b[] f12124b = new C2601b[]{new C2601b("id", SqlDataType.TEXT, true), new C2601b("user_id", SqlDataType.TEXT, true), new C2601b("image_url", SqlDataType.TEXT, false), new C2601b("photo_order", SqlDataType.INTEGER, false)};

    @NonNull
    /* renamed from: c */
    protected String mo2629c() {
        return "photos";
    }

    @NonNull
    /* renamed from: a */
    public static ContentValues m14597a(@NonNull ProfilePhoto profilePhoto, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", profilePhoto.getPhotoId());
        contentValues.put("user_id", str);
        contentValues.put("image_url", profilePhoto.imageUrl);
        contentValues.put("photo_order", Integer.valueOf(i));
        return contentValues;
    }

    @NonNull
    /* renamed from: b */
    protected C2601b[] mo2628b() {
        return this.f12124b;
    }

    /* renamed from: b */
    public boolean m14601b(@NonNull ProfilePhoto profilePhoto, String str, int i) {
        str = C2603i.m9766b().m9773a("photos", C3868l.m14597a(profilePhoto, str, i));
        if (profilePhoto.processedPhotos != 0) {
            return (str == null || this.f12123a.m14586a(profilePhoto.processedPhotos, profilePhoto.getPhotoId()) == null) ? null : true;
        } else {
            return str;
        }
    }

    /* renamed from: a */
    public boolean m14599a(@NonNull List<ProfilePhoto> list, String str) {
        boolean z = true;
        for (int i = 0; i < list.size(); i++) {
            z = z && m14601b((ProfilePhoto) list.get(i), str, i);
        }
        return z;
    }

    /* renamed from: a */
    public void m14598a(String str) {
        for (ProfilePhoto photoId : m14600b(str)) {
            this.f12123a.m14585a(photoId.getPhotoId());
        }
        C2603i.m9766b().m9768a("photos", "user_id", str);
    }

    @NonNull
    /* renamed from: b */
    public ArrayList<ProfilePhoto> m14600b(@Nullable String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("userId=");
        stringBuilder.append(str);
        ad.m10190a(stringBuilder.toString());
        Cursor query;
        try {
            String[] strArr = new String[]{"*"};
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("user_id='");
            stringBuilder2.append(str);
            stringBuilder2.append('\'');
            query = C2603i.m9766b().m9777c().query("photos", strArr, stringBuilder2.toString(), null, null, null, "photo_order");
            try {
                ArrayList<ProfilePhoto> arrayList = new ArrayList(query.getCount());
                if (str != null && query.getCount() > null) {
                    query.moveToFirst();
                    while (query.isAfterLast() == null) {
                        str = query.getString(query.getColumnIndex("id"));
                        String string = query.getString(query.getColumnIndex("image_url"));
                        query.moveToNext();
                        arrayList.add(new ProfilePhoto(string, str, this.f12123a.m14587b(str)));
                    }
                }
                if (query != null && query.isClosed() == null) {
                    query.close();
                }
                return arrayList;
            } catch (Throwable th) {
                str = th;
                query.close();
                throw str;
            }
        } catch (Throwable th2) {
            str = th2;
            query = null;
            if (!(query == null || query.isClosed())) {
                query.close();
            }
            throw str;
        }
    }

    @NonNull
    /* renamed from: d */
    public String mo2630d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mTableName=");
        stringBuilder.append(mo2629c());
        ad.m10190a(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("CREATE TABLE IF NOT EXISTS ");
        stringBuilder.append(mo2629c());
        stringBuilder.append('(');
        r1 = new C2601b[4];
        int i = 0;
        r1[0] = new C2601b("id", SqlDataType.TEXT, false);
        r1[1] = new C2601b("user_id", SqlDataType.TEXT, false);
        r1[2] = new C2601b("image_url", SqlDataType.TEXT, false);
        r1[3] = new C2601b("photo_order", SqlDataType.INTEGER, false);
        while (i < r1.length) {
            C2601b c2601b = r1[i];
            stringBuilder.append(c2601b.m9754a());
            stringBuilder.append(' ');
            stringBuilder.append(c2601b.m9755b());
            stringBuilder.append(", ");
            i++;
        }
        stringBuilder.append("PRIMARY KEY (id, user_id)");
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
