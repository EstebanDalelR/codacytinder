package com.tinder.app.dagger.component;

import com.tinder.app.dagger.module.toppicks.C8254a;
import com.tinder.recs.view.superlike.GridSuperLikeButtonInjector;
import com.tinder.toppicks.di.TopPicksInjector;
import com.tinder.toppicks.di.TopPicksScope;
import com.tinder.toppicks.dialog.TopPicksPaywallView;
import com.tinder.toppicks.view.TopPicksGoldView;
import com.tinder.toppicks.view.TopPicksGridRecsView;
import com.tinder.toppicks.view.TopPicksUserRecCardView;
import com.tinder.toppicks.view.TopPicksView;
import dagger.Module;
import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Subcomponent(modules = {C8254a.class})
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\f\rJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/tinder/app/dagger/component/TopPicksComponent;", "Lcom/tinder/toppicks/di/TopPicksInjector;", "Lcom/tinder/recs/view/superlike/GridSuperLikeButtonInjector;", "inject", "", "topPicksPaywallView", "Lcom/tinder/toppicks/dialog/TopPicksPaywallView;", "view", "Lcom/tinder/toppicks/view/TopPicksGoldView;", "Lcom/tinder/toppicks/view/TopPicksGridRecsView;", "Lcom/tinder/toppicks/view/TopPicksUserRecCardView;", "Lcom/tinder/toppicks/view/TopPicksView;", "Builder", "InstallModule", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@TopPicksScope
public interface TopPicksComponent extends GridSuperLikeButtonInjector, TopPicksInjector {

    @dagger.Subcomponent.Builder
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/app/dagger/component/TopPicksComponent$Builder;", "", "build", "Lcom/tinder/app/dagger/component/TopPicksComponent;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Builder {
        @NotNull
        TopPicksComponent build();
    }

    @Module(subcomponents = {TopPicksComponent.class})
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/app/dagger/component/TopPicksComponent$InstallModule;", "", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.app.dagger.component.TopPicksComponent$a */
    public static final class C8240a {
    }

    void inject(@NotNull TopPicksPaywallView topPicksPaywallView);

    void inject(@NotNull TopPicksGoldView topPicksGoldView);

    void inject(@NotNull TopPicksGridRecsView topPicksGridRecsView);

    void inject(@NotNull TopPicksUserRecCardView topPicksUserRecCardView);

    void inject(@NotNull TopPicksView topPicksView);
}
