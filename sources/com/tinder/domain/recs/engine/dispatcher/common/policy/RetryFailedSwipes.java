package com.tinder.domain.recs.engine.dispatcher.common.policy;

import com.tinder.domain.recs.engine.dispatcher.common.model.DispatcherState;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0005H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/policy/RetryFailedSwipes;", "Lcom/tinder/domain/recs/engine/dispatcher/common/policy/DispatchPolicy;", "()V", "retryInfoMap", "Ljava/util/WeakHashMap;", "Lcom/tinder/domain/recs/model/Swipe;", "Lcom/tinder/domain/recs/engine/dispatcher/common/policy/RetryFailedSwipes$RetryInfo;", "findDispatchableSwipes", "", "candidateSwipes", "state", "Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatcherState;", "getRetryInfo", "swipe", "Companion", "RetryInfo", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class RetryFailedSwipes implements DispatchPolicy {
    private static final int BASE_RETRY_INTERVAL_MILLIS = 1000;
    public static final Companion Companion = new Companion();
    private static final int RETRY_COUNT_LIMIT = 3;
    private static final int RETRY_COUNT_LIMIT_RESET_INTERVAL_MILLIS = 300000;
    private static final int RETRY_INTERVAL_MULTIPLIER = 2;
    private final WeakHashMap<Swipe, RetryInfo> retryInfoMap = new WeakHashMap();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/policy/RetryFailedSwipes$Companion;", "", "()V", "BASE_RETRY_INTERVAL_MILLIS", "", "getBASE_RETRY_INTERVAL_MILLIS", "()I", "RETRY_COUNT_LIMIT", "getRETRY_COUNT_LIMIT", "RETRY_COUNT_LIMIT_RESET_INTERVAL_MILLIS", "getRETRY_COUNT_LIMIT_RESET_INTERVAL_MILLIS", "RETRY_INTERVAL_MULTIPLIER", "getRETRY_INTERVAL_MULTIPLIER", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Companion {
        private Companion() {
        }

        private final int getRETRY_COUNT_LIMIT() {
            return RetryFailedSwipes.RETRY_COUNT_LIMIT;
        }

        private final int getRETRY_COUNT_LIMIT_RESET_INTERVAL_MILLIS() {
            return RetryFailedSwipes.RETRY_COUNT_LIMIT_RESET_INTERVAL_MILLIS;
        }

        private final int getBASE_RETRY_INTERVAL_MILLIS() {
            return RetryFailedSwipes.BASE_RETRY_INTERVAL_MILLIS;
        }

        private final int getRETRY_INTERVAL_MULTIPLIER() {
            return RetryFailedSwipes.RETRY_INTERVAL_MULTIPLIER;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\bH\u0002J\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/policy/RetryFailedSwipes$RetryInfo;", "", "()V", "count", "", "lastUpdatedTimestamp", "", "hasHitRetryCountLimit", "", "hasPassedRetryTime", "incrementCount", "", "resetCount", "resetIfNeeded", "shouldResetRetryCount", "shouldRetry", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    private static final class RetryInfo {
        private int count;
        private long lastUpdatedTimestamp;

        public RetryInfo() {
            resetCount();
        }

        public final void resetIfNeeded() {
            if (shouldResetRetryCount()) {
                resetCount();
            }
        }

        public final void resetCount() {
            this.count = 0;
            this.lastUpdatedTimestamp = System.currentTimeMillis();
        }

        public final void incrementCount() {
            this.count++;
            this.lastUpdatedTimestamp = System.currentTimeMillis();
        }

        public final boolean shouldRetry() {
            return !hasHitRetryCountLimit() && hasPassedRetryTime();
        }

        private final boolean shouldResetRetryCount() {
            return this.lastUpdatedTimestamp + ((long) RetryFailedSwipes.Companion.getRETRY_COUNT_LIMIT_RESET_INTERVAL_MILLIS()) < System.currentTimeMillis();
        }

        private final boolean hasHitRetryCountLimit() {
            return RetryFailedSwipes.Companion.getRETRY_COUNT_LIMIT() <= this.count;
        }

        private final boolean hasPassedRetryTime() {
            return this.lastUpdatedTimestamp + (((long) RetryFailedSwipes.Companion.getBASE_RETRY_INTERVAL_MILLIS()) * ((long) Math.pow((double) RetryFailedSwipes.Companion.getRETRY_INTERVAL_MULTIPLIER(), (double) this.count))) < System.currentTimeMillis();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RetryInfo{count=");
            stringBuilder.append(this.count);
            stringBuilder.append(",lastUpdatedTimestamp=");
            stringBuilder.append(this.lastUpdatedTimestamp);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    @NotNull
    public Collection<Swipe> findDispatchableSwipes(@NotNull Collection<Swipe> collection, @NotNull DispatcherState dispatcherState) {
        C2668g.b(collection, "candidateSwipes");
        C2668g.b(dispatcherState, "state");
        HashSet hashSet = new HashSet();
        hashSet.addAll(collection);
        for (Swipe swipe : dispatcherState.failedSwipes()) {
            if (!C2668g.a(swipe.getType(), Type.SUPERLIKE)) {
                RetryInfo retryInfo = getRetryInfo(swipe);
                retryInfo.resetIfNeeded();
                if (retryInfo.shouldRetry()) {
                    hashSet.add(swipe);
                    retryInfo.incrementCount();
                }
            }
        }
        return hashSet;
    }

    private final RetryInfo getRetryInfo(Swipe swipe) {
        if (this.retryInfoMap.containsKey(swipe)) {
            swipe = this.retryInfoMap.get(swipe);
            if (swipe == null) {
                C2668g.a();
            }
            return (RetryInfo) swipe;
        }
        RetryInfo retryInfo = new RetryInfo();
        this.retryInfoMap.put(swipe, retryInfo);
        return retryInfo;
    }
}
