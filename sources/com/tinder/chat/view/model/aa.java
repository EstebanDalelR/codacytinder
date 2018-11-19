package com.tinder.chat.view.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/tinder/chat/view/model/ProfileAddLoopViewModel;", "Lcom/tinder/chat/view/model/ActivityEventViewModel;", "userNumber", "", "timestamp", "loops", "", "Lcom/tinder/chat/view/model/ActivityFeedLoopViewModel;", "(JJLjava/util/List;)V", "hasPlayableMedia", "", "getHasPlayableMedia", "()Z", "getLoops", "()Ljava/util/List;", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class aa extends C8492a {
    /* renamed from: a */
    private final boolean f34860a = true;
    /* renamed from: b */
    private final long f34861b;
    /* renamed from: c */
    private final long f34862c;
    @NotNull
    /* renamed from: d */
    private final List<C10637d> f34863d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aa) {
            aa aaVar = (aa) obj;
            if ((this.f34861b == aaVar.f34861b ? 1 : null) != null) {
                return ((this.f34862c > aaVar.f34862c ? 1 : (this.f34862c == aaVar.f34862c ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f34863d, aaVar.f34863d);
            }
        }
    }

    public int hashCode() {
        long j = this.f34861b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f34862c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List list = this.f34863d;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileAddLoopViewModel(userNumber=");
        stringBuilder.append(this.f34861b);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f34862c);
        stringBuilder.append(", loops=");
        stringBuilder.append(this.f34863d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final long m42911b() {
        return this.f34862c;
    }

    @NotNull
    /* renamed from: c */
    public final List<C10637d> m42912c() {
        return this.f34863d;
    }

    public aa(long j, long j2, @NotNull List<C10637d> list) {
        C2668g.b(list, "loops");
        super();
        this.f34861b = j;
        this.f34862c = j2;
        this.f34863d = list;
        if ((1 ^ this.f34863d.isEmpty()) == null) {
            throw new IllegalArgumentException("Cannot create a ProfileAddLoopViewModel with empty loops".toString());
        }
    }

    /* renamed from: a */
    public boolean mo9413a() {
        return this.f34860a;
    }
}
