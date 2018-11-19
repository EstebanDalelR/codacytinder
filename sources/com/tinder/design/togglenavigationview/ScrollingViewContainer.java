package com.tinder.design.togglenavigationview;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/tinder/design/togglenavigationview/ScrollingViewContainer;", "", "onPreScroll", "", "dx", "onScroll", "", "onScrollFinished", "onScrollStarted", "requestDisallowInterceptTouchEvent", "disallow", "", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
public interface ScrollingViewContainer {
    int onPreScroll(int i);

    void onScroll(int i);

    void onScrollFinished();

    void onScrollStarted();

    void requestDisallowInterceptTouchEvent(boolean z);
}
