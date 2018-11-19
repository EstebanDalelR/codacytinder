package com.tinder.domain.config.model;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/domain/config/model/SchoolEditingConfig;", "", "editable", "", "maxLength", "", "(ZI)V", "getEditable", "()Z", "getMaxLength", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SchoolEditingConfig {
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final SchoolEditingConfig DEFAULT = new SchoolEditingConfig(false, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    private final boolean editable;
    private final int maxLength;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/config/model/SchoolEditingConfig$Companion;", "", "()V", "DEFAULT", "Lcom/tinder/domain/config/model/SchoolEditingConfig;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    @NotNull
    public static /* synthetic */ SchoolEditingConfig copy$default(SchoolEditingConfig schoolEditingConfig, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = schoolEditingConfig.editable;
        }
        if ((i2 & 2) != 0) {
            i = schoolEditingConfig.maxLength;
        }
        return schoolEditingConfig.copy(z, i);
    }

    public final boolean component1() {
        return this.editable;
    }

    public final int component2() {
        return this.maxLength;
    }

    @NotNull
    public final SchoolEditingConfig copy(boolean z, int i) {
        return new SchoolEditingConfig(z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SchoolEditingConfig) {
            SchoolEditingConfig schoolEditingConfig = (SchoolEditingConfig) obj;
            if ((this.editable == schoolEditingConfig.editable ? 1 : null) != null) {
                if ((this.maxLength == schoolEditingConfig.maxLength ? 1 : null) != null) {
                    return true;
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
        return (i * 31) + this.maxLength;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SchoolEditingConfig(editable=");
        stringBuilder.append(this.editable);
        stringBuilder.append(", maxLength=");
        stringBuilder.append(this.maxLength);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public SchoolEditingConfig(boolean z, int i) {
        this.editable = z;
        this.maxLength = i;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }
}
