package com.google.android.gms.internal;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@zzzv
public final class gm extends fx {
    /* renamed from: a */
    private final Context f26885a;

    private gm(Context context, zzaq zzaq) {
        super(zzaq);
        this.f26885a = context;
    }

    /* renamed from: a */
    public static ary m31569a(Context context) {
        ary ary = new ary(new iq(new File(context.getCacheDir(), "admob_volley")), new gm(context, new mc()));
        ary.m19467a();
        return ary;
    }

    public final amz zzc(aom<?> aom) throws zzad {
        if (aom.m19394g() && aom.m19389c() == 0) {
            if (Pattern.matches((String) aja.m19221f().m19334a(alo.ct), aom.m19392e())) {
                aja.m19216a();
                if (hn.m19877c(this.f26885a)) {
                    amz zzc = new apd(this.f26885a).zzc(aom);
                    String str;
                    if (zzc != null) {
                        str = "Got gmscore asset response: ";
                        String valueOf = String.valueOf(aom.m19392e());
                        ec.m27332a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        return zzc;
                    }
                    String str2 = "Failed to get gmscore asset response: ";
                    str = String.valueOf(aom.m19392e());
                    ec.m27332a(str.length() != 0 ? str2.concat(str) : new String(str2));
                }
            }
        }
        return super.zzc(aom);
    }
}
