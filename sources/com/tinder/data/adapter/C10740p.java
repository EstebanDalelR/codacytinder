package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import com.squareup.sqldelight.ColumnAdapter;
import com.tinder.data.generated.proto.TinderProto.C14271n;
import com.tinder.data.generated.proto.TinderProto.C14271n.C14270a;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.data.adapter.p */
public class C10740p implements ColumnAdapter<Gender, byte[]> {
    @NonNull
    public /* synthetic */ Object decode(Object obj) {
        return m43133a((byte[]) obj);
    }

    public /* synthetic */ Object encode(@NonNull Object obj) {
        return m43134a((Gender) obj);
    }

    @NonNull
    /* renamed from: a */
    public Gender m43133a(byte[] bArr) {
        try {
            bArr = C14271n.m54228a(bArr);
            return Gender.create(Value.fromId(bArr.getGender()), bArr.hasCustomGender() ? bArr.getCustomGender() : null);
        } catch (byte[] bArr2) {
            C0001a.c(bArr2, "Error decoding Gender", new Object[0]);
            return Gender.create(Value.UNKNOWN);
        }
    }

    /* renamed from: a */
    public byte[] m43134a(@NonNull Gender gender) {
        C14270a a = C14271n.m54227a().m54225a(gender.value().id());
        if (gender.customGender() != null) {
            a.m54226a(gender.customGender());
        }
        return ((C14271n) a.build()).toByteArray();
    }
}
