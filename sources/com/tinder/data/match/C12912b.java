package com.tinder.data.match;

import android.support.annotation.NonNull;
import com.tinder.data.match.C8680y.C10800a;
import com.tinder.data.model.MatchGroupMemberModel;
import com.tinder.data.model.MatchGroupModel;
import com.tinder.data.model.MatchPersonModel;

/* renamed from: com.tinder.data.match.b */
final class C12912b extends C10800a {
    /* renamed from: a */
    private final String f41390a;
    /* renamed from: b */
    private final MatchGroupModel f41391b;
    /* renamed from: c */
    private final MatchGroupMemberModel f41392c;
    /* renamed from: d */
    private final MatchPersonModel f41393d;

    C12912b(String str, MatchGroupModel matchGroupModel, MatchGroupMemberModel matchGroupMemberModel, MatchPersonModel matchPersonModel) {
        if (str == null) {
            throw new NullPointerException("Null g_id");
        }
        this.f41390a = str;
        if (matchGroupModel == null) {
            throw new NullPointerException("Null match_group");
        }
        this.f41391b = matchGroupModel;
        if (matchGroupMemberModel == null) {
            throw new NullPointerException("Null GM");
        }
        this.f41392c = matchGroupMemberModel;
        if (matchPersonModel == null) {
            throw new NullPointerException("Null match_person");
        }
        this.f41393d = matchPersonModel;
    }

    @NonNull
    public String g_id() {
        return this.f41390a;
    }

    @NonNull
    public MatchGroupModel match_group() {
        return this.f41391b;
    }

    @NonNull
    public MatchGroupMemberModel GM() {
        return this.f41392c;
    }

    @NonNull
    public MatchPersonModel match_person() {
        return this.f41393d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GroupView{g_id=");
        stringBuilder.append(this.f41390a);
        stringBuilder.append(", match_group=");
        stringBuilder.append(this.f41391b);
        stringBuilder.append(", GM=");
        stringBuilder.append(this.f41392c);
        stringBuilder.append(", match_person=");
        stringBuilder.append(this.f41393d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10800a)) {
            return false;
        }
        C10800a c10800a = (C10800a) obj;
        if (!this.f41390a.equals(c10800a.g_id()) || !this.f41391b.equals(c10800a.match_group()) || !this.f41392c.equals(c10800a.GM()) || this.f41393d.equals(c10800a.match_person()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.f41390a.hashCode() ^ 1000003) * 1000003) ^ this.f41391b.hashCode()) * 1000003) ^ this.f41392c.hashCode()) * 1000003) ^ this.f41393d.hashCode();
    }
}
