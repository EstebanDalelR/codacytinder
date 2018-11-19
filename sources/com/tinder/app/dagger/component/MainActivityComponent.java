package com.tinder.app.dagger.component;

import com.tinder.activities.MainActivity;
import com.tinder.app.dagger.component.ProfileTabViewComponent.C8238a;
import com.tinder.app.dagger.component.SuperLikeableViewComponent.C8239a;
import com.tinder.app.dagger.component.TopPicksComponent.C8240a;
import com.tinder.app.dagger.module.C8250h;
import com.tinder.app.dagger.module.main.MainViewModule;
import com.tinder.home.injector.MainActivityInjector;
import com.tinder.main.di.MainViewComponent$Parent;
import com.tinder.module.FeedViewComponent.C9936a;
import com.tinder.module.MatchesListComponent.C9937a;
import com.tinder.module.MatchesViewComponent.C9938a;
import com.tinder.profiletab.injector.ProfileTabViewInjector;
import com.tinder.profiletab.view.ProfileTabView;
import com.tinder.recs.component.RecsViewComponent.InstallModule;
import com.tinder.recs.injection.RecsCardsInjector;
import com.tinder.scope.ActivityScope;
import com.tinder.superlikeable.injector.SuperLikeableInjector;
import com.tinder.superlikeable.view.SuperLikeableViewContainer;
import com.tinder.toppicks.di.TopPicksInjector;
import com.tinder.video.injection.VideoInjector;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Subcomponent(modules = {C8250h.class, InstallModule.class, C9938a.class, C9937a.class, C9936a.class, C8238a.class, C8239a.class, C8240a.class, MainViewModule.class})
@ActivityScope
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020#H\u0016¨\u0006%"}, d2 = {"Lcom/tinder/app/dagger/component/MainActivityComponent;", "Lcom/tinder/home/injector/MainActivityInjector;", "Lcom/tinder/main/di/MainViewComponent$Parent;", "()V", "newFeedViewComponentBuilder", "Lcom/tinder/module/FeedViewComponent$Builder;", "newMatchesListComponentBuilder", "Lcom/tinder/module/MatchesListComponent$Builder;", "newMatchesViewComponentBuilder", "Lcom/tinder/module/MatchesViewComponent$Builder;", "newProfileTabInjector", "Lcom/tinder/profiletab/injector/ProfileTabViewInjector;", "profileTabView", "Lcom/tinder/profiletab/view/ProfileTabView;", "newProfileTabViewComponentBuilder", "Lcom/tinder/app/dagger/component/ProfileTabViewComponent$Builder;", "newRecsCardsComponentBuilder", "Lcom/tinder/app/dagger/component/RecsCardsComponent$Builder;", "newRecsCardsInjector", "Lcom/tinder/recs/injection/RecsCardsInjector;", "newRecsViewComponentBuilder", "Lcom/tinder/recs/component/RecsViewComponent$Builder;", "newSuperLikeableInjector", "Lcom/tinder/superlikeable/injector/SuperLikeableInjector;", "superLikeableViewContainer", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer;", "newSuperLikeableViewComponentBuilder", "Lcom/tinder/app/dagger/component/SuperLikeableViewComponent$Builder;", "newTopPicksComponentBuilder", "Lcom/tinder/app/dagger/component/TopPicksComponent$Builder;", "newTopPicksInjector", "Lcom/tinder/toppicks/di/TopPicksInjector;", "newVideoComponentBuilder", "Lcom/tinder/app/dagger/component/VideoComponent$Builder;", "newVideoInjector", "Lcom/tinder/video/injection/VideoInjector;", "Builder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class MainActivityComponent implements MainActivityInjector, MainViewComponent$Parent {

    @dagger.Subcomponent.Builder
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/tinder/app/dagger/component/MainActivityComponent$Builder;", "", "build", "Lcom/tinder/app/dagger/component/MainActivityComponent;", "mainActivity", "Lcom/tinder/activities/MainActivity;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Builder {
        @NotNull
        MainActivityComponent build();

        @NotNull
        @BindsInstance
        Builder mainActivity(@NotNull MainActivity mainActivity);
    }

    @NotNull
    /* renamed from: a */
    public abstract com.tinder.recs.component.RecsViewComponent.Builder m14688a();

    @NotNull
    /* renamed from: b */
    public abstract com.tinder.module.MatchesViewComponent.Builder m14689b();

    @NotNull
    /* renamed from: c */
    public abstract com.tinder.module.MatchesListComponent.Builder m14690c();

    @NotNull
    /* renamed from: d */
    public abstract com.tinder.module.FeedViewComponent.Builder m14691d();

    @NotNull
    /* renamed from: e */
    public abstract com.tinder.app.dagger.component.ProfileTabViewComponent.Builder m14692e();

    @NotNull
    /* renamed from: f */
    public abstract com.tinder.app.dagger.component.SuperLikeableViewComponent.Builder m14693f();

    @NotNull
    /* renamed from: g */
    public abstract com.tinder.app.dagger.component.TopPicksComponent.Builder m14694g();

    @NotNull
    /* renamed from: h */
    public abstract com.tinder.app.dagger.component.VideoComponent.Builder m14695h();

    @NotNull
    /* renamed from: i */
    public abstract com.tinder.app.dagger.component.RecsCardsComponent.Builder m14696i();

    @NotNull
    public SuperLikeableInjector newSuperLikeableInjector(@NotNull SuperLikeableViewContainer superLikeableViewContainer) {
        C2668g.m10309b(superLikeableViewContainer, "superLikeableViewContainer");
        return m14693f().superLikeableView(superLikeableViewContainer).build();
    }

    @NotNull
    public ProfileTabViewInjector newProfileTabInjector(@NotNull ProfileTabView profileTabView) {
        C2668g.m10309b(profileTabView, "profileTabView");
        return m14692e().profileTabView(profileTabView).build();
    }

    @NotNull
    public TopPicksInjector newTopPicksInjector() {
        return m14694g().build();
    }

    @NotNull
    public VideoInjector newVideoInjector() {
        return m14695h().build();
    }

    @NotNull
    public RecsCardsInjector newRecsCardsInjector() {
        return m14696i().build();
    }
}
