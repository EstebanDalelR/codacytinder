package com.tinder.feed.view.message;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog.Builder;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.R;
import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.action.C9482a;
import com.tinder.feed.view.feed.C9491c;
import com.tinder.feed.view.feed.C9491c.C9490a;
import com.tinder.feed.view.feed.C9496h;
import com.tinder.feed.view.message.C9533a.C11762a;
import com.tinder.feed.view.message.C9533a.C11763b;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.FeedCommentViewModel;
import com.tinder.feed.view.provider.C9542a;
import com.tinder.module.FeedViewComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.utils.au;
import com.tinder.views.AvatarView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 `2\u00020\u0001:\u0001`B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010P\u001a\u00020Q2\n\u0010R\u001a\u0006\u0012\u0002\b\u00030SJ\u0012\u0010T\u001a\u00020Q2\b\u0010U\u001a\u0004\u0018\u00010VH\u0002J\u0012\u0010W\u001a\u00020Q2\b\u0010U\u001a\u0004\u0018\u00010VH\u0002J\u0014\u0010X\u001a\u00020Q2\n\u0010R\u001a\u0006\u0012\u0002\b\u00030SH\u0002J\u0014\u0010Y\u001a\u00020Q2\n\u0010R\u001a\u0006\u0012\u0002\b\u00030SH\u0002J\u0014\u0010Z\u001a\u00020Q2\n\u0010R\u001a\u0006\u0012\u0002\b\u00030SH\u0002J\b\u0010[\u001a\u00020QH\u0002J\u0014\u0010\\\u001a\u00020Q2\n\u0010R\u001a\u0006\u0012\u0002\b\u00030SH\u0002J\u0010\u0010]\u001a\u00020Q2\u0006\u0010^\u001a\u00020\nH\u0002J\u0014\u0010_\u001a\u00020Q2\n\u0010R\u001a\u0006\u0012\u0002\b\u00030SH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b*\u0010\u0013\u001a\u0004\b)\u0010!R\u001e\u0010+\u001a\u00020,8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u00107\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b9\u0010\u0013\u001a\u0004\b8\u0010\u001cR\u000e\u0010:\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010<\u001a\u00020=8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u00020C8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u000e\u0010H\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010J\u001a\u00020K8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006a"}, d2 = {"Lcom/tinder/feed/view/message/FeedCommentView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "composerVisibilitySubscription", "Lrx/Subscription;", "errorTextNotDelivered", "", "errorTextRetry", "errorTimestampTextColor", "", "feedChatAvatar", "Lcom/tinder/views/AvatarView;", "getFeedChatAvatar", "()Lcom/tinder/views/AvatarView;", "feedChatAvatar$delegate", "Lkotlin/Lazy;", "feedChatAvatarIconSwitcher", "Landroid/widget/ViewSwitcher;", "getFeedChatAvatarIconSwitcher", "()Landroid/widget/ViewSwitcher;", "feedChatAvatarIconSwitcher$delegate", "feedChatBubble", "Landroid/view/View;", "getFeedChatBubble", "()Landroid/view/View;", "feedChatBubble$delegate", "feedChatMessage", "Landroid/widget/TextView;", "getFeedChatMessage", "()Landroid/widget/TextView;", "feedChatMessage$delegate", "feedChatStatusSwitcher", "Landroid/widget/ViewFlipper;", "getFeedChatStatusSwitcher", "()Landroid/widget/ViewFlipper;", "feedChatStatusSwitcher$delegate", "feedChatTimestamp", "getFeedChatTimestamp", "feedChatTimestamp$delegate", "feedCommentActionHandler", "Lcom/tinder/feed/view/action/FeedCommentActionHandler;", "getFeedCommentActionHandler$Tinder_release", "()Lcom/tinder/feed/view/action/FeedCommentActionHandler;", "setFeedCommentActionHandler$Tinder_release", "(Lcom/tinder/feed/view/action/FeedCommentActionHandler;)V", "feedComposerProvider", "Lcom/tinder/feed/view/provider/FeedComposerProvider;", "getFeedComposerProvider$Tinder_release", "()Lcom/tinder/feed/view/provider/FeedComposerProvider;", "setFeedComposerProvider$Tinder_release", "(Lcom/tinder/feed/view/provider/FeedComposerProvider;)V", "feedSendMessageButton", "getFeedSendMessageButton", "feedSendMessageButton$delegate", "messageSent", "pendingTextColor", "presenter", "Lcom/tinder/feed/presenter/FeedItemPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/feed/presenter/FeedItemPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/feed/presenter/FeedItemPresenter;)V", "retrySpannableFormatter", "Lcom/tinder/feed/view/feed/FeedCommentSpannableStringFormatter;", "getRetrySpannableFormatter$Tinder_release", "()Lcom/tinder/feed/view/feed/FeedCommentSpannableStringFormatter;", "setRetrySpannableFormatter$Tinder_release", "(Lcom/tinder/feed/view/feed/FeedCommentSpannableStringFormatter;)V", "sentTextColor", "sentTimestampTextColor", "timestampFormatter", "Lcom/tinder/feed/view/feed/FeedTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/feed/view/feed/FeedTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/feed/view/feed/FeedTimestampFormatter;)V", "bind", "", "feedItem", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "bindAvatar", "feedComment", "Lcom/tinder/feed/view/model/FeedCommentViewModel;", "bindAvatarIconSwitcher", "bindChatBubble", "bindFailedState", "bindMessageButton", "bindPendingState", "bindSentState", "bindToComposerEvents", "feedItemId", "showRetryDeleteDialog", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedCommentView extends ConstraintLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38442a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(FeedCommentView.class), "feedChatAvatarIconSwitcher", "getFeedChatAvatarIconSwitcher()Landroid/widget/ViewSwitcher;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedCommentView.class), "feedChatAvatar", "getFeedChatAvatar()Lcom/tinder/views/AvatarView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedCommentView.class), "feedSendMessageButton", "getFeedSendMessageButton()Landroid/view/View;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedCommentView.class), "feedChatMessage", "getFeedChatMessage()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedCommentView.class), "feedChatTimestamp", "getFeedChatTimestamp()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedCommentView.class), "feedChatBubble", "getFeedChatBubble()Landroid/view/View;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedCommentView.class), "feedChatStatusSwitcher", "getFeedChatStatusSwitcher()Landroid/widget/ViewFlipper;"))};
    /* renamed from: g */
    public static final C9527a f38443g = new C9527a();
    @Inject
    @NotNull
    /* renamed from: b */
    public C9542a f38444b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C9482a f38445c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C9496h f38446d;
    @Inject
    @NotNull
    /* renamed from: e */
    public C9491c f38447e;
    @Inject
    @NotNull
    /* renamed from: f */
    public C9467d f38448f;
    /* renamed from: h */
    private final Lazy f38449h = C18451c.a(LazyThreadSafetyMode.NONE, new FeedCommentView$$special$$inlined$bindView$1(this, R.id.feedChatAvatarIconSwitcher));
    /* renamed from: i */
    private final Lazy f38450i = C18451c.a(LazyThreadSafetyMode.NONE, new FeedCommentView$$special$$inlined$bindView$2(this, R.id.feedChatAvatar));
    /* renamed from: j */
    private final Lazy f38451j = C18451c.a(LazyThreadSafetyMode.NONE, new FeedCommentView$$special$$inlined$bindView$3(this, R.id.feedSendMessageButton));
    /* renamed from: k */
    private final Lazy f38452k = C18451c.a(LazyThreadSafetyMode.NONE, new FeedCommentView$$special$$inlined$bindView$4(this, R.id.feedChatMessage));
    /* renamed from: l */
    private final Lazy f38453l = C18451c.a(LazyThreadSafetyMode.NONE, new FeedCommentView$$special$$inlined$bindView$5(this, R.id.feedChatTimestamp));
    /* renamed from: m */
    private final Lazy f38454m = C18451c.a(LazyThreadSafetyMode.NONE, new FeedCommentView$$special$$inlined$bindView$6(this, R.id.feedChatBubble));
    /* renamed from: n */
    private final Lazy f38455n = C18451c.a(LazyThreadSafetyMode.NONE, new FeedCommentView$$special$$inlined$bindView$7(this, R.id.feedChatStatusSwitcher));
    /* renamed from: o */
    private final int f38456o = au.c(this, R.color.dark_gray);
    /* renamed from: p */
    private final int f38457p = au.c(this, R.color.white);
    /* renamed from: q */
    private final int f38458q = au.c(this, R.color.white);
    /* renamed from: r */
    private final int f38459r = au.c(this, R.color.tinder_accent);
    /* renamed from: s */
    private final String f38460s = au.a(this, R.string.feed_comment_failed_state_not_delivered, new String[0]);
    /* renamed from: t */
    private final String f38461t = au.a(this, R.string.feed_message_sent, new String[0]);
    /* renamed from: u */
    private final String f38462u = au.a(this, R.string.feed_comment_failed_state_retry, new String[0]);
    /* renamed from: v */
    private Subscription f38463v;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/feed/view/message/FeedCommentView$Companion;", "", "()V", "ICON_SWITCHER_ANIMATION_DURATION", "", "ICON_SWITCHER_AVATAR_INDEX", "", "ICON_SWITCHER_MESSAGE_INDEX", "STATUS_SWITCHER_ERROR_INDEX", "STATUS_SWITCHER_PENDING_INDEX", "STATUS_SWITCHER_SENT_INDEX", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentView$a */
    public static final class C9527a {
        private C9527a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentView$b */
    static final class C9528b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FeedCommentView f31889a;
        /* renamed from: b */
        final /* synthetic */ ActivityFeedViewModel f31890b;

        C9528b(FeedCommentView feedCommentView, ActivityFeedViewModel activityFeedViewModel) {
            this.f31889a = feedCommentView;
            this.f31890b = activityFeedViewModel;
        }

        public final void onClick(View view) {
            this.f31889a.m47665f(this.f31890b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentView$c */
    static final class C9529c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FeedCommentView f31891a;
        /* renamed from: b */
        final /* synthetic */ ActivityFeedViewModel f31892b;
        /* renamed from: c */
        final /* synthetic */ FeedCommentViewModel f31893c;

        C9529c(FeedCommentView feedCommentView, ActivityFeedViewModel activityFeedViewModel, FeedCommentViewModel feedCommentViewModel) {
            this.f31891a = feedCommentView;
            this.f31892b = activityFeedViewModel;
            this.f31893c = feedCommentViewModel;
        }

        public final void onClick(View view) {
            this.f31891a.getPresenter$Tinder_release().m39589f(this.f31892b);
            if (this.f31893c == null) {
                this.f31891a.getFeedComposerProvider$Tinder_release().m39818a(new C11763b(this.f31892b.getId()));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentView$d */
    static final class C9530d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FeedCommentView f31894a;
        /* renamed from: b */
        final /* synthetic */ ActivityFeedViewModel f31895b;

        C9530d(FeedCommentView feedCommentView, ActivityFeedViewModel activityFeedViewModel) {
            this.f31894a = feedCommentView;
            this.f31895b = activityFeedViewModel;
        }

        public final void onClick(View view) {
            this.f31894a.getPresenter$Tinder_release().m39591h(this.f31895b);
            view = this.f31894a.getFeedCommentActionHandler$Tinder_release();
            Context context = this.f31894a.getContext();
            C2668g.a(context, "context");
            view.m39657a(context, this.f31895b.mo11140b());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentView$g */
    static final class C9531g implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ FeedCommentView f31896a;
        /* renamed from: b */
        final /* synthetic */ FeedCommentViewModel f31897b;

        C9531g(FeedCommentView feedCommentView, FeedCommentViewModel feedCommentViewModel) {
            this.f31896a = feedCommentView;
            this.f31897b = feedCommentViewModel;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f31896a.getFeedCommentActionHandler$Tinder_release().m39660a(this.f31897b.m39789a(), null, this.f31897b.m39794f(), this.f31897b.m39790b());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentView$h */
    static final class C9532h implements DialogInterface.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ List f31898a;

        C9532h(List list) {
            this.f31898a = list;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((Function1) ((Pair) this.f31898a.get(i)).b()).invoke(Integer.valueOf(i));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/feed/view/message/ComposerStatus;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentView$e */
    static final class C13278e<T, R> implements Func1<C9533a, Boolean> {
        /* renamed from: a */
        final /* synthetic */ String f42070a;

        C13278e(String str) {
            this.f42070a = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51362a((C9533a) obj));
        }

        /* renamed from: a */
        public final boolean m51362a(C9533a c9533a) {
            return C2668g.a(c9533a.m39788a(), this.f42070a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/feed/view/message/ComposerStatus;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentView$f */
    static final class C14018f<T> implements Action1<C9533a> {
        /* renamed from: a */
        final /* synthetic */ FeedCommentView f44392a;

        C14018f(FeedCommentView feedCommentView) {
            this.f44392a = feedCommentView;
        }

        public /* synthetic */ void call(Object obj) {
            m53662a((C9533a) obj);
        }

        /* renamed from: a */
        public final void m53662a(C9533a c9533a) {
            if (c9533a instanceof C11762a) {
                this.f44392a.getFeedChatAvatarIconSwitcher().setVisibility(0);
                this.f44392a.getFeedChatAvatarIconSwitcher().setScaleX(0.0f);
                this.f44392a.getFeedChatAvatarIconSwitcher().setScaleY(0.0f);
                this.f44392a.getFeedChatAvatarIconSwitcher().animate().setDuration(100).scaleX(1.0f).scaleY(1.0f);
            } else if ((c9533a instanceof C11763b) != null) {
                this.f44392a.getFeedChatAvatarIconSwitcher().setVisibility(8);
            }
        }
    }

    private final AvatarView getFeedChatAvatar() {
        Lazy lazy = this.f38450i;
        KProperty kProperty = f38442a[1];
        return (AvatarView) lazy.getValue();
    }

    private final ViewSwitcher getFeedChatAvatarIconSwitcher() {
        Lazy lazy = this.f38449h;
        KProperty kProperty = f38442a[0];
        return (ViewSwitcher) lazy.getValue();
    }

    private final View getFeedChatBubble() {
        Lazy lazy = this.f38454m;
        KProperty kProperty = f38442a[5];
        return (View) lazy.getValue();
    }

    private final TextView getFeedChatMessage() {
        Lazy lazy = this.f38452k;
        KProperty kProperty = f38442a[3];
        return (TextView) lazy.getValue();
    }

    private final ViewFlipper getFeedChatStatusSwitcher() {
        Lazy lazy = this.f38455n;
        KProperty kProperty = f38442a[6];
        return (ViewFlipper) lazy.getValue();
    }

    private final TextView getFeedChatTimestamp() {
        Lazy lazy = this.f38453l;
        KProperty kProperty = f38442a[4];
        return (TextView) lazy.getValue();
    }

    private final View getFeedSendMessageButton() {
        Lazy lazy = this.f38451j;
        KProperty kProperty = f38442a[2];
        return (View) lazy.getValue();
    }

    public FeedCommentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
    public final C9542a getFeedComposerProvider$Tinder_release() {
        C9542a c9542a = this.f38444b;
        if (c9542a == null) {
            C2668g.b("feedComposerProvider");
        }
        return c9542a;
    }

    public final void setFeedComposerProvider$Tinder_release(@NotNull C9542a c9542a) {
        C2668g.b(c9542a, "<set-?>");
        this.f38444b = c9542a;
    }

    @NotNull
    public final C9482a getFeedCommentActionHandler$Tinder_release() {
        C9482a c9482a = this.f38445c;
        if (c9482a == null) {
            C2668g.b("feedCommentActionHandler");
        }
        return c9482a;
    }

    public final void setFeedCommentActionHandler$Tinder_release(@NotNull C9482a c9482a) {
        C2668g.b(c9482a, "<set-?>");
        this.f38445c = c9482a;
    }

    @NotNull
    public final C9496h getTimestampFormatter$Tinder_release() {
        C9496h c9496h = this.f38446d;
        if (c9496h == null) {
            C2668g.b("timestampFormatter");
        }
        return c9496h;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C9496h c9496h) {
        C2668g.b(c9496h, "<set-?>");
        this.f38446d = c9496h;
    }

    @NotNull
    public final C9491c getRetrySpannableFormatter$Tinder_release() {
        C9491c c9491c = this.f38447e;
        if (c9491c == null) {
            C2668g.b("retrySpannableFormatter");
        }
        return c9491c;
    }

    public final void setRetrySpannableFormatter$Tinder_release(@NotNull C9491c c9491c) {
        C2668g.b(c9491c, "<set-?>");
        this.f38447e = c9491c;
    }

    @NotNull
    public final C9467d getPresenter$Tinder_release() {
        C9467d c9467d = this.f38448f;
        if (c9467d == null) {
            C2668g.b("presenter");
        }
        return c9467d;
    }

    public final void setPresenter$Tinder_release(@NotNull C9467d c9467d) {
        C2668g.b(c9467d, "<set-?>");
        this.f38448f = c9467d;
    }

    /* renamed from: a */
    public final void m47666a(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "feedItem");
        m47660b((ActivityFeedViewModel) activityFeedViewModel);
        m47658a(activityFeedViewModel.mo11144f());
        m47661b(activityFeedViewModel.mo11144f());
        m47662c(activityFeedViewModel);
        m47659a(activityFeedViewModel.getId());
    }

    /* renamed from: a */
    private final void m47659a(String str) {
        Subscription subscription = this.f38463v;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        C9542a c9542a = this.f38444b;
        if (c9542a == null) {
            C2668g.b("feedComposerProvider");
        }
        this.f38463v = c9542a.m39817a().f(new C13278e(str)).j(C5707b.a(this)).d(new C14018f(this));
    }

    /* renamed from: b */
    private final void m47660b(ActivityFeedViewModel<?> activityFeedViewModel) {
        getFeedSendMessageButton().setOnClickListener(new C9529c(this, activityFeedViewModel, activityFeedViewModel.mo11144f()));
    }

    /* renamed from: a */
    private final void m47658a(FeedCommentViewModel feedCommentViewModel) {
        getFeedChatAvatarIconSwitcher().setDisplayedChild(feedCommentViewModel == null ? null : true);
    }

    /* renamed from: b */
    private final void m47661b(FeedCommentViewModel feedCommentViewModel) {
        if ((feedCommentViewModel != null ? feedCommentViewModel.m39793e() : null) != null) {
            getFeedChatAvatar().setAvatars(new String[]{feedCommentViewModel != null ? feedCommentViewModel.m39793e() : null});
        } else {
            getFeedChatAvatar().c();
        }
    }

    /* renamed from: c */
    private final void m47662c(ActivityFeedViewModel<?> activityFeedViewModel) {
        FeedCommentViewModel f = activityFeedViewModel.mo11144f();
        if (f == null) {
            getFeedChatBubble().setVisibility(8);
            getFeedChatMessage().setText((CharSequence) null);
            return;
        }
        getFeedChatBubble().setVisibility(0);
        getFeedChatMessage().setText(f.m39790b());
        switch (C9534c.f31900a[f.m39792d().ordinal()]) {
            case 1:
                m47656a();
                return;
            case 2:
                m47663d(activityFeedViewModel);
                return;
            case 3:
                m47664e(activityFeedViewModel);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m47656a() {
        getFeedChatTimestamp().setText((CharSequence) null);
        getFeedChatTimestamp().setVisibility(8);
        getFeedChatStatusSwitcher().setDisplayedChild(0);
        getFeedChatBubble().setBackgroundResource(R.drawable.feed_message_bubble_compose);
        getFeedChatMessage().setTextColor(this.f38456o);
        getFeedChatBubble().setOnClickListener(null);
    }

    /* renamed from: d */
    private final void m47663d(ActivityFeedViewModel<?> activityFeedViewModel) {
        C9496h c9496h = this.f38446d;
        if (c9496h == null) {
            C2668g.b("timestampFormatter");
        }
        Context context = getContext();
        C2668g.a(context, "context");
        FeedCommentViewModel f = activityFeedViewModel.mo11144f();
        if (f == null) {
            throw new IllegalStateException("feedCommentViewModel cannot be null".toString());
        }
        C9490a c9490a = new C9490a(C15811g.a(this.f38461t, Integer.valueOf(R.color.white)), C15811g.a(c9496h.m39727a(context, f.m39791c()), Integer.valueOf(R.color.white)), R.drawable.circle_small_white);
        TextView feedChatTimestamp = getFeedChatTimestamp();
        C9491c c9491c = this.f38447e;
        if (c9491c == null) {
            C2668g.b("retrySpannableFormatter");
        }
        Context context2 = getContext();
        C2668g.a(context2, "context");
        feedChatTimestamp.setText(c9491c.m39678a(context2, c9490a));
        getFeedChatTimestamp().setVisibility(0);
        getFeedChatTimestamp().setTextColor(this.f38458q);
        getFeedChatStatusSwitcher().setDisplayedChild(1);
        getFeedChatBubble().setBackgroundResource(R.drawable.feed_message_bubble_sent);
        getFeedChatMessage().setTextColor(this.f38457p);
        getFeedChatBubble().setOnClickListener(new C9530d(this, activityFeedViewModel));
    }

    /* renamed from: e */
    private final void m47664e(ActivityFeedViewModel<?> activityFeedViewModel) {
        C9490a c9490a = new C9490a(C15811g.a(this.f38460s, Integer.valueOf(R.color.tinder_accent)), C15811g.a(this.f38462u, Integer.valueOf(R.color.light_grey2)), R.drawable.circle_small_grey);
        TextView feedChatTimestamp = getFeedChatTimestamp();
        C9491c c9491c = this.f38447e;
        if (c9491c == null) {
            C2668g.b("retrySpannableFormatter");
        }
        Context context = getContext();
        C2668g.a(context, "context");
        feedChatTimestamp.setText(c9491c.m39678a(context, c9490a));
        getFeedChatTimestamp().setVisibility(0);
        getFeedChatTimestamp().setTextColor(this.f38459r);
        getFeedChatStatusSwitcher().setDisplayedChild(2);
        getFeedChatBubble().setBackgroundResource(R.drawable.feed_message_bubble_compose);
        getFeedChatMessage().setTextColor(this.f38456o);
        getFeedChatBubble().setOnClickListener(new C9528b(this, activityFeedViewModel));
    }

    /* renamed from: f */
    private final void m47665f(ActivityFeedViewModel<?> activityFeedViewModel) {
        FeedCommentViewModel f = activityFeedViewModel.mo11144f();
        if (f == null) {
            throw new IllegalStateException("feedItem.feedCommentViewModel cannot be null".toString());
        }
        activityFeedViewModel = C19301m.b(new Pair[]{C15811g.a(Integer.valueOf(17039361), new FeedCommentView$showRetryDeleteDialog$actions$1(this, f, activityFeedViewModel)), C15811g.a(Integer.valueOf(R.string.retry), new FeedCommentView$showRetryDeleteDialog$actions$2(this, activityFeedViewModel, f)), C15811g.a(Integer.valueOf(R.string.delete), new FeedCommentView$showRetryDeleteDialog$actions$3(this, f, activityFeedViewModel))});
        Builder onDismissListener = new Builder(getContext()).setOnDismissListener(new C9531g(this, f));
        Iterable<Pair> iterable = (Iterable) activityFeedViewModel;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (Pair a : iterable) {
            arrayList.add(au.a(this, ((Number) a.a()).intValue(), new String[0]));
        }
        Object[] toArray = ((List) arrayList).toArray(new String[0]);
        if (toArray == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        onDismissListener.setItems((CharSequence[]) toArray, new C9532h(activityFeedViewModel)).show();
        activityFeedViewModel = this.f38445c;
        if (activityFeedViewModel == null) {
            C2668g.b("feedCommentActionHandler");
        }
        String b = f.m39790b();
        activityFeedViewModel.m39662a(f.m39794f(), f.m39789a(), b);
    }
}
