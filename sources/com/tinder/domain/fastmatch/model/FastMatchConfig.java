package com.tinder.domain.fastmatch.model;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0010HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003Js\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/tinder/domain/fastmatch/model/FastMatchConfig;", "", "isEnabled", "", "hasSeenTutorial", "previewMinTimeInMillis", "", "pushNotificationFrequencyOptions", "", "", "currentPushNotificationFrequency", "defaultPushNotificationFrequency", "newCountFetchInterval", "newCountFetchIntervalWhileBoosting", "newCountRangeThreshold", "pollingMode", "Lcom/tinder/domain/fastmatch/model/PollingMode;", "(ZZJLjava/util/List;IIJJILcom/tinder/domain/fastmatch/model/PollingMode;)V", "getCurrentPushNotificationFrequency", "()I", "getDefaultPushNotificationFrequency", "getHasSeenTutorial", "()Z", "getNewCountFetchInterval", "()J", "getNewCountFetchIntervalWhileBoosting", "getNewCountRangeThreshold", "getPollingMode", "()Lcom/tinder/domain/fastmatch/model/PollingMode;", "getPreviewMinTimeInMillis", "getPushNotificationFrequencyOptions", "()Ljava/util/List;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchConfig {
    private final int currentPushNotificationFrequency;
    private final int defaultPushNotificationFrequency;
    private final boolean hasSeenTutorial;
    private final boolean isEnabled;
    private final long newCountFetchInterval;
    private final long newCountFetchIntervalWhileBoosting;
    private final int newCountRangeThreshold;
    @NotNull
    private final PollingMode pollingMode;
    private final long previewMinTimeInMillis;
    @NotNull
    private final List<Integer> pushNotificationFrequencyOptions;

    public FastMatchConfig() {
        this(false, false, 0, null, 0, 0, 0, 0, 0, null, 1023, null);
    }

    @NotNull
    public static /* synthetic */ FastMatchConfig copy$default(FastMatchConfig fastMatchConfig, boolean z, boolean z2, long j, List list, int i, int i2, long j2, long j3, int i3, PollingMode pollingMode, int i4, Object obj) {
        FastMatchConfig fastMatchConfig2 = fastMatchConfig;
        int i5 = i4;
        return fastMatchConfig2.copy((i5 & 1) != 0 ? fastMatchConfig2.isEnabled : z, (i5 & 2) != 0 ? fastMatchConfig2.hasSeenTutorial : z2, (i5 & 4) != 0 ? fastMatchConfig2.previewMinTimeInMillis : j, (i5 & 8) != 0 ? fastMatchConfig2.pushNotificationFrequencyOptions : list, (i5 & 16) != 0 ? fastMatchConfig2.currentPushNotificationFrequency : i, (i5 & 32) != 0 ? fastMatchConfig2.defaultPushNotificationFrequency : i2, (i5 & 64) != 0 ? fastMatchConfig2.newCountFetchInterval : j2, (i5 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? fastMatchConfig2.newCountFetchIntervalWhileBoosting : j3, (i5 & 256) != 0 ? fastMatchConfig2.newCountRangeThreshold : i3, (i5 & 512) != 0 ? fastMatchConfig2.pollingMode : pollingMode);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    @NotNull
    public final PollingMode component10() {
        return this.pollingMode;
    }

    public final boolean component2() {
        return this.hasSeenTutorial;
    }

    public final long component3() {
        return this.previewMinTimeInMillis;
    }

    @NotNull
    public final List<Integer> component4() {
        return this.pushNotificationFrequencyOptions;
    }

    public final int component5() {
        return this.currentPushNotificationFrequency;
    }

    public final int component6() {
        return this.defaultPushNotificationFrequency;
    }

    public final long component7() {
        return this.newCountFetchInterval;
    }

    public final long component8() {
        return this.newCountFetchIntervalWhileBoosting;
    }

    public final int component9() {
        return this.newCountRangeThreshold;
    }

    @NotNull
    public final FastMatchConfig copy(boolean z, boolean z2, long j, @NotNull List<Integer> list, int i, int i2, long j2, long j3, int i3, @NotNull PollingMode pollingMode) {
        List<Integer> list2 = list;
        C2668g.b(list2, "pushNotificationFrequencyOptions");
        PollingMode pollingMode2 = pollingMode;
        C2668g.b(pollingMode2, "pollingMode");
        return new FastMatchConfig(z, z2, j, list2, i, i2, j2, j3, i3, pollingMode2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FastMatchConfig) {
            FastMatchConfig fastMatchConfig = (FastMatchConfig) obj;
            if ((this.isEnabled == fastMatchConfig.isEnabled ? 1 : null) != null) {
                if ((this.hasSeenTutorial == fastMatchConfig.hasSeenTutorial ? 1 : null) != null) {
                    if ((this.previewMinTimeInMillis == fastMatchConfig.previewMinTimeInMillis ? 1 : null) != null && C2668g.a(this.pushNotificationFrequencyOptions, fastMatchConfig.pushNotificationFrequencyOptions)) {
                        if ((this.currentPushNotificationFrequency == fastMatchConfig.currentPushNotificationFrequency ? 1 : null) != null) {
                            if ((this.defaultPushNotificationFrequency == fastMatchConfig.defaultPushNotificationFrequency ? 1 : null) != null) {
                                if ((this.newCountFetchInterval == fastMatchConfig.newCountFetchInterval ? 1 : null) != null) {
                                    if ((this.newCountFetchIntervalWhileBoosting == fastMatchConfig.newCountFetchIntervalWhileBoosting ? 1 : null) != null) {
                                        return (this.newCountRangeThreshold == fastMatchConfig.newCountRangeThreshold ? 1 : null) != null && C2668g.a(this.pollingMode, fastMatchConfig.pollingMode);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        int i = this.isEnabled;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        boolean z = this.hasSeenTutorial;
        if (!z) {
            i2 = z;
        }
        i = (i + i2) * 31;
        long j = this.previewMinTimeInMillis;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        List list = this.pushNotificationFrequencyOptions;
        int i3 = 0;
        i = (((((i + (list != null ? list.hashCode() : 0)) * 31) + this.currentPushNotificationFrequency) * 31) + this.defaultPushNotificationFrequency) * 31;
        long j2 = this.newCountFetchInterval;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.newCountFetchIntervalWhileBoosting;
        i = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.newCountRangeThreshold) * 31;
        PollingMode pollingMode = this.pollingMode;
        if (pollingMode != null) {
            i3 = pollingMode.hashCode();
        }
        return i + i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastMatchConfig(isEnabled=");
        stringBuilder.append(this.isEnabled);
        stringBuilder.append(", hasSeenTutorial=");
        stringBuilder.append(this.hasSeenTutorial);
        stringBuilder.append(", previewMinTimeInMillis=");
        stringBuilder.append(this.previewMinTimeInMillis);
        stringBuilder.append(", pushNotificationFrequencyOptions=");
        stringBuilder.append(this.pushNotificationFrequencyOptions);
        stringBuilder.append(", currentPushNotificationFrequency=");
        stringBuilder.append(this.currentPushNotificationFrequency);
        stringBuilder.append(", defaultPushNotificationFrequency=");
        stringBuilder.append(this.defaultPushNotificationFrequency);
        stringBuilder.append(", newCountFetchInterval=");
        stringBuilder.append(this.newCountFetchInterval);
        stringBuilder.append(", newCountFetchIntervalWhileBoosting=");
        stringBuilder.append(this.newCountFetchIntervalWhileBoosting);
        stringBuilder.append(", newCountRangeThreshold=");
        stringBuilder.append(this.newCountRangeThreshold);
        stringBuilder.append(", pollingMode=");
        stringBuilder.append(this.pollingMode);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FastMatchConfig(boolean z, boolean z2, long j, @NotNull List<Integer> list, int i, int i2, long j2, long j3, int i3, @NotNull PollingMode pollingMode) {
        C2668g.b(list, "pushNotificationFrequencyOptions");
        C2668g.b(pollingMode, "pollingMode");
        this.isEnabled = z;
        this.hasSeenTutorial = z2;
        this.previewMinTimeInMillis = j;
        this.pushNotificationFrequencyOptions = list;
        this.currentPushNotificationFrequency = i;
        this.defaultPushNotificationFrequency = i2;
        this.newCountFetchInterval = j2;
        this.newCountFetchIntervalWhileBoosting = j3;
        this.newCountRangeThreshold = i3;
        this.pollingMode = pollingMode;
        if (this.currentPushNotificationFrequency >= false) {
            throw ((Throwable) new IllegalArgumentException());
        }
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean getHasSeenTutorial() {
        return this.hasSeenTutorial;
    }

    public final long getPreviewMinTimeInMillis() {
        return this.previewMinTimeInMillis;
    }

    public /* synthetic */ FastMatchConfig(boolean z, boolean z2, long j, List list, int i, int i2, long j2, long j3, int i3, PollingMode pollingMode, int i4, C15823e c15823e) {
        int i5 = i4;
        int i6 = 0;
        boolean z3 = (i5 & 1) != 0 ? false : z;
        boolean z4 = (i5 & 2) != 0 ? false : z2;
        long j4 = (i5 & 4) != 0 ? DefaultFastMatchValues.PREVIEW_MIN_TIME_IN_MILLIS : j;
        List notification_options = (i5 & 8) != 0 ? DefaultFastMatchValues.INSTANCE.getNOTIFICATION_OPTIONS() : list;
        int i7 = (i5 & 16) != 0 ? 1 : i;
        int i8 = (i5 & 32) != 0 ? 1 : i2;
        long j5 = (i5 & 64) != 0 ? 20000 : j2;
        long j6 = (i5 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? 20000 : j3;
        if ((i5 & 256) == 0) {
            i6 = i3;
        }
        this(z3, z4, j4, notification_options, i7, i8, j5, j6, i6, (i5 & 512) != 0 ? DefaultFastMatchValues.INSTANCE.getPOLLING_MODE() : pollingMode);
    }

    @NotNull
    public final List<Integer> getPushNotificationFrequencyOptions() {
        return this.pushNotificationFrequencyOptions;
    }

    public final int getCurrentPushNotificationFrequency() {
        return this.currentPushNotificationFrequency;
    }

    public final int getDefaultPushNotificationFrequency() {
        return this.defaultPushNotificationFrequency;
    }

    public final long getNewCountFetchInterval() {
        return this.newCountFetchInterval;
    }

    public final long getNewCountFetchIntervalWhileBoosting() {
        return this.newCountFetchIntervalWhileBoosting;
    }

    public final int getNewCountRangeThreshold() {
        return this.newCountRangeThreshold;
    }

    @NotNull
    public final PollingMode getPollingMode() {
        return this.pollingMode;
    }
}
