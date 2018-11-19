package com.tinder.recs.rule;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.rule.PreSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;
import rx.subjects.PublishSubject;

@Singleton
public class LocalOutOfLikesBouncerRule implements PreSwipeConsumptionRule {
    private final PublishSubject<Swipe> bouncerSubject = PublishSubject.w();
    private final LikeStatusProvider likeStatusProvider;

    /* renamed from: com.tinder.recs.rule.LocalOutOfLikesBouncerRule$1 */
    static /* synthetic */ class C147121 {
        static final /* synthetic */ int[] $SwitchMap$com$tinder$domain$recs$model$Swipe$Type = new int[Type.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.domain.recs.model.Swipe.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$tinder$domain$recs$model$Swipe$Type = r0;
            r0 = $SwitchMap$com$tinder$domain$recs$model$Swipe$Type;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.domain.recs.model.Swipe.Type.LIKE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.rule.LocalOutOfLikesBouncerRule.1.<clinit>():void");
        }
    }

    @Inject
    public LocalOutOfLikesBouncerRule(@NonNull LikeStatusProvider likeStatusProvider) {
        this.likeStatusProvider = likeStatusProvider;
    }

    @WorkerThread
    @NonNull
    public ResultType perform(@NonNull Swipe swipe) {
        if (!shouldShowBouncerDialog(swipe.getType())) {
            return ResultType.PROCEED;
        }
        Observable.b(150, TimeUnit.MILLISECONDS).u().b();
        this.bouncerSubject.onNext(swipe);
        return ResultType.INTERRUPT;
    }

    public Observable<Swipe> observe() {
        return this.bouncerSubject.e();
    }

    private boolean shouldShowBouncerDialog(@NonNull Type type) {
        if (C147121.$SwitchMap$com$tinder$domain$recs$model$Swipe$Type[type.ordinal()] != 1) {
            return null;
        }
        return this.likeStatusProvider.isOutOfLikes();
    }
}
