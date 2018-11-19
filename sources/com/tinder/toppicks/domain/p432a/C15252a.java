package com.tinder.toppicks.domain.p432a;

import com.tinder.domain.onboarding.Onboarding;
import com.tinder.domain.onboarding.Onboarding.Tutorial;
import com.tinder.domain.onboarding.Onboarding.Tutorial.Asset;
import com.tinder.domain.onboarding.Onboarding.Tutorial.Name;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.model.Tutorial.TopPicksIntro;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/toppicks/domain/usecase/GetTopPicksIntroTutorial;", "", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "(Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;)V", "checkIfTutorialIsViewed", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/Tutorial$TopPicksIntro;", "tutorial", "execute", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.domain.a.a */
public final class C15252a {
    /* renamed from: a */
    private final LoadProfileOptionData f47355a;
    /* renamed from: b */
    private final CheckTutorialViewed f47356b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.domain.a.a$a */
    static final class C16998a<T> implements Predicate<TutorialViewStatus> {
        /* renamed from: a */
        public static final C16998a f52417a = new C16998a();

        C16998a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62776a((TutorialViewStatus) obj);
        }

        /* renamed from: a */
        public final boolean m62776a(@NotNull TutorialViewStatus tutorialViewStatus) {
            C2668g.b(tutorialViewStatus, "it");
            return tutorialViewStatus == TutorialViewStatus.UNSEEN ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/Tutorial$TopPicksIntro;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.domain.a.a$b */
    static final class C16999b<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ TopPicksIntro f52418a;

        C16999b(TopPicksIntro topPicksIntro) {
            this.f52418a = topPicksIntro;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62777a((TutorialViewStatus) obj);
        }

        /* renamed from: a */
        public final C3960g<TopPicksIntro> m62777a(@NotNull TutorialViewStatus tutorialViewStatus) {
            C2668g.b(tutorialViewStatus, "it");
            return C3960g.a(this.f52418a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial;", "it", "Lcom/tinder/domain/onboarding/Onboarding;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.domain.a.a$c */
    static final class C17000c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17000c f52419a = new C17000c();

        C17000c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62778a((Onboarding) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<Tutorial> m62778a(@NotNull Onboarding onboarding) {
            C2668g.b(onboarding, "it");
            return onboarding.getTutorials();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial;", "it", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.domain.a.a$d */
    static final class C17001d<T, R> implements Function<T, Iterable<? extends U>> {
        /* renamed from: a */
        public static final C17001d f52420a = new C17001d();

        C17001d() {
        }

        @NotNull
        /* renamed from: a */
        public final List<Tutorial> m62779a(@NotNull List<Tutorial> list) {
            C2668g.b(list, "it");
            return list;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62779a((List) obj);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.domain.a.a$e */
    static final class C17002e<T> implements Predicate<Tutorial> {
        /* renamed from: a */
        public static final C17002e f52421a = new C17002e();

        C17002e() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62780a((Tutorial) obj);
        }

        /* renamed from: a */
        public final boolean m62780a(@NotNull Tutorial tutorial) {
            C2668g.b(tutorial, "it");
            return tutorial.getName() == Name.TOP_PICKS_INTRO ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/model/Tutorial$TopPicksIntro;", "it", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.domain.a.a$f */
    static final class C17003f<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17003f f52422a = new C17003f();

        C17003f() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62781a((Tutorial) obj);
        }

        @NotNull
        /* renamed from: a */
        public final TopPicksIntro m62781a(@NotNull Tutorial tutorial) {
            C2668g.b(tutorial, "it");
            Asset asset = (Asset) C19299w.m68831g((List) tutorial.getAssets());
            if (asset != null) {
                tutorial = asset.getUrl();
                if (tutorial != null) {
                    return new TopPicksIntro(tutorial);
                }
            }
            tutorial = "";
            return new TopPicksIntro(tutorial);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/Tutorial$TopPicksIntro;", "it", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.domain.a.a$g */
    static final class C17004g<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C15252a f52423a;

        C17004g(C15252a c15252a) {
            this.f52423a = c15252a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62782a((TopPicksIntro) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<TopPicksIntro> m62782a(@NotNull TopPicksIntro topPicksIntro) {
            C2668g.b(topPicksIntro, "it");
            return this.f52423a.m57336a(topPicksIntro);
        }
    }

    @Inject
    public C15252a(@NotNull LoadProfileOptionData loadProfileOptionData, @NotNull CheckTutorialViewed checkTutorialViewed) {
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        this.f47355a = loadProfileOptionData;
        this.f47356b = checkTutorialViewed;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<TopPicksIntro> m57338a() {
        C3960g<TopPicksIntro> e = this.f47355a.execute(ProfileOption.Onboarding.INSTANCE).map(C17000c.f52419a).flatMapIterable(C17001d.f52420a).filter(C17002e.f52421a).map(C17003f.f52422a).flatMapSingle(new C17004g(this)).firstElement().e();
        C2668g.a(e, "loadProfileOptionData.ex…)\n            .toSingle()");
        return e;
    }

    /* renamed from: a */
    private final C3960g<TopPicksIntro> m57336a(TopPicksIntro topPicksIntro) {
        topPicksIntro = this.f47356b.execute(topPicksIntro).a(C16998a.f52417a).d(new C16999b(topPicksIntro));
        C2668g.a(topPicksIntro, "checkTutorialViewed.exec…{ Single.just(tutorial) }");
        return topPicksIntro;
    }
}
