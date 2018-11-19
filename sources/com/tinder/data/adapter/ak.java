package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import com.google.protobuf.InvalidProtocolBufferException;
import com.squareup.sqldelight.ColumnAdapter;
import com.tinder.data.generated.proto.TinderProto.C14283t;
import com.tinder.data.generated.proto.TinderProto.C14285u;
import com.tinder.data.generated.proto.TinderProto.C14285u.C14284a;
import com.tinder.domain.common.model.School;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p001a.C0001a;

public class ak implements ColumnAdapter<List<School>, byte[]> {
    @NonNull
    public /* synthetic */ Object decode(Object obj) {
        return m43100a((byte[]) obj);
    }

    public /* synthetic */ Object encode(@NonNull Object obj) {
        return m43101a((List) obj);
    }

    @NonNull
    /* renamed from: a */
    public List<School> m43100a(byte[] bArr) {
        List<School> arrayList;
        List<School> emptyList = Collections.emptyList();
        try {
            bArr = C14285u.m54304a(bArr);
            int schoolsCount = bArr.getSchoolsCount();
            arrayList = new ArrayList(schoolsCount);
            int i = 0;
            while (i < schoolsCount) {
                try {
                    C14283t schools = bArr.getSchools(i);
                    arrayList.add(School.builder().name(schools.getName()).id(schools.getId()).displayed(schools.getDisplayed()).build());
                    i++;
                } catch (InvalidProtocolBufferException e) {
                    bArr = e;
                }
            }
        } catch (InvalidProtocolBufferException e2) {
            bArr = e2;
            arrayList = emptyList;
            C0001a.c(bArr, "Error decoding schools", new Object[0]);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    public byte[] m43101a(@NonNull List<School> list) {
        C14284a a = C14285u.m54303a();
        for (School school : list) {
            a.m54302a((C14283t) C14283t.m54293a().m54290a(school.name()).m54292b(school.id()).m54291a(school.displayed()).build());
        }
        return ((C14285u) a.build()).toByteArray();
    }
}
