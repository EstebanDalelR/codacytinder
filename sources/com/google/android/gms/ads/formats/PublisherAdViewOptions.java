package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.aip;
import com.google.android.gms.internal.ajp;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzzv;

@zzzv
public final class PublisherAdViewOptions extends zzbfm {
    public static final Creator<PublisherAdViewOptions> CREATOR = new C2361j();
    private final boolean zzamr;
    @Nullable
    private final zzkx zzams;
    @Nullable
    private AppEventListener zzamt;

    /* renamed from: com.google.android.gms.ads.formats.PublisherAdViewOptions$a */
    public static final class C2351a {
        /* renamed from: a */
        private boolean f7060a;
        /* renamed from: b */
        private AppEventListener f7061b;
    }

    private PublisherAdViewOptions(C2351a c2351a) {
        this.zzamr = c2351a.f7060a;
        this.zzamt = c2351a.f7061b;
        this.zzams = this.zzamt != null ? new aip(this.zzamt) : null;
    }

    PublisherAdViewOptions(boolean z, @Nullable IBinder iBinder) {
        this.zzamr = z;
        this.zzams = iBinder != null ? ajp.a(iBinder) : null;
    }

    @Nullable
    public final AppEventListener getAppEventListener() {
        return this.zzamt;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzamr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.a(parcel);
        oj.a(parcel, 1, getManualImpressionsEnabled());
        oj.a(parcel, 2, this.zzams == null ? null : this.zzams.asBinder(), false);
        oj.a(parcel, i);
    }

    @Nullable
    public final zzkx zzbn() {
        return this.zzams;
    }
}
