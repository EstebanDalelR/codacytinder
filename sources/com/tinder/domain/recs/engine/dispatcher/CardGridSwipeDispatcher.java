package com.tinder.domain.recs.engine.dispatcher;

import android.support.annotation.WorkerThread;
import com.tinder.domain.recs.model.RatingResult;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.util.ConnectivityProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\b\u0010\r\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/CardGridSwipeDispatcher;", "Lcom/tinder/domain/recs/engine/dispatcher/SwipeDispatcher;", "ratingProcessor", "Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "(Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;Lcom/tinder/util/ConnectivityProvider;)V", "cancel", "", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "clear", "dispatch", "restart", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class CardGridSwipeDispatcher implements SwipeDispatcher {
    private final ConnectivityProvider connectivityProvider;
    private final RatingProcessor ratingProcessor;

    public void cancel(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
    }

    public void clear() {
    }

    public void restart() {
    }

    public CardGridSwipeDispatcher(@NotNull RatingProcessor ratingProcessor, @NotNull ConnectivityProvider connectivityProvider) {
        C2668g.b(ratingProcessor, "ratingProcessor");
        C2668g.b(connectivityProvider, "connectivityProvider");
        this.ratingProcessor = ratingProcessor;
        this.connectivityProvider = connectivityProvider;
    }

    @WorkerThread
    public void dispatch(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        if (this.connectivityProvider.a()) {
            swipe = this.ratingProcessor.rate(swipe);
            Action1 action1 = CardGridSwipeDispatcher$dispatch$1.INSTANCE;
            Function1 function1 = CardGridSwipeDispatcher$dispatch$2.INSTANCE;
            if (function1 != null) {
                function1 = new CardGridSwipeDispatcherKt$sam$Action1$905b70fd(function1);
            }
            swipe.a(action1, (Action1) function1);
            return;
        }
        this.ratingProcessor.markSwipeAsRated(swipe, RatingResult.ERROR);
    }
}
