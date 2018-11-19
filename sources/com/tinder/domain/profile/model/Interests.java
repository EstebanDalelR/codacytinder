package com.tinder.domain.profile.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Interest;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/profile/model/Interests;", "", "interests", "", "Lcom/tinder/domain/common/model/Interest;", "(Ljava/util/List;)V", "getInterests", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Interests {
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final Interests DEFAULT = new Interests(C19301m.a());
    @NotNull
    private final List<Interest> interests;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/profile/model/Interests$Companion;", "", "()V", "DEFAULT", "Lcom/tinder/domain/profile/model/Interests;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    @NotNull
    public static /* synthetic */ Interests copy$default(Interests interests, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = interests.interests;
        }
        return interests.copy(list);
    }

    @NotNull
    public final List<Interest> component1() {
        return this.interests;
    }

    @NotNull
    public final Interests copy(@NotNull List<? extends Interest> list) {
        C2668g.b(list, ManagerWebServices.PARAM_INTERESTS);
        return new Interests(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Interests) {
                if (C2668g.a(this.interests, ((Interests) obj).interests)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.interests;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Interests(interests=");
        stringBuilder.append(this.interests);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Interests(@NotNull List<? extends Interest> list) {
        C2668g.b(list, ManagerWebServices.PARAM_INTERESTS);
        this.interests = list;
    }

    @NotNull
    public final List<Interest> getInterests() {
        return this.interests;
    }
}
