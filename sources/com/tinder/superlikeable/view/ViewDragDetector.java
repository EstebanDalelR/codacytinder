package com.tinder.superlikeable.view;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/tinder/superlikeable/view/ViewDragDetector;", "", "onInterceptTouchEvent", "", "motionEvent", "Landroid/view/MotionEvent;", "onTouchEvent", "Callback", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
public interface ViewDragDetector {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J0\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH&J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/tinder/superlikeable/view/ViewDragDetector$Callback;", "", "onSelectedViewDiscarded", "", "view", "Landroid/view/View;", "onViewDragged", "dx", "", "dy", "startX", "startY", "onViewReleased", "velocityX", "velocityY", "onViewSelected", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public interface Callback {
        void onSelectedViewDiscarded(@NotNull View view);

        void onViewDragged(@NotNull View view, float f, float f2, float f3, float f4);

        void onViewReleased(@NotNull View view, float f, float f2);

        void onViewSelected(@NotNull View view);
    }

    boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent);

    boolean onTouchEvent(@NotNull MotionEvent motionEvent);
}
