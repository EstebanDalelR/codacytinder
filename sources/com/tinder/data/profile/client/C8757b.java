package com.tinder.data.profile.client;

import com.tinder.api.TinderUserApi;
import com.tinder.api.model.profile.UpdateJobsRequestBody;
import com.tinder.data.adapter.C3925u;
import com.tinder.data.adapter.NotDisplayedByDefault;
import com.tinder.data.adapter.at;
import com.tinder.domain.common.model.Job;
import io.reactivex.C3956a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/data/profile/client/JobClient;", "", "tinderApi", "Lcom/tinder/api/TinderUserApi;", "adapter", "Lcom/tinder/data/adapter/JobDomainApiAdapter;", "requestBodyAdapter", "Lcom/tinder/data/adapter/UpdateJobRequestBodyAdapter;", "(Lcom/tinder/api/TinderUserApi;Lcom/tinder/data/adapter/JobDomainApiAdapter;Lcom/tinder/data/adapter/UpdateJobRequestBodyAdapter;)V", "delete", "Lio/reactivex/Completable;", "update", "job", "Lcom/tinder/domain/common/model/Job;", "updateForSmsUser", "list", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.client.b */
public final class C8757b {
    /* renamed from: a */
    private final TinderUserApi f30752a;
    /* renamed from: b */
    private final C3925u f30753b;
    /* renamed from: c */
    private final at f30754c;

    @Inject
    public C8757b(@NotNull TinderUserApi tinderUserApi, @NotNull @NotDisplayedByDefault C3925u c3925u, @NotNull at atVar) {
        C2668g.b(tinderUserApi, "tinderApi");
        C2668g.b(c3925u, "adapter");
        C2668g.b(atVar, "requestBodyAdapter");
        this.f30752a = tinderUserApi;
        this.f30753b = c3925u;
        this.f30754c = atVar;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37294a(@NotNull Job job) {
        C2668g.b(job, "job");
        job = this.f30752a.updateJob(this.f30754c.m36762a(job));
        C2668g.a(job, "tinderApi.updateJob(requ…apter.toRequestBody(job))");
        return job;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37295a(@NotNull List<? extends Job> list) {
        C2668g.b(list, "list");
        Iterable<Job> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (Job a : iterable) {
            arrayList.add(this.f30753b.a(a));
        }
        list = this.f30752a.updateJobForSMSUser(new UpdateJobsRequestBody((List) arrayList));
        C2668g.a(list, "tinderApi.updateJobForSMSUser(request)");
        return list;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37293a() {
        C3956a deleteJob = this.f30752a.deleteJob();
        C2668g.a(deleteJob, "tinderApi.deleteJob()");
        return deleteJob;
    }
}
