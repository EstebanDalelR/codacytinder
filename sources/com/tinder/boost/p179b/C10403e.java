package com.tinder.boost.p179b;

import com.tinder.domain.common.reactivex.usecase.SingleResultUseCase;
import com.tinder.domain.profile.model.Tutorial.Boost;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.managers.bk;
import io.reactivex.C3960g;
import io.reactivex.functions.BiFunction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/boost/usecase/CheckBoostPaywallTutorial;", "Lcom/tinder/domain/common/reactivex/usecase/SingleResultUseCase;", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "sharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "(Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;Lcom/tinder/managers/ManagerSharedPreferences;)V", "execute", "Lio/reactivex/Single;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.boost.b.e */
public final class C10403e implements SingleResultUseCase<TutorialViewStatus> {
    /* renamed from: a */
    private final CheckTutorialViewed f33940a;
    /* renamed from: b */
    private final bk f33941b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "hasMarkedSeen", "", "status", "apply", "(Ljava/lang/Boolean;Lcom/tinder/domain/profile/model/TutorialViewStatus;)Lcom/tinder/domain/profile/model/TutorialViewStatus;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.boost.b.e$a */
    static final class C10402a<T1, T2, R> implements BiFunction<Boolean, TutorialViewStatus, TutorialViewStatus> {
        /* renamed from: a */
        public static final C10402a f33939a = new C10402a();

        C10402a() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m42291a((Boolean) obj, (TutorialViewStatus) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final TutorialViewStatus m42291a(@NotNull Boolean bool, @NotNull TutorialViewStatus tutorialViewStatus) {
            C2668g.b(bool, "hasMarkedSeen");
            C2668g.b(tutorialViewStatus, "status");
            if (bool.booleanValue() == null && tutorialViewStatus == TutorialViewStatus.UNSEEN) {
                return TutorialViewStatus.UNSEEN;
            }
            return TutorialViewStatus.VIEWED;
        }
    }

    @Inject
    public C10403e(@NotNull CheckTutorialViewed checkTutorialViewed, @NotNull bk bkVar) {
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        C2668g.b(bkVar, "sharedPreferences");
        this.f33940a = checkTutorialViewed;
        this.f33941b = bkVar;
    }

    @NotNull
    public C3960g<TutorialViewStatus> execute() {
        C3960g<TutorialViewStatus> a = C3960g.a(C3960g.a(Boolean.valueOf(this.f33941b.U())), this.f33940a.execute(Boost.INSTANCE), C10402a.f33939a);
        C2668g.a(a, "Single.zip(Single.just(s…         }\n            })");
        return a;
    }
}
