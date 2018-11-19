package com.tinder.domain.meta.model;

import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.School;
import com.tinder.domain.common.model.User;
import java.util.List;
import org.joda.time.DateTime;

public abstract class CoreUser implements User {

    public static abstract class Builder {
        public abstract Builder badges(List<Badge> list);

        public abstract Builder bio(String str);

        public abstract Builder birthDate(DateTime dateTime);

        public abstract CoreUser build();

        public abstract Builder gender(Gender gender);

        public abstract Builder id(String str);

        public abstract Builder jobs(List<Job> list);

        public abstract Builder name(String str);

        public abstract Builder photos(List<Photo> list);

        public abstract Builder schools(List<School> list);
    }

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder();
    }

    public static CoreUser from(User user) {
        return new Builder().id(user.id()).badges(user.badges()).bio(user.bio()).birthDate(user.birthDate()).gender(user.gender()).name(user.name()).photos(user.photos()).jobs(user.jobs()).schools(user.schools()).build();
    }
}
