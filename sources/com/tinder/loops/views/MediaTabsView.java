package com.tinder.loops.views;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0218d;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.jakewharton.rxbinding2.p135a.p136a.p137a.C5712d;
import com.jakewharton.rxbinding2.p135a.p136a.p137a.C5713e;
import com.jakewharton.rxbinding2.p135a.p136a.p137a.C7020h;
import com.tinder.loops.C9753a.C9749d;
import com.tinder.loops.C9753a.C9750e;
import com.tinder.loops.di.MediaSelectorActivitySubComponentProvider;
import com.tinder.loops.p268b.C9762c;
import com.tinder.loops.target.MediaTabsTarget;
import com.tinder.utils.C15365p;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
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
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\b\u0010\u001d\u001a\u00020\u001bH\u0014J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/tinder/loops/views/MediaTabsView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/loops/target/MediaTabsTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mediaTabs", "", "Lcom/tinder/loops/views/MediaTabsView$MediaTab;", "[Lcom/tinder/loops/views/MediaTabsView$MediaTab;", "presenter", "Lcom/tinder/loops/presenter/MediaTabsPresenter;", "getPresenter", "()Lcom/tinder/loops/presenter/MediaTabsPresenter;", "setPresenter", "(Lcom/tinder/loops/presenter/MediaTabsPresenter;)V", "tabLayout", "Landroid/support/design/widget/TabLayout;", "getTabLayout", "()Landroid/support/design/widget/TabLayout;", "tabLayout$delegate", "Lkotlin/Lazy;", "observeTabSelections", "", "onAttachedToWindow", "onDetachedFromWindow", "selectTab", "tabPosition", "", "setupTabLayout", "showTab", "mediaTab", "MediaTab", "loops_release"}, k = 1, mv = {1, 1, 10})
public final class MediaTabsView extends FrameLayout implements MediaTabsTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38931a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(MediaTabsView.class), "tabLayout", "getTabLayout()Landroid/support/design/widget/TabLayout;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C9762c f38932b;
    /* renamed from: c */
    private final Lazy f38933c;
    /* renamed from: d */
    private final MediaTab[] f38934d;
    /* renamed from: e */
    private final C17356a f38935e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/loops/views/MediaTabsView$MediaTab;", "", "textResourceId", "", "(Ljava/lang/String;II)V", "getTextResourceId", "()I", "ALL", "VIDEOS", "PHOTOS", "loops_release"}, k = 1, mv = {1, 1, 10})
    public enum MediaTab {
        ;
        
        private final int textResourceId;

        protected MediaTab(int i) {
            this.textResourceId = i;
        }

        public final int getTextResourceId() {
            return this.textResourceId;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/jakewharton/rxbinding2/support/design/widget/TabLayoutSelectionEvent;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.views.MediaTabsView$a */
    static final class C11982a<T> implements Consumer<C5713e> {
        /* renamed from: a */
        final /* synthetic */ MediaTabsView f38929a;

        C11982a(MediaTabsView mediaTabsView) {
            this.f38929a = mediaTabsView;
        }

        public /* synthetic */ void accept(Object obj) {
            m48016a((C5713e) obj);
        }

        /* renamed from: a */
        public final void m48016a(C5713e c5713e) {
            if (c5713e instanceof C7020h) {
                C9762c presenter = this.f38929a.getPresenter();
                c5713e = c5713e.b();
                C2668g.a(c5713e, "it.tab()");
                presenter.m40292a(c5713e.c());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.views.MediaTabsView$b */
    static final class C11983b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11983b f38930a = new C11983b();

        C11983b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48017a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48017a(Throwable th) {
            C0001a.c(th, "Error observing tab events", new Object[0]);
        }
    }

    private final TabLayout getTabLayout() {
        Lazy lazy = this.f38933c;
        KProperty kProperty = f38931a[0];
        return (TabLayout) lazy.getValue();
    }

    public /* synthetic */ MediaTabsView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public MediaTabsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f38933c = C18451c.a(LazyThreadSafetyMode.NONE, new MediaTabsView$$special$$inlined$bindView$1(this, C9749d.tabLayout));
        this.f38934d = MediaTab.values();
        this.f38935e = new C17356a();
        if (isInEditMode() == null) {
            attributeSet = C15365p.b(context);
            if (attributeSet == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.loops.di.MediaSelectorActivitySubComponentProvider");
            }
            ((MediaSelectorActivitySubComponentProvider) attributeSet).provideMediaSelectorActivitySubComponent().inject(this);
        }
        FrameLayout.inflate(context, C9750e.media_tabs_view, this);
        m48018a();
    }

    @NotNull
    public final C9762c getPresenter() {
        C9762c c9762c = this.f38932b;
        if (c9762c == null) {
            C2668g.b("presenter");
        }
        return c9762c;
    }

    public final void setPresenter(@NotNull C9762c c9762c) {
        C2668g.b(c9762c, "<set-?>");
        this.f38932b = c9762c;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9762c c9762c = this.f38932b;
        if (c9762c == null) {
            C2668g.b("presenter");
        }
        c9762c.m40293a((MediaTabsTarget) this);
        m48020b();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9762c c9762c = this.f38932b;
        if (c9762c == null) {
            C2668g.b("presenter");
        }
        c9762c.m40291a();
        this.f38935e.a();
    }

    public void showTab(@NotNull MediaTab mediaTab) {
        C2668g.b(mediaTab, "mediaTab");
        m48019a(mediaTab.ordinal());
    }

    /* renamed from: a */
    private final void m48018a() {
        for (MediaTab textResourceId : this.f38934d) {
            getTabLayout().a(getTabLayout().a().a(getResources().getString(textResourceId.getTextResourceId())));
        }
    }

    /* renamed from: a */
    private final void m48019a(int i) {
        C0218d a = getTabLayout().a(i);
        if (a == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tab is null at position = ");
            stringBuilder.append(i);
            stringBuilder.append(46);
            throw new IllegalStateException(stringBuilder.toString().toString());
        } else if (a.f() == 0) {
            a.e();
        }
    }

    /* renamed from: b */
    private final void m48020b() {
        this.f38935e.add(C5712d.a(getTabLayout()).subscribe(new C11982a(this), C11983b.f38930a));
    }
}
