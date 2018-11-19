package com.tinder.chat.view.provider;

import android.support.v7.util.DiffUtil;
import android.support.v7.util.DiffUtil.Callback;
import android.support.v7.util.DiffUtil.DiffResult;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.model.MessageViewModel;
import com.tinder.chat.view.model.MessageViewModel.SenderDirection;
import com.tinder.chat.view.model.an;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\n"}, d2 = {"Lcom/tinder/chat/view/provider/ChatItemsDiffCalculator;", "", "()V", "calculateDiff", "Landroid/support/v7/util/DiffUtil$DiffResult;", "oldChatItems", "", "Lcom/tinder/chat/view/model/ChatItem;", "newChatItems", "DiffCallback", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.provider.t */
public final class C8517t {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\f\u0010\u0017\u001a\u00020\u000b*\u00020\u0004H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/tinder/chat/view/provider/ChatItemsDiffCalculator$DiffCallback;", "Landroid/support/v7/util/DiffUtil$Callback;", "oldChatItems", "", "Lcom/tinder/chat/view/model/ChatItem;", "newChatItems", "(Ljava/util/List;Ljava/util/List;)V", "getNewChatItems", "()Ljava/util/List;", "getOldChatItems", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getChangePayload", "", "getNewListSize", "getOldListSize", "typingIndicatorShouldBeReplacedByInboundMessage", "oldItem", "newItem", "isInboundMessage", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.t$a */
    private static final class C10648a extends Callback {
        @NotNull
        /* renamed from: a */
        private final List<ChatItem> f34938a;
        @NotNull
        /* renamed from: b */
        private final List<ChatItem> f34939b;

        public C10648a(@NotNull List<? extends ChatItem> list, @NotNull List<? extends ChatItem> list2) {
            C2668g.b(list, "oldChatItems");
            C2668g.b(list2, "newChatItems");
            this.f34938a = list;
            this.f34939b = list2;
        }

        public int getOldListSize() {
            return this.f34938a.size();
        }

        public int getNewListSize() {
            return this.f34939b.size();
        }

        public boolean areItemsTheSame(int i, int i2) {
            ChatItem chatItem = (ChatItem) this.f34938a.get(i);
            ChatItem chatItem2 = (ChatItem) this.f34939b.get(i2);
            return (C2668g.a(chatItem.getClass(), chatItem2.getClass()) && (chatItem.getId() == chatItem2.getId() || chatItem2.hasCollapsedId(chatItem.getId()))) || m42961a(chatItem, chatItem2) != 0;
        }

        public boolean areContentsTheSame(int i, int i2) {
            ChatItem chatItem = (ChatItem) this.f34938a.get(i);
            ChatItem chatItem2 = (ChatItem) this.f34939b.get(i2);
            int i3 = 0;
            if (m42961a(chatItem, chatItem2)) {
                return false;
            }
            if (!(chatItem2 instanceof MessageViewModel)) {
                return true;
            }
            if (chatItem == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.view.model.MessageViewModel<*>");
            }
            MessageViewModel messageViewModel = (MessageViewModel) chatItem;
            MessageViewModel messageViewModel2 = (MessageViewModel) chatItem2;
            int a = ((messageViewModel.m42903j() == messageViewModel2.m42903j() ? 1 : 0) & C2668g.a(messageViewModel.m42907n(), messageViewModel2.m42907n())) & (messageViewModel.m42905l() == messageViewModel2.m42905l() ? 1 : 0);
            if (messageViewModel.m42906m() == messageViewModel2.m42906m()) {
                i3 = 1;
            }
            return C2668g.a(messageViewModel.m42897d(), messageViewModel2.m42897d()) & (a & i3);
        }

        @Nullable
        public Object getChangePayload(int i, int i2) {
            ChatItem chatItem = (ChatItem) this.f34938a.get(i);
            ChatItem chatItem2 = (ChatItem) this.f34939b.get(i2);
            if (m42961a(chatItem, chatItem2)) {
                return "TYPING_INDICATOR";
            }
            if ((chatItem2 instanceof MessageViewModel) && (chatItem instanceof MessageViewModel)) {
                MessageViewModel messageViewModel = (MessageViewModel) chatItem;
                if (messageViewModel.m42903j() && !((MessageViewModel) chatItem2).m42903j()) {
                    return "UNLIKE";
                }
                if (!messageViewModel.m42903j() && ((MessageViewModel) chatItem2).m42903j()) {
                    return "LIKE";
                }
            }
            return super.getChangePayload(i, i2);
        }

        /* renamed from: a */
        private final boolean m42961a(ChatItem chatItem, ChatItem chatItem2) {
            return (C2668g.a(chatItem, an.f34894a) == null || m42960a(chatItem2) == null) ? null : true;
        }

        /* renamed from: a */
        private final boolean m42960a(@NotNull ChatItem chatItem) {
            return ((chatItem instanceof MessageViewModel) && ((MessageViewModel) chatItem).m42902i() == SenderDirection.INBOUND) ? true : null;
        }
    }

    @NotNull
    /* renamed from: a */
    public final DiffResult m36474a(@NotNull List<? extends ChatItem> list, @NotNull List<? extends ChatItem> list2) {
        C2668g.b(list, "oldChatItems");
        C2668g.b(list2, "newChatItems");
        list = DiffUtil.calculateDiff(new C10648a(list, list2), null);
        C2668g.a(list, "DiffUtil.calculateDiff(diffCallback, false)");
        return list;
    }
}
