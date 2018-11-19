package com.tinder.module;

import com.tinder.feed.p248c.C9461b;
import com.tinder.feed.view.FeedCarouselView;
import com.tinder.feed.view.FeedMainView;
import com.tinder.feed.view.FeedSpotifyTrackPlayerView;
import com.tinder.feed.view.feed.C11729a;
import com.tinder.feed.view.feed.C11735j;
import com.tinder.feed.view.feed.C11738m;
import com.tinder.feed.view.feed.C11740o;
import com.tinder.feed.view.feed.C11742q;
import com.tinder.feed.view.feed.C11744s;
import com.tinder.feed.view.feed.C11746u;
import com.tinder.feed.view.feed.C11748w;
import com.tinder.feed.view.feed.C11750y;
import com.tinder.feed.view.feed.aa;
import com.tinder.feed.view.footer.FeedFooterDescriptionView;
import com.tinder.feed.view.footer.FeedFooterView;
import com.tinder.feed.view.footer.FeedInstagramFooterDescriptionView;
import com.tinder.feed.view.info.FeedBadgeAttributionIcon;
import com.tinder.feed.view.info.FeedInfoView;
import com.tinder.feed.view.message.FeedCommentComposerView;
import com.tinder.feed.view.message.FeedCommentView;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;

@ViewScope
@Subcomponent(modules = {C9461b.class})
public interface FeedViewComponent {

    @dagger.Subcomponent.Builder
    public interface Builder {
        FeedViewComponent build();

        @BindsInstance
        Builder feedMainView(FeedMainView feedMainView);
    }

    @Module(subcomponents = {FeedViewComponent.class})
    /* renamed from: com.tinder.module.FeedViewComponent$a */
    public static class C9936a {
    }

    void inject(FeedCarouselView feedCarouselView);

    void inject(FeedMainView feedMainView);

    void inject(FeedSpotifyTrackPlayerView feedSpotifyTrackPlayerView);

    void inject(C11729a c11729a);

    void inject(aa aaVar);

    void inject(C11735j c11735j);

    void inject(C11738m c11738m);

    void inject(C11740o c11740o);

    void inject(C11742q c11742q);

    void inject(C11744s c11744s);

    void inject(C11746u c11746u);

    void inject(C11748w c11748w);

    void inject(C11750y c11750y);

    void inject(FeedFooterDescriptionView feedFooterDescriptionView);

    void inject(FeedFooterView feedFooterView);

    void inject(FeedInstagramFooterDescriptionView feedInstagramFooterDescriptionView);

    void inject(FeedBadgeAttributionIcon feedBadgeAttributionIcon);

    void inject(FeedInfoView feedInfoView);

    void inject(FeedCommentComposerView feedCommentComposerView);

    void inject(FeedCommentView feedCommentView);
}
