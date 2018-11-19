package com.tinder.domain.config.model;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/tinder/domain/config/model/JobEditingConfig;", "", "editable", "", "titleMaxLength", "", "companyMaxLength", "(ZII)V", "getCompanyMaxLength", "()I", "getEditable", "()Z", "getTitleMaxLength", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class JobEditingConfig {
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final JobEditingConfig DEFAULT = new JobEditingConfig(false, ProfileEditingConfig.DEFAULT_MAX_LENGTH, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    private final int companyMaxLength;
    private final boolean editable;
    private final int titleMaxLength;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/config/model/JobEditingConfig$Companion;", "", "()V", "DEFAULT", "Lcom/tinder/domain/config/model/JobEditingConfig;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    @NotNull
    public static /* synthetic */ JobEditingConfig copy$default(JobEditingConfig jobEditingConfig, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = jobEditingConfig.editable;
        }
        if ((i3 & 2) != 0) {
            i = jobEditingConfig.titleMaxLength;
        }
        if ((i3 & 4) != 0) {
            i2 = jobEditingConfig.companyMaxLength;
        }
        return jobEditingConfig.copy(z, i, i2);
    }

    public final boolean component1() {
        return this.editable;
    }

    public final int component2() {
        return this.titleMaxLength;
    }

    public final int component3() {
        return this.companyMaxLength;
    }

    @NotNull
    public final JobEditingConfig copy(boolean z, int i, int i2) {
        return new JobEditingConfig(z, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JobEditingConfig) {
            JobEditingConfig jobEditingConfig = (JobEditingConfig) obj;
            if ((this.editable == jobEditingConfig.editable ? 1 : null) != null) {
                if ((this.titleMaxLength == jobEditingConfig.titleMaxLength ? 1 : null) != null) {
                    if ((this.companyMaxLength == jobEditingConfig.companyMaxLength ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.editable;
        if (i != 0) {
            i = 1;
        }
        return (((i * 31) + this.titleMaxLength) * 31) + this.companyMaxLength;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JobEditingConfig(editable=");
        stringBuilder.append(this.editable);
        stringBuilder.append(", titleMaxLength=");
        stringBuilder.append(this.titleMaxLength);
        stringBuilder.append(", companyMaxLength=");
        stringBuilder.append(this.companyMaxLength);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public JobEditingConfig(boolean z, int i, int i2) {
        this.editable = z;
        this.titleMaxLength = i;
        this.companyMaxLength = i2;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final int getTitleMaxLength() {
        return this.titleMaxLength;
    }

    public final int getCompanyMaxLength() {
        return this.companyMaxLength;
    }
}
