package com.tinder.profile.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.CommonConnection;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.Interest;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.SpotifyArtist;
import com.tinder.domain.common.model.SpotifyTrack;
import com.tinder.domain.recs.DeepLinkReferralInfo;
import com.tinder.profile.dialogs.CensorMenuDialog.MenuItem;
import com.tinder.profile.model.Profile.Adornment;
import com.tinder.profile.model.Profile.C14417a;
import com.tinder.profile.model.Profile.EnabledServices;
import com.tinder.profile.model.Profile.Source;
import java.util.List;
import java.util.Set;

/* renamed from: com.tinder.profile.model.a */
final class C16108a extends Profile {
    /* renamed from: A */
    private final boolean f50128A;
    /* renamed from: B */
    private final boolean f50129B;
    /* renamed from: C */
    private final Boolean f50130C;
    /* renamed from: D */
    private final DeepLinkReferralInfo f50131D;
    /* renamed from: a */
    private final String f50132a;
    /* renamed from: b */
    private final String f50133b;
    /* renamed from: c */
    private final String f50134c;
    /* renamed from: d */
    private final String f50135d;
    /* renamed from: e */
    private final String f50136e;
    /* renamed from: f */
    private final List<Photo> f50137f;
    /* renamed from: g */
    private final int f50138g;
    /* renamed from: h */
    private final String f50139h;
    /* renamed from: i */
    private final Integer f50140i;
    /* renamed from: j */
    private final Source f50141j;
    /* renamed from: k */
    private final Set<Adornment> f50142k;
    /* renamed from: l */
    private final List<EnabledServices> f50143l;
    /* renamed from: m */
    private final String f50144m;
    /* renamed from: n */
    private final String f50145n;
    /* renamed from: o */
    private final List<Interest> f50146o;
    /* renamed from: p */
    private final String f50147p;
    /* renamed from: q */
    private final String f50148q;
    /* renamed from: r */
    private final String f50149r;
    /* renamed from: s */
    private final SpotifyTrack f50150s;
    /* renamed from: t */
    private final List<SpotifyArtist> f50151t;
    /* renamed from: u */
    private final int f50152u;
    /* renamed from: v */
    private final List<CommonConnection> f50153v;
    /* renamed from: w */
    private final Instagram f50154w;
    /* renamed from: x */
    private final Set<MenuItem> f50155x;
    /* renamed from: y */
    private final String f50156y;
    /* renamed from: z */
    private final boolean f50157z;

    /* renamed from: com.tinder.profile.model.a$a */
    static final class C16107a extends C14417a {
        /* renamed from: A */
        private Boolean f50098A;
        /* renamed from: B */
        private Boolean f50099B;
        /* renamed from: C */
        private Boolean f50100C;
        /* renamed from: D */
        private DeepLinkReferralInfo f50101D;
        /* renamed from: a */
        private String f50102a;
        /* renamed from: b */
        private String f50103b;
        /* renamed from: c */
        private String f50104c;
        /* renamed from: d */
        private String f50105d;
        /* renamed from: e */
        private String f50106e;
        /* renamed from: f */
        private List<Photo> f50107f;
        /* renamed from: g */
        private Integer f50108g;
        /* renamed from: h */
        private String f50109h;
        /* renamed from: i */
        private Integer f50110i;
        /* renamed from: j */
        private Source f50111j;
        /* renamed from: k */
        private Set<Adornment> f50112k;
        /* renamed from: l */
        private List<EnabledServices> f50113l;
        /* renamed from: m */
        private String f50114m;
        /* renamed from: n */
        private String f50115n;
        /* renamed from: o */
        private List<Interest> f50116o;
        /* renamed from: p */
        private String f50117p;
        /* renamed from: q */
        private String f50118q;
        /* renamed from: r */
        private String f50119r;
        /* renamed from: s */
        private SpotifyTrack f50120s;
        /* renamed from: t */
        private List<SpotifyArtist> f50121t;
        /* renamed from: u */
        private Integer f50122u;
        /* renamed from: v */
        private List<CommonConnection> f50123v;
        /* renamed from: w */
        private Instagram f50124w;
        /* renamed from: x */
        private Set<MenuItem> f50125x;
        /* renamed from: y */
        private String f50126y;
        /* renamed from: z */
        private Boolean f50127z;

        C16107a() {
        }

        C16107a(Profile profile) {
            this.f50102a = profile.mo11651a();
            this.f50103b = profile.mo11652b();
            this.f50104c = profile.mo11653c();
            this.f50105d = profile.mo11654d();
            this.f50106e = profile.mo11655e();
            this.f50107f = profile.mo11656f();
            this.f50108g = Integer.valueOf(profile.mo11657g());
            this.f50109h = profile.mo11658h();
            this.f50110i = profile.mo11659i();
            this.f50111j = profile.mo11660j();
            this.f50112k = profile.mo11661k();
            this.f50113l = profile.mo11662l();
            this.f50114m = profile.mo11663m();
            this.f50115n = profile.mo11664n();
            this.f50116o = profile.mo11665o();
            this.f50117p = profile.mo11666p();
            this.f50118q = profile.mo11667q();
            this.f50119r = profile.mo11668r();
            this.f50120s = profile.mo11669s();
            this.f50121t = profile.mo11670t();
            this.f50122u = Integer.valueOf(profile.mo11671u());
            this.f50123v = profile.mo11672v();
            this.f50124w = profile.mo11673w();
            this.f50125x = profile.mo11674x();
            this.f50126y = profile.mo11675y();
            this.f50127z = Boolean.valueOf(profile.mo11676z());
            this.f50098A = Boolean.valueOf(profile.mo11646A());
            this.f50099B = Boolean.valueOf(profile.mo11647B());
            this.f50100C = profile.mo11648C();
            this.f50101D = profile.mo11649D();
        }

        /* renamed from: a */
        public C14417a mo11622a(String str) {
            this.f50102a = str;
            return this;
        }

        /* renamed from: b */
        public C14417a mo11628b(String str) {
            this.f50103b = str;
            return this;
        }

        /* renamed from: c */
        public C14417a mo11632c(String str) {
            this.f50104c = str;
            return this;
        }

        /* renamed from: d */
        public C14417a mo11635d(String str) {
            this.f50105d = str;
            return this;
        }

        /* renamed from: e */
        public C14417a mo11637e(@Nullable String str) {
            this.f50106e = str;
            return this;
        }

        /* renamed from: a */
        public C14417a mo11623a(List<Photo> list) {
            this.f50107f = list;
            return this;
        }

        /* renamed from: a */
        public C14417a mo11615a(int i) {
            this.f50108g = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public C14417a mo11639f(String str) {
            this.f50109h = str;
            return this;
        }

        /* renamed from: a */
        public C14417a mo11621a(@Nullable Integer num) {
            this.f50110i = num;
            return this;
        }

        /* renamed from: a */
        public C14417a mo11619a(Source source) {
            this.f50111j = source;
            return this;
        }

        /* renamed from: a */
        public C14417a mo11624a(Set<Adornment> set) {
            this.f50112k = set;
            return this;
        }

        /* renamed from: b */
        public C14417a mo11629b(List<EnabledServices> list) {
            this.f50113l = list;
            return this;
        }

        /* renamed from: g */
        public C14417a mo11640g(String str) {
            this.f50114m = str;
            return this;
        }

        /* renamed from: h */
        public C14417a mo11641h(String str) {
            this.f50115n = str;
            return this;
        }

        /* renamed from: c */
        public C14417a mo11633c(List<Interest> list) {
            this.f50116o = list;
            return this;
        }

        /* renamed from: i */
        public C14417a mo11642i(String str) {
            this.f50117p = str;
            return this;
        }

        /* renamed from: j */
        public C14417a mo11643j(String str) {
            this.f50118q = str;
            return this;
        }

        /* renamed from: k */
        public C14417a mo11644k(String str) {
            this.f50119r = str;
            return this;
        }

        /* renamed from: a */
        public C14417a mo11617a(@Nullable SpotifyTrack spotifyTrack) {
            this.f50120s = spotifyTrack;
            return this;
        }

        /* renamed from: d */
        public C14417a mo11636d(List<SpotifyArtist> list) {
            this.f50121t = list;
            return this;
        }

        /* renamed from: b */
        public C14417a mo11627b(int i) {
            this.f50122u = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C14417a mo11638e(List<CommonConnection> list) {
            this.f50123v = list;
            return this;
        }

        /* renamed from: a */
        public C14417a mo11616a(@Nullable Instagram instagram) {
            this.f50124w = instagram;
            return this;
        }

        /* renamed from: b */
        public C14417a mo11630b(Set<MenuItem> set) {
            this.f50125x = set;
            return this;
        }

        /* renamed from: l */
        public C14417a mo11645l(@Nullable String str) {
            this.f50126y = str;
            return this;
        }

        /* renamed from: a */
        public C14417a mo11625a(boolean z) {
            this.f50127z = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: b */
        public C14417a mo11631b(boolean z) {
            this.f50098A = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: c */
        public C14417a mo11634c(boolean z) {
            this.f50099B = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C14417a mo11620a(@Nullable Boolean bool) {
            this.f50100C = bool;
            return this;
        }

        /* renamed from: a */
        public C14417a mo11618a(@Nullable DeepLinkReferralInfo deepLinkReferralInfo) {
            this.f50101D = deepLinkReferralInfo;
            return this;
        }

        /* renamed from: a */
        public Profile mo11626a() {
            String str = "";
            if (this.f50102a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (r0.f50103b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" name");
                str = stringBuilder.toString();
            }
            if (r0.f50104c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" rawName");
                str = stringBuilder.toString();
            }
            if (r0.f50105d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" bio");
                str = stringBuilder.toString();
            }
            if (r0.f50107f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" photos");
                str = stringBuilder.toString();
            }
            if (r0.f50108g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" initialPhotoPosition");
                str = stringBuilder.toString();
            }
            if (r0.f50109h == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" badgeText");
                str = stringBuilder.toString();
            }
            if (r0.f50111j == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" source");
                str = stringBuilder.toString();
            }
            if (r0.f50112k == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" adornments");
                str = stringBuilder.toString();
            }
            if (r0.f50113l == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" enabledServices");
                str = stringBuilder.toString();
            }
            if (r0.f50114m == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" age");
                str = stringBuilder.toString();
            }
            if (r0.f50115n == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" distance");
                str = stringBuilder.toString();
            }
            if (r0.f50116o == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" interests");
                str = stringBuilder.toString();
            }
            if (r0.f50117p == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" job");
                str = stringBuilder.toString();
            }
            if (r0.f50118q == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" firstSchoolToDisplay");
                str = stringBuilder.toString();
            }
            if (r0.f50119r == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" secondSchoolToDisplay");
                str = stringBuilder.toString();
            }
            if (r0.f50121t == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" topArtists");
                str = stringBuilder.toString();
            }
            if (r0.f50122u == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" numConnections");
                str = stringBuilder.toString();
            }
            if (r0.f50123v == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" connections");
                str = stringBuilder.toString();
            }
            if (r0.f50125x == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" censorMenuDialogMenuItems");
                str = stringBuilder.toString();
            }
            if (r0.f50127z == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isBasicInfoShareRecViewVisible");
                str = stringBuilder.toString();
            }
            if (r0.f50098A == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isProfileButtonOverflowVisible");
                str = stringBuilder.toString();
            }
            if (r0.f50099B == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isSuperLike");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                String str2 = r0.f50102a;
                String str3 = r0.f50103b;
                String str4 = r0.f50104c;
                String str5 = r0.f50105d;
                String str6 = r0.f50106e;
                List list = r0.f50107f;
                int intValue = r0.f50108g.intValue();
                String str7 = r0.f50109h;
                Integer num = r0.f50110i;
                Source source = r0.f50111j;
                Set set = r0.f50112k;
                List list2 = r0.f50113l;
                String str8 = r0.f50114m;
                String str9 = r0.f50115n;
                String str10 = str8;
                List list3 = r0.f50116o;
                String str11 = r0.f50117p;
                String str12 = r0.f50118q;
                String str13 = r0.f50119r;
                SpotifyTrack spotifyTrack = r0.f50120s;
                List list4 = r0.f50121t;
                String str14 = str9;
                int intValue2 = r0.f50122u.intValue();
                List list5 = r0.f50123v;
                List list6 = list4;
                Instagram instagram = r0.f50124w;
                Set set2 = r0.f50125x;
                str8 = r0.f50126y;
                List list7 = list5;
                return new C16108a(str2, str3, str4, str5, str6, list, intValue, str7, num, source, set, list2, str10, str14, list3, str11, str12, str13, spotifyTrack, list6, intValue2, list7, instagram, set2, str8, r0.f50127z.booleanValue(), r0.f50098A.booleanValue(), r0.f50099B.booleanValue(), r0.f50100C, r0.f50101D);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16108a(String str, String str2, String str3, String str4, @Nullable String str5, List<Photo> list, int i, String str6, @Nullable Integer num, Source source, Set<Adornment> set, List<EnabledServices> list2, String str7, String str8, List<Interest> list3, String str9, String str10, String str11, @Nullable SpotifyTrack spotifyTrack, List<SpotifyArtist> list4, int i2, List<CommonConnection> list5, @Nullable Instagram instagram, Set<MenuItem> set2, @Nullable String str12, boolean z, boolean z2, boolean z3, @Nullable Boolean bool, @Nullable DeepLinkReferralInfo deepLinkReferralInfo) {
        this.f50132a = str;
        this.f50133b = str2;
        this.f50134c = str3;
        this.f50135d = str4;
        this.f50136e = str5;
        this.f50137f = list;
        this.f50138g = i;
        this.f50139h = str6;
        this.f50140i = num;
        this.f50141j = source;
        this.f50142k = set;
        this.f50143l = list2;
        this.f50144m = str7;
        this.f50145n = str8;
        this.f50146o = list3;
        this.f50147p = str9;
        this.f50148q = str10;
        this.f50149r = str11;
        this.f50150s = spotifyTrack;
        this.f50151t = list4;
        this.f50152u = i2;
        this.f50153v = list5;
        this.f50154w = instagram;
        this.f50155x = set2;
        this.f50156y = str12;
        this.f50157z = z;
        this.f50128A = z2;
        this.f50129B = z3;
        this.f50130C = bool;
        this.f50131D = deepLinkReferralInfo;
    }

    @NonNull
    /* renamed from: a */
    public String mo11651a() {
        return this.f50132a;
    }

    @NonNull
    /* renamed from: b */
    public String mo11652b() {
        return this.f50133b;
    }

    @NonNull
    /* renamed from: c */
    public String mo11653c() {
        return this.f50134c;
    }

    @NonNull
    /* renamed from: d */
    public String mo11654d() {
        return this.f50135d;
    }

    @Nullable
    /* renamed from: e */
    public String mo11655e() {
        return this.f50136e;
    }

    @NonNull
    /* renamed from: f */
    public List<Photo> mo11656f() {
        return this.f50137f;
    }

    /* renamed from: g */
    public int mo11657g() {
        return this.f50138g;
    }

    @NonNull
    /* renamed from: h */
    public String mo11658h() {
        return this.f50139h;
    }

    @Nullable
    /* renamed from: i */
    public Integer mo11659i() {
        return this.f50140i;
    }

    @NonNull
    /* renamed from: j */
    public Source mo11660j() {
        return this.f50141j;
    }

    @NonNull
    /* renamed from: k */
    public Set<Adornment> mo11661k() {
        return this.f50142k;
    }

    @NonNull
    /* renamed from: l */
    public List<EnabledServices> mo11662l() {
        return this.f50143l;
    }

    @NonNull
    /* renamed from: m */
    public String mo11663m() {
        return this.f50144m;
    }

    @NonNull
    /* renamed from: n */
    public String mo11664n() {
        return this.f50145n;
    }

    @NonNull
    /* renamed from: o */
    public List<Interest> mo11665o() {
        return this.f50146o;
    }

    @NonNull
    /* renamed from: p */
    public String mo11666p() {
        return this.f50147p;
    }

    @NonNull
    /* renamed from: q */
    public String mo11667q() {
        return this.f50148q;
    }

    @NonNull
    /* renamed from: r */
    public String mo11668r() {
        return this.f50149r;
    }

    @Nullable
    /* renamed from: s */
    public SpotifyTrack mo11669s() {
        return this.f50150s;
    }

    @NonNull
    /* renamed from: t */
    public List<SpotifyArtist> mo11670t() {
        return this.f50151t;
    }

    /* renamed from: u */
    public int mo11671u() {
        return this.f50152u;
    }

    @NonNull
    /* renamed from: v */
    public List<CommonConnection> mo11672v() {
        return this.f50153v;
    }

    @Nullable
    /* renamed from: w */
    public Instagram mo11673w() {
        return this.f50154w;
    }

    @NonNull
    /* renamed from: x */
    public Set<MenuItem> mo11674x() {
        return this.f50155x;
    }

    @Nullable
    /* renamed from: y */
    public String mo11675y() {
        return this.f50156y;
    }

    /* renamed from: z */
    public boolean mo11676z() {
        return this.f50157z;
    }

    /* renamed from: A */
    public boolean mo11646A() {
        return this.f50128A;
    }

    /* renamed from: B */
    public boolean mo11647B() {
        return this.f50129B;
    }

    @Nullable
    /* renamed from: C */
    public Boolean mo11648C() {
        return this.f50130C;
    }

    @Nullable
    /* renamed from: D */
    public DeepLinkReferralInfo mo11649D() {
        return this.f50131D;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Profile{id=");
        stringBuilder.append(this.f50132a);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f50133b);
        stringBuilder.append(", rawName=");
        stringBuilder.append(this.f50134c);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.f50135d);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.f50136e);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.f50137f);
        stringBuilder.append(", initialPhotoPosition=");
        stringBuilder.append(this.f50138g);
        stringBuilder.append(", badgeText=");
        stringBuilder.append(this.f50139h);
        stringBuilder.append(", badgeImageRes=");
        stringBuilder.append(this.f50140i);
        stringBuilder.append(", source=");
        stringBuilder.append(this.f50141j);
        stringBuilder.append(", adornments=");
        stringBuilder.append(this.f50142k);
        stringBuilder.append(", enabledServices=");
        stringBuilder.append(this.f50143l);
        stringBuilder.append(", age=");
        stringBuilder.append(this.f50144m);
        stringBuilder.append(", distance=");
        stringBuilder.append(this.f50145n);
        stringBuilder.append(", interests=");
        stringBuilder.append(this.f50146o);
        stringBuilder.append(", job=");
        stringBuilder.append(this.f50147p);
        stringBuilder.append(", firstSchoolToDisplay=");
        stringBuilder.append(this.f50148q);
        stringBuilder.append(", secondSchoolToDisplay=");
        stringBuilder.append(this.f50149r);
        stringBuilder.append(", anthem=");
        stringBuilder.append(this.f50150s);
        stringBuilder.append(", topArtists=");
        stringBuilder.append(this.f50151t);
        stringBuilder.append(", numConnections=");
        stringBuilder.append(this.f50152u);
        stringBuilder.append(", connections=");
        stringBuilder.append(this.f50153v);
        stringBuilder.append(", instagram=");
        stringBuilder.append(this.f50154w);
        stringBuilder.append(", censorMenuDialogMenuItems=");
        stringBuilder.append(this.f50155x);
        stringBuilder.append(", placeId=");
        stringBuilder.append(this.f50156y);
        stringBuilder.append(", isBasicInfoShareRecViewVisible=");
        stringBuilder.append(this.f50157z);
        stringBuilder.append(", isProfileButtonOverflowVisible=");
        stringBuilder.append(this.f50128A);
        stringBuilder.append(", isSuperLike=");
        stringBuilder.append(this.f50129B);
        stringBuilder.append(", isTaggedUser=");
        stringBuilder.append(this.f50130C);
        stringBuilder.append(", deepLinkReferralInfo=");
        stringBuilder.append(this.f50131D);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.profile.model.Profile;
        r2 = 0;
        if (r1 == 0) goto L_0x01af;
    L_0x0009:
        r5 = (com.tinder.profile.model.Profile) r5;
        r1 = r4.f50132a;
        r3 = r5.mo11651a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x0017:
        r1 = r4.f50133b;
        r3 = r5.mo11652b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x0023:
        r1 = r4.f50134c;
        r3 = r5.mo11653c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x002f:
        r1 = r4.f50135d;
        r3 = r5.mo11654d();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x003b:
        r1 = r4.f50136e;
        if (r1 != 0) goto L_0x0046;
    L_0x003f:
        r1 = r5.mo11655e();
        if (r1 != 0) goto L_0x01ad;
    L_0x0045:
        goto L_0x0052;
    L_0x0046:
        r1 = r4.f50136e;
        r3 = r5.mo11655e();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x0052:
        r1 = r4.f50137f;
        r3 = r5.mo11656f();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x005e:
        r1 = r4.f50138g;
        r3 = r5.mo11657g();
        if (r1 != r3) goto L_0x01ad;
    L_0x0066:
        r1 = r4.f50139h;
        r3 = r5.mo11658h();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x0072:
        r1 = r4.f50140i;
        if (r1 != 0) goto L_0x007d;
    L_0x0076:
        r1 = r5.mo11659i();
        if (r1 != 0) goto L_0x01ad;
    L_0x007c:
        goto L_0x0089;
    L_0x007d:
        r1 = r4.f50140i;
        r3 = r5.mo11659i();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x0089:
        r1 = r4.f50141j;
        r3 = r5.mo11660j();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x0095:
        r1 = r4.f50142k;
        r3 = r5.mo11661k();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x00a1:
        r1 = r4.f50143l;
        r3 = r5.mo11662l();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x00ad:
        r1 = r4.f50144m;
        r3 = r5.mo11663m();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x00b9:
        r1 = r4.f50145n;
        r3 = r5.mo11664n();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x00c5:
        r1 = r4.f50146o;
        r3 = r5.mo11665o();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x00d1:
        r1 = r4.f50147p;
        r3 = r5.mo11666p();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x00dd:
        r1 = r4.f50148q;
        r3 = r5.mo11667q();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x00e9:
        r1 = r4.f50149r;
        r3 = r5.mo11668r();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x00f5:
        r1 = r4.f50150s;
        if (r1 != 0) goto L_0x0100;
    L_0x00f9:
        r1 = r5.mo11669s();
        if (r1 != 0) goto L_0x01ad;
    L_0x00ff:
        goto L_0x010c;
    L_0x0100:
        r1 = r4.f50150s;
        r3 = r5.mo11669s();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x010c:
        r1 = r4.f50151t;
        r3 = r5.mo11670t();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x0118:
        r1 = r4.f50152u;
        r3 = r5.mo11671u();
        if (r1 != r3) goto L_0x01ad;
    L_0x0120:
        r1 = r4.f50153v;
        r3 = r5.mo11672v();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x012c:
        r1 = r4.f50154w;
        if (r1 != 0) goto L_0x0137;
    L_0x0130:
        r1 = r5.mo11673w();
        if (r1 != 0) goto L_0x01ad;
    L_0x0136:
        goto L_0x0143;
    L_0x0137:
        r1 = r4.f50154w;
        r3 = r5.mo11673w();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x0143:
        r1 = r4.f50155x;
        r3 = r5.mo11674x();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x014f:
        r1 = r4.f50156y;
        if (r1 != 0) goto L_0x015a;
    L_0x0153:
        r1 = r5.mo11675y();
        if (r1 != 0) goto L_0x01ad;
    L_0x0159:
        goto L_0x0166;
    L_0x015a:
        r1 = r4.f50156y;
        r3 = r5.mo11675y();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x0166:
        r1 = r4.f50157z;
        r3 = r5.mo11676z();
        if (r1 != r3) goto L_0x01ad;
    L_0x016e:
        r1 = r4.f50128A;
        r3 = r5.mo11646A();
        if (r1 != r3) goto L_0x01ad;
    L_0x0176:
        r1 = r4.f50129B;
        r3 = r5.mo11647B();
        if (r1 != r3) goto L_0x01ad;
    L_0x017e:
        r1 = r4.f50130C;
        if (r1 != 0) goto L_0x0189;
    L_0x0182:
        r1 = r5.mo11648C();
        if (r1 != 0) goto L_0x01ad;
    L_0x0188:
        goto L_0x0195;
    L_0x0189:
        r1 = r4.f50130C;
        r3 = r5.mo11648C();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01ad;
    L_0x0195:
        r1 = r4.f50131D;
        if (r1 != 0) goto L_0x01a0;
    L_0x0199:
        r5 = r5.mo11649D();
        if (r5 != 0) goto L_0x01ad;
    L_0x019f:
        goto L_0x01ae;
    L_0x01a0:
        r1 = r4.f50131D;
        r5 = r5.mo11649D();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x01ad;
    L_0x01ac:
        goto L_0x01ae;
    L_0x01ad:
        r0 = 0;
    L_0x01ae:
        return r0;
    L_0x01af:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.profile.model.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1237;
        int hashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((((this.f50132a.hashCode() ^ 1000003) * 1000003) ^ this.f50133b.hashCode()) * 1000003) ^ this.f50134c.hashCode()) * 1000003) ^ this.f50135d.hashCode()) * 1000003) ^ (this.f50136e == null ? 0 : this.f50136e.hashCode())) * 1000003) ^ this.f50137f.hashCode()) * 1000003) ^ this.f50138g) * 1000003) ^ this.f50139h.hashCode()) * 1000003) ^ (this.f50140i == null ? 0 : this.f50140i.hashCode())) * 1000003) ^ this.f50141j.hashCode()) * 1000003) ^ this.f50142k.hashCode()) * 1000003) ^ this.f50143l.hashCode()) * 1000003) ^ this.f50144m.hashCode()) * 1000003) ^ this.f50145n.hashCode()) * 1000003) ^ this.f50146o.hashCode()) * 1000003) ^ this.f50147p.hashCode()) * 1000003) ^ this.f50148q.hashCode()) * 1000003) ^ this.f50149r.hashCode()) * 1000003) ^ (this.f50150s == null ? 0 : this.f50150s.hashCode())) * 1000003) ^ this.f50151t.hashCode()) * 1000003) ^ this.f50152u) * 1000003) ^ this.f50153v.hashCode()) * 1000003) ^ (this.f50154w == null ? 0 : this.f50154w.hashCode())) * 1000003) ^ this.f50155x.hashCode()) * 1000003) ^ (this.f50156y == null ? 0 : this.f50156y.hashCode())) * 1000003) ^ (this.f50157z ? 1231 : 1237)) * 1000003) ^ (this.f50128A ? 1231 : 1237)) * 1000003;
        if (this.f50129B) {
            i2 = 1231;
        }
        hashCode = (((hashCode ^ i2) * 1000003) ^ (this.f50130C == null ? 0 : this.f50130C.hashCode())) * 1000003;
        if (this.f50131D != null) {
            i = this.f50131D.hashCode();
        }
        return hashCode ^ i;
    }

    /* renamed from: E */
    public C14417a mo11650E() {
        return new C16107a(this);
    }
}
