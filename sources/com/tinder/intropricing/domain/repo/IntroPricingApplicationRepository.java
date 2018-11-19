package com.tinder.intropricing.domain.repo;

import com.tinder.intropricing.domain.model.C9731a;
import com.tinder.intropricing.domain.model.C9732b;
import io.reactivex.C3959e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H&¨\u0006\u000e"}, d2 = {"Lcom/tinder/intropricing/domain/repo/IntroPricingApplicationRepository;", "", "observeAvailability", "Lio/reactivex/Observable;", "Lcom/tinder/intropricing/domain/model/IntroPricingAvailability;", "observeIntroPricing", "Lcom/tinder/intropricing/domain/model/IntroPricing;", "observeIntroPricingEnabled", "", "setIntroPricingEnabled", "", "isEnabled", "updateAvailability", "introPricingAvailability", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface IntroPricingApplicationRepository {
    @NotNull
    C3959e<C9732b> observeAvailability();

    @NotNull
    C3959e<C9731a> observeIntroPricing();

    @NotNull
    C3959e<Boolean> observeIntroPricingEnabled();

    void setIntroPricingEnabled(boolean z);

    void updateAvailability(@NotNull C9732b c9732b);
}
