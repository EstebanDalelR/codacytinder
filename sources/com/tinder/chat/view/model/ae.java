package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lcom/tinder/chat/view/model/ProfileChangeWorkViewModel;", "Lcom/tinder/chat/view/model/ActivityEventViewModel;", "userNumber", "", "timestamp", "jobs", "", "Lcom/tinder/chat/view/model/ActivityFeedJobViewModel;", "matchPhoto", "Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;", "(JJLjava/util/List;Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;)V", "hasPlayableMedia", "", "getHasPlayableMedia", "()Z", "getJobs", "()Ljava/util/List;", "getMatchPhoto", "()Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ae extends C8492a {
    /* renamed from: a */
    private final boolean f34879a;
    /* renamed from: b */
    private final long f34880b;
    /* renamed from: c */
    private final long f34881c;
    @NotNull
    /* renamed from: d */
    private final List<C8493c> f34882d;
    @NotNull
    /* renamed from: e */
    private final C10638f f34883e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ae) {
            ae aeVar = (ae) obj;
            if ((this.f34880b == aeVar.f34880b ? 1 : null) != null) {
                return ((this.f34881c > aeVar.f34881c ? 1 : (this.f34881c == aeVar.f34881c ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f34882d, aeVar.f34882d) && C2668g.a(this.f34883e, aeVar.f34883e);
            }
        }
    }

    public int hashCode() {
        long j = this.f34880b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f34881c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List list = this.f34882d;
        int i2 = 0;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        C10638f c10638f = this.f34883e;
        if (c10638f != null) {
            i2 = c10638f.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileChangeWorkViewModel(userNumber=");
        stringBuilder.append(this.f34880b);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f34881c);
        stringBuilder.append(", jobs=");
        stringBuilder.append(this.f34882d);
        stringBuilder.append(", matchPhoto=");
        stringBuilder.append(this.f34883e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final long m42925b() {
        return this.f34881c;
    }

    @NotNull
    /* renamed from: c */
    public final List<C8493c> m42926c() {
        return this.f34882d;
    }

    @NotNull
    /* renamed from: d */
    public final C10638f m42927d() {
        return this.f34883e;
    }

    public ae(long j, long j2, @NotNull List<C8493c> list, @NotNull C10638f c10638f) {
        C2668g.b(list, ManagerWebServices.PARAM_JOBS);
        C2668g.b(c10638f, "matchPhoto");
        super();
        this.f34880b = j;
        this.f34881c = j2;
        this.f34882d = list;
        this.f34883e = c10638f;
    }

    /* renamed from: a */
    public boolean mo9413a() {
        return this.f34879a;
    }
}
