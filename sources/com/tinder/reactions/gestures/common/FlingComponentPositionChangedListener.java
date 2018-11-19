package com.tinder.reactions.gestures.common;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/tinder/reactions/gestures/common/FlingComponentPositionChangedListener;", "", "verticalPositionChangedOnDrag", "", "currentY", "", "topYLimit", "bottomYLimit", "verticalPositionChangedOnGlide", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface FlingComponentPositionChangedListener {
    void verticalPositionChangedOnDrag(float f, float f2, float f3);

    void verticalPositionChangedOnGlide(float f, float f2, float f3);
}
