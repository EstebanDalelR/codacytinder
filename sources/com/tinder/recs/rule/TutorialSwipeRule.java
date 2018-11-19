package com.tinder.recs.rule;

import android.support.annotation.WorkerThread;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.rule.CardFreezing;
import com.tinder.domain.recs.rule.PreSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.fireboarding.domain.C11811o;
import com.tinder.managers.bk;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0017J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/recs/rule/TutorialSwipeRule;", "Lcom/tinder/domain/recs/rule/PreSwipeConsumptionRule;", "managerSharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "observeFireboardingConfig", "Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;", "(Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;)V", "tutorialRuleSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/domain/recs/model/Swipe;", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "perform", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule$ResultType;", "swipe", "shouldShowDialog", "", "type", "Lcom/tinder/domain/recs/model/Swipe$Type;", "method", "Lcom/tinder/domain/recs/model/Swipe$Method;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@CardFreezing
public final class TutorialSwipeRule implements PreSwipeConsumptionRule {
    private final AbTestUtility abTestUtility;
    private final bk managerSharedPreferences;
    private final C11811o observeFireboardingConfig;
    private final PublishSubject<Swipe> tutorialRuleSubject = PublishSubject.w();

    @Inject
    public TutorialSwipeRule(@NotNull bk bkVar, @NotNull AbTestUtility abTestUtility, @NotNull C11811o c11811o) {
        C2668g.b(bkVar, "managerSharedPreferences");
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(c11811o, "observeFireboardingConfig");
        this.managerSharedPreferences = bkVar;
        this.abTestUtility = abTestUtility;
        this.observeFireboardingConfig = c11811o;
    }

    @WorkerThread
    @NotNull
    public ResultType perform(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        if (this.abTestUtility.newNewExperiment().d()) {
            return ResultType.PROCEED;
        }
        if (!shouldShowDialog(swipe.getType(), swipe.getActionContext().getMethod())) {
            return ResultType.PROCEED;
        }
        this.tutorialRuleSubject.onNext(swipe);
        return ResultType.INTERRUPT;
    }

    @NotNull
    public final Observable<Swipe> observe() {
        Observable<Swipe> e = this.tutorialRuleSubject.e();
        C2668g.a(e, "tutorialRuleSubject.asObservable()");
        return e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.WorkerThread
    private final boolean shouldShowDialog(com.tinder.domain.recs.model.Swipe.Type r6, com.tinder.domain.recs.model.Swipe.Method r7) {
        /*
        r5 = this;
        r0 = r7 instanceof com.tinder.domain.recs.model.SwipeMethod;
        r1 = 0;
        if (r0 == 0) goto L_0x009c;
    L_0x0005:
        r0 = com.tinder.domain.recs.model.SwipeMethod.AD_CLICK;
        if (r7 == r0) goto L_0x009c;
    L_0x0009:
        r0 = r5.observeFireboardingConfig;
        r0 = r0.execute();
        r0 = r0.c();
        r0 = (com.tinder.fireboarding.domain.C9566h) r0;
        r0 = r0.a();
        if (r0 == 0) goto L_0x001d;
    L_0x001b:
        goto L_0x009c;
    L_0x001d:
        r0 = com.tinder.domain.recs.model.Swipe.Type.LIKE;
        r2 = 1;
        if (r6 != r0) goto L_0x0024;
    L_0x0022:
        r0 = 1;
        goto L_0x0025;
    L_0x0024:
        r0 = 0;
    L_0x0025:
        r3 = com.tinder.domain.recs.model.Swipe.Type.PASS;
        if (r6 != r3) goto L_0x002b;
    L_0x0029:
        r3 = 1;
        goto L_0x002c;
    L_0x002b:
        r3 = 0;
    L_0x002c:
        r4 = com.tinder.domain.recs.model.Swipe.Type.SUPERLIKE;
        if (r6 != r4) goto L_0x0032;
    L_0x0030:
        r6 = 1;
        goto L_0x0033;
    L_0x0032:
        r6 = 0;
    L_0x0033:
        r4 = com.tinder.domain.recs.model.SwipeMethod.CARD;
        if (r7 != r4) goto L_0x0039;
    L_0x0037:
        r7 = 1;
        goto L_0x003a;
    L_0x0039:
        r7 = 0;
    L_0x003a:
        if (r0 == 0) goto L_0x0057;
    L_0x003c:
        if (r7 == 0) goto L_0x004a;
    L_0x003e:
        r0 = r5.managerSharedPreferences;
        r0 = r0.q();
        if (r0 != 0) goto L_0x0048;
    L_0x0046:
        r0 = 1;
        goto L_0x0053;
    L_0x0048:
        r0 = 0;
        goto L_0x0053;
    L_0x004a:
        r0 = r5.managerSharedPreferences;
        r0 = r0.m();
        if (r0 != 0) goto L_0x0048;
    L_0x0052:
        goto L_0x0046;
    L_0x0053:
        if (r0 == 0) goto L_0x0057;
    L_0x0055:
        r0 = 1;
        goto L_0x0058;
    L_0x0057:
        r0 = 0;
    L_0x0058:
        if (r3 == 0) goto L_0x0075;
    L_0x005a:
        if (r7 == 0) goto L_0x0068;
    L_0x005c:
        r3 = r5.managerSharedPreferences;
        r3 = r3.o();
        if (r3 != 0) goto L_0x0066;
    L_0x0064:
        r3 = 1;
        goto L_0x0071;
    L_0x0066:
        r3 = 0;
        goto L_0x0071;
    L_0x0068:
        r3 = r5.managerSharedPreferences;
        r3 = r3.s();
        if (r3 != 0) goto L_0x0066;
    L_0x0070:
        goto L_0x0064;
    L_0x0071:
        if (r3 == 0) goto L_0x0075;
    L_0x0073:
        r3 = 1;
        goto L_0x0076;
    L_0x0075:
        r3 = 0;
    L_0x0076:
        if (r6 == 0) goto L_0x0093;
    L_0x0078:
        if (r7 == 0) goto L_0x0086;
    L_0x007a:
        r6 = r5.managerSharedPreferences;
        r6 = r6.u();
        if (r6 != 0) goto L_0x0084;
    L_0x0082:
        r6 = 1;
        goto L_0x008f;
    L_0x0084:
        r6 = 0;
        goto L_0x008f;
    L_0x0086:
        r6 = r5.managerSharedPreferences;
        r6 = r6.v();
        if (r6 != 0) goto L_0x0084;
    L_0x008e:
        goto L_0x0082;
    L_0x008f:
        if (r6 == 0) goto L_0x0093;
    L_0x0091:
        r6 = 1;
        goto L_0x0094;
    L_0x0093:
        r6 = 0;
    L_0x0094:
        if (r0 != 0) goto L_0x009a;
    L_0x0096:
        if (r3 != 0) goto L_0x009a;
    L_0x0098:
        if (r6 == 0) goto L_0x009b;
    L_0x009a:
        r1 = 1;
    L_0x009b:
        return r1;
    L_0x009c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.rule.TutorialSwipeRule.shouldShowDialog(com.tinder.domain.recs.model.Swipe$Type, com.tinder.domain.recs.model.Swipe$Method):boolean");
    }
}
