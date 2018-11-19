package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzctx extends zzbfm {
    public static final Creator<zzctx> CREATOR = new sz();
    private static byte[][] zzfiz = new byte[0][];
    private static zzctx zzjwk = new zzctx("", null, zzfiz, zzfiz, zzfiz, zzfiz, null, null);
    private static final sy zzjwt = new st();
    private static final sy zzjwu = new su();
    private static final sy zzjwv = new sw();
    private static final sy zzjww = new sx();
    private String zzjwl;
    private byte[] zzjwm;
    private byte[][] zzjwn;
    private byte[][] zzjwo;
    private byte[][] zzjwp;
    private byte[][] zzjwq;
    private int[] zzjwr;
    private byte[][] zzjws;

    public zzctx(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.zzjwl = str;
        this.zzjwm = bArr;
        this.zzjwn = bArr2;
        this.zzjwo = bArr3;
        this.zzjwp = bArr4;
        this.zzjwq = bArr5;
        this.zzjwr = iArr;
        this.zzjws = bArr6;
    }

    private static void zza(StringBuilder stringBuilder, String str, int[] iArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (iArr == null) {
            str = ManagerWebServices.NULL_STRING_VALUE;
        } else {
            stringBuilder.append("(");
            int length = iArr.length;
            int i = 0;
            Object obj = 1;
            while (i < length) {
                int i2 = iArr[i];
                if (obj == null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(i2);
                i++;
                obj = null;
            }
            str = ")";
        }
        stringBuilder.append(str);
    }

    private static void zza(StringBuilder stringBuilder, String str, byte[][] bArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (bArr == null) {
            str = ManagerWebServices.NULL_STRING_VALUE;
        } else {
            stringBuilder.append("(");
            int length = bArr.length;
            int i = 0;
            Object obj = 1;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (obj == null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append("'");
                stringBuilder.append(Base64.encodeToString(bArr2, 3));
                stringBuilder.append("'");
                i++;
                obj = null;
            }
            str = ")";
        }
        stringBuilder.append(str);
    }

    private static List<String> zzb(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        List<String> arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<Integer> zzd(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        List<Integer> arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzctx) {
            zzctx zzctx = (zzctx) obj;
            if (ta.m20175a(this.zzjwl, zzctx.zzjwl) && Arrays.equals(this.zzjwm, zzctx.zzjwm) && ta.m20175a(zzb(this.zzjwn), zzb(zzctx.zzjwn)) && ta.m20175a(zzb(this.zzjwo), zzb(zzctx.zzjwo)) && ta.m20175a(zzb(this.zzjwp), zzb(zzctx.zzjwp)) && ta.m20175a(zzb(this.zzjwq), zzb(zzctx.zzjwq)) && ta.m20175a(zzd(this.zzjwr), zzd(zzctx.zzjwr)) && ta.m20175a(zzb(this.zzjws), zzb(zzctx.zzjws))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("ExperimentTokens");
        stringBuilder.append("(");
        if (this.zzjwl == null) {
            str = ManagerWebServices.NULL_STRING_VALUE;
        } else {
            str = "'";
            String str2 = this.zzjwl;
            String str3 = "'";
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + String.valueOf(str2).length()) + String.valueOf(str3).length());
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            stringBuilder2.append(str3);
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        byte[] bArr = this.zzjwm;
        stringBuilder.append("direct");
        stringBuilder.append("=");
        if (bArr == null) {
            str = ManagerWebServices.NULL_STRING_VALUE;
        } else {
            stringBuilder.append("'");
            stringBuilder.append(Base64.encodeToString(bArr, 3));
            str = "'";
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        zza(stringBuilder, "GAIA", this.zzjwn);
        stringBuilder.append(", ");
        zza(stringBuilder, "PSEUDO", this.zzjwo);
        stringBuilder.append(", ");
        zza(stringBuilder, "ALWAYS", this.zzjwp);
        stringBuilder.append(", ");
        zza(stringBuilder, "OTHER", this.zzjwq);
        stringBuilder.append(", ");
        zza(stringBuilder, "weak", this.zzjwr);
        stringBuilder.append(", ");
        zza(stringBuilder, "directs", this.zzjws);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20098a(parcel, 2, this.zzjwl, false);
        oj.m20102a(parcel, 3, this.zzjwm, false);
        oj.m20106a(parcel, 4, this.zzjwn, false);
        oj.m20106a(parcel, 5, this.zzjwo, false);
        oj.m20106a(parcel, 6, this.zzjwp, false);
        oj.m20106a(parcel, 7, this.zzjwq, false);
        oj.m20103a(parcel, 8, this.zzjwr, false);
        oj.m20106a(parcel, 9, this.zzjws, false);
        oj.m20088a(parcel, i);
    }
}
