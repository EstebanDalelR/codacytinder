package com.tinder.domain.recs.engine;

import android.support.annotation.UiThread;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.di.EngineScope;
import com.tinder.domain.di.IoScheduler;
import com.tinder.domain.di.MainThreadScheduler;
import com.tinder.domain.recs.GlobalRecsConsumptionEventPublisher;
import com.tinder.domain.recs.RecsEngine.Config;
import com.tinder.domain.recs.RecsRepository;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecsUpdate.Rewind.Reason;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.SwipeActionContext;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.SwipeTerminationEvent;
import com.tinder.domain.recs.rule.CardFreezing;
import com.tinder.domain.recs.rule.PreSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.util.RxUtils;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.C2671a;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.Subscription;
import rx.subjects.C19786b;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u00042345BK\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\"J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0007J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0007J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010/\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0007J\u000e\u00100\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0010\u00101\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000RN\u0010\u0014\u001aB\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u0016\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u0016 \u0017* \u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u0016\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u0016\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/tinder/domain/recs/engine/SwipeProcessor;", "", "recsRepository", "Lcom/tinder/domain/recs/RecsRepository;", "rulesResolver", "Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "config", "Lcom/tinder/domain/recs/RecsEngine$Config;", "globalRecsConsumptionEventPublisher", "Lcom/tinder/domain/recs/GlobalRecsConsumptionEventPublisher;", "swipeRulesProcessor", "Lcom/tinder/domain/recs/engine/SwipeProcessor$SwipeRulesProcessor;", "ioThreadScheduler", "Lrx/Scheduler;", "mainThreadScheduler", "(Lcom/tinder/domain/recs/RecsRepository;Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;Lcom/tinder/domain/recs/model/Rec$Source;Lcom/tinder/domain/recs/RecsEngine$Config;Lcom/tinder/domain/recs/GlobalRecsConsumptionEventPublisher;Lcom/tinder/domain/recs/engine/SwipeProcessor$SwipeRulesProcessor;Lrx/Scheduler;Lrx/Scheduler;)V", "swipeOperationSubscription", "Lrx/Subscription;", "terminationEventSubject", "Lrx/subjects/SerializedSubject;", "Lcom/tinder/domain/recs/model/SwipeTerminationEvent;", "kotlin.jvm.PlatformType", "consumeSwipe", "Lrx/Single;", "Lcom/tinder/domain/recs/model/Swipe;", "swipe", "notifyEarlyTermination", "", "throwable", "", "notifySuccessfulTermination", "observeSwipeTerminationEvents", "Lrx/Observable;", "processLikeOnRec", "rec", "Lcom/tinder/domain/recs/model/Rec;", "swipeActionContext", "Lcom/tinder/domain/recs/model/Swipe$SwipeActionContext;", "processPassOnRec", "processPostConsumptionRules", "processPreConsumptionRules", "processRewindSwipe", "reason", "Lcom/tinder/domain/recs/model/RecsUpdate$Rewind$Reason;", "processSuccessfulTerminationRules", "processSuperlikeOnRec", "processSwipe", "rewindLastSwipe", "ChainIllegallyInterruptedException", "ChainInterruptedException", "ChainLegallyInterruptedException", "SwipeRulesProcessor", "engine_release"}, k = 1, mv = {1, 1, 9})
@EngineScope
public final class SwipeProcessor {
    private final Config config;
    private final GlobalRecsConsumptionEventPublisher globalRecsConsumptionEventPublisher;
    private final C2671a ioThreadScheduler;
    private final C2671a mainThreadScheduler;
    private final Rec$Source recSource;
    private final RecsRepository recsRepository;
    private final SwipeProcessingRulesResolver rulesResolver;
    private Subscription swipeOperationSubscription;
    private final SwipeRulesProcessor swipeRulesProcessor;
    private final C19786b<SwipeTerminationEvent, SwipeTerminationEvent> terminationEventSubject = PublishSubject.w().B();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0010\u0018\u00002\u00060\u0001j\u0002`\u0002B#\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/domain/recs/engine/SwipeProcessor$ChainInterruptedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "rule", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule;", "cause", "", "(Ljava/lang/String;Lcom/tinder/domain/recs/rule/SwipeProcessingRule;Ljava/lang/Throwable;)V", "getRule", "()Lcom/tinder/domain/recs/rule/SwipeProcessingRule;", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static class ChainInterruptedException extends RuntimeException {
        @NotNull
        private final SwipeProcessingRule rule;

        @JvmOverloads
        public ChainInterruptedException(@NotNull String str, @NotNull SwipeProcessingRule swipeProcessingRule) {
            this(str, swipeProcessingRule, null, 4, null);
        }

        @NotNull
        public final SwipeProcessingRule getRule() {
            return this.rule;
        }

        @JvmOverloads
        public /* synthetic */ ChainInterruptedException(String str, SwipeProcessingRule swipeProcessingRule, Throwable th, int i, C15823e c15823e) {
            if ((i & 4) != 0) {
                th = null;
            }
            this(str, swipeProcessingRule, th);
        }

        @JvmOverloads
        public ChainInterruptedException(@NotNull String str, @NotNull SwipeProcessingRule swipeProcessingRule, @Nullable Throwable th) {
            C2668g.b(str, "message");
            C2668g.b(swipeProcessingRule, "rule");
            super(str, th);
            this.rule = swipeProcessingRule;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Lcom/tinder/domain/recs/engine/SwipeProcessor$SwipeRulesProcessor;", "", "()V", "processSwipeRules", "", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "rules", "", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule;", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class SwipeRulesProcessor {
        public final void processSwipeRules(@NotNull Swipe swipe, @NotNull Set<? extends SwipeProcessingRule> set) {
            C2668g.b(swipe, "swipe");
            C2668g.b(set, "rules");
            for (SwipeProcessingRule swipeProcessingRule : set) {
                try {
                    if (C2668g.a(swipeProcessingRule.perform(swipe), ResultType.INTERRUPT)) {
                        throw ((Throwable) new ChainLegallyInterruptedException("Swipe rules chain was interrupted.", swipeProcessingRule));
                    }
                } catch (Swipe swipe2) {
                    Throwable th = (Throwable) new ChainIllegallyInterruptedException("Error processing swiping rule.", swipeProcessingRule, swipe2);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/tinder/domain/recs/engine/SwipeProcessor$ChainIllegallyInterruptedException;", "Lcom/tinder/domain/recs/engine/SwipeProcessor$ChainInterruptedException;", "message", "", "processingRule", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule;", "cause", "", "(Ljava/lang/String;Lcom/tinder/domain/recs/rule/SwipeProcessingRule;Ljava/lang/Throwable;)V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class ChainIllegallyInterruptedException extends ChainInterruptedException {
        public ChainIllegallyInterruptedException(@NotNull String str, @NotNull SwipeProcessingRule swipeProcessingRule, @NotNull Throwable th) {
            C2668g.b(str, "message");
            C2668g.b(swipeProcessingRule, "processingRule");
            C2668g.b(th, ManagerWebServices.PARAM_CAUSE);
            super(str, swipeProcessingRule, th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/recs/engine/SwipeProcessor$ChainLegallyInterruptedException;", "Lcom/tinder/domain/recs/engine/SwipeProcessor$ChainInterruptedException;", "message", "", "processingRule", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule;", "(Ljava/lang/String;Lcom/tinder/domain/recs/rule/SwipeProcessingRule;)V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class ChainLegallyInterruptedException extends ChainInterruptedException {
        public ChainLegallyInterruptedException(@NotNull String str, @NotNull SwipeProcessingRule swipeProcessingRule) {
            C2668g.b(str, "message");
            C2668g.b(swipeProcessingRule, "processingRule");
            super(str, swipeProcessingRule, null, 4, null);
        }
    }

    @Inject
    public SwipeProcessor(@NotNull RecsRepository recsRepository, @NotNull SwipeProcessingRulesResolver swipeProcessingRulesResolver, @NotNull Rec$Source rec$Source, @NotNull Config config, @NotNull GlobalRecsConsumptionEventPublisher globalRecsConsumptionEventPublisher, @NotNull SwipeRulesProcessor swipeRulesProcessor, @NotNull @IoScheduler C2671a c2671a, @NotNull @MainThreadScheduler C2671a c2671a2) {
        C2668g.b(recsRepository, "recsRepository");
        C2668g.b(swipeProcessingRulesResolver, "rulesResolver");
        C2668g.b(rec$Source, "recSource");
        C2668g.b(config, "config");
        C2668g.b(globalRecsConsumptionEventPublisher, "globalRecsConsumptionEventPublisher");
        C2668g.b(swipeRulesProcessor, "swipeRulesProcessor");
        C2668g.b(c2671a, "ioThreadScheduler");
        C2668g.b(c2671a2, "mainThreadScheduler");
        this.recsRepository = recsRepository;
        this.rulesResolver = swipeProcessingRulesResolver;
        this.recSource = rec$Source;
        this.config = config;
        this.globalRecsConsumptionEventPublisher = globalRecsConsumptionEventPublisher;
        this.swipeRulesProcessor = swipeRulesProcessor;
        this.ioThreadScheduler = c2671a;
        this.mainThreadScheduler = c2671a2;
    }

    @UiThread
    public final void processLikeOnRec(@NotNull Rec rec, @NotNull SwipeActionContext swipeActionContext) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeActionContext, "swipeActionContext");
        processSwipe(new Swipe(rec, Type.LIKE, swipeActionContext));
    }

    @UiThread
    public final void processPassOnRec(@NotNull Rec rec, @NotNull SwipeActionContext swipeActionContext) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeActionContext, "swipeActionContext");
        processSwipe(new Swipe(rec, Type.PASS, swipeActionContext));
    }

    @UiThread
    public final void processSuperlikeOnRec(@NotNull Rec rec, @NotNull SwipeActionContext swipeActionContext) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeActionContext, "swipeActionContext");
        processSwipe(new Swipe(rec, Type.SUPERLIKE, swipeActionContext));
    }

    @UiThread
    public final void rewindLastSwipe(@NotNull Reason reason) {
        C2668g.b(reason, "reason");
        processRewindSwipe(reason);
    }

    @NotNull
    public final Observable<SwipeTerminationEvent> observeSwipeTerminationEvents() {
        Observable<SwipeTerminationEvent> b = this.terminationEventSubject.e().b(new SwipeProcessor$observeSwipeTerminationEvents$1(this));
        C2668g.a(b, "terminationEventSubject\n…          )\n            }");
        return b;
    }

    public final void processSwipe(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        C0001a.a("%s - processSwipe(): %s", new Object[]{this.recSource, swipe});
        if (!RxUtils.f47590a.a(this.swipeOperationSubscription) || this.config.getSupportsParallelProcessing()) {
            this.swipeOperationSubscription = processPreConsumptionRules(swipe).a(new SwipeProcessor$processSwipe$1(this)).a(new SwipeProcessor$processSwipe$2(this)).b(this.ioThreadScheduler).a(this.mainThreadScheduler).a(new SwipeProcessor$processSwipe$3(this, swipe), new SwipeProcessor$processSwipe$4(this, swipe));
        }
    }

    private final Single<Swipe> processPreConsumptionRules(Swipe swipe) {
        swipe = Single.a(new SwipeProcessor$processPreConsumptionRules$1(this, swipe));
        C2668g.a(swipe, "Single.fromCallable {\n  …          swipe\n        }");
        return swipe;
    }

    private final Single<Swipe> consumeSwipe(Swipe swipe) {
        swipe = this.recsRepository.processSwipe(swipe).d(new SwipeProcessor$consumeSwipe$1(this));
        C2668g.a(swipe, "recsRepository.processSw…ish(it.rec)\n            }");
        return swipe;
    }

    private final Single<Swipe> processPostConsumptionRules(Swipe swipe) {
        swipe = Single.a(new SwipeProcessor$processPostConsumptionRules$1(this, swipe));
        C2668g.a(swipe, "Single.fromCallable {\n  …          swipe\n        }");
        return swipe;
    }

    private final void processSuccessfulTerminationRules(Swipe swipe) {
        Completable.a(new SwipeProcessor$processSuccessfulTerminationRules$1(this, swipe)).b(this.ioThreadScheduler).a(this.mainThreadScheduler).a(SwipeProcessor$processSuccessfulTerminationRules$2.INSTANCE, SwipeProcessor$processSuccessfulTerminationRules$3.INSTANCE);
    }

    private final void processRewindSwipe(Reason reason) {
        C0001a.a("%s - processRewindSwipe()", new Object[]{this.recSource});
        if (!RxUtils.f47590a.a(this.swipeOperationSubscription)) {
            this.swipeOperationSubscription = this.recsRepository.rewindLastSwipe(reason).b(this.ioThreadScheduler).a(this.mainThreadScheduler).a(SwipeProcessor$processRewindSwipe$1.INSTANCE, SwipeProcessor$processRewindSwipe$2.INSTANCE);
        }
    }

    private final void notifySuccessfulTermination(Swipe swipe) {
        this.terminationEventSubject.onNext(new SwipeTerminationEvent(swipe, SwipeTerminationEvent.Type.COMPLETED, null));
    }

    private final void notifyEarlyTermination(Swipe swipe, Throwable th) {
        if (th instanceof ChainInterruptedException) {
            ChainInterruptedException chainInterruptedException = (ChainInterruptedException) th;
            SwipeProcessingRule rule = chainInterruptedException.getRule();
            if (th instanceof ChainLegallyInterruptedException) {
                C0001a.b("%s - Swipe chain was legally interrupted by %s", new Object[]{this.recSource, rule.getClass().getSimpleName()});
                if ((rule instanceof PreSwipeConsumptionRule) == null) {
                    th = SwipeTerminationEvent.Type.LEGALLY_INTERRUPTED_REVERT_POST_CONSUMPTION;
                } else if (((PreSwipeConsumptionRule) rule).getClass().isAnnotationPresent(CardFreezing.class) != null) {
                    th = SwipeTerminationEvent.Type.LEGALLY_INTERRUPTED_FREEZE;
                } else {
                    th = SwipeTerminationEvent.Type.LEGALLY_INTERRUPTED_REVERT_PRE_CONSUMPTION;
                }
            } else {
                C0001a.b(th, "%s - Swipe chain was ** illegally ** interrupted by %s", new Object[]{this.recSource, rule.getClass().getSimpleName()});
                if ((rule instanceof PreSwipeConsumptionRule) != null) {
                    th = SwipeTerminationEvent.Type.ILLEGALLY_INTERRUPTED_PRE_CONSUMPTION;
                } else {
                    th = SwipeTerminationEvent.Type.ILLEGALLY_INTERRUPTED_POST_CONSUMPTION;
                }
            }
            this.terminationEventSubject.onNext(new SwipeTerminationEvent(swipe, th, chainInterruptedException.getRule()));
            return;
        }
        C0001a.b(th, "Unable to confirm swipe.", new Object[0]);
        this.terminationEventSubject.onNext(new SwipeTerminationEvent(swipe, SwipeTerminationEvent.Type.ILLEGALLY_INTERRUPTED_PRE_CONSUMPTION, null));
    }
}
