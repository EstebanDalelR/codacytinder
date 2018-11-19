package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2507w;
import java.util.Arrays;

public final class zzbeh extends zzbfm {
    public static final Creator<zzbeh> CREATOR = new oe();
    public final zzbec zzfjk;
    private boolean zzfjq;
    public final aev zzfjr;
    public zzbew zzfjx;
    public byte[] zzfjy;
    private int[] zzfjz;
    private String[] zzfka;
    private int[] zzfkb;
    private byte[][] zzfkc;
    private zzctx[] zzfkd;
    public final zzbec zzfke;

    public zzbeh(zzbew zzbew, aev aev, zzbec zzbec, zzbec zzbec2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, zzctx[] zzctxArr, boolean z) {
        this.zzfjx = zzbew;
        this.zzfjr = aev;
        this.zzfjk = zzbec;
        this.zzfke = null;
        this.zzfjz = iArr;
        this.zzfka = null;
        this.zzfkb = iArr2;
        this.zzfkc = null;
        this.zzfkd = null;
        this.zzfjq = z;
    }

    zzbeh(zzbew zzbew, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, zzctx[] zzctxArr) {
        this.zzfjx = zzbew;
        this.zzfjy = bArr;
        this.zzfjz = iArr;
        this.zzfka = strArr;
        this.zzfjr = null;
        this.zzfjk = null;
        this.zzfke = null;
        this.zzfkb = iArr2;
        this.zzfkc = bArr2;
        this.zzfkd = zzctxArr;
        this.zzfjq = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbeh) {
            zzbeh zzbeh = (zzbeh) obj;
            return C2507w.a(this.zzfjx, zzbeh.zzfjx) && Arrays.equals(this.zzfjy, zzbeh.zzfjy) && Arrays.equals(this.zzfjz, zzbeh.zzfjz) && Arrays.equals(this.zzfka, zzbeh.zzfka) && C2507w.a(this.zzfjr, zzbeh.zzfjr) && C2507w.a(this.zzfjk, zzbeh.zzfjk) && C2507w.a(this.zzfke, zzbeh.zzfke) && Arrays.equals(this.zzfkb, zzbeh.zzfkb) && Arrays.deepEquals(this.zzfkc, zzbeh.zzfkc) && Arrays.equals(this.zzfkd, zzbeh.zzfkd) && this.zzfjq == zzbeh.zzfjq;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzfjx, this.zzfjy, this.zzfjz, this.zzfka, this.zzfjr, this.zzfjk, this.zzfke, this.zzfkb, this.zzfkc, this.zzfkd, Boolean.valueOf(this.zzfjq)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogEventParcelable[");
        stringBuilder.append(this.zzfjx);
        stringBuilder.append(", LogEventBytes: ");
        stringBuilder.append(this.zzfjy == null ? null : new String(this.zzfjy));
        stringBuilder.append(", TestCodes: ");
        stringBuilder.append(Arrays.toString(this.zzfjz));
        stringBuilder.append(", MendelPackages: ");
        stringBuilder.append(Arrays.toString(this.zzfka));
        stringBuilder.append(", LogEvent: ");
        stringBuilder.append(this.zzfjr);
        stringBuilder.append(", ExtensionProducer: ");
        stringBuilder.append(this.zzfjk);
        stringBuilder.append(", VeProducer: ");
        stringBuilder.append(this.zzfke);
        stringBuilder.append(", ExperimentIDs: ");
        stringBuilder.append(Arrays.toString(this.zzfkb));
        stringBuilder.append(", ExperimentTokens: ");
        stringBuilder.append(Arrays.toString(this.zzfkc));
        stringBuilder.append(", ExperimentTokensParcelables: ");
        stringBuilder.append(Arrays.toString(this.zzfkd));
        stringBuilder.append(", AddPhenotypeExperimentTokens: ");
        stringBuilder.append(this.zzfjq);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20096a(parcel, 2, this.zzfjx, i, false);
        oj.m20102a(parcel, 3, this.zzfjy, false);
        oj.m20103a(parcel, 4, this.zzfjz, false);
        oj.m20105a(parcel, 5, this.zzfka, false);
        oj.m20103a(parcel, 6, this.zzfkb, false);
        oj.m20106a(parcel, 7, this.zzfkc, false);
        oj.m20101a(parcel, 8, this.zzfjq);
        oj.m20104a(parcel, 9, this.zzfkd, i, false);
        oj.m20088a(parcel, a);
    }
}
