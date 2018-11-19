package com.tinder.analytics.fireworks;

import java.util.List;
import javax.annotation.Nonnull;
import rx.Observable;

public interface EventQueue {
    void addEvent(@Nonnull C2632i c2632i);

    @Nonnull
    Observable<List<C2632i>> flush();
}
