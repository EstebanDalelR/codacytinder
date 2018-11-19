package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.util.C2517a;
import com.google.android.gms.common.util.C2518b;
import com.google.android.gms.common.util.C2524i;
import com.google.android.gms.common.util.C2525j;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzbgy extends zzbgq {
    public static final Creator<zzbgy> CREATOR = new pf();
    private final String mClassName;
    private final int zzeck;
    private final zzbgt zzgcm;
    private final Parcel zzgct;
    private final int zzgcu = 2;
    private int zzgcv;
    private int zzgcw;

    zzbgy(int i, Parcel parcel, zzbgt zzbgt) {
        this.zzeck = i;
        this.zzgct = (Parcel) ad.a(parcel);
        this.zzgcm = zzbgt;
        this.mClassName = this.zzgcm == null ? null : this.zzgcm.zzalz();
        this.zzgcv = 2;
    }

    private static void zza(StringBuilder stringBuilder, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                stringBuilder.append(obj);
                return;
            case 7:
                stringBuilder.append("\"");
                stringBuilder.append(C2524i.a(obj.toString()));
                stringBuilder.append("\"");
                return;
            case 8:
                stringBuilder.append("\"");
                stringBuilder.append(C2518b.a((byte[]) obj));
                stringBuilder.append("\"");
                return;
            case 9:
                stringBuilder.append("\"");
                stringBuilder.append(C2518b.b((byte[]) obj));
                stringBuilder.append("\"");
                return;
            case 10:
                C2525j.a(stringBuilder, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder stringBuilder2 = new StringBuilder(26);
                stringBuilder2.append("Unknown type = ");
                stringBuilder2.append(i);
                throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    private final void zza(StringBuilder stringBuilder, zzbgo<?, ?> zzbgo, Parcel parcel, int i) {
        int i2 = 0;
        if (zzbgo.zzgch) {
            stringBuilder.append("[");
            Object[] objArr = null;
            int a;
            int readInt;
            switch (zzbgo.zzgcg) {
                case 0:
                    int[] r = oi.m20078r(parcel, i);
                    int length = r.length;
                    while (i2 < length) {
                        if (i2 != 0) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append(Integer.toString(r[i2]));
                        i2++;
                    }
                    break;
                case 1:
                    a = oi.m20056a(parcel, i);
                    i = parcel.dataPosition();
                    if (a != 0) {
                        readInt = parcel.readInt();
                        objArr = new BigInteger[readInt];
                        while (i2 < readInt) {
                            objArr[i2] = new BigInteger(parcel.createByteArray());
                            i2++;
                        }
                        parcel.setDataPosition(i + a);
                    }
                    C2517a.a(stringBuilder, objArr);
                    break;
                case 2:
                    C2517a.a(stringBuilder, oi.m20079s(parcel, i));
                    break;
                case 3:
                    C2517a.a(stringBuilder, oi.m20080t(parcel, i));
                    break;
                case 4:
                    double[] createDoubleArray;
                    a = oi.m20056a(parcel, i);
                    i = parcel.dataPosition();
                    if (a != 0) {
                        createDoubleArray = parcel.createDoubleArray();
                        parcel.setDataPosition(i + a);
                    }
                    C2517a.a(stringBuilder, createDoubleArray);
                    break;
                case 5:
                    C2517a.a(stringBuilder, oi.m20081u(parcel, i));
                    break;
                case 6:
                    C2517a.a(stringBuilder, oi.m20077q(parcel, i));
                    break;
                case 7:
                    C2517a.a(stringBuilder, oi.m20082v(parcel, i));
                    break;
                case 8:
                case 9:
                case 10:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case 11:
                    Parcel[] z = oi.m20086z(parcel, i);
                    i = z.length;
                    for (readInt = 0; readInt < i; readInt++) {
                        if (readInt > 0) {
                            stringBuilder.append(",");
                        }
                        z[readInt].setDataPosition(0);
                        zza(stringBuilder, zzbgo.zzalx(), z[readInt]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            stringBuilder.append("]");
            return;
        }
        byte[] o;
        switch (zzbgo.zzgcg) {
            case 0:
                stringBuilder.append(oi.m20065e(parcel, i));
                return;
            case 1:
                stringBuilder.append(oi.m20068h(parcel, i));
                return;
            case 2:
                stringBuilder.append(oi.m20066f(parcel, i));
                return;
            case 3:
                stringBuilder.append(oi.m20069i(parcel, i));
                return;
            case 4:
                stringBuilder.append(oi.m20070j(parcel, i));
                return;
            case 5:
                stringBuilder.append(oi.m20071k(parcel, i));
                return;
            case 6:
                stringBuilder.append(oi.m20063c(parcel, i));
                return;
            case 7:
                String l = oi.m20072l(parcel, i);
                stringBuilder.append("\"");
                stringBuilder.append(C2524i.a(l));
                stringBuilder.append("\"");
                return;
            case 8:
                o = oi.m20075o(parcel, i);
                stringBuilder.append("\"");
                stringBuilder.append(C2518b.a(o));
                stringBuilder.append("\"");
                return;
            case 9:
                o = oi.m20075o(parcel, i);
                stringBuilder.append("\"");
                stringBuilder.append(C2518b.b(o));
                stringBuilder.append("\"");
                return;
            case 10:
                Bundle n = oi.m20074n(parcel, i);
                Set<String> keySet = n.keySet();
                keySet.size();
                stringBuilder.append("{");
                Object obj = 1;
                for (String str : keySet) {
                    if (obj == null) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("\"");
                    stringBuilder.append(str);
                    stringBuilder.append("\"");
                    stringBuilder.append(":");
                    stringBuilder.append("\"");
                    stringBuilder.append(C2524i.a(n.getString(str)));
                    stringBuilder.append("\"");
                    obj = null;
                }
                stringBuilder.append("}");
                return;
            case 11:
                parcel = oi.m20085y(parcel, i);
                parcel.setDataPosition(0);
                zza(stringBuilder, zzbgo.zzalx(), parcel);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    private final void zza(StringBuilder stringBuilder, Map<String, zzbgo<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Entry entry : map.entrySet()) {
            sparseArray.put(((zzbgo) entry.getValue()).zzgcj, entry);
        }
        stringBuilder.append('{');
        int a = oi.m20055a(parcel);
        Object obj = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            Entry entry2 = (Entry) sparseArray.get(65535 & readInt);
            if (entry2 != null) {
                if (obj != null) {
                    stringBuilder.append(",");
                }
                String str = (String) entry2.getKey();
                zzbgo zzbgo = (zzbgo) entry2.getValue();
                stringBuilder.append("\"");
                stringBuilder.append(str);
                stringBuilder.append("\":");
                if (zzbgo.zzalw()) {
                    switch (zzbgo.zzgcg) {
                        case 0:
                            obj = Integer.valueOf(oi.m20065e(parcel, readInt));
                            break;
                        case 1:
                            obj = oi.m20068h(parcel, readInt);
                            break;
                        case 2:
                            obj = Long.valueOf(oi.m20066f(parcel, readInt));
                            break;
                        case 3:
                            obj = Float.valueOf(oi.m20069i(parcel, readInt));
                            break;
                        case 4:
                            obj = Double.valueOf(oi.m20070j(parcel, readInt));
                            break;
                        case 5:
                            obj = oi.m20071k(parcel, readInt);
                            break;
                        case 6:
                            obj = Boolean.valueOf(oi.m20063c(parcel, readInt));
                            break;
                        case 7:
                            obj = oi.m20072l(parcel, readInt);
                            break;
                        case 8:
                        case 9:
                            obj = oi.m20075o(parcel, readInt);
                            break;
                        case 10:
                            obj = zzl(oi.m20074n(parcel, readInt));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            a = zzbgo.zzgcg;
                            StringBuilder stringBuilder2 = new StringBuilder(36);
                            stringBuilder2.append("Unknown field out type = ");
                            stringBuilder2.append(a);
                            throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                    zzb(stringBuilder, zzbgo, pa.zza(zzbgo, obj));
                } else {
                    zza(stringBuilder, zzbgo, parcel, readInt);
                }
                obj = 1;
            }
        }
        if (parcel.dataPosition() != a) {
            StringBuilder stringBuilder3 = new StringBuilder(37);
            stringBuilder3.append("Overread allowed size end=");
            stringBuilder3.append(a);
            throw new zzbfo(stringBuilder3.toString(), parcel);
        }
        stringBuilder.append('}');
    }

    private Parcel zzamb() {
        switch (this.zzgcv) {
            case 0:
                this.zzgcw = oj.m20087a(this.zzgct);
                break;
            case 1:
                break;
            default:
                break;
        }
        oj.m20088a(this.zzgct, this.zzgcw);
        this.zzgcv = 2;
        return this.zzgct;
    }

    private final void zzb(StringBuilder stringBuilder, zzbgo<?, ?> zzbgo, Object obj) {
        if (zzbgo.zzgcf) {
            ArrayList arrayList = (ArrayList) obj;
            stringBuilder.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    stringBuilder.append(",");
                }
                zza(stringBuilder, zzbgo.zzgce, arrayList.get(i));
            }
            stringBuilder.append("]");
            return;
        }
        zza(stringBuilder, zzbgo.zzgce, obj);
    }

    private static HashMap<String, String> zzl(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public String toString() {
        ad.a(this.zzgcm, "Cannot convert to JSON on client side.");
        Parcel zzamb = zzamb();
        zzamb.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        zza(stringBuilder, this.zzgcm.zzgq(this.mClassName), zzamb);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcelable parcelable;
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzeck);
        oj.m20095a(parcel, 2, zzamb(), false);
        switch (this.zzgcu) {
            case 0:
                parcelable = null;
                break;
            case 1:
            case 2:
                parcelable = this.zzgcm;
                break;
            default:
                i = this.zzgcu;
                StringBuilder stringBuilder = new StringBuilder(34);
                stringBuilder.append("Invalid creation type: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        oj.m20096a(parcel, 3, parcelable, i, false);
        oj.m20088a(parcel, a);
    }

    public final Map<String, zzbgo<?, ?>> zzaav() {
        return this.zzgcm == null ? null : this.zzgcm.zzgq(this.mClassName);
    }

    public final Object zzgo(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final boolean zzgp(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }
}
