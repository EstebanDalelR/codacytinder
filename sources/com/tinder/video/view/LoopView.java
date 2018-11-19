package com.tinder.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tinder.video.C15407a.C15397d;
import com.tinder.video.C15407a.C15398e;
import com.tinder.video.model.C17250a;
import com.tinder.video.model.C17251d;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¨\u0006\u000e"}, d2 = {"Lcom/tinder/video/view/LoopView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributes", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bind", "", "videoViewModels", "", "Lcom/tinder/video/model/VideoViewModel;", "thumbnailViewModels", "Lcom/tinder/video/model/ImageViewModel;", "video_release"}, k = 1, mv = {1, 1, 10})
public final class LoopView extends FrameLayout {
    /* renamed from: a */
    private HashMap f47699a;

    /* renamed from: a */
    public View m57805a(int i) {
        if (this.f47699a == null) {
            this.f47699a = new HashMap();
        }
        View view = (View) this.f47699a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f47699a.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ LoopView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public LoopView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        FrameLayout.inflate(context, C15398e.loop_view, this);
        ((MediaView) m57805a(C15397d.mediaView)).m66276a(attributeSet);
    }

    /* renamed from: a */
    public final void m57806a(@NotNull List<C17251d> list, @NotNull List<C17250a> list2) {
        C2668g.b(list, "videoViewModels");
        C2668g.b(list2, "thumbnailViewModels");
        MediaView.m66261a((MediaView) m57805a(C15397d.mediaView), list, list2, null, null, 12, null);
    }
}
