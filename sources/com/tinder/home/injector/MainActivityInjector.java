package com.tinder.home.injector;

import com.tinder.activities.MainActivity;
import com.tinder.profiletab.injector.ProfileTabViewInjector;
import com.tinder.profiletab.injector.ProfileTabViewInjector$Factory;
import com.tinder.profiletab.injector.ProfileTabViewInjector$Owner;
import com.tinder.profiletab.view.ProfileTabView;
import com.tinder.recs.injection.RecsCardsInjector;
import com.tinder.superlikeable.injector.SuperLikeableInjector;
import com.tinder.superlikeable.injector.SuperLikeableInjector$Factory;
import com.tinder.superlikeable.view.SuperLikeableViewContainer;
import com.tinder.toppicks.di.TopPicksInjector;
import com.tinder.toppicks.di.TopPicksInjector$Factory;
import com.tinder.video.injection.VideoInjector;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0014\u0015J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0016"}, d2 = {"Lcom/tinder/home/injector/MainActivityInjector;", "", "inject", "", "mainActivity", "Lcom/tinder/activities/MainActivity;", "newProfileTabInjector", "Lcom/tinder/profiletab/injector/ProfileTabViewInjector;", "profileTabView", "Lcom/tinder/profiletab/view/ProfileTabView;", "newRecsCardsInjector", "Lcom/tinder/recs/injection/RecsCardsInjector;", "newSuperLikeableInjector", "Lcom/tinder/superlikeable/injector/SuperLikeableInjector;", "superLikeableViewContainer", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer;", "newTopPicksInjector", "Lcom/tinder/toppicks/di/TopPicksInjector;", "newVideoInjector", "Lcom/tinder/video/injection/VideoInjector;", "Factory", "Owner", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface MainActivityInjector {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/home/injector/MainActivityInjector$Factory;", "", "createMainActivityInjector", "Lcom/tinder/home/injector/MainActivityInjector;", "mainActivity", "Lcom/tinder/activities/MainActivity;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Factory {
        @NotNull
        MainActivityInjector createMainActivityInjector(@NotNull MainActivity mainActivity);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tinder/home/injector/MainActivityInjector$Owner;", "Lcom/tinder/superlikeable/injector/SuperLikeableInjector$Factory;", "Lcom/tinder/profiletab/injector/ProfileTabViewInjector$Factory;", "Lcom/tinder/profiletab/injector/ProfileTabViewInjector$Owner;", "Lcom/tinder/toppicks/di/TopPicksInjector$Factory;", "mainActivityInjector", "Lcom/tinder/home/injector/MainActivityInjector;", "getMainActivityInjector", "()Lcom/tinder/home/injector/MainActivityInjector;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Owner extends ProfileTabViewInjector$Factory, ProfileTabViewInjector$Owner, SuperLikeableInjector$Factory, TopPicksInjector$Factory {
        @NotNull
        MainActivityInjector getMainActivityInjector();
    }

    void inject(@NotNull MainActivity mainActivity);

    @NotNull
    ProfileTabViewInjector newProfileTabInjector(@NotNull ProfileTabView profileTabView);

    @NotNull
    RecsCardsInjector newRecsCardsInjector();

    @NotNull
    SuperLikeableInjector newSuperLikeableInjector(@NotNull SuperLikeableViewContainer superLikeableViewContainer);

    @NotNull
    TopPicksInjector newTopPicksInjector();

    @NotNull
    VideoInjector newVideoInjector();
}
