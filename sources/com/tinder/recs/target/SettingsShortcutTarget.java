package com.tinder.recs.target;

import android.support.annotation.StringRes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u001a\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0005H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&¨\u0006\u0016"}, d2 = {"Lcom/tinder/recs/target/SettingsShortcutTarget;", "", "setAgeBarValues", "", "prefAgeMin", "", "prefAgeMax", "setAgeRange", "configAgeMin", "configAgeMax", "configAgeMaxMin", "setAgeText", "ageText", "", "setDistanceText", "distanceUnit", "distanceInEitherMilesOrKms", "setStartingDistance", "distanceInMiles", "showFailedToUpdateProfile", "showNothingToUpdateMessage", "showSuccessfulUpdatedProfile", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface SettingsShortcutTarget {
    void setAgeBarValues(int i, int i2);

    void setAgeRange(int i, int i2, int i3);

    void setAgeText(@NotNull String str);

    void setDistanceText(@StringRes int i, int i2);

    void setStartingDistance(int i);

    void showFailedToUpdateProfile();

    void showNothingToUpdateMessage();

    void showSuccessfulUpdatedProfile();
}
