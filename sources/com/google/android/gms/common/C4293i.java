package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.internal.C3822p;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.zzat;
import com.google.android.gms.common.util.C2522g;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.i */
abstract class C4293i extends C3822p {
    /* renamed from: a */
    private int f13985a;

    protected C4293i(byte[] bArr) {
        if (bArr.length != 25) {
            int length = bArr.length;
            boolean z = false;
            String a = C2522g.m9203a(bArr, 0, bArr.length, false);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 51);
            stringBuilder.append("Cert hash data has incorrect length (");
            stringBuilder.append(length);
            stringBuilder.append("):\n");
            stringBuilder.append(a);
            Log.wtf("GoogleCertificates", stringBuilder.toString(), new Exception());
            bArr = Arrays.copyOfRange(bArr, 0, 25);
            if (bArr.length == 25) {
                z = true;
            }
            int length2 = bArr.length;
            StringBuilder stringBuilder2 = new StringBuilder(55);
            stringBuilder2.append("cert hash data has incorrect length. length=");
            stringBuilder2.append(length2);
            ad.m9055b(z, stringBuilder2.toString());
        }
        this.f13985a = Arrays.hashCode(bArr);
    }

    /* renamed from: a */
    protected static byte[] m17249a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    abstract byte[] mo3776a();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzat)) {
            return false;
        }
        try {
            zzat zzat = (zzat) obj;
            if (zzat.zzagb() != hashCode()) {
                return false;
            }
            IObjectWrapper zzaga = zzat.zzaga();
            if (zzaga == null) {
                return false;
            }
            return Arrays.equals(mo3776a(), (byte[]) C4296b.m17262a(zzaga));
        } catch (Throwable e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public int hashCode() {
        return this.f13985a;
    }

    public final IObjectWrapper zzaga() {
        return C4296b.m17261a(mo3776a());
    }

    public final int zzagb() {
        return hashCode();
    }
}
