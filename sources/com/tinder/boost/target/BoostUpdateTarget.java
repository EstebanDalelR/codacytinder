package com.tinder.boost.target;

import android.support.annotation.NonNull;

public interface BoostUpdateTarget {
    void showBoostPercent(Float f);

    void showDescription(String str);

    void showEmitterWithDuration(long j);

    void showFinished();

    void showNonSubscriberSection(String str, String str2);

    void showSubscriberSection();

    void showTimerText(long j);

    void updateMultiplierText(@NonNull String str);
}
