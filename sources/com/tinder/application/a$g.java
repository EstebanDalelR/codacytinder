package com.tinder.application;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.ActivityBase;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory;
import com.tinder.bitmoji.analytics.C10370a;
import com.tinder.bitmoji.analytics.C10374c;
import com.tinder.chat.activity.C10515a;
import com.tinder.chat.activity.ChatActivity;
import com.tinder.chat.adapter.C12651g;
import com.tinder.chat.adapter.C12652i;
import com.tinder.chat.adapter.C8409a;
import com.tinder.chat.adapter.C8411d;
import com.tinder.chat.adapter.ChatItemsAdapter;
import com.tinder.chat.analytics.C10531g;
import com.tinder.chat.analytics.C10532i;
import com.tinder.chat.analytics.C10533j;
import com.tinder.chat.analytics.C10534l;
import com.tinder.chat.analytics.C10535m;
import com.tinder.chat.analytics.C10536o;
import com.tinder.chat.analytics.C10537q;
import com.tinder.chat.analytics.C10538s;
import com.tinder.chat.analytics.C10539u;
import com.tinder.chat.analytics.C10540v;
import com.tinder.chat.analytics.C10542z;
import com.tinder.chat.analytics.C12691h;
import com.tinder.chat.analytics.C12694k;
import com.tinder.chat.analytics.C12697n;
import com.tinder.chat.analytics.C12699p;
import com.tinder.chat.analytics.C12701r;
import com.tinder.chat.analytics.C12703t;
import com.tinder.chat.analytics.C12706w;
import com.tinder.chat.analytics.aa;
import com.tinder.chat.analytics.ae;
import com.tinder.chat.analytics.ag;
import com.tinder.chat.analytics.ah;
import com.tinder.chat.analytics.ai;
import com.tinder.chat.analytics.ak;
import com.tinder.chat.analytics.al;
import com.tinder.chat.analytics.ar;
import com.tinder.chat.analytics.as;
import com.tinder.chat.analytics.at;
import com.tinder.chat.analytics.au;
import com.tinder.chat.analytics.av;
import com.tinder.chat.injection.components.ChatActivitySubcomponent;
import com.tinder.chat.injection.p188a.C12710b;
import com.tinder.chat.injection.p188a.C12711c;
import com.tinder.chat.injection.p188a.C12712d;
import com.tinder.chat.injection.p188a.C12713e;
import com.tinder.chat.injection.p188a.C12714f;
import com.tinder.chat.injection.p188a.C12715g;
import com.tinder.chat.injection.p188a.C12716h;
import com.tinder.chat.injection.p188a.C12717i;
import com.tinder.chat.injection.p188a.C12718j;
import com.tinder.chat.injection.p188a.C12719k;
import com.tinder.chat.injection.p188a.C12720l;
import com.tinder.chat.injection.p188a.C12721m;
import com.tinder.chat.injection.p188a.C12722n;
import com.tinder.chat.injection.p188a.C12723o;
import com.tinder.chat.injection.p188a.C12724p;
import com.tinder.chat.injection.p188a.C12725q;
import com.tinder.chat.injection.p188a.C12726r;
import com.tinder.chat.injection.p188a.C12727s;
import com.tinder.chat.injection.p188a.C12728t;
import com.tinder.chat.injection.p188a.C12729u;
import com.tinder.chat.injection.p188a.C12730v;
import com.tinder.chat.injection.p188a.C12731w;
import com.tinder.chat.injection.p188a.C8440a;
import com.tinder.chat.presenter.C8445s;
import com.tinder.chat.presenter.C8447u;
import com.tinder.chat.presenter.C8450z;
import com.tinder.chat.presenter.ad;
import com.tinder.chat.presenter.an;
import com.tinder.chat.presenter.aq;
import com.tinder.chat.view.C8468c;
import com.tinder.chat.view.ChatAvatarView;
import com.tinder.chat.view.ChatInputBoxContainer;
import com.tinder.chat.view.ChatInputSendButtonView;
import com.tinder.chat.view.ChatToolbar;
import com.tinder.chat.view.ChatViewContainer;
import com.tinder.chat.view.EmptyChatViewContainer;
import com.tinder.chat.view.action.C10587l;
import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.C10589p;
import com.tinder.chat.view.action.C10590q;
import com.tinder.chat.view.action.C10591r;
import com.tinder.chat.view.action.C10592s;
import com.tinder.chat.view.action.C12739b;
import com.tinder.chat.view.action.C12740d;
import com.tinder.chat.view.action.C12741g;
import com.tinder.chat.view.action.C12742m;
import com.tinder.chat.view.action.C12743o;
import com.tinder.chat.view.action.C12744v;
import com.tinder.chat.view.action.C12745x;
import com.tinder.chat.view.action.C12746z;
import com.tinder.chat.view.action.C8457a;
import com.tinder.chat.view.action.C8458c;
import com.tinder.chat.view.action.C8460f;
import com.tinder.chat.view.action.C8464u;
import com.tinder.chat.view.action.C8465w;
import com.tinder.chat.view.action.C8467y;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction;
import com.tinder.chat.view.action.FullscreenGifDisplayAction;
import com.tinder.chat.view.action.MatchProfileDisplayAction;
import com.tinder.chat.view.action.ab;
import com.tinder.chat.view.action.ac;
import com.tinder.chat.view.action.af;
import com.tinder.chat.view.action.aj;
import com.tinder.chat.view.message.C10599a;
import com.tinder.chat.view.message.C10606b;
import com.tinder.chat.view.message.C10608c;
import com.tinder.chat.view.message.C10609d;
import com.tinder.chat.view.message.C10612e;
import com.tinder.chat.view.message.C10613f;
import com.tinder.chat.view.message.C10616g;
import com.tinder.chat.view.message.C10617h;
import com.tinder.chat.view.message.C10618i;
import com.tinder.chat.view.message.C10619j;
import com.tinder.chat.view.message.C10620k;
import com.tinder.chat.view.message.C10621l;
import com.tinder.chat.view.message.C10622m;
import com.tinder.chat.view.message.C10623n;
import com.tinder.chat.view.message.C10624o;
import com.tinder.chat.view.message.C10625p;
import com.tinder.chat.view.message.C10626q;
import com.tinder.chat.view.message.C10627r;
import com.tinder.chat.view.message.C10629s;
import com.tinder.chat.view.message.C10630t;
import com.tinder.chat.view.message.C10631u;
import com.tinder.chat.view.message.C10632v;
import com.tinder.chat.view.message.C10633w;
import com.tinder.chat.view.message.C10634x;
import com.tinder.chat.view.message.C10635y;
import com.tinder.chat.view.message.C8490z;
import com.tinder.chat.view.message.InboundGifMessageView;
import com.tinder.chat.view.message.InboundImageMessageView;
import com.tinder.chat.view.message.InboundTextMessageView;
import com.tinder.chat.view.message.OutboundGifMessageView;
import com.tinder.chat.view.message.OutboundImageMessageView;
import com.tinder.chat.view.message.OutboundTextMessageView;
import com.tinder.chat.view.message.SpotifyChatTrackPlayerView;
import com.tinder.chat.view.message.am;
import com.tinder.chat.view.message.ao;
import com.tinder.chat.view.message.ap;
import com.tinder.chat.view.message.aw;
import com.tinder.chat.view.message.ax;
import com.tinder.chat.view.message.ay;
import com.tinder.chat.view.message.az;
import com.tinder.chat.view.message.ba;
import com.tinder.chat.view.message.bb;
import com.tinder.chat.view.message.bc;
import com.tinder.chat.view.message.bd;
import com.tinder.chat.view.message.be;
import com.tinder.chat.view.message.bf;
import com.tinder.chat.view.message.bg;
import com.tinder.chat.view.message.bh;
import com.tinder.chat.view.message.bi;
import com.tinder.chat.view.model.C12751u;
import com.tinder.chat.view.model.C12752x;
import com.tinder.chat.view.model.ChatScreenState;
import com.tinder.chat.view.p189a.C8452a;
import com.tinder.chat.view.provider.C10645d;
import com.tinder.chat.view.provider.C10646h;
import com.tinder.chat.view.provider.C10647l;
import com.tinder.chat.view.provider.C10649u;
import com.tinder.chat.view.provider.C10650w;
import com.tinder.chat.view.provider.C12757c;
import com.tinder.chat.view.provider.C12758e;
import com.tinder.chat.view.provider.C12759g;
import com.tinder.chat.view.provider.C12760i;
import com.tinder.chat.view.provider.C12761k;
import com.tinder.chat.view.provider.C12762m;
import com.tinder.chat.view.provider.C12763p;
import com.tinder.chat.view.provider.C12767s;
import com.tinder.chat.view.provider.C12770v;
import com.tinder.chat.view.provider.C12771x;
import com.tinder.chat.view.provider.C12772z;
import com.tinder.chat.view.provider.C8506a;
import com.tinder.chat.view.provider.C8507f;
import com.tinder.chat.view.provider.C8508j;
import com.tinder.chat.view.provider.C8514q;
import com.tinder.chat.view.provider.C8517t;
import com.tinder.chat.view.provider.ChatEmptyStateNotifier;
import com.tinder.chat.view.provider.ChatEmptyStateProvider;
import com.tinder.chat.view.provider.ChatInputGifSelectorStateUpdatesNotifier;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesNotifier;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesProvider;
import com.tinder.chat.view.provider.ChatNewMessagesNotifier;
import com.tinder.chat.view.provider.ChatNewMessagesProvider;
import com.tinder.chat.view.provider.ReactionChatItemClickedProvider;
import com.tinder.common.feed.view.C10671c;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.provider.C8550g;
import com.tinder.common.tracker.recyclerview.rx.ViewVisibleObserver;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.p201a.C8588a;
import com.tinder.data.keyboard.KeyboardHeightNotifier;
import com.tinder.data.keyboard.KeyboardHeightProvider;
import com.tinder.data.message.C12961w;
import com.tinder.data.reactions.StrikeReactionStore;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.injection.modules.C13155xa389edd5;
import com.tinder.domain.injection.modules.CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory;
import com.tinder.domain.injection.modules.RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory;
import com.tinder.domain.match.model.visitor.MatchNameVisitor;
import com.tinder.domain.match.usecase.TouchMatch;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.message.usecase.CommonMessagePropertiesAggregator;
import com.tinder.domain.message.usecase.DeleteFailedMessage;
import com.tinder.domain.message.usecase.DeleteFailedMessage_Factory;
import com.tinder.domain.message.usecase.GetLastMessageSentDate;
import com.tinder.domain.message.usecase.LikeMessage;
import com.tinder.domain.message.usecase.LikeMessage_Factory;
import com.tinder.domain.message.usecase.LoadGifs;
import com.tinder.domain.message.usecase.MarkAllMessageAsSeenForMatch;
import com.tinder.domain.message.usecase.ObserveMessages;
import com.tinder.domain.message.usecase.ResendFailedMessage;
import com.tinder.domain.message.usecase.ResendFailedMessage_Factory;
import com.tinder.domain.message.usecase.SendGifMessage;
import com.tinder.domain.message.usecase.SendImageMessage;
import com.tinder.domain.message.usecase.SendReactionMessage;
import com.tinder.domain.message.usecase.SendTextMessage;
import com.tinder.domain.message.usecase.UnLikeMessage;
import com.tinder.domain.message.usecase.UnLikeMessage_Factory;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.reactions.provider.StrikeReactionTypesProvider;
import com.tinder.domain.reactions.provider.StrikeReactionTypesProvider_Factory;
import com.tinder.domain.reactions.repository.StrikeReactionRepository;
import com.tinder.injection.p261a.C13332b;
import com.tinder.injection.p261a.C13333c;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.bk;
import com.tinder.managers.bq;
import com.tinder.managers.bt;
import com.tinder.match.p292c.C13419e;
import com.tinder.match.p292c.C13420f;
import com.tinder.messageads.activity.AdMessageChatActivity;
import com.tinder.messageads.activity.C12117a;
import com.tinder.messageads.p298e.C9908a;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.reactions.analytics.C16276g;
import com.tinder.reactions.analytics.C16277h;
import com.tinder.reactions.analytics.C16278j;
import com.tinder.reactions.analytics.C16279k;
import com.tinder.reactions.analytics.C16280l;
import com.tinder.reactions.analytics.C16281m;
import com.tinder.reactions.analytics.C17899b;
import com.tinder.reactions.analytics.C17905e;
import com.tinder.reactions.analytics.C17912i;
import com.tinder.reactions.audio.C14589a;
import com.tinder.reactions.audio.C14593d;
import com.tinder.reactions.audio.C17927e;
import com.tinder.reactions.audio.ReactionsAudioStreamer;
import com.tinder.reactions.chat.feature.C16298b;
import com.tinder.reactions.chat.feature.C16299d;
import com.tinder.reactions.chat.feature.C17947c;
import com.tinder.reactions.chat.feature.C17948e;
import com.tinder.reactions.chat.p386a.C14598a;
import com.tinder.reactions.chat.p386a.C14599c;
import com.tinder.reactions.chat.p386a.C17944b;
import com.tinder.reactions.chat.p386a.C17945d;
import com.tinder.reactions.chat.presenter.C17949b;
import com.tinder.reactions.chat.presenter.C17956f;
import com.tinder.reactions.chat.view.C16311a;
import com.tinder.reactions.chat.view.ChatInputExpandButtonView;
import com.tinder.reactions.common.C14608a;
import com.tinder.reactions.common.C14613b;
import com.tinder.reactions.common.C17959c;
import com.tinder.reactions.common.C17960d;
import com.tinder.reactions.drawer.mediator.C14629b;
import com.tinder.reactions.drawer.mediator.C14633g;
import com.tinder.reactions.drawer.mediator.C16324e;
import com.tinder.reactions.drawer.mediator.C16325f;
import com.tinder.reactions.drawer.mediator.C17963c;
import com.tinder.reactions.drawer.mediator.C17966j;
import com.tinder.reactions.drawer.p391b.C14624a;
import com.tinder.reactions.drawer.p464a.C16317a;
import com.tinder.reactions.drawer.provider.C14637a;
import com.tinder.reactions.drawer.provider.C14639g;
import com.tinder.reactions.drawer.provider.C16327e;
import com.tinder.reactions.drawer.provider.C17968b;
import com.tinder.reactions.drawer.provider.C17969d;
import com.tinder.reactions.drawer.provider.C17970f;
import com.tinder.reactions.drawer.provider.C17971h;
import com.tinder.reactions.drawer.provider.DrawerEventProvider;
import com.tinder.reactions.drawer.view.C16331c;
import com.tinder.reactions.drawer.view.ChatInputEditText;
import com.tinder.reactions.gestures.animators.C14647d;
import com.tinder.reactions.gestures.animators.C14650f;
import com.tinder.reactions.gestures.animators.C16335a;
import com.tinder.reactions.gestures.animators.C16336b;
import com.tinder.reactions.gestures.animators.C16338g;
import com.tinder.reactions.gestures.animators.C16339h;
import com.tinder.reactions.gestures.animators.C16340i;
import com.tinder.reactions.gestures.animators.C16342k;
import com.tinder.reactions.gestures.animators.C16343l;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.gestures.p393a.C17972b;
import com.tinder.reactions.gestures.p394b.C14651a;
import com.tinder.reactions.gestures.p394b.C14653c;
import com.tinder.reactions.gestures.p394b.C14655e;
import com.tinder.reactions.gestures.p394b.C14657g;
import com.tinder.reactions.gestures.p395c.C16345a;
import com.tinder.reactions.gestures.p395c.C16346c;
import com.tinder.reactions.gestures.p395c.C16347e;
import com.tinder.reactions.gestures.p395c.C16348h;
import com.tinder.reactions.gestures.p395c.C17982b;
import com.tinder.reactions.gestures.p395c.C17983d;
import com.tinder.reactions.gestures.p395c.C17984g;
import com.tinder.reactions.gestures.p395c.C17985i;
import com.tinder.reactions.gestures.view.C16355a;
import com.tinder.reactions.gestures.view.C16357c;
import com.tinder.reactions.gestures.view.C16358d;
import com.tinder.reactions.gestures.view.C16359f;
import com.tinder.reactions.gestures.view.FlingableLottieAnimationView;
import com.tinder.reactions.gestures.view.GrandGestureMatchAvatarView;
import com.tinder.reactions.gestures.view.GrandGestureSelectorView;
import com.tinder.reactions.gestures.view.SelectableGrandGestureView;
import com.tinder.reactions.gestures.viewmodel.C14674d;
import com.tinder.reactions.gestures.viewmodel.C14679j;
import com.tinder.reactions.gestures.viewmodel.C17991l;
import com.tinder.reactions.navigation.mediator.C16374a;
import com.tinder.reactions.navigation.mediator.C16375d;
import com.tinder.reactions.navigation.p396a.C16366b;
import com.tinder.reactions.navigation.p396a.C17992a;
import com.tinder.reactions.navigation.p397b.C16369a;
import com.tinder.reactions.navigation.p397b.C17993c;
import com.tinder.reactions.navigation.p398c.C14687e;
import com.tinder.reactions.navigation.p398c.C17994c;
import com.tinder.reactions.navigation.p399d.C14688a;
import com.tinder.reactions.navigation.p399d.C17995b;
import com.tinder.reactions.navigation.view.C16385a;
import com.tinder.reactions.navigation.view.C16386b;
import com.tinder.reactions.navigation.view.GestureNavigationLoadingView;
import com.tinder.reactions.navigation.view.GrandGestureNavigationView;
import com.tinder.reactions.p382a.p383a.C17892b;
import com.tinder.reactions.p382a.p383a.C17893c;
import com.tinder.reactions.p384b.C14594a;
import com.tinder.reactions.p385c.C14597a;
import com.tinder.reactions.p385c.C16287f;
import com.tinder.reactions.p385c.C16289j;
import com.tinder.reactions.p385c.C16290l;
import com.tinder.reactions.p385c.C17935b;
import com.tinder.reactions.p385c.C17936d;
import com.tinder.reactions.p385c.C17937g;
import com.tinder.reactions.p385c.C17939i;
import com.tinder.reactions.p385c.C17940k;
import com.tinder.reactions.view.C16390b;
import com.tinder.reactions.view.GrandGestureLayout;
import com.tinder.screenshotty.C14830c;
import com.tinder.sponsoredmessage.p414a.C16825a;
import com.tinder.sponsoredmessage.p414a.C16826b;
import com.tinder.sponsoredmessage.p414a.C16827d;
import com.tinder.sponsoredmessage.p479d.C16844a;
import com.tinder.typingindicator.model.TypingIndicatorExperimentUtility;
import com.tinder.typingindicator.p434a.C18245d;
import com.tinder.typingindicator.p440f.C18254g;
import com.tinder.typingindicator.p440f.C18255i;
import com.tinder.typingindicator.p440f.C18258l;
import com.tinder.typingindicator.p440f.C18259m;
import com.tinder.typingindicator.provider.C15327a;
import com.tinder.typingindicator.provider.C18261c;
import com.tinder.typingindicator.repository.TextInputRepository;
import com.tinder.typingindicator.repository.TypingIndicatorRepository;
import com.tinder.typingindicator.usecase.C17176h;
import com.tinder.typingindicator.usecase.C17177i;
import com.tinder.typingindicator.usecase.C17180j;
import com.tinder.typingindicator.usecase.C17181k;
import com.tinder.typingindicator.usecase.C17183m;
import com.tinder.typingindicator.usecase.C17185o;
import com.tinder.typingindicator.usecase.C17186p;
import com.tinder.typingindicator.usecase.C17188q;
import com.tinder.typingindicator.usecase.C17190r;
import com.tinder.typingindicator.usecase.C18266g;
import com.tinder.typingindicator.usecase.C18267n;
import com.tinder.typingindicator.worker.TypingIndicatorVisibilityAnalyticsWorker;
import com.tinder.updates.UpdatesScheduler;
import com.tinder.video.p445b.C15411b;
import com.tinder.video.p446c.C15412a;
import com.tinder.video.view.C17258a;
import com.tinder.video.view.MediaView;
import dagger.internal.C17281c;
import dagger.internal.C18317d;
import de.greenrobot.event.C2664c;
import java8.util.function.Supplier;
import javax.inject.Provider;
import rx.Observable;

final class a$g implements ChatActivitySubcomponent {
    /* renamed from: A */
    private Provider<C8507f> f40424A;
    /* renamed from: B */
    private Provider<C10646h> f40425B;
    /* renamed from: C */
    private C12715g f40426C;
    /* renamed from: D */
    private C12713e f40427D;
    /* renamed from: E */
    private Provider<C14629b> f40428E;
    /* renamed from: F */
    private Provider<C14637a> f40429F;
    /* renamed from: G */
    private C17912i f40430G;
    /* renamed from: H */
    private ag f40431H;
    /* renamed from: I */
    private Provider<C14598a> f40432I;
    /* renamed from: J */
    private C17949b f40433J;
    /* renamed from: K */
    private Provider<C14599c> f40434K;
    /* renamed from: L */
    private Provider<C14639g> f40435L;
    /* renamed from: M */
    private Provider<C16298b> f40436M;
    /* renamed from: N */
    private Provider<ReactionChatItemClickedProvider> f40437N;
    /* renamed from: O */
    private Provider<C16327e> f40438O;
    /* renamed from: P */
    private Provider<C14633g> f40439P;
    /* renamed from: Q */
    private Provider<C16346c> f40440Q;
    /* renamed from: R */
    private Provider<C16348h> f40441R;
    /* renamed from: S */
    private Provider<C14641a> f40442S;
    /* renamed from: T */
    private Provider<C16345a> f40443T;
    /* renamed from: U */
    private Provider<StrikeReactionStore> f40444U;
    /* renamed from: V */
    private Provider<StrikeReactionRepository> f40445V;
    /* renamed from: W */
    private C17939i f40446W;
    /* renamed from: X */
    private Provider<C16347e> f40447X;
    /* renamed from: Y */
    private Provider<C16287f> f40448Y;
    /* renamed from: Z */
    private Provider<DrawerEventProvider> f40449Z;
    /* renamed from: a */
    final /* synthetic */ C4423a f40450a;
    private C12727s aA;
    private ak aB;
    private ai aC;
    private C12703t aD;
    private C12743o aE;
    private C12723o aF;
    private Provider<C8458c> aG;
    private Provider<C10587l> aH;
    private Provider<C8460f> aI;
    private af aJ;
    private Provider<ac> aK;
    private Provider<C8457a> aL;
    private Provider<ChatEmptyStateProvider> aM;
    private C17936d aN;
    private C17905e aO;
    private C17899b aP;
    private C17956f aQ;
    private Provider<C16299d> aR;
    private Provider<C14688a> aS;
    private C17994c aT;
    private Provider<C16369a> aU;
    private Provider<C8508j> aV;
    private Provider<ChatActivity> aa;
    private C12710b ab;
    private Provider<C14613b> ac;
    private Provider<C14608a> ad;
    private Provider<ChatNewMessagesProvider> ae;
    private Provider<ReactionsAudioStreamer> af;
    private Provider<C14593d> ag;
    private Provider<C14597a> ah;
    private Provider<C16289j> ai;
    private ab aj;
    private LikeMessage_Factory ak;
    private UnLikeMessage_Factory al;
    private C12697n am;
    private C12745x an;
    private ResendFailedMessage_Factory ao;
    private ae ap;
    private C12746z aq;
    private DeleteFailedMessage_Factory ar;
    private C12744v as;
    private C12694k at;
    private C12691h au;
    private C12699p av;
    private C12701r aw;
    private aa ax;
    private C12711c ay;
    private C12706w az;
    /* renamed from: b */
    private String f40451b;
    /* renamed from: c */
    private C8440a f40452c;
    /* renamed from: d */
    private ChatActivity f40453d;
    /* renamed from: e */
    private Provider<ViewVisibleObserver> f40454e;
    /* renamed from: f */
    private Provider<KeyboardHeightProvider> f40455f;
    /* renamed from: g */
    private Provider<KeyboardHeightNotifier> f40456g;
    /* renamed from: h */
    private C12752x f40457h;
    /* renamed from: i */
    private C18266g f40458i;
    /* renamed from: j */
    private com.tinder.chat.view.provider.ac f40459j;
    /* renamed from: k */
    private C12767s f40460k;
    /* renamed from: l */
    private Provider<String> f40461l;
    /* renamed from: m */
    private Provider<C8506a> f40462m;
    /* renamed from: n */
    private Provider<C10650w> f40463n;
    /* renamed from: o */
    private Provider<C10647l> f40464o;
    /* renamed from: p */
    private Provider<C10649u> f40465p;
    /* renamed from: q */
    private Provider<ChatNewMessagesNotifier> f40466q;
    /* renamed from: r */
    private Provider<C10645d> f40467r;
    /* renamed from: s */
    private Provider<ChatEmptyStateNotifier> f40468s;
    /* renamed from: t */
    private C18267n f40469t;
    /* renamed from: u */
    private C18259m f40470u;
    /* renamed from: v */
    private C18261c f40471v;
    /* renamed from: w */
    private ar f40472w;
    /* renamed from: x */
    private Provider<TypingIndicatorVisibilityAnalyticsWorker> f40473x;
    /* renamed from: y */
    private C12652i f40474y;
    /* renamed from: z */
    private C12719k f40475z;

    public void inject(ChatAvatarView chatAvatarView) {
    }

    private a$g(C4423a c4423a, a$f a_f) {
        this.f40450a = c4423a;
        m49472a(a_f);
    }

    /* renamed from: a */
    private C15411b m49470a() {
        return new C15411b((ViewVisibleObserver) this.f40454e.get(), C4423a.ek(this.f40450a), C13333c.m51590c(C4423a.di(this.f40450a)));
    }

    /* renamed from: b */
    private C10539u m49473b() {
        return new C10539u((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: c */
    private C10534l m49474c() {
        return new C10534l((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: d */
    private C10532i m49475d() {
        return new C10532i((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: e */
    private C8445s m49476e() {
        return new C8445s(m49473b(), m49474c(), m49475d(), this.f40451b, (AppRatingRepository) C4423a.dl(this.f40450a).get(), new C8550g(), (CurrentScreenNotifier) C4423a.M(this.f40450a).get(), C4423a.U(this.f40450a), (C14830c) C4423a.L(this.f40450a).get(), C4423a.N(this.f40450a), C4423a.bh(this.f40450a), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(C4423a.aF(this.f40450a)));
    }

    /* renamed from: f */
    private C8452a m49477f() {
        return new C8452a(new C8409a());
    }

    /* renamed from: g */
    private ChatItemsAdapter m49478g() {
        return new ChatItemsAdapter(m49477f());
    }

    /* renamed from: h */
    private ObserveMessages m49479h() {
        return new ObserveMessages((MessageRepository) C4423a.bo(this.f40450a).get());
    }

    /* renamed from: i */
    private C17183m m49480i() {
        return new C17183m((TypingIndicatorRepository) C4423a.em(this.f40450a).get(), (TypingIndicatorExperimentUtility) C4423a.en(this.f40450a).get());
    }

    /* renamed from: j */
    private C18258l m49481j() {
        return new C18258l(new C18254g());
    }

    /* renamed from: k */
    private C15327a m49482k() {
        return new C15327a(m49480i(), m49481j());
    }

    /* renamed from: l */
    private C8514q m49483l() {
        return new C8514q(m49479h(), (MetaGateway) C4423a.bO(this.f40450a).get(), new C8517t(), this.f40460k, C12728t.m50091b(this.f40452c), (C8506a) this.f40462m.get(), m49482k());
    }

    /* renamed from: m */
    private ChatInputTextStateUpdatesProvider m49484m() {
        return C12715g.m50041a(this.f40452c, (C10647l) this.f40464o.get());
    }

    /* renamed from: n */
    private MarkAllMessageAsSeenForMatch m49485n() {
        return new MarkAllMessageAsSeenForMatch((MessageRepository) C4423a.bo(this.f40450a).get());
    }

    /* renamed from: o */
    private TouchMatch m49486o() {
        return new TouchMatch(C4423a.ap(this.f40450a));
    }

    /* renamed from: p */
    private ad m49487p() {
        return new ad(this.f40451b, m49483l(), (C10650w) this.f40463n.get(), m49484m(), (ChatNewMessagesNotifier) this.f40466q.get(), (ChatEmptyStateNotifier) this.f40468s.get(), m49485n(), m49486o(), (TypingIndicatorVisibilityAnalyticsWorker) this.f40473x.get());
    }

    /* renamed from: q */
    private C8411d m49488q() {
        return new C8411d((TypingIndicatorExperimentUtility) C4423a.en(this.f40450a).get(), C17281c.b(C12651g.m49920c()), C17281c.b(this.f40474y), C17281c.b(this.f40475z));
    }

    /* renamed from: r */
    private Lifecycle m49489r() {
        return C12726r.m50083a(this.f40452c, this.f40453d);
    }

    /* renamed from: s */
    private LoadGifs m49490s() {
        return new LoadGifs(C4423a.eo(this.f40450a));
    }

    /* renamed from: t */
    private GetLastMessageSentDate m49491t() {
        return new GetLastMessageSentDate((MessageRepository) C4423a.bo(this.f40450a).get());
    }

    /* renamed from: u */
    private CommonMessagePropertiesAggregator m49492u() {
        return new CommonMessagePropertiesAggregator(C4423a.U(this.f40450a), C4423a.aW(this.f40450a), m49491t(), C12961w.m50688b(C4423a.ep(this.f40450a)), com.tinder.data.message.ad.m50640b(C4423a.ep(this.f40450a)));
    }

    /* renamed from: v */
    private SendTextMessage m49493v() {
        return new SendTextMessage(m49492u(), (MessageRepository) C4423a.bo(this.f40450a).get());
    }

    /* renamed from: w */
    private SendGifMessage m49494w() {
        return new SendGifMessage(m49492u(), (MessageRepository) C4423a.bo(this.f40450a).get());
    }

    /* renamed from: x */
    private SendImageMessage m49495x() {
        return new SendImageMessage(m49492u(), (MessageRepository) C4423a.bo(this.f40450a).get(), this.f40450a.loadProfileOptionData());
    }

    /* renamed from: y */
    private al m49496y() {
        return new al((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: z */
    private as m49497z() {
        return new as((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: A */
    private at m49391A() {
        return new at((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: B */
    private au m49392B() {
        return new au((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: C */
    private av m49393C() {
        return new av((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: D */
    private com.tinder.chat.analytics.ad m49394D() {
        return new com.tinder.chat.analytics.ad((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: E */
    private com.tinder.chat.analytics.ac m49395E() {
        return new com.tinder.chat.analytics.ac((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: F */
    private C10370a m49396F() {
        return new C10370a((C2630h) C4423a.u(this.f40450a).get(), new AppTutorialEventFactory(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(C4423a.aF(this.f40450a)));
    }

    /* renamed from: G */
    private C10374c m49397G() {
        return new C10374c((C2630h) C4423a.u(this.f40450a).get(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(C4423a.aF(this.f40450a)));
    }

    /* renamed from: H */
    private com.tinder.chat.analytics.af m49398H() {
        return new com.tinder.chat.analytics.af((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: I */
    private C8447u m49399I() {
        return new C8447u(this.f40451b, m49490s(), (AbTestUtility) C4423a.f(this.f40450a).get(), m49493v(), m49494w(), m49495x(), new C8550g(), C4423a.eq(this.f40450a), m49496y(), m49497z(), m49391A(), m49392B(), m49393C(), m49394D(), m49395E(), C4423a.U(this.f40450a), new MatchNameVisitor(), C4423a.bd(this.f40450a), (C14548a) C4423a.al(this.f40450a).get(), C4423a.am(this.f40450a), C4423a.be(this.f40450a), C4423a.ay(this.f40450a), C4423a.aM(this.f40450a), m49396F(), m49397G(), C4423a.bf(this.f40450a), C4423a.er(this.f40450a), m49398H(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(C4423a.aF(this.f40450a)), C13333c.m51590c(C4423a.di(this.f40450a)), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(C4423a.aF(this.f40450a)));
    }

    /* renamed from: J */
    private ChatInputGifSelectorStateUpdatesNotifier m49400J() {
        return C12712d.m50031a(this.f40452c, (C10646h) this.f40425B.get());
    }

    /* renamed from: K */
    private ChatInputTextStateUpdatesNotifier m49401K() {
        return C12714f.m50038a(this.f40452c, (C10647l) this.f40464o.get());
    }

    /* renamed from: L */
    private C17186p m49402L() {
        return new C17186p((TextInputRepository) C4423a.es(this.f40450a).get());
    }

    /* renamed from: M */
    private C17181k m49403M() {
        return new C17181k((TypingIndicatorRepository) C4423a.em(this.f40450a).get());
    }

    /* renamed from: N */
    private C17176h m49404N() {
        return new C17176h((TextInputRepository) C4423a.es(this.f40450a).get());
    }

    /* renamed from: O */
    private C17180j m49405O() {
        return new C17180j(m49404N());
    }

    /* renamed from: P */
    private C17190r m49406P() {
        return new C17190r(m49405O(), C13155xa389edd5.proxyProvidesComputationScheduler$domain_release(C4423a.aF(this.f40450a)));
    }

    /* renamed from: Q */
    private C17177i m49407Q() {
        return new C17177i(m49403M(), m49406P());
    }

    /* renamed from: R */
    private C17188q m49408R() {
        return new C17188q((TypingIndicatorRepository) C4423a.em(this.f40450a).get(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(C4423a.aI(this.f40450a)), C4423a.et(this.f40450a));
    }

    /* renamed from: S */
    private C17185o m49409S() {
        return new C17185o(m49407Q(), m49408R());
    }

    /* renamed from: T */
    private C8450z m49410T() {
        return new C8450z(this.f40451b, (C8506a) this.f40462m.get(), m49402L(), m49409S(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(C4423a.aF(this.f40450a)));
    }

    /* renamed from: U */
    private com.tinder.chat.presenter.ag m49411U() {
        return com.tinder.chat.presenter.al.m50106a(C4423a.U(this.f40450a), C13419e.m51879c(C4423a.eu(this.f40450a)), new MatchNameVisitor(), this.f40451b);
    }

    /* renamed from: V */
    private C10540v m49412V() {
        return new C10540v((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: W */
    private LikeMessage m49413W() {
        return new LikeMessage((MessageRepository) C4423a.bo(this.f40450a).get());
    }

    /* renamed from: X */
    private UnLikeMessage m49414X() {
        return new UnLikeMessage((MessageRepository) C4423a.bo(this.f40450a).get());
    }

    /* renamed from: Y */
    private C10535m m49415Y() {
        return new C10535m((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    /* renamed from: Z */
    private C8465w m49416Z() {
        return new C8465w(m49413W(), m49414X(), m49415Y());
    }

    private Context aa() {
        return C12710b.m50023a(this.f40452c, this.f40453d);
    }

    private com.tinder.chat.view.action.aa ab() {
        return new com.tinder.chat.view.action.aa(aa());
    }

    private ResendFailedMessage ac() {
        return new ResendFailedMessage((MessageRepository) C4423a.bo(this.f40450a).get());
    }

    private C8467y ad() {
        return new C8467y(ac(), m49394D());
    }

    private DeleteFailedMessage ae() {
        return new DeleteFailedMessage((MessageRepository) C4423a.bo(this.f40450a).get());
    }

    private C8464u af() {
        return new C8464u(ae());
    }

    private C10533j ag() {
        return new C10533j((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    private C10531g ah() {
        return new C10531g((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    private C10536o ai() {
        return new C10536o((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    private C10537q aj() {
        return new C10537q((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    private C10542z ak() {
        return new C10542z((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    private ChatContextualMenuDisplayAction al() {
        return C12711c.m50027a(this.f40452c, aa(), this.f40451b, ab(), m49416Z(), ad(), af(), ag(), ah(), ai(), aj(), ak());
    }

    private MatchProfileDisplayAction am() {
        return C12727s.m50086a(this.f40452c, aa(), m49412V());
    }

    private ah an() {
        return new ah((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    private C10592s ao() {
        return new C10592s(m49416Z(), al(), am(), an());
    }

    private C8490z ap() {
        return new C8490z(new C8550g());
    }

    private com.tinder.chat.analytics.ab aq() {
        return new com.tinder.chat.analytics.ab((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    private aj ar() {
        return new aj(al(), aq(), an());
    }

    private com.tinder.chat.analytics.aj as() {
        return new com.tinder.chat.analytics.aj((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    private FullscreenGifDisplayAction at() {
        return C12722n.m50068a(this.f40452c, aa(), as());
    }

    private C10589p au() {
        return new C10589p(m49416Z(), al(), at(), am());
    }

    private com.tinder.chat.view.action.ag av() {
        return new com.tinder.chat.view.action.ag(al(), at(), aq(), this.f40451b);
    }

    private C10591r aw() {
        return new C10591r((ReactionChatItemClickedProvider) this.f40437N.get(), m49416Z(), al(), am());
    }

    private com.tinder.chat.view.action.ai ax() {
        return new com.tinder.chat.view.action.ai((ReactionChatItemClickedProvider) this.f40437N.get(), al(), aq(), this.f40451b);
    }

    private C10590q ay() {
        return new C10590q(m49416Z(), al(), am(), as(), this.f40451b);
    }

    private com.tinder.chat.view.action.ah az() {
        return new com.tinder.chat.view.action.ah(aq(), al(), as(), this.f40451b);
    }

    private Supplier<Observable<ChatScreenState>> aA() {
        return C12718j.m50053a(this.f40452c, (C10650w) this.f40463n.get());
    }

    private an aB() {
        return new an(aA(), C4423a.U(this.f40450a), new MatchNameVisitor(), C13420f.m51882b(C4423a.eu(this.f40450a)), this.f40451b, this.f40450a.topPicksConfig());
    }

    private C16827d aC() {
        return new C16827d((C2630h) C4423a.u(this.f40450a).get());
    }

    private C16826b aD() {
        return new C16826b((C2630h) C4423a.u(this.f40450a).get());
    }

    private C16825a aE() {
        return new C16825a((C2630h) C4423a.u(this.f40450a).get());
    }

    private C16844a aF() {
        return new C16844a(C4423a.ap(this.f40450a), aE());
    }

    private C9908a aG() {
        return new C9908a(this.f40451b, C4423a.U(this.f40450a), (C8588a) C4423a.aJ(this.f40450a).get(), (CurrentUserProvider) C4423a.Y(this.f40450a).get(), aC(), aD(), aF(), m49486o(), C4423a.aq(this.f40450a));
    }

    private C16317a aH() {
        return new C16317a((C14629b) this.f40428E.get());
    }

    private SendReactionMessage aI() {
        return new SendReactionMessage(m49492u(), (MessageRepository) C4423a.bo(this.f40450a).get());
    }

    private C14674d aJ() {
        return new C14674d((AbTestUtility) C4423a.f(this.f40450a).get(), (MetaGateway) C4423a.bO(this.f40450a).get());
    }

    private C16279k aK() {
        return new C16279k((C2630h) C4423a.u(this.f40450a).get(), (C16347e) this.f40447X.get(), C4423a.U(this.f40450a), (C16287f) this.f40448Y.get());
    }

    private C16277h aL() {
        return new C16277h((C2630h) C4423a.u(this.f40450a).get(), C4423a.U(this.f40450a));
    }

    private C16276g aM() {
        return new C16276g((C2630h) C4423a.u(this.f40450a).get(), C4423a.U(this.f40450a));
    }

    private C16278j aN() {
        return new C16278j((C2630h) C4423a.u(this.f40450a).get(), C4423a.U(this.f40450a), (C16287f) this.f40448Y.get());
    }

    private C14594a aO() {
        return new C14594a(this.f40451b, aI(), aJ(), (C16347e) this.f40447X.get(), aK(), aL(), aM(), aN(), new C14679j(), (DrawerEventProvider) this.f40449Z.get(), (ReactionChatItemClickedProvider) this.f40437N.get(), (C14608a) this.ad.get(), (C14641a) this.f40442S.get(), m49394D(), (ChatNewMessagesProvider) this.ae.get());
    }

    private C14589a aP() {
        return new C14589a((C14593d) this.ag.get(), (C14597a) this.ah.get());
    }

    private C14624a aQ() {
        return new C14624a(this.f40451b, aM());
    }

    private C14653c aR() {
        return new C14653c((C8506a) this.f40462m.get());
    }

    private C14655e aS() {
        return new C14655e((C16345a) this.f40443T.get(), aK(), this.f40451b);
    }

    private C14687e aT() {
        return new C14687e((C16347e) this.f40447X.get(), aK(), this.f40451b);
    }

    private C14651a aU() {
        return new C14651a((C16327e) this.f40438O.get(), (C16347e) this.f40447X.get());
    }

    private C16290l aV() {
        return new C16290l((StrikeReactionRepository) this.f40445V.get(), new StrikeReactionTypesProvider());
    }

    private C16281m aW() {
        return new C16281m((C2630h) C4423a.u(this.f40450a).get(), C4423a.U(this.f40450a));
    }

    private C14657g aX() {
        return new C14657g((C16287f) this.f40448Y.get(), (C16289j) this.ai.get(), aW(), this.f40451b);
    }

    private C16280l aY() {
        return new C16280l((C2630h) C4423a.u(this.f40450a).get(), (C16347e) this.f40447X.get(), C4423a.U(this.f40450a));
    }

    private C10538s aZ() {
        return new C10538s((C2630h) C4423a.u(this.f40450a).get(), C4423a.ar(this.f40450a));
    }

    private C10588n ba() {
        return new C10588n(al(), am(), as(), an(), aZ());
    }

    private com.tinder.chat.view.action.ae bb() {
        return new com.tinder.chat.view.action.ae(al(), as(), an(), aZ());
    }

    private aq bc() {
        return new aq((C8506a) this.f40462m.get(), C13332b.m51586c(C4423a.di(this.f40450a)));
    }

    /* renamed from: a */
    private void m49472a(a$f a_f) {
        this.f40454e = C17281c.a(C12730v.m50098b(a_f.f33517b));
        this.f40451b = a_f.f33519d;
        this.f40455f = C17281c.a(C12725q.m50081b(a_f.f33517b, C4423a.ev(this.f40450a)));
        this.f40456g = C17281c.a(C12724p.m50077b(a_f.f33517b, C4423a.ev(this.f40450a)));
        this.f40457h = C12752x.m50186b(C4423a.f(this.f40450a), C4423a.aZ(this.f40450a), C4423a.df(this.f40450a));
        this.f40458i = C18266g.b(C4423a.em(this.f40450a), C4423a.en(this.f40450a));
        this.f40459j = com.tinder.chat.view.provider.ac.m50194b(C12772z.m50232c(), this.f40458i);
        this.f40460k = C12767s.m50221b(this.f40457h, C12763p.m50215c(), this.f40459j);
        this.f40452c = a_f.f33517b;
        this.f40461l = C18317d.a(a_f.f33519d);
        this.f40462m = C17281c.a(C12757c.m50197b(this.f40461l, C4423a.ew(this.f40450a), C12751u.m50183c()));
        this.f40463n = C17281c.a(C12771x.m50229c());
        this.f40464o = C17281c.a(C12762m.m50212c());
        this.f40465p = C17281c.a(C12770v.m50226c());
        this.f40466q = C17281c.a(C12716h.m50047b(a_f.f33517b, this.f40465p));
        this.f40467r = C17281c.a(C12758e.m50200c());
        this.f40468s = C17281c.a(C12720l.m50062b(a_f.f33517b, this.f40467r));
        this.f40469t = C18267n.b(C4423a.em(this.f40450a), C4423a.en(this.f40450a));
        this.f40470u = C18259m.b(C18255i.c());
        this.f40471v = C18261c.b(this.f40469t, this.f40470u);
        this.f40472w = ar.m49975b(this.f40461l, this.f40471v, C4423a.ex(this.f40450a), C4423a.ej(this.f40450a), this.f40463n, C4423a.bN(this.f40450a));
        this.f40473x = C17281c.a(C12729u.m50095b(a_f.f33517b, this.f40472w));
        this.f40474y = C12652i.m49923b(C18245d.c());
        this.f40475z = C12719k.m50057b(a_f.f33517b);
        this.f40453d = a_f.f33520e;
        this.f40424A = C17281c.a(C12759g.m50203c());
        this.f40425B = C17281c.a(C12760i.m50206c());
        this.f40426C = C12715g.m50043b(a_f.f33517b, this.f40464o);
        this.f40427D = C12713e.m50036b(a_f.f33517b, this.f40425B);
        this.f40428E = C17281c.a(C17963c.b(this.f40426C, this.f40427D));
        this.f40429F = C17281c.a(C17968b.c());
        this.f40430G = C17912i.b(C4423a.u(this.f40450a), C4423a.ew(this.f40450a));
        this.f40431H = ag.m49963b(C4423a.u(this.f40450a), C4423a.at(this.f40450a));
        this.f40432I = C17281c.a(C17944b.c());
        this.f40433J = C17949b.b(this.f40461l, C4423a.f(this.f40450a), this.f40430G, this.f40431H, this.f40432I);
        this.f40434K = C17281c.a(C17945d.c());
        this.f40435L = C17281c.a(C17971h.c());
        this.f40436M = C17281c.a(C17947c.b(this.f40433J, this.f40434K, this.f40435L, this.f40429F, this.f40424A, this.f40428E));
        this.f40437N = C17281c.a(com.tinder.chat.view.provider.aa.m50191c());
        this.f40438O = C17281c.a(C17970f.c());
        this.f40439P = C17281c.a(C17966j.b(this.f40438O));
        this.f40440Q = C17281c.a(C17983d.c());
        this.f40441R = C17281c.a(C17985i.c());
        this.f40442S = C17281c.a(C17972b.b(this.f40440Q, this.f40441R));
        this.f40443T = C17281c.a(C17982b.c());
        this.f40444U = C17281c.a(C17892b.b(a_f.f33518c, C4423a.eg(this.f40450a)));
        this.f40445V = C17281c.a(C17893c.b(a_f.f33518c, this.f40444U));
        this.f40446W = C17939i.b(this.f40445V, StrikeReactionTypesProvider_Factory.create());
        this.f40447X = C17281c.a(C17984g.b(this.f40443T, this.f40461l, this.f40446W));
        this.f40448Y = C17281c.a(C17937g.b(C4423a.ey(this.f40450a)));
        this.f40449Z = C17281c.a(C17969d.b(this.f40438O));
        this.aa = C18317d.a(a_f.f33520e);
        this.ab = C12710b.m50025b(a_f.f33517b, this.aa);
        this.ac = C17281c.a(C17959c.c());
        this.ad = C17281c.a(C17960d.b(C17991l.c(), this.ab, this.ac));
        this.ae = C17281c.a(C12717i.m50051b(a_f.f33517b, this.f40465p));
        this.af = C17281c.a(C12731w.m50102b(a_f.f33517b));
        this.ag = C17281c.a(C17927e.b(this.af, C4423a.ez(this.f40450a)));
        this.ah = C17281c.a(C17935b.b(C4423a.ey(this.f40450a)));
        this.ai = C17281c.a(C17940k.b(C4423a.ey(this.f40450a)));
        this.aj = ab.m50128b(this.ab);
        this.ak = LikeMessage_Factory.create(C4423a.bo(this.f40450a));
        this.al = UnLikeMessage_Factory.create(C4423a.bo(this.f40450a));
        this.am = C12697n.m49999b(C4423a.u(this.f40450a), C4423a.at(this.f40450a));
        this.an = C12745x.m50155b(this.ak, this.al, this.am);
        this.ao = ResendFailedMessage_Factory.create(C4423a.bo(this.f40450a));
        this.ap = ae.m49959b(C4423a.u(this.f40450a), C4423a.at(this.f40450a));
        this.aq = C12746z.m50158b(this.ao, this.ap);
        this.ar = DeleteFailedMessage_Factory.create(C4423a.bo(this.f40450a));
        this.as = C12744v.m50152b(this.ar);
        this.at = C12694k.m49994b(C4423a.u(this.f40450a), C4423a.at(this.f40450a));
        this.au = C12691h.m49989b(C4423a.u(this.f40450a), C4423a.at(this.f40450a));
        this.av = C12699p.m50003b(C4423a.u(this.f40450a), C4423a.at(this.f40450a));
        this.aw = C12701r.m50007b(C4423a.u(this.f40450a), C4423a.at(this.f40450a));
        this.ax = aa.m49953b(C4423a.u(this.f40450a), C4423a.at(this.f40450a));
        this.ay = C12711c.m50029b(a_f.f33517b, this.ab, this.f40461l, this.aj, this.an, this.aq, this.as, this.at, this.au, this.av, this.aw, this.ax);
        this.az = C12706w.m50016b(C4423a.u(this.f40450a), C4423a.at(this.f40450a));
        this.aA = C12727s.m50088b(a_f.f33517b, this.ab, this.az);
        this.aB = ak.m49971b(C4423a.u(this.f40450a), C4423a.at(this.f40450a));
        this.aC = ai.m49967b(C4423a.u(this.f40450a), C4423a.at(this.f40450a));
        this.aD = C12703t.m50011b(C4423a.u(this.f40450a), C4423a.at(this.f40450a));
        this.aE = C12743o.m50149b(this.ay, this.aA, this.aB, this.aC, this.aD);
        this.aF = C12723o.m50073b(a_f.f33517b, this.ab);
        this.aG = C17281c.a(C12740d.m50140b(this.aE, this.aF));
        this.aH = C17281c.a(C12742m.m50146b(this.aE));
        this.aI = C17281c.a(C12741g.m50143b(this.aE));
        this.aJ = af.m50134b(this.ay, this.aB, this.aC, this.aD);
        this.aK = C17281c.a(com.tinder.chat.view.action.ad.m50131b(this.aJ));
        this.aL = C17281c.a(C12739b.m50137b(this.aE));
        this.aM = C17281c.a(C12721m.m50066b(a_f.f33517b, this.f40467r));
        this.aN = C17936d.b(C4423a.bH(this.f40450a), C4423a.j(this.f40450a));
        this.aO = C17905e.b(C4423a.u(this.f40450a), C4423a.ew(this.f40450a));
        this.aP = C17899b.b(C4423a.u(this.f40450a), C4423a.ew(this.f40450a));
        this.aQ = C17956f.b(this.f40461l, C4423a.f(this.f40450a), this.f40442S, this.ae, this.aM, C4423a.bL(this.f40450a), C4423a.j(this.f40450a), this.aN, this.aO, this.aP);
        this.aR = C17281c.a(C17948e.b(this.aQ, this.f40434K));
        this.aS = C17281c.a(C17995b.c());
        this.aT = C17994c.b(this.ac, this.f40449Z);
        this.aU = C17281c.a(C17993c.b(this.aT, this.aS));
        this.aV = C17281c.a(C12761k.m50209c());
    }

    public void inject(MediaView mediaView) {
        m49471a(mediaView);
    }

    public void inject(ChatActivity chatActivity) {
        m49417a(chatActivity);
    }

    public void inject(ChatViewContainer chatViewContainer) {
        m49421a(chatViewContainer);
    }

    public void inject(ChatInputBoxContainer chatInputBoxContainer) {
        m49418a(chatInputBoxContainer);
    }

    public void inject(ChatInputEditText chatInputEditText) {
        m49456a(chatInputEditText);
    }

    public void inject(ChatToolbar chatToolbar) {
        m49420a(chatToolbar);
    }

    public void inject(InboundTextMessageView inboundTextMessageView) {
        m49425a(inboundTextMessageView);
    }

    public void inject(OutboundTextMessageView outboundTextMessageView) {
        m49428a(outboundTextMessageView);
    }

    public void inject(InboundGifMessageView inboundGifMessageView) {
        m49423a(inboundGifMessageView);
    }

    public void inject(OutboundGifMessageView outboundGifMessageView) {
        m49426a(outboundGifMessageView);
    }

    public void inject(C10633w c10633w) {
        m49452a(c10633w);
    }

    public void inject(be beVar) {
        m49441a(beVar);
    }

    public void inject(InboundImageMessageView inboundImageMessageView) {
        m49424a(inboundImageMessageView);
    }

    public void inject(OutboundImageMessageView outboundImageMessageView) {
        m49427a(outboundImageMessageView);
    }

    public void inject(EmptyChatViewContainer emptyChatViewContainer) {
        m49422a(emptyChatViewContainer);
    }

    public void inject(AdMessageChatActivity adMessageChatActivity) {
        m49453a(adMessageChatActivity);
    }

    public void inject(GrandGestureLayout grandGestureLayout) {
        m49469a(grandGestureLayout);
    }

    public void inject(C16324e c16324e) {
        m49455a(c16324e);
    }

    public void inject(GrandGestureMatchAvatarView grandGestureMatchAvatarView) {
        m49462a(grandGestureMatchAvatarView);
    }

    public void inject(C16374a c16374a) {
        m49466a(c16374a);
    }

    public void inject(C17992a c17992a) {
        m49465a(c17992a);
    }

    public void inject(GrandGestureSelectorView grandGestureSelectorView) {
        m49463a(grandGestureSelectorView);
    }

    public void inject(GrandGestureNavigationView grandGestureNavigationView) {
        m49468a(grandGestureNavigationView);
    }

    public void inject(FlingableLottieAnimationView flingableLottieAnimationView) {
        m49461a(flingableLottieAnimationView);
    }

    public void inject(C16342k c16342k) {
        m49460a(c16342k);
    }

    public void inject(SelectableGrandGestureView selectableGrandGestureView) {
        m49464a(selectableGrandGestureView);
    }

    public void inject(C14650f c14650f) {
        m49458a(c14650f);
    }

    public void inject(C16335a c16335a) {
        m49457a(c16335a);
    }

    public void inject(C16339h c16339h) {
        m49459a(c16339h);
    }

    public void inject(C10608c c10608c) {
        m49443a(c10608c);
    }

    public void inject(C10612e c10612e) {
        m49444a(c10612e);
    }

    public void inject(C10616g c10616g) {
        m49445a(c10616g);
    }

    public void inject(ao aoVar) {
        m49434a(aoVar);
    }

    public void inject(C10599a c10599a) {
        m49430a(c10599a);
    }

    public void inject(C10620k c10620k) {
        m49447a(c10620k);
    }

    public void inject(C10622m c10622m) {
        m49448a(c10622m);
    }

    public void inject(com.tinder.chat.view.message.au auVar) {
        m49437a(auVar);
    }

    public void inject(C10626q c10626q) {
        m49450a(c10626q);
    }

    public void inject(C10624o c10624o) {
        m49449a(c10624o);
    }

    public void inject(ay ayVar) {
        m49439a(ayVar);
    }

    public void inject(aw awVar) {
        m49438a(awVar);
    }

    public void inject(C10618i c10618i) {
        m49446a(c10618i);
    }

    public void inject(C10629s c10629s) {
        m49451a(c10629s);
    }

    public void inject(com.tinder.chat.view.message.ai aiVar) {
        m49431a(aiVar);
    }

    public void inject(com.tinder.chat.view.message.as asVar) {
        m49436a(asVar);
    }

    public void inject(com.tinder.chat.view.message.aq aqVar) {
        m49435a(aqVar);
    }

    public void inject(ba baVar) {
        m49440a(baVar);
    }

    public void inject(com.tinder.chat.view.message.ak akVar) {
        m49432a(akVar);
    }

    public void inject(am amVar) {
        m49433a(amVar);
    }

    public void inject(ChatInputExpandButtonView chatInputExpandButtonView) {
        m49454a(chatInputExpandButtonView);
    }

    public void inject(GestureNavigationLoadingView gestureNavigationLoadingView) {
        m49467a(gestureNavigationLoadingView);
    }

    public void inject(SpotifyChatTrackPlayerView spotifyChatTrackPlayerView) {
        m49429a(spotifyChatTrackPlayerView);
    }

    public void inject(bh bhVar) {
        m49442a(bhVar);
    }

    public void inject(ChatInputSendButtonView chatInputSendButtonView) {
        m49419a(chatInputSendButtonView);
    }

    /* renamed from: a */
    private MediaView m49471a(MediaView mediaView) {
        C17258a.a(mediaView, (C15412a) C4423a.el(this.f40450a).get());
        C17258a.a(mediaView, m49470a());
        return mediaView;
    }

    /* renamed from: a */
    private ChatActivity m49417a(ChatActivity chatActivity) {
        C10358b.m42176a((ActivityBase) chatActivity, (bk) C4423a.j(this.f40450a).get());
        C10358b.m42174a((ActivityBase) chatActivity, (C2652a) C4423a.k(this.f40450a).get());
        C10358b.m42173a((ActivityBase) chatActivity, (UserMetaManager) C4423a.l(this.f40450a).get());
        C10358b.m42172a((ActivityBase) chatActivity, (ManagerFusedLocation) C4423a.m(this.f40450a).get());
        C10358b.m42177a((ActivityBase) chatActivity, (bt) C4423a.h(this.f40450a).get());
        C10358b.m42175a((ActivityBase) chatActivity, (com.tinder.managers.af) C4423a.n(this.f40450a).get());
        C10358b.m42178a((ActivityBase) chatActivity, (C2664c) C4423a.o(this.f40450a).get());
        C10358b.m42171a((ActivityBase) chatActivity, (ManagerAnalytics) C4423a.p(this.f40450a).get());
        C10363g.m42184a((ActivitySignedInBase) chatActivity, (bk) C4423a.j(this.f40450a).get());
        C10363g.m42183a((ActivitySignedInBase) chatActivity, (ManagerProfile) C4423a.v(this.f40450a).get());
        C10363g.m42191a((ActivitySignedInBase) chatActivity, (UpdatesScheduler) C4423a.w(this.f40450a).get());
        C10363g.m42182a((ActivitySignedInBase) chatActivity, (ManagerDeepLinking) C4423a.x(this.f40450a).get());
        C10363g.m42185a((ActivitySignedInBase) chatActivity, (bq) C4423a.y(this.f40450a).get());
        C10363g.m42187a((ActivitySignedInBase) chatActivity, C4423a.z(this.f40450a));
        C10363g.m42186a((ActivitySignedInBase) chatActivity, C4423a.A(this.f40450a));
        C10363g.m42192a((ActivitySignedInBase) chatActivity, (C2664c) C4423a.B(this.f40450a).get());
        C10363g.m42189a((ActivitySignedInBase) chatActivity, (Register) C4423a.C(this.f40450a).get());
        C10363g.m42181a((ActivitySignedInBase) chatActivity, (C8259d) C4423a.D(this.f40450a).get());
        C10363g.m42188a((ActivitySignedInBase) chatActivity, C4423a.E(this.f40450a));
        C10363g.m42190a((ActivitySignedInBase) chatActivity, C4423a.F(this.f40450a));
        C10515a.m42482a(chatActivity, m49476e());
        C10515a.m42484a(chatActivity, (KeyboardHeightProvider) this.f40455f.get());
        C10515a.m42483a(chatActivity, (KeyboardHeightNotifier) this.f40456g.get());
        return chatActivity;
    }

    /* renamed from: a */
    private ChatViewContainer m49421a(ChatViewContainer chatViewContainer) {
        com.tinder.chat.view.ar.m42698a(chatViewContainer, this.f40451b);
        com.tinder.chat.view.ar.m42695a(chatViewContainer, m49478g());
        com.tinder.chat.view.ar.m42697a(chatViewContainer, m49487p());
        com.tinder.chat.view.ar.m42696a(chatViewContainer, m49488q());
        com.tinder.chat.view.ar.m42694a(chatViewContainer, m49489r());
        return chatViewContainer;
    }

    /* renamed from: a */
    private ChatInputBoxContainer m49418a(ChatInputBoxContainer chatInputBoxContainer) {
        com.tinder.chat.view.ak.m42680a(chatInputBoxContainer, m49399I());
        com.tinder.chat.view.ak.m42686a(chatInputBoxContainer, this.f40451b);
        com.tinder.chat.view.ak.m42679a(chatInputBoxContainer, m49398H());
        com.tinder.chat.view.ak.m42682a(chatInputBoxContainer, (C8507f) this.f40424A.get());
        com.tinder.chat.view.ak.m42681a(chatInputBoxContainer, m49400J());
        com.tinder.chat.view.ak.m42684a(chatInputBoxContainer, (C14629b) this.f40428E.get());
        com.tinder.chat.view.ak.m42685a(chatInputBoxContainer, (TypingIndicatorExperimentUtility) C4423a.en(this.f40450a).get());
        com.tinder.chat.view.ak.m42678a(chatInputBoxContainer, m49489r());
        com.tinder.chat.view.ak.m42683a(chatInputBoxContainer, (KeyboardHeightProvider) this.f40455f.get());
        return chatInputBoxContainer;
    }

    /* renamed from: a */
    private ChatInputEditText m49456a(ChatInputEditText chatInputEditText) {
        C16331c.a(chatInputEditText, (C14637a) this.f40429F.get());
        C16331c.a(chatInputEditText, m49401K());
        C16331c.a(chatInputEditText, (C16298b) this.f40436M.get());
        C16331c.a(chatInputEditText, m49410T());
        C16331c.a(chatInputEditText, m49489r());
        return chatInputEditText;
    }

    /* renamed from: a */
    private ChatToolbar m49420a(ChatToolbar chatToolbar) {
        com.tinder.chat.view.ao.m42691a(chatToolbar, m49411U());
        com.tinder.chat.view.ao.m42692a(chatToolbar, new C8468c());
        com.tinder.chat.view.ao.m42690a(chatToolbar, m49412V());
        return chatToolbar;
    }

    /* renamed from: a */
    private InboundTextMessageView m49425a(InboundTextMessageView inboundTextMessageView) {
        C10635y.m42894a(inboundTextMessageView, ao());
        C10635y.m42895a(inboundTextMessageView, ap());
        return inboundTextMessageView;
    }

    /* renamed from: a */
    private OutboundTextMessageView m49428a(OutboundTextMessageView outboundTextMessageView) {
        bg.m42814a(outboundTextMessageView, ar());
        bg.m42815a(outboundTextMessageView, ap());
        return outboundTextMessageView;
    }

    /* renamed from: a */
    private InboundGifMessageView m49423a(InboundGifMessageView inboundGifMessageView) {
        C10631u.m42883a(inboundGifMessageView, au());
        C10631u.m42884a(inboundGifMessageView, ap());
        return inboundGifMessageView;
    }

    /* renamed from: a */
    private OutboundGifMessageView m49426a(OutboundGifMessageView outboundGifMessageView) {
        bc.m42803a(outboundGifMessageView, av());
        bc.m42804a(outboundGifMessageView, ap());
        return outboundGifMessageView;
    }

    /* renamed from: a */
    private C10633w m49452a(C10633w c10633w) {
        C10634x.m42891a(c10633w, aw());
        C10634x.m42892a(c10633w, ap());
        return c10633w;
    }

    /* renamed from: a */
    private be m49441a(be beVar) {
        bf.m42811a(beVar, ax());
        bf.m42812a(beVar, ap());
        return beVar;
    }

    /* renamed from: a */
    private InboundImageMessageView m49424a(InboundImageMessageView inboundImageMessageView) {
        C10632v.m42886a(inboundImageMessageView, ay());
        C10632v.m42887a(inboundImageMessageView, ap());
        return inboundImageMessageView;
    }

    /* renamed from: a */
    private OutboundImageMessageView m49427a(OutboundImageMessageView outboundImageMessageView) {
        bd.m42806a(outboundImageMessageView, az());
        bd.m42807a(outboundImageMessageView, ap());
        return outboundImageMessageView;
    }

    /* renamed from: a */
    private EmptyChatViewContainer m49422a(EmptyChatViewContainer emptyChatViewContainer) {
        com.tinder.chat.view.as.m42701a(emptyChatViewContainer, aB());
        com.tinder.chat.view.as.m42702a(emptyChatViewContainer, new C8468c());
        com.tinder.chat.view.as.m42700a(emptyChatViewContainer, m49412V());
        return emptyChatViewContainer;
    }

    /* renamed from: a */
    private AdMessageChatActivity m49453a(AdMessageChatActivity adMessageChatActivity) {
        C10358b.m42176a((ActivityBase) adMessageChatActivity, (bk) C4423a.j(this.f40450a).get());
        C10358b.m42174a((ActivityBase) adMessageChatActivity, (C2652a) C4423a.k(this.f40450a).get());
        C10358b.m42173a((ActivityBase) adMessageChatActivity, (UserMetaManager) C4423a.l(this.f40450a).get());
        C10358b.m42172a((ActivityBase) adMessageChatActivity, (ManagerFusedLocation) C4423a.m(this.f40450a).get());
        C10358b.m42177a((ActivityBase) adMessageChatActivity, (bt) C4423a.h(this.f40450a).get());
        C10358b.m42175a((ActivityBase) adMessageChatActivity, (com.tinder.managers.af) C4423a.n(this.f40450a).get());
        C10358b.m42178a((ActivityBase) adMessageChatActivity, (C2664c) C4423a.o(this.f40450a).get());
        C10358b.m42171a((ActivityBase) adMessageChatActivity, (ManagerAnalytics) C4423a.p(this.f40450a).get());
        C10363g.m42184a((ActivitySignedInBase) adMessageChatActivity, (bk) C4423a.j(this.f40450a).get());
        C10363g.m42183a((ActivitySignedInBase) adMessageChatActivity, (ManagerProfile) C4423a.v(this.f40450a).get());
        C10363g.m42191a((ActivitySignedInBase) adMessageChatActivity, (UpdatesScheduler) C4423a.w(this.f40450a).get());
        C10363g.m42182a((ActivitySignedInBase) adMessageChatActivity, (ManagerDeepLinking) C4423a.x(this.f40450a).get());
        C10363g.m42185a((ActivitySignedInBase) adMessageChatActivity, (bq) C4423a.y(this.f40450a).get());
        C10363g.m42187a((ActivitySignedInBase) adMessageChatActivity, C4423a.z(this.f40450a));
        C10363g.m42186a((ActivitySignedInBase) adMessageChatActivity, C4423a.A(this.f40450a));
        C10363g.m42192a((ActivitySignedInBase) adMessageChatActivity, (C2664c) C4423a.B(this.f40450a).get());
        C10363g.m42189a((ActivitySignedInBase) adMessageChatActivity, (Register) C4423a.C(this.f40450a).get());
        C10363g.m42181a((ActivitySignedInBase) adMessageChatActivity, (C8259d) C4423a.D(this.f40450a).get());
        C10363g.m42188a((ActivitySignedInBase) adMessageChatActivity, C4423a.E(this.f40450a));
        C10363g.m42190a((ActivitySignedInBase) adMessageChatActivity, C4423a.F(this.f40450a));
        C10515a.m42482a((ChatActivity) adMessageChatActivity, m49476e());
        C10515a.m42484a((ChatActivity) adMessageChatActivity, (KeyboardHeightProvider) this.f40455f.get());
        C10515a.m42483a((ChatActivity) adMessageChatActivity, (KeyboardHeightNotifier) this.f40456g.get());
        C12117a.m48254a(adMessageChatActivity, aG());
        return adMessageChatActivity;
    }

    /* renamed from: a */
    private GrandGestureLayout m49469a(GrandGestureLayout grandGestureLayout) {
        C16390b.a(grandGestureLayout, m49484m());
        C16390b.a(grandGestureLayout, (C14633g) this.f40439P.get());
        C16390b.a(grandGestureLayout, (C14641a) this.f40442S.get());
        C16390b.a(grandGestureLayout, aH());
        C16390b.a(grandGestureLayout, aO());
        C16390b.a(grandGestureLayout, aP());
        return grandGestureLayout;
    }

    /* renamed from: a */
    private C16324e m49455a(C16324e c16324e) {
        C16325f.a(c16324e, (C14639g) this.f40435L.get());
        C16325f.a(c16324e, (C16327e) this.f40438O.get());
        C16325f.a(c16324e, aQ());
        return c16324e;
    }

    /* renamed from: a */
    private GrandGestureMatchAvatarView m49462a(GrandGestureMatchAvatarView grandGestureMatchAvatarView) {
        C16357c.a(grandGestureMatchAvatarView, aR());
        return grandGestureMatchAvatarView;
    }

    /* renamed from: a */
    private C16374a m49466a(C16374a c16374a) {
        C16375d.a(c16374a, (DrawerEventProvider) this.f40449Z.get());
        return c16374a;
    }

    /* renamed from: a */
    private C17992a m49465a(C17992a c17992a) {
        C16366b.a(c17992a, new C14647d());
        return c17992a;
    }

    /* renamed from: a */
    private GrandGestureSelectorView m49463a(GrandGestureSelectorView grandGestureSelectorView) {
        C16358d.a(grandGestureSelectorView, aS());
        C16358d.a(grandGestureSelectorView, aP());
        return grandGestureSelectorView;
    }

    /* renamed from: a */
    private GrandGestureNavigationView m49468a(GrandGestureNavigationView grandGestureNavigationView) {
        C16386b.a(grandGestureNavigationView, aT());
        return grandGestureNavigationView;
    }

    /* renamed from: a */
    private FlingableLottieAnimationView m49461a(FlingableLottieAnimationView flingableLottieAnimationView) {
        C16355a.a(flingableLottieAnimationView, aU());
        return flingableLottieAnimationView;
    }

    /* renamed from: a */
    private C16342k m49460a(C16342k c16342k) {
        C16343l.a(c16342k, aV());
        C16343l.a(c16342k, new StrikeReactionTypesProvider());
        C16343l.a(c16342k, this.f40451b);
        return c16342k;
    }

    /* renamed from: a */
    private SelectableGrandGestureView m49464a(SelectableGrandGestureView selectableGrandGestureView) {
        C16359f.a(selectableGrandGestureView, aX());
        return selectableGrandGestureView;
    }

    /* renamed from: a */
    private C14650f m49458a(C14650f c14650f) {
        C16338g.a(c14650f, (C14608a) this.ad.get());
        return c14650f;
    }

    /* renamed from: a */
    private C16335a m49457a(C16335a c16335a) {
        C16336b.a(c16335a, aY());
        C16336b.a(c16335a, this.f40451b);
        return c16335a;
    }

    /* renamed from: a */
    private C16339h m49459a(C16339h c16339h) {
        C16340i.a(c16339h, aY());
        C16340i.a(c16339h, this.f40451b);
        return c16339h;
    }

    /* renamed from: a */
    private C10608c m49443a(C10608c c10608c) {
        C10609d.m42824a(c10608c, ba());
        C10609d.m42825a(c10608c, ap());
        C10609d.m42822a(c10608c, (C8458c) this.aG.get());
        C10609d.m42823a(c10608c, (C10587l) this.aH.get());
        return c10608c;
    }

    /* renamed from: a */
    private C10612e m49444a(C10612e c10612e) {
        C10613f.m42832a(c10612e, ba());
        C10613f.m42833a(c10612e, ap());
        C10613f.m42830a(c10612e, (C8460f) this.aI.get());
        C10613f.m42831a(c10612e, (C10587l) this.aH.get());
        return c10612e;
    }

    /* renamed from: a */
    private C10616g m49445a(C10616g c10616g) {
        C10617h.m42840a(c10616g, ba());
        C10617h.m42841a(c10616g, ap());
        C10617h.m42838a(c10616g, (C8460f) this.aI.get());
        C10617h.m42839a(c10616g, (C10587l) this.aH.get());
        return c10616g;
    }

    /* renamed from: a */
    private ao m49434a(ao aoVar) {
        ap.m42754a(aoVar, bb());
        ap.m42756a(aoVar, ap());
        ap.m42755a(aoVar, (C8460f) this.aI.get());
        ap.m42753a(aoVar, (ac) this.aK.get());
        return aoVar;
    }

    /* renamed from: a */
    private C10599a m49430a(C10599a c10599a) {
        C10606b.m42794a(c10599a, ba());
        C10606b.m42795a(c10599a, ap());
        C10606b.m42792a(c10599a, (C8458c) this.aG.get());
        C10606b.m42793a(c10599a, (C10587l) this.aH.get());
        return c10599a;
    }

    /* renamed from: a */
    private C10620k m49447a(C10620k c10620k) {
        C10621l.m42853a(c10620k, ba());
        C10621l.m42854a(c10620k, ap());
        C10621l.m42851a(c10620k, (C8458c) this.aG.get());
        C10621l.m42852a(c10620k, (C10587l) this.aH.get());
        return c10620k;
    }

    /* renamed from: a */
    private C10622m m49448a(C10622m c10622m) {
        C10623n.m42860a(c10622m, ba());
        C10623n.m42861a(c10622m, ap());
        C10623n.m42858a(c10622m, (C8458c) this.aG.get());
        C10623n.m42859a(c10622m, (C10587l) this.aH.get());
        return c10622m;
    }

    /* renamed from: a */
    private com.tinder.chat.view.message.au m49437a(com.tinder.chat.view.message.au auVar) {
        com.tinder.chat.view.message.av.m42774a(auVar, bb());
        com.tinder.chat.view.message.av.m42776a(auVar, ap());
        com.tinder.chat.view.message.av.m42775a(auVar, (C8458c) this.aG.get());
        com.tinder.chat.view.message.av.m42773a(auVar, (ac) this.aK.get());
        return auVar;
    }

    /* renamed from: a */
    private C10626q m49450a(C10626q c10626q) {
        C10627r.m42874a(c10626q, ba());
        C10627r.m42875a(c10626q, ap());
        C10627r.m42872a(c10626q, (C8458c) this.aG.get());
        C10627r.m42873a(c10626q, (C10587l) this.aH.get());
        return c10626q;
    }

    /* renamed from: a */
    private C10624o m49449a(C10624o c10624o) {
        C10625p.m42867a(c10624o, ba());
        C10625p.m42868a(c10624o, ap());
        C10625p.m42865a(c10624o, (C8458c) this.aG.get());
        C10625p.m42866a(c10624o, (C10587l) this.aH.get());
        return c10624o;
    }

    /* renamed from: a */
    private ay m49439a(ay ayVar) {
        az.m42788a(ayVar, bb());
        az.m42790a(ayVar, ap());
        az.m42789a(ayVar, (C8458c) this.aG.get());
        az.m42787a(ayVar, (ac) this.aK.get());
        return ayVar;
    }

    /* renamed from: a */
    private aw m49438a(aw awVar) {
        ax.m42781a(awVar, bb());
        ax.m42783a(awVar, ap());
        ax.m42782a(awVar, (C8458c) this.aG.get());
        ax.m42780a(awVar, (ac) this.aK.get());
        return awVar;
    }

    /* renamed from: a */
    private C10618i m49446a(C10618i c10618i) {
        C10619j.m42846a(c10618i, ba());
        C10619j.m42847a(c10618i, ap());
        C10619j.m42845a(c10618i, (C8458c) this.aG.get());
        return c10618i;
    }

    /* renamed from: a */
    private C10629s m49451a(C10629s c10629s) {
        C10630t.m42880a(c10629s, ba());
        C10630t.m42881a(c10629s, ap());
        C10630t.m42879a(c10629s, (C8457a) this.aL.get());
        return c10629s;
    }

    /* renamed from: a */
    private com.tinder.chat.view.message.ai m49431a(com.tinder.chat.view.message.ai aiVar) {
        com.tinder.chat.view.message.aj.m42731a(aiVar, bb());
        com.tinder.chat.view.message.aj.m42733a(aiVar, ap());
        com.tinder.chat.view.message.aj.m42732a(aiVar, (C8458c) this.aG.get());
        com.tinder.chat.view.message.aj.m42730a(aiVar, (ac) this.aK.get());
        return aiVar;
    }

    /* renamed from: a */
    private com.tinder.chat.view.message.as m49436a(com.tinder.chat.view.message.as asVar) {
        com.tinder.chat.view.message.at.m42767a(asVar, bb());
        com.tinder.chat.view.message.at.m42769a(asVar, ap());
        com.tinder.chat.view.message.at.m42768a(asVar, (C8458c) this.aG.get());
        com.tinder.chat.view.message.at.m42766a(asVar, (ac) this.aK.get());
        return asVar;
    }

    /* renamed from: a */
    private com.tinder.chat.view.message.aq m49435a(com.tinder.chat.view.message.aq aqVar) {
        com.tinder.chat.view.message.ar.m42760a(aqVar, bb());
        com.tinder.chat.view.message.ar.m42762a(aqVar, ap());
        com.tinder.chat.view.message.ar.m42761a(aqVar, (C8458c) this.aG.get());
        return aqVar;
    }

    /* renamed from: a */
    private ba m49440a(ba baVar) {
        bb.m42800a(baVar, bb());
        bb.m42801a(baVar, ap());
        bb.m42799a(baVar, (C8457a) this.aL.get());
        return baVar;
    }

    /* renamed from: a */
    private com.tinder.chat.view.message.ak m49432a(com.tinder.chat.view.message.ak akVar) {
        com.tinder.chat.view.message.al.m42738a(akVar, bb());
        com.tinder.chat.view.message.al.m42740a(akVar, ap());
        com.tinder.chat.view.message.al.m42739a(akVar, (C8458c) this.aG.get());
        com.tinder.chat.view.message.al.m42737a(akVar, (ac) this.aK.get());
        return akVar;
    }

    /* renamed from: a */
    private am m49433a(am amVar) {
        com.tinder.chat.view.message.an.m42746a(amVar, bb());
        com.tinder.chat.view.message.an.m42748a(amVar, ap());
        com.tinder.chat.view.message.an.m42747a(amVar, (C8460f) this.aI.get());
        com.tinder.chat.view.message.an.m42745a(amVar, (ac) this.aK.get());
        return amVar;
    }

    /* renamed from: a */
    private ChatInputExpandButtonView m49454a(ChatInputExpandButtonView chatInputExpandButtonView) {
        C16311a.a(chatInputExpandButtonView, (C14599c) this.f40434K.get());
        C16311a.a(chatInputExpandButtonView, (C16298b) this.f40436M.get());
        C16311a.a(chatInputExpandButtonView, (C16299d) this.aR.get());
        return chatInputExpandButtonView;
    }

    /* renamed from: a */
    private GestureNavigationLoadingView m49467a(GestureNavigationLoadingView gestureNavigationLoadingView) {
        C16385a.a(gestureNavigationLoadingView, (C14688a) this.aS.get());
        C16385a.a(gestureNavigationLoadingView, (C16369a) this.aU.get());
        return gestureNavigationLoadingView;
    }

    /* renamed from: a */
    private SpotifyChatTrackPlayerView m49429a(SpotifyChatTrackPlayerView spotifyChatTrackPlayerView) {
        C10671c.m43008a(spotifyChatTrackPlayerView, C4423a.dD(this.f40450a));
        return spotifyChatTrackPlayerView;
    }

    /* renamed from: a */
    private bh m49442a(bh bhVar) {
        bi.m42818a(bhVar, bc());
        return bhVar;
    }

    /* renamed from: a */
    private ChatInputSendButtonView m49419a(ChatInputSendButtonView chatInputSendButtonView) {
        com.tinder.chat.view.al.m42688a(chatInputSendButtonView, (C8508j) this.aV.get());
        return chatInputSendButtonView;
    }
}
