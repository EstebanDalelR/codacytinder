package com.tinder.chat.view.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0014\u0010\n\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006!"}, d2 = {"Lcom/tinder/chat/view/model/SpotifyNewAnthemViewModel;", "Lcom/tinder/chat/view/model/ActivityEventViewModel;", "userNumber", "", "timestamp", "song", "Lcom/tinder/chat/view/model/SpotifySongViewModel;", "matchPhoto", "Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;", "(JJLcom/tinder/chat/view/model/SpotifySongViewModel;Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;)V", "hasPlayableMedia", "", "getHasPlayableMedia", "()Z", "getMatchPhoto", "()Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;", "getSong", "()Lcom/tinder/chat/view/model/SpotifySongViewModel;", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class aj extends C8492a {
    /* renamed from: a */
    private final boolean f34889a = 1;
    /* renamed from: b */
    private final long f34890b;
    /* renamed from: c */
    private final long f34891c;
    @NotNull
    /* renamed from: d */
    private final ak f34892d;
    @NotNull
    /* renamed from: e */
    private final C10638f f34893e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aj) {
            aj ajVar = (aj) obj;
            if ((this.f34890b == ajVar.f34890b ? 1 : null) != null) {
                return ((this.f34891c > ajVar.f34891c ? 1 : (this.f34891c == ajVar.f34891c ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f34892d, ajVar.f34892d) && C2668g.a(this.f34893e, ajVar.f34893e);
            }
        }
    }

    public int hashCode() {
        long j = this.f34890b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f34891c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        ak akVar = this.f34892d;
        int i2 = 0;
        i = (i + (akVar != null ? akVar.hashCode() : 0)) * 31;
        C10638f c10638f = this.f34893e;
        if (c10638f != null) {
            i2 = c10638f.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpotifyNewAnthemViewModel(userNumber=");
        stringBuilder.append(this.f34890b);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f34891c);
        stringBuilder.append(", song=");
        stringBuilder.append(this.f34892d);
        stringBuilder.append(", matchPhoto=");
        stringBuilder.append(this.f34893e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final long m42933b() {
        return this.f34891c;
    }

    @NotNull
    /* renamed from: c */
    public final ak m42934c() {
        return this.f34892d;
    }

    @NotNull
    /* renamed from: d */
    public final C10638f m42935d() {
        return this.f34893e;
    }

    public aj(long j, long j2, @NotNull ak akVar, @NotNull C10638f c10638f) {
        C2668g.b(akVar, "song");
        C2668g.b(c10638f, "matchPhoto");
        super();
        this.f34890b = j;
        this.f34891c = j2;
        this.f34892d = akVar;
        this.f34893e = c10638f;
    }

    /* renamed from: a */
    public boolean mo9413a() {
        return this.f34889a;
    }
}
