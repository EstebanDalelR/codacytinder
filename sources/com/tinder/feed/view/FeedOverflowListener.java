package com.tinder.feed.view;

import com.tinder.feed.analytics.InteractType;
import com.tinder.feed.view.model.C9541g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/tinder/feed/view/FeedOverflowListener;", "", "onFeedbackProvided", "", "feedbackInfo", "Lcom/tinder/feed/view/model/FeedbackInfo;", "onItemSelected", "interactType", "Lcom/tinder/feed/analytics/InteractType;", "onOverflowButtonClicked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface FeedOverflowListener {
    void onFeedbackProvided(@NotNull C9541g c9541g);

    void onItemSelected(@NotNull InteractType interactType);

    void onOverflowButtonClicked();
}
