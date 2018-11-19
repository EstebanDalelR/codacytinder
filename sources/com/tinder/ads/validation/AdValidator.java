package com.tinder.ads.validation;

import com.tinder.ads.Ad;
import com.tinder.ads.AdSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¨\u0006\u0007"}, d2 = {"Lcom/tinder/ads/validation/AdValidator;", "", "()V", "validate", "Lcom/tinder/ads/Ad;", "ad", "Rule", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class AdValidator {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/ads/validation/AdValidator$Rule;", "", "isValid", "", "ad", "Lcom/tinder/ads/Ad;", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    public interface Rule {
        boolean isValid(@NotNull Ad<?> ad);
    }

    @NotNull
    public final Ad<?> validate(@NotNull Ad<?> ad) {
        C2668g.b(ad, "ad");
        AdSource source = ad.source();
        for (Rule isValid : source.getValidationRules()) {
            if (!isValid.isValid(ad)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ad was invalid for Source ");
                stringBuilder.append(source);
                throw ((Throwable) new InvalidAdException(stringBuilder.toString()));
            }
        }
        return ad;
    }
}
