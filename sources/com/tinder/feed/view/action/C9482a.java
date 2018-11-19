package com.tinder.feed.view.action;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.tinder.R;
import com.tinder.analytics.chat.Origin;
import com.tinder.chat.activity.C8406b;
import com.tinder.chat.analytics.C10542z;
import com.tinder.chat.analytics.C10542z.C8439a;
import com.tinder.chat.analytics.ab;
import com.tinder.chat.analytics.ab.C8415a;
import com.tinder.chat.analytics.ac;
import com.tinder.chat.analytics.ac.C8416a;
import com.tinder.chat.analytics.ad;
import com.tinder.chat.analytics.ad.C8417a;
import com.tinder.domain.feed.ActivityFeedComment;
import com.tinder.domain.feed.usecase.DeleteFailedFeedComment;
import com.tinder.domain.feed.usecase.RetryFailedFeedComment;
import com.tinder.feed.analytics.InteractSource;
import com.tinder.feed.analytics.InteractType;
import com.tinder.feed.analytics.events.C11687a;
import com.tinder.feed.analytics.events.C11687a.C9435a;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.profile.p365d.C14398a;
import com.tinder.utils.at;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J.\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aJ.\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aJ\u0016\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001aJ(\u0010\"\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aJ\"\u0010#\u001a\u00020\u00162\n\u0010$\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010&\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aR\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/feed/view/action/FeedCommentActionHandler;", "", "clipboardManager", "Landroid/content/ClipboardManager;", "retryFailedFeedComment", "Lcom/tinder/domain/feed/usecase/RetryFailedFeedComment;", "deleteFailedFeedComment", "Lcom/tinder/domain/feed/usecase/DeleteFailedFeedComment;", "chatIntentFactory", "Lcom/tinder/chat/activity/ChatIntentFactory;", "chatSendErrorOptionsEventDispatcher", "Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher;", "chatSelectSendErrorOptionsEventDispatcher", "Lcom/tinder/chat/analytics/ChatSelectSendErrorOptionsEventDispatcher;", "chatSendMessageEventDispatcher", "Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher;", "chatSendMessageErrorEventDispatcher", "Lcom/tinder/chat/analytics/ChatSendMessageErrorEventDispatcher;", "addFeedInteractEvent", "Lcom/tinder/feed/analytics/events/AddFeedInteractEvent;", "(Landroid/content/ClipboardManager;Lcom/tinder/domain/feed/usecase/RetryFailedFeedComment;Lcom/tinder/domain/feed/usecase/DeleteFailedFeedComment;Lcom/tinder/chat/activity/ChatIntentFactory;Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher;Lcom/tinder/chat/analytics/ChatSelectSendErrorOptionsEventDispatcher;Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher;Lcom/tinder/chat/analytics/ChatSendMessageErrorEventDispatcher;Lcom/tinder/feed/analytics/events/AddFeedInteractEvent;)V", "onCopyComment", "", "context", "Landroid/content/Context;", "activityId", "", "position", "", "matchId", "message", "onDelete", "feedItemId", "onOpenChat", "onOptionsDismiss", "onRetry", "feedItem", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "onRetryDialogShown", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.action.a */
public final class C9482a {
    /* renamed from: a */
    private final ClipboardManager f31792a;
    /* renamed from: b */
    private final RetryFailedFeedComment f31793b;
    /* renamed from: c */
    private final DeleteFailedFeedComment f31794c;
    /* renamed from: d */
    private final C8406b f31795d;
    /* renamed from: e */
    private final ab f31796e;
    /* renamed from: f */
    private final C10542z f31797f;
    /* renamed from: g */
    private final ad f31798g;
    /* renamed from: h */
    private final ac f31799h;
    /* renamed from: i */
    private final C11687a f31800i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.action.a$a */
    static final class C14008a implements Action0 {
        /* renamed from: a */
        public static final C14008a f44173a = new C14008a();

        C14008a() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.action.a$b */
    static final class C14009b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ String f44174a;

        C14009b(String str) {
            this.f44174a = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53545a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53545a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error deleting feed comment ");
            stringBuilder.append(this.f44174a);
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "comment", "Lcom/tinder/domain/feed/ActivityFeedComment;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.action.a$c */
    static final class C14010c<T> implements Action1<ActivityFeedComment> {
        /* renamed from: a */
        final /* synthetic */ C9482a f44175a;
        /* renamed from: b */
        final /* synthetic */ String f44176b;
        /* renamed from: c */
        final /* synthetic */ String f44177c;
        /* renamed from: d */
        final /* synthetic */ String f44178d;

        C14010c(C9482a c9482a, String str, String str2, String str3) {
            this.f44175a = c9482a;
            this.f44176b = str;
            this.f44177c = str2;
            this.f44178d = str3;
        }

        public /* synthetic */ void call(Object obj) {
            m53546a((ActivityFeedComment) obj);
        }

        /* renamed from: a */
        public final void m53546a(ActivityFeedComment activityFeedComment) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Retried comment. State=");
            stringBuilder.append(activityFeedComment.getState());
            C0001a.b(stringBuilder.toString(), new Object[0]);
            String str;
            switch (C9483b.f31801a[activityFeedComment.getState().ordinal()]) {
                case 1:
                    activityFeedComment = this.f44175a.f31798g;
                    str = this.f44176b;
                    if (str == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    activityFeedComment.m42567a(new C8417a(str, this.f44177c, 3, this.f44178d, "activity", true, true, null, null, 384, null));
                    return;
                case 2:
                    return;
                case 3:
                    activityFeedComment = this.f44175a.f31799h;
                    str = this.f44176b;
                    if (str == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    activityFeedComment.m42565a(new C8416a(str, 3, this.f44177c, this.f44178d, true, null, null, 96, null));
                    return;
                default:
                    return;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.action.a$d */
    static final class C14011d<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ String f44179a;

        C14011d(String str) {
            this.f44179a = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53547a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53547a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error retrying feed comment ");
            stringBuilder.append(this.f44179a);
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public C9482a(@NotNull ClipboardManager clipboardManager, @NotNull RetryFailedFeedComment retryFailedFeedComment, @NotNull DeleteFailedFeedComment deleteFailedFeedComment, @NotNull C8406b c8406b, @NotNull ab abVar, @NotNull C10542z c10542z, @NotNull ad adVar, @NotNull ac acVar, @NotNull C11687a c11687a) {
        C2668g.b(clipboardManager, "clipboardManager");
        C2668g.b(retryFailedFeedComment, "retryFailedFeedComment");
        C2668g.b(deleteFailedFeedComment, "deleteFailedFeedComment");
        C2668g.b(c8406b, "chatIntentFactory");
        C2668g.b(abVar, "chatSendErrorOptionsEventDispatcher");
        C2668g.b(c10542z, "chatSelectSendErrorOptionsEventDispatcher");
        C2668g.b(adVar, "chatSendMessageEventDispatcher");
        C2668g.b(acVar, "chatSendMessageErrorEventDispatcher");
        C2668g.b(c11687a, "addFeedInteractEvent");
        this.f31792a = clipboardManager;
        this.f31793b = retryFailedFeedComment;
        this.f31794c = deleteFailedFeedComment;
        this.f31795d = c8406b;
        this.f31796e = abVar;
        this.f31797f = c10542z;
        this.f31798g = adVar;
        this.f31799h = acVar;
        this.f31800i = c11687a;
    }

    /* renamed from: a */
    public final void m39658a(@NotNull Context context, @NotNull String str, @NotNull Number number, @NotNull String str2, @NotNull String str3) {
        C2668g.b(context, "context");
        C2668g.b(str, "activityId");
        C2668g.b(number, "position");
        C2668g.b(str2, "matchId");
        C2668g.b(str3, "message");
        context = C14398a.a(context);
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
        }
        CharSequence charSequence = str3;
        this.f31792a.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
        at.f47621a.b(activity, R.string.copied);
        this.f31797f.m42636a(new C8439a(str2, 3, str3, 0, str, number, "copy", true));
    }

    /* renamed from: a */
    public final void m39659a(@NotNull ActivityFeedViewModel<?> activityFeedViewModel, @NotNull String str, @NotNull Number number) {
        C2668g.b(activityFeedViewModel, "feedItem");
        C2668g.b(str, "message");
        C2668g.b(number, "position");
        String id = activityFeedViewModel.getId();
        String a = activityFeedViewModel.mo11139a();
        String b = activityFeedViewModel.mo11140b();
        this.f31800i.m47502a(new C9435a(activityFeedViewModel, InteractType.SEND_MESSAGE, InteractSource.RESEND));
        this.f31793b.execute(id).b(Schedulers.io()).a(new C14010c(this, b, str, a), new C14011d(id));
        this.f31797f.m42636a(new C8439a(b, 3, str, 0, a, number, "resend", true));
    }

    /* renamed from: a */
    public final void m39661a(@NotNull String str, @NotNull String str2, @NotNull Number number, @NotNull String str3, @NotNull String str4) {
        C2668g.b(str, "feedItemId");
        C2668g.b(str2, "activityId");
        C2668g.b(number, "position");
        C2668g.b(str3, "matchId");
        C2668g.b(str4, "message");
        this.f31794c.execute(str).a(Schedulers.io()).a(C14008a.f44173a, new C14009b(str));
        this.f31797f.m42636a(new C8439a(str3, 3, str4, 0, str2, number, "delete", true));
    }

    /* renamed from: a */
    public final void m39657a(@NotNull Context context, @NotNull String str) {
        C2668g.b(context, "context");
        C2668g.b(str, "matchId");
        context.startActivity(this.f31795d.m35881a(context, Origin.FEED, str));
    }

    /* renamed from: a */
    public final void m39662a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "activityId");
        C2668g.b(str3, "message");
        this.f31796e.m42563a(new C8415a(str, 3, str3, 0, str2, null, null, 96, null));
    }

    /* renamed from: a */
    public final void m39660a(@NotNull String str, @Nullable Number number, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "activityId");
        C2668g.b(str2, "matchId");
        C2668g.b(str3, "message");
        this.f31797f.m42636a(new C8439a(str2, 3, str3, 0, str, number, "background", true));
    }
}
