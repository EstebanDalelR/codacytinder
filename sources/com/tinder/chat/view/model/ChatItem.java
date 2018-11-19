package com.tinder.chat.view.model;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/tinder/chat/view/model/ChatItem;", "", "id", "", "getId", "()J", "hasCollapsedId", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ChatItem {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.model.ChatItem$a */
    public static final class C8491a {
        /* renamed from: a */
        public static boolean m36343a(ChatItem chatItem, long j) {
            return false;
        }
    }

    long getId();

    boolean hasCollapsedId(long j);
}
