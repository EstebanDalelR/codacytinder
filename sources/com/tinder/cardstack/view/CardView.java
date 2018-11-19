package com.tinder.cardstack.view;

import android.support.annotation.NonNull;

public interface CardView<T> {
    void bind(T t);

    void onAttachedToCardCollectionLayout(@NonNull CardCollectionLayout cardCollectionLayout);

    void onCardViewRecycled();

    void onDetachedFromCardCollectionLayout(@NonNull CardCollectionLayout cardCollectionLayout);

    void onMovedToTop(T t);

    void onRemovedFromTop(T t);
}
