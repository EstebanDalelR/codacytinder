package com.tinder.views.grid.p450b;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Quality;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.visitor.UserPhotoExtKt;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.domain.recs.model.UserRec;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/tinder/views/grid/viewmodel/GridNotificationViewModel;", "", "userId", "", "name", "avatarUrl", "isSuccessful", "", "matchId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "()Z", "getMatchId", "getName", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Factory", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.views.grid.b.a */
public final class C15455a {
    /* renamed from: a */
    public static final C15454a f47881a = new C15454a();
    @NotNull
    /* renamed from: b */
    private final String f47882b;
    @NotNull
    /* renamed from: c */
    private final String f47883c;
    @NotNull
    /* renamed from: d */
    private final String f47884d;
    /* renamed from: e */
    private final boolean f47885e;
    @NotNull
    /* renamed from: f */
    private final String f47886f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/tinder/views/grid/viewmodel/GridNotificationViewModel$Factory;", "", "()V", "findAvatarUrl", "", "rec", "Lcom/tinder/domain/recs/model/Rec;", "fromMatch", "Lcom/tinder/views/grid/viewmodel/GridNotificationViewModel;", "match", "Lcom/tinder/domain/match/model/Match;", "fromRec", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.views.grid.b.a$a */
    public static final class C15454a {
        private C15454a() {
        }

        @Nullable
        /* renamed from: a */
        public final C15455a m57946a(@NotNull Match match) {
            C2668g.b(match, "match");
            if (!(match instanceof CoreMatch)) {
                return null;
            }
            CoreMatch coreMatch = (CoreMatch) match;
            String id = coreMatch.getPerson().id();
            C2668g.a(id, "match.person.id()");
            String name = coreMatch.getPerson().name();
            C2668g.a(name, "match.person.name()");
            return new C15455a(id, name, UserPhotoExtKt.avatarUrl(coreMatch.getPerson(), Quality.M), true, match.getId());
        }

        @NotNull
        /* renamed from: a */
        public final C15455a m57947a(@NotNull Rec rec) {
            C2668g.b(rec, "rec");
            String id = rec.getId();
            String name = RecFieldDecorationExtensionsKt.name(rec);
            rec = m57945b(rec);
            if (rec == null) {
                rec = "";
            }
            return new C15455a(id, name, rec, false, "");
        }

        /* renamed from: b */
        private final String m57945b(Rec rec) {
            if (rec instanceof UserRec) {
                rec = ((UserRec) rec).getUser().photos();
                if (!rec.isEmpty()) {
                    return ((Photo) rec.get(0)).url();
                }
            }
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15455a) {
            C15455a c15455a = (C15455a) obj;
            if (C2668g.a(this.f47882b, c15455a.f47882b) && C2668g.a(this.f47883c, c15455a.f47883c) && C2668g.a(this.f47884d, c15455a.f47884d)) {
                return (this.f47885e == c15455a.f47885e ? 1 : null) != null && C2668g.a(this.f47886f, c15455a.f47886f);
            }
        }
    }

    public int hashCode() {
        String str = this.f47882b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f47883c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f47884d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.f47885e;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str2 = this.f47886f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GridNotificationViewModel(userId=");
        stringBuilder.append(this.f47882b);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f47883c);
        stringBuilder.append(", avatarUrl=");
        stringBuilder.append(this.f47884d);
        stringBuilder.append(", isSuccessful=");
        stringBuilder.append(this.f47885e);
        stringBuilder.append(", matchId=");
        stringBuilder.append(this.f47886f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15455a(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(str2, "name");
        C2668g.b(str3, "avatarUrl");
        C2668g.b(str4, "matchId");
        this.f47882b = str;
        this.f47883c = str2;
        this.f47884d = str3;
        this.f47885e = z;
        this.f47886f = str4;
    }

    @NotNull
    /* renamed from: a */
    public final String m57948a() {
        return this.f47883c;
    }

    @NotNull
    /* renamed from: b */
    public final String m57949b() {
        return this.f47884d;
    }

    /* renamed from: c */
    public final boolean m57950c() {
        return this.f47885e;
    }

    @NotNull
    /* renamed from: d */
    public final String m57951d() {
        return this.f47886f;
    }
}
