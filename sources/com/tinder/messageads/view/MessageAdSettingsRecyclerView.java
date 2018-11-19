package com.tinder.messageads.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.tinder.messageads.C9905b.C9901b;
import com.tinder.messageads.model.C9912b.C9911a;
import com.tinder.messageads.view.MessageAdSettingsRowItemView.OnCheckedListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0014\u0010\f\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/messageads/view/MessageAdSettingsRecyclerView;", "Landroid/support/v7/widget/RecyclerView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "itemCheckChangeListener", "Lcom/tinder/messageads/view/MessageAdSettingsRowItemView$OnCheckedListener;", "setItemCheckChangeListener", "", "onCheckedListener", "setTypeOptInSettings", "typeOptInSettings", "", "Lcom/tinder/messageads/model/MessageAdMatchSettings$TypeOptInSetting;", "MessageAdSettingsRecyclerViewAdapter", "MessageAdSettingsRecyclerViewHolder", "MessageAdSettingsRecyclerViewLayoutManager", "message-ads_release"}, k = 1, mv = {1, 1, 10})
public final class MessageAdSettingsRecyclerView extends RecyclerView {
    /* renamed from: a */
    private OnCheckedListener f44608a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/messageads/view/MessageAdSettingsRecyclerView$MessageAdSettingsRecyclerViewAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tinder/messageads/view/MessageAdSettingsRecyclerView$MessageAdSettingsRecyclerViewHolder;", "(Lcom/tinder/messageads/view/MessageAdSettingsRecyclerView;)V", "typeOptInSettings", "", "Lcom/tinder/messageads/model/MessageAdMatchSettings$TypeOptInSetting;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "message-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.view.MessageAdSettingsRecyclerView$a */
    public final class C12138a extends Adapter<C12139b> {
        /* renamed from: a */
        final /* synthetic */ MessageAdSettingsRecyclerView f39370a;
        /* renamed from: b */
        private List<C9911a> f39371b = C19301m.a();

        public C12138a(MessageAdSettingsRecyclerView messageAdSettingsRecyclerView) {
            this.f39370a = messageAdSettingsRecyclerView;
        }

        public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            m48283a((C12139b) viewHolder, i);
        }

        public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m48282a(viewGroup, i);
        }

        /* renamed from: a */
        public final void m48284a(@NotNull List<C9911a> list) {
            C2668g.b(list, "typeOptInSettings");
            this.f39371b = C19301m.d(list);
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public void m48283a(@NotNull C12139b c12139b, int i) {
            C2668g.b(c12139b, "holder");
            c12139b = c12139b.itemView;
            if (c12139b == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.messageads.view.MessageAdSettingsRowItemView");
            }
            MessageAdSettingsRowItemView messageAdSettingsRowItemView = (MessageAdSettingsRowItemView) c12139b;
            messageAdSettingsRowItemView.m48286a((C9911a) this.f39371b.get(i));
            messageAdSettingsRowItemView.setOnTypeOptInSettingChangedListener(MessageAdSettingsRecyclerView.m53809a(this.f39370a));
        }

        @NotNull
        /* renamed from: a */
        public C12139b m48282a(@NotNull ViewGroup viewGroup, int i) {
            C2668g.b(viewGroup, "parent");
            return new C12139b(viewGroup);
        }

        public int getItemCount() {
            return this.f39371b.size();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/messageads/view/MessageAdSettingsRecyclerView$MessageAdSettingsRecyclerViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "message-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.view.MessageAdSettingsRecyclerView$b */
    public static final class C12139b extends ViewHolder {
        public C12139b(@NotNull ViewGroup viewGroup) {
            C2668g.b(viewGroup, "parent");
            super(LayoutInflater.from(viewGroup.getContext()).inflate(C9901b.message_ad_settings_row_item_view, viewGroup, false));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/messageads/view/MessageAdSettingsRecyclerView$MessageAdSettingsRecyclerViewLayoutManager;", "Landroid/support/v7/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "message-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.view.MessageAdSettingsRecyclerView$c */
    private static final class C13479c extends LinearLayoutManager {
        public C13479c(@NotNull Context context) {
            C2668g.b(context, "context");
            super(context);
        }
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ OnCheckedListener m53809a(MessageAdSettingsRecyclerView messageAdSettingsRecyclerView) {
        messageAdSettingsRecyclerView = messageAdSettingsRecyclerView.f44608a;
        if (messageAdSettingsRecyclerView == null) {
            C2668g.b("itemCheckChangeListener");
        }
        return messageAdSettingsRecyclerView;
    }

    public MessageAdSettingsRecyclerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attributeSet");
        super(context, attributeSet);
        setLayoutManager((LayoutManager) new C13479c(context));
        setAdapter((Adapter) new C12138a(this));
    }

    public final void setTypeOptInSettings(@NotNull List<C9911a> list) {
        C2668g.b(list, "typeOptInSettings");
        Adapter adapter = getAdapter();
        if (adapter == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.messageads.view.MessageAdSettingsRecyclerView.MessageAdSettingsRecyclerViewAdapter");
        }
        ((C12138a) adapter).m48284a(list);
    }

    public final void setItemCheckChangeListener(@NotNull OnCheckedListener onCheckedListener) {
        C2668g.b(onCheckedListener, "onCheckedListener");
        this.f44608a = onCheckedListener;
    }
}
