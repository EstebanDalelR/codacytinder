package com.tinder.chat.presenter;

import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory.IntegrationAction;
import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory.IntegrationFrom;
import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory.IntegrationPartner;
import com.tinder.account.analytics.C3874a;
import com.tinder.account.analytics.C3874a.C2613a;
import com.tinder.bitmoji.BitmojiAuthStatus;
import com.tinder.bitmoji.C10377f;
import com.tinder.bitmoji.C10378h;
import com.tinder.bitmoji.C10380k;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory.TutorialAction;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory.TutorialContext;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory.TutorialName;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory.TutorialType;
import com.tinder.bitmoji.analytics.C10370a;
import com.tinder.bitmoji.analytics.C10370a.C8322a;
import com.tinder.bitmoji.analytics.C10374c;
import com.tinder.chat.analytics.ac;
import com.tinder.chat.analytics.ac.C8416a;
import com.tinder.chat.analytics.ad;
import com.tinder.chat.analytics.ad.C8417a;
import com.tinder.chat.analytics.af;
import com.tinder.chat.analytics.af.C8418a;
import com.tinder.chat.analytics.al;
import com.tinder.chat.analytics.as;
import com.tinder.chat.analytics.as.C8423a;
import com.tinder.chat.analytics.at;
import com.tinder.chat.analytics.au;
import com.tinder.chat.analytics.au.C8424a;
import com.tinder.chat.analytics.av;
import com.tinder.chat.analytics.av.C8425a;
import com.tinder.chat.target.ChatInputBoxTarget;
import com.tinder.chat.view.model.C8498n;
import com.tinder.common.provider.C8550g;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.visitor.MatchNameVisitor;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.domain.message.DeliveryStatus;
import com.tinder.domain.message.Gif;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.Image;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.MessageDeliveryStatusUpdatesProvider;
import com.tinder.domain.message.TextMessage;
import com.tinder.domain.message.usecase.LoadGifs;
import com.tinder.domain.message.usecase.SendGifMessage;
import com.tinder.domain.message.usecase.SendGifMessage.Request;
import com.tinder.domain.message.usecase.SendImageMessage;
import com.tinder.domain.message.usecase.SendTextMessage;
import com.tinder.domain.profile.model.Tutorial.BitmojiTooltip;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.pushnotifications.view.InAppNotificationView.Listener;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.C3958c;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0002\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u000207\u0012\u0006\u00108\u001a\u000209\u0012\b\b\u0001\u0010:\u001a\u00020;\u0012\b\b\u0001\u0010<\u001a\u00020;\u0012\b\b\u0001\u0010=\u001a\u00020;¢\u0006\u0002\u0010>J\b\u0010K\u001a\u00020LH\u0007J\b\u0010M\u001a\u00020LH\u0002J\u0006\u0010N\u001a\u00020LJ\b\u0010O\u001a\u00020LH\u0002J\b\u0010P\u001a\u00020LH\u0002J\u0006\u0010Q\u001a\u00020LJ\b\u0010R\u001a\u00020LH\u0002J\r\u0010$\u001a\u00020LH\u0001¢\u0006\u0002\bSJ\u0006\u0010T\u001a\u00020LJ\u0006\u0010U\u001a\u00020LJ\u0006\u0010V\u001a\u00020LJ\u0006\u0010W\u001a\u00020LJ\u0016\u0010X\u001a\u00020L2\u0006\u0010Y\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020[J\u0006\u0010\\\u001a\u00020LJ\u000e\u0010]\u001a\u00020L2\u0006\u0010Y\u001a\u00020\u0003J\u0010\u0010^\u001a\u00020L2\u0006\u0010_\u001a\u00020`H\u0002J\u0010\u0010a\u001a\u00020L2\u0006\u0010b\u001a\u00020cH\u0002J&\u0010d\u001a\u00020L2\u0006\u0010e\u001a\u00020\u00032\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020g2\u0006\u0010i\u001a\u00020\u0003J\b\u0010j\u001a\u00020LH\u0002J\u0016\u0010\n\u001a\u00020L2\u0006\u0010Z\u001a\u00020[2\u0006\u0010k\u001a\u00020\u0003J&\u0010l\u001a\u00020L2\u0006\u0010Y\u001a\u00020\u00032\f\u0010m\u001a\b\u0012\u0004\u0012\u00020o0n2\u0006\u0010p\u001a\u00020qH\u0002J\u000e\u0010\b\u001a\u00020L2\u0006\u0010r\u001a\u00020\u0003J\b\u0010s\u001a\u00020LH\u0002J\b\u0010t\u001a\u00020LH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020;X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010BX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020;X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010BX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010BX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010E\u001a\u00020F8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006u"}, d2 = {"Lcom/tinder/chat/presenter/ChatInputBoxPresenter;", "", "matchId", "", "loadGifs", "Lcom/tinder/domain/message/usecase/LoadGifs;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "sendTextMessage", "Lcom/tinder/domain/message/usecase/SendTextMessage;", "sendGifMessage", "Lcom/tinder/domain/message/usecase/SendGifMessage;", "sendImageMessage", "Lcom/tinder/domain/message/usecase/SendImageMessage;", "todayDateProvider", "Lcom/tinder/common/provider/TodayDateProvider;", "messageDeliveryStatusUpdatesProvider", "Lcom/tinder/domain/message/MessageDeliveryStatusUpdatesProvider;", "chatTapTextInputDispatcher", "Lcom/tinder/chat/analytics/ChatTapTextInputDispatcher;", "gifSearchEventDispatcher", "Lcom/tinder/chat/analytics/GifSearchEventDispatcher;", "gifSearchHideEventDispatcher", "Lcom/tinder/chat/analytics/GifSearchHideEventDispatcher;", "gifSelectEventDispatcher", "Lcom/tinder/chat/analytics/GifSelectEventDispatcher;", "gifShownEventDispatcher", "Lcom/tinder/chat/analytics/GifShownEventDispatcher;", "chatSendMessageEventDispatcher", "Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher;", "chatSendMessageErrorEvent", "Lcom/tinder/chat/analytics/ChatSendMessageErrorEventDispatcher;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "matchNameVisitor", "Lcom/tinder/domain/match/model/visitor/MatchNameVisitor;", "observeBitmojiAuthStatus", "Lcom/tinder/bitmoji/ObserveBitmojiAuthStatus;", "tinderNotificationFactory", "Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;", "notificationDispatcher", "Lcom/tinder/pushnotifications/NotificationDispatcher;", "connectBitmoji", "Lcom/tinder/bitmoji/ConnectBitmoji;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "addAppTutorialEvent", "Lcom/tinder/bitmoji/analytics/AddAppTutorialEvent;", "addBitmojiInteractEvent", "Lcom/tinder/bitmoji/analytics/AddBitmojiInteractEvent;", "addAccountThirdPartyIntegrationEvent", "Lcom/tinder/account/analytics/AddAccountThirdPartyIntegrationEvent;", "checkUserBitmojiAvatarAvailable", "Lcom/tinder/bitmoji/CheckUserBitmojiAvatarAvailable;", "chatTapInputTypeEventDispatcher", "Lcom/tinder/chat/analytics/ChatTapInputTypeEventDispatcher;", "ioScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "delayScheduler", "(Ljava/lang/String;Lcom/tinder/domain/message/usecase/LoadGifs;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/domain/message/usecase/SendTextMessage;Lcom/tinder/domain/message/usecase/SendGifMessage;Lcom/tinder/domain/message/usecase/SendImageMessage;Lcom/tinder/common/provider/TodayDateProvider;Lcom/tinder/domain/message/MessageDeliveryStatusUpdatesProvider;Lcom/tinder/chat/analytics/ChatTapTextInputDispatcher;Lcom/tinder/chat/analytics/GifSearchEventDispatcher;Lcom/tinder/chat/analytics/GifSearchHideEventDispatcher;Lcom/tinder/chat/analytics/GifSelectEventDispatcher;Lcom/tinder/chat/analytics/GifShownEventDispatcher;Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher;Lcom/tinder/chat/analytics/ChatSendMessageErrorEventDispatcher;Lcom/tinder/domain/match/usecase/GetMatch;Lcom/tinder/domain/match/model/visitor/MatchNameVisitor;Lcom/tinder/bitmoji/ObserveBitmojiAuthStatus;Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;Lcom/tinder/pushnotifications/NotificationDispatcher;Lcom/tinder/bitmoji/ConnectBitmoji;Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;Lcom/tinder/bitmoji/analytics/AddAppTutorialEvent;Lcom/tinder/bitmoji/analytics/AddBitmojiInteractEvent;Lcom/tinder/account/analytics/AddAccountThirdPartyIntegrationEvent;Lcom/tinder/bitmoji/CheckUserBitmojiAvatarAvailable;Lcom/tinder/chat/analytics/ChatTapInputTypeEventDispatcher;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "bitmojiAuthStatusDisposableForInAppNotification", "Lio/reactivex/disposables/Disposable;", "gifSubscription", "Lrx/Subscription;", "matchNameSubscription", "messageDeliveryStatusSubscription", "target", "Lcom/tinder/chat/target/ChatInputBoxTarget;", "getTarget$Tinder_release", "()Lcom/tinder/chat/target/ChatInputBoxTarget;", "setTarget$Tinder_release", "(Lcom/tinder/chat/target/ChatInputBoxTarget;)V", "drop", "", "fetchMatchNameAndShowTooltip", "handleBitmojiSearchInFocus", "handleInAppErrorNotificationClicked", "hideReactionsControlIfFeatureDisabled", "logTextInputTapAnalyticsEvent", "markBitmojiTooltipSeen", "observeBitmojiAuthStatus$Tinder_release", "onBitmojiPickerOpen", "onBitmojiTooltipCancel", "onBitmojiTooltipClick", "onGifClose", "onGifLoad", "query", "gifInfo", "Lcom/tinder/chat/view/model/GifSelectorGifInfo;", "onGifOpen", "searchGif", "sendAppTutorialEvent", "action", "Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialAction;", "sendBitmojiConnectAnalyticsEvent", "integrationSuccess", "", "sendBitmojiImageMessage", "imageUrl", "width", "", "height", "fallbackMessage", "sendBitmojiInAppErrorNotification", "gifSearchQuery", "sendGifSearchEvent", "gifs", "", "Lcom/tinder/domain/message/Gif;", "searchDurationMs", "", "message", "setBitmojiDisplayState", "take", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.presenter.u */
public final class C8447u {
    /* renamed from: A */
    private final CheckTutorialViewed f30044A;
    /* renamed from: B */
    private final ConfirmTutorialsViewed f30045B;
    /* renamed from: C */
    private final C10370a f30046C;
    /* renamed from: D */
    private final C10374c f30047D;
    /* renamed from: E */
    private final C3874a f30048E;
    /* renamed from: F */
    private final C10377f f30049F;
    /* renamed from: G */
    private final af f30050G;
    /* renamed from: H */
    private final C15679f f30051H;
    /* renamed from: I */
    private final C15679f f30052I;
    /* renamed from: J */
    private final C15679f f30053J;
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public ChatInputBoxTarget f30054a;
    /* renamed from: b */
    private Subscription f30055b;
    /* renamed from: c */
    private Subscription f30056c;
    /* renamed from: d */
    private Subscription f30057d;
    /* renamed from: e */
    private Disposable f30058e;
    /* renamed from: f */
    private final String f30059f;
    /* renamed from: g */
    private final LoadGifs f30060g;
    /* renamed from: h */
    private final AbTestUtility f30061h;
    /* renamed from: i */
    private final SendTextMessage f30062i;
    /* renamed from: j */
    private final SendGifMessage f30063j;
    /* renamed from: k */
    private final SendImageMessage f30064k;
    /* renamed from: l */
    private final C8550g f30065l;
    /* renamed from: m */
    private final MessageDeliveryStatusUpdatesProvider f30066m;
    /* renamed from: n */
    private final al f30067n;
    /* renamed from: o */
    private final as f30068o;
    /* renamed from: p */
    private final at f30069p;
    /* renamed from: q */
    private final au f30070q;
    /* renamed from: r */
    private final av f30071r;
    /* renamed from: s */
    private final ad f30072s;
    /* renamed from: t */
    private final ac f30073t;
    /* renamed from: u */
    private final GetMatch f30074u;
    /* renamed from: v */
    private final MatchNameVisitor f30075v;
    /* renamed from: w */
    private final C10380k f30076w;
    /* renamed from: x */
    private final C14548a f30077x;
    /* renamed from: y */
    private final C14550a f30078y;
    /* renamed from: z */
    private final C10378h f30079z;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$b */
    static final class C10559b implements Action {
        /* renamed from: a */
        public static final C10559b f34312a = new C10559b();

        C10559b() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "authStatus", "Lcom/tinder/bitmoji/BitmojiAuthStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$c */
    static final class C10560c<T> implements Consumer<BitmojiAuthStatus> {
        /* renamed from: a */
        final /* synthetic */ C8447u f34313a;

        C10560c(C8447u c8447u) {
            this.f34313a = c8447u;
        }

        public /* synthetic */ void accept(Object obj) {
            m42645a((BitmojiAuthStatus) obj);
        }

        /* renamed from: a */
        public final void m42645a(BitmojiAuthStatus bitmojiAuthStatus) {
            if (bitmojiAuthStatus != null) {
                switch (C8448v.f30080a[bitmojiAuthStatus.ordinal()]) {
                    case 1:
                        this.f34313a.m36140l();
                        this.f34313a.m36130a(false);
                        return;
                    case 2:
                        this.f34313a.m36130a(true);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/chat/presenter/ChatInputBoxPresenter$sendBitmojiInAppErrorNotification$1", "Lcom/tinder/pushnotifications/view/InAppNotificationView$Listener;", "(Lcom/tinder/chat/presenter/ChatInputBoxPresenter;)V", "onInAppNotificationClicked", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$g */
    public static final class C10561g implements Listener {
        /* renamed from: a */
        final /* synthetic */ C8447u f34314a;

        C10561g(C8447u c8447u) {
            this.f34314a = c8447u;
        }

        public void onInAppNotificationClicked() {
            this.f34314a.m36141m();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$l */
    static final class C10562l<T> implements Predicate<TutorialViewStatus> {
        /* renamed from: a */
        public static final C10562l f34315a = new C10562l();

        C10562l() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m42646a((TutorialViewStatus) obj);
        }

        /* renamed from: a */
        public final boolean m42646a(@NotNull TutorialViewStatus tutorialViewStatus) {
            C2668g.b(tutorialViewStatus, "it");
            return tutorialViewStatus == TutorialViewStatus.UNSEEN ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$m */
    static final class C10563m<T> implements Consumer<TutorialViewStatus> {
        /* renamed from: a */
        final /* synthetic */ C8447u f34316a;

        C10563m(C8447u c8447u) {
            this.f34316a = c8447u;
        }

        public /* synthetic */ void accept(Object obj) {
            m42647a((TutorialViewStatus) obj);
        }

        /* renamed from: a */
        public final void m42647a(TutorialViewStatus tutorialViewStatus) {
            this.f34316a.m36145q();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "message", "Lcom/tinder/domain/message/Message;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$n */
    static final class C12737n<T, R> implements Func1<Message, Boolean> {
        /* renamed from: a */
        public static final C12737n f41070a = new C12737n();

        C12737n() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50115a((Message) obj));
        }

        /* renamed from: a */
        public final boolean m50115a(Message message) {
            return message.getDeliveryStatus() == DeliveryStatus.FAILED ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$a */
    static final class C13726a<T> implements Action1<Optional<Match>> {
        /* renamed from: a */
        final /* synthetic */ C8447u f43610a;

        C13726a(C8447u c8447u) {
            this.f43610a = c8447u;
        }

        public /* synthetic */ void call(Object obj) {
            m53257a((Optional) obj);
        }

        /* renamed from: a */
        public final void m53257a(Optional<Match> optional) {
            optional.a(new java8.util.function.Consumer<Match>() {
                public /* synthetic */ void accept(Object obj) {
                    m42644a((Match) obj);
                }

                /* renamed from: a */
                public final void m42644a(Match match) {
                    this.f43610a.m36146a().bindTooltipTextWithMatchName((String) match.accept(this.f43610a.f30075v));
                }
            }, new Runnable() {
                public final void run() {
                    this.f43610a.m36146a().bindTooltipTextNoMatchName();
                }
            });
            this.f43610a.m36146a().showBitmojiTooltip();
            this.f43610a.m36144p();
            this.f43610a.m36125a(TutorialAction.SHOW);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "gifs", "", "Lcom/tinder/domain/message/Gif;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$d */
    static final class C13727d<T> implements Action1<List<? extends Gif>> {
        /* renamed from: a */
        final /* synthetic */ C8447u f43611a;
        /* renamed from: b */
        final /* synthetic */ long f43612b;
        /* renamed from: c */
        final /* synthetic */ String f43613c;

        C13727d(C8447u c8447u, long j, String str) {
            this.f43611a = c8447u;
            this.f43612b = j;
            this.f43613c = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53258a((List) obj);
        }

        /* renamed from: a */
        public final void m53258a(List<Gif> list) {
            this.f43611a.m36146a().showGifs(list);
            DateTime b = this.f43611a.f30065l.m36535b();
            C2668g.a(b, "todayDateProvider.dateTime");
            long millis = b.getMillis() - this.f43612b;
            C8447u c8447u = this.f43611a;
            String str = this.f43613c;
            C2668g.a(list, "gifs");
            c8447u.m36129a(str, list, millis);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$e */
    static final class C13728e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13728e f43614a = new C13728e();

        C13728e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53259a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53259a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$f */
    static final class C13729f implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8447u f43615a;
        /* renamed from: b */
        final /* synthetic */ Image f43616b;

        C13729f(C8447u c8447u, Image image) {
            this.f43615a = c8447u;
            this.f43616b = image;
        }

        public final void call() {
            this.f43615a.f30072s.m42567a(new C8417a(this.f43615a.f30059f, "", 4, "", "bitmoji", false, false, this.f43616b.getSource(), this.f43616b.getUrl()));
            C0001a.b("Successfully send bitmoji message!", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$h */
    static final class C13730h implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8447u f43617a;
        /* renamed from: b */
        final /* synthetic */ String f43618b;
        /* renamed from: c */
        final /* synthetic */ Gif f43619c;
        /* renamed from: d */
        final /* synthetic */ C8498n f43620d;
        /* renamed from: e */
        final /* synthetic */ boolean f43621e;
        /* renamed from: f */
        final /* synthetic */ boolean f43622f;

        C13730h(C8447u c8447u, String str, Gif gif, C8498n c8498n, boolean z, boolean z2) {
            this.f43617a = c8447u;
            this.f43618b = str;
            this.f43619c = gif;
            this.f43620d = c8498n;
            this.f43621e = z;
            this.f43622f = z2;
        }

        public final void call() {
            this.f43617a.f30070q.m42604a(new C8424a(this.f43617a.f30059f, this.f43618b, this.f43619c.getId(), this.f43619c.getUrl(), this.f43620d.m36418b()));
            this.f43617a.f30072s.m42567a(new C8417a(this.f43617a.f30059f, "", 1, this.f43619c.getId(), "gif selector", this.f43621e, this.f43622f, null, null, 384, null));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Gif sent: ");
            stringBuilder.append(this.f43619c);
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$i */
    static final class C13731i<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13731i f43623a = new C13731i();

        C13731i() {
        }

        public /* synthetic */ void call(Object obj) {
            m53260a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53260a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$j */
    static final class C13732j implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8447u f43624a;
        /* renamed from: b */
        final /* synthetic */ String f43625b;

        C13732j(C8447u c8447u, String str) {
            this.f43624a = c8447u;
            this.f43625b = str;
        }

        public final void call() {
            this.f43624a.f30072s.m42567a(new C8417a(this.f43624a.f30059f, this.f43625b, 0, "", "input bar", false, false, null, null, 384, null));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$k */
    static final class C13733k<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13733k f43626a = new C13733k();

        C13733k() {
        }

        public /* synthetic */ void call(Object obj) {
            m53261a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53261a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "message", "Lcom/tinder/domain/message/Message;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.u$o */
    static final class C13734o<T> implements Action1<Message> {
        /* renamed from: a */
        final /* synthetic */ C8447u f43627a;

        C13734o(C8447u c8447u) {
            this.f43627a = c8447u;
        }

        public /* synthetic */ void call(Object obj) {
            m53262a((Message) obj);
        }

        /* renamed from: a */
        public final void m53262a(Message message) {
            String str;
            String str2;
            String str3;
            int i;
            String str4 = "";
            String str5 = (String) null;
            if (message instanceof TextMessage) {
                str = str4;
                str2 = str5;
                str3 = str2;
                i = 0;
            } else if (message instanceof GifMessage) {
                str = ((GifMessage) message).getGif().getId();
                str2 = str5;
                str3 = str2;
                i = 1;
            } else if (message instanceof ImageMessage) {
                ImageMessage imageMessage = (ImageMessage) message;
                String source = imageMessage.getImage().getSource();
                str = str4;
                str3 = imageMessage.getImage().getUrl();
                str2 = source;
                i = 4;
            } else {
                str = str4;
                str2 = str5;
                str3 = str2;
                i = -1;
            }
            this.f43627a.f30073t.m42565a(new C8416a(message.getMatchId(), i, message.getText(), str, false, str2, str3));
        }
    }

    @Inject
    public C8447u(@NotNull String str, @NotNull LoadGifs loadGifs, @NotNull AbTestUtility abTestUtility, @NotNull SendTextMessage sendTextMessage, @NotNull SendGifMessage sendGifMessage, @NotNull SendImageMessage sendImageMessage, @NotNull C8550g c8550g, @NotNull MessageDeliveryStatusUpdatesProvider messageDeliveryStatusUpdatesProvider, @NotNull al alVar, @NotNull as asVar, @NotNull at atVar, @NotNull au auVar, @NotNull av avVar, @NotNull ad adVar, @NotNull ac acVar, @NotNull GetMatch getMatch, @NotNull MatchNameVisitor matchNameVisitor, @NotNull C10380k c10380k, @NotNull C14548a c14548a, @NotNull C14550a c14550a, @NotNull C10378h c10378h, @NotNull CheckTutorialViewed checkTutorialViewed, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull C10370a c10370a, @NotNull C10374c c10374c, @NotNull C3874a c3874a, @NotNull C10377f c10377f, @NotNull af afVar, @NotNull @IoScheduler C15679f c15679f, @NotNull @MainThreadScheduler C15679f c15679f2, @NotNull @IoScheduler C15679f c15679f3) {
        C8447u c8447u = this;
        String str2 = str;
        LoadGifs loadGifs2 = loadGifs;
        AbTestUtility abTestUtility2 = abTestUtility;
        SendTextMessage sendTextMessage2 = sendTextMessage;
        SendGifMessage sendGifMessage2 = sendGifMessage;
        SendImageMessage sendImageMessage2 = sendImageMessage;
        C8550g c8550g2 = c8550g;
        MessageDeliveryStatusUpdatesProvider messageDeliveryStatusUpdatesProvider2 = messageDeliveryStatusUpdatesProvider;
        al alVar2 = alVar;
        as asVar2 = asVar;
        at atVar2 = atVar;
        au auVar2 = auVar;
        av avVar2 = avVar;
        ad adVar2 = adVar;
        ac acVar2 = acVar;
        GetMatch getMatch2 = getMatch;
        C2668g.b(str2, "matchId");
        C2668g.b(loadGifs2, "loadGifs");
        C2668g.b(abTestUtility2, "abTestUtility");
        C2668g.b(sendTextMessage2, "sendTextMessage");
        C2668g.b(sendGifMessage2, "sendGifMessage");
        C2668g.b(sendImageMessage2, "sendImageMessage");
        C2668g.b(c8550g2, "todayDateProvider");
        C2668g.b(messageDeliveryStatusUpdatesProvider2, "messageDeliveryStatusUpdatesProvider");
        C2668g.b(alVar2, "chatTapTextInputDispatcher");
        C2668g.b(asVar2, "gifSearchEventDispatcher");
        C2668g.b(atVar2, "gifSearchHideEventDispatcher");
        C2668g.b(auVar2, "gifSelectEventDispatcher");
        C2668g.b(avVar2, "gifShownEventDispatcher");
        C2668g.b(adVar2, "chatSendMessageEventDispatcher");
        C2668g.b(acVar2, "chatSendMessageErrorEvent");
        C2668g.b(getMatch, "getMatch");
        C2668g.b(matchNameVisitor, "matchNameVisitor");
        C2668g.b(c10380k, "observeBitmojiAuthStatus");
        C2668g.b(c14548a, "tinderNotificationFactory");
        C2668g.b(c14550a, "notificationDispatcher");
        C2668g.b(c10378h, "connectBitmoji");
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        C2668g.b(confirmTutorialsViewed, "confirmTutorialsViewed");
        C2668g.b(c10370a, "addAppTutorialEvent");
        C2668g.b(c10374c, "addBitmojiInteractEvent");
        C2668g.b(c3874a, "addAccountThirdPartyIntegrationEvent");
        C2668g.b(c10377f, "checkUserBitmojiAvatarAvailable");
        C2668g.b(afVar, "chatTapInputTypeEventDispatcher");
        C2668g.b(c15679f, "ioScheduler");
        C2668g.b(c15679f2, "mainThreadScheduler");
        C2668g.b(c15679f3, "delayScheduler");
        GetMatch getMatch3 = getMatch;
        this.f30059f = str2;
        this.f30060g = loadGifs2;
        this.f30061h = abTestUtility2;
        this.f30062i = sendTextMessage2;
        this.f30063j = sendGifMessage2;
        this.f30064k = sendImageMessage2;
        this.f30065l = c8550g2;
        this.f30066m = messageDeliveryStatusUpdatesProvider2;
        this.f30067n = alVar2;
        this.f30068o = asVar2;
        this.f30069p = atVar2;
        this.f30070q = auVar2;
        this.f30071r = avVar2;
        this.f30072s = adVar2;
        this.f30073t = acVar;
        this.f30074u = getMatch3;
        C10380k c10380k2 = c10380k;
        this.f30075v = matchNameVisitor;
        this.f30076w = c10380k2;
        C14550a c14550a2 = c14550a;
        this.f30077x = c14548a;
        this.f30078y = c14550a2;
        CheckTutorialViewed checkTutorialViewed2 = checkTutorialViewed;
        this.f30079z = c10378h;
        this.f30044A = checkTutorialViewed2;
        C10370a c10370a2 = c10370a;
        this.f30045B = confirmTutorialsViewed;
        this.f30046C = c10370a2;
        C3874a c3874a2 = c3874a;
        this.f30047D = c10374c;
        this.f30048E = c3874a2;
        af afVar2 = afVar;
        this.f30049F = c10377f;
        this.f30050G = afVar2;
        C15679f c15679f4 = c15679f2;
        this.f30051H = c15679f;
        this.f30052I = c15679f4;
        this.f30053J = c15679f3;
    }

    @NotNull
    /* renamed from: a */
    public final ChatInputBoxTarget m36146a() {
        ChatInputBoxTarget chatInputBoxTarget = this.f30054a;
        if (chatInputBoxTarget == null) {
            C2668g.b("target");
        }
        return chatInputBoxTarget;
    }

    @Take
    /* renamed from: b */
    public final void m36151b() {
        this.f30056c = this.f30066m.observeDeliveryStatusUpdates().f(C12737n.f41070a).d(new C13734o(this));
        m36142n();
        m36143o();
    }

    @Take
    /* renamed from: c */
    public final void m36153c() {
        this.f30058e = this.f30076w.execute().delay(1, TimeUnit.SECONDS, this.f30053J).observeOn(this.f30052I).subscribeOn(this.f30051H).distinctUntilChanged().subscribe(new C10560c(this));
    }

    @Drop
    /* renamed from: d */
    public final void m36154d() {
        Subscription subscription = this.f30055b;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        subscription = this.f30056c;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        subscription = this.f30057d;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        Disposable disposable = this.f30058e;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: e */
    public final void m36155e() {
        this.f30067n.m42575a(this.f30059f);
    }

    /* renamed from: f */
    public final void m36156f() {
        ChatInputBoxTarget chatInputBoxTarget = this.f30054a;
        if (chatInputBoxTarget == null) {
            C2668g.b("target");
        }
        chatInputBoxTarget.showGifSearch();
    }

    /* renamed from: a */
    public final void m36150a(@NotNull String str, @NotNull C8498n c8498n) {
        C2668g.b(str, "query");
        C2668g.b(c8498n, "gifInfo");
        Gif a = c8498n.m36417a();
        this.f30071r.m42607a(new C8425a(this.f30059f, str, a.getId(), a.getUrl(), c8498n.m36418b()));
    }

    /* renamed from: g */
    public final void m36157g() {
        Subscription subscription = this.f30055b;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        ChatInputBoxTarget chatInputBoxTarget = this.f30054a;
        if (chatInputBoxTarget == null) {
            C2668g.b("target");
        }
        chatInputBoxTarget.hideGifSearch();
        this.f30069p.m42601a(this.f30059f);
    }

    /* renamed from: a */
    public final void m36147a(@NotNull C8498n c8498n, @NotNull String str) {
        C2668g.b(c8498n, "gifInfo");
        C2668g.b(str, "gifSearchQuery");
        Gif a = c8498n.m36417a();
        this.f30063j.execute(new Request(this.f30059f, a)).b(Schedulers.io()).a(new C13730h(this, str, a, c8498n, false, false), (Action1) C13731i.f43623a);
    }

    /* renamed from: a */
    public final void m36149a(@NotNull String str, int i, int i2, @NotNull String str2) {
        C2668g.b(str, "imageUrl");
        C2668g.b(str2, "fallbackMessage");
        Image image = new Image("bitmoji", str, i, i2);
        str = this.f30064k.execute(new SendImageMessage.Request(this.f30059f, image, str2, new ChatInputBoxPresenter$sendBitmojiImageMessage$request$1(str))).b(Schedulers.io());
        Action0 action0 = (Action0) new C13729f(this, image);
        i2 = (Function1) ChatInputBoxPresenter$sendBitmojiImageMessage$2.f45124a;
        if (i2 != null) {
            i2 = new C13735x(i2);
        }
        str.a(action0, (Action1) i2);
    }

    /* renamed from: h */
    public final void m36158h() {
        this.f30047D.execute();
    }

    /* renamed from: b */
    public final void m36152b(@NotNull String str) {
        C2668g.b(str, "query");
        Subscription subscription = this.f30055b;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        DateTime b = this.f30065l.m36535b();
        C2668g.a(b, "todayDateProvider.dateTime");
        this.f30055b = this.f30060g.execute(str).b(Schedulers.io()).a(C19397a.a()).a(new C13727d(this, b.getMillis(), str), (Action1) C13728e.f43614a);
    }

    /* renamed from: i */
    public final void m36159i() {
        this.f30050G.m42569a(new C8418a(this.f30059f, this.f30049F.m42205a().booleanValue() ? "bitmoji avatar" : "bitmoji icon"));
    }

    /* renamed from: a */
    private final void m36130a(boolean z) {
        this.f30048E.a(new C2613a(IntegrationAction.CONNECT, IntegrationFrom.CHAT, IntegrationPartner.SNAPCHAT, z));
    }

    /* renamed from: l */
    private final void m36140l() {
        TinderNotification a = this.f30077x.a(false);
        a.a(new C10561g(this));
        this.f30078y.a(a);
    }

    /* renamed from: m */
    private final void m36141m() {
        this.f30079z.execute();
    }

    /* renamed from: n */
    private final void m36142n() {
        if (!this.f30061h.isGrandGesturesEnabled()) {
            ChatInputBoxTarget chatInputBoxTarget = this.f30054a;
            if (chatInputBoxTarget == null) {
                C2668g.b("target");
            }
            chatInputBoxTarget.hideReactionsControl();
        }
    }

    /* renamed from: o */
    private final void m36143o() {
        if (this.f30061h.isBitmojiEnabled()) {
            ChatInputBoxTarget chatInputBoxTarget;
            chatInputBoxTarget = this.f30054a;
            if (chatInputBoxTarget == null) {
                C2668g.b("target");
            }
            chatInputBoxTarget.hideReactionsControl();
            chatInputBoxTarget = this.f30054a;
            if (chatInputBoxTarget == null) {
                C2668g.b("target");
            }
            chatInputBoxTarget.showBitmojiIcon();
            chatInputBoxTarget = this.f30054a;
            if (chatInputBoxTarget == null) {
                C2668g.b("target");
            }
            chatInputBoxTarget.initializeBitmojiKeyboardObservers();
            C3958c a = this.f30044A.execute(BitmojiTooltip.INSTANCE).b(this.f30051H).a(C10562l.f34315a);
            Consumer c10563m = new C10563m(this);
            Function1 function1 = ChatInputBoxPresenter$setBitmojiDisplayState$3.f45125a;
            if (function1 != null) {
                function1 = new C10564w(function1);
            }
            a.a(c10563m, (Consumer) function1);
            return;
        }
        chatInputBoxTarget = this.f30054a;
        if (chatInputBoxTarget == null) {
            C2668g.b("target");
        }
        chatInputBoxTarget.hideBitmojiIcon();
    }

    /* renamed from: p */
    private final void m36144p() {
        C3956a b = this.f30045B.execute(BitmojiTooltip.INSTANCE).b(this.f30051H);
        Action action = C10559b.f34312a;
        Function1 function1 = ChatInputBoxPresenter$markBitmojiTooltipSeen$2.f45123a;
        if (function1 != null) {
            function1 = new C10564w(function1);
        }
        b.a(action, (Consumer) function1);
    }

    /* renamed from: q */
    private final void m36145q() {
        Observable h = this.f30074u.execute(this.f30059f).b(Schedulers.io()).a(C19397a.a()).h();
        Action1 c13726a = new C13726a(this);
        Function1 function1 = ChatInputBoxPresenter$fetchMatchNameAndShowTooltip$2.f45122a;
        if (function1 != null) {
            function1 = new C13735x(function1);
        }
        this.f30057d = h.a(c13726a, (Action1) function1);
    }

    /* renamed from: j */
    public final void m36160j() {
        m36125a(TutorialAction.TAP);
    }

    /* renamed from: k */
    public final void m36161k() {
        m36125a(TutorialAction.DISMISS);
    }

    /* renamed from: a */
    private final void m36125a(TutorialAction tutorialAction) {
        this.f30046C.m42202a(new C8322a(tutorialAction, TutorialContext.CHAT, TutorialName.BITMOJI_TOOLTIP, TutorialType.TOOLTIP));
    }

    /* renamed from: a */
    private final void m36129a(String str, List<Gif> list, long j) {
        this.f30068o.m42599a(new C8423a(this.f30059f, str, list.size(), j));
    }

    /* renamed from: a */
    public final void m36148a(@NotNull String str) {
        C2668g.b(str, "message");
        CharSequence charSequence = str;
        int length = charSequence.length() - 1;
        int i = 0;
        Object obj = null;
        while (i <= length) {
            Object obj2 = charSequence.charAt(obj == null ? i : length) <= ' ' ? 1 : null;
            if (obj == null) {
                if (obj2 == null) {
                    obj = 1;
                } else {
                    i++;
                }
            } else if (obj2 == null) {
                break;
            } else {
                length--;
            }
        }
        str = charSequence.subSequence(i, length + 1).toString();
        this.f30062i.execute(new SendTextMessage.Request(this.f30059f, str)).b(Schedulers.io()).a(new C13732j(this, str), (Action1) C13733k.f43626a);
    }
}
