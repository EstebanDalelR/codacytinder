package com.tinder.chat.view.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/tinder/chat/view/model/ActivityFeedLoopViewModel;", "Lcom/tinder/chat/view/model/PhotoMediaViewModel;", "id", "", "thumbnails", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "videos", "Lcom/tinder/chat/view/model/ActivityFeedVideoViewModel;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getThumbnails", "()Ljava/util/List;", "getVideos", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.d */
public final class C10637d implements PhotoMediaViewModel {
    @NotNull
    /* renamed from: a */
    private final String f34900a;
    @NotNull
    /* renamed from: b */
    private final List<C10636b> f34901b;
    @NotNull
    /* renamed from: c */
    private final List<C10639h> f34902c;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10637d) {
                C10637d c10637d = (C10637d) obj;
                if (C2668g.a(getId(), c10637d.getId()) && C2668g.a(this.f34901b, c10637d.f34901b) && C2668g.a(this.f34902c, c10637d.f34902c)) {
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
        List list = this.f34901b;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.f34902c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedLoopViewModel(id=");
        stringBuilder.append(getId());
        stringBuilder.append(", thumbnails=");
        stringBuilder.append(this.f34901b);
        stringBuilder.append(", videos=");
        stringBuilder.append(this.f34902c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10637d(@NotNull String str, @NotNull List<C10636b> list, @NotNull List<C10639h> list2) {
        C2668g.b(str, "id");
        C2668g.b(list, "thumbnails");
        C2668g.b(list2, "videos");
        this.f34900a = str;
        this.f34901b = list;
        this.f34902c = list2;
    }

    @NotNull
    public String getId() {
        return this.f34900a;
    }

    @NotNull
    /* renamed from: a */
    public final List<C10636b> m42940a() {
        return this.f34901b;
    }

    @NotNull
    /* renamed from: b */
    public final List<C10639h> m42941b() {
        return this.f34902c;
    }
}
