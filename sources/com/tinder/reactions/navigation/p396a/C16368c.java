package com.tinder.reactions.navigation.p396a;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tinder.R;
import io.reactivex.C3959e;
import io.reactivex.subjects.C19040a;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\b\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001c\u0010\u0011\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u0016\u0010\u0018\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019H\u0007R2\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/reactions/navigation/adapter/GesturesTabAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tinder/reactions/navigation/adapter/GesturesTabAdapter$GestureItemViewHolder;", "()V", "itemClickSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "tabDrawableResIds", "", "getItemClickedObservable", "Lio/reactivex/Observable;", "getItemCount", "handleClick", "", "view", "Landroid/view/View;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "", "GestureItemViewHolder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.navigation.a.c */
public final class C16368c extends Adapter<C16367a> {
    /* renamed from: a */
    private final C19040a<Integer> f50909a = C19040a.m67694a();
    /* renamed from: b */
    private final Set<Integer> f50910b = new LinkedHashSet();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.a.c$b */
    static final class C14682b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C16368c f46264a;

        C14682b(C16368c c16368c) {
            this.f46264a = c16368c;
        }

        public final void onClick(View view) {
            C16368c c16368c = this.f46264a;
            C2668g.a(view, "view");
            c16368c.m61732a(view);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/reactions/navigation/adapter/GesturesTabAdapter$GestureItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/tinder/reactions/navigation/adapter/GesturesTabAdapter;Landroid/view/View;)V", "gestureIcon", "Landroid/widget/ImageView;", "getGestureIcon", "()Landroid/widget/ImageView;", "setGestureIcon", "(Landroid/widget/ImageView;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.a.c$a */
    public final class C16367a extends ViewHolder {
        /* renamed from: a */
        final /* synthetic */ C16368c f50907a;
        @NotNull
        /* renamed from: b */
        private ImageView f50908b;

        public C16367a(C16368c c16368c, @NotNull View view) {
            C2668g.b(view, "view");
            this.f50907a = c16368c;
            super(view);
            c16368c = view.findViewById(R.id.gestureIcon);
            C2668g.a(c16368c, "view.findViewById(R.id.gestureIcon)");
            this.f50908b = (ImageView) c16368c;
        }

        @NotNull
        /* renamed from: a */
        public final ImageView m61731a() {
            return this.f50908b;
        }
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m61736a((C16367a) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m61734a(viewGroup, i);
    }

    @UiThread
    /* renamed from: a */
    public final void m61737a(@NotNull Set<Integer> set) {
        C2668g.b(set, "tabDrawableResIds");
        this.f50910b.clear();
        if (!set.isEmpty()) {
            this.f50910b.addAll(set);
            notifyDataSetChanged();
        }
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<Integer> m61735a() {
        C3959e<Integer> hide = this.f50909a.hide();
        C2668g.a(hide, "itemClickSubject.hide()");
        return hide;
    }

    @NotNull
    /* renamed from: a */
    public C16367a m61734a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        viewGroup = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gesture_item_icon_view, viewGroup, false);
        C2668g.a(viewGroup, "view");
        return new C16367a(this, viewGroup);
    }

    /* renamed from: a */
    public void m61736a(@NotNull C16367a c16367a, int i) {
        C2668g.b(c16367a, "holder");
        View view = c16367a.itemView;
        C2668g.a(view, "holder.itemView");
        view.setTag(Integer.valueOf(i));
        c16367a.itemView.setOnClickListener(new C14682b(this));
        c16367a.m61731a().setImageResource(((Number) C19299w.m68805b((Iterable) this.f50910b, i)).intValue());
    }

    public int getItemCount() {
        return this.f50910b.size();
    }

    /* renamed from: a */
    private final void m61732a(View view) {
        if (view.getTag() instanceof Integer) {
            C19040a c19040a = this.f50909a;
            view = view.getTag();
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            c19040a.onNext((Integer) view);
        }
    }
}
