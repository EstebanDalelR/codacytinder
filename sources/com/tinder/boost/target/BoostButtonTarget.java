package com.tinder.boost.target;

import com.tinder.boost.provider.BoostUpdateProvider$a;
import com.tinder.paywall.paywallflow.C10076o;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0016\u0010\u0016\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0018\u00010\u0018R\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&¨\u0006\u001c"}, d2 = {"Lcom/tinder/boost/target/BoostButtonTarget;", "", "attachBoostEmitterView", "", "durationRemaining", "", "enableBoostButton", "isEnabled", "", "fadeMultiplierIn", "fadeMultiplierOut", "launchBoostPaywall", "paywallFlow", "Lcom/tinder/paywall/paywallflow/PaywallFlow;", "removeBoostEmitterView", "showBoostMultiplierValue", "multiplier", "", "showBoostPercentFilled", "percent", "", "showBoostStartToolTip", "showBoostUpdateDialog", "currentBoostTick", "Lcom/tinder/boost/provider/BoostUpdateProvider$BoostTick;", "Lcom/tinder/boost/provider/BoostUpdateProvider;", "showBoostYourProfileToolTip", "showEmptyGauge", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface BoostButtonTarget {
    void attachBoostEmitterView(long j);

    void enableBoostButton(boolean z);

    void fadeMultiplierIn();

    void fadeMultiplierOut();

    void launchBoostPaywall(@NotNull C10076o c10076o);

    void removeBoostEmitterView();

    void showBoostMultiplierValue(@NotNull String str);

    void showBoostPercentFilled(float f);

    void showBoostStartToolTip();

    void showBoostUpdateDialog(@Nullable BoostUpdateProvider$a boostUpdateProvider$a);

    void showBoostYourProfileToolTip();

    void showEmptyGauge();
}
