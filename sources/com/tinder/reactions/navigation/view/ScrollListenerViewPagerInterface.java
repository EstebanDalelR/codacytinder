package com.tinder.reactions.navigation.view;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/tinder/reactions/navigation/view/ScrollListenerViewPagerInterface;", "", "addScrollListener", "", "listener", "Lcom/tinder/reactions/navigation/view/ScrollListenerViewPagerInterface$OnScrollChangeListener;", "removeScrollListener", "OnScrollChangeListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ScrollListenerViewPagerInterface {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/tinder/reactions/navigation/view/ScrollListenerViewPagerInterface$OnScrollChangeListener;", "", "onScrollChange", "", "v", "Landroid/view/View;", "scrollX", "", "scrollY", "oldScrollX", "oldScrollY", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface OnScrollChangeListener {
        void onScrollChange(@NotNull View view, int i, int i2, int i3, int i4);
    }

    void addScrollListener(@NotNull OnScrollChangeListener onScrollChangeListener);

    void removeScrollListener(@NotNull OnScrollChangeListener onScrollChangeListener);
}
