package com.tinder.loops.ui.p284a;

import android.arch.paging.C2700g;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.content.C0432b;
import android.support.v7.util.DiffUtil.ItemCallback;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tinder.loops.engine.common.p273b.C9770a;
import com.tinder.p236e.C8946a.C8942a;
import com.tinder.p236e.C8946a.C8944c;
import com.tinder.p236e.C8946a.C8945d;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/tinder/loops/ui/adapter/TimelineRecyclerViewAdapter;", "Landroid/arch/paging/PagedListAdapter;", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "Lcom/tinder/loops/ui/adapter/TimelineRecyclerViewAdapter$FrameViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "FrameViewHolder", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.ui.a.a */
public final class C13379a extends C2700g<C9770a, C11953c> {
    /* renamed from: a */
    public static final C9804a f42397a = new C9804a();
    @NotNull
    /* renamed from: b */
    private static final ItemCallback<C9770a> f42398b = new C11952b();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/loops/ui/adapter/TimelineRecyclerViewAdapter$Companion;", "", "()V", "FRAME_COMPARATOR", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "getFRAME_COMPARATOR", "()Landroid/support/v7/util/DiffUtil$ItemCallback;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.a.a$a */
    public static final class C9804a {
        private C9804a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/tinder/loops/ui/adapter/TimelineRecyclerViewAdapter$Companion$FRAME_COMPARATOR$1", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.a.a$b */
    public static final class C11952b extends ItemCallback<C9770a> {
        C11952b() {
        }

        public /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
            return m47986b((C9770a) obj, (C9770a) obj2);
        }

        public /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
            return m47985a((C9770a) obj, (C9770a) obj2);
        }

        /* renamed from: a */
        public boolean m47985a(@NotNull C9770a c9770a, @NotNull C9770a c9770a2) {
            C2668g.b(c9770a, "oldItem");
            C2668g.b(c9770a2, "newItem");
            return c9770a.m40315b() == c9770a2.m40315b() ? true : null;
        }

        /* renamed from: b */
        public boolean m47986b(@Nullable C9770a c9770a, @Nullable C9770a c9770a2) {
            return C2668g.a(c9770a, c9770a2);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/loops/ui/adapter/TimelineRecyclerViewAdapter$FrameViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "frameTimelineImageView", "Landroid/widget/ImageView;", "bind", "", "frame", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "clear", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.a.a$c */
    public static final class C11953c extends ViewHolder {
        /* renamed from: a */
        private ImageView f38885a;

        public C11953c(@NotNull View view) {
            C2668g.b(view, "view");
            super(view);
            view = view.findViewById(C8944c.frameTimelineImageView);
            C2668g.a(view, "view.findViewById(R.id.frameTimelineImageView)");
            this.f38885a = (ImageView) view;
        }

        /* renamed from: a */
        public final void m47988a(@NotNull C9770a c9770a) {
            C2668g.b(c9770a, "frame");
            this.f38885a.setImageBitmap(c9770a.m40314a());
            this.f38885a.setBackground((Drawable) null);
            c9770a = this.itemView;
            C2668g.a(c9770a, "itemView");
            c9770a.setScaleY(0.85f);
            c9770a = this.f38885a;
            View view = this.itemView;
            C2668g.a(view, "itemView");
            c9770a.setColorFilter(C0432b.c(view.getContext(), C8942a.whiteFadeOut), Mode.MULTIPLY);
        }

        /* renamed from: a */
        public final void m47987a() {
            this.f38885a.setImageBitmap(null);
            this.f38885a.setBackgroundColor(-3355444);
            View view = this.itemView;
            C2668g.a(view, "itemView");
            view.setScaleY(0.85f);
            this.f38885a.setColorFilter((ColorFilter) null);
        }
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m51740a((C11953c) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m51739a(viewGroup, i);
    }

    public C13379a() {
        super(f42398b);
    }

    @NotNull
    /* renamed from: a */
    public C11953c m51739a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        viewGroup = LayoutInflater.from(viewGroup.getContext()).inflate(C8945d.view_frame_timeline, viewGroup, false);
        C2668g.a(viewGroup, "view");
        return new C11953c(viewGroup);
    }

    /* renamed from: a */
    public void m51740a(@NotNull C11953c c11953c, int i) {
        C2668g.b(c11953c, "holder");
        C9770a c9770a = (C9770a) a(i);
        if (c9770a != null) {
            c11953c.m47988a(c9770a);
        } else {
            c11953c.m47987a();
        }
    }
}
