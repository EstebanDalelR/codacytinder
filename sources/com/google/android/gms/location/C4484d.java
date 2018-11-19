package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.internal.zzcfs;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.location.d */
public class C4484d {
    /* renamed from: a */
    private final int f16726a;
    /* renamed from: b */
    private final int f16727b;
    /* renamed from: c */
    private final List<Geofence> f16728c;
    /* renamed from: d */
    private final Location f16729d;

    private C4484d(int i, int i2, List<Geofence> list, Location location) {
        this.f16726a = i;
        this.f16727b = i2;
        this.f16728c = list;
        this.f16729d = location;
    }

    /* renamed from: a */
    public static C4484d m20351a(Intent intent) {
        List list = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra("gms_error_code", -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1 && (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4)) {
            i = intExtra2;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList != null) {
            list = new ArrayList(arrayList.size());
            arrayList = arrayList;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                list.add(zzcfs.zzp((byte[]) obj));
            }
        }
        return new C4484d(intExtra, i, list, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    /* renamed from: a */
    public boolean m20352a() {
        return this.f16726a != -1;
    }

    /* renamed from: b */
    public int m20353b() {
        return this.f16726a;
    }

    /* renamed from: c */
    public int m20354c() {
        return this.f16727b;
    }

    /* renamed from: d */
    public List<Geofence> m20355d() {
        return this.f16728c;
    }
}
