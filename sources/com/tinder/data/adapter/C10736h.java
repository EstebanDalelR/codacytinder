package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import com.google.protobuf.InvalidProtocolBufferException;
import com.squareup.sqldelight.ColumnAdapter;
import com.tinder.data.generated.proto.TinderProto.C14267l;
import com.tinder.data.generated.proto.TinderProto.C14269m;
import com.tinder.data.generated.proto.TinderProto.C14269m.C14268a;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Badge.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.data.adapter.h */
public class C10736h implements ColumnAdapter<List<Badge>, byte[]> {
    @NonNull
    public /* synthetic */ Object decode(Object obj) {
        return m43124a((byte[]) obj);
    }

    public /* synthetic */ Object encode(@NonNull Object obj) {
        return m43125a((List) obj);
    }

    @NonNull
    /* renamed from: a */
    public List<Badge> m43124a(byte[] bArr) {
        List<Badge> arrayList;
        List<Badge> emptyList = Collections.emptyList();
        try {
            bArr = C14269m.m54220a(bArr);
            int badgesCount = bArr.getBadgesCount();
            arrayList = new ArrayList(badgesCount);
            int i = 0;
            while (i < badgesCount) {
                try {
                    C14267l badges = bArr.getBadges(i);
                    arrayList.add(Badge.builder().type(Type.fromKey(badges.getType())).description(badges.getDescription()).color(badges.getColor()).build());
                    i++;
                } catch (InvalidProtocolBufferException e) {
                    bArr = e;
                }
            }
        } catch (InvalidProtocolBufferException e2) {
            bArr = e2;
            arrayList = emptyList;
            C0001a.c(bArr, "Error decoding Badges", new Object[0]);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    public byte[] m43125a(@NonNull List<Badge> list) {
        C14268a a = C14269m.m54219a();
        for (Badge badge : list) {
            a.m54218a((C14267l) C14267l.m54209a().m54206a(badge.type().key()).m54207b(badge.description()).m54208c(badge.color()).build());
        }
        return ((C14269m) a.build()).toByteArray();
    }
}
