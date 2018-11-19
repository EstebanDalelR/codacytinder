package com.tinder.domain.recs.engine.dispatcher;

import com.tinder.domain.recs.RatingsApiClient;
import com.tinder.domain.recs.SwipeDataStore;
import com.tinder.domain.recs.engine.dispatcher.common.DispatchableSwipeProvider;
import com.tinder.domain.recs.engine.dispatcher.common.DispatcherStateProvider;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.util.ConnectivityProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/SwipeDispatcher;", "", "cancel", "", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "clear", "dispatch", "restart", "Factory", "engine_release"}, k = 1, mv = {1, 1, 9})
public interface SwipeDispatcher {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/SwipeDispatcher$Factory;", "", "ratingsApiClient", "Lcom/tinder/domain/recs/RatingsApiClient;", "swipeDataStore", "Lcom/tinder/domain/recs/SwipeDataStore;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "(Lcom/tinder/domain/recs/RatingsApiClient;Lcom/tinder/domain/recs/SwipeDataStore;Lcom/tinder/util/ConnectivityProvider;)V", "ratingProcessor", "Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;", "getRatingProcessor", "()Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;", "createBlocking", "Lcom/tinder/domain/recs/engine/dispatcher/SwipeDispatcher;", "createCardGrid", "createNonBlocking", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Factory {
        private final ConnectivityProvider connectivityProvider;
        @NotNull
        private final RatingProcessor ratingProcessor;
        private final SwipeDataStore swipeDataStore;

        public Factory(@NotNull RatingsApiClient ratingsApiClient, @NotNull SwipeDataStore swipeDataStore, @NotNull ConnectivityProvider connectivityProvider) {
            C2668g.b(ratingsApiClient, "ratingsApiClient");
            C2668g.b(swipeDataStore, "swipeDataStore");
            C2668g.b(connectivityProvider, "connectivityProvider");
            this.swipeDataStore = swipeDataStore;
            this.connectivityProvider = connectivityProvider;
            this.ratingProcessor = new RatingProcessor(ratingsApiClient);
        }

        @NotNull
        public final RatingProcessor getRatingProcessor() {
            return this.ratingProcessor;
        }

        @NotNull
        public final SwipeDispatcher createBlocking() {
            return new BlockingSwipeDispatcher(this.ratingProcessor, this.connectivityProvider);
        }

        @NotNull
        public final SwipeDispatcher createNonBlocking() {
            return new NonBlockingSwipeDispatcher(this.swipeDataStore, new DispatcherStateProvider(), new DispatchableSwipeProvider(), this.ratingProcessor, this.connectivityProvider);
        }

        @NotNull
        public final SwipeDispatcher createCardGrid() {
            return new CardGridSwipeDispatcher(this.ratingProcessor, this.connectivityProvider);
        }
    }

    void cancel(@NotNull Swipe swipe);

    void clear();

    void dispatch(@NotNull Swipe swipe);

    void restart();
}
