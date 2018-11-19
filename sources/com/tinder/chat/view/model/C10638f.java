package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;", "Lcom/tinder/chat/view/model/PhotoMediaViewModel;", "id", "", "images", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.f */
public final class C10638f implements PhotoMediaViewModel {
    @NotNull
    /* renamed from: a */
    private final String f34903a;
    @NotNull
    /* renamed from: b */
    private final List<C10636b> f34904b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10638f) {
                C10638f c10638f = (C10638f) obj;
                if (C2668g.a(getId(), c10638f.getId()) && C2668g.a(this.f34904b, c10638f.f34904b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String id = getId();
        int i = 0;
        int hashCode = (id != null ? id.hashCode() : 0) * 31;
        List list = this.f34904b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedPhotoViewModel(id=");
        stringBuilder.append(getId());
        stringBuilder.append(", images=");
        stringBuilder.append(this.f34904b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10638f(@NotNull String str, @NotNull List<C10636b> list) {
        C2668g.b(str, "id");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        this.f34903a = str;
        this.f34904b = list;
    }

    @NotNull
    public String getId() {
        return this.f34903a;
    }

    @NotNull
    /* renamed from: a */
    public final List<C10636b> m42942a() {
        return this.f34904b;
    }
}
