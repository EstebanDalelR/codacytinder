package com.tinder.cardstack.view;

import android.support.annotation.NonNull;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.model.SwipeDirection;

public interface OnPreSwipeListener {
    boolean onPreSwipe(@NonNull C8395a c8395a, @NonNull SwipeDirection swipeDirection);
}
