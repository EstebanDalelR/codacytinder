package com.tinder.chat.view.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006!"}, d2 = {"Lcom/tinder/chat/view/model/InstagramConnectViewModel;", "Lcom/tinder/chat/view/model/ActivityEventViewModel;", "userNumber", "", "timestamp", "instagramUserName", "", "photos", "", "Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;", "(JJLjava/lang/String;Ljava/util/List;)V", "hasPlayableMedia", "", "getHasPlayableMedia", "()Z", "getInstagramUserName", "()Ljava/lang/String;", "getPhotos", "()Ljava/util/List;", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.p */
public final class C10642p extends C8492a {
    /* renamed from: a */
    private final boolean f34918a;
    /* renamed from: b */
    private final long f34919b;
    /* renamed from: c */
    private final long f34920c;
    @NotNull
    /* renamed from: d */
    private final String f34921d;
    @NotNull
    /* renamed from: e */
    private final List<C10638f> f34922e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10642p) {
            C10642p c10642p = (C10642p) obj;
            if ((this.f34919b == c10642p.f34919b ? 1 : null) != null) {
                return ((this.f34920c > c10642p.f34920c ? 1 : (this.f34920c == c10642p.f34920c ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f34921d, c10642p.f34921d) && C2668g.a(this.f34922e, c10642p.f34922e);
            }
        }
    }

    public int hashCode() {
        long j = this.f34919b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f34920c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f34921d;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f34922e;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstagramConnectViewModel(userNumber=");
        stringBuilder.append(this.f34919b);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f34920c);
        stringBuilder.append(", instagramUserName=");
        stringBuilder.append(this.f34921d);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.f34922e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final long m42949b() {
        return this.f34920c;
    }

    @NotNull
    /* renamed from: c */
    public final List<C10638f> m42950c() {
        return this.f34922e;
    }

    public C10642p(long j, long j2, @NotNull String str, @NotNull List<C10638f> list) {
        C2668g.b(str, "instagramUserName");
        C2668g.b(list, "photos");
        super();
        this.f34919b = j;
        this.f34920c = j2;
        this.f34921d = str;
        this.f34922e = list;
    }

    /* renamed from: a */
    public boolean mo9413a() {
        return this.f34918a;
    }
}
