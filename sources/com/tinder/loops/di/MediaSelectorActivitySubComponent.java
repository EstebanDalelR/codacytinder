package com.tinder.loops.di;

import com.tinder.loops.activity.MediaSelectorActivity;
import com.tinder.loops.views.EmptyStateContainerView;
import com.tinder.loops.views.MediaSelectorView;
import com.tinder.loops.views.MediaTabsView;
import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/tinder/loops/di/MediaSelectorActivitySubComponent;", "", "inject", "", "mediaSelectorActivity", "Lcom/tinder/loops/activity/MediaSelectorActivity;", "emptyStateContainerView", "Lcom/tinder/loops/views/EmptyStateContainerView;", "mediaSelectorView", "Lcom/tinder/loops/views/MediaSelectorView;", "mediaTabsView", "Lcom/tinder/loops/views/MediaTabsView;", "Builder", "loops_release"}, k = 1, mv = {1, 1, 10})
@Subcomponent
public interface MediaSelectorActivitySubComponent {

    @dagger.Subcomponent.Builder
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/loops/di/MediaSelectorActivitySubComponent$Builder;", "", "build", "Lcom/tinder/loops/di/MediaSelectorActivitySubComponent;", "loops_release"}, k = 1, mv = {1, 1, 10})
    public interface Builder {
        @NotNull
        MediaSelectorActivitySubComponent build();
    }

    void inject(@NotNull MediaSelectorActivity mediaSelectorActivity);

    void inject(@NotNull EmptyStateContainerView emptyStateContainerView);

    void inject(@NotNull MediaSelectorView mediaSelectorView);

    void inject(@NotNull MediaTabsView mediaTabsView);
}
