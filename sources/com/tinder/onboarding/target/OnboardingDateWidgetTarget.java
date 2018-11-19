package com.tinder.onboarding.target;

import android.support.annotation.NonNull;
import com.tinder.onboarding.viewmodel.C10009b;
import java8.util.Optional;
import org.joda.time.LocalDate;

public interface OnboardingDateWidgetTarget {
    void clearFieldLastValue(int i);

    void clearFieldValue(int i, int i2);

    void focusFieldNext(int i);

    void focusFieldNext(int i, int i2);

    void notifyFieldComplete(Optional<LocalDate> optional);

    void notifyFieldIncomplete();

    void reorderFieldViewsByDateFormat();

    void setDateFormat(@NonNull C10009b c10009b);

    void showDay(String str);

    void showMonth(String str);

    void showYear(String str);
}
