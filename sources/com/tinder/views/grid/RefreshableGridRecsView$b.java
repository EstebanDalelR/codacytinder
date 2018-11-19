package com.tinder.views.grid;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.ads.AdError;
import com.tinder.R;
import com.tinder.cardstack.cardgrid.view.LoadingStatusViewHolderFactory;
import com.tinder.utils.ao;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/tinder/views/grid/RefreshableGridRecsView$GridLoadingStatusViewHolderFactory;", "Lcom/tinder/cardstack/cardgrid/view/LoadingStatusViewHolderFactory;", "(Lcom/tinder/views/grid/RefreshableGridRecsView;)V", "createViewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getViewType", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RefreshableGridRecsView$b implements LoadingStatusViewHolderFactory {
    /* renamed from: a */
    final /* synthetic */ RefreshableGridRecsView f52915a;

    public int getViewType() {
        return AdError.NO_FILL_ERROR_CODE;
    }

    public RefreshableGridRecsView$b(RefreshableGridRecsView refreshableGridRecsView) {
        this.f52915a = refreshableGridRecsView;
    }

    @NotNull
    public ViewHolder createViewHolder(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        if (i == AdError.NO_FILL_ERROR_CODE) {
            return (ViewHolder) new ao(LayoutInflater.from(this.f52915a.getContext()).inflate(R.layout.view_fast_match_grid_load_more_recs, viewGroup, false));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported view type: ");
        stringBuilder.append(i);
        throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
    }
}
