package com.tinder.chat.view.provider;

import com.tinder.api.ManagerWebServices;
import com.tinder.chat.view.model.C10640k;
import com.tinder.chat.view.model.C8502w;
import com.tinder.chat.view.model.C8503z;
import com.tinder.chat.view.model.ChatContext;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.model.an;
import com.tinder.domain.message.DeliveryStatus;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ:\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\u001a\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0002J\u0014\u0010\u001c\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u0014\u0010\u001e\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/chat/view/provider/ChatItemsBuilder;", "", "messageViewModelMapper", "Lcom/tinder/chat/view/model/MessageViewModelMapper;", "positionInfoResolver", "Lcom/tinder/chat/view/provider/ChatItemPositionInfoResolver;", "typingIndicatorVisibilityResolver", "Lcom/tinder/chat/view/provider/TypingIndicatorVisibilityResolver;", "(Lcom/tinder/chat/view/model/MessageViewModelMapper;Lcom/tinder/chat/view/provider/ChatItemPositionInfoResolver;Lcom/tinder/chat/view/provider/TypingIndicatorVisibilityResolver;)V", "previousMessagesSnapshot", "", "Lcom/tinder/domain/message/Message;", "build", "Lcom/tinder/chat/view/model/ChatItem;", "messages", "currentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "chatContext", "Lcom/tinder/chat/view/model/ChatContext;", "matchId", "", "typingIndicatorViewModel", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;", "isWithinCollapseThreshold", "", "current", "older", "shouldCollapseWithOlder", "isInbound", "currentUserId", "isOutbound", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.provider.r */
public final class C8516r {
    /* renamed from: a */
    public static final C8515a f30260a = new C8515a();
    /* renamed from: b */
    private List<? extends Message> f30261b = C19301m.a();
    /* renamed from: c */
    private final C8502w f30262c;
    /* renamed from: d */
    private final C8509n f30263d;
    /* renamed from: e */
    private final ab f30264e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/chat/view/provider/ChatItemsBuilder$Companion;", "", "()V", "COLLAPSE_THRESHOLD_MS", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.r$a */
    public static final class C8515a {
        private C8515a() {
        }
    }

    @Inject
    public C8516r(@NotNull C8502w c8502w, @NotNull C8509n c8509n, @NotNull ab abVar) {
        C2668g.b(c8502w, "messageViewModelMapper");
        C2668g.b(c8509n, "positionInfoResolver");
        C2668g.b(abVar, "typingIndicatorVisibilityResolver");
        this.f30262c = c8502w;
        this.f30263d = c8509n;
        this.f30264e = abVar;
    }

    @NotNull
    /* renamed from: a */
    public final List<ChatItem> m36473a(@NotNull List<? extends Message> list, @NotNull CurrentUser currentUser, @NotNull ChatContext chatContext, @NotNull String str, @NotNull TypingIndicatorViewModel typingIndicatorViewModel) {
        List<? extends Message> list2 = list;
        ChatContext chatContext2 = chatContext;
        C2668g.b(list2, ManagerWebServices.PARAM_MESSAGES);
        CurrentUser currentUser2 = currentUser;
        C2668g.b(currentUser2, "currentUser");
        C2668g.b(chatContext2, "chatContext");
        String str2 = str;
        C2668g.b(str2, "matchId");
        TypingIndicatorViewModel typingIndicatorViewModel2 = typingIndicatorViewModel;
        C2668g.b(typingIndicatorViewModel2, "typingIndicatorViewModel");
        List<ChatItem> c = C19301m.c(new ChatItem[]{C10640k.f34909a});
        ab abVar = this.f30264e;
        List list3 = this.f30261b;
        String id = currentUser.id();
        C2668g.a(id, "currentUser.id()");
        boolean a = abVar.m36447a(list3, list2, typingIndicatorViewModel2, id, str2);
        this.f30261b = list2;
        if (a) {
            c.add(an.f34894a);
        }
        Message message = (Message) null;
        List a2 = C19301m.a();
        Message message2 = message;
        List list4 = a2;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Message message3 : list2) {
            List<ChatItem> list5;
            int i4 = i3 + 1;
            Message message4 = (Message) C19301m.c(list2, i4);
            if (r0.m36469a(message3, message4)) {
                list4 = C19301m.a(list4, message3);
                list5 = c;
            } else {
                boolean z;
                boolean z2;
                C8503z a3;
                int i5 = i ^ 1;
                String id2 = currentUser.id();
                int i6 = i;
                C2668g.a(id2, "currentUser.id()");
                if ((r0.m36470a(message3, id2) & i5) != 0) {
                    i = 1;
                } else {
                    i = i2 ^ 1;
                    String id3 = currentUser.id();
                    C2668g.a(id3, "currentUser.id()");
                    if ((i & r0.m36472b(message3, id3)) != 0) {
                        i = i6;
                        i2 = 1;
                    } else {
                        i = i6;
                        z = false;
                        z2 = a && i3 == 0;
                        a3 = r0.f30263d.m36456a(i3, message4, message3, message2, z, z2);
                        list5 = c;
                        list5.add(r0.f30262c.m36428a(message3, list4, currentUser2, a3, chatContext.getMatchPersonPhotos(), chatContext2.userName(message3.getFromId()), str));
                        message2 = message3;
                        list4 = C19301m.a();
                    }
                }
                z = true;
                if (!a) {
                }
                a3 = r0.f30263d.m36456a(i3, message4, message3, message2, z, z2);
                list5 = c;
                list5.add(r0.f30262c.m36428a(message3, list4, currentUser2, a3, chatContext.getMatchPersonPhotos(), chatContext2.userName(message3.getFromId()), str));
                message2 = message3;
                list4 = C19301m.a();
            }
            currentUser2 = currentUser;
            str2 = str;
            c = list5;
            i3 = i4;
            C8516r c8516r = this;
        }
        return c;
    }

    /* renamed from: a */
    private final boolean m36469a(Message message, Message message2) {
        boolean z = false;
        if (message2 == null) {
            return false;
        }
        if ((message instanceof ReactionMessage) && (message2 instanceof ReactionMessage) && message.getDeliveryStatus() != DeliveryStatus.FAILED && message2.getDeliveryStatus() != DeliveryStatus.FAILED && C2668g.a(message.getFromId(), message2.getFromId()) && C2668g.a(((ReactionMessage) message).getReaction(), ((ReactionMessage) message2).getReaction()) && m36471b(message, message2) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private final boolean m36471b(Message message, Message message2) {
        return message.getSentDate().getMillis() - message2.getSentDate().getMillis() <= 15000 ? true : null;
    }

    /* renamed from: a */
    private final boolean m36470a(@NotNull Message message, String str) {
        return C2668g.a(message.getFromId(), str) ^ 1;
    }

    /* renamed from: b */
    private final boolean m36472b(@NotNull Message message, String str) {
        return C2668g.a(message.getFromId(), str);
    }
}
