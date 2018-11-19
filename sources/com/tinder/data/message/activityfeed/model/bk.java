package com.tinder.data.message.activityfeed.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel.Select_profile_change_bioModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0005\u001a\u00020\u0006H\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\b\u0010\u001c\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ProfileChangeBioByActivityFeedItemId;", "Lcom/tinder/data/model/activityfeed/ProfileChangeBioModel$Select_profile_change_bioModel;", "userNumber", "", "timestamp", "bio", "", "oldBio", "(JJLjava/lang/String;Ljava/lang/String;)V", "getBio", "()Ljava/lang/String;", "getOldBio", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "old_bio", "toString", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class bk implements Select_profile_change_bioModel {
    /* renamed from: a */
    private final long f35342a;
    /* renamed from: b */
    private final long f35343b;
    @NotNull
    /* renamed from: c */
    private final String f35344c;
    @NotNull
    /* renamed from: d */
    private final String f35345d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bk) {
            bk bkVar = (bk) obj;
            if ((this.f35342a == bkVar.f35342a ? 1 : null) != null) {
                return ((this.f35343b > bkVar.f35343b ? 1 : (this.f35343b == bkVar.f35343b ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35344c, bkVar.f35344c) && C2668g.a(this.f35345d, bkVar.f35345d);
            }
        }
    }

    public int hashCode() {
        long j = this.f35342a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f35343b;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f35344c;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f35345d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileChangeBioByActivityFeedItemId(userNumber=");
        stringBuilder.append(this.f35342a);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35343b);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.f35344c);
        stringBuilder.append(", oldBio=");
        stringBuilder.append(this.f35345d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public bk(long j, long j2, @NotNull String str, @NotNull String str2) {
        C2668g.b(str, ManagerWebServices.PARAM_BIO);
        C2668g.b(str2, "oldBio");
        this.f35342a = j;
        this.f35343b = j2;
        this.f35344c = str;
        this.f35345d = str2;
    }

    public long user_number() {
        return this.f35342a;
    }

    public long timestamp() {
        return this.f35343b;
    }

    @NotNull
    public String bio() {
        return this.f35344c;
    }

    @NotNull
    public String old_bio() {
        return this.f35345d;
    }
}
