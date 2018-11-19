package com.google.android.m4b.maps.p110j;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p110j.C5455p.C6705a;
import com.google.android.m4b.maps.p111k.C5468c;

/* renamed from: com.google.android.m4b.maps.j.i */
public final class C6699i implements C5468c {
    public static final Creator<C6699i> CREATOR = new C5444j();
    /* renamed from: a */
    final int f25067a;
    /* renamed from: b */
    final int f25068b;
    /* renamed from: c */
    int f25069c;
    /* renamed from: d */
    String f25070d;
    /* renamed from: e */
    IBinder f25071e;
    /* renamed from: f */
    C6690o[] f25072f;
    /* renamed from: g */
    Bundle f25073g;
    /* renamed from: h */
    Account f25074h;

    public final int describeContents() {
        return 0;
    }

    public C6699i(int i) {
        this.f25067a = 2;
        this.f25069c = C5398g.f20336a;
        this.f25068b = i;
    }

    C6699i(int i, int i2, int i3, String str, IBinder iBinder, C6690o[] c6690oArr, Bundle bundle, Account account) {
        this.f25067a = i;
        this.f25068b = i2;
        this.f25069c = i3;
        this.f25070d = str;
        if (i < 2) {
            i = 0;
            if (iBinder != null) {
                i = C7695a.m33397a(C6705a.m29915a(iBinder));
            }
            this.f25074h = i;
        } else {
            this.f25071e = iBinder;
            this.f25074h = account;
        }
        this.f25072f = c6690oArr;
        this.f25073g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5444j.m23676a(this, parcel, i);
    }
}
