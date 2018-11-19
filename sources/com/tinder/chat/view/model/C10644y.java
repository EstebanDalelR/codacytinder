package com.tinder.chat.view.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/tinder/chat/view/model/NewMatchViewModel;", "Lcom/tinder/chat/view/model/ActivityEventViewModel;", "userNumber", "", "otherUserNumber", "timestamp", "matchPhoto", "Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;", "(JJJLcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;)V", "hasPlayableMedia", "", "getHasPlayableMedia", "()Z", "getMatchPhoto", "()Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;", "getOtherUserNumber", "()J", "getTimestamp", "getUserNumber", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.y */
public final class C10644y extends C8492a {
    /* renamed from: a */
    private final boolean f34930a;
    /* renamed from: b */
    private final long f34931b;
    /* renamed from: c */
    private final long f34932c;
    /* renamed from: d */
    private final long f34933d;
    @NotNull
    /* renamed from: e */
    private final C10638f f34934e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10644y) {
            C10644y c10644y = (C10644y) obj;
            if ((this.f34931b == c10644y.f34931b ? 1 : null) != null) {
                if ((this.f34932c == c10644y.f34932c ? 1 : null) != null) {
                    return ((this.f34933d > c10644y.f34933d ? 1 : (this.f34933d == c10644y.f34933d ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f34934e, c10644y.f34934e);
                }
            }
        }
    }

    public int hashCode() {
        long j = this.f34931b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f34932c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f34933d;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C10638f c10638f = this.f34934e;
        return i + (c10638f != null ? c10638f.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NewMatchViewModel(userNumber=");
        stringBuilder.append(this.f34931b);
        stringBuilder.append(", otherUserNumber=");
        stringBuilder.append(this.f34932c);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f34933d);
        stringBuilder.append(", matchPhoto=");
        stringBuilder.append(this.f34934e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final long m42958b() {
        return this.f34933d;
    }

    @NotNull
    /* renamed from: c */
    public final C10638f m42959c() {
        return this.f34934e;
    }

    public C10644y(long j, long j2, long j3, @NotNull C10638f c10638f) {
        C2668g.b(c10638f, "matchPhoto");
        super();
        this.f34931b = j;
        this.f34932c = j2;
        this.f34933d = j3;
        this.f34934e = c10638f;
    }

    /* renamed from: a */
    public boolean mo9413a() {
        return this.f34930a;
    }
}
