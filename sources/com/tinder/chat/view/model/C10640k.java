package com.tinder.chat.view.model;

import com.tinder.chat.view.model.ChatItem.C8491a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/chat/view/model/AnchorChatItem;", "Lcom/tinder/chat/view/model/ChatItem;", "()V", "id", "", "getId", "()J", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.k */
public final class C10640k implements ChatItem {
    /* renamed from: a */
    public static final C10640k f34909a;
    /* renamed from: b */
    private static final long f34910b;

    static {
        C10640k c10640k = new C10640k();
        f34909a = c10640k;
        f34910b = (long) c10640k.hashCode();
    }

    private C10640k() {
    }

    public boolean hasCollapsedId(long j) {
        return C8491a.m36343a(this, j);
    }

    public long getId() {
        return f34910b;
    }
}
