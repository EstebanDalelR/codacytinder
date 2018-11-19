package com.tinder.recs.presenter;

import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.support.annotation.UiThread;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.view.animation.OvershootInterpolator;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.boost.model.BoostState;
import com.tinder.boost.p178a.C10400d;
import com.tinder.boost.p179b.C10403e;
import com.tinder.boost.p179b.C8338a;
import com.tinder.boost.provider.BoostUpdateProvider;
import com.tinder.boost.provider.C2639c;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.p180a.C10455d;
import com.tinder.cardstack.p180a.C10456e;
import com.tinder.cardstack.p180a.C10457f;
import com.tinder.cardstack.p180a.C10458g;
import com.tinder.cardstack.p180a.C12644b;
import com.tinder.cardstack.p180a.C12645c;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.common.navigation.Screen.C10692k;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.deeplink.p229b.C8819a;
import com.tinder.deeplink.p229b.C8819a.C8818a;
import com.tinder.domain.common.model.CommonConnection;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.profile.usecase.ObserveDiscoverySettings;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.domain.recs.model.RatingResult;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsLoadingStatus.RecsAvailable;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.RecsUpdate.ClearAll;
import com.tinder.domain.recs.model.RecsUpdate.Consume;
import com.tinder.domain.recs.model.RecsUpdate.Insert;
import com.tinder.domain.recs.model.RecsUpdate.Remove;
import com.tinder.domain.recs.model.RecsUpdate.Rewind;
import com.tinder.domain.recs.model.RecsUpdate.RewindCancel;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.Method;
import com.tinder.domain.recs.model.Swipe.SwipeActionContext;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.domain.recs.model.SwipeOrigin;
import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import com.tinder.domain.recs.model.SwipeTerminationEvent;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.superlikeable.usecase.SuperLikeOnGameRec;
import com.tinder.fireboarding.domain.C11802c;
import com.tinder.fireboarding.domain.C11817r;
import com.tinder.fireboarding.domain.C11823t;
import com.tinder.fireboarding.domain.Level;
import com.tinder.managers.bk;
import com.tinder.model.User;
import com.tinder.module.ViewScope;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.legacy.SuperlikePaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.paywall.paywallflow.C10076o.C10075b;
import com.tinder.profile.p363b.C14386k;
import com.tinder.profile.p363b.C16093z;
import com.tinder.profile.p363b.aj;
import com.tinder.profile.p363b.aj.C14373a;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.model.C16265p;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.recs.RecsCardFactory;
import com.tinder.recs.adapter.SharedRecLegacyUserAdapter;
import com.tinder.recs.analytics.AddIntroCardShakeEvent;
import com.tinder.recs.analytics.AddRecsRewindEvent;
import com.tinder.recs.analytics.AddRecsRewindEvent.AddRecsRewindEventRequest;
import com.tinder.recs.analytics.RecsSessionTracker;
import com.tinder.recs.domain.model.RewindReason;
import com.tinder.recs.domain.model.RewindReason.ManualUserAction;
import com.tinder.recs.domain.usecase.DecrementRewindsAvailable;
import com.tinder.recs.rule.AdSwipeTerminationRule;
import com.tinder.recs.rule.LocalOutOfLikesBouncerRule;
import com.tinder.recs.rule.TutorialSwipeRule;
import com.tinder.recs.target.RecsTarget;
import com.tinder.recs.usecase.CanUserRewind;
import com.tinder.recs.usecase.DeleteSuperLike;
import com.tinder.screenshot.analytics.C16562a;
import com.tinder.screenshot.analytics.C16562a.C14824a;
import com.tinder.screenshotty.C14830c;
import com.tinder.screenshotty.p401a.C14826a;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.superlike.p421e.C15082f;
import com.tinder.superlikeable.analytics.C18198b;
import com.tinder.superlikeable.analytics.C18198b.C15092a;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProvider;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier.State;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import com.tinder.util.ConnectivityProvider.NoInternetConnectionException;
import com.tinder.utils.RxUtils;
import io.reactivex.C15679f;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Single;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000î\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001:\u0002ô\u0001Bã\u0002\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u000207\u0012\u0006\u00108\u001a\u000209\u0012\u0006\u0010:\u001a\u00020;\u0012\b\b\u0001\u0010<\u001a\u00020=\u0012\u0006\u0010>\u001a\u00020?\u0012\u0006\u0010@\u001a\u00020A\u0012\u0006\u0010B\u001a\u00020C\u0012\u0006\u0010D\u001a\u00020E\u0012\u0006\u0010F\u001a\u00020G\u0012\u0006\u0010H\u001a\u00020I\u0012\u0006\u0010J\u001a\u00020K\u0012\u0006\u0010L\u001a\u00020M\u0012\u0006\u0010N\u001a\u00020O\u0012\u0006\u0010P\u001a\u00020Q\u0012\u0006\u0010R\u001a\u00020S\u0012\u0006\u0010T\u001a\u00020U\u0012\b\b\u0001\u0010V\u001a\u00020W¢\u0006\u0002\u0010XJ\u0006\u0010\u001c\u001a\u00020|J\b\u0010}\u001a\u00020|H\u0003J\b\u0010~\u001a\u00020|H\u0002J\u0012\u0010\u001a\u00020|2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020|2\b\u0010\u0001\u001a\u00030\u0001H\u0007J \u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0016\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u001e\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0007\u0010\u0001\u001a\u00020|J\u001a\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020_2\b\u0010\u0001\u001a\u00030\u0001J\u0011\u0010\u0001\u001a\u00020|2\b\u0010\u0001\u001a\u00030\u0001J\u0013\u0010\u0001\u001a\u00020|2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0010\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020_J\u0012\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020_H\u0002J\u001a\u0010\u0001\u001a\u00020f2\u000f\u0010 \u0001\u001a\n\u0012\u0005\u0012\u00030¢\u00010¡\u0001H\u0002J\u0011\u0010£\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u0001J\u001b\u0010¥\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u00012\b\u0010¦\u0001\u001a\u00030§\u0001J\u0011\u0010¨\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u0001J\u0011\u0010©\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u0001J\u0011\u0010ª\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u0001J\u0014\u0010«\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\t\u0010¬\u0001\u001a\u00020|H\u0007J\u0010\u0010­\u0001\u001a\t\u0012\u0004\u0012\u00020h0®\u0001H\u0002J\t\u0010¯\u0001\u001a\u00020|H\u0007J\t\u0010°\u0001\u001a\u00020|H\u0007J\u0011\u0010±\u0001\u001a\u00020|2\b\u0010²\u0001\u001a\u00030³\u0001J\u0011\u0010´\u0001\u001a\u00020|2\b\u0010²\u0001\u001a\u00030³\u0001J\u0012\u0010µ\u0001\u001a\u00020|2\u0007\u0010¶\u0001\u001a\u00020hH\u0002J\u0011\u0010·\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u0001J\u0013\u0010¸\u0001\u001a\u00020|2\b\u0010¹\u0001\u001a\u00030º\u0001H\u0002J\u0012\u0010»\u0001\u001a\u00020|2\u0007\u0010¶\u0001\u001a\u00020hH\u0002J\u001c\u0010¼\u0001\u001a\u00020|2\n\u0010½\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010¾\u0001\u001a\u00020fJ>\u0010¿\u0001\u001a\u00020|2\b\u0010À\u0001\u001a\u00030\u00012\u0007\u0010Á\u0001\u001a\u00020f2\u0007\u0010Â\u0001\u001a\u00020f2\u000f\u0010Ã\u0001\u001a\n\u0012\u0005\u0012\u00030Ä\u00010¡\u00012\b\u0010Å\u0001\u001a\u00030Æ\u0001J\u001d\u0010Ç\u0001\u001a\u00020|2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u001a\u0010È\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010É\u00012\u0007\u0010\u0001\u001a\u00020_H\u0002J\u0013\u0010Ë\u0001\u001a\u00020|2\b\u0010Ì\u0001\u001a\u00030Í\u0001H\u0002J\u0010\u0010Î\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020_J\u001b\u0010Ï\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u00012\b\u0010¦\u0001\u001a\u00030§\u0001J\u0011\u0010Ð\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u0001J\u0011\u0010Ñ\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u0001J\u0011\u0010Ò\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u0001J\u0007\u0010Ó\u0001\u001a\u00020|J\u001b\u0010Ô\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010®\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010Õ\u0001\u001a\u00020f2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0015\u0010Ö\u0001\u001a\u00020f2\n\u0010×\u0001\u001a\u0005\u0018\u00010Ø\u0001H\u0002J\u0013\u0010Ù\u0001\u001a\u00020|2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u000f\u0010Ú\u0001\u001a\u00020|H\u0001¢\u0006\u0003\bÛ\u0001J\u000f\u0010Ü\u0001\u001a\u00020|H\u0001¢\u0006\u0003\bÝ\u0001J\t\u0010Þ\u0001\u001a\u00020|H\u0002J\t\u0010ß\u0001\u001a\u00020|H\u0002J\t\u0010à\u0001\u001a\u00020|H\u0002J\t\u0010á\u0001\u001a\u00020|H\u0007J\t\u0010â\u0001\u001a\u00020|H\u0003J\t\u0010ã\u0001\u001a\u00020|H\u0002J\t\u0010ä\u0001\u001a\u00020|H\u0003J\t\u0010å\u0001\u001a\u00020|H\u0007J\t\u0010æ\u0001\u001a\u00020|H\u0007J\t\u0010ç\u0001\u001a\u00020|H\u0003J\t\u0010è\u0001\u001a\u00020|H\u0003J\t\u0010é\u0001\u001a\u00020|H\u0003J\t\u0010ê\u0001\u001a\u00020|H\u0002J\u001b\u0010ë\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u00012\b\u0010¦\u0001\u001a\u00030§\u0001J\u0011\u0010ì\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u0001J\u0011\u0010í\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u0001J\u0011\u0010î\u0001\u001a\u00020|2\b\u0010¤\u0001\u001a\u00030¢\u0001J\t\u0010ï\u0001\u001a\u00020|H\u0007J\t\u0010ð\u0001\u001a\u00020|H\u0007J\t\u0010ñ\u0001\u001a\u00020|H\u0007J\u0012\u0010ò\u0001\u001a\u00020|2\u0007\u0010¶\u0001\u001a\u00020hH\u0002J\u000e\u0010ó\u0001\u001a\u00020f*\u00030¢\u0001H\u0002R\u000e\u0010(\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020UX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020]X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020WX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010^\u001a\u0004\u0018\u00010_X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020SX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010`\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010a\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010b\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010c\u001a\u0004\u0018\u00010dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010g\u001a\u0004\u0018\u00010hX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010i\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020kX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010l\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010m\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010n\u001a\u0004\u0018\u00010dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010o\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010p\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010q\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010r\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010s\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010t\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010u\u001a\u00020v@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010{\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000¨\u0006õ\u0001"}, d2 = {"Lcom/tinder/recs/presenter/RecsPresenter;", "", "engineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "cardFactory", "Lcom/tinder/recs/RecsCardFactory;", "sharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "likeStatusProvider", "Lcom/tinder/tinderplus/provider/LikeStatusProvider;", "superlikeStatusProvider", "Lcom/tinder/superlike/provider/SuperlikeStatusProvider;", "swipeTutorialRule", "Lcom/tinder/recs/rule/TutorialSwipeRule;", "localOutOfLikesBouncerRule", "Lcom/tinder/recs/rule/LocalOutOfLikesBouncerRule;", "ratingProcessor", "Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;", "deepLinkedEventProvider", "Lcom/tinder/deeplink/provider/DeepLinkedEventProvider;", "sharedRecLegacyUserAdapter", "Lcom/tinder/recs/adapter/SharedRecLegacyUserAdapter;", "checkBoostPaywallTutorial", "Lcom/tinder/boost/usecase/CheckBoostPaywallTutorial;", "boostStateProvider", "Lcom/tinder/boost/provider/BoostStateProvider;", "boostInteractor", "Lcom/tinder/boost/interactor/BoostInteractor;", "activateBoost", "Lcom/tinder/boost/usecase/ActivateBoost;", "boostUpdateProvider", "Lcom/tinder/boost/provider/BoostUpdateProvider;", "tinderPlusInteractor", "Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;", "observeDiscoverySettings", "Lcom/tinder/domain/profile/usecase/ObserveDiscoverySettings;", "legacyAppRatingDialogProvider", "Lcom/tinder/apprating/legacy/LegacyAppRatingDialogProvider;", "deleteSuperLike", "Lcom/tinder/recs/usecase/DeleteSuperLike;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "addIntroCardShakeEvent", "Lcom/tinder/recs/analytics/AddIntroCardShakeEvent;", "adSwipeTerminationRule", "Lcom/tinder/recs/rule/AdSwipeTerminationRule;", "superLikeableViewStateProvider", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProvider;", "addSuperLikeableProfileInteractEvent", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableProfileInteractEvent;", "resources", "Landroid/content/res/Resources;", "notificationFactory", "Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;", "notificationDispatcher", "Lcom/tinder/pushnotifications/NotificationDispatcher;", "superLikeOnGameRec", "Lcom/tinder/domain/superlikeable/usecase/SuperLikeOnGameRec;", "superlikeInteractor", "Lcom/tinder/superlike/interactors/SuperlikeInteractor;", "recsSessionTracker", "Lcom/tinder/recs/analytics/RecsSessionTracker;", "addRecsRewindEvent", "Lcom/tinder/recs/analytics/AddRecsRewindEvent;", "completeFireboardingLevel", "Lcom/tinder/fireboarding/domain/CompleteFireboardingLevel;", "removeFireboardingRec", "Lcom/tinder/fireboarding/domain/RemoveFireboardingRec;", "screenshotty", "Lcom/tinder/screenshotty/Screenshotty;", "shouldShowNudgeAnimation", "Lcom/tinder/fireboarding/domain/ShouldShowNudgeAnimation;", "currentScreenTracker", "Lcom/tinder/common/navigation/CurrentScreenTracker;", "addAppScreenshotEvent", "Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent;", "getShareLinkUrl", "Lcom/tinder/profile/interactor/GetShareLinkUrl;", "addProfileShareEvent", "Lcom/tinder/profile/interactor/AddProfileShareEvent;", "profileShareEventFactory", "Lcom/tinder/profile/interactor/ProfileShareEventFactory;", "decrementRewindsAvailable", "Lcom/tinder/recs/domain/usecase/DecrementRewindsAvailable;", "canUserRewind", "Lcom/tinder/recs/usecase/CanUserRewind;", "computationScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/domain/recs/RecsEngineRegistry;Lcom/tinder/recs/RecsCardFactory;Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/tinderplus/provider/LikeStatusProvider;Lcom/tinder/superlike/provider/SuperlikeStatusProvider;Lcom/tinder/recs/rule/TutorialSwipeRule;Lcom/tinder/recs/rule/LocalOutOfLikesBouncerRule;Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;Lcom/tinder/deeplink/provider/DeepLinkedEventProvider;Lcom/tinder/recs/adapter/SharedRecLegacyUserAdapter;Lcom/tinder/boost/usecase/CheckBoostPaywallTutorial;Lcom/tinder/boost/provider/BoostStateProvider;Lcom/tinder/boost/interactor/BoostInteractor;Lcom/tinder/boost/usecase/ActivateBoost;Lcom/tinder/boost/provider/BoostUpdateProvider;Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;Lcom/tinder/domain/profile/usecase/ObserveDiscoverySettings;Lcom/tinder/apprating/legacy/LegacyAppRatingDialogProvider;Lcom/tinder/recs/usecase/DeleteSuperLike;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/recs/analytics/AddIntroCardShakeEvent;Lcom/tinder/recs/rule/AdSwipeTerminationRule;Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProvider;Lcom/tinder/superlikeable/analytics/AddSuperLikeableProfileInteractEvent;Landroid/content/res/Resources;Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;Lcom/tinder/pushnotifications/NotificationDispatcher;Lcom/tinder/domain/superlikeable/usecase/SuperLikeOnGameRec;Lcom/tinder/superlike/interactors/SuperlikeInteractor;Lcom/tinder/recs/analytics/RecsSessionTracker;Lcom/tinder/recs/analytics/AddRecsRewindEvent;Lcom/tinder/fireboarding/domain/CompleteFireboardingLevel;Lcom/tinder/fireboarding/domain/RemoveFireboardingRec;Lcom/tinder/screenshotty/Screenshotty;Lcom/tinder/fireboarding/domain/ShouldShowNudgeAnimation;Lcom/tinder/common/navigation/CurrentScreenTracker;Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent;Lcom/tinder/profile/interactor/GetShareLinkUrl;Lcom/tinder/profile/interactor/AddProfileShareEvent;Lcom/tinder/profile/interactor/ProfileShareEventFactory;Lcom/tinder/recs/domain/usecase/DecrementRewindsAvailable;Lcom/tinder/recs/usecase/CanUserRewind;Lio/reactivex/Scheduler;)V", "adSwipeTerminationRuleSubscription", "Lrx/Subscription;", "boostStateSubscription", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "currReferredRec", "Lcom/tinder/domain/recs/model/UserRec;", "deepLinkedBoostPaywallEventSubscription", "deepLinkedRecEventSubscription", "deepLinkedTinderPlusPaywallEventSubscription", "discoverySettingsChangesDisposable", "Lio/reactivex/disposables/Disposable;", "isBounceShowing", "", "lastRecsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "localOutOfLikesBouncerRuleSubscription", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "recsLoadingStatusSubscription", "recsUpdatesSubscription", "screenshotDisposable", "superLikeStatusSubscription", "superLikeableViewStateSubscription", "superlikeOnGameRecSubscription", "superlikeProgressSubscription", "swipeRatingStatusSubscription", "swipeTerminationEventsSubscription", "target", "Lcom/tinder/recs/target/RecsTarget;", "getTarget", "()Lcom/tinder/recs/target/RecsTarget;", "setTarget", "(Lcom/tinder/recs/target/RecsTarget;)V", "tutorialRuleSubscription", "", "bindSourceState", "deepLinkedRecLoadFailed", "deepLinkedRecReceived", "deepLinkedRecDetails", "Lcom/tinder/deeplink/provider/DeepLinkedEventProvider$DeepLinkedRecDetails;", "deleteSuperLikeOnRewind", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "getAnimationForRewind", "Lcom/tinder/cardstack/animation/SwipeAnimation;", "swipeType", "Lcom/tinder/domain/recs/model/Swipe$Type;", "swipePosition", "", "getAnimationForSwipeType", "type", "getNotificationMessage", "", "throwable", "", "name", "handleBoostClick", "handleInAppNotificationClick", "userRec", "screenshot", "Lcom/tinder/screenshotty/model/Screenshot;", "handleProfileCloseFromSuperLikeableGame", "request", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableProfileInteractEvent$Request;", "handleRewindedSwipeRatingStatus", "swipeRatingStatus", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "handleSuperlikeableGameSwipe", "insertRecAtTop", "isTopRecReferredAndNotPresented", "recs", "", "Lcom/tinder/domain/recs/model/Rec;", "likeOnAdRecFromAdClick", "rec", "likeOnRec", "swipeActionContext", "Lcom/tinder/domain/recs/model/Swipe$SwipeActionContext;", "likeOnRecFromCard", "likeOnRecFromCardStackButton", "likeOnRecFromUserProfile", "markTutorialAsSeen", "observeAdSwipeTerminationRule", "observeRecsUpdates", "Lrx/Observable;", "observeShouldShowNudgeAnimation", "observeSwipeRatingStatus", "onFireboardingRecCardAnimationComplete", "level", "Lcom/tinder/fireboarding/domain/Level;", "onFireboardingRecEntranceAnimationComplete", "onFirstRecsUpdate", "recsUpdate", "onRecPresented", "onRecsLoadingStatusUpdate", "loadingStatus", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "onRecsUpdate", "onScreenshotCaptured", "otherId", "photosPermissionEnabled", "onShareChooserCreated", "userId", "isSuperlike", "isRecTraveling", "commonConnections", "Lcom/tinder/domain/common/model/CommonConnection;", "shareInformation", "Lcom/tinder/profile/interactor/ProfileShareEventFactory$ShareInformation;", "onSuperlikeRequestFailed", "onSuperlikeRequestSuccess", "Lrx/Single;", "Lcom/tinder/pushnotifications/model/SuperlikeableNotification;", "onSwipeTerminationEvent", "terminationEvent", "Lcom/tinder/domain/recs/model/SwipeTerminationEvent;", "onUserRecClicked", "passOnRec", "passOnRecFromCard", "passOnRecFromCardStackButton", "passOnRecFromUserProfile", "rewind", "rewindSwipe", "shouldRewind", "shouldShowCardStack", "discoverySettings", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "showBouncer", "startMonitoringForScreenshots", "startMonitoringForScreenshots$Tinder_release", "subscribe", "subscribe$Tinder_release", "subscribeToBoostPaywallEvent", "subscribeToBoostState", "subscribeToDeepLinkedRecEvent", "subscribeToDiscoverySettingsChanges", "subscribeToLocalOutOfLikesBouncerEvents", "subscribeToRecsLoadingStatus", "subscribeToRecsUpdates", "subscribeToSuperLikeStatusChanges", "subscribeToSuperLikeableViewStateChanges", "subscribeToSuperlikeProgress", "subscribeToSwipeTerminationEvents", "subscribeToSwipeTutorialEvents", "subscribeToTinderPlusPaywallEvent", "superlikeOnRec", "superlikeOnRecFromCard", "superlikeOnRecFromCardStackButton", "superlikeOnRecFromUserProfile", "unSubscribeToSuperLikeStatusChanges", "unSubscribeToSuperLikeableViewStateChanges", "unsubscribe", "updateCardStackVisibilityState", "isCoreRec", "ReferredRecAppearingAnimation", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ViewScope
public final class RecsPresenter {
    private final AbTestUtility abTestUtility;
    private final C8338a activateBoost;
    private final AdSwipeTerminationRule adSwipeTerminationRule;
    private Subscription adSwipeTerminationRuleSubscription;
    private final C16562a addAppScreenshotEvent;
    private final AddIntroCardShakeEvent addIntroCardShakeEvent;
    private final C14386k addProfileShareEvent;
    private final AddRecsRewindEvent addRecsRewindEvent;
    private final C18198b addSuperLikeableProfileInteractEvent;
    private final C10400d boostInteractor;
    private final C2639c boostStateProvider;
    private Subscription boostStateSubscription;
    private final BoostUpdateProvider boostUpdateProvider;
    private final CanUserRewind canUserRewind;
    private final RecsCardFactory cardFactory;
    private final C10403e checkBoostPaywallTutorial;
    private final C11802c completeFireboardingLevel;
    private final C17356a compositeDisposable = new C17356a();
    private final C15679f computationScheduler;
    private UserRec currReferredRec;
    private final CurrentScreenTracker currentScreenTracker;
    private final DecrementRewindsAvailable decrementRewindsAvailable;
    private Subscription deepLinkedBoostPaywallEventSubscription;
    private final C8819a deepLinkedEventProvider;
    private Subscription deepLinkedRecEventSubscription;
    private Subscription deepLinkedTinderPlusPaywallEventSubscription;
    private final DeleteSuperLike deleteSuperLike;
    private Disposable discoverySettingsChangesDisposable;
    private final C16093z getShareLinkUrl;
    private boolean isBounceShowing;
    private RecsUpdate lastRecsUpdate;
    private final C8259d legacyAppRatingDialogProvider;
    private final LikeStatusProvider likeStatusProvider;
    private final LocalOutOfLikesBouncerRule localOutOfLikesBouncerRule;
    private Subscription localOutOfLikesBouncerRuleSubscription;
    private final C14550a notificationDispatcher;
    private final C14548a notificationFactory;
    private final ObserveDiscoverySettings observeDiscoverySettings;
    private final aj profileShareEventFactory;
    private final RatingProcessor ratingProcessor;
    private final RecsEngine recsEngine;
    private Subscription recsLoadingStatusSubscription;
    private final RecsSessionTracker recsSessionTracker;
    private Subscription recsUpdatesSubscription;
    private final C11817r removeFireboardingRec;
    private final Resources resources;
    private Disposable screenshotDisposable;
    private final C14830c screenshotty;
    private final bk sharedPreferences;
    private final SharedRecLegacyUserAdapter sharedRecLegacyUserAdapter;
    private final C11823t shouldShowNudgeAnimation;
    private final SuperLikeOnGameRec superLikeOnGameRec;
    private Subscription superLikeStatusSubscription;
    private final SuperLikeableViewStateProvider superLikeableViewStateProvider;
    private Subscription superLikeableViewStateSubscription;
    private final C15071e superlikeInteractor;
    private Subscription superlikeOnGameRecSubscription;
    private Subscription superlikeProgressSubscription;
    private final C15082f superlikeStatusProvider;
    private Subscription swipeRatingStatusSubscription;
    private Subscription swipeTerminationEventsSubscription;
    private final TutorialSwipeRule swipeTutorialRule;
    @DeadshotTarget
    @NotNull
    public RecsTarget target;
    private final C15193i tinderPlusInteractor;
    private Subscription tutorialRuleSubscription;

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[BoostState.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$10 = new int[Type.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$2 = new int[Type.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$3 = new int[Type.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$4 = new int[RatingResult.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$5 = new int[Type.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$6 = new int[SwipeTerminationEvent.Type.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$7 = new int[Type.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$8 = new int[Type.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$9 = new int[Type.values().length];

        static {
            $EnumSwitchMapping$0[BoostState.BOOSTING.ordinal()] = 1;
            $EnumSwitchMapping$1[State.MOVED_TO_TOP.ordinal()] = 1;
            $EnumSwitchMapping$1[State.LAYOUT_COMPLETE.ordinal()] = 2;
            $EnumSwitchMapping$2[Type.LIKE.ordinal()] = 1;
            $EnumSwitchMapping$2[Type.SUPERLIKE.ordinal()] = 2;
            $EnumSwitchMapping$3[Type.LIKE.ordinal()] = 1;
            $EnumSwitchMapping$3[Type.SUPERLIKE.ordinal()] = 2;
            $EnumSwitchMapping$4[RatingResult.ERROR.ordinal()] = 1;
            $EnumSwitchMapping$4[RatingResult.BOUNCER.ordinal()] = 2;
            $EnumSwitchMapping$5[Type.LIKE.ordinal()] = 1;
            $EnumSwitchMapping$5[Type.SUPERLIKE.ordinal()] = 2;
            $EnumSwitchMapping$6[SwipeTerminationEvent.Type.LEGALLY_INTERRUPTED_FREEZE.ordinal()] = 1;
            $EnumSwitchMapping$6[SwipeTerminationEvent.Type.LEGALLY_INTERRUPTED_REVERT_PRE_CONSUMPTION.ordinal()] = 2;
            $EnumSwitchMapping$6[SwipeTerminationEvent.Type.ILLEGALLY_INTERRUPTED_PRE_CONSUMPTION.ordinal()] = 3;
            $EnumSwitchMapping$6[SwipeTerminationEvent.Type.COMPLETED.ordinal()] = 4;
            $EnumSwitchMapping$6[SwipeTerminationEvent.Type.LEGALLY_INTERRUPTED_REVERT_POST_CONSUMPTION.ordinal()] = 5;
            $EnumSwitchMapping$6[SwipeTerminationEvent.Type.ILLEGALLY_INTERRUPTED_POST_CONSUMPTION.ordinal()] = 6;
            $EnumSwitchMapping$7[Type.LIKE.ordinal()] = 1;
            $EnumSwitchMapping$7[Type.PASS.ordinal()] = 2;
            $EnumSwitchMapping$7[Type.SUPERLIKE.ordinal()] = 3;
            $EnumSwitchMapping$8[Type.LIKE.ordinal()] = 1;
            $EnumSwitchMapping$8[Type.PASS.ordinal()] = 2;
            $EnumSwitchMapping$8[Type.SUPERLIKE.ordinal()] = 3;
            $EnumSwitchMapping$9[Type.LIKE.ordinal()] = 1;
            $EnumSwitchMapping$9[Type.SUPERLIKE.ordinal()] = 2;
            $EnumSwitchMapping$10[Type.LIKE.ordinal()] = 1;
            $EnumSwitchMapping$10[Type.PASS.ordinal()] = 2;
            $EnumSwitchMapping$10[Type.SUPERLIKE.ordinal()] = 3;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/recs/presenter/RecsPresenter$ReferredRecAppearingAnimation;", "Lcom/tinder/cardstack/animation/SwipeAnimation;", "()V", "endRotation", "", "interpolator", "Landroid/animation/TimeInterpolator;", "startRotation", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private static final class ReferredRecAppearingAnimation extends C8361a {
        public static final Companion Companion = new Companion();
        private static final float END_ROTATION_DEGREE = 0.0f;
        private static final float START_ROTATION_DEGREE = 30.0f;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/recs/presenter/RecsPresenter$ReferredRecAppearingAnimation$Companion;", "", "()V", "END_ROTATION_DEGREE", "", "START_ROTATION_DEGREE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        public static final class Companion {
            private Companion() {
            }
        }

        public float endRotation() {
            return 0.0f;
        }

        public float startRotation() {
            return START_ROTATION_DEGREE;
        }

        @Nullable
        public TimeInterpolator interpolator() {
            return new OvershootInterpolator();
        }
    }

    @Inject
    public RecsPresenter(@NotNull RecsEngineRegistry recsEngineRegistry, @NotNull RecsCardFactory recsCardFactory, @NotNull bk bkVar, @NotNull LikeStatusProvider likeStatusProvider, @NotNull C15082f c15082f, @NotNull TutorialSwipeRule tutorialSwipeRule, @NotNull LocalOutOfLikesBouncerRule localOutOfLikesBouncerRule, @NotNull RatingProcessor ratingProcessor, @NotNull C8819a c8819a, @NotNull SharedRecLegacyUserAdapter sharedRecLegacyUserAdapter, @NotNull C10403e c10403e, @NotNull C2639c c2639c, @NotNull C10400d c10400d, @NotNull C8338a c8338a, @NotNull BoostUpdateProvider boostUpdateProvider, @NotNull C15193i c15193i, @NotNull ObserveDiscoverySettings observeDiscoverySettings, @NotNull C8259d c8259d, @NotNull DeleteSuperLike deleteSuperLike, @NotNull AbTestUtility abTestUtility, @NotNull AddIntroCardShakeEvent addIntroCardShakeEvent, @NotNull AdSwipeTerminationRule adSwipeTerminationRule, @NotNull SuperLikeableViewStateProvider superLikeableViewStateProvider, @NotNull C18198b c18198b, @NotNull Resources resources, @NotNull C14548a c14548a, @NotNull C14550a c14550a, @NotNull SuperLikeOnGameRec superLikeOnGameRec, @NotNull C15071e c15071e, @NotNull @Named("core") RecsSessionTracker recsSessionTracker, @NotNull AddRecsRewindEvent addRecsRewindEvent, @NotNull C11802c c11802c, @NotNull C11817r c11817r, @NotNull C14830c c14830c, @NotNull C11823t c11823t, @NotNull CurrentScreenTracker currentScreenTracker, @NotNull C16562a c16562a, @NotNull C16093z c16093z, @NotNull C14386k c14386k, @NotNull aj ajVar, @NotNull DecrementRewindsAvailable decrementRewindsAvailable, @NotNull CanUserRewind canUserRewind, @NotNull @ComputationScheduler C15679f c15679f) {
        RecsPresenter recsPresenter = this;
        RecsCardFactory recsCardFactory2 = recsCardFactory;
        bk bkVar2 = bkVar;
        LikeStatusProvider likeStatusProvider2 = likeStatusProvider;
        C15082f c15082f2 = c15082f;
        TutorialSwipeRule tutorialSwipeRule2 = tutorialSwipeRule;
        LocalOutOfLikesBouncerRule localOutOfLikesBouncerRule2 = localOutOfLikesBouncerRule;
        RatingProcessor ratingProcessor2 = ratingProcessor;
        C8819a c8819a2 = c8819a;
        SharedRecLegacyUserAdapter sharedRecLegacyUserAdapter2 = sharedRecLegacyUserAdapter;
        C10403e c10403e2 = c10403e;
        C2639c c2639c2 = c2639c;
        C10400d c10400d2 = c10400d;
        C8338a c8338a2 = c8338a;
        BoostUpdateProvider boostUpdateProvider2 = boostUpdateProvider;
        C15193i c15193i2 = c15193i;
        C2668g.b(recsEngineRegistry, "engineRegistry");
        C2668g.b(recsCardFactory2, "cardFactory");
        C2668g.b(bkVar2, "sharedPreferences");
        C2668g.b(likeStatusProvider2, "likeStatusProvider");
        C2668g.b(c15082f2, "superlikeStatusProvider");
        C2668g.b(tutorialSwipeRule2, "swipeTutorialRule");
        C2668g.b(localOutOfLikesBouncerRule2, "localOutOfLikesBouncerRule");
        C2668g.b(ratingProcessor2, "ratingProcessor");
        C2668g.b(c8819a2, "deepLinkedEventProvider");
        C2668g.b(sharedRecLegacyUserAdapter2, "sharedRecLegacyUserAdapter");
        C2668g.b(c10403e2, "checkBoostPaywallTutorial");
        C2668g.b(c2639c2, "boostStateProvider");
        C2668g.b(c10400d2, "boostInteractor");
        C2668g.b(c8338a2, "activateBoost");
        C2668g.b(boostUpdateProvider2, "boostUpdateProvider");
        C2668g.b(c15193i, "tinderPlusInteractor");
        C2668g.b(observeDiscoverySettings, "observeDiscoverySettings");
        C2668g.b(c8259d, "legacyAppRatingDialogProvider");
        C2668g.b(deleteSuperLike, "deleteSuperLike");
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(addIntroCardShakeEvent, "addIntroCardShakeEvent");
        C2668g.b(adSwipeTerminationRule, "adSwipeTerminationRule");
        C2668g.b(superLikeableViewStateProvider, "superLikeableViewStateProvider");
        C2668g.b(c18198b, "addSuperLikeableProfileInteractEvent");
        C2668g.b(resources, "resources");
        C2668g.b(c14548a, "notificationFactory");
        C2668g.b(c14550a, "notificationDispatcher");
        C2668g.b(superLikeOnGameRec, "superLikeOnGameRec");
        C2668g.b(c15071e, "superlikeInteractor");
        C2668g.b(recsSessionTracker, "recsSessionTracker");
        C2668g.b(addRecsRewindEvent, "addRecsRewindEvent");
        C2668g.b(c11802c, "completeFireboardingLevel");
        C2668g.b(c11817r, "removeFireboardingRec");
        C2668g.b(c14830c, "screenshotty");
        C2668g.b(c11823t, "shouldShowNudgeAnimation");
        C2668g.b(currentScreenTracker, "currentScreenTracker");
        C2668g.b(c16562a, "addAppScreenshotEvent");
        C2668g.b(c16093z, "getShareLinkUrl");
        C2668g.b(c14386k, "addProfileShareEvent");
        C2668g.b(ajVar, "profileShareEventFactory");
        C2668g.b(decrementRewindsAvailable, "decrementRewindsAvailable");
        C2668g.b(canUserRewind, "canUserRewind");
        C2668g.b(c15679f, "computationScheduler");
        C15193i c15193i3 = c15193i;
        this.cardFactory = recsCardFactory2;
        this.sharedPreferences = bkVar2;
        this.likeStatusProvider = likeStatusProvider2;
        this.superlikeStatusProvider = c15082f2;
        this.swipeTutorialRule = tutorialSwipeRule2;
        this.localOutOfLikesBouncerRule = localOutOfLikesBouncerRule2;
        this.ratingProcessor = ratingProcessor2;
        this.deepLinkedEventProvider = c8819a2;
        this.sharedRecLegacyUserAdapter = sharedRecLegacyUserAdapter2;
        this.checkBoostPaywallTutorial = c10403e2;
        this.boostStateProvider = c2639c2;
        this.boostInteractor = c10400d2;
        this.activateBoost = c8338a2;
        this.boostUpdateProvider = boostUpdateProvider2;
        this.tinderPlusInteractor = c15193i3;
        C8259d c8259d2 = c8259d;
        this.observeDiscoverySettings = observeDiscoverySettings;
        this.legacyAppRatingDialogProvider = c8259d2;
        AbTestUtility abTestUtility2 = abTestUtility;
        this.deleteSuperLike = deleteSuperLike;
        this.abTestUtility = abTestUtility2;
        AdSwipeTerminationRule adSwipeTerminationRule2 = adSwipeTerminationRule;
        this.addIntroCardShakeEvent = addIntroCardShakeEvent;
        this.adSwipeTerminationRule = adSwipeTerminationRule2;
        C18198b c18198b2 = c18198b;
        this.superLikeableViewStateProvider = superLikeableViewStateProvider;
        this.addSuperLikeableProfileInteractEvent = c18198b2;
        C14548a c14548a2 = c14548a;
        this.resources = resources;
        this.notificationFactory = c14548a2;
        SuperLikeOnGameRec superLikeOnGameRec2 = superLikeOnGameRec;
        this.notificationDispatcher = c14550a;
        this.superLikeOnGameRec = superLikeOnGameRec2;
        RecsSessionTracker recsSessionTracker2 = recsSessionTracker;
        this.superlikeInteractor = c15071e;
        this.recsSessionTracker = recsSessionTracker2;
        C11802c c11802c2 = c11802c;
        this.addRecsRewindEvent = addRecsRewindEvent;
        this.completeFireboardingLevel = c11802c2;
        C14830c c14830c2 = c14830c;
        this.removeFireboardingRec = c11817r;
        this.screenshotty = c14830c2;
        CurrentScreenTracker currentScreenTracker2 = currentScreenTracker;
        this.shouldShowNudgeAnimation = c11823t;
        this.currentScreenTracker = currentScreenTracker2;
        C16093z c16093z2 = c16093z;
        this.addAppScreenshotEvent = c16562a;
        this.getShareLinkUrl = c16093z2;
        aj ajVar2 = ajVar;
        this.addProfileShareEvent = c14386k;
        this.profileShareEventFactory = ajVar2;
        CanUserRewind canUserRewind2 = canUserRewind;
        this.decrementRewindsAvailable = decrementRewindsAvailable;
        this.canUserRewind = canUserRewind2;
        this.computationScheduler = c15679f;
        RecsEngine engine = recsEngineRegistry.getEngine(Core.INSTANCE);
        if (engine == null) {
            throw new IllegalArgumentException("Core Engine is not added.".toString());
        }
        recsPresenter.recsEngine = engine;
    }

    @NotNull
    @VisibleForTesting
    public final RecsTarget getTarget() {
        RecsTarget recsTarget = this.target;
        if (recsTarget == null) {
            C2668g.b("target");
        }
        return recsTarget;
    }

    public final void setTarget(@NotNull RecsTarget recsTarget) {
        C2668g.b(recsTarget, "<set-?>");
        this.target = recsTarget;
    }

    public final void likeOnRecFromCard(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        likeOnRec(rec, new SwipeActionContext(SwipeOrigin.CARD_STACK, SwipeMethod.CARD));
    }

    public final void likeOnAdRecFromAdClick(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        likeOnRec(rec, new SwipeActionContext(SwipeOrigin.CARD_STACK, SwipeMethod.AD_CLICK));
    }

    public final void passOnRecFromCard(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        passOnRec(rec, new SwipeActionContext(SwipeOrigin.CARD_STACK, SwipeMethod.CARD));
    }

    public final void superlikeOnRecFromCard(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        superlikeOnRec(rec, new SwipeActionContext(SwipeOrigin.CARD_STACK, SwipeMethod.CARD));
    }

    public final void likeOnRecFromCardStackButton(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        likeOnRec(rec, new SwipeActionContext(SwipeOrigin.CARD_STACK, SwipeMethod.GAMEPAD_BUTTON));
    }

    public final void passOnRecFromCardStackButton(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        passOnRec(rec, new SwipeActionContext(SwipeOrigin.CARD_STACK, SwipeMethod.GAMEPAD_BUTTON));
    }

    public final void superlikeOnRecFromCardStackButton(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        superlikeOnRec(rec, new SwipeActionContext(SwipeOrigin.CARD_STACK, SwipeMethod.GAMEPAD_BUTTON));
    }

    public final void likeOnRecFromUserProfile(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        likeOnRec(rec, new SwipeActionContext(SwipeOrigin.USER_PROFILE, SwipeMethod.GAMEPAD_BUTTON));
    }

    public final void passOnRecFromUserProfile(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        passOnRec(rec, new SwipeActionContext(SwipeOrigin.USER_PROFILE, SwipeMethod.GAMEPAD_BUTTON));
    }

    public final void superlikeOnRecFromUserProfile(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        superlikeOnRec(rec, new SwipeActionContext(SwipeOrigin.USER_PROFILE, SwipeMethod.GAMEPAD_BUTTON));
    }

    public final void likeOnRec(@NotNull Rec rec, @NotNull SwipeActionContext swipeActionContext) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeActionContext, "swipeActionContext");
        RecsTarget recsTarget = this.target;
        if (recsTarget == null) {
            C2668g.b("target");
        }
        recsTarget.disableSwipes();
        this.recsEngine.processLikeOnRec(rec, swipeActionContext);
    }

    public final void passOnRec(@NotNull Rec rec, @NotNull SwipeActionContext swipeActionContext) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeActionContext, "swipeActionContext");
        RecsTarget recsTarget = this.target;
        if (recsTarget == null) {
            C2668g.b("target");
        }
        recsTarget.disableSwipes();
        this.recsEngine.processPassOnRec(rec, swipeActionContext);
    }

    public final void superlikeOnRec(@NotNull Rec rec, @NotNull SwipeActionContext swipeActionContext) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeActionContext, "swipeActionContext");
        if (RecFieldDecorationExtensionsKt.isSuperLikeable(rec)) {
            if (!this.superlikeStatusProvider.m56835b()) {
                RecsTarget recsTarget = this.target;
                if (recsTarget == null) {
                    C2668g.b("target");
                }
                recsTarget.disableSwipes();
                this.recsEngine.processSuperlikeOnRec(rec, swipeActionContext);
            }
        }
    }

    public final void rewind() {
        this.compositeDisposable.add(this.canUserRewind.execute().b(C15756a.m59010b()).a(C15674a.m58830a()).a(new RecsPresenter$rewind$1(this), RecsPresenter$rewind$2.INSTANCE));
    }

    public final void handleBoostClick() {
        C3960g a = this.checkBoostPaywallTutorial.execute().b(C15756a.m59010b()).a(C15674a.m58830a());
        Consumer recsPresenter$handleBoostClick$1 = new RecsPresenter$handleBoostClick$1(this);
        Function1 function1 = RecsPresenter$handleBoostClick$2.INSTANCE;
        if (function1 != null) {
            function1 = new RecsPresenterKt$sam$io_reactivex_functions_Consumer$0(function1);
        }
        this.compositeDisposable.add(a.a(recsPresenter$handleBoostClick$1, (Consumer) function1));
    }

    public final void activateBoost() {
        this.activateBoost.a().b(Schedulers.io()).a(RecsPresenter$activateBoost$1.INSTANCE, RecsPresenter$activateBoost$2.INSTANCE);
    }

    public final void handleProfileCloseFromSuperLikeableGame(@NotNull C15092a c15092a) {
        C2668g.b(c15092a, "request");
        this.addSuperLikeableProfileInteractEvent.m65977a(c15092a);
    }

    public final void onRecPresented(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        this.recsSessionTracker.addRecViewed(rec);
    }

    public final void onUserRecClicked(@NotNull UserRec userRec) {
        C2668g.b(userRec, "userRec");
        this.recsSessionTracker.addRecProfileOpened(userRec);
    }

    public final void handleSuperlikeableGameSwipe(@NotNull UserRec userRec) {
        C2668g.b(userRec, "userRec");
        if (!RxUtils.a(this.superlikeOnGameRecSubscription)) {
            this.superlikeOnGameRecSubscription = this.superLikeOnGameRec.execute(userRec).b(Single.b(new RecsPresenter$handleSuperlikeableGameSwipe$1(this, userRec))).b(Schedulers.io()).a(new RecsPresenter$handleSuperlikeableGameSwipe$2(this), new RecsPresenter$handleSuperlikeableGameSwipe$3(this, userRec));
        }
    }

    public final void onFireboardingRecEntranceAnimationComplete(@NotNull Level level) {
        C2668g.b(level, "level");
        this.removeFireboardingRec.a(level);
    }

    public final void onFireboardingRecCardAnimationComplete(@NotNull Level level) {
        C2668g.b(level, "level");
        this.completeFireboardingLevel.a(level).b(20, TimeUnit.MILLISECONDS, this.computationScheduler).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new RecsPresenter$onFireboardingRecCardAnimationComplete$1(this, level), new RecsPresenter$onFireboardingRecCardAnimationComplete$2(this, level));
    }

    @Take
    public final void subscribe$Tinder_release() {
        subscribeToRecsUpdates();
        subscribeToRecsLoadingStatus();
        subscribeToSwipeTerminationEvents();
        subscribeToSuperlikeProgress();
        subscribeToSwipeTutorialEvents();
        subscribeToLocalOutOfLikesBouncerEvents();
        subscribeToDeepLinkedRecEvent();
        subscribeToTinderPlusPaywallEvent();
        subscribeToBoostPaywallEvent();
        subscribeToBoostState();
        this.recsEngine.resume();
    }

    @Take
    public final void startMonitoringForScreenshots$Tinder_release() {
        Disposable disposable = this.screenshotDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        C3959e withLatestFrom = this.screenshotty.m56190c().observeOn(C15674a.m58830a()).withLatestFrom(this.currentScreenTracker.observe(), new RecsPresenter$startMonitoringForScreenshots$1(this));
        Consumer consumer = RecsPresenter$startMonitoringForScreenshots$2.INSTANCE;
        Function1 function1 = RecsPresenter$startMonitoringForScreenshots$3.INSTANCE;
        if (function1 != null) {
            function1 = new RecsPresenterKt$sam$io_reactivex_functions_Consumer$0(function1);
        }
        this.screenshotDisposable = withLatestFrom.subscribe(consumer, (Consumer) function1);
    }

    @Take
    public final void observeSwipeRatingStatus() {
        if (!RxUtils.a(this.swipeRatingStatusSubscription)) {
            this.swipeRatingStatusSubscription = this.ratingProcessor.observeSwipeRatingStatus().a(Schedulers.io()).f(RecsPresenter$observeSwipeRatingStatus$1.INSTANCE).a(Ended.class).f(new RecsPresenter$observeSwipeRatingStatus$2(this)).f(new RecsPresenter$observeSwipeRatingStatus$3(this)).h(new RecsPresenter$observeSwipeRatingStatus$4(this)).a(C19397a.a()).a(new RecsPresenter$observeSwipeRatingStatus$5(this), RecsPresenter$observeSwipeRatingStatus$6.INSTANCE);
        }
    }

    @Drop
    public final void unsubscribe() {
        RxUtils.b(this.tutorialRuleSubscription);
        RxUtils.b(this.localOutOfLikesBouncerRuleSubscription);
        RxUtils.b(this.recsUpdatesSubscription);
        RxUtils.b(this.recsLoadingStatusSubscription);
        RxUtils.b(this.swipeTerminationEventsSubscription);
        RxUtils.b(this.swipeRatingStatusSubscription);
        RxUtils.b(this.superlikeProgressSubscription);
        RxUtils.b(this.deepLinkedRecEventSubscription);
        RxUtils.b(this.deepLinkedTinderPlusPaywallEventSubscription);
        RxUtils.b(this.deepLinkedBoostPaywallEventSubscription);
        RxUtils.b(this.boostStateSubscription);
        RxUtils.b(this.adSwipeTerminationRuleSubscription);
        RxUtils.b(this.superlikeOnGameRecSubscription);
        Disposable disposable = this.discoverySettingsChangesDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        disposable = this.screenshotDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.recsEngine.pause();
        this.compositeDisposable.m63446a();
    }

    @Take
    public final void observeAdSwipeTerminationRule() {
        this.adSwipeTerminationRuleSubscription = this.adSwipeTerminationRule.observe().a(RxUtils.a()).a(new RecsPresenter$observeAdSwipeTerminationRule$1(this), RecsPresenter$observeAdSwipeTerminationRule$2.INSTANCE);
    }

    @Take
    public final void observeShouldShowNudgeAnimation() {
        this.compositeDisposable.add(this.shouldShowNudgeAnimation.execute().a(new C16397x4e2b53f4(this)).a(C16398x4e2b53f5.INSTANCE).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C16399x4e2b53f6(this), C16400x4e2b53f7.INSTANCE));
    }

    @Take
    public final void subscribeToDiscoverySettingsChanges() {
        this.discoverySettingsChangesDisposable = this.observeDiscoverySettings.execute().subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new RecsPresenter$subscribeToDiscoverySettingsChanges$1(this), RecsPresenter$subscribeToDiscoverySettingsChanges$2.INSTANCE);
    }

    public final void handleInAppNotificationClick(@NotNull UserRec userRec, @NotNull C14826a c14826a) {
        C2668g.b(userRec, "userRec");
        C2668g.b(c14826a, "screenshot");
        C16093z c16093z = this.getShareLinkUrl;
        String id = userRec.getUser().id();
        C2668g.a(id, "userRec.user.id()");
        C3959e observeOn = c16093z.m60896a(id).subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a());
        Consumer recsPresenter$handleInAppNotificationClick$1 = new RecsPresenter$handleInAppNotificationClick$1(this, c14826a, userRec);
        userRec = (Function1) RecsPresenter$handleInAppNotificationClick$2.INSTANCE;
        if (userRec != null) {
            userRec = new RecsPresenterKt$sam$io_reactivex_functions_Consumer$0(userRec);
        }
        observeOn.subscribe(recsPresenter$handleInAppNotificationClick$1, (Consumer) userRec);
    }

    @UiThread
    private final void subscribeToRecsUpdates() {
        if (!RxUtils.a(this.recsUpdatesSubscription)) {
            this.recsUpdatesSubscription = observeRecsUpdates().a(C19397a.a()).a(new RecsPresenter$subscribeToRecsUpdates$1(this), RecsPresenter$subscribeToRecsUpdates$2.INSTANCE);
        }
    }

    private final void subscribeToRecsLoadingStatus() {
        if (!RxUtils.a(this.recsLoadingStatusSubscription)) {
            RecsTarget recsTarget = this.target;
            if (recsTarget == null) {
                C2668g.b("target");
            }
            recsTarget.hideHeartsAnimation();
            this.recsLoadingStatusSubscription = this.recsEngine.observeLoadingStatusUpdates().a(C19397a.a()).a(new RecsPresenter$subscribeToRecsLoadingStatus$1(this), RecsPresenter$subscribeToRecsLoadingStatus$2.INSTANCE);
        }
    }

    private final void onRecsLoadingStatusUpdate(RecsLoadingStatus recsLoadingStatus) {
        if ((C2668g.a(recsLoadingStatus, RecsAvailable.INSTANCE) ^ 1) != null) {
            recsLoadingStatus = this.target;
            if (recsLoadingStatus == null) {
                C2668g.b("target");
            }
            recsLoadingStatus.hideHeartsAnimation();
            return;
        }
        recsLoadingStatus = this.target;
        if (recsLoadingStatus == null) {
            C2668g.b("target");
        }
        recsLoadingStatus.showHeartsAnimation();
    }

    private final Observable<RecsUpdate> observeRecsUpdates() {
        if (this.lastRecsUpdate == null) {
            return this.recsEngine.observeRecsUpdates();
        }
        RecsEngine recsEngine = this.recsEngine;
        RecsUpdate recsUpdate = this.lastRecsUpdate;
        if (recsUpdate == null) {
            C2668g.a();
        }
        return recsEngine.observeRecsUpdatesSince(recsUpdate);
    }

    @UiThread
    private final void subscribeToSwipeTerminationEvents() {
        if (!RxUtils.a(this.swipeTerminationEventsSubscription)) {
            this.swipeTerminationEventsSubscription = this.recsEngine.observeSwipeTerminationEvents().a(C19397a.a()).a(new RecsPresenter$subscribeToSwipeTerminationEvents$1(this), RecsPresenter$subscribeToSwipeTerminationEvents$2.INSTANCE);
        }
    }

    @UiThread
    @Take
    public final void subscribeToSuperLikeableViewStateChanges() {
        if (!RxUtils.a(this.superLikeableViewStateSubscription)) {
            this.superLikeableViewStateSubscription = this.superLikeableViewStateProvider.observe().a(C19397a.a()).a(new RecsPresenter$subscribeToSuperLikeableViewStateChanges$1(this), new RecsPresenter$subscribeToSuperLikeableViewStateChanges$2(this));
        }
    }

    @Drop
    public final void unSubscribeToSuperLikeableViewStateChanges() {
        RxUtils.b(this.superLikeableViewStateSubscription);
    }

    @Take
    public final void subscribeToSuperLikeStatusChanges() {
        if (!RxUtils.a(this.superLikeStatusSubscription)) {
            this.superLikeStatusSubscription = this.superlikeStatusProvider.m56838e().a(C19397a.a()).a(new RecsPresenter$subscribeToSuperLikeStatusChanges$1(this), RecsPresenter$subscribeToSuperLikeStatusChanges$2.INSTANCE);
        }
    }

    @Drop
    public final void unSubscribeToSuperLikeStatusChanges() {
        RxUtils.b(this.superLikeStatusSubscription);
    }

    public final void onScreenshotCaptured(@Nullable String str, boolean z) {
        this.addAppScreenshotEvent.m61992a(new C14824a(C10692k.f35033a, null, str, z));
    }

    public final void onShareChooserCreated(@NotNull String str, boolean z, boolean z2, @NotNull List<? extends CommonConnection> list, @NotNull C14373a c14373a) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(list, "commonConnections");
        C2668g.b(c14373a, "shareInformation");
        this.addProfileShareEvent.m54805a(this.profileShareEventFactory.m54764a(str, z, z2, list, c14373a));
    }

    private final void onSuperlikeRequestFailed(Throwable th, String str) {
        this.notificationDispatcher.m55573a((TinderNotification) this.notificationFactory.m55569b(getNotificationMessage(th, str), this.resources.getString(R.string.super_likeable)));
    }

    private final Single<C16265p> onSuperlikeRequestSuccess(UserRec userRec) {
        String url;
        C14548a c14548a;
        String string;
        List photos = userRec.getUser().photos();
        C2668g.a(photos, "userRec.user.photos()");
        Photo photo = (Photo) C19299w.m68831g(photos);
        if (photo != null) {
            url = photo.url();
            if (url != null) {
                c14548a = this.notificationFactory;
                string = this.resources.getString(R.string.superlikeable_notification_message, new Object[]{userRec.getName()});
                C2668g.a(string, "resources.getString(R.st…on_message, userRec.name)");
                return c14548a.m55566a(string, this.resources.getString(R.string.super_likeable), url);
            }
        }
        url = "";
        c14548a = this.notificationFactory;
        string = this.resources.getString(R.string.superlikeable_notification_message, new Object[]{userRec.getName()});
        C2668g.a(string, "resources.getString(R.st…on_message, userRec.name)");
        return c14548a.m55566a(string, this.resources.getString(R.string.super_likeable), url);
    }

    private final String getNotificationMessage(Throwable th, String str) {
        if ((th instanceof NoInternetConnectionException) != null) {
            th = this.resources.getString(R.string.error_no_connection);
            C2668g.a(th, "resources.getString(R.string.error_no_connection)");
            return th;
        }
        th = this.resources.getString(R.string.superlikeable_notification_error, new Object[]{str});
        C2668g.a(th, "resources.getString(R.st…notification_error, name)");
        return th;
    }

    @UiThread
    private final void subscribeToSuperlikeProgress() {
        if (!RxUtils.a(this.superlikeProgressSubscription)) {
            this.superlikeProgressSubscription = this.superlikeStatusProvider.m56831a().a(C19397a.a()).f(RecsPresenter$subscribeToSuperlikeProgress$1.INSTANCE).h(new RecsPresenter$subscribeToSuperlikeProgress$2(this)).a(new RecsPresenter$subscribeToSuperlikeProgress$3(this), RecsPresenter$subscribeToSuperlikeProgress$4.INSTANCE);
        }
    }

    private final boolean isCoreRec(@NotNull Rec rec) {
        return rec.getSource() == Core.INSTANCE ? true : null;
    }

    private final boolean shouldRewind(Ended ended) {
        switch (WhenMappings.$EnumSwitchMapping$2[ended.getSwipe().getType().ordinal()]) {
            case 1:
                if (ended.getRatingResult() != RatingResult.BOUNCER) {
                    return false;
                }
                break;
            case 2:
                if (ended.getRatingResult() != RatingResult.ERROR) {
                    if (ended.getRatingResult() == RatingResult.BOUNCER) {
                        break;
                    }
                    return false;
                }
                break;
            default:
                return false;
        }
        return true;
    }

    private final Observable<Ended> rewindSwipe(Ended ended) {
        switch (WhenMappings.$EnumSwitchMapping$3[ended.getSwipe().getType().ordinal()]) {
            case 1:
                if (this.likeStatusProvider.justBecameOutOfLikes()) {
                    ended = this.recsEngine.rewindSwipeToPositionZero(ended.getSwipe(), RewindReason.Companion.fromEndedRatingStatus(ended)).b(new RecsPresenter$rewindSwipe$1(ended)).a();
                } else {
                    ended = this.recsEngine.rewindSwipeToSelectedPosition(ended.getSwipe(), RecsPresenter$rewindSwipe$2.INSTANCE, RewindReason.Companion.fromEndedRatingStatus(ended)).b(new RecsPresenter$rewindSwipe$3(ended)).a();
                }
                C2668g.a(ended, "if (likeStatusProvider.j…vable()\n                }");
                return ended;
            case 2:
                ended = this.recsEngine.rewindSwipeToPositionZero(ended.getSwipe(), RewindReason.Companion.fromEndedRatingStatus(ended)).b(new RecsPresenter$rewindSwipe$4(ended)).a();
                C2668g.a(ended, "recsEngine\n             …          .toObservable()");
                return ended;
            default:
                ended = Observable.c();
                C2668g.a(ended, "Observable.empty()");
                return ended;
        }
    }

    private final void handleRewindedSwipeRatingStatus(Ended ended) {
        switch (WhenMappings.$EnumSwitchMapping$5[ended.getSwipe().getType().ordinal()]) {
            case 1:
                if (this.likeStatusProvider.justBecameOutOfLikes()) {
                    showBouncer(ended.getSwipe());
                    return;
                }
                return;
            case 2:
                switch (WhenMappings.$EnumSwitchMapping$4[ended.getRatingResult().ordinal()]) {
                    case 1:
                        ended = this.target;
                        if (ended == null) {
                            C2668g.b("target");
                        }
                        ended.showSuperlikeError();
                        return;
                    case 2:
                        showBouncer(ended.getSwipe());
                        return;
                    default:
                        return;
                }
            default:
                return;
        }
    }

    @UiThread
    private final void subscribeToSwipeTutorialEvents() {
        if (!RxUtils.a(this.tutorialRuleSubscription)) {
            Observable a = this.swipeTutorialRule.observe().k(new RecsPresenter$subscribeToSwipeTutorialEvents$1(this)).a(C19397a.a());
            Action1 recsPresenter$subscribeToSwipeTutorialEvents$2 = new RecsPresenter$subscribeToSwipeTutorialEvents$2(this);
            Function1 function1 = RecsPresenter$subscribeToSwipeTutorialEvents$3.INSTANCE;
            if (function1 != null) {
                function1 = new RecsPresenterKt$sam$rx_functions_Action1$0(function1);
            }
            this.tutorialRuleSubscription = a.a(recsPresenter$subscribeToSwipeTutorialEvents$2, (Action1) function1);
        }
    }

    @UiThread
    private final void subscribeToLocalOutOfLikesBouncerEvents() {
        if (!RxUtils.a(this.localOutOfLikesBouncerRuleSubscription)) {
            Observable a = this.localOutOfLikesBouncerRule.observe().a(C19397a.a());
            Action1 recsPresenter$subscribeToLocalOutOfLikesBouncerEvents$1 = new RecsPresenter$subscribeToLocalOutOfLikesBouncerEvents$1(this);
            Function1 function1 = RecsPresenter$subscribeToLocalOutOfLikesBouncerEvents$2.INSTANCE;
            if (function1 != null) {
                function1 = new RecsPresenterKt$sam$rx_functions_Action1$0(function1);
            }
            this.localOutOfLikesBouncerRuleSubscription = a.a(recsPresenter$subscribeToLocalOutOfLikesBouncerEvents$1, (Action1) function1);
        }
    }

    private final void subscribeToDeepLinkedRecEvent() {
        if (!RxUtils.a(this.deepLinkedRecEventSubscription)) {
            Observable a = this.deepLinkedEventProvider.a();
            Action1 recsPresenter$subscribeToDeepLinkedRecEvent$1 = new RecsPresenter$subscribeToDeepLinkedRecEvent$1(this);
            Function1 function1 = RecsPresenter$subscribeToDeepLinkedRecEvent$2.INSTANCE;
            if (function1 != null) {
                function1 = new RecsPresenterKt$sam$rx_functions_Action1$0(function1);
            }
            this.deepLinkedRecEventSubscription = a.a(recsPresenter$subscribeToDeepLinkedRecEvent$1, (Action1) function1);
        }
    }

    private final boolean shouldShowCardStack(DiscoverySettings discoverySettings) {
        return discoverySettings != null ? discoverySettings.isDiscoverable() : true;
    }

    private final void deepLinkedRecReceived(C8818a c8818a) {
        SharedRecLegacyUserAdapter sharedRecLegacyUserAdapter = this.sharedRecLegacyUserAdapter;
        User a = c8818a.a();
        C2668g.a(a, "deepLinkedRecDetails.sharedUser");
        c8818a = c8818a.b();
        C2668g.a(c8818a, "deepLinkedRecDetails.deepLinkReferralInfo");
        insertRecAtTop(sharedRecLegacyUserAdapter.fromSharedRec(a, c8818a));
    }

    private final void insertRecAtTop(UserRec userRec) {
        userRec = this.recsEngine.insertRecAtTop(userRec);
        Action0 action0 = RecsPresenter$insertRecAtTop$1.INSTANCE;
        Function1 function1 = RecsPresenter$insertRecAtTop$2.INSTANCE;
        if (function1 != null) {
            function1 = new RecsPresenterKt$sam$rx_functions_Action1$0(function1);
        }
        userRec.a(action0, (Action1) function1);
    }

    private final void deepLinkedRecLoadFailed() {
        RecsTarget recsTarget = this.target;
        if (recsTarget == null) {
            C2668g.b("target");
        }
        recsTarget.showReferredRecLoadError();
    }

    private final void subscribeToTinderPlusPaywallEvent() {
        if (!RxUtils.a(this.deepLinkedTinderPlusPaywallEventSubscription)) {
            Observable b = this.deepLinkedEventProvider.b();
            Action1 action1 = RecsPresenter$subscribeToTinderPlusPaywallEvent$1.INSTANCE;
            Function1 function1 = RecsPresenter$subscribeToTinderPlusPaywallEvent$2.INSTANCE;
            if (function1 != null) {
                function1 = new RecsPresenterKt$sam$rx_functions_Action1$0(function1);
            }
            this.deepLinkedTinderPlusPaywallEventSubscription = b.a(action1, (Action1) function1);
        }
    }

    private final void subscribeToBoostPaywallEvent() {
        if (!RxUtils.a(this.deepLinkedBoostPaywallEventSubscription)) {
            Observable c = this.deepLinkedEventProvider.c();
            Action1 action1 = RecsPresenter$subscribeToBoostPaywallEvent$1.INSTANCE;
            Function1 function1 = RecsPresenter$subscribeToBoostPaywallEvent$2.INSTANCE;
            if (function1 != null) {
                function1 = new RecsPresenterKt$sam$rx_functions_Action1$0(function1);
            }
            this.deepLinkedBoostPaywallEventSubscription = c.a(action1, (Action1) function1);
        }
    }

    private final void subscribeToBoostState() {
        this.boostStateSubscription = this.boostStateProvider.a().a(RxUtils.a()).a(new RecsPresenter$subscribeToBoostState$1(this), new RecsPresenter$subscribeToBoostState$2(this));
    }

    private final void onRecsUpdate(RecsUpdate recsUpdate) {
        if (recsUpdate != this.lastRecsUpdate) {
            updateCardStackVisibilityState(recsUpdate);
            if (this.lastRecsUpdate == null) {
                onFirstRecsUpdate(recsUpdate);
                return;
            }
            if (recsUpdate instanceof Consume) {
                int position = recsUpdate.getPosition();
                Swipe component1 = ((Consume) recsUpdate).component1();
                Rec rec = component1.getRec();
                C8361a animationForSwipeType = getAnimationForSwipeType(component1.getType());
                RecsTarget recsTarget;
                if (rec.getType() == RecType.AD) {
                    recsTarget = this.target;
                    if (recsTarget == null) {
                        C2668g.b("target");
                    }
                    recsTarget.removeAdsRec(position, animationForSwipeType);
                } else {
                    recsTarget = this.target;
                    if (recsTarget == null) {
                        C2668g.b("target");
                    }
                    recsTarget.removeRec(position, animationForSwipeType);
                }
            } else if (recsUpdate instanceof Insert) {
                if (recsUpdate.getPosition() == 0 && isTopRecReferredAndNotPresented(recsUpdate.getModifiedRecs())) {
                    List modifiedRecs = recsUpdate.getModifiedRecs();
                    Rec rec2 = (Rec) modifiedRecs.get(0);
                    modifiedRecs = modifiedRecs.subList(1, modifiedRecs.size());
                    if (!modifiedRecs.isEmpty()) {
                        r1 = this.target;
                        if (r1 == null) {
                            C2668g.b("target");
                        }
                        modifiedRecs = this.cardFactory.createCards(modifiedRecs);
                        C2668g.a(modifiedRecs, "cardFactory.createCards(otherRecs)");
                        r1.insertRecs(0, modifiedRecs);
                    }
                    C8395a createCard = this.cardFactory.createCard(rec2);
                    if (rec2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.UserRec");
                    }
                    this.currReferredRec = (UserRec) rec2;
                    C2668g.a(createCard, "recCard");
                    createCard.setAppearingAnimation(new ReferredRecAppearingAnimation());
                    r1 = this.target;
                    if (r1 == null) {
                        C2668g.b("target");
                    }
                    r1.insertRec(0, createCard);
                } else {
                    r0 = this.target;
                    if (r0 == null) {
                        C2668g.b("target");
                    }
                    int position2 = recsUpdate.getPosition();
                    List createCards = this.cardFactory.createCards(recsUpdate.getModifiedRecs());
                    C2668g.a(createCards, "cardFactory.createCards(recsUpdate.modifiedRecs)");
                    r0.insertRecs(position2, createCards);
                }
            } else if (recsUpdate instanceof ClearAll) {
                r0 = this.target;
                if (r0 == null) {
                    C2668g.b("target");
                }
                r0.clearRecs();
            } else if (recsUpdate instanceof Remove) {
                r0 = this.target;
                if (r0 == null) {
                    C2668g.b("target");
                }
                r0.removeRec(recsUpdate.getPosition(), null);
            } else if (recsUpdate instanceof Rewind) {
                Rewind rewind = (Rewind) recsUpdate;
                Swipe component12 = rewind.component1();
                int component2 = rewind.component2();
                Rec rec3 = component12.getRec();
                C8395a createCard2 = this.cardFactory.createCard(rec3);
                deleteSuperLikeOnRewind(component12);
                C2668g.a(createCard2, "card");
                createCard2.setAppearingAnimation(getAnimationForRewind(component12.getType(), component2));
                createCard2.setShowRevertIndicator(true);
                r1 = this.target;
                if (r1 == null) {
                    C2668g.b("target");
                }
                r1.rewindRec(createCard2);
                this.recsSessionTracker.addRecRewind(rec3);
                if (rec3 instanceof UserRec) {
                    this.addRecsRewindEvent.execute(new AddRecsRewindEventRequest((UserRec) rec3, component12.getType()));
                }
                if (C2668g.a(rewind.getReason(), ManualUserAction.INSTANCE)) {
                    this.decrementRewindsAvailable.execute().b(C15756a.m59010b()).a(RecsPresenter$onRecsUpdate$1.INSTANCE, RecsPresenter$onRecsUpdate$2.INSTANCE);
                }
            } else if (!(recsUpdate instanceof RewindCancel)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Recs update not handled: ");
                stringBuilder.append(recsUpdate);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.lastRecsUpdate = recsUpdate;
        }
    }

    private final void onFirstRecsUpdate(RecsUpdate recsUpdate) {
        if (recsUpdate.getPosition() == 0 && isTopRecReferredAndNotPresented(recsUpdate.getCurrentRecs())) {
            List currentRecs = recsUpdate.getCurrentRecs();
            Rec rec = (Rec) currentRecs.get(0);
            currentRecs = currentRecs.subList(1, currentRecs.size());
            if (!currentRecs.isEmpty()) {
                RecsTarget recsTarget = this.target;
                if (recsTarget == null) {
                    C2668g.b("target");
                }
                currentRecs = this.cardFactory.createCards(currentRecs);
                C2668g.a(currentRecs, "cardFactory.createCards(otherRecs)");
                recsTarget.insertRecs(0, currentRecs);
            }
            C8395a createCard = this.cardFactory.createCard(rec);
            if (rec == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.UserRec");
            }
            this.currReferredRec = (UserRec) rec;
            C2668g.a(createCard, "recCard");
            createCard.setAppearingAnimation(new ReferredRecAppearingAnimation());
            RecsTarget recsTarget2 = this.target;
            if (recsTarget2 == null) {
                C2668g.b("target");
            }
            recsTarget2.insertRec(0, createCard);
        } else {
            RecsTarget recsTarget3 = this.target;
            if (recsTarget3 == null) {
                C2668g.b("target");
            }
            List createCards = this.cardFactory.createCards(recsUpdate.getCurrentRecs());
            C2668g.a(createCards, "cardFactory.createCards(recsUpdate.currentRecs)");
            recsTarget3.insertRecs(0, createCards);
        }
        this.lastRecsUpdate = recsUpdate;
    }

    private final void updateCardStackVisibilityState(RecsUpdate recsUpdate) {
        if (recsUpdate.getCurrentRecs().isEmpty() != null) {
            recsUpdate = this.target;
            if (recsUpdate == null) {
                C2668g.b("target");
            }
            recsUpdate.hideCardStackView();
            return;
        }
        recsUpdate = this.target;
        if (recsUpdate == null) {
            C2668g.b("target");
        }
        recsUpdate.showCardStackView();
    }

    @VisibleForTesting
    public final void deleteSuperLikeOnRewind(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        if (swipe.getType() == Type.SUPERLIKE) {
            this.deleteSuperLike.execute(swipe.getRec());
        }
    }

    private final boolean isTopRecReferredAndNotPresented(List<? extends Rec> list) {
        return (list.isEmpty() || !RecFieldDecorationExtensionsKt.isReferred((Rec) list.get(0)) || this.currReferredRec == ((Rec) list.get(0))) ? false : true;
    }

    private final void onSwipeTerminationEvent(SwipeTerminationEvent swipeTerminationEvent) {
        try {
            switch (WhenMappings.$EnumSwitchMapping$6[swipeTerminationEvent.getType().ordinal()]) {
                case 1:
                    swipeTerminationEvent = this.target;
                    if (swipeTerminationEvent == null) {
                        C2668g.b("target");
                    }
                    swipeTerminationEvent.freezeAnimatingCards();
                    break;
                case 2:
                case 3:
                    swipeTerminationEvent = this.target;
                    if (swipeTerminationEvent == null) {
                        C2668g.b("target");
                    }
                    swipeTerminationEvent.revertLastAnimatedCard();
                    swipeTerminationEvent.refreshTopCard();
                    break;
                default:
                    break;
            }
            swipeTerminationEvent = this.target;
            if (swipeTerminationEvent == null) {
                C2668g.b("target");
            }
            swipeTerminationEvent.enableSwipes();
        } catch (Throwable th) {
            RecsTarget recsTarget = this.target;
            if (recsTarget == null) {
                C2668g.b("target");
            }
            recsTarget.enableSwipes();
        }
    }

    private final C8361a getAnimationForRewind(Type type, int i) {
        C8361a c8361a = null;
        if (i > 0) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$7[type.ordinal()]) {
            case 1:
                c8361a = (C8361a) new C10456e();
                break;
            case 2:
                c8361a = (C8361a) new C12645c();
                break;
            case 3:
                c8361a = (C8361a) new C10458g();
                break;
            default:
                break;
        }
        return c8361a;
    }

    private final C8361a getAnimationForSwipeType(Type type) {
        switch (WhenMappings.$EnumSwitchMapping$8[type.ordinal()]) {
            case 1:
                return (C8361a) new C10455d();
            case 2:
                return (C8361a) new C12644b();
            case 3:
                return (C8361a) new C10457f();
            default:
                return null;
        }
    }

    private final void showBouncer(Swipe swipe) {
        if (!this.isBounceShowing) {
            RecsTarget recsTarget = this.target;
            if (recsTarget == null) {
                C2668g.b("target");
            }
            recsTarget.refreshTopCard();
            C10076o a;
            switch (WhenMappings.$EnumSwitchMapping$9[swipe.getType().ordinal()]) {
                case 1:
                    if (this.abTestUtility.isGoldMerchandisingEnabled()) {
                        a = C10076o.a(GoldPaywallSource.LIKES_BOUNCER);
                    } else {
                        a = C10076o.a(PlusPaywallSource.GAMEPAD_LIKE);
                    }
                    a.a(new RecsPresenter$showBouncer$1(this)).a(new RecsPresenter$showBouncer$2(this));
                    a.a(C10075b.a(RecFieldDecorationExtensionsKt.name(swipe.getRec()), RecFieldDecorationExtensionsKt.thumbnailImageUrl(swipe.getRec())));
                    swipe = this.target;
                    if (swipe == null) {
                        C2668g.b("target");
                    }
                    C2668g.a(a, "likePaywall");
                    swipe.launchPaywall(a);
                    break;
                case 2:
                    PaywallTypeSource paywallTypeSource;
                    swipe = swipe.getRec();
                    String name = RecFieldDecorationExtensionsKt.name(swipe);
                    swipe = RecFieldDecorationExtensionsKt.thumbnailImageUrl(swipe);
                    boolean a2 = this.superlikeInteractor.m56817a();
                    if (a2) {
                        paywallTypeSource = SuperlikePaywallSource.SUPERLIKE_EXHAUSTED;
                    } else if (a2) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        paywallTypeSource = PlusPaywallSource.GAMEPAD_SUPERLIKE;
                    }
                    C10076o a3 = C10076o.a(paywallTypeSource);
                    a3.a(new RecsPresenter$showBouncer$$inlined$apply$lambda$1(this));
                    a3.a(new RecsPresenter$showBouncer$$inlined$apply$lambda$2(this));
                    if (TextUtils.isEmpty(name) || TextUtils.isEmpty((CharSequence) swipe)) {
                        swipe = this.target;
                        if (swipe == null) {
                            C2668g.b("target");
                        }
                        a = C10076o.a(PlusPaywallSource.GAMEPAD_SUPERLIKE);
                        C2668g.a(a, "PaywallFlow.create(PlusP…Source.GAMEPAD_SUPERLIKE)");
                        swipe.launchPaywall(a);
                        break;
                    }
                    a3.a(C10075b.a(name, swipe));
                    swipe = this.target;
                    if (swipe == null) {
                        C2668g.b("target");
                    }
                    C2668g.a(a3, "superLikePaywall");
                    swipe.launchPaywall(a3);
                    return;
                    break;
                default:
                    this.isBounceShowing = null;
                    return;
            }
            this.isBounceShowing = true;
        }
    }

    private final Swipe markTutorialAsSeen(Swipe swipe) {
        Method method = swipe.getActionContext().getMethod();
        switch (WhenMappings.$EnumSwitchMapping$10[swipe.getType().ordinal()]) {
            case 1:
                if (method != SwipeMethod.GAMEPAD_BUTTON) {
                    if (method == SwipeMethod.CARD) {
                        this.sharedPreferences.r();
                        break;
                    }
                }
                this.sharedPreferences.n();
                break;
                break;
            case 2:
                if (method != SwipeMethod.GAMEPAD_BUTTON) {
                    if (method == SwipeMethod.CARD) {
                        this.sharedPreferences.p();
                        break;
                    }
                }
                this.sharedPreferences.t();
                break;
                break;
            case 3:
                if (method != SwipeMethod.GAMEPAD_BUTTON) {
                    if (method == SwipeMethod.CARD) {
                        this.sharedPreferences.i(true);
                        break;
                    }
                }
                this.sharedPreferences.w();
                break;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to show swipe tutorial: Swipe type should be either ");
                stringBuilder.append(Type.LIKE);
                stringBuilder.append(" or ");
                stringBuilder.append(Type.PASS);
                throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
        }
        return swipe;
    }

    @UiThread
    private final void bindSourceState() {
        RecsTarget recsTarget = this.target;
        if (recsTarget == null) {
            C2668g.b("target");
        }
        recsTarget.showGamepadWithBoost();
    }
}
