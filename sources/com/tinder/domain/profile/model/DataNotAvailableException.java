package com.tinder.domain.profile.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/profile/model/DataNotAvailableException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "option", "Lcom/tinder/domain/profile/model/ProfileOption;", "(Lcom/tinder/domain/profile/model/ProfileOption;)V", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class DataNotAvailableException extends RuntimeException {
    public DataNotAvailableException(@NotNull ProfileOption<?> profileOption) {
        C2668g.b(profileOption, "option");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Profile data isn't available for ");
        stringBuilder.append(profileOption);
        stringBuilder.append('.');
        super(stringBuilder.toString());
    }
}
