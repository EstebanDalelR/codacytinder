package com.tinder.feed.view;

import android.content.Context;
import android.support.v4.view.C0600i;
import android.util.AttributeSet;
import com.jakewharton.rxbinding.support.p131a.p132a.C5702a;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.common.view.WrapContentViewPager;
import com.tinder.domain.feed.FeedCarouselItemSelected;
import com.tinder.feed.p249d.C9462a;
import com.tinder.module.FeedViewComponentProvider;
import com.tinder.module.ViewScope;
import com.tinder.profile.p365d.C14398a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u0013\u001a\u00020\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/feed/view/FeedCarouselView;", "Lcom/tinder/common/view/WrapContentViewPager;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feedCarouselItemSelectedProvider", "Lcom/tinder/feed/provider/FeedCarouselItemSelectedProvider;", "getFeedCarouselItemSelectedProvider", "()Lcom/tinder/feed/provider/FeedCarouselItemSelectedProvider;", "setFeedCarouselItemSelectedProvider", "(Lcom/tinder/feed/provider/FeedCarouselItemSelectedProvider;)V", "feedCarouselViewModel", "Lcom/tinder/feed/view/FeedCarouselView$FeedCarouselViewModel;", "bindAdapterAndViewModel", "", "pagerAdapter", "Landroid/support/v4/view/PagerAdapter;", "onAttachedToWindow", "toCarouselItemSelectedViewModel", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "position", "", "verifyValidViewModel", "FeedCarouselViewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ViewScope
public final class FeedCarouselView extends WrapContentViewPager {
    @Inject
    @NotNull
    /* renamed from: a */
    public C9462a f42040a;
    /* renamed from: b */
    private C9474a f42041b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/feed/view/FeedCarouselView$FeedCarouselViewModel;", "", "feedItemId", "", "mediaListIds", "", "(Ljava/lang/String;Ljava/util/List;)V", "getFeedItemId", "()Ljava/lang/String;", "getMediaListIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedCarouselView$a */
    public static final class C9474a {
        @NotNull
        /* renamed from: a */
        private final String f31775a;
        @NotNull
        /* renamed from: b */
        private final List<String> f31776b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9474a) {
                    C9474a c9474a = (C9474a) obj;
                    if (C2668g.a(this.f31775a, c9474a.f31775a) && C2668g.a(this.f31776b, c9474a.f31776b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f31775a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List list = this.f31776b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FeedCarouselViewModel(feedItemId=");
            stringBuilder.append(this.f31775a);
            stringBuilder.append(", mediaListIds=");
            stringBuilder.append(this.f31776b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9474a(@NotNull String str, @NotNull List<String> list) {
            C2668g.b(str, "feedItemId");
            C2668g.b(list, "mediaListIds");
            this.f31775a = str;
            this.f31776b = list;
        }

        @NotNull
        /* renamed from: a */
        public final String m39631a() {
            return this.f31775a;
        }

        @NotNull
        /* renamed from: b */
        public final List<String> m39632b() {
            return this.f31776b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Integer;)Lcom/tinder/domain/feed/FeedCarouselItemSelected;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedCarouselView$b */
    static final class C13275b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ FeedCarouselView f42039a;

        C13275b(FeedCarouselView feedCarouselView) {
            this.f42039a = feedCarouselView;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51333a((Integer) obj);
        }

        @NotNull
        /* renamed from: a */
        public final FeedCarouselItemSelected m51333a(Integer num) {
            FeedCarouselView feedCarouselView = this.f42039a;
            C2668g.a(num, "it");
            return feedCarouselView.m51334a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedCarouselView$c */
    static final class C14005c<T> implements Action1<FeedCarouselItemSelected> {
        /* renamed from: a */
        final /* synthetic */ FeedCarouselView f44146a;

        C14005c(FeedCarouselView feedCarouselView) {
            this.f44146a = feedCarouselView;
        }

        public /* synthetic */ void call(Object obj) {
            m53522a((FeedCarouselItemSelected) obj);
        }

        /* renamed from: a */
        public final void m53522a(FeedCarouselItemSelected feedCarouselItemSelected) {
            C9462a feedCarouselItemSelectedProvider = this.f44146a.getFeedCarouselItemSelectedProvider();
            C2668g.a(feedCarouselItemSelected, "it");
            feedCarouselItemSelectedProvider.m39566a(feedCarouselItemSelected);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedCarouselView$d */
    static final class C14006d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14006d f44147a = new C14006d();

        C14006d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53523a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53523a(Throwable th) {
            C0001a.c(th, "Error observing viewpager page selections", new Object[0]);
        }
    }

    @JvmOverloads
    public FeedCarouselView(@NotNull Context context) {
        this(context, null, 2, null);
    }

    @JvmOverloads
    public /* synthetic */ FeedCarouselView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    @JvmOverloads
    public FeedCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        if (isInEditMode() == null) {
            context = C14398a.a(context);
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.FeedViewComponentProvider");
            }
            ((FeedViewComponentProvider) context).provideFeedViewComponent().inject(this);
        }
    }

    @NotNull
    public final C9462a getFeedCarouselItemSelectedProvider() {
        C9462a c9462a = this.f42040a;
        if (c9462a == null) {
            C2668g.b("feedCarouselItemSelectedProvider");
        }
        return c9462a;
    }

    public final void setFeedCarouselItemSelectedProvider(@NotNull C9462a c9462a) {
        C2668g.b(c9462a, "<set-?>");
        this.f42040a = c9462a;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if ((((FeedCarouselView) this).f42041b != null ? 1 : null) == null) {
            throw new IllegalStateException("Developer Error - bindAdapterAndViewModel not called".toString());
        }
        C5702a.a(this).j(C5707b.a(this)).a(C19397a.a()).k(new C13275b(this)).a(new C14005c(this), C14006d.f44147a);
    }

    /* renamed from: a */
    public final void m51337a(@NotNull C0600i c0600i, @NotNull C9474a c9474a) {
        C2668g.b(c0600i, "pagerAdapter");
        C2668g.b(c9474a, "feedCarouselViewModel");
        setAdapter(c0600i);
        m51336a(c9474a);
        this.f42041b = c9474a;
    }

    /* renamed from: a */
    private final FeedCarouselItemSelected m51334a(int i) {
        C9474a c9474a = this.f42041b;
        if (c9474a == null) {
            C2668g.b("feedCarouselViewModel");
        }
        String a = c9474a.m39631a();
        C9474a c9474a2 = this.f42041b;
        if (c9474a2 == null) {
            C2668g.b("feedCarouselViewModel");
        }
        return new FeedCarouselItemSelected(a, (String) c9474a2.m39632b().get(i), i);
    }

    /* renamed from: a */
    private final void m51336a(C9474a c9474a) {
        if (c9474a == null) {
            throw new IllegalStateException("ViewPager must have non-null viewModel".toString());
        }
        c9474a = c9474a.m39632b();
        if (c9474a == null) {
            throw new IllegalStateException("ViewPager must have non-null mediaListIds".toString());
        }
        c9474a = c9474a.size();
        C0600i adapter = getAdapter();
        c9474a = (adapter == null || c9474a != adapter.getCount()) ? null : true;
        if (c9474a == null) {
            throw new IllegalStateException("ViewPager must have mediaListIds size equal to the adapter count".toString());
        }
    }
}
