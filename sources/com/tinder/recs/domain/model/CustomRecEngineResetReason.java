package com.tinder.recs.domain.model;

import com.tinder.domain.recs.RecsEngine.ResetReason;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/recs/domain/model/CustomRecEngineResetReason;", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "()V", "DiscoverySettingsUpdate", "PassportLocationUpdate", "PurchaseSuccess", "RecsExpired", "RetryOnError", "SubscriptionChange", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason$PassportLocationUpdate;", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason$DiscoverySettingsUpdate;", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason$RecsExpired;", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason$SubscriptionChange;", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason$RetryOnError;", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason$PurchaseSuccess;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class CustomRecEngineResetReason implements ResetReason {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/recs/domain/model/CustomRecEngineResetReason$DiscoverySettingsUpdate;", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class DiscoverySettingsUpdate extends CustomRecEngineResetReason {
        public static final DiscoverySettingsUpdate INSTANCE = new DiscoverySettingsUpdate();

        private DiscoverySettingsUpdate() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/recs/domain/model/CustomRecEngineResetReason$PassportLocationUpdate;", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class PassportLocationUpdate extends CustomRecEngineResetReason {
        public static final PassportLocationUpdate INSTANCE = new PassportLocationUpdate();

        private PassportLocationUpdate() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/recs/domain/model/CustomRecEngineResetReason$PurchaseSuccess;", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class PurchaseSuccess extends CustomRecEngineResetReason {
        public static final PurchaseSuccess INSTANCE = new PurchaseSuccess();

        private PurchaseSuccess() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/recs/domain/model/CustomRecEngineResetReason$RecsExpired;", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class RecsExpired extends CustomRecEngineResetReason {
        public static final RecsExpired INSTANCE = new RecsExpired();

        private RecsExpired() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/recs/domain/model/CustomRecEngineResetReason$RetryOnError;", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class RetryOnError extends CustomRecEngineResetReason {
        public static final RetryOnError INSTANCE = new RetryOnError();

        private RetryOnError() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/recs/domain/model/CustomRecEngineResetReason$SubscriptionChange;", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class SubscriptionChange extends CustomRecEngineResetReason {
        public static final SubscriptionChange INSTANCE = new SubscriptionChange();

        private SubscriptionChange() {
            super();
        }
    }

    private CustomRecEngineResetReason() {
    }
}
