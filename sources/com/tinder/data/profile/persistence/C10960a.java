package com.tinder.data.profile.persistence;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.School;
import com.tinder.domain.common.model.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÂ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÂ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÂ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005HÂ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005HÂ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005HÂ\u0003J\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\"\u001a\u00020#HÖ\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005H\u0016J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/tinder/data/profile/persistence/PaperUser;", "Lcom/tinder/domain/common/model/User;", "id", "", "badges", "", "Lcom/tinder/domain/common/model/Badge;", "bio", "birthDate", "Lorg/joda/time/DateTime;", "gender", "Lcom/tinder/domain/common/model/Gender;", "name", "photos", "Lcom/tinder/domain/common/model/Photo;", "jobs", "Lcom/tinder/domain/common/model/Job;", "schools", "Lcom/tinder/domain/common/model/School;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lorg/joda/time/DateTime;Lcom/tinder/domain/common/model/Gender;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.persistence.a */
public final class C10960a implements User {
    /* renamed from: a */
    private final String f35668a;
    /* renamed from: b */
    private final List<Badge> f35669b;
    /* renamed from: c */
    private final String f35670c;
    /* renamed from: d */
    private final DateTime f35671d;
    /* renamed from: e */
    private final Gender f35672e;
    /* renamed from: f */
    private final String f35673f;
    /* renamed from: g */
    private final List<Photo> f35674g;
    /* renamed from: h */
    private final List<Job> f35675h;
    /* renamed from: i */
    private final List<School> f35676i;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10960a) {
                C10960a c10960a = (C10960a) obj;
                if (C2668g.a(this.f35668a, c10960a.f35668a) && C2668g.a(this.f35669b, c10960a.f35669b) && C2668g.a(this.f35670c, c10960a.f35670c) && C2668g.a(this.f35671d, c10960a.f35671d) && C2668g.a(this.f35672e, c10960a.f35672e) && C2668g.a(this.f35673f, c10960a.f35673f) && C2668g.a(this.f35674g, c10960a.f35674g) && C2668g.a(this.f35675h, c10960a.f35675h) && C2668g.a(this.f35676i, c10960a.f35676i)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f35668a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f35669b;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f35670c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        DateTime dateTime = this.f35671d;
        hashCode = (hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        Gender gender = this.f35672e;
        hashCode = (hashCode + (gender != null ? gender.hashCode() : 0)) * 31;
        str2 = this.f35673f;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        list = this.f35674g;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.f35675h;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.f35676i;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PaperUser(id=");
        stringBuilder.append(this.f35668a);
        stringBuilder.append(", badges=");
        stringBuilder.append(this.f35669b);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.f35670c);
        stringBuilder.append(", birthDate=");
        stringBuilder.append(this.f35671d);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.f35672e);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f35673f);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.f35674g);
        stringBuilder.append(", jobs=");
        stringBuilder.append(this.f35675h);
        stringBuilder.append(", schools=");
        stringBuilder.append(this.f35676i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10960a(@NotNull String str, @NotNull List<? extends Badge> list, @Nullable String str2, @Nullable DateTime dateTime, @NotNull Gender gender, @NotNull String str3, @NotNull List<? extends Photo> list2, @NotNull List<? extends Job> list3, @NotNull List<? extends School> list4) {
        C2668g.b(str, "id");
        C2668g.b(list, ManagerWebServices.PARAM_BADGES);
        C2668g.b(gender, "gender");
        C2668g.b(str3, "name");
        C2668g.b(list2, "photos");
        C2668g.b(list3, ManagerWebServices.PARAM_JOBS);
        C2668g.b(list4, ManagerWebServices.PARAM_SCHOOLS);
        this.f35668a = str;
        this.f35669b = list;
        this.f35670c = str2;
        this.f35671d = dateTime;
        this.f35672e = gender;
        this.f35673f = str3;
        this.f35674g = list2;
        this.f35675h = list3;
        this.f35676i = list4;
    }

    @NotNull
    public String id() {
        return this.f35668a;
    }

    @NotNull
    public List<Badge> badges() {
        return this.f35669b;
    }

    @Nullable
    public String bio() {
        return this.f35670c;
    }

    @Nullable
    public DateTime birthDate() {
        return this.f35671d;
    }

    @NotNull
    public Gender gender() {
        return this.f35672e;
    }

    @NotNull
    public String name() {
        return this.f35673f;
    }

    @NotNull
    public List<Photo> photos() {
        return this.f35674g;
    }

    @NotNull
    public List<Job> jobs() {
        return this.f35675h;
    }

    @NotNull
    public List<School> schools() {
        return this.f35676i;
    }
}
