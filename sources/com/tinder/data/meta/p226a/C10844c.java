package com.tinder.data.meta.p226a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.common.User;
import com.tinder.data.adapter.C10735f;
import com.tinder.data.adapter.C10738l;
import com.tinder.data.adapter.C10746z;
import com.tinder.data.adapter.C2646o;
import com.tinder.data.adapter.C3925u;
import com.tinder.data.adapter.NotDisplayedByDefault;
import com.tinder.data.adapter.aj;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.School;
import com.tinder.domain.meta.model.CoreUser;
import java.util.Collections;
import java.util.List;
import java8.util.Objects;
import javax.inject.Inject;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.meta.a.c */
public class C10844c extends C2646o<CoreUser, User> {
    @NonNull
    /* renamed from: a */
    private final C10735f f35461a;
    @NonNull
    /* renamed from: b */
    private final C10738l f35462b;
    @NonNull
    /* renamed from: c */
    private final C10746z f35463c;
    @NonNull
    /* renamed from: d */
    private final C3925u f35464d;
    @NonNull
    /* renamed from: e */
    private final aj f35465e;

    @Inject
    public C10844c(@NonNull C10735f c10735f, @NonNull C10738l c10738l, @NonNull C10746z c10746z, @NotDisplayedByDefault @NonNull C3925u c3925u, @NotDisplayedByDefault @NonNull aj ajVar) {
        this.f35461a = c10735f;
        this.f35462b = c10738l;
        this.f35463c = c10746z;
        this.f35464d = c3925u;
        this.f35465e = ajVar;
    }

    @NonNull
    /* renamed from: a */
    public CoreUser m43313a(@NonNull User user) {
        Gender create;
        String id = user.id();
        String bio = user.bio();
        String birthDate = user.birthDate();
        DateTime a = birthDate != null ? this.f35462b.m43129a(birthDate) : null;
        String name = user.name();
        Integer gender = user.gender();
        if (gender != null) {
            create = Gender.create(gender.intValue(), user.customGender());
        } else {
            create = Gender.create(Value.UNKNOWN);
        }
        List b = m43309b(user.badges());
        List e = m43312e(user.photos());
        return CoreUser.builder().id(id).badges(b).bio(bio).birthDate(a).gender(create).name(name).photos(e).jobs(m43311d(user.jobs())).schools(m43310c(user.schools())).build();
    }

    @NonNull
    /* renamed from: b */
    private List<Badge> m43309b(@Nullable List<com.tinder.api.model.common.Badge> list) {
        return this.f35461a.a((List) Objects.b(list, Collections.emptyList()));
    }

    @NonNull
    /* renamed from: c */
    private List<School> m43310c(@Nullable List<com.tinder.api.model.common.School> list) {
        return this.f35465e.a((List) Objects.b(list, Collections.emptyList()));
    }

    @NonNull
    /* renamed from: d */
    private List<Job> m43311d(@Nullable List<com.tinder.api.model.common.Job> list) {
        return this.f35464d.a((List) Objects.b(list, Collections.emptyList()));
    }

    @NonNull
    /* renamed from: e */
    private List<Photo> m43312e(@Nullable List<com.tinder.api.model.common.Photo> list) {
        return this.f35463c.a((List) Objects.b(list, Collections.emptyList()));
    }
}
