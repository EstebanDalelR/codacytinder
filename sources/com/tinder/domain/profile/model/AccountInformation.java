package com.tinder.domain.profile.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/tinder/domain/profile/model/AccountInformation;", "", "createdTime", "Lorg/joda/time/DateTime;", "pingTime", "phoneNumber", "", "isPhotoProcessing", "", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Z)V", "getCreatedTime", "()Lorg/joda/time/DateTime;", "()Z", "getPhoneNumber", "()Ljava/lang/String;", "getPingTime", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class AccountInformation {
    @NotNull
    private final DateTime createdTime;
    private final boolean isPhotoProcessing;
    @Nullable
    private final String phoneNumber;
    @Nullable
    private final DateTime pingTime;

    @NotNull
    public static /* synthetic */ AccountInformation copy$default(AccountInformation accountInformation, DateTime dateTime, DateTime dateTime2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = accountInformation.createdTime;
        }
        if ((i & 2) != 0) {
            dateTime2 = accountInformation.pingTime;
        }
        if ((i & 4) != 0) {
            str = accountInformation.phoneNumber;
        }
        if ((i & 8) != 0) {
            z = accountInformation.isPhotoProcessing;
        }
        return accountInformation.copy(dateTime, dateTime2, str, z);
    }

    @NotNull
    public final DateTime component1() {
        return this.createdTime;
    }

    @Nullable
    public final DateTime component2() {
        return this.pingTime;
    }

    @Nullable
    public final String component3() {
        return this.phoneNumber;
    }

    public final boolean component4() {
        return this.isPhotoProcessing;
    }

    @NotNull
    public final AccountInformation copy(@NotNull DateTime dateTime, @Nullable DateTime dateTime2, @Nullable String str, boolean z) {
        C2668g.b(dateTime, "createdTime");
        return new AccountInformation(dateTime, dateTime2, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccountInformation) {
            AccountInformation accountInformation = (AccountInformation) obj;
            if (C2668g.a(this.createdTime, accountInformation.createdTime) && C2668g.a(this.pingTime, accountInformation.pingTime) && C2668g.a(this.phoneNumber, accountInformation.phoneNumber)) {
                if ((this.isPhotoProcessing == accountInformation.isPhotoProcessing ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        DateTime dateTime = this.createdTime;
        int i = 0;
        int hashCode = (dateTime != null ? dateTime.hashCode() : 0) * 31;
        DateTime dateTime2 = this.pingTime;
        hashCode = (hashCode + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 31;
        String str = this.phoneNumber;
        if (str != null) {
            i = str.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.isPhotoProcessing;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AccountInformation(createdTime=");
        stringBuilder.append(this.createdTime);
        stringBuilder.append(", pingTime=");
        stringBuilder.append(this.pingTime);
        stringBuilder.append(", phoneNumber=");
        stringBuilder.append(this.phoneNumber);
        stringBuilder.append(", isPhotoProcessing=");
        stringBuilder.append(this.isPhotoProcessing);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public AccountInformation(@NotNull DateTime dateTime, @Nullable DateTime dateTime2, @Nullable String str, boolean z) {
        C2668g.b(dateTime, "createdTime");
        this.createdTime = dateTime;
        this.pingTime = dateTime2;
        this.phoneNumber = str;
        this.isPhotoProcessing = z;
    }

    @NotNull
    public final DateTime getCreatedTime() {
        return this.createdTime;
    }

    @Nullable
    public final DateTime getPingTime() {
        return this.pingTime;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final boolean isPhotoProcessing() {
        return this.isPhotoProcessing;
    }
}
