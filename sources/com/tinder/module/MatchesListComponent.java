package com.tinder.module;

import com.tinder.match.p292c.C9851g;
import com.tinder.match.views.MatchListView;
import com.tinder.match.views.MatchMessagesRowView;
import com.tinder.match.views.MatchesSearchView;
import com.tinder.match.views.NewMatchRowView;
import com.tinder.match.views.NewMatchesView;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ViewScope
@Subcomponent(modules = {C9851g.class})
@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u000e\u000fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u0010"}, d2 = {"Lcom/tinder/module/MatchesListComponent;", "", "inject", "", "matchListView", "Lcom/tinder/match/views/MatchListView;", "matchMessagesRowView", "Lcom/tinder/match/views/MatchMessagesRowView;", "matchesSearchView", "Lcom/tinder/match/views/MatchesSearchView;", "newMatchRowView", "Lcom/tinder/match/views/NewMatchRowView;", "newMatchesView", "Lcom/tinder/match/views/NewMatchesView;", "Builder", "InstallModule", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface MatchesListComponent {

    @dagger.Subcomponent.Builder
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/tinder/module/MatchesListComponent$Builder;", "", "build", "Lcom/tinder/module/MatchesListComponent;", "matchListView", "Lcom/tinder/match/views/MatchListView;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Builder {
        @NotNull
        MatchesListComponent build();

        @NotNull
        @BindsInstance
        Builder matchListView(@NotNull MatchListView matchListView);
    }

    @Module(subcomponents = {MatchesListComponent.class})
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/module/MatchesListComponent$InstallModule;", "", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.module.MatchesListComponent$a */
    public static final class C9937a {
    }

    void inject(@NotNull MatchListView matchListView);

    void inject(@NotNull MatchMessagesRowView matchMessagesRowView);

    void inject(@NotNull MatchesSearchView matchesSearchView);

    void inject(@NotNull NewMatchRowView newMatchRowView);

    void inject(@NotNull NewMatchesView newMatchesView);
}
