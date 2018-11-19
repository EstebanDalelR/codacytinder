package com.tinder.domain.pushnotifications.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/domain/pushnotifications/model/LikesYouNotificationSettingConfig;", "", "frequencyOptions", "", "", "frequencyDefault", "(Ljava/util/List;I)V", "getFrequencyDefault", "()I", "getFrequencyOptions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class LikesYouNotificationSettingConfig {
    private final int frequencyDefault;
    @NotNull
    private final List<Integer> frequencyOptions;

    @NotNull
    public static /* synthetic */ LikesYouNotificationSettingConfig copy$default(LikesYouNotificationSettingConfig likesYouNotificationSettingConfig, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = likesYouNotificationSettingConfig.frequencyOptions;
        }
        if ((i2 & 2) != 0) {
            i = likesYouNotificationSettingConfig.frequencyDefault;
        }
        return likesYouNotificationSettingConfig.copy(list, i);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.frequencyOptions;
    }

    public final int component2() {
        return this.frequencyDefault;
    }

    @NotNull
    public final LikesYouNotificationSettingConfig copy(@NotNull List<Integer> list, int i) {
        C2668g.b(list, "frequencyOptions");
        return new LikesYouNotificationSettingConfig(list, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LikesYouNotificationSettingConfig) {
            LikesYouNotificationSettingConfig likesYouNotificationSettingConfig = (LikesYouNotificationSettingConfig) obj;
            if (C2668g.a(this.frequencyOptions, likesYouNotificationSettingConfig.frequencyOptions)) {
                if ((this.frequencyDefault == likesYouNotificationSettingConfig.frequencyDefault ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List list = this.frequencyOptions;
        return ((list != null ? list.hashCode() : 0) * 31) + this.frequencyDefault;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LikesYouNotificationSettingConfig(frequencyOptions=");
        stringBuilder.append(this.frequencyOptions);
        stringBuilder.append(", frequencyDefault=");
        stringBuilder.append(this.frequencyDefault);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public LikesYouNotificationSettingConfig(@NotNull List<Integer> list, int i) {
        C2668g.b(list, "frequencyOptions");
        this.frequencyOptions = list;
        this.frequencyDefault = i;
    }

    @NotNull
    public final List<Integer> getFrequencyOptions() {
        return this.frequencyOptions;
    }

    public final int getFrequencyDefault() {
        return this.frequencyDefault;
    }
}
