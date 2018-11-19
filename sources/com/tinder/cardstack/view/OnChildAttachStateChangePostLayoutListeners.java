package com.tinder.cardstack.view;

import android.view.View;

public interface OnChildAttachStateChangePostLayoutListeners {
    void onChildViewAttachedPostLayout(View view);

    void onChildViewDetachedPostLayout(View view);
}
