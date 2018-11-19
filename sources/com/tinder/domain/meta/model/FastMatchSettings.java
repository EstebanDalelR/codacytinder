package com.tinder.domain.meta.model;

import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J_\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/tinder/domain/meta/model/FastMatchSettings;", "", "isEnabled", "", "previewMinTimeInMillis", "", "pushNotificationFrequencyOptions", "", "", "pushNotificationFrequencyDefault", "newCountFetchInterval", "newCountFetchIntervalWhileBoosting", "newCountRangeThreshold", "pollingMode", "(ZJLjava/util/List;IJJII)V", "()Z", "getNewCountFetchInterval", "()J", "getNewCountFetchIntervalWhileBoosting", "getNewCountRangeThreshold", "()I", "getPollingMode", "getPreviewMinTimeInMillis", "getPushNotificationFrequencyDefault", "getPushNotificationFrequencyOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchSettings {
    private final boolean isEnabled;
    private final long newCountFetchInterval;
    private final long newCountFetchIntervalWhileBoosting;
    private final int newCountRangeThreshold;
    private final int pollingMode;
    private final long previewMinTimeInMillis;
    private final int pushNotificationFrequencyDefault;
    @NotNull
    private final List<Integer> pushNotificationFrequencyOptions;

    public FastMatchSettings() {
        this(false, 0, null, 0, 0, 0, 0, 0, 255, null);
    }

    @NotNull
    public static /* synthetic */ FastMatchSettings copy$default(FastMatchSettings fastMatchSettings, boolean z, long j, List list, int i, long j2, long j3, int i2, int i3, int i4, Object obj) {
        FastMatchSettings fastMatchSettings2 = fastMatchSettings;
        int i5 = i4;
        return fastMatchSettings2.copy((i5 & 1) != 0 ? fastMatchSettings2.isEnabled : z, (i5 & 2) != 0 ? fastMatchSettings2.previewMinTimeInMillis : j, (i5 & 4) != 0 ? fastMatchSettings2.pushNotificationFrequencyOptions : list, (i5 & 8) != 0 ? fastMatchSettings2.pushNotificationFrequencyDefault : i, (i5 & 16) != 0 ? fastMatchSettings2.newCountFetchInterval : j2, (i5 & 32) != 0 ? fastMatchSettings2.newCountFetchIntervalWhileBoosting : j3, (i5 & 64) != 0 ? fastMatchSettings2.newCountRangeThreshold : i2, (i5 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? fastMatchSettings2.pollingMode : i3);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final long component2() {
        return this.previewMinTimeInMillis;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.pushNotificationFrequencyOptions;
    }

    public final int component4() {
        return this.pushNotificationFrequencyDefault;
    }

    public final long component5() {
        return this.newCountFetchInterval;
    }

    public final long component6() {
        return this.newCountFetchIntervalWhileBoosting;
    }

    public final int component7() {
        return this.newCountRangeThreshold;
    }

    public final int component8() {
        return this.pollingMode;
    }

    @NotNull
    public final FastMatchSettings copy(boolean z, long j, @NotNull List<Integer> list, int i, long j2, long j3, int i2, int i3) {
        List<Integer> list2 = list;
        C2668g.b(list2, "pushNotificationFrequencyOptions");
        return new FastMatchSettings(z, j, list2, i, j2, j3, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FastMatchSettings) {
            FastMatchSettings fastMatchSettings = (FastMatchSettings) obj;
            if ((this.isEnabled == fastMatchSettings.isEnabled ? 1 : null) != null) {
                if ((this.previewMinTimeInMillis == fastMatchSettings.previewMinTimeInMillis ? 1 : null) != null && C2668g.a(this.pushNotificationFrequencyOptions, fastMatchSettings.pushNotificationFrequencyOptions)) {
                    if ((this.pushNotificationFrequencyDefault == fastMatchSettings.pushNotificationFrequencyDefault ? 1 : null) != null) {
                        if ((this.newCountFetchInterval == fastMatchSettings.newCountFetchInterval ? 1 : null) != null) {
                            if ((this.newCountFetchIntervalWhileBoosting == fastMatchSettings.newCountFetchIntervalWhileBoosting ? 1 : null) != null) {
                                if ((this.newCountRangeThreshold == fastMatchSettings.newCountRangeThreshold ? 1 : null) != null) {
                                    if ((this.pollingMode == fastMatchSettings.pollingMode ? 1 : null) != null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.isEnabled;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        long j = this.previewMinTimeInMillis;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        List list = this.pushNotificationFrequencyOptions;
        i = (((i + (list != null ? list.hashCode() : 0)) * 31) + this.pushNotificationFrequencyDefault) * 31;
        j = this.newCountFetchInterval;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.newCountFetchIntervalWhileBoosting;
        return ((((i + ((int) (j ^ (j >>> 32)))) * 31) + this.newCountRangeThreshold) * 31) + this.pollingMode;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastMatchSettings(isEnabled=");
        stringBuilder.append(this.isEnabled);
        stringBuilder.append(", previewMinTimeInMillis=");
        stringBuilder.append(this.previewMinTimeInMillis);
        stringBuilder.append(", pushNotificationFrequencyOptions=");
        stringBuilder.append(this.pushNotificationFrequencyOptions);
        stringBuilder.append(", pushNotificationFrequencyDefault=");
        stringBuilder.append(this.pushNotificationFrequencyDefault);
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

    public FastMatchSettings(boolean z, long j, @NotNull List<Integer> list, int i, long j2, long j3, int i2, int i3) {
        C2668g.b(list, "pushNotificationFrequencyOptions");
        this.isEnabled = z;
        this.previewMinTimeInMillis = j;
        this.pushNotificationFrequencyOptions = list;
        this.pushNotificationFrequencyDefault = i;
        this.newCountFetchInterval = j2;
        this.newCountFetchIntervalWhileBoosting = j3;
        this.newCountRangeThreshold = i2;
        this.pollingMode = i3;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final long getPreviewMinTimeInMillis() {
        return this.previewMinTimeInMillis;
    }

    public /* synthetic */ FastMatchSettings(boolean z, long j, List list, int i, long j2, long j3, int i2, int i3, int i4, C15823e c15823e) {
        int i5 = i4;
        this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? DefaultFastMatchValues.PREVIEW_MIN_TIME_IN_MILLIS : j, (i5 & 4) != 0 ? DefaultFastMatchValues.INSTANCE.getNOTIFICATION_OPTIONS() : list, (i5 & 8) != 0 ? 1 : i, (i5 & 16) != 0 ? DefaultFastMatchValues.NEW_COUNT_FETCH_INTERVAL : j2, (i5 & 32) != 0 ? DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL : j3, (i5 & 64) != 0 ? 0 : i2, (i5 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? DefaultFastMatchValues.INSTANCE.getPOLLING_MODE().getValue() : i3);
    }

    @NotNull
    public final List<Integer> getPushNotificationFrequencyOptions() {
        return this.pushNotificationFrequencyOptions;
    }

    public final int getPushNotificationFrequencyDefault() {
        return this.pushNotificationFrequencyDefault;
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

    public final int getPollingMode() {
        return this.pollingMode;
    }
}
