package com.tinder.main.tab.listener;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.Tutorial.EditInfoAnimation;
import com.tinder.domain.profile.model.Tutorial.ProfileAwarenessMarker;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.main.model.MainPage;
import com.tinder.profiletab.view.ProfileTabView;
import io.reactivex.C3958c;
import io.reactivex.C3960g;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/main/tab/listener/ProfileTabPageSelectedListener;", "Lcom/tinder/main/tab/listener/HomeTabIconViewPageSelectedListener;", "page", "Lcom/tinder/main/model/MainPage;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "appVisibilityTracker", "Lcom/tinder/app/AppVisibilityTracker;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/main/model/MainPage;Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;Lcom/tinder/app/AppVisibilityTracker;Lcom/tinder/core/experiment/AbTestUtility;)V", "profileTabView", "Lcom/tinder/profiletab/view/ProfileTabView;", "onPageSelected", "", "selectedPage", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "previousPage", "setProfileTabView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.tab.listener.g */
public final class C13393g extends C12003d {
    /* renamed from: a */
    private ProfileTabView f42464a;
    /* renamed from: b */
    private final CheckTutorialViewed f42465b;
    /* renamed from: c */
    private final ConfirmTutorialsViewed f42466c;
    /* renamed from: d */
    private final AppVisibilityTracker f42467d;
    /* renamed from: e */
    private final AbTestUtility f42468e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "enabled", "test", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.tab.listener.g$a */
    static final class C12005a<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C12005a f38967a = new C12005a();

        C12005a() {
        }

        @NotNull
        /* renamed from: a */
        public final Boolean m48048a(@NotNull Boolean bool) {
            C2668g.b(bool, "enabled");
            return bool;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m48048a((Boolean) obj).booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Maybe;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.tab.listener.g$b */
    static final class C12007b<T, R> implements Function<T, MaybeSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C13393g f38969a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "test"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.main.tab.listener.g$b$1 */
        static final class C120061<T> implements Predicate<TutorialViewStatus> {
            /* renamed from: a */
            public static final C120061 f38968a = new C120061();

            C120061() {
            }

            public /* synthetic */ boolean test(Object obj) {
                return m48049a((TutorialViewStatus) obj);
            }

            /* renamed from: a */
            public final boolean m48049a(@NotNull TutorialViewStatus tutorialViewStatus) {
                C2668g.b(tutorialViewStatus, "it");
                return tutorialViewStatus == TutorialViewStatus.UNSEEN ? true : null;
            }
        }

        C12007b(C13393g c13393g) {
            this.f38969a = c13393g;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48050a((Boolean) obj);
        }

        /* renamed from: a */
        public final C3958c<TutorialViewStatus> m48050a(@NotNull Boolean bool) {
            C2668g.b(bool, "<anonymous parameter 0>");
            return this.f38969a.f42465b.execute(EditInfoAnimation.INSTANCE).a(C120061.f38968a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.tab.listener.g$c */
    static final class C12008c<T> implements Predicate<AppVisibilityTracker$Visibility> {
        /* renamed from: a */
        public static final C12008c f38970a = new C12008c();

        C12008c() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m48051a((AppVisibilityTracker$Visibility) obj);
        }

        /* renamed from: a */
        public final boolean m48051a(@NotNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
            C2668g.b(appVisibilityTracker$Visibility, "it");
            return appVisibilityTracker$Visibility == AppVisibilityTracker$Visibility.BACKGROUND ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.tab.listener.g$d */
    static final class C12009d<T> implements Consumer<TutorialViewStatus> {
        /* renamed from: a */
        final /* synthetic */ C13393g f38971a;

        C12009d(C13393g c13393g) {
            this.f38971a = c13393g;
        }

        public /* synthetic */ void accept(Object obj) {
            m48052a((TutorialViewStatus) obj);
        }

        /* renamed from: a */
        public final void m48052a(TutorialViewStatus tutorialViewStatus) {
            C13393g.m51801b(this.f38971a).startEditButtonAnimation();
        }
    }

    @NotNull
    /* renamed from: b */
    public static final /* synthetic */ ProfileTabView m51801b(C13393g c13393g) {
        c13393g = c13393g.f42464a;
        if (c13393g == null) {
            C2668g.b("profileTabView");
        }
        return c13393g;
    }

    public C13393g(@NotNull MainPage mainPage, @NotNull CheckTutorialViewed checkTutorialViewed, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull AppVisibilityTracker appVisibilityTracker, @NotNull AbTestUtility abTestUtility) {
        C2668g.b(mainPage, "page");
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        C2668g.b(confirmTutorialsViewed, "confirmTutorialsViewed");
        C2668g.b(appVisibilityTracker, "appVisibilityTracker");
        C2668g.b(abTestUtility, "abTestUtility");
        super(mainPage);
        this.f42465b = checkTutorialViewed;
        this.f42466c = confirmTutorialsViewed;
        this.f42467d = appVisibilityTracker;
        this.f42468e = abTestUtility;
    }

    public void onPageSelected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page, @Nullable TabbedPageLayout$Page tabbedPageLayout$Page2) {
        C2668g.b(tabbedPageLayout$Page, "selectedPage");
        super.onPageSelected(tabbedPageLayout$Page, tabbedPageLayout$Page2);
        if (tabbedPageLayout$Page == MainPage.PROFILE) {
            tabbedPageLayout$Page = this.f42466c.execute((Tutorial) ProfileAwarenessMarker.INSTANCE).c().b(C3960g.a(Boolean.valueOf(this.f42468e.newNewExperiment().m36692a())).a(C12005a.f38967a).a(new C12007b(this)).d()).takeUntil(this.f42467d.trackVisibility().filter(C12008c.f38970a)).subscribeOn(C15756a.b()).observeOn(C15674a.a());
            Consumer consumer = (Consumer) new C12009d(this);
            Function1 function1 = ProfileTabPageSelectedListener$onPageSelected$5.f45322a;
            if (function1 != null) {
                function1 = new C12010h(function1);
            }
            tabbedPageLayout$Page.subscribe(consumer, (Consumer) function1);
        }
    }

    /* renamed from: a */
    public final void m51802a(@NotNull ProfileTabView profileTabView) {
        C2668g.b(profileTabView, "profileTabView");
        this.f42464a = profileTabView;
    }
}
