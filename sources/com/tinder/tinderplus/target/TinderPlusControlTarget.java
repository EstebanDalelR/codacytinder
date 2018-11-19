package com.tinder.tinderplus.target;

import android.support.annotation.NonNull;
import com.tinder.passport.model.PassportLocation;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.views.FeatureRow;
import java.util.List;

public interface TinderPlusControlTarget {
    void launchPaywallFlow(C10076o c10076o);

    void navigateToActivityPassport();

    void selectPassportLocation(PassportLocation passportLocation, List<PassportLocation> list);

    void setCheckedFeature(@NonNull FeatureRow featureRow, @NonNull FeatureRow featureRow2);

    void setGoldToolbarTitle();

    void setPlusToolbarTitle();

    void showDisableFastMatchAlertDialog(@NonNull FeatureRow featureRow, @NonNull FeatureRow featureRow2);

    void showTinderPlusControl(List<String> list, boolean z);
}
