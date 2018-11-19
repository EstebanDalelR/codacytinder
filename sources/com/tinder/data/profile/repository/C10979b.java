package com.tinder.data.profile.repository;

import com.tinder.api.ManagerWebServices;
import com.tinder.data.profile.client.C8757b;
import com.tinder.data.profile.persistence.C8767d;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.User;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.repository.JobRepository;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016J(\u0010\u000f\u001a\u00020\n2\u001e\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0016\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/data/profile/repository/JobDataRepository;", "Lcom/tinder/domain/profile/repository/JobRepository;", "profileLocalRepository", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "client", "Lcom/tinder/data/profile/client/JobClient;", "persistUserFields", "Lcom/tinder/data/profile/persistence/PersistUserFields;", "(Lcom/tinder/domain/profile/repository/ProfileLocalRepository;Lcom/tinder/data/profile/client/JobClient;Lcom/tinder/data/profile/persistence/PersistUserFields;)V", "delete", "Lio/reactivex/Completable;", "load", "Lio/reactivex/Observable;", "", "Lcom/tinder/domain/common/model/Job;", "persist", "interceptor", "Lkotlin/Function1;", "update", "job", "updateForSmsUser", "jobs", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.repository.b */
public final class C10979b implements JobRepository {
    /* renamed from: a */
    private final ProfileLocalRepository f35698a;
    /* renamed from: b */
    private final C8757b f35699b;
    /* renamed from: c */
    private final C8767d f35700c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/common/model/Job;", "kotlin.jvm.PlatformType", "", "it", "Lcom/tinder/domain/common/model/User;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.repository.b$a */
    static final class C10978a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10978a f35697a = new C10978a();

        C10978a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43584a((User) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<Job> m43584a(@NotNull User user) {
            C2668g.b(user, "it");
            return user.jobs();
        }
    }

    @Inject
    public C10979b(@NotNull ProfileLocalRepository profileLocalRepository, @NotNull C8757b c8757b, @NotNull C8767d c8767d) {
        C2668g.b(profileLocalRepository, "profileLocalRepository");
        C2668g.b(c8757b, "client");
        C2668g.b(c8767d, "persistUserFields");
        this.f35698a = profileLocalRepository;
        this.f35699b = c8757b;
        this.f35700c = c8767d;
    }

    @NotNull
    public C3959e<List<Job>> load() {
        C3959e<List<Job>> map = this.f35698a.loadProfileOption(ProfileOption.User.INSTANCE).map(C10978a.f35697a);
        C2668g.a(map, "profileLocalRepository.l…       .map { it.jobs() }");
        return map;
    }

    @NotNull
    public C3956a update(@NotNull Job job) {
        C2668g.b(job, "job");
        job = this.f35699b.m37294a(job).b(m43585a(new JobDataRepository$update$1(job)));
        C2668g.a(job, "client.update(job)\n     …         }\n            })");
        return job;
    }

    @NotNull
    public C3956a updateForSmsUser(@NotNull List<? extends Job> list) {
        C2668g.b(list, ManagerWebServices.PARAM_JOBS);
        list = this.f35699b.m37295a((List) list).b(m43585a(new JobDataRepository$updateForSmsUser$1(list)));
        C2668g.a(list, "client.updateForSmsUser(…andThen(persist { jobs })");
        return list;
    }

    @NotNull
    public C3956a delete() {
        C3956a b = this.f35699b.m37293a().b(m43585a(JobDataRepository$delete$1.f43970a));
        C2668g.a(b, "client.delete()\n        …     }\n                })");
        return b;
    }

    /* renamed from: a */
    private final C3956a m43585a(Function1<? super List<? extends Job>, ? extends List<? extends Job>> function1) {
        return this.f35700c.m37371a((Function1) new JobDataRepository$persist$1(function1));
    }
}
