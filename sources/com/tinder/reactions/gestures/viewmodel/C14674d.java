package com.tinder.reactions.gestures.viewmodel;

import android.widget.ImageView.ScaleType;
import com.tinder.R;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.C8595j;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.navigation.viewmodel.GrandGestureNavigationItem;
import com.tinder.reactions.navigation.viewmodel.GrandGestureNavigationItem.Type;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0000¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/reactions/gestures/viewmodel/GrandGestureFactory;", "", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "metaGateway", "Lcom/tinder/domain/meta/gateway/MetaGateway;", "(Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/domain/meta/gateway/MetaGateway;)V", "grandGestureExperiment", "Lcom/tinder/core/experiment/GrandGestureExperiment;", "kotlin.jvm.PlatformType", "createGrandGestureItems", "Lrx/Single;", "", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem;", "createGrandGestureItems$Tinder_release", "getGrandGestureViewModel", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewModel;", "itemType", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem$Type;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.viewmodel.d */
public final class C14674d {
    /* renamed from: a */
    private final C8595j f46252a;
    /* renamed from: b */
    private final MetaGateway f46253b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Function0;", "", "currentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.viewmodel.d$a */
    static final class C17989a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17989a f55922a = new C17989a();

        C17989a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65344a((CurrentUser) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Function0<Boolean> m65344a(CurrentUser currentUser) {
            return new GrandGestureFactory$createGrandGestureItems$1$1(currentUser);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem;", "isFemale", "Lkotlin/Function0;", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.viewmodel.d$b */
    static final class C17990b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14674d f55923a;

        C17990b(C14674d c14674d) {
            this.f55923a = c14674d;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65345a((Function0) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Set<GrandGestureNavigationItem> m65345a(Function0<Boolean> function0) {
            Set<GrandGestureNavigationItem> b = am.m64179b(new GrandGestureNavigationItem(R.drawable.ic_heart_icon, Type.HEART, this.f55923a.m55923a(Type.HEART)), new GrandGestureNavigationItem(R.drawable.ic_laugh_icon, Type.LAUGH, this.f55923a.m55923a(Type.LAUGH)), new GrandGestureNavigationItem(R.drawable.ic_clap_icon, Type.CLAP, this.f55923a.m55923a(Type.CLAP)));
            if (((Boolean) function0.invoke()).booleanValue() != null) {
                if (this.f55923a.f46252a.b() != null) {
                    b.add(new GrandGestureNavigationItem(R.drawable.ic_martini_icon, Type.MARTINI, this.f55923a.m55923a(Type.MARTINI)));
                }
                if (this.f55923a.f46252a.a() != null) {
                    b.add(new GrandGestureNavigationItem(R.drawable.ic_really_icon, Type.CHAT_BUBBLE, this.f55923a.m55923a(Type.CHAT_BUBBLE)));
                }
                if (this.f55923a.f46252a.c() != null) {
                    b.add(new GrandGestureNavigationItem(R.drawable.ic_eyeroll_icon, Type.EYEROLL, this.f55923a.m55923a(Type.EYEROLL)));
                }
                if (this.f55923a.f46252a.e() != null) {
                    b.add(new GrandGestureNavigationItem(R.drawable.ic_ball_icon, Type.BALL_IN_COURT, this.f55923a.m55923a(Type.BALL_IN_COURT)));
                }
                if (this.f55923a.f46252a.d() != null) {
                    b.add(new GrandGestureNavigationItem(R.drawable.ic_strike_icon, Type.STRIKE, this.f55923a.m55923a(Type.STRIKE)));
                }
            }
            return b;
        }
    }

    @Inject
    public C14674d(@NotNull AbTestUtility abTestUtility, @NotNull MetaGateway metaGateway) {
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(metaGateway, "metaGateway");
        this.f46253b = metaGateway;
        this.f46252a = abTestUtility.grandGestureExperiment();
    }

    @NotNull
    /* renamed from: a */
    public final Single<Set<GrandGestureNavigationItem>> m55924a() {
        Single<Set<GrandGestureNavigationItem>> d = this.f46253b.observeCurrentUser().h().a().d(C17989a.f55922a).d(new C17990b(this));
        C2668g.a(d, "metaGateway.observeCurre…estureItems\n            }");
        return d;
    }

    /* renamed from: a */
    private final C14678h m55923a(Type type) {
        switch (C14675e.f46254a[type.ordinal()]) {
            case 1:
                return (C14678h) new C16365n(GrandGestureType.HEART, "heartInteract.json", 0.0f, new C16361b(R.drawable.heart_gesture_background, null, 2, null), GestureActivationType.PULL_AND_RELEASE, 4, null);
            case 2:
                return (C14678h) new C16365n(GrandGestureType.LAUGH, "laughInteract.json", 0.6f, new C16361b(R.drawable.laugh_gesture_background, ScaleType.CENTER_CROP), GestureActivationType.CLICK);
            case 3:
                return (C14678h) new C16365n(GrandGestureType.CLAP, "clapInteract.json", 0.6f, new C16361b(R.drawable.clap_gesture_background, null, 2, null), GestureActivationType.CLICK);
            case 4:
                return (C14678h) new C16365n(GrandGestureType.MARTINI, "martiniInteract.json", 0.0f, null, GestureActivationType.FLING_ON_TARGET, 12, null);
            case 5:
                return (C14678h) new C16364m(ah.m66889a(C15811g.m59834a(GrandGestureType.REALLY, "really_0912_1658.json"), C15811g.m59834a(GrandGestureType.UGH, "ugh_0912_1736.json"), C15811g.m59834a(GrandGestureType.NOPE, "nope_0912_1711.json")), "reallybutton_0816_1220.json", GestureActivationType.SELECT_AND_CLICK);
            case 6:
                return (C14678h) new C16362c("strikeIdle_0808_0935.json", 0.6f, GestureActivationType.CLICK);
            case 7:
                return (C14678h) new C16365n(GrandGestureType.EYEROLL, "eyeroll_0925_1410.json", 0.0f, null, GestureActivationType.CLICK, 12, null);
            case 8:
                return (C14678h) new C16365n(GrandGestureType.BALL_IN_COURT, "ballidle_ball_0906_1117.json", 0.24f, new C16360a("ballidle_chat_0921_1625.json", 0.5f), GestureActivationType.CLICK);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
