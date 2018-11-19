package com.tinder.feed.view.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.chat.view.model.C8493c;
import com.tinder.chat.view.model.C8495g;
import com.tinder.chat.view.model.PhotoMediaViewModel;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010&\u001a\u00020\u000fHÆ\u0003J\t\u0010'\u001a\u00020\u0011HÆ\u0003Jr\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d¨\u0006/"}, d2 = {"Lcom/tinder/feed/view/model/FeedUserInfoViewModel;", "", "name", "", "userId", "images", "", "Lcom/tinder/chat/view/model/PhotoMediaViewModel;", "schools", "Lcom/tinder/chat/view/model/ActivityFeedSchoolViewModel;", "jobs", "Lcom/tinder/chat/view/model/ActivityFeedJobViewModel;", "distanceInMiles", "", "gender", "Lcom/tinder/domain/common/model/Gender;", "isVerified", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Lcom/tinder/domain/common/model/Gender;Z)V", "getDistanceInMiles", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGender", "()Lcom/tinder/domain/common/model/Gender;", "getImages", "()Ljava/util/List;", "()Z", "getJobs", "getName", "()Ljava/lang/String;", "getSchools", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Lcom/tinder/domain/common/model/Gender;Z)Lcom/tinder/feed/view/model/FeedUserInfoViewModel;", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.model.e */
public final class C9539e {
    @NotNull
    /* renamed from: a */
    private final String f31910a;
    @NotNull
    /* renamed from: b */
    private final String f31911b;
    @NotNull
    /* renamed from: c */
    private final List<PhotoMediaViewModel> f31912c;
    @NotNull
    /* renamed from: d */
    private final List<C8495g> f31913d;
    @NotNull
    /* renamed from: e */
    private final List<C8493c> f31914e;
    @Nullable
    /* renamed from: f */
    private final Double f31915f;
    @NotNull
    /* renamed from: g */
    private final Gender f31916g;
    /* renamed from: h */
    private final boolean f31917h;

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C9539e m39801a(C9539e c9539e, String str, String str2, List list, List list2, List list3, Double d, Gender gender, boolean z, int i, Object obj) {
        C9539e c9539e2 = c9539e;
        int i2 = i;
        return c9539e2.m39802a((i2 & 1) != 0 ? c9539e2.f31910a : str, (i2 & 2) != 0 ? c9539e2.f31911b : str2, (i2 & 4) != 0 ? c9539e2.f31912c : list, (i2 & 8) != 0 ? c9539e2.f31913d : list2, (i2 & 16) != 0 ? c9539e2.f31914e : list3, (i2 & 32) != 0 ? c9539e2.f31915f : d, (i2 & 64) != 0 ? c9539e2.f31916g : gender, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? c9539e2.f31917h : z);
    }

    @NotNull
    /* renamed from: a */
    public final C9539e m39802a(@NotNull String str, @NotNull String str2, @NotNull List<? extends PhotoMediaViewModel> list, @NotNull List<C8495g> list2, @NotNull List<C8493c> list3, @Nullable Double d, @NotNull Gender gender, boolean z) {
        String str3 = str;
        C2668g.b(str3, "name");
        String str4 = str2;
        C2668g.b(str4, ManagerWebServices.PARAM_USER_ID);
        List<? extends PhotoMediaViewModel> list4 = list;
        C2668g.b(list4, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        List<C8495g> list5 = list2;
        C2668g.b(list5, ManagerWebServices.PARAM_SCHOOLS);
        List<C8493c> list6 = list3;
        C2668g.b(list6, ManagerWebServices.PARAM_JOBS);
        Gender gender2 = gender;
        C2668g.b(gender2, "gender");
        return new C9539e(str3, str4, list4, list5, list6, d, gender2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9539e) {
            C9539e c9539e = (C9539e) obj;
            if (C2668g.a(this.f31910a, c9539e.f31910a) && C2668g.a(this.f31911b, c9539e.f31911b) && C2668g.a(this.f31912c, c9539e.f31912c) && C2668g.a(this.f31913d, c9539e.f31913d) && C2668g.a(this.f31914e, c9539e.f31914e) && C2668g.a(this.f31915f, c9539e.f31915f) && C2668g.a(this.f31916g, c9539e.f31916g)) {
                if ((this.f31917h == c9539e.f31917h ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f31910a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31911b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.f31912c;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.f31913d;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.f31914e;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Double d = this.f31915f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Gender gender = this.f31916g;
        if (gender != null) {
            i = gender.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.f31917h;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedUserInfoViewModel(name=");
        stringBuilder.append(this.f31910a);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.f31911b);
        stringBuilder.append(", images=");
        stringBuilder.append(this.f31912c);
        stringBuilder.append(", schools=");
        stringBuilder.append(this.f31913d);
        stringBuilder.append(", jobs=");
        stringBuilder.append(this.f31914e);
        stringBuilder.append(", distanceInMiles=");
        stringBuilder.append(this.f31915f);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.f31916g);
        stringBuilder.append(", isVerified=");
        stringBuilder.append(this.f31917h);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9539e(@NotNull String str, @NotNull String str2, @NotNull List<? extends PhotoMediaViewModel> list, @NotNull List<C8495g> list2, @NotNull List<C8493c> list3, @Nullable Double d, @NotNull Gender gender, boolean z) {
        C2668g.b(str, "name");
        C2668g.b(str2, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        C2668g.b(list2, ManagerWebServices.PARAM_SCHOOLS);
        C2668g.b(list3, ManagerWebServices.PARAM_JOBS);
        C2668g.b(gender, "gender");
        this.f31910a = str;
        this.f31911b = str2;
        this.f31912c = list;
        this.f31913d = list2;
        this.f31914e = list3;
        this.f31915f = d;
        this.f31916g = gender;
        this.f31917h = z;
    }

    @NotNull
    /* renamed from: a */
    public final String m39803a() {
        return this.f31910a;
    }

    @NotNull
    /* renamed from: b */
    public final String m39804b() {
        return this.f31911b;
    }

    @NotNull
    /* renamed from: c */
    public final List<PhotoMediaViewModel> m39805c() {
        return this.f31912c;
    }

    @NotNull
    /* renamed from: d */
    public final List<C8495g> m39806d() {
        return this.f31913d;
    }

    @NotNull
    /* renamed from: e */
    public final List<C8493c> m39807e() {
        return this.f31914e;
    }

    @Nullable
    /* renamed from: f */
    public final Double m39808f() {
        return this.f31915f;
    }

    @NotNull
    /* renamed from: g */
    public final Gender m39809g() {
        return this.f31916g;
    }
}
