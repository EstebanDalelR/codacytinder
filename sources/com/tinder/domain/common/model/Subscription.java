package com.tinder.domain.common.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0005J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001a\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/tinder/domain/common/model/Subscription;", "", "productId", "", "isGold", "", "isPlus", "platform", "Lcom/tinder/domain/common/model/Subscription$Platform;", "(Ljava/lang/String;ZZLcom/tinder/domain/common/model/Subscription$Platform;)V", "()Z", "getPlatform", "()Lcom/tinder/domain/common/model/Subscription$Platform;", "getProductId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "isActiveSubscription", "toString", "wasPurchasedOnAndroid", "Companion", "Platform", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Subscription {
    public static final Companion Companion = new Companion();
    @NotNull
    public static final String GOLD = "gold";
    @NotNull
    public static final String PLUS = "plus";
    private final boolean isGold;
    private final boolean isPlus;
    @NotNull
    private final Platform platform;
    @NotNull
    private final String productId;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/common/model/Subscription$Companion;", "", "()V", "GOLD", "", "PLUS", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/domain/common/model/Subscription$Platform;", "", "platformName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getPlatformName", "()Ljava/lang/String;", "toString", "ANDROID", "IOS", "TEST", "WEB", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum Platform {
        ;
        
        @NotNull
        private final String platformName;

        protected Platform(String str) {
            C2668g.b(str, "platformName");
            this.platformName = str;
        }

        @NotNull
        public final String getPlatformName() {
            return this.platformName;
        }

        @NotNull
        public String toString() {
            return this.platformName;
        }
    }

    public Subscription() {
        this(null, false, false, null, 15, null);
    }

    @NotNull
    public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, boolean z, boolean z2, Platform platform, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscription.productId;
        }
        if ((i & 2) != 0) {
            z = subscription.isGold;
        }
        if ((i & 4) != 0) {
            z2 = subscription.isPlus;
        }
        if ((i & 8) != 0) {
            platform = subscription.platform;
        }
        return subscription.copy(str, z, z2, platform);
    }

    @NotNull
    public final String component1() {
        return this.productId;
    }

    public final boolean component2() {
        return this.isGold;
    }

    public final boolean component3() {
        return this.isPlus;
    }

    @NotNull
    public final Platform component4() {
        return this.platform;
    }

    @NotNull
    public final Subscription copy(@NotNull String str, boolean z, boolean z2, @NotNull Platform platform) {
        C2668g.b(str, "productId");
        C2668g.b(platform, "platform");
        return new Subscription(str, z, z2, platform);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (C2668g.a(this.productId, subscription.productId)) {
                if ((this.isGold == subscription.isGold ? 1 : null) != null) {
                    return (this.isPlus == subscription.isPlus ? 1 : null) != null && C2668g.a(this.platform, subscription.platform);
                }
            }
        }
    }

    public int hashCode() {
        String str = this.productId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i2 = this.isGold;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.isPlus;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        Platform platform = this.platform;
        if (platform != null) {
            i = platform.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Subscription(productId=");
        stringBuilder.append(this.productId);
        stringBuilder.append(", isGold=");
        stringBuilder.append(this.isGold);
        stringBuilder.append(", isPlus=");
        stringBuilder.append(this.isPlus);
        stringBuilder.append(", platform=");
        stringBuilder.append(this.platform);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Subscription(@NotNull String str, boolean z, boolean z2, @NotNull Platform platform) {
        C2668g.b(str, "productId");
        C2668g.b(platform, "platform");
        this.productId = str;
        this.isGold = z;
        this.isPlus = z2;
        this.platform = platform;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final boolean isGold() {
        return this.isGold;
    }

    public final boolean isPlus() {
        return this.isPlus;
    }

    public /* synthetic */ Subscription(String str, boolean z, boolean z2, Platform platform, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            str = "";
        }
        if ((i & 2) != null) {
            z = false;
        }
        if ((i & 4) != null) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            platform = Platform.ANDROID;
        }
        this(str, z, z2, platform);
    }

    @NotNull
    public final Platform getPlatform() {
        return this.platform;
    }

    public final boolean isActiveSubscription() {
        if (!this.isGold) {
            if (!this.isPlus) {
                return false;
            }
        }
        return true;
    }

    public final boolean wasPurchasedOnAndroid() {
        return this.platform == Platform.ANDROID;
    }
}
