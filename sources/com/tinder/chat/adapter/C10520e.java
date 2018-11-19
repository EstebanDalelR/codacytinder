package com.tinder.chat.adapter;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tinder.R;
import com.tinder.chat.view.model.C8498n;
import com.tinder.common.view.extension.C8581b;
import com.tinder.common.view.extension.C8583c;
import com.tinder.domain.message.Gif;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J*\u0010\u000e\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u000f0\u000fJ*\u0010\u0010\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u000f0\u000fJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u0014\u0010\u0019\u001a\u00020\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u001aR2\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/chat/adapter/GifSelectorAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tinder/chat/adapter/GifSelectorAdapter$GifViewHolder;", "()V", "clickedGifSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/chat/view/model/GifSelectorGifInfo;", "kotlin.jvm.PlatformType", "items", "", "Lcom/tinder/domain/message/Gif;", "loadedGifSubject", "getItemCount", "", "observeClickedGifs", "Lrx/Observable;", "observeLoadedGifs", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "", "GifViewHolder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.adapter.e */
public final class C10520e extends Adapter<C10519a> {
    /* renamed from: a */
    private final List<Gif> f34202a = new ArrayList();
    /* renamed from: b */
    private final PublishSubject<C8498n> f34203b = PublishSubject.w();
    /* renamed from: c */
    private final PublishSubject<C8498n> f34204c = PublishSubject.w();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.adapter.e$b */
    static final class C8412b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C10520e f29852a;
        /* renamed from: b */
        final /* synthetic */ Gif f29853b;
        /* renamed from: c */
        final /* synthetic */ int f29854c;

        C8412b(C10520e c10520e, Gif gif, int i) {
            this.f29852a = c10520e;
            this.f29853b = gif;
            this.f29854c = i;
        }

        public final void onClick(View view) {
            this.f29852a.f34204c.onNext(new C8498n(this.f29853b, this.f29854c));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/chat/adapter/GifSelectorAdapter$GifViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "gifView", "Landroid/widget/ImageView;", "getGifView$Tinder_release", "()Landroid/widget/ImageView;", "loadingIndicator", "getLoadingIndicator$Tinder_release", "()Landroid/view/View;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.adapter.e$a */
    public static final class C10519a extends ViewHolder {
        @NotNull
        /* renamed from: a */
        private final ImageView f34200a;
        @NotNull
        /* renamed from: b */
        private final View f34201b;

        public C10519a(@NotNull View view) {
            C2668g.b(view, "view");
            super(view);
            View findViewById = view.findViewById(R.id.gif);
            C2668g.a(findViewById, "view.findViewById(R.id.gif)");
            this.f34200a = (ImageView) findViewById;
            view = view.findViewById(R.id.progress);
            C2668g.a(view, "view.findViewById(R.id.progress)");
            this.f34201b = view;
        }

        @NotNull
        /* renamed from: a */
        public final ImageView m42493a() {
            return this.f34200a;
        }

        @NotNull
        /* renamed from: b */
        public final View m42494b() {
            return this.f34201b;
        }
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m42499a((C10519a) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m42497a(viewGroup, i);
    }

    @NotNull
    /* renamed from: a */
    public C10519a m42497a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        viewGroup = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chat_gif_selector_item, viewGroup, false);
        C2668g.a(viewGroup, "view");
        return new C10519a(viewGroup);
    }

    /* renamed from: a */
    public void m42499a(@NotNull C10519a c10519a, int i) {
        C2668g.b(c10519a, "viewHolder");
        Gif gif = (Gif) this.f34202a.get(i);
        C8581b.m36602a(c10519a.m42493a(), gif.getUrl(), c10519a.m42494b(), new C8583c(0, 0, c10519a.m42493a().getLayoutParams().height, gif.aspectRatio(), new GifSelectorAdapter$onBindViewHolder$1(this, gif, i), 3, null));
        c10519a.itemView.setOnClickListener(new C8412b(this, gif, i));
    }

    public int getItemCount() {
        return this.f34202a.size();
    }

    /* renamed from: a */
    public final void m42500a(@NotNull List<Gif> list) {
        C2668g.b(list, "items");
        this.f34202a.clear();
        this.f34202a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final Observable<C8498n> m42498a() {
        return this.f34203b.e();
    }

    /* renamed from: b */
    public final Observable<C8498n> m42501b() {
        return this.f34204c.e();
    }
}
