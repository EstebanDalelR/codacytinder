package com.tinder.recs.card;

import dagger.internal.Factory;

public final class CardSizeProvider_Factory implements Factory<CardSizeProvider> {
    private static final CardSizeProvider_Factory INSTANCE = new CardSizeProvider_Factory();

    public CardSizeProvider get() {
        return provideInstance();
    }

    public static CardSizeProvider provideInstance() {
        return new CardSizeProvider();
    }

    public static CardSizeProvider_Factory create() {
        return INSTANCE;
    }

    public static CardSizeProvider newCardSizeProvider() {
        return new CardSizeProvider();
    }
}
