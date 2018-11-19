package com.tinder.recs.domain.rule;

import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.rule.SuccessfulSwipeTerminationRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import io.reactivex.schedulers.C15756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/recs/domain/rule/SwipeCountSwipeTerminationRule;", "Lcom/tinder/domain/recs/rule/SuccessfulSwipeTerminationRule;", "swipeCountRepository", "Lcom/tinder/recs/domain/repository/SwipeCountRepository;", "(Lcom/tinder/recs/domain/repository/SwipeCountRepository;)V", "perform", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule$ResultType;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SwipeCountSwipeTerminationRule implements SuccessfulSwipeTerminationRule {
    private final SwipeCountRepository swipeCountRepository;

    public SwipeCountSwipeTerminationRule(@NotNull SwipeCountRepository swipeCountRepository) {
        C2668g.b(swipeCountRepository, "swipeCountRepository");
        this.swipeCountRepository = swipeCountRepository;
    }

    @NotNull
    public ResultType perform(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        this.swipeCountRepository.incrementSwipeCount().b(C15756a.m59010b()).a(SwipeCountSwipeTerminationRule$perform$1.INSTANCE, SwipeCountSwipeTerminationRule$perform$2.INSTANCE);
        return ResultType.PROCEED;
    }
}
