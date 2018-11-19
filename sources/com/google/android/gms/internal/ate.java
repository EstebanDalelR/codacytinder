package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.C2003a;
import com.google.ads.mediation.C2004a;
import com.google.android.gms.ads.C2416m;
import java.util.Date;
import java.util.HashSet;

@zzzv
public final class ate {
    /* renamed from: a */
    public static int m19471a(ErrorCode errorCode) {
        switch (atf.f15705a[errorCode.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static C2003a m19472a(zzjn zzjn) {
        r1 = new C2003a[6];
        int i = 0;
        r1[0] = C2003a.f5431a;
        r1[1] = C2003a.f5432b;
        r1[2] = C2003a.f5433c;
        r1[3] = C2003a.f5434d;
        r1[4] = C2003a.f5435e;
        r1[5] = C2003a.f5436f;
        while (i < 6) {
            if (r1[i].a() == zzjn.width && r1[i].b() == zzjn.height) {
                return r1[i];
            }
            i++;
        }
        return new C2003a(C2416m.a(zzjn.width, zzjn.height, zzjn.zzbek));
    }

    /* renamed from: a */
    public static C2004a m19473a(zzjj zzjj, boolean z) {
        Gender gender;
        HashSet hashSet = zzjj.zzbdh != null ? new HashSet(zzjj.zzbdh) : null;
        Date date = new Date(zzjj.zzbdf);
        switch (zzjj.zzbdg) {
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            default:
                gender = Gender.UNKNOWN;
                break;
        }
        return new C2004a(date, gender, hashSet, z, zzjj.zzbdn);
    }
}
