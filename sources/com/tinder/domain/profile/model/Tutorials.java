package com.tinder.domain.profile.model;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/profile/model/Tutorials;", "", "tutorials", "", "Lcom/tinder/domain/profile/model/Tutorial;", "(Ljava/util/List;)V", "getTutorials", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Tutorials {
    @NotNull
    private final List<Tutorial> tutorials;

    public Tutorials() {
        this(null, 1, null);
    }

    @NotNull
    public static /* synthetic */ Tutorials copy$default(Tutorials tutorials, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tutorials.tutorials;
        }
        return tutorials.copy(list);
    }

    @NotNull
    public final List<Tutorial> component1() {
        return this.tutorials;
    }

    @NotNull
    public final Tutorials copy(@NotNull List<? extends Tutorial> list) {
        C2668g.b(list, ManagerWebServices.PARAM_TUTORIALS);
        return new Tutorials(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Tutorials) {
                if (C2668g.a(this.tutorials, ((Tutorials) obj).tutorials)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.tutorials;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tutorials(tutorials=");
        stringBuilder.append(this.tutorials);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Tutorials(@NotNull List<? extends Tutorial> list) {
        C2668g.b(list, ManagerWebServices.PARAM_TUTORIALS);
        this.tutorials = list;
    }

    public /* synthetic */ Tutorials(List list, int i, C15823e c15823e) {
        if ((i & 1) != 0) {
            list = C19301m.a();
        }
        this(list);
    }

    @NotNull
    public final List<Tutorial> getTutorials() {
        return this.tutorials;
    }
}
