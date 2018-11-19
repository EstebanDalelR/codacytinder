package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.zzaaz;
import com.google.android.gms.internal.zzafb;
import com.google.android.gms.internal.zzzv;

@zzzv
public final class bo {
    /* renamed from: a */
    private final Context f7216a;
    /* renamed from: b */
    private boolean f7217b;
    /* renamed from: c */
    private zzafb f7218c;
    /* renamed from: d */
    private zzaaz f7219d;

    public bo(Context context, zzafb zzafb, zzaaz zzaaz) {
        this.f7216a = context;
        this.f7218c = zzafb;
        this.f7219d = zzaaz;
        if (this.f7219d == null) {
            this.f7219d = new zzaaz();
        }
    }

    /* renamed from: c */
    private final boolean m8687c() {
        return (this.f7218c != null && this.f7218c.zzok().zzcwu) || this.f7219d.zzcpw;
    }

    /* renamed from: a */
    public final void m8688a() {
        this.f7217b = true;
    }

    /* renamed from: a */
    public final void m8689a(@Nullable String str) {
        if (m8687c()) {
            if (str == null) {
                str = "";
            }
            if (this.f7218c != null) {
                this.f7218c.zza(str, null, 3);
                return;
            }
            if (this.f7219d.zzcpw && this.f7219d.zzcpx != null) {
                for (String str2 : this.f7219d.zzcpx) {
                    String str22;
                    if (!TextUtils.isEmpty(str22)) {
                        str22 = str22.replace("{NAVIGATION_URL}", Uri.encode(str));
                        ar.m8648e();
                        fk.b(this.f7216a, "", str22);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m8690b() {
        if (m8687c()) {
            if (!this.f7217b) {
                return false;
            }
        }
        return true;
    }
}
