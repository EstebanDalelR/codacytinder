package com.tinder.chat.adapter;

import android.support.annotation.UiThread;
import android.support.v7.util.DiffUtil.DiffResult;
import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.p189a.C8452a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u001e\u0010\u0016\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/chat/adapter/ChatItemsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tinder/chat/adapter/ChatItemViewHolder;", "chatItemViewFactory", "Lcom/tinder/chat/view/factory/ChatItemViewFactory;", "(Lcom/tinder/chat/view/factory/ChatItemViewFactory;)V", "chatItems", "", "Lcom/tinder/chat/view/model/ChatItem;", "onInsertedChatItemsListener", "Lcom/tinder/chat/adapter/ChatItemsAdapter$OnInsertedChatItemsListener;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "viewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refresh", "newItems", "", "diffResult", "Landroid/support/v7/util/DiffUtil$DiffResult;", "setOnInsertedChatItemsListener", "listener", "InsertedChatItems", "OnInsertedChatItemsListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ChatItemsAdapter extends Adapter<C10518c> {
    /* renamed from: a */
    private final List<ChatItem> f34197a = ((List) new ArrayList());
    /* renamed from: b */
    private OnInsertedChatItemsListener f34198b = ((OnInsertedChatItemsListener) new C10516b());
    /* renamed from: c */
    private final C8452a f34199c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/chat/adapter/ChatItemsAdapter$OnInsertedChatItemsListener;", "", "onInserted", "", "insertedChatItems", "Lcom/tinder/chat/adapter/ChatItemsAdapter$InsertedChatItems;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface OnInsertedChatItemsListener {
        void onInserted(@NotNull C8408a c8408a);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/chat/adapter/ChatItemsAdapter$InsertedChatItems;", "", "items", "", "Lcom/tinder/chat/view/model/ChatItem;", "position", "", "(Ljava/util/List;I)V", "getItems", "()Ljava/util/List;", "getPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.adapter.ChatItemsAdapter$a */
    public static final class C8408a {
        @NotNull
        /* renamed from: a */
        private final List<ChatItem> f29839a;
        /* renamed from: b */
        private final int f29840b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8408a) {
                C8408a c8408a = (C8408a) obj;
                if (C2668g.a(this.f29839a, c8408a.f29839a)) {
                    if ((this.f29840b == c8408a.f29840b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            List list = this.f29839a;
            return ((list != null ? list.hashCode() : 0) * 31) + this.f29840b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("InsertedChatItems(items=");
            stringBuilder.append(this.f29839a);
            stringBuilder.append(", position=");
            stringBuilder.append(this.f29840b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8408a(@NotNull List<? extends ChatItem> list, int i) {
            C2668g.b(list, "items");
            this.f29839a = list;
            this.f29840b = i;
        }

        @NotNull
        /* renamed from: a */
        public final List<ChatItem> m35883a() {
            return this.f29839a;
        }

        /* renamed from: b */
        public final int m35884b() {
            return this.f29840b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/chat/adapter/ChatItemsAdapter$onInsertedChatItemsListener$1", "Lcom/tinder/chat/adapter/ChatItemsAdapter$OnInsertedChatItemsListener;", "()V", "onInserted", "", "insertedChatItems", "Lcom/tinder/chat/adapter/ChatItemsAdapter$InsertedChatItems;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.adapter.ChatItemsAdapter$b */
    public static final class C10516b implements OnInsertedChatItemsListener {
        public void onInserted(@NotNull C8408a c8408a) {
            C2668g.b(c8408a, "insertedChatItems");
        }

        C10516b() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"com/tinder/chat/adapter/ChatItemsAdapter$refresh$1", "Landroid/support/v7/util/ListUpdateCallback;", "(Lcom/tinder/chat/adapter/ChatItemsAdapter;)V", "onChanged", "", "position", "", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.adapter.ChatItemsAdapter$c */
    public static final class C10517c implements ListUpdateCallback {
        /* renamed from: a */
        final /* synthetic */ ChatItemsAdapter f34196a;

        C10517c(ChatItemsAdapter chatItemsAdapter) {
            this.f34196a = chatItemsAdapter;
        }

        public void onInserted(int i, int i2) {
            this.f34196a.notifyItemRangeInserted(i, i2);
            this.f34196a.f34198b.onInserted(new C8408a(C19301m.a(this.f34196a.f34197a, new C18461c(i, (i2 + i) - 1)), i));
        }

        public void onRemoved(int i, int i2) {
            this.f34196a.notifyItemRangeRemoved(i, i2);
        }

        public void onMoved(int i, int i2) {
            this.f34196a.notifyItemMoved(i, i2);
        }

        public void onChanged(int i, int i2, @Nullable Object obj) {
            this.f34196a.notifyItemRangeChanged(i, i2, obj);
        }
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m42490a((C10518c) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m42488a(viewGroup, i);
    }

    @Inject
    public ChatItemsAdapter(@NotNull C8452a c8452a) {
        C2668g.b(c8452a, "chatItemViewFactory");
        this.f34199c = c8452a;
    }

    public int getItemCount() {
        return this.f34197a.size();
    }

    public int getItemViewType(int i) {
        return this.f34199c.m36180a((ChatItem) this.f34197a.get(i));
    }

    @NotNull
    /* renamed from: a */
    public C10518c m42488a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        return this.f34199c.m36181a(viewGroup, i);
    }

    /* renamed from: a */
    public void m42490a(@NotNull C10518c c10518c, int i) {
        C2668g.b(c10518c, "viewHolder");
        c10518c.m42492a((ChatItem) this.f34197a.get(i));
    }

    @UiThread
    /* renamed from: a */
    public final void m42491a(@NotNull List<? extends ChatItem> list, @NotNull DiffResult diffResult) {
        C2668g.b(list, "newItems");
        C2668g.b(diffResult, "diffResult");
        this.f34197a.clear();
        this.f34197a.addAll(list);
        diffResult.dispatchUpdatesTo((ListUpdateCallback) new C10517c(this));
    }

    /* renamed from: a */
    public final void m42489a(@NotNull OnInsertedChatItemsListener onInsertedChatItemsListener) {
        C2668g.b(onInsertedChatItemsListener, "listener");
        this.f34198b = onInsertedChatItemsListener;
    }
}
