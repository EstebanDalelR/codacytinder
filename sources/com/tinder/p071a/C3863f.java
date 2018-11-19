package com.tinder.p071a;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.annotation.NonNull;
import com.tinder.api.ManagerWebServices;
import com.tinder.enums.SqlDataType;
import com.tinder.passport.model.LocationName;
import com.tinder.passport.model.PassportLocation;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tinder.a.f */
public class C3863f extends C2600a {
    /* renamed from: a */
    private C2601b[] f12114a = new C2601b[]{new C2601b("id", SqlDataType.TEXT, true), new C2601b("latitude", SqlDataType.REAL, false), new C2601b("longitude", SqlDataType.REAL, false), new C2601b("state_province_long", SqlDataType.TEXT, false), new C2601b("state_province_short", SqlDataType.TEXT, false), new C2601b("country_short_name", SqlDataType.TEXT, false), new C2601b("country_long_name", SqlDataType.TEXT, false), new C2601b(ManagerWebServices.PARAM_COUNTRY, SqlDataType.TEXT, false), new C2601b("address", SqlDataType.TEXT, false), new C2601b(ManagerWebServices.PARAM_ROUTE, SqlDataType.TEXT, false), new C2601b(ManagerWebServices.PARAM_STREET_NUMBER, SqlDataType.TEXT, false), new C2601b("city", SqlDataType.TEXT, false), new C2601b("last_seen_date", SqlDataType.INTEGER, false)};

    @NonNull
    /* renamed from: c */
    protected String mo2629c() {
        return "tinder_locations";
    }

    @NonNull
    /* renamed from: b */
    private static ContentValues m14577b(@NonNull PassportLocation passportLocation) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", passportLocation.getId());
        contentValues.put("latitude", Double.valueOf(passportLocation.getLatitude()));
        contentValues.put("longitude", Double.valueOf(passportLocation.getLongitude()));
        contentValues.put("state_province_long", passportLocation.getStateProvinceLong());
        contentValues.put("state_province_short", passportLocation.getStateProvinceShort());
        contentValues.put("country_short_name", passportLocation.getCountryShort());
        contentValues.put("country_long_name", passportLocation.getCountryLong());
        contentValues.put(ManagerWebServices.PARAM_COUNTRY, passportLocation.getCounty());
        contentValues.put("address", passportLocation.getAddress());
        contentValues.put(ManagerWebServices.PARAM_ROUTE, passportLocation.getRoute());
        contentValues.put(ManagerWebServices.PARAM_STREET_NUMBER, passportLocation.getStreetNumber());
        contentValues.put("city", passportLocation.getCity());
        contentValues.put("last_seen_date", Long.valueOf(passportLocation.getLastSeenDate()));
        return contentValues;
    }

    @NonNull
    /* renamed from: e */
    public List<PassportLocation> m14583e() {
        Cursor a = C2603i.m9766b().m9769a("tinder_locations", "last_seen_date DESC");
        if (a == null) {
            return Collections.emptyList();
        }
        List<PassportLocation> arrayList = new ArrayList();
        while (a.moveToNext()) {
            try {
                arrayList.add(m14578b(a));
            } catch (Exception e) {
                ad.m10197c(e.getMessage());
            } catch (Throwable th) {
                m9749a(a);
            }
        }
        m9749a(a);
        return arrayList;
    }

    @NonNull
    /* renamed from: b */
    private PassportLocation m14578b(@NonNull Cursor cursor) {
        PassportLocation passportLocation = new PassportLocation();
        passportLocation.setLatitude(cursor.getDouble(cursor.getColumnIndex("latitude")));
        passportLocation.setLongitude(cursor.getDouble(cursor.getColumnIndex("longitude")));
        LocationName locationName = new LocationName();
        locationName.mLongName = cursor.getString(cursor.getColumnIndex("state_province_long"));
        locationName.mShortName = cursor.getString(cursor.getColumnIndex("state_province_short"));
        passportLocation.setState(locationName);
        locationName = new LocationName();
        locationName.mShortName = cursor.getString(cursor.getColumnIndex("country_short_name"));
        locationName.mLongName = cursor.getString(cursor.getColumnIndex("country_long_name"));
        passportLocation.setCountry(locationName);
        passportLocation.setAddress(cursor.getString(cursor.getColumnIndex("address")));
        locationName = new LocationName();
        locationName.mLongName = cursor.getString(cursor.getColumnIndex(ManagerWebServices.PARAM_ROUTE));
        passportLocation.setRoute(locationName);
        locationName = new LocationName();
        locationName.mLongName = cursor.getString(cursor.getColumnIndex(ManagerWebServices.PARAM_STREET_NUMBER));
        passportLocation.setStreetNumber(locationName);
        locationName = new LocationName();
        locationName.mLongName = cursor.getString(cursor.getColumnIndex("city"));
        passportLocation.setCity(locationName);
        passportLocation.setLastSeenDate(cursor.getLong(cursor.getColumnIndex("last_seen_date")));
        return passportLocation;
    }

    /* renamed from: a */
    public synchronized void m14579a(@NonNull PassportLocation passportLocation, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_seen_date", Long.valueOf(j));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id='");
        stringBuilder.append(passportLocation.getId());
        stringBuilder.append('\'');
        C2603i.m9766b().m9774a("tinder_locations", contentValues, stringBuilder.toString());
    }

    /* renamed from: a */
    public synchronized boolean m14580a(@NonNull PassportLocation passportLocation) {
        try {
            for (PassportLocation equals : m14583e()) {
                if (equals.equals(passportLocation)) {
                    ad.m10190a("TinderLocation already exists in db");
                    return false;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TinderLocation insert into db: ");
            stringBuilder.append(passportLocation.toString());
            ad.m10190a(stringBuilder.toString());
            C2603i.m9766b().m9773a("tinder_locations", C3863f.m14577b(passportLocation));
            return true;
        } catch (PassportLocation passportLocation2) {
            ad.m10197c(passportLocation2.getMessage());
            return false;
        }
    }

    @NonNull
    /* renamed from: b */
    protected C2601b[] mo2628b() {
        return this.f12114a;
    }
}
