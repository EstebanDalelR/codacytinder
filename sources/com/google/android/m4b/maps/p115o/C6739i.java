package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.o.i */
public final class C6739i implements C5468c {
    public static final C5493j CREATOR = new C5493j();
    /* renamed from: a */
    private static final List<Integer> f25257a = Collections.unmodifiableList(Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10), Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(15), Integer.valueOf(16), Integer.valueOf(17), Integer.valueOf(18), Integer.valueOf(19)}));
    /* renamed from: b */
    private static final List<Integer> f25258b = Collections.unmodifiableList(Arrays.asList(new Integer[]{Integer.valueOf(1)}));
    /* renamed from: c */
    private static final List<Integer> f25259c = Collections.unmodifiableList(Arrays.asList(new Integer[]{Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8), Integer.valueOf(10), Integer.valueOf(12), Integer.valueOf(14), Integer.valueOf(16), Integer.valueOf(18), Integer.valueOf(19)}));
    /* renamed from: d */
    private static final List<Integer> f25260d = Collections.unmodifiableList(Arrays.asList(new Integer[]{Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(7), Integer.valueOf(9), Integer.valueOf(11), Integer.valueOf(13), Integer.valueOf(15), Integer.valueOf(17)}));
    /* renamed from: e */
    private final int f25261e;
    /* renamed from: f */
    private final List<Integer> f25262f;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final int m30046a() {
        return this.f25261e;
    }

    /* renamed from: b */
    public final List<Integer> m30047b() {
        return this.f25262f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5493j.m23966a(this, parcel);
    }

    C6739i(int i, List<Integer> list) {
        this.f25261e = i;
        this.f25262f = list;
    }
}
