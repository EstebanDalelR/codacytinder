package com.tinder.chat.view.message;

import android.graphics.Point;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.chat.view.action.ActivityMessageMediaUnavailableHandlerWithViewModel;
import com.tinder.chat.view.action.C10587l;
import com.tinder.chat.view.action.C8458c;
import com.tinder.chat.view.action.FullscreenImageDisplayAction.C8456a;
import com.tinder.chat.view.model.C10636b;
import com.tinder.chat.view.model.C12747i;
import com.tinder.common.feed.interfaces.OnFeedMediaContentLoadedListener;
import com.tinder.common.feed.view.C8538a;
import com.tinder.common.feed.view.FeedImageContentView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000~\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001d\u0010\b\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\u0002\b\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0002\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0015H\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0015H\u0000\u001a\u001c\u0010\u0012\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0015H\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0015H\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0015H\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0015H\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u001dH\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u001dH\u0000\u001a\u001c\u0010\u0012\u001a\u00020\u0001*\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020 2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u001dH\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020!2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u001dH\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020\"2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u001dH\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020#2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u001dH\u0000¨\u0006$"}, d2 = {"bind", "", "imageContentView", "Lcom/tinder/common/feed/view/FeedImageContentView;", "activityMessageViewModel", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "imageClickHandler", "Lcom/tinder/chat/view/action/ActivityMessageImageClickHandler;", "extractImageViewModels", "Lkotlin/Function1;", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "Lkotlin/ExtensionFunctionType;", "mediaUnavailableHandler", "Lcom/tinder/chat/view/action/ActivityMessageMediaUnavailableHandlerWithViewModel;", "getImageViewLeftAndTop", "Landroid/graphics/Point;", "imageView", "bindImageContentView", "Lcom/tinder/chat/view/message/InboundFeedInstagramConnectView;", "viewModel", "Lcom/tinder/chat/view/action/InboundActivityMessageMediaUnavailableHandler;", "Lcom/tinder/chat/view/message/InboundFeedInstagramImageView;", "Lcom/tinder/chat/view/message/InboundFeedNewMatchView;", "Lcom/tinder/chat/view/message/InboundFeedProfileAddPhotoView;", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeBioView;", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeSchoolView;", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeWorkView;", "Lcom/tinder/chat/view/message/OutboundFeedInstagramConnectView;", "Lcom/tinder/chat/view/action/OutboundActivityMessageMediaUnavailableHandler;", "Lcom/tinder/chat/view/message/OutboundFeedInstagramImageView;", "Lcom/tinder/chat/view/message/OutboundFeedNewMatchView;", "Lcom/tinder/chat/view/message/OutboundFeedProfileAddPhotoView;", "Lcom/tinder/chat/view/message/OutboundFeedProfileChangeBioView;", "Lcom/tinder/chat/view/message/OutboundFeedProfileChangeSchoolView;", "Lcom/tinder/chat/view/message/OutboundFeedProfileChangeWorkView;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
public final class ac {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/tinder/chat/view/message/MessageViewImageBindingExtensionsKt$bind$onContentLoadedListener$1", "Lcom/tinder/common/feed/interfaces/OnFeedMediaContentLoadedListener;", "(Lcom/tinder/chat/view/action/ActivityMessageMediaUnavailableHandlerWithViewModel;Lcom/tinder/chat/view/model/ActivityMessageViewModel;Lcom/tinder/common/feed/view/FeedImageContentView;Ljava/util/List;Lcom/tinder/chat/view/action/ActivityMessageImageClickHandler;)V", "onContentLoaded", "", "onErrorLoadingContent", "url", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.ac$a */
    public static final class C10600a implements OnFeedMediaContentLoadedListener {
        /* renamed from: a */
        final /* synthetic */ ActivityMessageMediaUnavailableHandlerWithViewModel f34493a;
        /* renamed from: b */
        final /* synthetic */ C12747i f34494b;
        /* renamed from: c */
        final /* synthetic */ FeedImageContentView f34495c;
        /* renamed from: d */
        final /* synthetic */ List f34496d;
        /* renamed from: e */
        final /* synthetic */ C8458c f34497e;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.chat.view.message.ac$a$a */
        static final class C8485a implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C10600a f30177a;

            C8485a(C10600a c10600a) {
                this.f30177a = c10600a;
            }

            public final void onClick(View view) {
                view = C8538a.m36514a(this.f30177a.f34496d);
                view = view != null ? view.m42938c() : null;
                if (view == null) {
                    view = "";
                }
                this.f30177a.f34497e.m36198a(this.f30177a.f34494b, new C8456a(view, (float) this.f30177a.f34495c.getWidth(), (float) this.f30177a.f34495c.getHeight(), ac.m36265b(this.f30177a.f34495c)));
            }
        }

        C10600a(ActivityMessageMediaUnavailableHandlerWithViewModel activityMessageMediaUnavailableHandlerWithViewModel, C12747i c12747i, FeedImageContentView feedImageContentView, List list, C8458c c8458c) {
            this.f34493a = activityMessageMediaUnavailableHandlerWithViewModel;
            this.f34494b = c12747i;
            this.f34495c = feedImageContentView;
            this.f34496d = list;
            this.f34497e = c8458c;
        }

        public void onErrorLoadingContent(@NotNull String str) {
            C2668g.b(str, "url");
            ActivityMessageMediaUnavailableHandlerWithViewModel activityMessageMediaUnavailableHandlerWithViewModel = this.f34493a;
            if (activityMessageMediaUnavailableHandlerWithViewModel != null) {
                activityMessageMediaUnavailableHandlerWithViewModel.onMediaUnavailable(this.f34494b, str);
            }
        }

        public void onContentLoaded() {
            this.f34495c.setOnClickListener(new C8485a(this));
        }
    }

    /* renamed from: a */
    public static final void m36257a(@NotNull C10608c c10608c, @NotNull C12747i c12747i, @NotNull C8458c c8458c, @NotNull C10587l c10587l) {
        C2668g.b(c10608c, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        C2668g.b(c10587l, "mediaUnavailableHandler");
        m36263a(c10608c.getImageContentView$Tinder_release(), c12747i, c8458c, MessageViewImageBindingExtensionsKt$bindImageContentView$1.f43686a, c10587l);
    }

    /* renamed from: a */
    public static final void m36258a(@NotNull C10618i c10618i, @NotNull C12747i c12747i, @NotNull C8458c c8458c) {
        C2668g.b(c10618i, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        m36264a(c10618i.getFeedNewMatchContentView$Tinder_release(), c12747i, c8458c, (Function1) MessageViewImageBindingExtensionsKt$bindImageContentView$2.f43687a, null, 16, null);
    }

    /* renamed from: a */
    public static final void m36259a(@NotNull C10620k c10620k, @NotNull C12747i c12747i, @NotNull C8458c c8458c, @NotNull C10587l c10587l) {
        C2668g.b(c10620k, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        C2668g.b(c10587l, "mediaUnavailableHandler");
        m36263a(c10620k.getImageContentView$Tinder_release(), c12747i, c8458c, MessageViewImageBindingExtensionsKt$bindImageContentView$3.f43688a, c10587l);
    }

    /* renamed from: a */
    public static final void m36260a(@NotNull C10622m c10622m, @NotNull C12747i c12747i, @NotNull C8458c c8458c, @NotNull C10587l c10587l) {
        C2668g.b(c10622m, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        C2668g.b(c10587l, "mediaUnavailableHandler");
        m36263a(c10622m.getFeedProfileChangeBioContentView$Tinder_release(), c12747i, c8458c, MessageViewImageBindingExtensionsKt$bindImageContentView$4.f43689a, c10587l);
    }

    /* renamed from: a */
    public static final void m36262a(@NotNull C10626q c10626q, @NotNull C12747i c12747i, @NotNull C8458c c8458c, @NotNull C10587l c10587l) {
        C2668g.b(c10626q, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        C2668g.b(c10587l, "mediaUnavailableHandler");
        m36263a(c10626q.getFeedProfileChangeWorkContentView$Tinder_release(), c12747i, c8458c, MessageViewImageBindingExtensionsKt$bindImageContentView$5.f43690a, c10587l);
    }

    /* renamed from: a */
    public static final void m36261a(@NotNull C10624o c10624o, @NotNull C12747i c12747i, @NotNull C8458c c8458c, @NotNull C10587l c10587l) {
        C2668g.b(c10624o, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        C2668g.b(c10587l, "mediaUnavailableHandler");
        m36263a(c10624o.getFeedProfileChangeSchoolContentView$Tinder_release(), c12747i, c8458c, MessageViewImageBindingExtensionsKt$bindImageContentView$6.f43691a, c10587l);
    }

    /* renamed from: a */
    public static final void m36254a(@NotNull au auVar, @NotNull C12747i c12747i, @NotNull C8458c c8458c, @NotNull com.tinder.chat.view.action.ac acVar) {
        C2668g.b(auVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        C2668g.b(acVar, "mediaUnavailableHandler");
        m36263a(auVar.getFeedProfileChangeBioContentView$Tinder_release(), c12747i, c8458c, MessageViewImageBindingExtensionsKt$bindImageContentView$7.f43692a, acVar);
    }

    /* renamed from: a */
    public static final void m36256a(@NotNull ay ayVar, @NotNull C12747i c12747i, @NotNull C8458c c8458c, @NotNull com.tinder.chat.view.action.ac acVar) {
        C2668g.b(ayVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        C2668g.b(acVar, "mediaUnavailableHandler");
        m36263a(ayVar.getFeedProfileChangeWorkContentView$Tinder_release(), c12747i, c8458c, MessageViewImageBindingExtensionsKt$bindImageContentView$8.f43693a, acVar);
    }

    /* renamed from: a */
    public static final void m36255a(@NotNull aw awVar, @NotNull C12747i c12747i, @NotNull C8458c c8458c, @NotNull com.tinder.chat.view.action.ac acVar) {
        C2668g.b(awVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        C2668g.b(acVar, "mediaUnavailableHandler");
        m36263a(awVar.getFeedProfileChangeSchoolContentView$Tinder_release(), c12747i, c8458c, MessageViewImageBindingExtensionsKt$bindImageContentView$9.f43694a, acVar);
    }

    /* renamed from: a */
    public static final void m36249a(@NotNull C10599a c10599a, @NotNull C12747i c12747i, @NotNull C8458c c8458c, @NotNull C10587l c10587l) {
        C2668g.b(c10599a, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        C2668g.b(c10587l, "mediaUnavailableHandler");
        m36263a(c10599a.getImageContentView$Tinder_release(), c12747i, c8458c, MessageViewImageBindingExtensionsKt$bindImageContentView$10.f43681a, c10587l);
    }

    /* renamed from: a */
    public static final void m36250a(@NotNull ai aiVar, @NotNull C12747i c12747i, @NotNull C8458c c8458c, @NotNull com.tinder.chat.view.action.ac acVar) {
        C2668g.b(aiVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        C2668g.b(acVar, "mediaUnavailableHandler");
        m36263a(aiVar.getImageContentView$Tinder_release(), c12747i, c8458c, MessageViewImageBindingExtensionsKt$bindImageContentView$11.f43682a, acVar);
    }

    /* renamed from: a */
    public static final void m36253a(@NotNull as asVar, @NotNull C12747i c12747i, @NotNull C8458c c8458c, @NotNull com.tinder.chat.view.action.ac acVar) {
        C2668g.b(asVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        C2668g.b(acVar, "mediaUnavailableHandler");
        m36263a(asVar.getImageContentView$Tinder_release(), c12747i, c8458c, MessageViewImageBindingExtensionsKt$bindImageContentView$12.f43683a, acVar);
    }

    /* renamed from: a */
    public static final void m36252a(@NotNull aq aqVar, @NotNull C12747i c12747i, @NotNull C8458c c8458c) {
        C2668g.b(aqVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        m36264a(aqVar.getFeedNewMatchContentView$Tinder_release(), c12747i, c8458c, (Function1) MessageViewImageBindingExtensionsKt$bindImageContentView$13.f43684a, null, 16, null);
    }

    /* renamed from: a */
    public static final void m36251a(@NotNull ak akVar, @NotNull C12747i c12747i, @NotNull C8458c c8458c, @NotNull com.tinder.chat.view.action.ac acVar) {
        C2668g.b(akVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8458c, "imageClickHandler");
        C2668g.b(acVar, "mediaUnavailableHandler");
        m36263a(akVar.getImageContentView$Tinder_release(), c12747i, c8458c, MessageViewImageBindingExtensionsKt$bindImageContentView$14.f43685a, acVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m36264a(FeedImageContentView feedImageContentView, C12747i c12747i, C8458c c8458c, Function1 function1, ActivityMessageMediaUnavailableHandlerWithViewModel activityMessageMediaUnavailableHandlerWithViewModel, int i, Object obj) {
        if ((i & 16) != 0) {
            activityMessageMediaUnavailableHandlerWithViewModel = null;
        }
        m36263a(feedImageContentView, c12747i, c8458c, function1, activityMessageMediaUnavailableHandlerWithViewModel);
    }

    /* renamed from: a */
    private static final void m36263a(FeedImageContentView feedImageContentView, C12747i c12747i, C8458c c8458c, Function1<? super C12747i, ? extends List<C10636b>> function1, ActivityMessageMediaUnavailableHandlerWithViewModel activityMessageMediaUnavailableHandlerWithViewModel) {
        List list = (List) function1.invoke(c12747i);
        feedImageContentView.setOnClickListener(null);
        feedImageContentView.mo11004a(list, new C10600a(activityMessageMediaUnavailableHandlerWithViewModel, c12747i, feedImageContentView, list, c8458c));
    }

    /* renamed from: b */
    private static final Point m36265b(FeedImageContentView feedImageContentView) {
        int[] iArr = new int[2];
        feedImageContentView.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }
}
