package com.tinder.fastmatch;

import com.tinder.fastmatch.view.FastMatchRecsActivity;
import com.tinder.fastmatch.view.FastMatchRecsActivity.Source;
import com.tinder.fastmatch.view.FastMatchRecsToolbarView;
import com.tinder.fastmatch.view.FastMatchRecsView;
import com.tinder.fastmatch.view.FastMatchUserRecCardView;
import com.tinder.recs.view.UserRecCardHeadLineView;
import com.tinder.scope.ActivityScope;
import dagger.BindsInstance;
import dagger.Subcomponent;

@Subcomponent(modules = {C9370a.class})
@ActivityScope
public interface FastMatchRecsActivityComponent {

    @dagger.Subcomponent.Builder
    public interface Builder {
        FastMatchRecsActivityComponent build();

        @BindsInstance
        Builder source(@FastMatchRecsActivitySource Source source);
    }

    void inject(FastMatchRecsActivity fastMatchRecsActivity);

    void inject(FastMatchRecsToolbarView fastMatchRecsToolbarView);

    void inject(FastMatchRecsView fastMatchRecsView);

    void inject(FastMatchUserRecCardView fastMatchUserRecCardView);

    void inject(UserRecCardHeadLineView userRecCardHeadLineView);
}
