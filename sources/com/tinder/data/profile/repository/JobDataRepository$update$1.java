package com.tinder.data.profile.repository;

import com.tinder.domain.common.model.Job;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/common/model/Job;", "original", "invoke"}, k = 3, mv = {1, 1, 10})
final class JobDataRepository$update$1 extends Lambda implements Function1<List<? extends Job>, List<? extends Job>> {
    /* renamed from: a */
    final /* synthetic */ Job f43972a;

    JobDataRepository$update$1(Job job) {
        this.f43972a = job;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53421a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public final List<Job> m53421a(@NotNull List<? extends Job> list) {
        C2668g.b(list, "original");
        if (list.isEmpty()) {
            return C19301m.a(this.f43972a);
        }
        Iterable<Job> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (Job job : iterable) {
            Object obj;
            if (C2668g.a(job.titleId(), this.f43972a.titleId()) && C2668g.a(job.companyId(), this.f43972a.companyId())) {
                obj = this.f43972a;
            } else {
                obj = job.toBuilder().titleDisplayed(false).companyDisplayed(false).build();
            }
            arrayList.add(obj);
        }
        return (List) arrayList;
    }
}
