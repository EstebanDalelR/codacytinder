package com.tinder.data.profile.repository;

import com.tinder.domain.common.model.School;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/common/model/School;", "it", "invoke"}, k = 3, mv = {1, 1, 10})
final class SchoolDataRepository$updateForSmsUser$1 extends Lambda implements Function1<List<? extends School>, List<? extends School>> {
    /* renamed from: a */
    final /* synthetic */ List f43977a;

    SchoolDataRepository$updateForSmsUser$1(List list) {
        this.f43977a = list;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53426a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public final List<School> m53426a(@NotNull List<? extends School> list) {
        C2668g.b(list, "it");
        return this.f43977a;
    }
}
