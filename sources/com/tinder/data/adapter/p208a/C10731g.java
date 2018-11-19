package com.tinder.data.adapter.p208a;

import com.squareup.sqldelight.ColumnAdapter;
import com.tinder.api.ManagerWebServices;
import com.tinder.data.adapter.p208a.p209a.C8612a;
import com.tinder.data.adapter.p208a.p209a.C8613b;
import com.tinder.data.generated.proto.TinderProto.C14263j;
import com.tinder.domain.feed.ActivityFeedSchool;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/tinder/data/adapter/activityfeed/ActivityFeedSchoolsProtobufColumnAdapter;", "Lcom/squareup/sqldelight/ColumnAdapter;", "", "Lcom/tinder/domain/feed/ActivityFeedSchool;", "", "()V", "decode", "activityFeedSchoolsBlob", "encode", "schools", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.adapter.a.g */
public final class C10731g implements ColumnAdapter<List<? extends ActivityFeedSchool>, byte[]> {
    public /* synthetic */ Object decode(Object obj) {
        return m43074a((byte[]) obj);
    }

    public /* synthetic */ Object encode(Object obj) {
        return m43075a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public byte[] m43075a(@NotNull List<ActivityFeedSchool> list) {
        C2668g.b(list, ManagerWebServices.PARAM_SCHOOLS);
        list = ((C14263j) C14263j.m54185a().m54184a(C8612a.m36742g(list)).build()).toByteArray();
        C2668g.a(list, "TinderProto.ActivityFeed…           .toByteArray()");
        return list;
    }

    @NotNull
    /* renamed from: a */
    public List<ActivityFeedSchool> m43074a(@Nullable byte[] bArr) {
        try {
            C14263j a = C14263j.m54186a(bArr);
            C2668g.a(a, "activityFeedSchools");
            return C8613b.m36747a(a);
        } catch (byte[] bArr2) {
            C0001a.c((Throwable) bArr2, "Failed to decode activity feed schools", new Object[0]);
            return C19301m.a();
        }
    }
}
