package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010!\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000e¨\u0006'"}, d2 = {"Lcom/tinder/chat/view/model/InstagramNewMediaViewModel;", "Lcom/tinder/chat/view/model/ActivityEventViewModel;", "timestamp", "", "id", "", "userId", "userName", "caption", "media", "", "Lcom/tinder/chat/view/model/InstagramMediaViewModel;", "(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCaption", "()Ljava/lang/String;", "hasPlayableMedia", "", "getHasPlayableMedia", "()Z", "getId", "getMedia", "()Ljava/util/List;", "getTimestamp", "()J", "getUserId", "getUserName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.r */
public final class C10643r extends C8492a {
    /* renamed from: a */
    private final boolean f34923a = true;
    /* renamed from: b */
    private final long f34924b;
    @NotNull
    /* renamed from: c */
    private final String f34925c;
    /* renamed from: d */
    private final long f34926d;
    @NotNull
    /* renamed from: e */
    private final String f34927e;
    @NotNull
    /* renamed from: f */
    private final String f34928f;
    @NotNull
    /* renamed from: g */
    private final List<C8499q> f34929g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10643r) {
            C10643r c10643r = (C10643r) obj;
            if ((this.f34924b == c10643r.f34924b ? 1 : null) != null && C2668g.a(this.f34925c, c10643r.f34925c)) {
                return ((this.f34926d > c10643r.f34926d ? 1 : (this.f34926d == c10643r.f34926d ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f34927e, c10643r.f34927e) && C2668g.a(this.f34928f, c10643r.f34928f) && C2668g.a(this.f34929g, c10643r.f34929g);
            }
        }
    }

    public int hashCode() {
        long j = this.f34924b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f34925c;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.f34926d;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        str = this.f34927e;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f34928f;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f34929g;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstagramNewMediaViewModel(timestamp=");
        stringBuilder.append(this.f34924b);
        stringBuilder.append(", id=");
        stringBuilder.append(this.f34925c);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.f34926d);
        stringBuilder.append(", userName=");
        stringBuilder.append(this.f34927e);
        stringBuilder.append(", caption=");
        stringBuilder.append(this.f34928f);
        stringBuilder.append(", media=");
        stringBuilder.append(this.f34929g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final long m42952b() {
        return this.f34924b;
    }

    @NotNull
    /* renamed from: c */
    public final String m42953c() {
        return this.f34925c;
    }

    @NotNull
    /* renamed from: d */
    public final String m42954d() {
        return this.f34927e;
    }

    @NotNull
    /* renamed from: e */
    public final String m42955e() {
        return this.f34928f;
    }

    @NotNull
    /* renamed from: f */
    public final List<C8499q> m42956f() {
        return this.f34929g;
    }

    public C10643r(long j, @NotNull String str, long j2, @NotNull String str2, @NotNull String str3, @NotNull List<C8499q> list) {
        C2668g.b(str, "id");
        C2668g.b(str2, "userName");
        C2668g.b(str3, "caption");
        C2668g.b(list, ManagerWebServices.PARAM_MEDIA);
        super();
        this.f34924b = j;
        this.f34925c = str;
        this.f34926d = j2;
        this.f34927e = str2;
        this.f34928f = str3;
        this.f34929g = list;
        if ((1 ^ this.f34929g.isEmpty()) == null) {
            throw new IllegalArgumentException("Cannot create an InstagramNewMediaViewModel with empty media".toString());
        }
    }

    /* renamed from: a */
    public boolean mo9413a() {
        return this.f34923a;
    }
}
