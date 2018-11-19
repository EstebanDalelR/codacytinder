package com.tinder.feed.view.feed;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.common.p191d.C8529a;
import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.footer.FeedFooterView;
import com.tinder.feed.view.footer.FeedInstagramFooterDescriptionView;
import com.tinder.feed.view.info.FeedInfoView;
import com.tinder.feed.view.media.FeedInstagramMediaView;
import com.tinder.feed.view.message.FeedCommentView;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C13281i;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C9542a;
import com.tinder.module.FeedViewComponentProvider;
import com.tinder.profile.p365d.C14398a;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0003H\u0016J\u0010\u0010?\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0003H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8@X\u0002¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8@X\u0002¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b*\u0010\"R\u0014\u0010,\u001a\u00020-X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001e\u00100\u001a\u0002018\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0002078\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006@"}, d2 = {"Lcom/tinder/feed/view/feed/InstagramFeedItemView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/feed/view/feed/BindableFeedItemView;", "Lcom/tinder/feed/view/model/InstagramMediaFeedViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "constraintHelper", "Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;", "getConstraintHelper", "()Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;", "constraintHelper$delegate", "Lkotlin/Lazy;", "feedCommentContainer", "Lcom/tinder/feed/view/message/FeedCommentView;", "getFeedCommentContainer", "()Lcom/tinder/feed/view/message/FeedCommentView;", "feedCommentContainer$delegate", "feedComposerProvider", "Lcom/tinder/feed/view/provider/FeedComposerProvider;", "getFeedComposerProvider$Tinder_release", "()Lcom/tinder/feed/view/provider/FeedComposerProvider;", "setFeedComposerProvider$Tinder_release", "(Lcom/tinder/feed/view/provider/FeedComposerProvider;)V", "feedDescriptionView", "Lcom/tinder/feed/view/footer/FeedInstagramFooterDescriptionView;", "feedFooterContainer", "Lcom/tinder/feed/view/footer/FeedFooterView;", "getFeedFooterContainer$Tinder_release", "()Lcom/tinder/feed/view/footer/FeedFooterView;", "feedFooterContainer$delegate", "feedFooterDescriptionContainer", "Landroid/view/ViewGroup;", "getFeedFooterDescriptionContainer", "()Landroid/view/ViewGroup;", "feedFooterDescriptionContainer$delegate", "feedInfoContainer", "Lcom/tinder/feed/view/info/FeedInfoView;", "getFeedInfoContainer$Tinder_release", "()Lcom/tinder/feed/view/info/FeedInfoView;", "feedInfoContainer$delegate", "feedMediaContainer", "getFeedMediaContainer", "feedMediaContainer$delegate", "feedMediaView", "Lcom/tinder/feed/view/media/FeedInstagramMediaView;", "getFeedMediaView$Tinder_release", "()Lcom/tinder/feed/view/media/FeedInstagramMediaView;", "overflowListenerFactory", "Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;", "getOverflowListenerFactory$Tinder_release", "()Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;", "setOverflowListenerFactory$Tinder_release", "(Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;)V", "presenter", "Lcom/tinder/feed/presenter/FeedItemPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/feed/presenter/FeedItemPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/feed/presenter/FeedItemPresenter;)V", "bind", "", "feedItem", "bindComments", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.feed.j */
public final class C11735j extends ConstraintLayout implements BindableFeedItemView<C13281i> {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38294a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C11735j.class), "feedInfoContainer", "getFeedInfoContainer$Tinder_release()Lcom/tinder/feed/view/info/FeedInfoView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11735j.class), "feedFooterContainer", "getFeedFooterContainer$Tinder_release()Lcom/tinder/feed/view/footer/FeedFooterView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11735j.class), "feedFooterDescriptionContainer", "getFeedFooterDescriptionContainer()Landroid/view/ViewGroup;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11735j.class), "feedMediaContainer", "getFeedMediaContainer()Landroid/view/ViewGroup;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11735j.class), "feedCommentContainer", "getFeedCommentContainer()Lcom/tinder/feed/view/message/FeedCommentView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11735j.class), "constraintHelper", "getConstraintHelper()Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C9467d f38295b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C9486b f38296c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C9542a f38297d;
    @NotNull
    /* renamed from: e */
    private final Lazy f38298e = C18451c.a(LazyThreadSafetyMode.NONE, new InstagramFeedItemView$$special$$inlined$bindView$1(this, R.id.feedInfoContainer));
    @NotNull
    /* renamed from: f */
    private final Lazy f38299f = C18451c.a(LazyThreadSafetyMode.NONE, new InstagramFeedItemView$$special$$inlined$bindView$2(this, R.id.feedFooterContainer));
    @NotNull
    /* renamed from: g */
    private final FeedInstagramMediaView f38300g;
    /* renamed from: h */
    private final Lazy f38301h;
    /* renamed from: i */
    private final Lazy f38302i;
    /* renamed from: j */
    private final Lazy f38303j;
    /* renamed from: k */
    private final Lazy f38304k;
    /* renamed from: l */
    private final FeedInstagramFooterDescriptionView f38305l;

    private final C9495g getConstraintHelper() {
        Lazy lazy = this.f38304k;
        KProperty kProperty = f38294a[5];
        return (C9495g) lazy.getValue();
    }

    private final FeedCommentView getFeedCommentContainer() {
        Lazy lazy = this.f38303j;
        KProperty kProperty = f38294a[4];
        return (FeedCommentView) lazy.getValue();
    }

    private final ViewGroup getFeedFooterDescriptionContainer() {
        Lazy lazy = this.f38301h;
        KProperty kProperty = f38294a[2];
        return (ViewGroup) lazy.getValue();
    }

    private final ViewGroup getFeedMediaContainer() {
        Lazy lazy = this.f38302i;
        KProperty kProperty = f38294a[3];
        return (ViewGroup) lazy.getValue();
    }

    @NotNull
    public final FeedFooterView getFeedFooterContainer$Tinder_release() {
        Lazy lazy = this.f38299f;
        KProperty kProperty = f38294a[1];
        return (FeedFooterView) lazy.getValue();
    }

    @NotNull
    public final FeedInfoView getFeedInfoContainer$Tinder_release() {
        Lazy lazy = this.f38298e;
        KProperty kProperty = f38294a[0];
        return (FeedInfoView) lazy.getValue();
    }

    public /* synthetic */ void bind(FeedItem feedItem) {
        m47579a((C13281i) feedItem);
    }

    public /* synthetic */ void bindComments(FeedItem feedItem) {
        m47580b((C13281i) feedItem);
    }

    public C11735j(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        this.f38300g = new FeedInstagramMediaView(context, null, 2, null);
        this.f38301h = C18451c.a(LazyThreadSafetyMode.NONE, new InstagramFeedItemView$$special$$inlined$bindView$3(this, R.id.feedFooterDescriptionContainer));
        this.f38302i = C18451c.a(LazyThreadSafetyMode.NONE, new InstagramFeedItemView$$special$$inlined$bindView$4(this, R.id.feedMediaContainer));
        this.f38303j = C18451c.a(LazyThreadSafetyMode.NONE, new InstagramFeedItemView$$special$$inlined$bindView$5(this, R.id.feedCommentContainer));
        this.f38304k = C18451c.a(new InstagramFeedItemView$constraintHelper$2(this));
        this.f38305l = new FeedInstagramFooterDescriptionView(context, null, 2, null);
        if (!isInEditMode()) {
            Context a = C14398a.a(context);
            if (a == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.FeedViewComponentProvider");
            }
            ((FeedViewComponentProvider) a).provideFeedViewComponent().inject(this);
        }
        ConstraintLayout.inflate(context, R.layout.feed_item_view, this);
        setLayoutParams(C8529a.f30276a.m36494b());
        getFeedMediaContainer().addView(this.f38300g);
        getFeedFooterDescriptionContainer().addView(this.f38305l);
        setClipChildren(null);
    }

    @NotNull
    public final FeedInstagramMediaView getFeedMediaView$Tinder_release() {
        return this.f38300g;
    }

    @NotNull
    public final C9467d getPresenter$Tinder_release() {
        C9467d c9467d = this.f38295b;
        if (c9467d == null) {
            C2668g.b("presenter");
        }
        return c9467d;
    }

    public final void setPresenter$Tinder_release(@NotNull C9467d c9467d) {
        C2668g.b(c9467d, "<set-?>");
        this.f38295b = c9467d;
    }

    @NotNull
    public final C9486b getOverflowListenerFactory$Tinder_release() {
        C9486b c9486b = this.f38296c;
        if (c9486b == null) {
            C2668g.b("overflowListenerFactory");
        }
        return c9486b;
    }

    public final void setOverflowListenerFactory$Tinder_release(@NotNull C9486b c9486b) {
        C2668g.b(c9486b, "<set-?>");
        this.f38296c = c9486b;
    }

    @NotNull
    public final C9542a getFeedComposerProvider$Tinder_release() {
        C9542a c9542a = this.f38297d;
        if (c9542a == null) {
            C2668g.b("feedComposerProvider");
        }
        return c9542a;
    }

    public final void setFeedComposerProvider$Tinder_release(@NotNull C9542a c9542a) {
        C2668g.b(c9542a, "<set-?>");
        this.f38297d = c9542a;
    }

    /* renamed from: a */
    public void m47579a(@NotNull C13281i c13281i) {
        C2668g.b(c13281i, "feedItem");
        C9486b c9486b = this.f38296c;
        if (c9486b == null) {
            C2668g.b("overflowListenerFactory");
        }
        C9467d c9467d = this.f38295b;
        if (c9467d == null) {
            C2668g.b("presenter");
        }
        C9494f.m39710a(this, c13281i, c9486b.m39665a(c9467d, c13281i), (Function0) new InstagramFeedItemView$bind$1(this, c13281i));
        C9492d.m39687a(this, c13281i);
        this.f38305l.m39738a(c13281i);
        C9493e.m39699a(this, c13281i);
        m47580b(c13281i);
    }

    /* renamed from: b */
    public void m47580b(@NotNull C13281i c13281i) {
        C2668g.b(c13281i, "feedItem");
        getFeedCommentContainer().m47666a((ActivityFeedViewModel) c13281i);
        getConstraintHelper().m39718a(c13281i.mo11144f() != null ? true : null);
    }
}
