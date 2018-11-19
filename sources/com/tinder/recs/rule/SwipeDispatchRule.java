package com.tinder.recs.rule;

import com.tinder.domain.recs.engine.dispatcher.SwipeDispatcher;
import com.tinder.domain.recs.engine.dispatcher.SwipeDispatcher.Factory;
import com.tinder.domain.recs.model.RecSource.FastMatch;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.rule.PostSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.superlike.p421e.C15082f;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/recs/rule/SwipeDispatchRule;", "Lcom/tinder/domain/recs/rule/PostSwipeConsumptionRule;", "swipeDispatcherFactory", "Lcom/tinder/domain/recs/engine/dispatcher/SwipeDispatcher$Factory;", "superlikeStatusProvider", "Lcom/tinder/superlike/provider/SuperlikeStatusProvider;", "(Lcom/tinder/domain/recs/engine/dispatcher/SwipeDispatcher$Factory;Lcom/tinder/superlike/provider/SuperlikeStatusProvider;)V", "blockingSwipeDispatcher", "Lcom/tinder/domain/recs/engine/dispatcher/SwipeDispatcher;", "getBlockingSwipeDispatcher", "()Lcom/tinder/domain/recs/engine/dispatcher/SwipeDispatcher;", "cardGridSwipeDispatcher", "getCardGridSwipeDispatcher", "nonBlockingSwipeDispatcher", "getNonBlockingSwipeDispatcher", "perform", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule$ResultType;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SwipeDispatchRule implements PostSwipeConsumptionRule {
    @NotNull
    private final SwipeDispatcher blockingSwipeDispatcher = this.swipeDispatcherFactory.createBlocking();
    @NotNull
    private final SwipeDispatcher cardGridSwipeDispatcher = this.swipeDispatcherFactory.createCardGrid();
    @NotNull
    private final SwipeDispatcher nonBlockingSwipeDispatcher = this.swipeDispatcherFactory.createNonBlocking();
    private final C15082f superlikeStatusProvider;
    private final Factory swipeDispatcherFactory;

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Type.values().length];

        static {
            $EnumSwitchMapping$0[Type.LIKE.ordinal()] = 1;
            $EnumSwitchMapping$0[Type.PASS.ordinal()] = 2;
            $EnumSwitchMapping$0[Type.SUPERLIKE.ordinal()] = 3;
        }
    }

    @Inject
    public SwipeDispatchRule(@NotNull Factory factory, @NotNull C15082f c15082f) {
        C2668g.b(factory, "swipeDispatcherFactory");
        C2668g.b(c15082f, "superlikeStatusProvider");
        this.swipeDispatcherFactory = factory;
        this.superlikeStatusProvider = c15082f;
    }

    @NotNull
    public final SwipeDispatcher getNonBlockingSwipeDispatcher() {
        return this.nonBlockingSwipeDispatcher;
    }

    @NotNull
    public final SwipeDispatcher getBlockingSwipeDispatcher() {
        return this.blockingSwipeDispatcher;
    }

    @NotNull
    public final SwipeDispatcher getCardGridSwipeDispatcher() {
        return this.cardGridSwipeDispatcher;
    }

    @NotNull
    public ResultType perform(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        if (C2668g.a(swipe.getRec().getSource(), FastMatch.INSTANCE)) {
            this.cardGridSwipeDispatcher.dispatch(swipe);
            return ResultType.PROCEED;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[swipe.getType().ordinal()]) {
            case 1:
            case 2:
                this.nonBlockingSwipeDispatcher.dispatch(swipe);
                break;
            case 3:
                try {
                    this.superlikeStatusProvider.m56834a(true);
                    this.blockingSwipeDispatcher.dispatch(swipe);
                } catch (Throwable th) {
                    this.superlikeStatusProvider.m56834a(false);
                }
                this.superlikeStatusProvider.m56834a(false);
                break;
            default:
                break;
        }
        return ResultType.PROCEED;
    }
}
