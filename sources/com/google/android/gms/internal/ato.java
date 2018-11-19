package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.C2335R;
import com.google.android.gms.ads.internal.ar;
import io.fabric.sdk.android.services.common.C15616a;
import java.util.Map;

@zzzv
public final class ato extends atv {
    /* renamed from: a */
    private final Map<String, String> f23148a;
    /* renamed from: b */
    private final Context f23149b;

    public ato(zzanh zzanh, Map<String, String> map) {
        super(zzanh, "storePicture");
        this.f23148a = map;
        this.f23149b = zzanh.zzsi();
    }

    /* renamed from: a */
    public final void m27250a() {
        if (this.f23149b == null) {
            m19488a("Activity context is not available");
            return;
        }
        ar.e();
        if (fk.m19730f(this.f23149b).m19311c()) {
            String str = (String) this.f23148a.get("iurl");
            if (TextUtils.isEmpty(str)) {
                m19488a("Image url cannot be empty.");
                return;
            } else if (URLUtil.isValidUrl(str)) {
                r1 = Uri.parse(str).getLastPathSegment();
                ar.e();
                if (fk.m19722c(r1)) {
                    Resources v = ar.i().m27324v();
                    ar.e();
                    Builder e = fk.m19726e(this.f23149b);
                    e.setTitle(v != null ? v.getString(C2335R.string.s1) : "Save image");
                    e.setMessage(v != null ? v.getString(C2335R.string.s2) : "Allow Ad to store image in Picture gallery?");
                    e.setPositiveButton(v != null ? v.getString(C2335R.string.s3) : C15616a.HEADER_ACCEPT, new atp(this, str, r1));
                    e.setNegativeButton(v != null ? v.getString(C2335R.string.s4) : "Decline", new atq(this));
                    e.create().show();
                    return;
                }
                str = "Image type not recognized: ";
                r1 = String.valueOf(r1);
                m19488a(r1.length() != 0 ? str.concat(r1) : new String(str));
                return;
            } else {
                r1 = "Invalid image url: ";
                str = String.valueOf(str);
                m19488a(str.length() != 0 ? r1.concat(str) : new String(r1));
                return;
            }
        }
        m19488a("Feature is not supported by the device.");
    }
}
