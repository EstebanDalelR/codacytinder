package com.tinder.module;

import javax.annotation.Nonnull;

public interface MatchesViewComponentProvider {
    @Nonnull
    MatchesViewComponent provideMatchesViewComponent();

    void setMatchesViewComponent(@Nonnull MatchesViewComponent matchesViewComponent);
}
