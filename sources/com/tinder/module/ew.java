package com.tinder.module;

import com.tinder.domain.places.logging.PlacesLogger;
import com.tinder.places.main.view.C12374e;
import com.tinder.places.main.view.PlacesView$Decorator;
import com.tinder.places.p352c.C12297a;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/module/PlacesLoggingModule;", "", "()V", "provideNoOpPlacesViewDecorator", "Lcom/tinder/places/main/view/PlacesView$Decorator;", "provideNoopPlacesLogger", "Lcom/tinder/domain/places/logging/PlacesLogger;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
public final class ew {
    @NotNull
    @Provides
    /* renamed from: a */
    public final PlacesView$Decorator m40893a() {
        return new C12374e();
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final PlacesLogger m40894b() {
        return new C12297a();
    }
}
