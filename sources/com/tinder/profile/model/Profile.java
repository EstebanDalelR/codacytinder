package com.tinder.profile.model;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.R;
import com.tinder.common.utils.C8578a;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Badge.Type;
import com.tinder.domain.common.model.CommonConnection;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.Interest;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.model.School;
import com.tinder.domain.common.model.SpotifyArtist;
import com.tinder.domain.common.model.SpotifyTrack;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.recs.DeepLinkReferralInfo;
import com.tinder.domain.recs.model.PlacesUserRec;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.TopPickUserRec;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.utils.AgeCalculator;
import com.tinder.managers.bj;
import com.tinder.profile.dialogs.CensorMenuDialog.MenuItem;
import com.tinder.profile.model.C16108a.C16107a;
import com.tinder.recsads.model.BrandedProfileCardAd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java8.util.Objects;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

public abstract class Profile {

    /* renamed from: com.tinder.profile.model.Profile$1 */
    static /* synthetic */ class C144161 {
        /* renamed from: a */
        static final /* synthetic */ int[] f45629a = new int[Type.values().length];
        /* renamed from: b */
        static final /* synthetic */ int[] f45630b = new int[Value.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.domain.common.model.Gender.Value.values();
            r0 = r0.length;
            r0 = new int[r0];
            f45630b = r0;
            r0 = 1;
            r1 = f45630b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.tinder.domain.common.model.Gender.Value.MALE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f45630b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.tinder.domain.common.model.Gender.Value.FEMALE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = com.tinder.domain.common.model.Badge.Type.values();
            r2 = r2.length;
            r2 = new int[r2];
            f45629a = r2;
            r2 = f45629a;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = com.tinder.domain.common.model.Badge.Type.VERIFIED;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0032 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0032 }
        L_0x0032:
            r0 = f45629a;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = com.tinder.domain.common.model.Badge.Type.PEOPLE_MAG;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r0[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.profile.model.Profile.1.<clinit>():void");
        }
    }

    public enum Adornment {
        SUPERLIKE,
        BOOST,
        MUTED,
        PASSPORT,
        GROUP,
        FAST_MATCH,
        TOP_PICKS,
        PLACES
    }

    public enum EnabledServices {
        INSTAGRAM,
        SPOTIFY
    }

    public enum Source {
        REC,
        MATCH,
        USER,
        AD,
        FASTMATCH,
        TOP_PICKS,
        PLACES
    }

    /* renamed from: com.tinder.profile.model.Profile$a */
    public static abstract class C14417a {
        /* renamed from: a */
        public abstract C14417a mo11615a(int i);

        /* renamed from: a */
        public abstract C14417a mo11616a(Instagram instagram);

        /* renamed from: a */
        public abstract C14417a mo11617a(SpotifyTrack spotifyTrack);

        /* renamed from: a */
        public abstract C14417a mo11618a(DeepLinkReferralInfo deepLinkReferralInfo);

        /* renamed from: a */
        public abstract C14417a mo11619a(Source source);

        /* renamed from: a */
        public abstract C14417a mo11620a(Boolean bool);

        /* renamed from: a */
        public abstract C14417a mo11621a(Integer num);

        /* renamed from: a */
        public abstract C14417a mo11622a(String str);

        /* renamed from: a */
        public abstract C14417a mo11623a(List<Photo> list);

        /* renamed from: a */
        public abstract C14417a mo11624a(Set<Adornment> set);

        /* renamed from: a */
        public abstract C14417a mo11625a(boolean z);

        /* renamed from: a */
        public abstract Profile mo11626a();

        /* renamed from: b */
        public abstract C14417a mo11627b(int i);

        /* renamed from: b */
        public abstract C14417a mo11628b(String str);

        /* renamed from: b */
        public abstract C14417a mo11629b(List<EnabledServices> list);

        /* renamed from: b */
        public abstract C14417a mo11630b(Set<MenuItem> set);

        /* renamed from: b */
        public abstract C14417a mo11631b(boolean z);

        /* renamed from: c */
        public abstract C14417a mo11632c(String str);

        /* renamed from: c */
        public abstract C14417a mo11633c(List<Interest> list);

        /* renamed from: c */
        public abstract C14417a mo11634c(boolean z);

        /* renamed from: d */
        public abstract C14417a mo11635d(String str);

        /* renamed from: d */
        public abstract C14417a mo11636d(List<SpotifyArtist> list);

        /* renamed from: e */
        public abstract C14417a mo11637e(String str);

        /* renamed from: e */
        public abstract C14417a mo11638e(List<CommonConnection> list);

        /* renamed from: f */
        public abstract C14417a mo11639f(String str);

        /* renamed from: g */
        public abstract C14417a mo11640g(String str);

        /* renamed from: h */
        public abstract C14417a mo11641h(String str);

        /* renamed from: i */
        public abstract C14417a mo11642i(String str);

        /* renamed from: j */
        public abstract C14417a mo11643j(String str);

        /* renamed from: k */
        public abstract C14417a mo11644k(String str);

        /* renamed from: l */
        public abstract C14417a mo11645l(String str);
    }

    /* renamed from: com.tinder.profile.model.Profile$b */
    public static class C14418b {
        @NonNull
        /* renamed from: a */
        private final Resources f45631a;
        @NonNull
        /* renamed from: b */
        private final bj f45632b;
        @NonNull
        /* renamed from: c */
        private final AgeCalculator f45633c;
        @NonNull
        /* renamed from: d */
        private final CurrentUserProvider f45634d;

        @Inject
        public C14418b(@NonNull Resources resources, @NonNull bj bjVar, @NonNull AgeCalculator ageCalculator, @NonNull CurrentUserProvider currentUserProvider) {
            this.f45631a = resources;
            this.f45632b = bjVar;
            this.f45633c = ageCalculator;
            this.f45634d = currentUserProvider;
        }

        @NonNull
        /* renamed from: a */
        public Profile m54932a(@NonNull UserRec userRec, int i) {
            C14417a E;
            PerspectableUser user = userRec.getUser();
            List a = m54926a();
            if (userRec.isFastMatch()) {
                E = m54930a(user, Source.FASTMATCH, Adornment.FAST_MATCH).mo11650E();
            } else {
                if (!userRec.isTopPick()) {
                    if (userRec.getType() != RecType.TOP_PICK) {
                        if (userRec instanceof PlacesUserRec) {
                            E = m54930a(user, Source.PLACES, Adornment.PLACES).mo11650E();
                            E.mo11645l(((PlacesUserRec) userRec).getPlaceId());
                        } else {
                            E = m54930a(user, Source.REC, new Adornment[0]).mo11650E();
                        }
                    }
                }
                TopPickUserRec topPickUserRec = (TopPickUserRec) userRec;
                E = m54930a(user, Source.TOP_PICKS, Adornment.TOP_PICKS).mo11650E().mo11620a(Boolean.valueOf(topPickUserRec.getTags().isEmpty() ^ true));
            }
            return E.mo11615a(i).mo11634c(userRec.isSuperLike()).mo11629b(a).mo11618a(RecFieldDecorationExtensionsKt.deepLinkInfo(userRec)).mo11626a();
        }

        @NonNull
        /* renamed from: a */
        public Profile m54930a(@NonNull PerspectableUser perspectableUser, Source source, Adornment... adornmentArr) {
            boolean z;
            Source source2 = source;
            ProfileUser profileUser = perspectableUser.profileUser();
            Set hashSet = new HashSet(Arrays.asList(adornmentArr));
            boolean contains = hashSet.contains(Adornment.SUPERLIKE);
            boolean z2 = true;
            String a = m54923a(perspectableUser.name(), m54934a(perspectableUser.birthDate(), profileUser.hideAge()).isEmpty() ^ true);
            String a2 = m54924a(perspectableUser.badges());
            String a3 = m54922a(perspectableUser.gender(), profileUser.showGenderOnProfile());
            String c = m54929c(perspectableUser.jobs());
            String a4 = m54925a(perspectableUser.schools(), 0);
            String str = "";
            if (a4.isEmpty()) {
                a4 = m54925a(perspectableUser.schools(), 1);
            } else {
                str = m54925a(perspectableUser.schools(), 1);
            }
            String a5 = m54921a(perspectableUser.distanceMiles(), source2, perspectableUser.profileUser().hideDistance());
            if (!(source2 == Source.MATCH || source2 == Source.REC)) {
                if (!hashSet.contains(Adornment.GROUP)) {
                    z = false;
                    if (source2 == Source.REC) {
                        z2 = false;
                    }
                    return Profile.m54935F().mo11622a(perspectableUser.id()).mo11628b(a).mo11632c(perspectableUser.name()).mo11635d((String) Objects.m59116b(perspectableUser.bio(), "")).mo11637e(a3).mo11623a(perspectableUser.photos()).mo11639f(a2).mo11621a(m54928b(perspectableUser.badges())).mo11640g(m54934a(perspectableUser.birthDate(), profileUser.hideAge())).mo11641h(a5).mo11633c(perspectableUser.commmonInterests()).mo11642i(c).mo11643j(a4).mo11644k(str).mo11638e(perspectableUser.commonConnections()).mo11636d(profileUser.spotifyTopArtists()).mo11617a(profileUser.spotifyThemeTrack()).mo11616a(profileUser.instagram()).mo11627b(perspectableUser.profileUser().connectionCount()).mo11629b(m54926a()).mo11619a(source2).mo11615a(0).mo11624a(hashSet).mo11630b(m54927a(source2, hashSet.contains(Adornment.GROUP))).mo11625a(z2).mo11631b(z).mo11634c(contains).mo11626a();
                }
            }
            z = true;
            if (source2 == Source.REC) {
                z2 = false;
            }
            return Profile.m54935F().mo11622a(perspectableUser.id()).mo11628b(a).mo11632c(perspectableUser.name()).mo11635d((String) Objects.m59116b(perspectableUser.bio(), "")).mo11637e(a3).mo11623a(perspectableUser.photos()).mo11639f(a2).mo11621a(m54928b(perspectableUser.badges())).mo11640g(m54934a(perspectableUser.birthDate(), profileUser.hideAge())).mo11641h(a5).mo11633c(perspectableUser.commmonInterests()).mo11642i(c).mo11643j(a4).mo11644k(str).mo11638e(perspectableUser.commonConnections()).mo11636d(profileUser.spotifyTopArtists()).mo11617a(profileUser.spotifyThemeTrack()).mo11616a(profileUser.instagram()).mo11627b(perspectableUser.profileUser().connectionCount()).mo11629b(m54926a()).mo11619a(source2).mo11615a(0).mo11624a(hashSet).mo11630b(m54927a(source2, hashSet.contains(Adornment.GROUP))).mo11625a(z2).mo11631b(z).mo11634c(contains).mo11626a();
        }

        @NonNull
        /* renamed from: a */
        public String m54934a(@Nullable DateTime dateTime, boolean z) {
            if (dateTime != null) {
                if (!z) {
                    dateTime = this.f45633c.yearsSinceDate(dateTime);
                    if (dateTime == null) {
                        dateTime = "";
                    }
                    return dateTime;
                }
            }
            return "";
        }

        @NonNull
        /* renamed from: a */
        private String m54924a(@NonNull List<Badge> list) {
            if (list.isEmpty()) {
                return "";
            }
            switch (C144161.f45629a[((Badge) list.get(0)).type().ordinal()]) {
                case 1:
                    return this.f45631a.getString(R.string.badges_verified);
                case 2:
                    return "People Magazine's Sexiest Man";
                default:
                    throw new IllegalArgumentException("Unknown badge type");
            }
        }

        @Nullable
        /* renamed from: b */
        private Integer m54928b(@NonNull List<Badge> list) {
            if (list.isEmpty()) {
                return null;
            }
            switch (C144161.f45629a[((Badge) list.get(0)).type().ordinal()]) {
                case 1:
                    return Integer.valueOf(R.drawable.verification_badge_bordered);
                case 2:
                    return Integer.valueOf(R.drawable.people_magazine_badge);
                default:
                    throw new IllegalArgumentException("Unknown badge type");
            }
        }

        /* renamed from: a */
        private String m54925a(@NonNull List<School> list, int i) {
            if (list.size() < i + 1) {
                return "";
            }
            return ((School) list.get(i)).displayed() ? ((School) list.get(i)).name() : "";
        }

        /* renamed from: a */
        private String m54921a(int i, @NonNull Source source, boolean z) {
            if (z) {
                return "";
            }
            z = this.f45632b.a();
            if (!z) {
                i = (int) (((float) i) * 1070464730);
            }
            if (source == Source.USER) {
                if (i < 0) {
                    return "";
                }
                if (z) {
                    return this.f45631a.getString(R.string.small_distance_away);
                }
                return this.f45631a.getString(R.string.small_distance_away_km);
            } else if (i == 0) {
                return "";
            } else {
                source = z ? R.plurals.distance_units_away_mi : R.plurals.distance_units_away_km;
                if (i != 1) {
                    return this.f45631a.getQuantityString(source, i, new Object[]{Integer.valueOf(i)});
                } else if (z) {
                    return this.f45631a.getString(R.string.small_distance_away);
                } else {
                    return this.f45631a.getString(R.string.small_distance_away_km);
                }
            }
        }

        @Nullable
        /* renamed from: a */
        private String m54922a(@Nullable Gender gender, boolean z) {
            if (gender != null) {
                if (z) {
                    if (!C8578a.a(gender.customGender())) {
                        return gender.customGender();
                    }
                    switch (C144161.f45630b[gender.value().ordinal()]) {
                        case 1:
                            return this.f45631a.getString(true);
                        case 2:
                            return this.f45631a.getString(true);
                        default:
                            return "";
                    }
                }
            }
            return "";
        }

        @NonNull
        /* renamed from: c */
        private String m54929c(@NonNull List<Job> list) {
            for (Job job : list) {
                if (!job.companyDisplayed()) {
                    if (job.titleDisplayed()) {
                        break;
                    }
                }
                break;
            }
            Job job2 = null;
            if (job2 == null) {
                return "";
            }
            list = job2.titleDisplayed();
            boolean companyDisplayed = job2.companyDisplayed();
            if (list != null && companyDisplayed) {
                return this.f45631a.getString(R.string.job_at, new Object[]{job2.titleName(), job2.companyName()});
            } else if (list != null) {
                return job2.titleName();
            } else {
                return companyDisplayed ? job2.companyName() : "";
            }
        }

        @NonNull
        /* renamed from: a */
        private Set<MenuItem> m54927a(@NonNull Source source, boolean z) {
            Set<MenuItem> hashSet = new HashSet();
            if (source == Source.REC) {
                hashSet.add(MenuItem.REPORT);
                hashSet.add(MenuItem.RECOMMEND);
                return hashSet;
            } else if (source == Source.USER && z) {
                return hashSet;
            } else {
                if (source != Source.MATCH) {
                    return Collections.emptySet();
                }
                hashSet.add(MenuItem.UN_MATCH);
                hashSet.add(MenuItem.REPORT);
                return hashSet;
            }
        }

        @NonNull
        /* renamed from: a */
        private List<EnabledServices> m54926a() {
            ProfileUser profileUser = this.f45634d.get();
            if (profileUser == null) {
                return Collections.emptyList();
            }
            List<EnabledServices> linkedList = new LinkedList();
            if (profileUser.spotifyConnected()) {
                linkedList.add(EnabledServices.SPOTIFY);
            }
            Instagram instagram = profileUser.instagram();
            if (!(instagram == null || instagram.username() == null)) {
                linkedList.add(EnabledServices.INSTAGRAM);
            }
            return linkedList;
        }

        @NonNull
        /* renamed from: a */
        private String m54923a(String str, boolean z) {
            String string = this.f45631a.getString(R.string.long_name);
            String string2 = this.f45631a.getString(R.string.comma);
            if (str.length() > 20) {
                return String.format(string, new Object[]{str.substring(0, 17)});
            } else if (!z) {
                return str;
            } else {
                return String.format(string2, new Object[]{str});
            }
        }

        @NotNull
        /* renamed from: a */
        public Profile m54931a(@NotNull MessageAdMatch messageAdMatch) {
            return Profile.m54935F().mo11622a(messageAdMatch.getId()).mo11628b(messageAdMatch.getTitle()).mo11632c(messageAdMatch.getTitle()).mo11635d(messageAdMatch.getBody()).mo11619a(Source.MATCH).mo11623a(messageAdMatch.getPhotos()).mo11615a(0).mo11639f("").mo11624a(Collections.emptySet()).mo11629b(Collections.emptyList()).mo11640g("").mo11641h("").mo11633c(Collections.emptyList()).mo11642i("").mo11643j("").mo11644k("").mo11636d(Collections.emptyList()).mo11627b(0).mo11638e(Collections.emptyList()).mo11630b(Collections.emptySet()).mo11625a(false).mo11631b(false).mo11634c(false).mo11626a();
        }

        /* renamed from: a */
        public Profile m54933a(BrandedProfileCardAd brandedProfileCardAd, int i, int i2, int i3) {
            List arrayList = new ArrayList(brandedProfileCardAd.images().size());
            for (String str : brandedProfileCardAd.images()) {
                arrayList.add(Photo.builder().id(str).url(str).videos(Collections.emptyList()).renders(Collections.singletonList(Render.builder().width(i2).height(i3).url(str).build())).build());
            }
            return Profile.m54935F().mo11622a(brandedProfileCardAd.lineItemId()).mo11628b(brandedProfileCardAd.title()).mo11632c(brandedProfileCardAd.title()).mo11635d(brandedProfileCardAd.bio()).mo11619a(Source.AD).mo11623a(arrayList).mo11615a(i).mo11639f("").mo11624a(Collections.emptySet()).mo11629b(Collections.emptyList()).mo11640g("").mo11641h("").mo11633c(Collections.emptyList()).mo11642i("").mo11643j("").mo11644k("").mo11636d(Collections.emptyList()).mo11627b(0).mo11638e(Collections.emptyList()).mo11630b(Collections.emptySet()).mo11625a(false).mo11631b(false).mo11634c(false).mo11626a();
        }
    }

    /* renamed from: A */
    public abstract boolean mo11646A();

    /* renamed from: B */
    public abstract boolean mo11647B();

    @Nullable
    /* renamed from: C */
    public abstract Boolean mo11648C();

    @Nullable
    /* renamed from: D */
    public abstract DeepLinkReferralInfo mo11649D();

    /* renamed from: E */
    public abstract C14417a mo11650E();

    @NonNull
    /* renamed from: a */
    public abstract String mo11651a();

    @NonNull
    /* renamed from: b */
    public abstract String mo11652b();

    @NonNull
    /* renamed from: c */
    public abstract String mo11653c();

    @NonNull
    /* renamed from: d */
    public abstract String mo11654d();

    @Nullable
    /* renamed from: e */
    public abstract String mo11655e();

    @NonNull
    /* renamed from: f */
    public abstract List<Photo> mo11656f();

    /* renamed from: g */
    public abstract int mo11657g();

    @NonNull
    /* renamed from: h */
    public abstract String mo11658h();

    @Nullable
    /* renamed from: i */
    public abstract Integer mo11659i();

    @NonNull
    /* renamed from: j */
    public abstract Source mo11660j();

    @NonNull
    /* renamed from: k */
    public abstract Set<Adornment> mo11661k();

    @NonNull
    /* renamed from: l */
    public abstract List<EnabledServices> mo11662l();

    @NonNull
    /* renamed from: m */
    public abstract String mo11663m();

    @NonNull
    /* renamed from: n */
    public abstract String mo11664n();

    @NonNull
    /* renamed from: o */
    public abstract List<Interest> mo11665o();

    @NonNull
    /* renamed from: p */
    public abstract String mo11666p();

    @NonNull
    /* renamed from: q */
    public abstract String mo11667q();

    @NonNull
    /* renamed from: r */
    public abstract String mo11668r();

    @Nullable
    /* renamed from: s */
    public abstract SpotifyTrack mo11669s();

    @NonNull
    /* renamed from: t */
    public abstract List<SpotifyArtist> mo11670t();

    /* renamed from: u */
    public abstract int mo11671u();

    @NonNull
    /* renamed from: v */
    public abstract List<CommonConnection> mo11672v();

    @Nullable
    /* renamed from: w */
    public abstract Instagram mo11673w();

    @NonNull
    /* renamed from: x */
    public abstract Set<MenuItem> mo11674x();

    @Nullable
    /* renamed from: y */
    public abstract String mo11675y();

    /* renamed from: z */
    public abstract boolean mo11676z();

    /* renamed from: F */
    public static C14417a m54935F() {
        return new C16107a();
    }
}
