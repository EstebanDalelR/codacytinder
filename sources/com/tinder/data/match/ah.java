package com.tinder.data.match;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.common.ApiMatch.Person;
import com.tinder.data.adapter.C10735f;
import com.tinder.data.adapter.C10738l;
import com.tinder.data.adapter.C10746z;
import com.tinder.data.adapter.C2646o;
import com.tinder.data.adapter.ab;
import com.tinder.data.adapter.ad;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.User;
import com.tinder.domain.meta.model.CoreUser;
import java.util.Collections;
import java.util.List;
import java8.util.Objects;
import org.joda.time.DateTime;

class ah extends C2646o<User, Person> {
    @NonNull
    /* renamed from: a */
    private final C10738l f35237a = new C10738l();
    @NonNull
    /* renamed from: b */
    private final C10746z f35238b = new C10746z(new ab(), new ad());
    @NonNull
    /* renamed from: c */
    private final C10735f f35239c = new C10735f();

    ah() {
    }

    @Nullable
    /* renamed from: a */
    public User m43248a(@NonNull Person person) {
        if (person.id() != null) {
            if (person.name() != null) {
                return CoreUser.builder().id(person.id()).badges(m43247c(person.badges())).bio(person.bio()).birthDate(m43245a(person.birthDate())).gender(m43244a(person.gender())).name(person.name()).photos(m43246b(person.photos())).jobs(Collections.emptyList()).schools(Collections.emptyList()).build();
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    private DateTime m43245a(@Nullable String str) {
        return str == null ? null : this.f35237a.m43129a(str);
    }

    @NonNull
    /* renamed from: a */
    private Gender m43244a(@Nullable Integer num) {
        return Gender.create(Value.fromId(((Integer) Objects.b(num, Integer.valueOf(-1))).intValue()), null);
    }

    @NonNull
    /* renamed from: b */
    private List<Photo> m43246b(@Nullable List<com.tinder.api.model.common.Photo> list) {
        return this.f35238b.a((List) Objects.b(list, Collections.emptyList()));
    }

    @NonNull
    /* renamed from: c */
    private List<Badge> m43247c(@Nullable List<com.tinder.api.model.common.Badge> list) {
        return this.f35239c.a((List) Objects.b(list, Collections.emptyList()));
    }
}
