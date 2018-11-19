package com.tinder.data.profile.repository;

import com.tinder.domain.common.model.School;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/common/model/School;", "kotlin.jvm.PlatformType", "original", "invoke"}, k = 3, mv = {1, 1, 10})
final class SchoolDataRepository$delete$1 extends Lambda implements Function1<List<? extends School>, List<? extends School>> {
    /* renamed from: a */
    public static final SchoolDataRepository$delete$1 f43974a = new SchoolDataRepository$delete$1();

    SchoolDataRepository$delete$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53423a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public final List<School> m53423a(@NotNull List<? extends School> list) {
        C2668g.b(list, "original");
        Iterable<School> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (School toBuilder : iterable) {
            arrayList.add(toBuilder.toBuilder().displayed(false).build());
        }
        return (List) arrayList;
    }
}
