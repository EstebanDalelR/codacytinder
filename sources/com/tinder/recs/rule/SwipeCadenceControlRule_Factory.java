package com.tinder.recs.rule;

import dagger.internal.Factory;

public final class SwipeCadenceControlRule_Factory implements Factory<SwipeCadenceControlRule> {
    private static final SwipeCadenceControlRule_Factory INSTANCE = new SwipeCadenceControlRule_Factory();

    public SwipeCadenceControlRule get() {
        return provideInstance();
    }

    public static SwipeCadenceControlRule provideInstance() {
        return new SwipeCadenceControlRule();
    }

    public static SwipeCadenceControlRule_Factory create() {
        return INSTANCE;
    }

    public static SwipeCadenceControlRule newSwipeCadenceControlRule() {
        return new SwipeCadenceControlRule();
    }
}
