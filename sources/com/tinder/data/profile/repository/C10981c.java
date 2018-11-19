package com.tinder.data.profile.repository;

import com.tinder.api.ManagerWebServices;
import com.tinder.data.profile.client.C8758c;
import com.tinder.data.profile.persistence.C8767d;
import com.tinder.domain.common.model.School;
import com.tinder.domain.common.model.User;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.profile.repository.SchoolRepository;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016J(\u0010\u000f\u001a\u00020\n2\u001e\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0016\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/data/profile/repository/SchoolDataRepository;", "Lcom/tinder/domain/profile/repository/SchoolRepository;", "profileLocalRepository", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "client", "Lcom/tinder/data/profile/client/SchoolClient;", "persistUserFields", "Lcom/tinder/data/profile/persistence/PersistUserFields;", "(Lcom/tinder/domain/profile/repository/ProfileLocalRepository;Lcom/tinder/data/profile/client/SchoolClient;Lcom/tinder/data/profile/persistence/PersistUserFields;)V", "delete", "Lio/reactivex/Completable;", "load", "Lio/reactivex/Observable;", "", "Lcom/tinder/domain/common/model/School;", "persist", "interceptor", "Lkotlin/Function1;", "update", "schools", "updateForSmsUser", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.repository.c */
public final class C10981c implements SchoolRepository {
    /* renamed from: a */
    private final ProfileLocalRepository f35702a;
    /* renamed from: b */
    private final C8758c f35703b;
    /* renamed from: c */
    private final C8767d f35704c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/common/model/School;", "kotlin.jvm.PlatformType", "", "it", "Lcom/tinder/domain/common/model/User;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.repository.c$a */
    static final class C10980a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10980a f35701a = new C10980a();

        C10980a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43586a((User) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<School> m43586a(@NotNull User user) {
            C2668g.b(user, "it");
            return user.schools();
        }
    }

    @Inject
    public C10981c(@NotNull ProfileLocalRepository profileLocalRepository, @NotNull C8758c c8758c, @NotNull C8767d c8767d) {
        C2668g.b(profileLocalRepository, "profileLocalRepository");
        C2668g.b(c8758c, "client");
        C2668g.b(c8767d, "persistUserFields");
        this.f35702a = profileLocalRepository;
        this.f35703b = c8758c;
        this.f35704c = c8767d;
    }

    @NotNull
    public C3959e<List<School>> load() {
        C3959e<List<School>> map = this.f35702a.loadProfileOption(ProfileOption.User.INSTANCE).map(C10980a.f35701a);
        C2668g.a(map, "profileLocalRepository.l…    .map { it.schools() }");
        return map;
    }

    @NotNull
    public C3956a update(@NotNull List<? extends School> list) {
        C2668g.b(list, ManagerWebServices.PARAM_SCHOOLS);
        list = this.f35703b.m37297a(list).b(m43587a(new SchoolDataRepository$update$1(list)));
        C2668g.a(list, "client.update(schools)\n …Then(persist { schools })");
        return list;
    }

    @NotNull
    public C3956a updateForSmsUser(@NotNull List<? extends School> list) {
        C2668g.b(list, ManagerWebServices.PARAM_SCHOOLS);
        list = this.f35703b.m37298b(list).b(m43587a(new SchoolDataRepository$updateForSmsUser$1(list)));
        C2668g.a(list, "client.updateForSMSUser(…Then(persist { schools })");
        return list;
    }

    @NotNull
    public C3956a delete() {
        C3956a b = this.f35703b.m37296a().b(m43587a(SchoolDataRepository$delete$1.f43974a));
        C2668g.a(b, "client.delete()\n        ….build() }\n            })");
        return b;
    }

    /* renamed from: a */
    private final C3956a m43587a(Function1<? super List<? extends School>, ? extends List<? extends School>> function1) {
        return this.f35704c.m37371a((Function1) new SchoolDataRepository$persist$1(function1));
    }
}
