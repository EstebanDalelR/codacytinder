package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.Format;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.o.q */
public final class C5498q implements Creator<C6745p> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C5498q.m23973a(parcel);
    }

    /* renamed from: a */
    public static C6745p m23973a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = C5466a.m23776a(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Format.OFFSET_SAMPLE_RELATIVE;
        long j4 = 0;
        int i = 0;
        int i2 = 102;
        boolean z = false;
        int i3 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        float f = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 != AdError.NETWORK_ERROR_CODE) {
                switch (i4) {
                    case 1:
                        i2 = C5466a.m23786f(parcel2, readInt);
                        break;
                    case 2:
                        j = C5466a.m23788h(parcel2, readInt);
                        break;
                    case 3:
                        j2 = C5466a.m23788h(parcel2, readInt);
                        break;
                    case 4:
                        z = C5466a.m23783c(parcel2, readInt);
                        break;
                    case 5:
                        j3 = C5466a.m23788h(parcel2, readInt);
                        break;
                    case 6:
                        i3 = C5466a.m23786f(parcel2, readInt);
                        break;
                    case 7:
                        f = C5466a.m23789i(parcel2, readInt);
                        break;
                    case 8:
                        j4 = C5466a.m23788h(parcel2, readInt);
                        break;
                    default:
                        C5466a.m23780b(parcel2, readInt);
                        break;
                }
            }
            i = C5466a.m23786f(parcel2, readInt);
        }
        if (parcel.dataPosition() == a) {
            return new C6745p(i, i2, j, j2, z, j3, i3, f, j4);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel2);
    }

    /* renamed from: a */
    static void m23974a(C6745p c6745p, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6745p.f25270a);
        C5467b.m23801a(parcel, 2, c6745p.f25271b);
        C5467b.m23801a(parcel, 3, c6745p.f25272c);
        C5467b.m23809a(parcel, 4, c6745p.f25273d);
        C5467b.m23801a(parcel, 5, c6745p.f25274e);
        C5467b.m23800a(parcel, 6, c6745p.f25275f);
        C5467b.m23799a(parcel, 7, c6745p.f25276g);
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6745p.m30058b());
        C5467b.m23801a(parcel, 8, c6745p.f25277h);
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6745p[i];
    }
}
