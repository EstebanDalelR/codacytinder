package com.tinder.feed.view.media;

import com.tinder.chat.view.model.C10637d;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/feed/view/media/FeedLoopViewModel;", "", "feedItemId", "", "loop", "Lcom/tinder/chat/view/model/ActivityFeedLoopViewModel;", "(Ljava/lang/String;Lcom/tinder/chat/view/model/ActivityFeedLoopViewModel;)V", "getFeedItemId", "()Ljava/lang/String;", "getLoop", "()Lcom/tinder/chat/view/model/ActivityFeedLoopViewModel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.media.d */
public final class C9510d {
    @NotNull
    /* renamed from: a */
    private final String f31863a;
    @NotNull
    /* renamed from: b */
    private final C10637d f31864b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9510d) {
                C9510d c9510d = (C9510d) obj;
                if (C2668g.a(this.f31863a, c9510d.f31863a) && C2668g.a(this.f31864b, c9510d.f31864b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f31863a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C10637d c10637d = this.f31864b;
        if (c10637d != null) {
            i = c10637d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedLoopViewModel(feedItemId=");
        stringBuilder.append(this.f31863a);
        stringBuilder.append(", loop=");
        stringBuilder.append(this.f31864b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9510d(@NotNull String str, @NotNull C10637d c10637d) {
        C2668g.b(str, "feedItemId");
        C2668g.b(c10637d, "loop");
        this.f31863a = str;
        this.f31864b = c10637d;
    }

    @NotNull
    /* renamed from: a */
    public final C10637d m39770a() {
        return this.f31864b;
    }
}
