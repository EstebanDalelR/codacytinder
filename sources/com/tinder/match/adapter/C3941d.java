package com.tinder.match.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.util.C0559j;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.DiffUtil.DiffResult;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.common.p077b.C2641a;
import com.tinder.fastmatch.view.FastMatchPreviewRowView;
import com.tinder.match.p293e.C12054f;
import com.tinder.match.viewmodel.NewMatchListItem;
import com.tinder.match.views.NewMatchRowView;
import com.tinder.utils.RxUtils;
import com.tinder.utils.ao;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnegative;
import rx.Single;
import rx.Subscription;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.match.adapter.d */
public class C3941d extends Adapter<ViewHolder> {
    /* renamed from: a */
    private final List<NewMatchListItem> f12415a = new ArrayList();
    @Nullable
    /* renamed from: b */
    private Subscription f12416b;

    /* renamed from: a */
    final /* synthetic */ void m15018a(C0559j c0559j) {
        m15015b(c0559j);
    }

    /* renamed from: a */
    public void m15019a(List<NewMatchListItem> list) {
        RxUtils.m10188b(this.f12416b);
        this.f12416b = m15016c(list).b(Schedulers.computation()).a(C19397a.a()).a(new C14055e(this), C14056f.f44567a);
    }

    /* renamed from: a */
    public void m15017a(@Nonnegative int i, NewMatchListItem newMatchListItem) {
        this.f12415a.add(i, newMatchListItem);
        notifyItemChanged(i);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        switch (i) {
            case 1:
                return new d$b(LayoutInflater.from(context).inflate(R.layout.new_matches_space_view, viewGroup, false));
            case 2:
                return new ao(new FastMatchPreviewRowView(context));
            case 3:
                return new d$a(new NewMatchRowView(context));
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("View type ");
                stringBuilder.append(i);
                stringBuilder.append(" is not supported in NewMatchesAdapter");
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        switch (itemViewType) {
            case 1:
            case 2:
                return;
            case 3:
                i = ((NewMatchListItem) this.f12415a.get(i)).a();
                NewMatchRowView newMatchRowView = (NewMatchRowView) viewHolder.itemView;
                newMatchRowView.getClass();
                i.a(C12034g.a(newMatchRowView));
                return;
            default:
                i = new StringBuilder();
                i.append("View type ");
                i.append(itemViewType);
                i.append(" is not supported in NewMatchesAdapter");
                throw new IllegalStateException(i.toString());
        }
    }

    public int getItemCount() {
        return this.f12415a.size();
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        RxUtils.m10188b(this.f12416b);
    }

    public int getItemViewType(int i) {
        i = ((NewMatchListItem) this.f12415a.get(i)).b();
        switch (d$1.f32610a[i.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported view type in NewMatchesAdapter: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    private Single<C0559j<DiffResult, List<NewMatchListItem>>> m15016c(List<NewMatchListItem> list) {
        return Single.a(new C9841h(this, list));
    }

    /* renamed from: b */
    final /* synthetic */ C0559j m15020b(List list) throws Exception {
        return C0559j.m2058a(DiffUtil.calculateDiff(new C12054f(this.f12415a, list)), C2641a.m9990a(list));
    }

    /* renamed from: b */
    private void m15015b(C0559j<DiffResult, List<NewMatchListItem>> c0559j) {
        DiffResult diffResult = (DiffResult) c0559j.f1724a;
        List list = (List) c0559j.f1725b;
        this.f12415a.clear();
        this.f12415a.addAll(list);
        diffResult.dispatchUpdatesTo((Adapter) this);
    }
}
