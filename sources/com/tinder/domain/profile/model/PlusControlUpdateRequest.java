package com.tinder.domain.profile.model;

import com.tinder.domain.meta.model.PlusControlSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/profile/model/PlusControlUpdateRequest;", "Lcom/tinder/domain/profile/model/ProfileUpdateRequest;", "plusControl", "Lcom/tinder/domain/meta/model/PlusControlSettings;", "(Lcom/tinder/domain/meta/model/PlusControlSettings;)V", "getPlusControl", "()Lcom/tinder/domain/meta/model/PlusControlSettings;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PlusControlUpdateRequest extends ProfileUpdateRequest {
    @NotNull
    private final PlusControlSettings plusControl;

    @NotNull
    public static /* synthetic */ PlusControlUpdateRequest copy$default(PlusControlUpdateRequest plusControlUpdateRequest, PlusControlSettings plusControlSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            plusControlSettings = plusControlUpdateRequest.plusControl;
        }
        return plusControlUpdateRequest.copy(plusControlSettings);
    }

    @NotNull
    public final PlusControlSettings component1() {
        return this.plusControl;
    }

    @NotNull
    public final PlusControlUpdateRequest copy(@NotNull PlusControlSettings plusControlSettings) {
        C2668g.b(plusControlSettings, "plusControl");
        return new PlusControlUpdateRequest(plusControlSettings);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlusControlUpdateRequest) {
                if (C2668g.a(this.plusControl, ((PlusControlUpdateRequest) obj).plusControl)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        PlusControlSettings plusControlSettings = this.plusControl;
        return plusControlSettings != null ? plusControlSettings.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlusControlUpdateRequest(plusControl=");
        stringBuilder.append(this.plusControl);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @NotNull
    public final PlusControlSettings getPlusControl() {
        return this.plusControl;
    }

    public PlusControlUpdateRequest(@NotNull PlusControlSettings plusControlSettings) {
        C2668g.b(plusControlSettings, "plusControl");
        super();
        this.plusControl = plusControlSettings;
    }
}
