package com.tinder.analytics.fireworks;

import javax.annotation.Nonnull;

public interface EventAdapter<E> {
    @Nonnull
    C2632i createFireworksEvent(@Nonnull E e);
}
