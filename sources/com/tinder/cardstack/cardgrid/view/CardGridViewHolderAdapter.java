package com.tinder.cardstack.cardgrid.view;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import com.tinder.cardstack.view.C10507a;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0006\u0010\u0019\u001a\u00020\fJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\nH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/CardGridViewHolderAdapter;", "Lcom/tinder/cardstack/view/CardViewAdapter;", "()V", "loadingStatusViewHolderFactory", "Lcom/tinder/cardstack/cardgrid/view/LoadingStatusViewHolderFactory;", "getLoadingStatusViewHolderFactory", "()Lcom/tinder/cardstack/cardgrid/view/LoadingStatusViewHolderFactory;", "setLoadingStatusViewHolderFactory", "(Lcom/tinder/cardstack/cardgrid/view/LoadingStatusViewHolderFactory;)V", "state", "Lcom/tinder/cardstack/cardgrid/view/CardGridViewHolderAdapter$State;", "appendLoadingStatus", "", "findLoadingStatusPosition", "", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeLoadingStatus", "shouldShowLoadingStatus", "", "updateState", "newState", "State", "cardstack_release"}, k = 1, mv = {1, 1, 9})
public class CardGridViewHolderAdapter extends C10507a {
    @Nullable
    /* renamed from: a */
    private LoadingStatusViewHolderFactory f40781a;
    /* renamed from: b */
    private State f40782b = State.NO_MORE_REC;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/CardGridViewHolderAdapter$State;", "", "(Ljava/lang/String;I)V", "HAS_MORE_REC", "NO_MORE_REC", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    private enum State {
    }

    /* renamed from: a */
    public final void m49903a(@Nullable LoadingStatusViewHolderFactory loadingStatusViewHolderFactory) {
        this.f40781a = loadingStatusViewHolderFactory;
    }

    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        LoadingStatusViewHolderFactory loadingStatusViewHolderFactory = this.f40781a;
        if (loadingStatusViewHolderFactory != null) {
            int viewType = loadingStatusViewHolderFactory.getViewType();
            if (i == viewType) {
                return loadingStatusViewHolderFactory.createViewHolder(viewGroup, viewType);
            }
            viewGroup = super.onCreateViewHolder(viewGroup, i);
            C2668g.a(viewGroup, "super.onCreateViewHolder(parent, viewType)");
            return viewGroup;
        }
        throw ((Throwable) new IllegalStateException("Loading Status Factory is not set"));
    }

    public int getItemCount() {
        int itemCount = super.getItemCount();
        return !m49901g() ? itemCount : itemCount + 1;
    }

    public int getItemViewType(int i) {
        LoadingStatusViewHolderFactory loadingStatusViewHolderFactory = this.f40781a;
        if (loadingStatusViewHolderFactory == null) {
            throw ((Throwable) new IllegalStateException("Loading Status Factory is not set"));
        } else if (i == m49905c()) {
            return loadingStatusViewHolderFactory.getViewType();
        } else {
            return super.getItemViewType(i);
        }
    }

    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        C2668g.b(viewHolder, "holder");
        if (i != m49905c()) {
            super.onBindViewHolder(viewHolder, i);
        }
    }

    /* renamed from: a */
    public final void m49902a() {
        m49900a(State.HAS_MORE_REC);
    }

    /* renamed from: b */
    public final void m49904b() {
        m49900a(State.NO_MORE_REC);
    }

    /* renamed from: c */
    public final int m49905c() {
        return !m49901g() ? -1 : super.getItemCount();
    }

    /* renamed from: a */
    private final void m49900a(State state) {
        if (!C2668g.a(this.f40782b, state)) {
            State state2 = this.f40782b;
            int c = m49905c();
            this.f40782b = state;
            state = C15811g.a(state2, this.f40782b);
            if (C2668g.a(state, C15811g.a(State.NO_MORE_REC, State.HAS_MORE_REC))) {
                notifyItemInserted(m49905c());
            } else if (C2668g.a(state, C15811g.a(State.HAS_MORE_REC, State.NO_MORE_REC)) != null) {
                notifyItemRemoved(c);
            }
        }
    }

    /* renamed from: g */
    private final boolean m49901g() {
        return C2668g.a(this.f40782b, State.HAS_MORE_REC);
    }
}
