package com.tinder.views.grid;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import com.tinder.adapters.C7294i;
import com.tinder.utils.ao;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tinder/views/grid/EmptyGridAdapter;", "Lcom/tinder/adapters/SimpleRecyclerViewAdapter;", "Lcom/tinder/views/grid/EmptyRec;", "Lcom/tinder/utils/SimpleViewHolder;", "()V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.views.grid.a */
public final class C18301a extends C7294i<C15456b, ao> {
    /* renamed from: a */
    public void m66301a(@NotNull ao aoVar, int i) {
        C2668g.b(aoVar, "holder");
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m66301a((ao) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m66300a(viewGroup, i);
    }

    @NotNull
    /* renamed from: a */
    public ao m66300a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        viewGroup = viewGroup.getContext();
        C2668g.a(viewGroup, "parent.context");
        return new ao(new GridEmptyRecCardView(viewGroup, null, 2, null));
    }

    public int getItemCount() {
        return a().size();
    }
}
