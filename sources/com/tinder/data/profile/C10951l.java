package com.tinder.data.profile;

import com.tinder.data.profile.persistence.ProfileDataStore;
import com.tinder.domain.profile.model.DataNotAvailableException;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import io.reactivex.C3956a;
import io.reactivex.C3958c;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J<\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\b0\rH\u0002J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\t0\u0010\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH\u0016J>\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b2\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\b0\rH\u0002J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH\u0016J/\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b2\u0006\u0010\u0013\u001a\u0002H\tH\u0016¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/data/profile/ProfileLocalDataRepository;", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "dataStore", "Lcom/tinder/data/profile/persistence/ProfileDataStore;", "(Lcom/tinder/data/profile/persistence/ProfileDataStore;)V", "clear", "Lio/reactivex/Completable;", "getCachedData", "Lio/reactivex/Observable;", "T", "option", "Lcom/tinder/domain/profile/model/ProfileOption;", "onError", "Lkotlin/Function1;", "Lcom/tinder/domain/profile/model/DataNotAvailableException;", "getProfileOption", "Lio/reactivex/Maybe;", "loadData", "loadProfileOption", "defaultValue", "(Lcom/tinder/domain/profile/model/ProfileOption;Ljava/lang/Object;)Lio/reactivex/Observable;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.l */
public final class C10951l implements ProfileLocalRepository {
    /* renamed from: a */
    private final ProfileDataStore f35654a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "T", "kotlin.jvm.PlatformType", "throwable", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.l$a */
    static final class C10950a<T, R> implements Function<Throwable, ObservableSource<? extends T>> {
        /* renamed from: a */
        final /* synthetic */ Function1 f35653a;

        C10950a(Function1 function1) {
            this.f35653a = function1;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43545a((Throwable) obj);
        }

        /* renamed from: a */
        public final ObservableSource<? extends T> m43545a(@NotNull Throwable th) {
            C2668g.b(th, "throwable");
            if (th instanceof DataNotAvailableException) {
                return (ObservableSource) this.f35653a.invoke(th);
            }
            return C3959e.error(th);
        }
    }

    @Inject
    public C10951l(@NotNull ProfileDataStore profileDataStore) {
        C2668g.b(profileDataStore, "dataStore");
        this.f35654a = profileDataStore;
    }

    @NotNull
    public <T> C3958c<T> getProfileOption(@NotNull ProfileOption<? extends T> profileOption) {
        C2668g.b(profileOption, "option");
        profileOption = m43547b(profileOption, ProfileLocalDataRepository$getProfileOption$1.f43962a).firstElement();
        C2668g.a(profileOption, "getCachedData(option) { …          .firstElement()");
        return profileOption;
    }

    @NotNull
    public <T> C3959e<T> loadProfileOption(@NotNull ProfileOption<? extends T> profileOption) {
        C2668g.b(profileOption, "option");
        return m43546a(profileOption, new ProfileLocalDataRepository$loadProfileOption$1(profileOption));
    }

    @NotNull
    public <T> C3959e<T> loadProfileOption(@NotNull ProfileOption<? extends T> profileOption, T t) {
        C2668g.b(profileOption, "option");
        return m43546a(profileOption, new ProfileLocalDataRepository$loadProfileOption$2(t));
    }

    /* renamed from: a */
    private final <T> C3959e<T> m43546a(ProfileOption<? extends T> profileOption, Function1<? super DataNotAvailableException, ? extends C3959e<T>> function1) {
        profileOption = this.f35654a.observeDataChanges(profileOption).startWith(m43547b(profileOption, function1));
        C2668g.a(profileOption, "dataStore.observeDataCha…hedData(option, onError))");
        return profileOption;
    }

    /* renamed from: b */
    private final <T> C3959e<T> m43547b(ProfileOption<? extends T> profileOption, Function1<? super DataNotAvailableException, ? extends C3959e<T>> function1) {
        profileOption = this.f35654a.get(profileOption).onErrorResumeNext(new C10950a(function1));
        C2668g.a(profileOption, "dataStore.get(option)\n  …          }\n            }");
        return profileOption;
    }

    @NotNull
    public C3956a clear() {
        return this.f35654a.clear();
    }
}
