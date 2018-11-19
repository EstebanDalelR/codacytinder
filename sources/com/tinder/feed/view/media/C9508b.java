package com.tinder.feed.view.media;

import com.tinder.api.ManagerWebServices;
import com.tinder.chat.view.model.C10636b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/tinder/feed/view/media/FeedChangeSchoolViewModel;", "", "feedItemId", "", "schoolText", "image", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFeedItemId", "()Ljava/lang/String;", "getImage", "()Ljava/util/List;", "getSchoolText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.media.b */
public final class C9508b {
    @NotNull
    /* renamed from: a */
    private final String f31857a;
    @NotNull
    /* renamed from: b */
    private final String f31858b;
    @NotNull
    /* renamed from: c */
    private final List<C10636b> f31859c;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9508b) {
                C9508b c9508b = (C9508b) obj;
                if (C2668g.a(this.f31857a, c9508b.f31857a) && C2668g.a(this.f31858b, c9508b.f31858b) && C2668g.a(this.f31859c, c9508b.f31859c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f31857a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31858b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.f31859c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedChangeSchoolViewModel(feedItemId=");
        stringBuilder.append(this.f31857a);
        stringBuilder.append(", schoolText=");
        stringBuilder.append(this.f31858b);
        stringBuilder.append(", image=");
        stringBuilder.append(this.f31859c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9508b(@NotNull String str, @NotNull String str2, @NotNull List<C10636b> list) {
        C2668g.b(str, "feedItemId");
        C2668g.b(str2, "schoolText");
        C2668g.b(list, ManagerWebServices.IG_PARAM_IMAGE);
        this.f31857a = str;
        this.f31858b = str2;
        this.f31859c = list;
    }

    @NotNull
    /* renamed from: a */
    public final String m39766a() {
        return this.f31858b;
    }

    @NotNull
    /* renamed from: b */
    public final List<C10636b> m39767b() {
        return this.f31859c;
    }
}
