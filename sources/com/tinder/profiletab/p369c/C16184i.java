package com.tinder.profiletab.p369c;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.design.tabbedpagelayout.model.ScrollState;
import com.tinder.domain.common.reactivex.usecase.SingleResultUseCase;
import com.tinder.domain.profile.model.Tutorial.LoopsNewMediaSelectorTooltip;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.home.p259b.C9695a;
import com.tinder.main.model.MainPage;
import com.tinder.profiletab.p367a.C14458a;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/profiletab/usecase/ShouldShowAddMediaTooltip;", "Lcom/tinder/domain/common/reactivex/usecase/SingleResultUseCase;", "", "homePageTabSelectedProvider", "Lcom/tinder/home/provider/HomePageTabSelectedProvider;", "mainPageScrollStateChangedProvider", "Lcom/tinder/profiletab/provider/MainPageScrollStateChangedProvider;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "(Lcom/tinder/home/provider/HomePageTabSelectedProvider;Lcom/tinder/profiletab/provider/MainPageScrollStateChangedProvider;Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;)V", "execute", "Lio/reactivex/Single;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profiletab.c.i */
public final class C16184i implements SingleResultUseCase<Boolean> {
    /* renamed from: a */
    private final C9695a f50399a;
    /* renamed from: b */
    private final C14458a f50400b;
    /* renamed from: c */
    private final CheckTutorialViewed f50401c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.c.i$a */
    static final class C16179a<T> implements Predicate<TabbedPageLayout$Page> {
        /* renamed from: a */
        public static final C16179a f50394a = new C16179a();

        C16179a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m61128a((TabbedPageLayout$Page) obj);
        }

        /* renamed from: a */
        public final boolean m61128a(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
            C2668g.b(tabbedPageLayout$Page, "it");
            return tabbedPageLayout$Page == MainPage.PROFILE ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.c.i$b */
    static final class C16180b<T> implements Predicate<ScrollState> {
        /* renamed from: a */
        public static final C16180b f50395a = new C16180b();

        C16180b() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m61129a((ScrollState) obj);
        }

        /* renamed from: a */
        public final boolean m61129a(@NotNull ScrollState scrollState) {
            C2668g.b(scrollState, "it");
            return scrollState == ScrollState.SCROLL_STATE_IDLE ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "page", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "scrollState", "Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.c.i$c */
    static final class C16181c<T1, T2, R> implements BiFunction<TabbedPageLayout$Page, ScrollState, C15813i> {
        /* renamed from: a */
        public static final C16181c f50396a = new C16181c();

        C16181c() {
        }

        /* renamed from: a */
        public final void m61130a(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page, @NotNull ScrollState scrollState) {
            C2668g.b(tabbedPageLayout$Page, "page");
            C2668g.b(scrollState, "scrollState");
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            m61130a((TabbedPageLayout$Page) obj, (ScrollState) obj2);
            return C15813i.f49016a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "it", "", "apply", "(Lkotlin/Unit;)Lio/reactivex/Single;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.c.i$d */
    static final class C16182d<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C16184i f50397a;

        C16182d(C16184i c16184i) {
            this.f50397a = c16184i;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m61131a((C15813i) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<TutorialViewStatus> m61131a(@NotNull C15813i c15813i) {
            C2668g.b(c15813i, "it");
            return this.f50397a.f50401c.execute(LoopsNewMediaSelectorTooltip.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.c.i$e */
    static final class C16183e<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16183e f50398a = new C16183e();

        C16183e() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m61132a((TutorialViewStatus) obj));
        }

        /* renamed from: a */
        public final boolean m61132a(@NotNull TutorialViewStatus tutorialViewStatus) {
            C2668g.b(tutorialViewStatus, "it");
            return tutorialViewStatus == TutorialViewStatus.UNSEEN ? true : null;
        }
    }

    @Inject
    public C16184i(@NotNull C9695a c9695a, @NotNull C14458a c14458a, @NotNull CheckTutorialViewed checkTutorialViewed) {
        C2668g.b(c9695a, "homePageTabSelectedProvider");
        C2668g.b(c14458a, "mainPageScrollStateChangedProvider");
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        this.f50399a = c9695a;
        this.f50400b = c14458a;
        this.f50401c = checkTutorialViewed;
    }

    @NotNull
    public C3960g<Boolean> execute() {
        C3960g<Boolean> e = C3960g.a(RxJavaInteropExtKt.toV2Observable(this.f50399a.a()).filter(C16179a.f50394a).firstElement().e(), this.f50400b.m55187a().filter(C16180b.f50395a).firstElement().e(), C16181c.f50396a).a(new C16182d(this)).e(C16183e.f50398a);
        C2668g.a(e, "Single.zip(\n            …torialViewStatus.UNSEEN }");
        return e;
    }
}
