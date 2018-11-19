package com.tinder.domain.experiments;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/experiments/Buckets;", "", "smsAuth", "Lcom/tinder/domain/experiments/Buckets$SmsAuthBucket;", "(Lcom/tinder/domain/experiments/Buckets$SmsAuthBucket;)V", "getSmsAuth", "()Lcom/tinder/domain/experiments/Buckets$SmsAuthBucket;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SmsAuthBucket", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Buckets {
    @NotNull
    private final SmsAuthBucket smsAuth;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/experiments/Buckets$SmsAuthBucket;", "", "(Ljava/lang/String;I)V", "ACCOUNT_KIT", "TINDER_SMS", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum SmsAuthBucket {
    }

    @NotNull
    public static /* synthetic */ Buckets copy$default(Buckets buckets, SmsAuthBucket smsAuthBucket, int i, Object obj) {
        if ((i & 1) != 0) {
            smsAuthBucket = buckets.smsAuth;
        }
        return buckets.copy(smsAuthBucket);
    }

    @NotNull
    public final SmsAuthBucket component1() {
        return this.smsAuth;
    }

    @NotNull
    public final Buckets copy(@NotNull SmsAuthBucket smsAuthBucket) {
        C2668g.b(smsAuthBucket, "smsAuth");
        return new Buckets(smsAuthBucket);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Buckets) {
                if (C2668g.a(this.smsAuth, ((Buckets) obj).smsAuth)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        SmsAuthBucket smsAuthBucket = this.smsAuth;
        return smsAuthBucket != null ? smsAuthBucket.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Buckets(smsAuth=");
        stringBuilder.append(this.smsAuth);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Buckets(@NotNull SmsAuthBucket smsAuthBucket) {
        C2668g.b(smsAuthBucket, "smsAuth");
        this.smsAuth = smsAuthBucket;
    }

    @NotNull
    public final SmsAuthBucket getSmsAuth() {
        return this.smsAuth;
    }
}
