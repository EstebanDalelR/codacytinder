package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.common.SpotifyThemeTrack;
import com.tinder.api.model.common.User;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.model.School;
import com.tinder.domain.common.model.SpotifyArtist;
import com.tinder.domain.common.model.SpotifyTrack;
import java.util.Collections;
import java.util.List;
import java8.util.Objects;
import javax.inject.Inject;
import org.joda.time.DateTime;

public class ag extends C2646o<ProfileUser, User> {
    @NonNull
    /* renamed from: a */
    private final an f35104a;
    @NonNull
    /* renamed from: b */
    private final C10742q f35105b;
    @NonNull
    /* renamed from: c */
    private final al f35106c;
    @NonNull
    /* renamed from: d */
    private final C10746z f35107d;
    @NonNull
    /* renamed from: e */
    private final C10735f f35108e;
    @NonNull
    /* renamed from: f */
    private final C3925u f35109f;
    @NonNull
    /* renamed from: g */
    private final aj f35110g;

    @Inject
    public ag(@NonNull an anVar, @NonNull C10742q c10742q, @NonNull al alVar, @DisplayedByDefault @NonNull C3925u c3925u, @NonNull C10746z c10746z, @NonNull C10735f c10735f, @DisplayedByDefault @NonNull aj ajVar) {
        this.f35104a = anVar;
        this.f35105b = c10742q;
        this.f35106c = alVar;
        this.f35107d = c10746z;
        this.f35108e = c10735f;
        this.f35109f = c3925u;
        this.f35110g = ajVar;
    }

    @Nullable
    /* renamed from: a */
    public ProfileUser m43092a(@NonNull User user) {
        return ProfileUser.builder().id((String) Objects.b(user.id(), "")).badges(m43088c(user.badges())).bio((String) Objects.b(user.bio(), "")).birthDate(DateTime.a(user.birthDate())).gender(m43084a(user.gender())).name((String) Objects.b(user.name(), "")).photos(m43087b(user.photos())).jobs(m43089d(user.jobs())).schools(m43090e(user.schools())).instagram(m43085a(user.instagram())).spotifyTopArtists(m43091f(user.spotifyTopArtists())).spotifyThemeTrack(m43086a(user.spotifyThemeTrack())).spotifyConnected(((Boolean) Objects.b(user.spotifyConnected(), Boolean.valueOf(false))).booleanValue()).hideDistance(((Boolean) Objects.b(user.hideDistance(), Boolean.valueOf(false))).booleanValue()).hideAge(((Boolean) Objects.b(user.hideAge(), Boolean.valueOf(false))).booleanValue()).connectionCount(((Integer) Objects.b(user.connectionCount(), Integer.valueOf(0))).intValue()).verified(((Boolean) Objects.b(user.isVerified(), Boolean.valueOf(false))).booleanValue()).showGenderOnProfile(((Boolean) Objects.b(user.showGenderOnProfile(), Boolean.valueOf(false))).booleanValue()).build();
    }

    @NonNull
    /* renamed from: a */
    private Gender m43084a(@Nullable Integer num) {
        return Gender.create(Value.fromId(((Integer) Objects.b(num, Integer.valueOf(-1))).intValue()), null);
    }

    @NonNull
    /* renamed from: b */
    private List<Photo> m43087b(@Nullable List<com.tinder.api.model.common.Photo> list) {
        return this.f35107d.a((List) Objects.b(list, Collections.emptyList()));
    }

    @NonNull
    /* renamed from: c */
    private List<Badge> m43088c(@Nullable List<com.tinder.api.model.common.Badge> list) {
        return this.f35108e.a((List) Objects.b(list, Collections.emptyList()));
    }

    @NonNull
    /* renamed from: d */
    private List<Job> m43089d(@Nullable List<com.tinder.api.model.common.Job> list) {
        return this.f35109f.a((List) Objects.b(list, Collections.emptyList()));
    }

    @NonNull
    /* renamed from: e */
    private List<School> m43090e(@Nullable List<com.tinder.api.model.common.School> list) {
        return this.f35110g.a((List) Objects.b(list, Collections.emptyList()));
    }

    @NonNull
    /* renamed from: f */
    private List<SpotifyArtist> m43091f(@Nullable List<com.tinder.api.model.common.SpotifyArtist> list) {
        return this.f35106c.a((List) Objects.b(list, Collections.emptyList()));
    }

    @Nullable
    /* renamed from: a */
    private Instagram m43085a(@Nullable com.tinder.api.model.common.Instagram instagram) {
        return instagram == null ? null : this.f35105b.m43139a(instagram);
    }

    @Nullable
    /* renamed from: a */
    private SpotifyTrack m43086a(@Nullable SpotifyThemeTrack spotifyThemeTrack) {
        return spotifyThemeTrack == null ? null : this.f35104a.m43108a(spotifyThemeTrack);
    }
}
