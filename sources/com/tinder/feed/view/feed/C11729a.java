package com.tinder.feed.view.feed;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tinder.R;
import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.footer.FeedFooterView;
import com.tinder.feed.view.info.FeedInfoView;
import com.tinder.feed.view.media.FeedInstagramMediaView;
import com.tinder.feed.view.message.FeedCommentView;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C13280h;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0003H\u0016J\u0010\u0010:\u001a\u0002082\u0006\u00109\u001a\u00020\u0003H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198@X\u0002¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8@X\u0002¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020(X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/tinder/feed/view/feed/ConnectedInstagramFeedView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/feed/view/feed/BindableFeedItemView;", "Lcom/tinder/feed/view/model/InstagramConnectFeedViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "constraintHelper", "Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;", "getConstraintHelper", "()Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;", "constraintHelper$delegate", "Lkotlin/Lazy;", "feedCommentContainer", "Lcom/tinder/feed/view/message/FeedCommentView;", "getFeedCommentContainer", "()Lcom/tinder/feed/view/message/FeedCommentView;", "feedCommentContainer$delegate", "feedComposerProvider", "Lcom/tinder/feed/view/provider/FeedComposerProvider;", "getFeedComposerProvider$Tinder_release", "()Lcom/tinder/feed/view/provider/FeedComposerProvider;", "setFeedComposerProvider$Tinder_release", "(Lcom/tinder/feed/view/provider/FeedComposerProvider;)V", "feedFooterContainer", "Lcom/tinder/feed/view/footer/FeedFooterView;", "getFeedFooterContainer$Tinder_release", "()Lcom/tinder/feed/view/footer/FeedFooterView;", "feedFooterContainer$delegate", "feedInfoContainer", "Lcom/tinder/feed/view/info/FeedInfoView;", "getFeedInfoContainer$Tinder_release", "()Lcom/tinder/feed/view/info/FeedInfoView;", "feedInfoContainer$delegate", "feedMediaContainer", "Landroid/view/ViewGroup;", "getFeedMediaContainer", "()Landroid/view/ViewGroup;", "feedMediaContainer$delegate", "feedMediaView", "Lcom/tinder/feed/view/media/FeedInstagramMediaView;", "getFeedMediaView$Tinder_release", "()Lcom/tinder/feed/view/media/FeedInstagramMediaView;", "overflowListenerFactory", "Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;", "getOverflowListenerFactory$Tinder_release", "()Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;", "setOverflowListenerFactory$Tinder_release", "(Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;)V", "presenter", "Lcom/tinder/feed/presenter/FeedItemPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/feed/presenter/FeedItemPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/feed/presenter/FeedItemPresenter;)V", "bind", "", "feedItem", "bindComments", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.feed.a */
public final class C11729a extends ConstraintLayout implements BindableFeedItemView<C13280h> {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38259a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C11729a.class), "feedInfoContainer", "getFeedInfoContainer$Tinder_release()Lcom/tinder/feed/view/info/FeedInfoView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11729a.class), "feedFooterContainer", "getFeedFooterContainer$Tinder_release()Lcom/tinder/feed/view/footer/FeedFooterView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11729a.class), "feedCommentContainer", "getFeedCommentContainer()Lcom/tinder/feed/view/message/FeedCommentView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11729a.class), "constraintHelper", "getConstraintHelper()Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11729a.class), "feedMediaContainer", "getFeedMediaContainer()Landroid/view/ViewGroup;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C9467d f38260b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C9486b f38261c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C9542a f38262d;
    @NotNull
    /* renamed from: e */
    private final Lazy f38263e = C18451c.a(LazyThreadSafetyMode.NONE, new ConnectedInstagramFeedView$$special$$inlined$bindView$1(this, R.id.feedInfoContainer));
    @NotNull
    /* renamed from: f */
    private final FeedInstagramMediaView f38264f;
    @NotNull
    /* renamed from: g */
    private final Lazy f38265g;
    /* renamed from: h */
    private final Lazy f38266h;
    /* renamed from: i */
    private final Lazy f38267i;
    /* renamed from: j */
    private final Lazy f38268j;

    private final C9495g getConstraintHelper() {
        Lazy lazy = this.f38267i;
        KProperty kProperty = f38259a[3];
        return (C9495g) lazy.getValue();
    }

    private final FeedCommentView getFeedCommentContainer() {
        Lazy lazy = this.f38266h;
        KProperty kProperty = f38259a[2];
        return (FeedCommentView) lazy.getValue();
    }

    private final ViewGroup getFeedMediaContainer() {
        Lazy lazy = this.f38268j;
        KProperty kProperty = f38259a[4];
        return (ViewGroup) lazy.getValue();
    }

    @NotNull
    public final FeedFooterView getFeedFooterContainer$Tinder_release() {
        Lazy lazy = this.f38265g;
        KProperty kProperty = f38259a[1];
        return (FeedFooterView) lazy.getValue();
    }

    @NotNull
    public final FeedInfoView getFeedInfoContainer$Tinder_release() {
        Lazy lazy = this.f38263e;
        KProperty kProperty = f38259a[0];
        return (FeedInfoView) lazy.getValue();
    }

    public /* synthetic */ void bind(FeedItem feedItem) {
        m47567a((C13280h) feedItem);
    }

    public /* synthetic */ void bindComments(FeedItem feedItem) {
        m47568b((C13280h) feedItem);
    }

    public C11729a(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        this.f38264f = new FeedInstagramMediaView(context, null, 2, null);
        this.f38265g = C18451c.a(LazyThreadSafetyMode.NONE, new ConnectedInstagramFeedView$$special$$inlined$bindView$2(this, R.id.feedFooterContainer));
        this.f38266h = C18451c.a(LazyThreadSafetyMode.NONE, new ConnectedInstagramFeedView$$special$$inlined$bindView$3(this, R.id.feedCommentContainer));
        this.f38267i = C18451c.a(new ConnectedInstagramFeedView$constraintHelper$2(this));
        this.f38268j = C18451c.a(LazyThreadSafetyMode.NONE, new ConnectedInstagramFeedView$$special$$inlined$bindView$4(this, R.id.feedMediaContainer));
        if (!isInEditMode()) {
            Context a = C14398a.a(context);
            if (a == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.FeedViewComponentProvider");
            }
            ((FeedViewComponentProvider) a).provideFeedViewComponent().inject(this);
        }
        ConstraintLayout.inflate(context, R.layout.feed_item_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        getFeedMediaContainer().addView(this.f38264f);
        setClipChildren(null);
    }

    @NotNull
    public final FeedInstagramMediaView getFeedMediaView$Tinder_release() {
        return this.f38264f;
    }

    @NotNull
    public final C9467d getPresenter$Tinder_release() {
        C9467d c9467d = this.f38260b;
        if (c9467d == null) {
            C2668g.b("presenter");
        }
        return c9467d;
    }

    public final void setPresenter$Tinder_release(@NotNull C9467d c9467d) {
        C2668g.b(c9467d, "<set-?>");
        this.f38260b = c9467d;
    }

    @NotNull
    public final C9486b getOverflowListenerFactory$Tinder_release() {
        C9486b c9486b = this.f38261c;
        if (c9486b == null) {
            C2668g.b("overflowListenerFactory");
        }
        return c9486b;
    }

    public final void setOverflowListenerFactory$Tinder_release(@NotNull C9486b c9486b) {
        C2668g.b(c9486b, "<set-?>");
        this.f38261c = c9486b;
    }

    @NotNull
    public final C9542a getFeedComposerProvider$Tinder_release() {
        C9542a c9542a = this.f38262d;
        if (c9542a == null) {
            C2668g.b("feedComposerProvider");
        }
        return c9542a;
    }

    public final void setFeedComposerProvider$Tinder_release(@NotNull C9542a c9542a) {
        C2668g.b(c9542a, "<set-?>");
        this.f38262d = c9542a;
    }

    /* renamed from: a */
    public void m47567a(@NotNull C13280h c13280h) {
        C2668g.b(c13280h, "feedItem");
        C9486b c9486b = this.f38261c;
        if (c9486b == null) {
            C2668g.b("overflowListenerFactory");
        }
        C9467d c9467d = this.f38260b;
        if (c9467d == null) {
            C2668g.b("presenter");
        }
        C9494f.m39708a(this, c13280h, c9486b.m39665a(c9467d, c13280h), (Function0) new ConnectedInstagramFeedView$bind$1(this, c13280h));
        C9492d.m39685a(this, c13280h);
        C9493e.m39697a(this, c13280h);
        m47568b(c13280h);
    }

    /* renamed from: b */
    public void m47568b(@NotNull C13280h c13280h) {
        C2668g.b(c13280h, "feedItem");
        getFeedCommentContainer().m47666a((ActivityFeedViewModel) c13280h);
        getConstraintHelper().m39718a(c13280h.mo11144f() != null ? true : null);
    }
}
