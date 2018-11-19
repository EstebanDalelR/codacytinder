package com.tinder.domain.meta.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.common.p076a.C2640a;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.School;
import com.tinder.domain.common.model.User;
import java.util.List;
import org.joda.time.DateTime;

public abstract class UserDecorator implements User {
    @NonNull
    protected final User userToBeDecorated;

    public UserDecorator(@NonNull User user) {
        C2640a.a(user);
        this.userToBeDecorated = user;
    }

    @NonNull
    public String id() {
        return this.userToBeDecorated.id();
    }

    @NonNull
    public List<Badge> badges() {
        return this.userToBeDecorated.badges();
    }

    @Nullable
    public String bio() {
        return this.userToBeDecorated.bio();
    }

    @Nullable
    public DateTime birthDate() {
        return this.userToBeDecorated.birthDate();
    }

    @NonNull
    public Gender gender() {
        return this.userToBeDecorated.gender();
    }

    @NonNull
    public String name() {
        return this.userToBeDecorated.name();
    }

    @NonNull
    public List<Photo> photos() {
        return this.userToBeDecorated.photos();
    }

    @NonNull
    public List<Job> jobs() {
        return this.userToBeDecorated.jobs();
    }

    @NonNull
    public List<School> schools() {
        return this.userToBeDecorated.schools();
    }
}
