package com.google.android.m4b.maps.p110j;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5468c;

/* renamed from: com.google.android.m4b.maps.j.w */
public final class C6712w implements C5468c {
    public static final Creator<C6712w> CREATOR = new C5463x();
    /* renamed from: a */
    final int f25107a;
    /* renamed from: b */
    private final Account f25108b;
    /* renamed from: c */
    private final int f25109c;

    public final int describeContents() {
        return 0;
    }

    C6712w(int i, Account account, int i2) {
        this.f25107a = i;
        this.f25108b = account;
        this.f25109c = i2;
    }

    public C6712w(Account account, int i) {
        this(1, account, i);
    }

    /* renamed from: a */
    public final Account m29967a() {
        return this.f25108b;
    }

    /* renamed from: b */
    public final int m29968b() {
        return this.f25109c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5463x.m23774a(this, parcel, i);
    }
}
