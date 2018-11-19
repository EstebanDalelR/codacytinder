package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÂ\u0003JI\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/tinder/chat/view/model/ChatMatchContext;", "Lcom/tinder/chat/view/model/ChatContext;", "userId", "", "avatarUrls", "", "matchPersonPhotos", "Lcom/tinder/domain/common/model/Photo;", "userNameMap", "", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getAvatarUrls", "()Ljava/util/List;", "getMatchPersonPhotos", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "userName", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.l */
public final class C10641l implements ChatContext {
    /* renamed from: a */
    public static final C8497a f34911a = new C8497a();
    /* renamed from: f */
    private static final Render f34912f;
    @NotNull
    /* renamed from: g */
    private static final Photo f34913g;
    @NotNull
    /* renamed from: b */
    private final String f34914b;
    @NotNull
    /* renamed from: c */
    private final List<String> f34915c;
    @NotNull
    /* renamed from: d */
    private final List<Photo> f34916d;
    /* renamed from: e */
    private final Map<String, String> f34917e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/chat/view/model/ChatMatchContext$Companion;", "", "()V", "emptyPhoto", "Lcom/tinder/domain/common/model/Photo;", "getEmptyPhoto", "()Lcom/tinder/domain/common/model/Photo;", "emptyRender", "Lcom/tinder/domain/common/model/Photo$Render;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.model.l$a */
    public static final class C8497a {
        private C8497a() {
        }

        @NotNull
        /* renamed from: a */
        public final Photo m36416a() {
            return C10641l.f34913g;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10641l) {
                C10641l c10641l = (C10641l) obj;
                if (C2668g.a(getUserId(), c10641l.getUserId()) && C2668g.a(getAvatarUrls(), c10641l.getAvatarUrls()) && C2668g.a(getMatchPersonPhotos(), c10641l.getMatchPersonPhotos()) && C2668g.a(this.f34917e, c10641l.f34917e)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String userId = getUserId();
        int i = 0;
        int hashCode = (userId != null ? userId.hashCode() : 0) * 31;
        List avatarUrls = getAvatarUrls();
        hashCode = (hashCode + (avatarUrls != null ? avatarUrls.hashCode() : 0)) * 31;
        avatarUrls = getMatchPersonPhotos();
        hashCode = (hashCode + (avatarUrls != null ? avatarUrls.hashCode() : 0)) * 31;
        Map map = this.f34917e;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChatMatchContext(userId=");
        stringBuilder.append(getUserId());
        stringBuilder.append(", avatarUrls=");
        stringBuilder.append(getAvatarUrls());
        stringBuilder.append(", matchPersonPhotos=");
        stringBuilder.append(getMatchPersonPhotos());
        stringBuilder.append(", userNameMap=");
        stringBuilder.append(this.f34917e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10641l(@NotNull String str, @NotNull List<String> list, @NotNull List<? extends Photo> list2, @NotNull Map<String, String> map) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(list, "avatarUrls");
        C2668g.b(list2, "matchPersonPhotos");
        C2668g.b(map, "userNameMap");
        this.f34914b = str;
        this.f34915c = list;
        this.f34916d = list2;
        this.f34917e = map;
    }

    @NotNull
    public String getUserId() {
        return this.f34914b;
    }

    @NotNull
    public List<String> getAvatarUrls() {
        return this.f34915c;
    }

    @NotNull
    public List<Photo> getMatchPersonPhotos() {
        return this.f34916d;
    }

    @NotNull
    public String userName(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        str = (String) this.f34917e.get(str);
        return str != null ? str : "";
    }

    static {
        Render build = Render.builder().height(0).width(0).url("").build();
        C2668g.a(build, "Photo.Render.builder()\n …\n                .build()");
        f34912f = build;
        Photo build2 = Photo.builder().id("").url("").renders(C19301m.a(f34912f)).videos(C19301m.a()).build();
        C2668g.a(build2, "Photo.builder()\n        …\n                .build()");
        f34913g = build2;
    }
}
