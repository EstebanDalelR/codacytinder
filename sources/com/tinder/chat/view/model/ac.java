package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eXD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006#"}, d2 = {"Lcom/tinder/chat/view/model/ProfileChangeBioViewModel;", "Lcom/tinder/chat/view/model/ActivityEventViewModel;", "userNumber", "", "timestamp", "bio", "", "oldBio", "matchPhoto", "Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;", "(JJLjava/lang/String;Ljava/lang/String;Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;)V", "getBio", "()Ljava/lang/String;", "hasPlayableMedia", "", "getHasPlayableMedia", "()Z", "getMatchPhoto", "()Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;", "getOldBio", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ac extends C8492a {
    /* renamed from: a */
    private final boolean f34868a;
    /* renamed from: b */
    private final long f34869b;
    /* renamed from: c */
    private final long f34870c;
    @NotNull
    /* renamed from: d */
    private final String f34871d;
    @NotNull
    /* renamed from: e */
    private final String f34872e;
    @NotNull
    /* renamed from: f */
    private final C10638f f34873f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ac) {
            ac acVar = (ac) obj;
            if ((this.f34869b == acVar.f34869b ? 1 : null) != null) {
                return ((this.f34870c > acVar.f34870c ? 1 : (this.f34870c == acVar.f34870c ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f34871d, acVar.f34871d) && C2668g.a(this.f34872e, acVar.f34872e) && C2668g.a(this.f34873f, acVar.f34873f);
            }
        }
    }

    public int hashCode() {
        long j = this.f34869b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f34870c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f34871d;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f34872e;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        C10638f c10638f = this.f34873f;
        if (c10638f != null) {
            i2 = c10638f.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileChangeBioViewModel(userNumber=");
        stringBuilder.append(this.f34869b);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f34870c);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.f34871d);
        stringBuilder.append(", oldBio=");
        stringBuilder.append(this.f34872e);
        stringBuilder.append(", matchPhoto=");
        stringBuilder.append(this.f34873f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final long m42917b() {
        return this.f34870c;
    }

    @NotNull
    /* renamed from: c */
    public final String m42918c() {
        return this.f34871d;
    }

    @NotNull
    /* renamed from: d */
    public final C10638f m42919d() {
        return this.f34873f;
    }

    public ac(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull C10638f c10638f) {
        C2668g.b(str, ManagerWebServices.PARAM_BIO);
        C2668g.b(str2, "oldBio");
        C2668g.b(c10638f, "matchPhoto");
        super();
        this.f34869b = j;
        this.f34870c = j2;
        this.f34871d = str;
        this.f34872e = str2;
        this.f34873f = c10638f;
    }

    /* renamed from: a */
    public boolean mo9413a() {
        return this.f34868a;
    }
}
