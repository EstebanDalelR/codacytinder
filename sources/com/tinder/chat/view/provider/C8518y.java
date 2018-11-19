package com.tinder.chat.view.provider;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.message.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.ReadableInstant;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J*\u0010\b\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u0004\u0018\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¨\u0006\r"}, d2 = {"Lcom/tinder/chat/view/provider/NewInboundMessageDetector;", "", "()V", "extractNewMessages", "", "Lcom/tinder/domain/message/Message;", "previousMessagesSnapshot", "messages", "hasNewInboundMessage", "", "currentUserId", "", "mostRecentMessage", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.provider.y */
public final class C8518y {
    /* renamed from: a */
    public final boolean m36477a(@NotNull List<? extends Message> list, @NotNull List<? extends Message> list2, @NotNull String str) {
        C2668g.b(list, "previousMessagesSnapshot");
        C2668g.b(list2, ManagerWebServices.PARAM_MESSAGES);
        C2668g.b(str, "currentUserId");
        Iterable<Message> a = m36476a(list, list2);
        if ((a instanceof Collection) != null && ((Collection) a).isEmpty() != null) {
            return false;
        }
        for (Message fromId : a) {
            if ((C2668g.a(fromId.getFromId(), str) ^ 1) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final List<Message> m36476a(List<? extends Message> list, List<? extends Message> list2) {
        list = m36475a(list);
        if (list == null) {
            return list2;
        }
        list = list.getSentDate();
        Iterable iterable = list2;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if ((((Message) next).getSentDate().a((ReadableInstant) list) > 0 ? 1 : null) == null) {
                break;
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    /* renamed from: a */
    private final Message m36475a(@NotNull List<? extends Message> list) {
        return (Message) C19301m.g(list);
    }
}
