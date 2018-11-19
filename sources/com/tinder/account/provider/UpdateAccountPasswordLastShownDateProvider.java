package com.tinder.account.provider;

import android.support.annotation.NonNull;
import java8.util.Optional;
import org.joda.time.LocalDate;

public interface UpdateAccountPasswordLastShownDateProvider {
    Optional<LocalDate> lastShownDate();

    void updateLastShownDate(@NonNull LocalDate localDate);
}
