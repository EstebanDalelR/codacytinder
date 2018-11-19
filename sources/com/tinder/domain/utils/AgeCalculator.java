package com.tinder.domain.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.common.logger.Logger;
import javax.inject.Inject;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Years;

public class AgeCalculator {
    @NonNull
    private final Logger logger;

    @Inject
    public AgeCalculator(@NonNull Logger logger) {
        this.logger = logger;
    }

    @Nullable
    public String yearsSinceDate(DateTime dateTime) {
        try {
            return String.valueOf(Years.a(dateTime.b(), LocalDate.a()).b());
        } catch (Throwable e) {
            this.logger.error(e);
            return null;
        }
    }
}
