package com.tinder.recs.view;

import android.animation.Animator.AnimatorListener;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.annotation.RequiresApi;
import android.support.customtabs.C0164c.C0163a;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.base.p173c.C8304b;
import com.tinder.base.view.LockableViewPager$LockableViewPagerParent;
import com.tinder.base.view.TouchBlockingFrameLayout;
import com.tinder.base.view.TouchBlockingViewContainer;
import com.tinder.boost.dialog.BoostSummaryDialog;
import com.tinder.boost.dialog.BoostUpdateDialog;
import com.tinder.boost.provider.BoostUpdateProvider$a;
import com.tinder.boost.view.BoostButtonView$OnEmitterAttached;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.cardstack.view.CardStackLayout;
import com.tinder.cardstack.view.CardStackLayout.OnCardPresentedListener;
import com.tinder.cardstack.view.OnPreSwipeListener;
import com.tinder.common.view.Container;
import com.tinder.common.view.ContainerRegistrar;
import com.tinder.common.view.SafeViewFlipper;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deadshot.Deadshot;
import com.tinder.dialogs.C11117p;
import com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator$AnimatableRecsDiscoveryView;
import com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator.C8899a;
import com.tinder.domain.common.model.CommonConnection;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.Method;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.enums.ConfirmationType;
import com.tinder.enums.SwipeType;
import com.tinder.fireboarding.domain.C9564f;
import com.tinder.fireboarding.domain.Level;
import com.tinder.fireboarding.view.C9571a;
import com.tinder.fireboarding.view.C9617b;
import com.tinder.fireboarding.view.FireboardingViewContainer;
import com.tinder.fireboarding.view.FireboardingViewContainer.C9568a;
import com.tinder.fireboarding.view.animation.C9603f;
import com.tinder.fireboarding.view.animation.C9603f.C9601a;
import com.tinder.fireboarding.view.animation.C9607h;
import com.tinder.fireboarding.view.animation.C9607h.C9606b;
import com.tinder.fireboarding.view.p254a.C9570a;
import com.tinder.fireboarding.view.reccard.FireboardingRecCardView.C9619b;
import com.tinder.module.MainActivityComponentProvider;
import com.tinder.overflow.analytics.RecommendProfileBroadcastReceiver;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.profile.model.ProfileShareAction;
import com.tinder.profile.model.ProfileShareSource;
import com.tinder.profile.p363b.C14386k;
import com.tinder.profile.p363b.aj;
import com.tinder.profile.p363b.aj.C14373a;
import com.tinder.profile.p365d.C14398a;
import com.tinder.profile.view.UserRecProfileView;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.recs.RecCardViewHolderFactory;
import com.tinder.recs.analytics.RecsPhotoSource;
import com.tinder.recs.analytics.RecsPhotosViewedCache;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig;
import com.tinder.recs.animation.DefaultRecProfileExitAnimationDecorator;
import com.tinder.recs.animation.RecProfileAnimationDecorator;
import com.tinder.recs.animation.RecProfileAnimationDecorator.EndListener;
import com.tinder.recs.animation.RecProfileAnimationDecorator.State;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recs.component.RecsViewComponentProvider;
import com.tinder.recs.presenter.RecsPresenter;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.target.RecsTarget;
import com.tinder.recs.view.RecProfileView.GamepadButtonStates;
import com.tinder.recs.view.RecProfileView.Listener;
import com.tinder.recs.view.decorator.GamepadRewindButtonAnimationDecorator;
import com.tinder.recsads.C16456c;
import com.tinder.recsads.C16456c.C14753a;
import com.tinder.recsads.model.BrandedProfileCardAd;
import com.tinder.screenshotty.p401a.C14826a;
import com.tinder.superlikeable.p422b.C15138d;
import com.tinder.superlikeable.p424d.C15141a;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier.C15148a;
import com.tinder.superlikeable.view.SuperLikeableViewContainer;
import com.tinder.utils.C15365p;
import com.tinder.utils.RxUtils;
import com.tinder.utils.at;
import com.tinder.utils.au;
import com.tinder.utils.av;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00048=W\u0018\u0000 ®\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0006­\u0002®\u0002¯\u0002B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ3\u0010\u0001\u001a\u00030\u00012\f\u0010\u0001\u001a\u0007\u0012\u0002\b\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0002J\u0013\u0010 \u0001\u001a\u00030\u00012\u0007\u0010¡\u0001\u001a\u00020}H\u0016J\n\u0010¢\u0001\u001a\u00030\u0001H\u0016J\n\u0010£\u0001\u001a\u00030¤\u0001H\u0002JW\u0010¥\u0001\u001a\u00030\u00012\b\u0010¦\u0001\u001a\u00030§\u00012\b\u0010¨\u0001\u001a\u00030§\u00012\n\u0010©\u0001\u001a\u0005\u0018\u00010ª\u00012\b\u0010«\u0001\u001a\u00030§\u00012\u0007\u0010¬\u0001\u001a\u00020@2\u0007\u0010­\u0001\u001a\u00020@2\u000f\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030°\u00010¯\u0001H\u0016J\n\u0010±\u0001\u001a\u00030¤\u0001H\u0002J\n\u0010²\u0001\u001a\u00030³\u0001H\u0002J\n\u0010´\u0001\u001a\u00030¤\u0001H\u0002J\n\u0010µ\u0001\u001a\u00030\u0001H\u0016J\n\u0010¶\u0001\u001a\u00030\u0001H\u0016J\n\u0010·\u0001\u001a\u00030\u0001H\u0002J\n\u0010¸\u0001\u001a\u00030\u0001H\u0016J\n\u0010¹\u0001\u001a\u00030\u0001H\u0016J\"\u0010º\u0001\u001a\u00030\u00012\u0016\u0010»\u0001\u001a\u0011\u0012\u0005\u0012\u00030½\u0001\u0012\u0005\u0012\u00030\u00010¼\u0001H\u0002J%\u0010¾\u0001\u001a\u00030\u00012\b\u0010¿\u0001\u001a\u00030À\u00012\u000f\u0010»\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0002J\u0013\u0010Á\u0001\u001a\u00030\u00012\u0007\u0010Â\u0001\u001a\u00020@H\u0016J\n\u0010Ã\u0001\u001a\u00030\u0001H\u0016J\n\u0010Ä\u0001\u001a\u00030\u0001H\u0016J \u0010Å\u0001\u001a\u00030\u00012\n\u0010s\u001a\u0006\u0012\u0002\b\u00030t2\b\u0010Æ\u0001\u001a\u00030Ç\u0001H\u0002J\n\u0010È\u0001\u001a\u00030\u0001H\u0016J\t\u0010É\u0001\u001a\u00020\u001aH\u0016J\u0018\u0010Ê\u0001\u001a\u00030\u00012\f\u0010Ë\u0001\u001a\u0007\u0012\u0002\b\u00030Ì\u0001H\u0002J\n\u0010Í\u0001\u001a\u00030\u0001H\u0016J\n\u0010Î\u0001\u001a\u00030\u0001H\u0016J\n\u0010Ï\u0001\u001a\u00030\u0001H\u0016J!\u0010Ð\u0001\u001a\u00030\u00012\u0007\u0010Ñ\u0001\u001a\u00020}2\f\u0010Ë\u0001\u001a\u0007\u0012\u0002\b\u00030Ì\u0001H\u0016J(\u0010Ò\u0001\u001a\u00030\u00012\u0007\u0010Ñ\u0001\u001a\u00020}2\u0013\u0010Ó\u0001\u001a\u000e\u0012\t\u0012\u0007\u0012\u0002\b\u00030Ì\u00010¯\u0001H\u0016J\u0014\u0010Ô\u0001\u001a\u00030\u00012\b\u0010Õ\u0001\u001a\u00030Ö\u0001H\u0016J\n\u0010×\u0001\u001a\u00030\u0001H\u0002J\u001c\u0010Ø\u0001\u001a\u00030\u00012\b\u0010Ù\u0001\u001a\u00030\u00012\b\u0010Ú\u0001\u001a\u00030Û\u0001J\u0019\u0010Ü\u0001\u001a\u00030\u00012\r\u0010Ý\u0001\u001a\b0Þ\u0001j\u0003`ß\u0001H\u0002J\u0013\u0010à\u0001\u001a\u00030\u00012\u0007\u0010á\u0001\u001a\u00020@H\u0016J\n\u0010â\u0001\u001a\u00030\u0001H\u0014J\t\u0010ã\u0001\u001a\u00020@H\u0016J\n\u0010ä\u0001\u001a\u00030\u0001H\u0014J\n\u0010å\u0001\u001a\u00030\u0001H\u0014J\n\u0010æ\u0001\u001a\u00030\u0001H\u0016J\u0014\u0010ç\u0001\u001a\u00030\u00012\b\u0010è\u0001\u001a\u00030é\u0001H\u0016J\u001e\u0010ê\u0001\u001a\u00030\u00012\b\u0010ë\u0001\u001a\u00030ì\u00012\b\u0010Ù\u0001\u001a\u00030\u0001H\u0002J\n\u0010í\u0001\u001a\u00030\u0001H\u0007J\n\u0010î\u0001\u001a\u00030\u0001H\u0002J\n\u0010ï\u0001\u001a\u00030\u0001H\u0002J\n\u0010ð\u0001\u001a\u00030\u0001H\u0002J\n\u0010ñ\u0001\u001a\u00030\u0001H\u0007J3\u0010ò\u0001\u001a\u00030\u00012\b\u0010ó\u0001\u001a\u00030\u00012\b\u0010ô\u0001\u001a\u00030õ\u00012\u0007\u0010ö\u0001\u001a\u00020}2\f\u0010\u0001\u001a\u0007\u0012\u0002\b\u00030\u0001J\u0012\u0010÷\u0001\u001a\u00030\u00012\b\u0010ø\u0001\u001a\u00030ù\u0001J\u0014\u0010ú\u0001\u001a\u00030\u00012\b\u0010û\u0001\u001a\u00030§\u0001H\u0016J\n\u0010ü\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010ý\u0001\u001a\u00030\u00012\b\u0010þ\u0001\u001a\u00030ÿ\u0001H\u0002J\u0014\u0010\u0002\u001a\u00030\u00012\b\u0010þ\u0001\u001a\u00030ÿ\u0001H\u0002J\n\u0010\u0002\u001a\u00030\u0001H\u0016J\u001f\u0010\u0002\u001a\u00030\u00012\u0007\u0010Ñ\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u0005\u0018\u00010\u0002H\u0016J\u001f\u0010\u0002\u001a\u00030\u00012\u0007\u0010Ñ\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u0005\u0018\u00010\u0002H\u0016J\n\u0010\u0002\u001a\u00030\u0001H\u0002J\n\u0010\u0002\u001a\u00030\u0001H\u0016J\u0018\u0010\u0002\u001a\u00030\u00012\f\u0010Ë\u0001\u001a\u0007\u0012\u0002\b\u00030Ì\u0001H\u0016J\n\u0010\u0002\u001a\u00030À\u0001H\u0002J]\u0010\u0002\u001a\u00030\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0002\u001a\u00030\u00022\b\u0010«\u0001\u001a\u00030§\u00012\b\u0010\u0002\u001a\u00030§\u00012\b\u0010¦\u0001\u001a\u00030§\u00012\u0007\u0010¬\u0001\u001a\u00020@2\u0007\u0010­\u0001\u001a\u00020@2\u000f\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030°\u00010¯\u0001H\u0003J\u0014\u0010\u0002\u001a\u00030\u00012\b\u0010\u0002\u001a\u00030\u0002H\u0016J\u0010\u0010\u0002\u001a\u00030\u00012\u0006\u0010J\u001a\u00020KJ\u0012\u0010\u0002\u001a\u00030\u00012\u0006\u0010|\u001a\u00020}H\u0016J\u0019\u0010\u0002\u001a\u00030\u00012\r\u0010\u0002\u001a\b0\u0002R\u00030\u0002H\u0016J\n\u0010\u0002\u001a\u00030\u0001H\u0016J\u0014\u0010\u0002\u001a\u00030\u00012\b\u0010\u0002\u001a\u00030\u0002H\u0016J\n\u0010\u0002\u001a\u00030\u0001H\u0002J\n\u0010\u0002\u001a\u00030\u0001H\u0016J\n\u0010\u0002\u001a\u00030\u0001H\u0016J\n\u0010\u0002\u001a\u00030\u0001H\u0016J\u0016\u0010\u0002\u001a\u00030\u00012\n\u0010s\u001a\u0006\u0012\u0002\b\u00030tH\u0002J\n\u0010 \u0002\u001a\u00030\u0001H\u0016J\n\u0010¡\u0002\u001a\u00030\u0001H\u0016J\n\u0010¢\u0002\u001a\u00030\u0001H\u0016J\u0014\u0010£\u0002\u001a\u00030\u00012\b\u0010¤\u0002\u001a\u00030¥\u0002H\u0016J]\u0010¦\u0002\u001a\u00030\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0002\u001a\u00030\u00022\b\u0010«\u0001\u001a\u00030§\u00012\b\u0010\u0002\u001a\u00030§\u00012\b\u0010¦\u0001\u001a\u00030§\u00012\u0007\u0010¬\u0001\u001a\u00020@2\u0007\u0010­\u0001\u001a\u00020@2\u000f\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030°\u00010¯\u0001H\u0002J\u0014\u0010§\u0002\u001a\u00030\u00012\b\u0010¨\u0002\u001a\u00030©\u0002H\u0016J\n\u0010ª\u0002\u001a\u00030\u0001H\u0002J\n\u0010«\u0002\u001a\u00030\u0001H\u0016J\n\u0010¬\u0002\u001a\u00030\u0001H\u0016R\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000R\u001e\u00101\u001a\u0002028\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0010\u00107\u001a\u000208X\u0004¢\u0006\u0004\n\u0002\u00109R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u00020=X\u0004¢\u0006\u0004\n\u0002\u0010>R\u0014\u0010?\u001a\u00020@8BX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010AR\u0014\u0010B\u001a\u00020@8BX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010AR\u0014\u0010C\u001a\u00020@8BX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR\u001e\u0010D\u001a\u00020E8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u000e\u0010J\u001a\u00020KX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010L\u001a\u00020M8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u000e\u0010R\u001a\u00020SX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020UX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010V\u001a\u00020WX\u0004¢\u0006\u0004\n\u0002\u0010XR\u000e\u0010Y\u001a\u00020ZX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010[\u001a\u00020\\8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001e\u0010a\u001a\u00020b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001e\u0010g\u001a\u00020h8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001e\u0010m\u001a\u00020n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0014\u0010s\u001a\b\u0012\u0002\b\u0003\u0018\u00010tX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010u\u001a\u00020v8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u000e\u0010{\u001a\u00020@X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020}X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010~\u001a\u00020X\u0004¢\u0006\u0005\n\u0003\u0010\u0001R\u0010\u0010\u0001\u001a\u00030\u0001X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0001\u001a\u00020@X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u0005\u0018\u00010\u00018BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0013\u0010\u0001\u001a\u00020}8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006°\u0002"}, d2 = {"Lcom/tinder/recs/view/RecsView;", "Lcom/tinder/common/view/SafeViewFlipper;", "Lcom/tinder/recs/target/RecsTarget;", "Landroid/arch/lifecycle/LifecycleObserver;", "Lcom/tinder/common/view/Container;", "Lcom/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$AnimatableRecsDiscoveryView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "getAbTestUtility$Tinder_release", "()Lcom/tinder/core/experiment/AbTestUtility;", "setAbTestUtility$Tinder_release", "(Lcom/tinder/core/experiment/AbTestUtility;)V", "addProfileShareEvent", "Lcom/tinder/profile/interactor/AddProfileShareEvent;", "getAddProfileShareEvent$Tinder_release", "()Lcom/tinder/profile/interactor/AddProfileShareEvent;", "setAddProfileShareEvent$Tinder_release", "(Lcom/tinder/profile/interactor/AddProfileShareEvent;)V", "adsViewRemoveListener", "Lcom/tinder/recs/view/AdsViewRemoveListener;", "animatableRecsDiscoveryViews", "Lcom/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$AnimatableViews;", "boostSummaryDialog", "Lcom/tinder/boost/dialog/BoostSummaryDialog;", "boostUpdateDialog", "Lcom/tinder/boost/dialog/BoostUpdateDialog;", "cardStack", "Lcom/tinder/cardstack/view/CardStackLayout;", "getCardStack$Tinder_release", "()Lcom/tinder/cardstack/view/CardStackLayout;", "setCardStack$Tinder_release", "(Lcom/tinder/cardstack/view/CardStackLayout;)V", "cardStackContainer", "Lcom/tinder/base/view/TouchBlockingFrameLayout;", "getCardStackContainer$Tinder_release", "()Lcom/tinder/base/view/TouchBlockingFrameLayout;", "setCardStackContainer$Tinder_release", "(Lcom/tinder/base/view/TouchBlockingFrameLayout;)V", "cardStackZIndex", "", "featureNameFactory", "Lcom/tinder/fireboarding/domain/FeatureNameFactory;", "fireboardingViewContainerDialog", "Lcom/tinder/fireboarding/view/dialog/FireboardingViewContainerDialog;", "gamepad", "Lcom/tinder/recs/view/GamepadView;", "getGamepad$Tinder_release", "()Lcom/tinder/recs/view/GamepadView;", "setGamepad$Tinder_release", "(Lcom/tinder/recs/view/GamepadView;)V", "gamepadClickListener", "com/tinder/recs/view/RecsView$gamepadClickListener$1", "Lcom/tinder/recs/view/RecsView$gamepadClickListener$1;", "gamepadRewindButtonAnimationDecorator", "Lcom/tinder/recs/view/decorator/GamepadRewindButtonAnimationDecorator;", "heartsEmitterListener", "com/tinder/recs/view/RecsView$heartsEmitterListener$1", "Lcom/tinder/recs/view/RecsView$heartsEmitterListener$1;", "isProfileViewAnimating", "", "()Z", "isProfileViewAttached", "isSwipesEnabled", "lifecycle", "Landroid/arch/lifecycle/Lifecycle;", "getLifecycle$Tinder_release", "()Landroid/arch/lifecycle/Lifecycle;", "setLifecycle$Tinder_release", "(Landroid/arch/lifecycle/Lifecycle;)V", "lockableViewPagerParent", "Lcom/tinder/base/view/LockableViewPager$LockableViewPagerParent;", "notificationDispatcher", "Lcom/tinder/pushnotifications/NotificationDispatcher;", "getNotificationDispatcher$Tinder_release", "()Lcom/tinder/pushnotifications/NotificationDispatcher;", "setNotificationDispatcher$Tinder_release", "(Lcom/tinder/pushnotifications/NotificationDispatcher;)V", "nudgeAnimation", "Lcom/tinder/fireboarding/view/animation/NudgeAnimation;", "onCardPresentedListener", "Lcom/tinder/cardstack/view/CardStackLayout$OnCardPresentedListener;", "onTopCardMovedListener", "com/tinder/recs/view/RecsView$onTopCardMovedListener$1", "Lcom/tinder/recs/view/RecsView$onTopCardMovedListener$1;", "preSwipeListener", "Lcom/tinder/cardstack/view/OnPreSwipeListener;", "presenter", "Lcom/tinder/recs/presenter/RecsPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/recs/presenter/RecsPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/recs/presenter/RecsPresenter;)V", "profileFactory", "Lcom/tinder/profile/model/Profile$Factory;", "getProfileFactory$Tinder_release", "()Lcom/tinder/profile/model/Profile$Factory;", "setProfileFactory$Tinder_release", "(Lcom/tinder/profile/model/Profile$Factory;)V", "profileShareEventFactory", "Lcom/tinder/profile/interactor/ProfileShareEventFactory;", "getProfileShareEventFactory$Tinder_release", "()Lcom/tinder/profile/interactor/ProfileShareEventFactory;", "setProfileShareEventFactory$Tinder_release", "(Lcom/tinder/profile/interactor/ProfileShareEventFactory;)V", "recCardViewHolderFactory", "Lcom/tinder/recs/RecCardViewHolderFactory;", "getRecCardViewHolderFactory$Tinder_release", "()Lcom/tinder/recs/RecCardViewHolderFactory;", "setRecCardViewHolderFactory$Tinder_release", "(Lcom/tinder/recs/RecCardViewHolderFactory;)V", "recProfileView", "Lcom/tinder/recs/view/RecProfileView;", "recsPhotosViewedCache", "Lcom/tinder/recs/analytics/RecsPhotosViewedCache;", "getRecsPhotosViewedCache$Tinder_release", "()Lcom/tinder/recs/analytics/RecsPhotosViewedCache;", "setRecsPhotosViewedCache$Tinder_release", "(Lcom/tinder/recs/analytics/RecsPhotosViewedCache;)V", "stampIsAnimating", "superLikeRemainingCount", "", "superLikeableGameListener", "com/tinder/recs/view/RecsView$superLikeableGameListener$1", "Lcom/tinder/recs/view/RecsView$superLikeableGameListener$1;", "superLikeableRecClickListenerProxy", "Lcom/tinder/recs/view/RecsView$SuperLikeableRecClickListenerProxy;", "superLikeableViewContainer", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer;", "swipesEnabled", "tinderNotificationFactory", "Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;", "getTinderNotificationFactory$Tinder_release", "()Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;", "setTinderNotificationFactory$Tinder_release", "(Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;)V", "topRec", "Lcom/tinder/domain/recs/model/Rec;", "getTopRec", "()Lcom/tinder/domain/recs/model/Rec;", "topRecCardView", "Lcom/tinder/recs/view/RecCardView;", "userRecActivePhotoIndexProvider", "Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;", "getUserRecActivePhotoIndexProvider$Tinder_release", "()Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;", "setUserRecActivePhotoIndexProvider$Tinder_release", "(Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;)V", "whiteColor", "animateStamp", "", "recCardView", "stamp", "Landroid/view/View;", "animationEndListener", "Lkotlin/Function0;", "animateSuperlikeButton", "superlikesRemaining", "clearRecs", "createBoostButtonTutorialTooltipParams", "Lcom/tinder/fireboarding/view/animation/FireboardingTooltipFactory$TooltipParams;", "createChooserToShareScreenshottedProfile", "otherId", "", "name", "uri", "Landroid/net/Uri;", "referralUrl", "isSuperlike", "isRecTraveling", "commonConnections", "", "Lcom/tinder/domain/common/model/CommonConnection;", "createRewindButtonTutorialTooltipParams", "createSuperLikeableStringResources", "Lcom/tinder/superlikeable/resources/StringResources;", "createSuperlikeButtonTutorialTooltipParams", "disableSwipes", "disableTouch", "dismissFireboardingDialog", "dismissFireboardingViewContainer", "displayBoostSummary", "doOnEachAdsView", "action", "Lkotlin/Function1;", "Lcom/tinder/recs/view/AdRecCardView;", "doWhenReadyForNudge", "view", "Landroid/view/ViewGroup;", "enableBoostButton", "shouldEnable", "enableSwipes", "enableTouch", "exitProfileView", "listener", "Lcom/tinder/recs/animation/RecProfileAnimationDecorator$EndListener;", "freezeAnimatingCards", "getAnimatableViews", "getRec", "card", "Lcom/tinder/cardstack/model/Card;", "hideCardStackView", "hideHeartsAnimation", "hideSuperLikeableGame", "insertRec", "position", "insertRecs", "cards", "launchPaywall", "paywallFlow", "Lcom/tinder/paywall/paywallflow/PaywallFlow;", "likeOnTopRecFromCardStackButton", "likeRec", "rec", "swipeMethod", "Lcom/tinder/domain/recs/model/Swipe$Method;", "logUnexpectedRecOnPhotoChangeException", "e", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "notifyScreenshotCaptured", "photosPermissionEnabled", "onAttachedToWindow", "onBackPressed", "onDetachedFromWindow", "onFinishInflate", "onFireboardingRecCardViewMovedToTop", "onFireboardingRecCardViewReadyForAnimation", "recCardViewParams", "Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView$RecCardViewParams;", "onGamePadButtonClickedFromProfile", "swipeType", "Lcom/tinder/enums/SwipeType;", "onPause", "onProfileEntranceAnimationEnd", "onProfileEntranceAnimationStart", "onProfileExitAnimationEnd", "onResume", "onShowProfileClicked", "adRec", "brandedProfileCardAd", "Lcom/tinder/recsads/model/BrandedProfileCardAd;", "currentPhotoIndex", "onUserRecCardViewClick", "userRecCardView", "Lcom/tinder/recs/view/BaseUserRecCardView;", "openUrl", "url", "passOnTopRecFromCardStackButton", "prepareForProfileEntranceAnimation", "placeholderPhotoConfig", "Lcom/tinder/recs/animation/DefaultRecProfileAnimationDecorator$PlaceholderPhotoConfig;", "prepareForProfileExitAnimation", "refreshTopCard", "removeAdsRec", "removeAnimation", "Lcom/tinder/cardstack/animation/SwipeAnimation;", "removeRec", "removeSuperLikeableView", "revertLastAnimatedCard", "rewindRec", "rootView", "sendIntentAndDeeplinkShareIdEventInReceiver", "sharingIntent", "Landroid/content/Intent;", "username", "sendScreenshotInAppNotification", "screenshot", "Lcom/tinder/screenshotty/model/Screenshot;", "setLockableViewPagerParent", "setSuperLikeRemainingCount", "showBoostUpdateDialog", "currentBoostTick", "Lcom/tinder/boost/provider/BoostUpdateProvider$BoostTick;", "Lcom/tinder/boost/provider/BoostUpdateProvider;", "showCardStackView", "showFireboardingLevelTutorialTooltip", "level", "Lcom/tinder/fireboarding/domain/Level;", "showGamepad", "showGamepadWithBoost", "showHeartsAnimation", "showNudgeAnimation", "showRecProfileView", "showReferredRecLoadError", "showSuperLikeableGame", "showSuperlikeError", "showTutorialSwipeDialog", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "startActivityForIntentAndSendDeeplinkShareIdEvent", "startSuperLikeableEntranceAnimation", "params", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$Params;", "superlikeOnTopRecFromCardStackButton", "switchToCardStackView", "switchToDiscoveryOffView", "CardAttachChangeListener", "Companion", "SuperLikeableRecClickListenerProxy", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView extends SafeViewFlipper implements LifecycleObserver, Container, RecsDiscoveryViewAnimator$AnimatableRecsDiscoveryView, RecsTarget {
    private static final float CARDSTACK_MOVED_Z_INDEX = 100.0f;
    public static final RecsView$Companion Companion = new RecsView$Companion(null);
    private static final LockableViewPager$LockableViewPagerParent DUMMY_LOCKABLE_VIEWPAGER_PARENT = new RecsView$Companion$DUMMY_LOCKABLE_VIEWPAGER_PARENT$1();
    private static final long STAMP_ANIMATION_DURATION_MS = 100;
    private static final int VIEW_FLIPPER_INDEX_CARD_STACK = 1;
    private static final int VIEW_FLIPPER_INDEX_DISCOVERY_OFF = 0;
    private HashMap _$_findViewCache;
    @Inject
    @NotNull
    public AbTestUtility abTestUtility;
    @Inject
    @NotNull
    public C14386k addProfileShareEvent;
    private final AdsViewRemoveListener adsViewRemoveListener = new AdsViewRemoveListener();
    private C8899a animatableRecsDiscoveryViews;
    private BoostSummaryDialog boostSummaryDialog;
    private BoostUpdateDialog boostUpdateDialog;
    @NotNull
    @BindView(2131363426)
    public CardStackLayout cardStack;
    @NotNull
    @BindView(2131363427)
    public TouchBlockingFrameLayout cardStackContainer;
    private float cardStackZIndex;
    private final C9564f featureNameFactory = new C9564f();
    private C9570a fireboardingViewContainerDialog;
    @NotNull
    @BindView(2131363430)
    public GamepadView gamepad;
    private final RecsView$gamepadClickListener$1 gamepadClickListener = new RecsView$gamepadClickListener$1(this);
    private GamepadRewindButtonAnimationDecorator gamepadRewindButtonAnimationDecorator;
    private final RecsView$heartsEmitterListener$1 heartsEmitterListener = new RecsView$heartsEmitterListener$1(this);
    @Inject
    @NotNull
    public Lifecycle lifecycle;
    private LockableViewPager$LockableViewPagerParent lockableViewPagerParent = DUMMY_LOCKABLE_VIEWPAGER_PARENT;
    @Inject
    @NotNull
    public C14550a notificationDispatcher;
    private final C9607h nudgeAnimation = new C9606b().a();
    private final OnCardPresentedListener onCardPresentedListener = ((OnCardPresentedListener) new RecsView$onCardPresentedListener$1(this));
    private final RecsView$onTopCardMovedListener$1 onTopCardMovedListener = new RecsView$onTopCardMovedListener$1(this);
    private final OnPreSwipeListener preSwipeListener = ((OnPreSwipeListener) new RecsView$preSwipeListener$1(this));
    @Inject
    @NotNull
    public RecsPresenter presenter;
    @Inject
    @NotNull
    public C14418b profileFactory;
    @Inject
    @NotNull
    public aj profileShareEventFactory;
    @Inject
    @NotNull
    public RecCardViewHolderFactory recCardViewHolderFactory;
    private RecProfileView<?> recProfileView;
    @Inject
    @NotNull
    public RecsPhotosViewedCache recsPhotosViewedCache;
    private boolean stampIsAnimating;
    private int superLikeRemainingCount;
    private final RecsView$superLikeableGameListener$1 superLikeableGameListener = new RecsView$superLikeableGameListener$1(this);
    private final RecsView$SuperLikeableRecClickListenerProxy superLikeableRecClickListenerProxy = new RecsView$SuperLikeableRecClickListenerProxy();
    private SuperLikeableViewContainer superLikeableViewContainer;
    private boolean swipesEnabled = true;
    @Inject
    @NotNull
    public C14548a tinderNotificationFactory;
    private RecCardView<?> topRecCardView;
    @Inject
    @NotNull
    public UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider;
    @BindColor(2131100300)
    @JvmField
    public int whiteColor;

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), view);
        return view;
    }

    public RecsView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        C2668g.m10309b(attributeSet, "attrs");
        super(context, attributeSet);
        attributeSet = ((MainActivityComponentProvider) context).provideMainActivityComponent().m14688a().recsView(this).build();
        attributeSet.inject(this);
        ((RecsViewComponentProvider) context).setRecsViewComponent(attributeSet);
    }

    @NotNull
    public final RecsPresenter getPresenter$Tinder_release() {
        RecsPresenter recsPresenter = this.presenter;
        if (recsPresenter == null) {
            C2668g.m10310b("presenter");
        }
        return recsPresenter;
    }

    public final void setPresenter$Tinder_release(@NotNull RecsPresenter recsPresenter) {
        C2668g.m10309b(recsPresenter, "<set-?>");
        this.presenter = recsPresenter;
    }

    @NotNull
    public final RecCardViewHolderFactory getRecCardViewHolderFactory$Tinder_release() {
        RecCardViewHolderFactory recCardViewHolderFactory = this.recCardViewHolderFactory;
        if (recCardViewHolderFactory == null) {
            C2668g.m10310b("recCardViewHolderFactory");
        }
        return recCardViewHolderFactory;
    }

    public final void setRecCardViewHolderFactory$Tinder_release(@NotNull RecCardViewHolderFactory recCardViewHolderFactory) {
        C2668g.m10309b(recCardViewHolderFactory, "<set-?>");
        this.recCardViewHolderFactory = recCardViewHolderFactory;
    }

    @NotNull
    public final UserRecActivePhotoIndexProvider getUserRecActivePhotoIndexProvider$Tinder_release() {
        UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider = this.userRecActivePhotoIndexProvider;
        if (userRecActivePhotoIndexProvider == null) {
            C2668g.m10310b("userRecActivePhotoIndexProvider");
        }
        return userRecActivePhotoIndexProvider;
    }

    public final void setUserRecActivePhotoIndexProvider$Tinder_release(@NotNull UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider) {
        C2668g.m10309b(userRecActivePhotoIndexProvider, "<set-?>");
        this.userRecActivePhotoIndexProvider = userRecActivePhotoIndexProvider;
    }

    @NotNull
    public final RecsPhotosViewedCache getRecsPhotosViewedCache$Tinder_release() {
        RecsPhotosViewedCache recsPhotosViewedCache = this.recsPhotosViewedCache;
        if (recsPhotosViewedCache == null) {
            C2668g.m10310b("recsPhotosViewedCache");
        }
        return recsPhotosViewedCache;
    }

    public final void setRecsPhotosViewedCache$Tinder_release(@NotNull RecsPhotosViewedCache recsPhotosViewedCache) {
        C2668g.m10309b(recsPhotosViewedCache, "<set-?>");
        this.recsPhotosViewedCache = recsPhotosViewedCache;
    }

    @NotNull
    public final C14418b getProfileFactory$Tinder_release() {
        C14418b c14418b = this.profileFactory;
        if (c14418b == null) {
            C2668g.m10310b("profileFactory");
        }
        return c14418b;
    }

    public final void setProfileFactory$Tinder_release(@NotNull C14418b c14418b) {
        C2668g.m10309b(c14418b, "<set-?>");
        this.profileFactory = c14418b;
    }

    @NotNull
    public final AbTestUtility getAbTestUtility$Tinder_release() {
        AbTestUtility abTestUtility = this.abTestUtility;
        if (abTestUtility == null) {
            C2668g.m10310b("abTestUtility");
        }
        return abTestUtility;
    }

    public final void setAbTestUtility$Tinder_release(@NotNull AbTestUtility abTestUtility) {
        C2668g.m10309b(abTestUtility, "<set-?>");
        this.abTestUtility = abTestUtility;
    }

    @NotNull
    public final Lifecycle getLifecycle$Tinder_release() {
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        return lifecycle;
    }

    public final void setLifecycle$Tinder_release(@NotNull Lifecycle lifecycle) {
        C2668g.m10309b(lifecycle, "<set-?>");
        this.lifecycle = lifecycle;
    }

    @NotNull
    public final C14548a getTinderNotificationFactory$Tinder_release() {
        C14548a c14548a = this.tinderNotificationFactory;
        if (c14548a == null) {
            C2668g.m10310b("tinderNotificationFactory");
        }
        return c14548a;
    }

    public final void setTinderNotificationFactory$Tinder_release(@NotNull C14548a c14548a) {
        C2668g.m10309b(c14548a, "<set-?>");
        this.tinderNotificationFactory = c14548a;
    }

    @NotNull
    public final C14550a getNotificationDispatcher$Tinder_release() {
        C14550a c14550a = this.notificationDispatcher;
        if (c14550a == null) {
            C2668g.m10310b("notificationDispatcher");
        }
        return c14550a;
    }

    public final void setNotificationDispatcher$Tinder_release(@NotNull C14550a c14550a) {
        C2668g.m10309b(c14550a, "<set-?>");
        this.notificationDispatcher = c14550a;
    }

    @NotNull
    public final C14386k getAddProfileShareEvent$Tinder_release() {
        C14386k c14386k = this.addProfileShareEvent;
        if (c14386k == null) {
            C2668g.m10310b("addProfileShareEvent");
        }
        return c14386k;
    }

    public final void setAddProfileShareEvent$Tinder_release(@NotNull C14386k c14386k) {
        C2668g.m10309b(c14386k, "<set-?>");
        this.addProfileShareEvent = c14386k;
    }

    @NotNull
    public final aj getProfileShareEventFactory$Tinder_release() {
        aj ajVar = this.profileShareEventFactory;
        if (ajVar == null) {
            C2668g.m10310b("profileShareEventFactory");
        }
        return ajVar;
    }

    public final void setProfileShareEventFactory$Tinder_release(@NotNull aj ajVar) {
        C2668g.m10309b(ajVar, "<set-?>");
        this.profileShareEventFactory = ajVar;
    }

    @NotNull
    public final CardStackLayout getCardStack$Tinder_release() {
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        return cardStackLayout;
    }

    public final void setCardStack$Tinder_release(@NotNull CardStackLayout cardStackLayout) {
        C2668g.m10309b(cardStackLayout, "<set-?>");
        this.cardStack = cardStackLayout;
    }

    @NotNull
    public final GamepadView getGamepad$Tinder_release() {
        GamepadView gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        return gamepadView;
    }

    public final void setGamepad$Tinder_release(@NotNull GamepadView gamepadView) {
        C2668g.m10309b(gamepadView, "<set-?>");
        this.gamepad = gamepadView;
    }

    @NotNull
    public final TouchBlockingFrameLayout getCardStackContainer$Tinder_release() {
        TouchBlockingFrameLayout touchBlockingFrameLayout = this.cardStackContainer;
        if (touchBlockingFrameLayout == null) {
            C2668g.m10310b("cardStackContainer");
        }
        return touchBlockingFrameLayout;
    }

    public final void setCardStackContainer$Tinder_release(@NotNull TouchBlockingFrameLayout touchBlockingFrameLayout) {
        C2668g.m10309b(touchBlockingFrameLayout, "<set-?>");
        this.cardStackContainer = touchBlockingFrameLayout;
    }

    private final boolean isSwipesEnabled() {
        if (!(!this.swipesEnabled || isProfileViewAttached() || this.stampIsAnimating)) {
            GamepadView gamepadView = this.gamepad;
            if (gamepadView == null) {
                C2668g.m10310b("gamepad");
            }
            if (!gamepadView.isSuperlikeAnimating()) {
                return true;
            }
        }
        return false;
    }

    private final Rec getTopRec() {
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        Object f = cardStackLayout.f();
        if (f == null) {
            return null;
        }
        C2668g.m10305a(f, "topCard");
        return getRec(f);
    }

    private final boolean isProfileViewAttached() {
        return this.recProfileView != null;
    }

    private final boolean isProfileViewAnimating() {
        RecProfileView recProfileView = this.recProfileView;
        boolean z = false;
        if (recProfileView == null) {
            return false;
        }
        RecProfileAnimationDecorator enterAnimationDecorator = recProfileView.getEnterAnimationDecorator();
        if (enterAnimationDecorator == null) {
            return false;
        }
        RecProfileAnimationDecorator exitAnimationDecorator = recProfileView.getExitAnimationDecorator();
        if (exitAnimationDecorator == null) {
            return false;
        }
        if (enterAnimationDecorator.getState() == State.RUNNING || exitAnimationDecorator.getState() == State.RUNNING) {
            z = true;
        }
        return z;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.m2675a((View) this);
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.setOnPreSwipeListener(this.preSwipeListener);
        cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        RecCardViewHolderFactory recCardViewHolderFactory = this.recCardViewHolderFactory;
        if (recCardViewHolderFactory == null) {
            C2668g.m10310b("recCardViewHolderFactory");
        }
        cardStackLayout.setCardStackViewHolderFactory(recCardViewHolderFactory);
        cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.setOnCardPresentedListener(this.onCardPresentedListener);
        cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.a(this.onTopCardMovedListener);
        cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.addOnChildAttachStateChangeListener(new RecsView$CardAttachChangeListener(this));
        cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.addOnChildAttachStateChangeListener(this.adsViewRemoveListener);
        GamepadView gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        gamepadView.setGamepadClickListener(this.gamepadClickListener);
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        RecsPresenter recsPresenter = this.presenter;
        if (recsPresenter == null) {
            C2668g.m10310b("presenter");
        }
        Deadshot.take(this, recsPresenter);
        doOnEachAdsView(RecsView$onResume$1.INSTANCE);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        Deadshot.drop(this);
        doOnEachAdsView(RecsView$onPause$1.INSTANCE);
        this.nudgeAnimation.a();
        dismissFireboardingDialog();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo36a(this);
        ContainerRegistrar a = ContainerRegistrar.f8241v.a(this);
        if (a != null) {
            a.setContainer(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.nudgeAnimation.a();
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo37b(this);
        dismissFireboardingDialog();
        Deadshot.drop(this);
    }

    public boolean onBackPressed() {
        if (this.recProfileView != null) {
            RecProfileView recProfileView = this.recProfileView;
            if (recProfileView == null) {
                C2668g.m10304a();
            }
            if (recProfileView.getParent() != null) {
                if (!isProfileViewAnimating()) {
                    recProfileView = this.recProfileView;
                    if (recProfileView == null) {
                        C2668g.m10304a();
                    }
                    recProfileView.exit();
                }
                return true;
            }
        }
        if (this.superLikeableViewContainer == null) {
            return false;
        }
        SuperLikeableViewContainer superLikeableViewContainer = this.superLikeableViewContainer;
        if (superLikeableViewContainer == null) {
            C2668g.m10304a();
        }
        return superLikeableViewContainer.onBackPressed();
    }

    public void insertRecs(int i, @NotNull List<? extends C8395a<?>> list) {
        C2668g.m10309b(list, "cards");
        if (i != 0 || this.recProfileView == null) {
            CardStackLayout cardStackLayout = this.cardStack;
            if (cardStackLayout == null) {
                C2668g.m10310b("cardStack");
            }
            cardStackLayout.a(i, list);
            return;
        }
        RecProfileView recProfileView = this.recProfileView;
        if (recProfileView == null) {
            C2668g.m10304a();
        }
        exitProfileView(recProfileView, new RecsView$insertRecs$1(this, i, list));
    }

    public void removeRec(int i, @Nullable C8361a c8361a) {
        if (i == 0 && this.recProfileView != null) {
            RecProfileView recProfileView = this.recProfileView;
            if (recProfileView == null) {
                C2668g.m10304a();
            }
            exitProfileView(recProfileView, RecsView$removeRec$1.INSTANCE);
        }
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.a(i, c8361a);
    }

    public void removeAdsRec(int i, @Nullable C8361a c8361a) {
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        ViewHolder findViewHolderForAdapterPosition = cardStackLayout.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition != null) {
            this.adsViewRemoveListener.addAdsViewToBeRemoved(findViewHolderForAdapterPosition.itemView);
        }
        cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.a(i, c8361a);
    }

    public void clearRecs() {
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.e();
    }

    public void insertRec(int i, @NotNull C8395a<?> c8395a) {
        C2668g.m10309b(c8395a, "card");
        if (i != 0 || this.recProfileView == null) {
            CardStackLayout cardStackLayout = this.cardStack;
            if (cardStackLayout == null) {
                C2668g.m10310b("cardStack");
            }
            cardStackLayout.a(i, c8395a);
            return;
        }
        RecProfileView recProfileView = this.recProfileView;
        if (recProfileView == null) {
            C2668g.m10304a();
        }
        exitProfileView(recProfileView, new RecsView$insertRec$1(this, i, c8395a));
    }

    public void rewindRec(@NotNull C8395a<?> c8395a) {
        C2668g.m10309b(c8395a, "card");
        if (this.gamepadRewindButtonAnimationDecorator != null) {
            GamepadRewindButtonAnimationDecorator gamepadRewindButtonAnimationDecorator = this.gamepadRewindButtonAnimationDecorator;
            if (gamepadRewindButtonAnimationDecorator == null) {
                C2668g.m10304a();
            }
            gamepadRewindButtonAnimationDecorator.end();
        }
        GamepadView gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        this.gamepadRewindButtonAnimationDecorator = new GamepadRewindButtonAnimationDecorator(gamepadView, cardStackLayout);
        CardStackLayout cardStackLayout2 = this.cardStack;
        if (cardStackLayout2 == null) {
            C2668g.m10310b("cardStack");
        }
        GamepadRewindButtonAnimationDecorator gamepadRewindButtonAnimationDecorator2 = this.gamepadRewindButtonAnimationDecorator;
        if (gamepadRewindButtonAnimationDecorator2 == null) {
            C2668g.m10304a();
        }
        cardStackLayout2.setCardRewindAnimationStateListener(gamepadRewindButtonAnimationDecorator2);
        cardStackLayout2 = this.cardStack;
        if (cardStackLayout2 == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout2.a(0, c8395a);
    }

    public void enableSwipes() {
        this.swipesEnabled = true;
    }

    public void disableSwipes() {
        this.swipesEnabled = false;
    }

    public void freezeAnimatingCards() {
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.b();
    }

    public void revertLastAnimatedCard() {
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.c();
    }

    public void showTutorialSwipeDialog(@NotNull Swipe swipe) {
        ConfirmationType confirmationType;
        Function0 recsView$showTutorialSwipeDialog$1;
        C2668g.m10309b(swipe, "swipe");
        Method method = swipe.getActionContext().getMethod();
        switch (RecsView$WhenMappings.$EnumSwitchMapping$1[swipe.getType().ordinal()]) {
            case 1:
                if (method == SwipeMethod.CARD) {
                    confirmationType = ConfirmationType.DRAGGING_RIGHT;
                } else {
                    confirmationType = ConfirmationType.TAPPING_HEART;
                }
                recsView$showTutorialSwipeDialog$1 = new RecsView$showTutorialSwipeDialog$1(this, swipe);
                break;
            case 2:
                if (method == SwipeMethod.CARD) {
                    confirmationType = ConfirmationType.DRAGGING_LEFT;
                } else {
                    confirmationType = ConfirmationType.TAPPING_X;
                }
                recsView$showTutorialSwipeDialog$1 = new RecsView$showTutorialSwipeDialog$2(this, swipe);
                break;
            case 3:
                confirmationType = ConfirmationType.SUPERLIKE;
                recsView$showTutorialSwipeDialog$1 = new RecsView$showTutorialSwipeDialog$3(this, swipe);
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Trying to show a tutorial for type ");
                stringBuilder.append(swipe.getType());
                C0001a.m31d(stringBuilder.toString(), new Object[0]);
                return;
        }
        ConfirmationType confirmationType2 = confirmationType;
        Swipe c11117p = new C11117p(getContext(), confirmationType2, RecFieldDecorationExtensionsKt.name(swipe.getRec()), new RecsView$showTutorialSwipeDialog$swipeDialog$1(this, recsView$showTutorialSwipeDialog$1), new RecsView$showTutorialSwipeDialog$swipeDialog$2(this));
        c11117p.setCanceledOnTouchOutside(false);
        c11117p.show();
    }

    public void animateSuperlikeButton(int i) {
        GamepadView gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        gamepadView.animateSuperlike(i);
    }

    public void showGamepadWithBoost() {
        showGamepad();
    }

    public void displayBoostSummary() {
        BoostSummaryDialog boostSummaryDialog;
        av.m10218a(this.boostUpdateDialog);
        if (this.boostSummaryDialog != null) {
            boostSummaryDialog = this.boostSummaryDialog;
            if (boostSummaryDialog == null) {
                C2668g.m10304a();
            }
            if (boostSummaryDialog.isShowing()) {
                return;
            }
        }
        this.boostSummaryDialog = new BoostSummaryDialog(getContext());
        boostSummaryDialog = this.boostSummaryDialog;
        if (boostSummaryDialog == null) {
            C2668g.m10304a();
        }
        boostSummaryDialog.a(new RecsView$displayBoostSummary$1(this));
        boostSummaryDialog = this.boostSummaryDialog;
        if (boostSummaryDialog == null) {
            C2668g.m10304a();
        }
        boostSummaryDialog.show();
    }

    public void refreshTopCard() {
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.d();
    }

    public void showBoostUpdateDialog(@NotNull BoostUpdateProvider$a boostUpdateProvider$a) {
        BoostUpdateDialog boostUpdateDialog;
        C2668g.m10309b(boostUpdateProvider$a, "currentBoostTick");
        if (this.boostUpdateDialog != null) {
            boostUpdateDialog = this.boostUpdateDialog;
            if (boostUpdateDialog == null) {
                C2668g.m10304a();
            }
            if (boostUpdateDialog.isShowing()) {
                return;
            }
        }
        this.boostUpdateDialog = new BoostUpdateDialog(getContext());
        boostUpdateDialog = this.boostUpdateDialog;
        if (boostUpdateDialog == null) {
            C2668g.m10304a();
        }
        boostUpdateDialog.a(boostUpdateProvider$a);
        boostUpdateProvider$a = this.boostUpdateDialog;
        if (boostUpdateProvider$a == null) {
            C2668g.m10304a();
        }
        boostUpdateProvider$a.show();
    }

    public void showReferredRecLoadError() {
        if (this.recProfileView != null) {
            RecProfileView recProfileView = this.recProfileView;
            if (recProfileView == null) {
                C2668g.m10304a();
            }
            exitProfileView(recProfileView, new RecsView$showReferredRecLoadError$1(this));
            return;
        }
        at.f47621a.a(this, R.string.user_not_found);
    }

    public void showSuperlikeError() {
        at.f47621a.a(this, R.string.cannot_superlike);
    }

    public void hideCardStackView() {
        View[] viewArr = new View[1];
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        viewArr[0] = cardStackLayout;
        av.m10228c(viewArr);
    }

    public void showCardStackView() {
        View[] viewArr = new View[1];
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        viewArr[0] = cardStackLayout;
        av.m10213a(viewArr);
    }

    public void hideHeartsAnimation() {
        GamepadView gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        gamepadView.boostButtonView.m14736a();
        gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        gamepadView.boostButtonView.setOnEmitterAttachedListener((BoostButtonView$OnEmitterAttached) null);
    }

    public void showHeartsAnimation() {
        GamepadView gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        gamepadView.boostButtonView.m14737b();
        gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        gamepadView.boostButtonView.setOnEmitterAttachedListener(this.heartsEmitterListener);
    }

    public void switchToCardStackView() {
        setDisplayedChild(1);
    }

    public void switchToDiscoveryOffView() {
        setDisplayedChild(0);
    }

    public void enableBoostButton(boolean z) {
        GamepadView gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        Object boostButtonView = gamepadView.getBoostButtonView();
        C2668g.m10305a(boostButtonView, "gamepad.getBoostButtonView()");
        boostButtonView.setEnabled(z);
    }

    public void launchPaywall(@NotNull C10076o c10076o) {
        C2668g.m10309b(c10076o, "paywallFlow");
        c10076o.a(getContext());
    }

    public void openUrl(@NotNull String str) {
        C2668g.m10309b(str, "url");
        Object context = getContext();
        C2668g.m10305a(context, "context");
        if (C15365p.a(context)) {
            new C0163a().m597a(context, R.anim.enter_bottom_to_top, R.anim.enter_top_to_bottom).m600b(context, R.anim.exit_top_to_bottom, R.anim.exit_bottom_to_top).m598a(true).m596a(this.whiteColor).m599a().m601a(context, Uri.parse(str));
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
    }

    public void showSuperLikeableGame() {
        if (this.superLikeableViewContainer == null) {
            Object context = getContext();
            C2668g.m10305a(context, "context");
            SuperLikeableViewContainer superLikeableViewContainer = new SuperLikeableViewContainer(context);
            this.superLikeableViewContainer = superLikeableViewContainer;
            superLikeableViewContainer.setLayoutParams(new LayoutParams(-1, -1));
            superLikeableViewContainer.setStringResources(createSuperLikeableStringResources());
            superLikeableViewContainer.a(new RecsView$showSuperLikeableGame$1(this));
            superLikeableViewContainer.setSuperLikeRemainingCount(this.superLikeRemainingCount);
            superLikeableViewContainer.setOnRecClickedListener(new RecsView$showSuperLikeableGame$2(this));
            superLikeableViewContainer.a(this.superLikeableGameListener);
            rootView().addView(superLikeableViewContainer);
        }
    }

    public void hideSuperLikeableGame() {
        removeSuperLikeableView();
    }

    public void startSuperLikeableEntranceAnimation(@NotNull C15148a c15148a) {
        C2668g.m10309b(c15148a, "params");
        if (this.superLikeableViewContainer == null) {
            C0001a.m29c((Throwable) new IllegalStateException("SuperLikeable View is null in startSuperLikeableEntranceAnimation"));
            return;
        }
        GamepadView gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        Object superlikeButton = gamepadView.getSuperlikeButton();
        C2668g.m10305a(superlikeButton, "gamepadSuperlikeButton");
        C15148a c15148a2 = new C15148a(c15148a.a(), c15148a.b(), c15148a.c(), c15148a.d(), C15138d.a((View) superlikeButton), c15148a.f(), true);
        c15148a = this.superLikeableViewContainer;
        if (c15148a == null) {
            C2668g.m10304a();
        }
        c15148a.a(c15148a2);
    }

    public void disableTouch() {
        TouchBlockingFrameLayout touchBlockingFrameLayout = this.cardStackContainer;
        if (touchBlockingFrameLayout == null) {
            C2668g.m10310b("cardStackContainer");
        }
        touchBlockingFrameLayout.startBlocking();
    }

    public void enableTouch() {
        TouchBlockingFrameLayout touchBlockingFrameLayout = this.cardStackContainer;
        if (touchBlockingFrameLayout == null) {
            C2668g.m10310b("cardStackContainer");
        }
        touchBlockingFrameLayout.stopBlocking();
    }

    public void setSuperLikeRemainingCount(int i) {
        this.superLikeRemainingCount = i;
        SuperLikeableViewContainer superLikeableViewContainer = this.superLikeableViewContainer;
        if (superLikeableViewContainer != null) {
            superLikeableViewContainer.setSuperLikeRemainingCount(i);
        }
    }

    @NotNull
    public C8899a getAnimatableViews() {
        if (this.animatableRecsDiscoveryViews == null) {
            View[] viewArr = new View[5];
            GamepadView gamepadView = this.gamepad;
            if (gamepadView == null) {
                C2668g.m10310b("gamepad");
            }
            Object obj = gamepadView.rewindButton;
            C2668g.m10305a(obj, "gamepad.rewindButton");
            viewArr[0] = (View) obj;
            gamepadView = this.gamepad;
            if (gamepadView == null) {
                C2668g.m10310b("gamepad");
            }
            obj = gamepadView.passButton;
            C2668g.m10305a(obj, "gamepad.passButton");
            viewArr[1] = (View) obj;
            gamepadView = this.gamepad;
            if (gamepadView == null) {
                C2668g.m10310b("gamepad");
            }
            obj = gamepadView.getSuperlikeButton();
            C2668g.m10305a(obj, "gamepad.superlikeButton");
            viewArr[2] = (View) obj;
            gamepadView = this.gamepad;
            if (gamepadView == null) {
                C2668g.m10310b("gamepad");
            }
            obj = gamepadView.likeButton;
            C2668g.m10305a(obj, "gamepad.likeButton");
            viewArr[3] = (View) obj;
            gamepadView = this.gamepad;
            if (gamepadView == null) {
                C2668g.m10310b("gamepad");
            }
            obj = gamepadView.boostButtonView;
            C2668g.m10305a(obj, "gamepad.boostButtonView");
            viewArr[4] = (View) obj;
            List b = C19301m.b(viewArr);
            CardStackLayout cardStackLayout = this.cardStack;
            if (cardStackLayout == null) {
                C2668g.m10310b("cardStack");
            }
            this.animatableRecsDiscoveryViews = new C8899a(cardStackLayout, b);
        }
        C8899a c8899a = this.animatableRecsDiscoveryViews;
        if (c8899a == null) {
            C2668g.m10304a();
        }
        return c8899a;
    }

    public void onFireboardingRecCardViewMovedToTop() {
        Object context = getContext();
        C2668g.m10305a(context, "context");
        C9570a a = new FireboardingViewContainer(context, null, 2, null).a();
        this.fireboardingViewContainerDialog = a;
        a.show();
    }

    public void onFireboardingRecCardViewReadyForAnimation(@NotNull C9619b c9619b) {
        Object obj;
        C2668g.m10309b(c9619b, "recCardViewParams");
        Level e = c9619b.e();
        GamepadView gamepadView;
        switch (RecsView$WhenMappings.$EnumSwitchMapping$2[e.ordinal()]) {
            case 1:
                gamepadView = this.gamepad;
                if (gamepadView == null) {
                    C2668g.m10310b("gamepad");
                }
                obj = gamepadView.boostButtonView;
                break;
            case 2:
                gamepadView = this.gamepad;
                if (gamepadView == null) {
                    C2668g.m10310b("gamepad");
                }
                obj = gamepadView.rewindButton;
                break;
            case 3:
                gamepadView = this.gamepad;
                if (gamepadView == null) {
                    C2668g.m10310b("gamepad");
                }
                obj = gamepadView.superLikeButton;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Fireboarding Animation for unsupported Type:");
                stringBuilder.append(e);
                throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
        }
        View c = c9619b.c();
        ViewCompat.m2215i(c, 0.0f);
        C9571a a = c9619b.a();
        GradientDrawable b = c9619b.b();
        int d = c9619b.d();
        c9619b = this.featureNameFactory;
        Object context = getContext();
        C2668g.m10305a(context, "context");
        context = context.getResources();
        C2668g.m10305a(context, "context.resources");
        String a2 = c9619b.a(context, e);
        C2668g.m10305a(obj, "anchorView");
        C9568a c9568a = new C9568a(a, b, a2, d, c, C9617b.a((View) obj));
        c9619b = this.fireboardingViewContainerDialog;
        if (c9619b != null) {
            c9619b.a(c9568a, new C18770xcac5927c(this, c9568a, e), new C18771xcac5927d(this, c9568a, e));
        }
    }

    public void dismissFireboardingViewContainer() {
        dismissFireboardingDialog();
    }

    public void showNudgeAnimation() {
        ViewGroup rootView = rootView();
        if (!(rootView instanceof TouchBlockingViewContainer)) {
            throw new IllegalStateException("RootView should be an instance of TouchBlockingViewContainer".toString());
        } else if (rootView == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.base.view.TouchBlockingViewContainer");
        } else {
            TouchBlockingViewContainer touchBlockingViewContainer = (TouchBlockingViewContainer) rootView;
            CardStackLayout cardStackLayout = this.cardStack;
            if (cardStackLayout == null) {
                C2668g.m10310b("cardStack");
            }
            doWhenReadyForNudge(cardStackLayout, new RecsView$showNudgeAnimation$1(this, touchBlockingViewContainer));
        }
    }

    public void showFireboardingLevelTutorialTooltip(@NotNull Level level) {
        C2668g.m10309b(level, "level");
        Context a = C14398a.a(getContext());
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        } else if (!((Activity) a).isFinishing()) {
            switch (RecsView$WhenMappings.$EnumSwitchMapping$3[level.ordinal()]) {
                case 1:
                    level = createRewindButtonTutorialTooltipParams();
                    break;
                case 2:
                    level = createSuperlikeButtonTutorialTooltipParams();
                    break;
                case 3:
                    level = createBoostButtonTutorialTooltipParams();
                    break;
                default:
                    throw ((Throwable) new UnsupportedOperationException("The tutorial for this level is not yet supported"));
            }
            C9603f.a(new C9603f(), level, null, 2, null).b(DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL).show();
        }
    }

    public void sendScreenshotInAppNotification(@NotNull C14826a c14826a) {
        C2668g.m10309b(c14826a, "screenshot");
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        C8395a f = cardStackLayout.f();
        if (f instanceof UserRecCard) {
            Rec topRec = getTopRec();
            if (topRec == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            String name = RecFieldDecorationExtensionsKt.name(topRec);
            if (name == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            name = C19303i.a(C19303i.b(name).toString(), ",", "", false, 4, null);
            C14548a c14548a = this.tinderNotificationFactory;
            if (c14548a == null) {
                C2668g.m10310b("tinderNotificationFactory");
            }
            Object url = ((Photo) ((UserRecCard) f).userRec().getUser().photos().get(0)).url();
            C2668g.m10305a(url, "topCard.userRec().user.photos()[0].url()");
            c14548a.a(name, url).c(new RecsView$sendScreenshotInAppNotification$1(this, f, c14826a)).m10386b(Schedulers.io()).m10394b(RxUtils.m10187b());
        }
    }

    public void notifyScreenshotCaptured(boolean z) {
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        C8395a f = cardStackLayout.f();
        if (f instanceof UserRecCard) {
            RecsPresenter recsPresenter = this.presenter;
            if (recsPresenter == null) {
                C2668g.m10310b("presenter");
            }
            recsPresenter.onScreenshotCaptured(((UserRecCard) f).userRec().getId(), z);
        }
    }

    public final void setLockableViewPagerParent(@NotNull LockableViewPager$LockableViewPagerParent lockableViewPager$LockableViewPagerParent) {
        C2668g.m10309b(lockableViewPager$LockableViewPagerParent, "lockableViewPagerParent");
        this.lockableViewPagerParent = lockableViewPager$LockableViewPagerParent;
    }

    public final void onUserRecCardViewClick(@NotNull BaseUserRecCardView baseUserRecCardView) {
        C2668g.m10309b(baseUserRecCardView, "userRecCardView");
        if (!this.stampIsAnimating) {
            if (!isProfileViewAnimating()) {
                Object displayedPhotoUrl = baseUserRecCardView.getDisplayedPhotoUrl();
                if (displayedPhotoUrl != null) {
                    Object userRec = baseUserRecCardView.getUserRecCard().userRec();
                    RecsPresenter recsPresenter = this.presenter;
                    if (recsPresenter == null) {
                        C2668g.m10310b("presenter");
                    }
                    C2668g.m10305a(userRec, "userRec");
                    recsPresenter.onUserRecClicked(userRec);
                    int displayedPhotoIndex = baseUserRecCardView.getDisplayedPhotoIndex();
                    RecsView$Companion recsView$Companion = Companion;
                    C2668g.m10305a(displayedPhotoUrl, "displayedPhotoUrl");
                    int size = userRec.getUser().photos().size();
                    View view = baseUserRecCardView;
                    Object context = getContext();
                    C2668g.m10305a(context, "context");
                    PlaceholderPhotoConfig access$createPlaceholderPhotoConfig = RecsView$Companion.access$createPlaceholderPhotoConfig(recsView$Companion, displayedPhotoIndex, displayedPhotoUrl, size, view, context);
                    GamepadView gamepadView = this.gamepad;
                    if (gamepadView == null) {
                        C2668g.m10310b("gamepad");
                    }
                    displayedPhotoUrl = gamepadView.getLikeButton();
                    C2668g.m10305a(displayedPhotoUrl, "gamepad.getLikeButton()");
                    boolean isEnabled = displayedPhotoUrl.isEnabled();
                    GamepadView gamepadView2 = this.gamepad;
                    if (gamepadView2 == null) {
                        C2668g.m10310b("gamepad");
                    }
                    Object superlikeButton = gamepadView2.getSuperlikeButton();
                    C2668g.m10305a(superlikeButton, "gamepad.superlikeButton");
                    boolean isEnabled2 = superlikeButton.isEnabled();
                    GamepadView gamepadView3 = this.gamepad;
                    if (gamepadView3 == null) {
                        C2668g.m10310b("gamepad");
                    }
                    Object passButton = gamepadView3.getPassButton();
                    C2668g.m10305a(passButton, "gamepad.getPassButton()");
                    boolean isEnabled3 = passButton.isEnabled();
                    GamepadView gamepadView4 = this.gamepad;
                    if (gamepadView4 == null) {
                        C2668g.m10310b("gamepad");
                    }
                    context = gamepadView4.superLikeButton;
                    C2668g.m10305a(context, "gamepad.superLikeButton");
                    GamepadButtonStates gamepadButtonStates = new GamepadButtonStates(isEnabled, isEnabled2, isEnabled3, context.getVisibility() == 0);
                    RecsPhotosViewedCache recsPhotosViewedCache = this.recsPhotosViewedCache;
                    if (recsPhotosViewedCache == null) {
                        C2668g.m10310b("recsPhotosViewedCache");
                    }
                    recsPhotosViewedCache.notifyPhotoViewed(displayedPhotoIndex, userRec.getId(), RecsPhotoSource.PROFILE);
                    UserRecProfileView userRecProfileView = new UserRecProfileView(getContext(), userRec, displayedPhotoIndex, gamepadButtonStates);
                    userRecProfileView.a(ProfileScreenSource.RECS);
                    RecProfileView recProfileView = userRecProfileView;
                    this.recProfileView = recProfileView;
                    userRecProfileView.setListener(new RecsView$onUserRecCardViewClick$1(this));
                    userRecProfileView.setRecProfileExitClickedListener(new RecsView$onUserRecCardViewClick$2(this));
                    baseUserRecCardView.setEnabled(false);
                    prepareForProfileEntranceAnimation(access$createPlaceholderPhotoConfig);
                    prepareForProfileExitAnimation(access$createPlaceholderPhotoConfig);
                    showRecProfileView(recProfileView);
                }
            }
        }
    }

    public final void likeRec(@NotNull Rec rec, @NotNull Method method) {
        C2668g.m10309b(rec, "rec");
        C2668g.m10309b(method, "swipeMethod");
        if (method == SwipeMethod.CARD) {
            method = this.presenter;
            if (method == null) {
                C2668g.m10310b("presenter");
            }
            method.likeOnRecFromCard(rec);
        } else if (method == SwipeMethod.GAMEPAD_BUTTON) {
            method = this.presenter;
            if (method == null) {
                C2668g.m10310b("presenter");
            }
            method.likeOnRecFromCardStackButton(rec);
        } else if (method == SwipeMethod.AD_CLICK) {
            method = this.presenter;
            if (method == null) {
                C2668g.m10310b("presenter");
            }
            method.likeOnAdRecFromAdClick(rec);
        }
    }

    private final void doWhenReadyForNudge(ViewGroup viewGroup, Function0<C15813i> function0) {
        if (!C8304b.b(viewGroup) || viewGroup.getChildCount() <= 0) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new RecsView$doWhenReadyForNudge$1(this, viewGroup, function0));
        } else {
            function0.invoke();
        }
    }

    private final void showGamepad() {
        GamepadView gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        gamepadView.setVisibility(0);
    }

    private final void likeOnTopRecFromCardStackButton() {
        Rec topRec = getTopRec();
        if (topRec != null) {
            RecsPresenter recsPresenter = this.presenter;
            if (recsPresenter == null) {
                C2668g.m10310b("presenter");
            }
            recsPresenter.likeOnRecFromCardStackButton(topRec);
        }
    }

    private final void passOnTopRecFromCardStackButton() {
        Rec topRec = getTopRec();
        if (topRec != null) {
            RecsPresenter recsPresenter = this.presenter;
            if (recsPresenter == null) {
                C2668g.m10310b("presenter");
            }
            recsPresenter.passOnRecFromCardStackButton(topRec);
        }
    }

    private final void superlikeOnTopRecFromCardStackButton() {
        Rec topRec = getTopRec();
        if (topRec != null) {
            GamepadView gamepadView = this.gamepad;
            if (gamepadView == null) {
                C2668g.m10310b("gamepad");
            }
            if (!gamepadView.isSuperlikeAnimating()) {
                RecsPresenter recsPresenter = this.presenter;
                if (recsPresenter == null) {
                    C2668g.m10310b("presenter");
                }
                recsPresenter.superlikeOnRecFromCardStackButton(topRec);
            }
        }
    }

    private final Rec getRec(C8395a<?> c8395a) {
        c8395a = c8395a.getItem();
        if (!(c8395a instanceof Rec)) {
            c8395a = null;
        }
        Rec rec = (Rec) c8395a;
        if (rec != null) {
            return rec;
        }
        c8395a = new StringBuilder();
        c8395a.append("Card item is expected to implement ");
        c8395a.append(Rec.class.getSimpleName());
        throw new IllegalArgumentException(c8395a.toString().toString());
    }

    private final void showRecProfileView(RecProfileView<?> recProfileView) {
        recProfileView.enter(rootView());
        this.recProfileView = recProfileView;
    }

    private final ViewGroup rootView() {
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        Object window = ((Activity) context).getWindow();
        C2668g.m10305a(window, "(context as Activity)\n            .window");
        window = window.getDecorView();
        C2668g.m10305a(window, "(context as Activity)\n  …ow\n            .decorView");
        View findViewById = window.getRootView().findViewById(R.id.main_activity_container);
        if (findViewById != null) {
            return (ViewGroup) findViewById;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    private final void exitProfileView(RecProfileView<?> recProfileView, EndListener endListener) {
        RecProfileAnimationDecorator enterAnimationDecorator = recProfileView.getEnterAnimationDecorator();
        if (enterAnimationDecorator == null) {
            throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
        }
        RecProfileAnimationDecorator exitAnimationDecorator = recProfileView.getExitAnimationDecorator();
        if (exitAnimationDecorator == null) {
            throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
        }
        Object obj = null;
        if ((enterAnimationDecorator.getState() != State.INITIALIZED ? 1 : null) == null) {
            throw ((Throwable) new IllegalStateException("Check failed.".toString()));
        }
        if (!(enterAnimationDecorator.getState() == State.FINISHED && exitAnimationDecorator.getState() == State.FINISHED)) {
            obj = 1;
        }
        if (obj == null) {
            throw ((Throwable) new IllegalStateException("Check failed.".toString()));
        } else if (enterAnimationDecorator.getState() == State.RUNNING) {
            enterAnimationDecorator.addEndListener(new RecsView$exitProfileView$1(exitAnimationDecorator, endListener, recProfileView));
        } else if (exitAnimationDecorator.getState() == State.RUNNING) {
            exitAnimationDecorator.addEndListener(endListener);
        } else {
            if (exitAnimationDecorator.getState() == State.INITIALIZED) {
                exitAnimationDecorator.addEndListener(endListener);
                recProfileView.exit();
            }
        }
    }

    private final void animateStamp(RecCardView<?> recCardView, View view, Function0<C15813i> function0) {
        recCardView.disableStampsDecoration();
        this.stampIsAnimating = true;
        view.animate().setDuration(STAMP_ANIMATION_DURATION_MS).alpha(1.0f).setListener((AnimatorListener) new RecsView$animateStamp$1(this, function0));
    }

    private final C9601a createRewindButtonTutorialTooltipParams() {
        GamepadView gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        Object obj = gamepadView.rewindButton;
        C2668g.m10305a(obj, "gamepad.rewindButton");
        return new C9601a((View) obj, au.c(this, R.color.white), au.a(this, R.string.fireboarding_rewind_tooltip, new String[0]), au.c(this, R.color.rewind_gradient_end_color));
    }

    private final C9601a createSuperlikeButtonTutorialTooltipParams() {
        GamepadView gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        Object obj = gamepadView.superLikeButton;
        C2668g.m10305a(obj, "gamepad.superLikeButton");
        return new C9601a((View) obj, au.c(this, R.color.white), au.a(this, R.string.fireboarding_superlike_tooltip, new String[0]), au.c(this, R.color.superlike_gradient_end));
    }

    private final C9601a createBoostButtonTutorialTooltipParams() {
        GamepadView gamepadView = this.gamepad;
        if (gamepadView == null) {
            C2668g.m10310b("gamepad");
        }
        Object obj = gamepadView.boostButtonView;
        C2668g.m10305a(obj, "gamepad.boostButtonView");
        return new C9601a((View) obj, au.c(this, R.color.white), au.a(this, R.string.fireboarding_boost_tooltip, new String[0]), au.c(this, R.color.boost_gradient_end_color));
    }

    private final void doOnEachAdsView(Function1<? super AdRecCardView, C15813i> function1) {
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        int childCount = cardStackLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            CardStackLayout cardStackLayout2 = this.cardStack;
            if (cardStackLayout2 == null) {
                C2668g.m10310b("cardStack");
            }
            View childAt = cardStackLayout2.getChildAt(i);
            if (childAt != null && (childAt instanceof AdRecCardView)) {
                function1.invoke(childAt);
            }
        }
    }

    private final void logUnexpectedRecOnPhotoChangeException(RuntimeException runtimeException) {
        C0001a.m26b(runtimeException);
    }

    private final void removeSuperLikeableView() {
        if (this.superLikeableViewContainer != null) {
            rootView().removeView(this.superLikeableViewContainer);
            SuperLikeableViewContainer superLikeableViewContainer = this.superLikeableViewContainer;
            if (superLikeableViewContainer == null) {
                C2668g.m10304a();
            }
            superLikeableViewContainer.b(this.superLikeableGameListener);
            this.superLikeableViewContainer = (SuperLikeableViewContainer) null;
        }
    }

    private final C15141a createSuperLikeableStringResources() {
        Object context = getContext();
        C2668g.m10305a(context, "context");
        Resources resources = context.getResources();
        Object string = resources.getString(R.string.superlikeable_header_free);
        C2668g.m10305a(string, "res.getString(R.string.superlikeable_header_free)");
        if (string == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        C2668g.m10305a(string.toUpperCase(), "(this as java.lang.String).toUpperCase()");
        Object string2 = resources.getString(R.string.superlikeable_footer_skip);
        C2668g.m10305a(string2, "res.getString(R.string.superlikeable_footer_skip)");
        if (string2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        string2 = string2.toUpperCase();
        C2668g.m10305a(string2, "(this as java.lang.String).toUpperCase()");
        context = resources.getString(R.string.superlikeable_header, new Object[]{string});
        C2668g.m10305a(context, "header");
        return new C15141a((CharSequence) context, string2);
    }

    public final void onShowProfileClicked(@NotNull Rec rec, @NotNull BrandedProfileCardAd brandedProfileCardAd, int i, @NotNull RecCardView<?> recCardView) {
        C2668g.m10309b(rec, "adRec");
        C2668g.m10309b(brandedProfileCardAd, "brandedProfileCardAd");
        C2668g.m10309b(recCardView, "recCardView");
        if (!this.stampIsAnimating) {
            if (!isProfileViewAnimating()) {
                Context context = getContext();
                int size = brandedProfileCardAd.images().size();
                GamepadButtonStates gamepadButtonStates = new GamepadButtonStates(true, false, true, false);
                String str = (String) brandedProfileCardAd.images().get(i);
                RecsView$Companion recsView$Companion = Companion;
                View view = recCardView;
                C2668g.m10305a((Object) context, "context");
                PlaceholderPhotoConfig access$createPlaceholderPhotoConfig = RecsView$Companion.access$createPlaceholderPhotoConfig(recsView$Companion, i, str, size, view, context);
                C14418b c14418b = this.profileFactory;
                if (c14418b == null) {
                    C2668g.m10310b("profileFactory");
                }
                Object a = c14418b.a(brandedProfileCardAd, i, recCardView.getWidth(), recCardView.getHeight());
                C2668g.m10305a(a, "profile");
                i = new C14753a(rec, a, gamepadButtonStates);
                brandedProfileCardAd = new C16456c(context);
                RecProfileView recProfileView = (RecProfileView) brandedProfileCardAd;
                this.recProfileView = recProfileView;
                brandedProfileCardAd.a(i);
                brandedProfileCardAd.setListener((Listener) new RecsView$onShowProfileClicked$1(this, rec));
                prepareForProfileEntranceAnimation(access$createPlaceholderPhotoConfig);
                prepareForProfileExitAnimation(access$createPlaceholderPhotoConfig);
                showRecProfileView(recProfileView);
            }
        }
    }

    private final void prepareForProfileEntranceAnimation(PlaceholderPhotoConfig placeholderPhotoConfig) {
        RecProfileView recProfileView = this.recProfileView;
        if (recProfileView == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        recProfileView.getProfileView().m15111a(false);
        this.lockableViewPagerParent.setPagingEnabled(false);
        TouchBlockingFrameLayout touchBlockingFrameLayout = this.cardStackContainer;
        if (touchBlockingFrameLayout == null) {
            C2668g.m10310b("cardStackContainer");
        }
        touchBlockingFrameLayout.startBlocking();
        placeholderPhotoConfig = RecsView$Companion.access$getProfileEntranceAnimationDecorator(Companion, recProfileView, placeholderPhotoConfig);
        placeholderPhotoConfig.addStartListener(new RecsView$prepareForProfileEntranceAnimation$1(this));
        placeholderPhotoConfig.addEndListener(new RecsView$prepareForProfileEntranceAnimation$2(this));
        recProfileView.setEnterAnimationDecorator((RecProfileAnimationDecorator) placeholderPhotoConfig);
    }

    private final void prepareForProfileExitAnimation(PlaceholderPhotoConfig placeholderPhotoConfig) {
        RecProfileView recProfileView = this.recProfileView;
        if (recProfileView == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        DefaultRecProfileExitAnimationDecorator defaultRecProfileExitAnimationDecorator = new DefaultRecProfileExitAnimationDecorator(recProfileView, placeholderPhotoConfig);
        defaultRecProfileExitAnimationDecorator.addEndListener((EndListener) new RecsView$prepareForProfileExitAnimation$1(this));
        recProfileView.setExitAnimationDecorator(defaultRecProfileExitAnimationDecorator);
    }

    private final void onProfileEntranceAnimationStart() {
        RecProfileView recProfileView = this.recProfileView;
        if (recProfileView == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.setAlpha(0.0f);
        recProfileView.getProfileView().m15111a(false);
    }

    private final void onProfileEntranceAnimationEnd() {
        RecProfileView recProfileView = this.recProfileView;
        if (recProfileView == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        TouchBlockingFrameLayout touchBlockingFrameLayout = this.cardStackContainer;
        if (touchBlockingFrameLayout == null) {
            C2668g.m10310b("cardStackContainer");
        }
        touchBlockingFrameLayout.stopBlocking();
        recProfileView.getProfileView().m15111a(true);
    }

    private final void onProfileExitAnimationEnd() {
        this.lockableViewPagerParent.setPagingEnabled(true);
        rootView().removeView(this.recProfileView);
        CardStackLayout cardStackLayout = this.cardStack;
        if (cardStackLayout == null) {
            C2668g.m10310b("cardStack");
        }
        cardStackLayout.setAlpha(1.0f);
        this.recProfileView = (RecProfileView) null;
    }

    private final void dismissFireboardingDialog() {
        C9570a c9570a = this.fireboardingViewContainerDialog;
        if (c9570a != null) {
            c9570a.dismiss();
            this.fireboardingViewContainerDialog = (C9570a) null;
        }
    }

    private final void onGamePadButtonClickedFromProfile(SwipeType swipeType, Rec rec) {
        if (isSwipesEnabled()) {
            RecCardView recCardView = this.topRecCardView;
            if (recCardView != null) {
                switch (RecsView$WhenMappings.$EnumSwitchMapping$4[swipeType.ordinal()]) {
                    case 1:
                        swipeType = recCardView.getStampLike();
                        if (swipeType == null) {
                            swipeType = this.presenter;
                            if (swipeType == null) {
                                C2668g.m10310b("presenter");
                            }
                            swipeType.likeOnRecFromUserProfile(rec);
                            break;
                        }
                        animateStamp(recCardView, swipeType, new RecsView$onGamePadButtonClickedFromProfile$1(this, rec));
                        break;
                    case 2:
                        swipeType = recCardView.getStampPass();
                        if (swipeType == null) {
                            swipeType = this.presenter;
                            if (swipeType == null) {
                                C2668g.m10310b("presenter");
                            }
                            swipeType.passOnRecFromUserProfile(rec);
                            break;
                        }
                        animateStamp(recCardView, swipeType, new RecsView$onGamePadButtonClickedFromProfile$2(this, rec));
                        break;
                    case 3:
                        swipeType = this.gamepad;
                        if (swipeType == null) {
                            C2668g.m10310b("gamepad");
                        }
                        if (swipeType.isSuperlikeAnimating() == null) {
                            swipeType = recCardView.getStampSuperLike();
                            if (swipeType == null) {
                                swipeType = this.presenter;
                                if (swipeType == null) {
                                    C2668g.m10310b("presenter");
                                }
                                swipeType.superlikeOnRecFromUserProfile(rec);
                                break;
                            }
                            animateStamp(recCardView, swipeType, new RecsView$onGamePadButtonClickedFromProfile$3(this, rec));
                            break;
                        }
                        return;
                    default:
                        break;
                }
            }
        }
    }

    public void createChooserToShareScreenshottedProfile(@NotNull String str, @NotNull String str2, @Nullable Uri uri, @NotNull String str3, boolean z, boolean z2, @NotNull List<? extends CommonConnection> list) {
        String str4 = str2;
        String str5 = str3;
        String str6 = str;
        C2668g.m10309b(str6, "otherId");
        C2668g.m10309b(str4, "name");
        C2668g.m10309b(str5, "referralUrl");
        List<? extends CommonConnection> list2 = list;
        C2668g.m10309b(list2, "commonConnections");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/png");
        if (uri != null) {
            intent.putExtra("android.intent.extra.STREAM", uri);
        }
        C15828l c15828l = C15828l.f49033a;
        Object string = getContext().getString(R.string.share_screenshot_text);
        C2668g.m10305a(string, "context.getString(R.string.share_screenshot_text)");
        Object[] objArr = new Object[]{str4, str5};
        string = String.format(string, Arrays.copyOf(objArr, objArr.length));
        C2668g.m10305a(string, "java.lang.String.format(format, *args)");
        intent.putExtra("android.intent.extra.TEXT", string);
        if (VERSION.SDK_INT >= 22) {
            string = getContext();
            C2668g.m10305a(string, "context");
            sendIntentAndDeeplinkShareIdEventInReceiver(string, intent, str5, str4, str6, z, z2, list2);
            return;
        }
        string = getContext();
        C2668g.m10305a(string, "context");
        startActivityForIntentAndSendDeeplinkShareIdEvent(string, intent, str5, str4, str6, z, z2, list2);
    }

    @RequiresApi(22)
    private final void sendIntentAndDeeplinkShareIdEventInReceiver(Context context, Intent intent, String str, String str2, String str3, boolean z, boolean z2, List<? extends CommonConnection> list) {
        new RecommendProfileBroadcastReceiver().a(context, intent, str2, str, str3, ProfileShareSource.CARDSTACK, ProfileShareAction.SCREENSHOT_BANNER, z, z2, list);
    }

    private final void startActivityForIntentAndSendDeeplinkShareIdEvent(Context context, Intent intent, String str, String str2, String str3, boolean z, boolean z2, List<? extends CommonConnection> list) {
        C15828l c15828l = C15828l.f49033a;
        Object string = context.getString(R.string.share_sheet_title);
        C2668g.m10305a(string, "context.getString(R.string.share_sheet_title)");
        Object[] objArr = new Object[]{str2};
        Object format = String.format(string, Arrays.copyOf(objArr, objArr.length));
        C2668g.m10305a(format, "java.lang.String.format(format, *args)");
        context.startActivity(Intent.createChooser(intent, (CharSequence) format));
        Context c14373a = new C14373a("N/A", true, str, ProfileShareSource.CARDSTACK, ProfileShareAction.SCREENSHOT_BANNER);
        RecsPresenter recsPresenter = this.presenter;
        if (recsPresenter == null) {
            C2668g.m10310b("presenter");
        }
        recsPresenter.onShareChooserCreated(str3, z, z2, list, c14373a);
    }
}
