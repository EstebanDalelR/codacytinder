package com.tinder.data.profile.persistence;

import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.User;
import com.tinder.domain.profile.model.ProfileOption;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/data/profile/persistence/PersistUserFields;", "", "dataStore", "Lcom/tinder/data/profile/persistence/ProfileDataStore;", "(Lcom/tinder/data/profile/persistence/ProfileDataStore;)V", "persist", "Lio/reactivex/Completable;", "mapper", "Lkotlin/Function1;", "Lcom/tinder/domain/common/model/User;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.persistence.d */
public final class C8767d {
    /* renamed from: a */
    private final ProfileDataStore f30815a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/model/User;", "it", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.persistence.d$a */
    static final class C10962a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ Function1 f35678a;

        C10962a(Function1 function1) {
            this.f35678a = function1;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43558a((User) obj);
        }

        @NotNull
        /* renamed from: a */
        public final User m43558a(@NotNull User user) {
            C2668g.b(user, "it");
            return (User) this.f35678a.invoke(user);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/data/profile/persistence/PaperUser;", "it", "Lcom/tinder/domain/common/model/User;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.persistence.d$b */
    static final class C10963b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10963b f35679a = new C10963b();

        C10963b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43559a((User) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C10960a m43559a(@NotNull User user) {
            C2668g.b(user, "it");
            String id = user.id();
            C2668g.a(id, "id()");
            String bio = user.bio();
            List badges = user.badges();
            C2668g.a(badges, "badges()");
            DateTime birthDate = user.birthDate();
            Gender gender = user.gender();
            C2668g.a(gender, "gender()");
            List photos = user.photos();
            C2668g.a(photos, "photos()");
            String name = user.name();
            C2668g.a(name, "name()");
            List jobs = user.jobs();
            C2668g.a(jobs, "jobs()");
            List schools = user.schools();
            C2668g.a(schools, "schools()");
            return new C10960a(id, badges, bio, birthDate, gender, name, photos, jobs, schools);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/tinder/data/profile/persistence/PaperUser;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.persistence.d$c */
    static final class C10964c<T, R> implements Function<C10960a, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C8767d f35680a;

        C10964c(C8767d c8767d) {
            this.f35680a = c8767d;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43560a((C10960a) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m43560a(@NotNull C10960a c10960a) {
            C2668g.b(c10960a, "it");
            return this.f35680a.f30815a.save(ProfileOption.User.INSTANCE, c10960a);
        }
    }

    @Inject
    public C8767d(@NotNull ProfileDataStore profileDataStore) {
        C2668g.b(profileDataStore, "dataStore");
        this.f30815a = profileDataStore;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37371a(@NotNull Function1<? super User, ? extends User> function1) {
        C2668g.b(function1, "mapper");
        function1 = this.f30815a.get(ProfileOption.User.INSTANCE).map(new C10962a(function1)).map(C10963b.f35679a).flatMapCompletable(new C10964c(this));
        C2668g.a(function1, "dataStore.get(ProfileOpt…ProfileOption.User, it) }");
        return function1;
    }
}
