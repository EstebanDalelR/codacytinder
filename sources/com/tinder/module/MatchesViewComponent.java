package com.tinder.module;

import com.tinder.feed.view.MatchFeedTabView;
import com.tinder.feed.view.MatchMessagesTabView;
import com.tinder.match.views.C12108h;
import com.tinder.match.views.MatchMainView;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;

@ViewScope
@Subcomponent
public interface MatchesViewComponent {

    @dagger.Subcomponent.Builder
    public interface Builder {
        MatchesViewComponent build();

        @BindsInstance
        Builder matchMainView(MatchMainView matchMainView);
    }

    @Module(subcomponents = {MatchesViewComponent.class})
    /* renamed from: com.tinder.module.MatchesViewComponent$a */
    public static class C9938a {
    }

    void inject(MatchFeedTabView matchFeedTabView);

    void inject(MatchMessagesTabView matchMessagesTabView);

    void inject(MatchMainView matchMainView);

    void inject(C12108h c12108h);
}
