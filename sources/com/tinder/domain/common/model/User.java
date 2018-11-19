package com.tinder.domain.common.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import org.joda.time.DateTime;

public interface User {
    @NonNull
    List<Badge> badges();

    @Nullable
    String bio();

    @Nullable
    DateTime birthDate();

    @NonNull
    Gender gender();

    @NonNull
    String id();

    @NonNull
    List<Job> jobs();

    @NonNull
    String name();

    @NonNull
    List<Photo> photos();

    @NonNull
    List<School> schools();
}
