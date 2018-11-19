package com.tinder.profile.p363b;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.CommonConnection;
import com.tinder.etl.event.sd;
import com.tinder.etl.event.sd.C9244a;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bk;
import com.tinder.passport.p093d.C3945a;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.Profile.Adornment;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.model.ProfileShareAction;
import com.tinder.profile.model.ProfileShareSource;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001$B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ4\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000b\u001a\u00020\fJ6\u0010\u0015\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0019\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\u001a\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u001e\u0010\u001b\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u0017H\u0002J\u0014\u0010\u001d\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/tinder/profile/interactor/ProfileShareEventFactory;", "", "managerSharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "managerPassport", "Lcom/tinder/passport/manager/ManagerPassport;", "(Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/passport/manager/ManagerPassport;)V", "create", "Lcom/tinder/etl/event/ProfileShareEvent;", "profile", "Lcom/tinder/profile/model/Profile;", "shareInformation", "Lcom/tinder/profile/interactor/ProfileShareEventFactory$ShareInformation;", "userId", "", "isSuperLike", "", "isRecTraveling", "commonConnections", "", "Lcom/tinder/domain/common/model/CommonConnection;", "createFromActionItem", "firstDegrees", "", "secondDegrees", "createFromFeed", "getNumberOfFirstDegreeConnections", "getNumberOfNthConnections", "degree", "getNumberOfSecondDegreeConnections", "mapProfileScreenSourceToShareSource", "Lcom/tinder/profile/model/ProfileShareSource;", "source", "Lcom/tinder/profile/ProfileScreenSource;", "mapProfileSourceToShareSource", "Lcom/tinder/profile/model/Profile$Source;", "ShareInformation", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.b.aj */
public final class aj {
    /* renamed from: a */
    private final bk f45575a;
    /* renamed from: b */
    private final C3945a f45576b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, d2 = {"Lcom/tinder/profile/interactor/ProfileShareEventFactory$ShareInformation;", "", "shareTargetApp", "", "completed", "", "referralURL", "shareSource", "Lcom/tinder/profile/model/ProfileShareSource;", "shareAction", "Lcom/tinder/profile/model/ProfileShareAction;", "(Ljava/lang/String;ZLjava/lang/String;Lcom/tinder/profile/model/ProfileShareSource;Lcom/tinder/profile/model/ProfileShareAction;)V", "getCompleted", "()Z", "getReferralURL", "()Ljava/lang/String;", "getShareAction", "()Lcom/tinder/profile/model/ProfileShareAction;", "getShareSource", "()Lcom/tinder/profile/model/ProfileShareSource;", "getShareTargetApp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.b.aj$a */
    public static final class C14373a {
        @NotNull
        /* renamed from: a */
        private final String f45570a;
        /* renamed from: b */
        private final boolean f45571b;
        @NotNull
        /* renamed from: c */
        private final String f45572c;
        @NotNull
        /* renamed from: d */
        private final ProfileShareSource f45573d;
        @NotNull
        /* renamed from: e */
        private final ProfileShareAction f45574e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14373a) {
                C14373a c14373a = (C14373a) obj;
                if (C2668g.a(this.f45570a, c14373a.f45570a)) {
                    return (this.f45571b == c14373a.f45571b ? 1 : null) != null && C2668g.a(this.f45572c, c14373a.f45572c) && C2668g.a(this.f45573d, c14373a.f45573d) && C2668g.a(this.f45574e, c14373a.f45574e);
                }
            }
        }

        public int hashCode() {
            String str = this.f45570a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            int i2 = this.f45571b;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            String str2 = this.f45572c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            ProfileShareSource profileShareSource = this.f45573d;
            hashCode = (hashCode + (profileShareSource != null ? profileShareSource.hashCode() : 0)) * 31;
            ProfileShareAction profileShareAction = this.f45574e;
            if (profileShareAction != null) {
                i = profileShareAction.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ShareInformation(shareTargetApp=");
            stringBuilder.append(this.f45570a);
            stringBuilder.append(", completed=");
            stringBuilder.append(this.f45571b);
            stringBuilder.append(", referralURL=");
            stringBuilder.append(this.f45572c);
            stringBuilder.append(", shareSource=");
            stringBuilder.append(this.f45573d);
            stringBuilder.append(", shareAction=");
            stringBuilder.append(this.f45574e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14373a(@NotNull String str, boolean z, @NotNull String str2, @NotNull ProfileShareSource profileShareSource, @NotNull ProfileShareAction profileShareAction) {
            C2668g.b(str, "shareTargetApp");
            C2668g.b(str2, "referralURL");
            C2668g.b(profileShareSource, "shareSource");
            C2668g.b(profileShareAction, "shareAction");
            this.f45570a = str;
            this.f45571b = z;
            this.f45572c = str2;
            this.f45573d = profileShareSource;
            this.f45574e = profileShareAction;
        }

        @NotNull
        /* renamed from: a */
        public final String m54754a() {
            return this.f45570a;
        }

        /* renamed from: b */
        public final boolean m54755b() {
            return this.f45571b;
        }

        @NotNull
        /* renamed from: c */
        public final String m54756c() {
            return this.f45572c;
        }

        @NotNull
        /* renamed from: d */
        public final ProfileShareSource m54757d() {
            return this.f45573d;
        }

        @NotNull
        /* renamed from: e */
        public final ProfileShareAction m54758e() {
            return this.f45574e;
        }
    }

    @Inject
    public aj(@NotNull bk bkVar, @NotNull C3945a c3945a) {
        C2668g.b(bkVar, "managerSharedPreferences");
        C2668g.b(c3945a, "managerPassport");
        this.f45575a = bkVar;
        this.f45576b = c3945a;
    }

    @NotNull
    /* renamed from: a */
    public final sd m54761a(@NotNull Profile profile, @NotNull C14373a c14373a) {
        C2668g.b(profile, "profile");
        C2668g.b(c14373a, "shareInformation");
        c14373a = sd.a().e(profile.mo11651a()).b(Boolean.valueOf(profile.mo11647B())).c(Boolean.valueOf(profile.mo11661k().contains(Adornment.PASSPORT))).a(Integer.valueOf(ManagerProfile.a(this.f45575a.N()))).d(Boolean.valueOf(this.f45576b.d())).a(c14373a.m54754a()).a(Boolean.valueOf(c14373a.m54755b())).b(c14373a.m54756c()).c(c14373a.m54757d().getValue()).d(c14373a.m54758e().getValue());
        if (!profile.mo11672v().isEmpty()) {
            List v = profile.mo11672v();
            C2668g.a(v, "profile.connections()");
            C9244a b = c14373a.b(Integer.valueOf(m54760a(v)));
            profile = profile.mo11672v();
            C2668g.a(profile, "profile.connections()");
            b.c(Integer.valueOf(m54767b(profile)));
        }
        profile = c14373a.a();
        C2668g.a(profile, "eventBuilder.build()");
        return profile;
    }

    @NotNull
    /* renamed from: a */
    public final sd m54764a(@NotNull String str, boolean z, boolean z2, @NotNull List<? extends CommonConnection> list, @NotNull C14373a c14373a) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(list, "commonConnections");
        C2668g.b(c14373a, "shareInformation");
        str = sd.a().e(str).b(Boolean.valueOf(z)).c(Boolean.valueOf(z2)).a(Integer.valueOf(ManagerProfile.a(this.f45575a.N()))).d(Boolean.valueOf(this.f45576b.d())).a(c14373a.m54754a()).a(Boolean.valueOf(c14373a.m54755b())).b(c14373a.m54756c()).c(c14373a.m54757d().getValue()).d(c14373a.m54758e().getValue());
        if (!list.isEmpty()) {
            str.b(Integer.valueOf(m54760a((List) list))).c(Integer.valueOf(m54767b(list)));
        }
        str = str.a();
        C2668g.a(str, "eventBuilder.build()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final sd m54763a(@NotNull String str, boolean z, boolean z2, int i, int i2, @NotNull C14373a c14373a) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(c14373a, "shareInformation");
        str = sd.a().e(str).b(Boolean.valueOf(z)).c(Boolean.valueOf(z2)).a(Integer.valueOf(ManagerProfile.a(this.f45575a.N()))).d(Boolean.valueOf(this.f45576b.d())).a(c14373a.m54754a()).a(Boolean.valueOf(c14373a.m54755b())).b(c14373a.m54756c()).c(c14373a.m54757d().getValue()).d(c14373a.m54758e().getValue()).b(Integer.valueOf(i)).c(Integer.valueOf(i2)).a();
        C2668g.a(str, "eventBuilder.build()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final sd m54762a(@NotNull String str, @NotNull C14373a c14373a) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(c14373a, "shareInformation");
        str = sd.a().e(str).a(Integer.valueOf(ManagerProfile.a(this.f45575a.N()))).d(Boolean.valueOf(this.f45576b.d())).a(c14373a.m54754a()).a(Boolean.valueOf(c14373a.m54755b())).b(c14373a.m54756c()).c(c14373a.m54757d().getValue()).d(c14373a.m54758e().getValue()).a();
        C2668g.a(str, "ProfileShareEvent.builde…lue)\n            .build()");
        return str;
    }

    /* renamed from: a */
    public final int m54760a(@NotNull List<? extends CommonConnection> list) {
        C2668g.b(list, "commonConnections");
        return m54759a((List) list, 1);
    }

    /* renamed from: b */
    public final int m54767b(@NotNull List<? extends CommonConnection> list) {
        C2668g.b(list, "commonConnections");
        return m54759a((List) list, 2);
    }

    /* renamed from: a */
    private final int m54759a(List<? extends CommonConnection> list, int i) {
        int i2 = 0;
        for (CommonConnection degree : list) {
            if (degree.degree() == i) {
                i2++;
            }
        }
        return i2;
    }

    @Nullable
    /* renamed from: a */
    public final ProfileShareSource m54766a(@NotNull Source source) {
        C2668g.b(source, "source");
        switch (source) {
            case MATCH:
                return ProfileShareSource.MATCH;
            case FASTMATCH:
                return ProfileShareSource.FASTMATCH;
            case TOP_PICKS:
                return ProfileShareSource.TOPPICKS;
            case REC:
                return ProfileShareSource.CARDSTACK_PROFILE;
            case PLACES:
                return ProfileShareSource.PLACES;
            default:
                return null;
        }
    }

    @NotNull
    /* renamed from: a */
    public final ProfileShareSource m54765a(@NotNull ProfileScreenSource profileScreenSource) {
        C2668g.b(profileScreenSource, "source");
        switch (profileScreenSource) {
            case PLACES_RECS:
                return ProfileShareSource.PLACES;
            case LIKES_YOU:
                return ProfileShareSource.FASTMATCH;
            case TOP_PICKS:
                return ProfileShareSource.TOPPICKS;
            case RECS:
                return ProfileShareSource.CARDSTACK_PROFILE;
            case CHAT:
                return ProfileShareSource.MATCH;
            case FEED:
                return ProfileShareSource.FEED;
            default:
                throw ((Throwable) new IllegalStateException("Profile screen source does not map to ShareSource"));
        }
    }
}
