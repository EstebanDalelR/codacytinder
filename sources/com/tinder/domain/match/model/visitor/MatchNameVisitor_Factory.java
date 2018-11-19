package com.tinder.domain.match.model.visitor;

import dagger.internal.Factory;

public final class MatchNameVisitor_Factory implements Factory<MatchNameVisitor> {
    private static final MatchNameVisitor_Factory INSTANCE = new MatchNameVisitor_Factory();

    public MatchNameVisitor get() {
        return provideInstance();
    }

    public static MatchNameVisitor provideInstance() {
        return new MatchNameVisitor();
    }

    public static MatchNameVisitor_Factory create() {
        return INSTANCE;
    }

    public static MatchNameVisitor newMatchNameVisitor() {
        return new MatchNameVisitor();
    }
}
