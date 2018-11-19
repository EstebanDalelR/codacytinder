package com.tinder.loops.views;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.loops.C9753a.C9748c;
import com.tinder.loops.C9753a.C9749d;
import com.tinder.loops.C9753a.C9750e;
import com.tinder.loops.C9753a.C9751f;
import com.tinder.loops.di.MediaSelectorActivitySubComponentProvider;
import com.tinder.loops.p268b.C9760a;
import com.tinder.loops.target.EmptyStateContainerTarget;
import com.tinder.loops.views.MediaTabsView.MediaTab;
import com.tinder.utils.C15365p;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J \u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\u001dH\u0014J\b\u0010&\u001a\u00020\u001dH\u0014J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001a\u0010\u0017¨\u0006("}, d2 = {"Lcom/tinder/loops/views/EmptyStateContainerView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/loops/target/EmptyStateContainerTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "imageView$delegate", "Lkotlin/Lazy;", "presenter", "Lcom/tinder/loops/presenter/EmptyStateContainerPresenter;", "getPresenter", "()Lcom/tinder/loops/presenter/EmptyStateContainerPresenter;", "setPresenter", "(Lcom/tinder/loops/presenter/EmptyStateContainerPresenter;)V", "textViewDetail", "Landroid/widget/TextView;", "getTextViewDetail", "()Landroid/widget/TextView;", "textViewDetail$delegate", "textViewHeader", "getTextViewHeader", "textViewHeader$delegate", "bind", "", "tab", "Lcom/tinder/loops/views/MediaTabsView$MediaTab;", "bindEmptyState", "imageDrawable", "", "headerResId", "messageId", "onAttachedToWindow", "onDetachedFromWindow", "showTab", "loops_release"}, k = 1, mv = {1, 1, 10})
public final class EmptyStateContainerView extends ConstraintLayout implements EmptyStateContainerTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38919a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(EmptyStateContainerView.class), "imageView", "getImageView()Landroid/widget/ImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(EmptyStateContainerView.class), "textViewHeader", "getTextViewHeader()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(EmptyStateContainerView.class), "textViewDetail", "getTextViewDetail()Landroid/widget/TextView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C9760a f38920b;
    /* renamed from: c */
    private final Lazy f38921c;
    /* renamed from: d */
    private final Lazy f38922d;
    /* renamed from: e */
    private final Lazy f38923e;

    private final ImageView getImageView() {
        Lazy lazy = this.f38921c;
        KProperty kProperty = f38919a[0];
        return (ImageView) lazy.getValue();
    }

    private final TextView getTextViewDetail() {
        Lazy lazy = this.f38923e;
        KProperty kProperty = f38919a[2];
        return (TextView) lazy.getValue();
    }

    private final TextView getTextViewHeader() {
        Lazy lazy = this.f38922d;
        KProperty kProperty = f38919a[1];
        return (TextView) lazy.getValue();
    }

    public /* synthetic */ EmptyStateContainerView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public EmptyStateContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f38921c = C18451c.a(LazyThreadSafetyMode.NONE, new EmptyStateContainerView$$special$$inlined$bindView$1(this, C9749d.emptyImageView));
        this.f38922d = C18451c.a(LazyThreadSafetyMode.NONE, new EmptyStateContainerView$$special$$inlined$bindView$2(this, C9749d.emptyHeaderText));
        this.f38923e = C18451c.a(LazyThreadSafetyMode.NONE, new EmptyStateContainerView$$special$$inlined$bindView$3(this, C9749d.emptyTextView));
        if (isInEditMode() == null) {
            attributeSet = C15365p.b(context);
            if (attributeSet == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.loops.di.MediaSelectorActivitySubComponentProvider");
            }
            ((MediaSelectorActivitySubComponentProvider) attributeSet).provideMediaSelectorActivitySubComponent().inject(this);
        }
        ConstraintLayout.inflate(context, C9750e.media_selector_empty_state_view, this);
    }

    @NotNull
    public final C9760a getPresenter() {
        C9760a c9760a = this.f38920b;
        if (c9760a == null) {
            C2668g.b("presenter");
        }
        return c9760a;
    }

    public final void setPresenter(@NotNull C9760a c9760a) {
        C2668g.b(c9760a, "<set-?>");
        this.f38920b = c9760a;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9760a c9760a = this.f38920b;
        if (c9760a == null) {
            C2668g.b("presenter");
        }
        c9760a.m40280a((EmptyStateContainerTarget) this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9760a c9760a = this.f38920b;
        if (c9760a == null) {
            C2668g.b("presenter");
        }
        c9760a.m40279a();
    }

    public void showTab(@NotNull MediaTab mediaTab) {
        C2668g.b(mediaTab, "tab");
        m48014a(mediaTab);
    }

    /* renamed from: a */
    private final void m48014a(MediaTab mediaTab) {
        switch (C9813a.f32509a[mediaTab.ordinal()]) {
            case 1:
                m48013a(C9748c.no_media, C9751f.no_media_empty_text, C9751f.no_media);
                return;
            case 2:
                m48013a(C9748c.no_video, C9751f.no_videos_empty_text, C9751f.no_videos);
                return;
            case 3:
                m48013a(C9748c.no_camera, C9751f.no_photos_empty_text, C9751f.no_photos);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m48013a(int i, int i2, int i3) {
        getImageView().setBackground(C0432b.a(getContext(), i));
        getTextViewDetail().setText(getContext().getString(i2));
        getTextViewHeader().setText(getContext().getString(i3));
    }
}
