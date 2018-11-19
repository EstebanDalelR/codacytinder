package com.tinder.reactions.gestures.p394b;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.analytics.C16281m;
import com.tinder.reactions.analytics.C16281m.C14587a;
import com.tinder.reactions.analytics.GestureSettingType;
import com.tinder.reactions.analytics.GestureSettingValue;
import com.tinder.reactions.gestures.target.SelectableGrandGestureTarget;
import com.tinder.reactions.p385c.C16287f;
import com.tinder.reactions.p385c.C16289j;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\r\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0014J\r\u0010\u001c\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/tinder/reactions/gestures/presenter/SelectableGrandGesturePresenter;", "", "getSoundState", "Lcom/tinder/reactions/usecase/GetChatBubbleSoundState;", "updateSoundState", "Lcom/tinder/reactions/usecase/UpdateChatBubbleSoundState;", "grandGestureUpdateSettingEventDispatcher", "Lcom/tinder/reactions/analytics/GrandGestureUpdateSettingEventDispatcher;", "matchId", "", "(Lcom/tinder/reactions/usecase/GetChatBubbleSoundState;Lcom/tinder/reactions/usecase/UpdateChatBubbleSoundState;Lcom/tinder/reactions/analytics/GrandGestureUpdateSettingEventDispatcher;Ljava/lang/String;)V", "soundStateSubscription", "Lrx/Subscription;", "target", "Lcom/tinder/reactions/gestures/target/SelectableGrandGestureTarget;", "getTarget$Tinder_release", "()Lcom/tinder/reactions/gestures/target/SelectableGrandGestureTarget;", "setTarget$Tinder_release", "(Lcom/tinder/reactions/gestures/target/SelectableGrandGestureTarget;)V", "drop", "", "drop$Tinder_release", "handleSoundToggleButtonClicked", "isSoundEnabled", "", "gestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "handleTargetChildrenReady", "take", "take$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.b.g */
public final class C14657g {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public SelectableGrandGestureTarget f46214a;
    /* renamed from: b */
    private Subscription f46215b;
    /* renamed from: c */
    private final C16287f f46216c;
    /* renamed from: d */
    private final C16289j f46217d;
    /* renamed from: e */
    private final C16281m f46218e;
    /* renamed from: f */
    private final String f46219f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isSoundEnabled", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.b.g$a */
    static final class C18741a<T> implements Action1<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C14657g f58231a;

        C18741a(C14657g c14657g) {
            this.f58231a = c14657g;
        }

        public /* synthetic */ void call(Object obj) {
            m67165a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m67165a(Boolean bool) {
            SelectableGrandGestureTarget a = this.f58231a.m55880a();
            C2668g.a(bool, "isSoundEnabled");
            a.setSoundToggleButtonChecked(bool.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.b.g$b */
    static final class C18742b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18742b f58232a = new C18742b();

        C18742b() {
        }

        public /* synthetic */ void call(Object obj) {
            m67166a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67166a(Throwable th) {
            C0001a.c(th, "Couldn't observe chat bubble sound state", new Object[0]);
        }
    }

    @Inject
    public C14657g(@NotNull C16287f c16287f, @NotNull C16289j c16289j, @NotNull C16281m c16281m, @NotNull String str) {
        C2668g.b(c16287f, "getSoundState");
        C2668g.b(c16289j, "updateSoundState");
        C2668g.b(c16281m, "grandGestureUpdateSettingEventDispatcher");
        C2668g.b(str, "matchId");
        this.f46216c = c16287f;
        this.f46217d = c16289j;
        this.f46218e = c16281m;
        this.f46219f = str;
    }

    @NotNull
    /* renamed from: a */
    public final SelectableGrandGestureTarget m55880a() {
        SelectableGrandGestureTarget selectableGrandGestureTarget = this.f46214a;
        if (selectableGrandGestureTarget == null) {
            C2668g.b("target");
        }
        return selectableGrandGestureTarget;
    }

    @Take
    /* renamed from: b */
    public final void m55882b() {
        this.f46215b = this.f46216c.execute().a(RxUtils.a()).a(new C18741a(this), C18742b.f58232a);
    }

    @Drop
    /* renamed from: c */
    public final void m55883c() {
        RxUtils.b(this.f46215b);
    }

    /* renamed from: a */
    public final void m55881a(boolean z, @NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "gestureType");
        this.f46217d.m61479a(z).b(Schedulers.io()).b(RxUtils.b());
        C16281m c16281m = this.f46218e;
        String str = this.f46219f;
        GestureSettingType gestureSettingType = GestureSettingType.SOUND;
        if (z) {
            z = GestureSettingValue.ON;
        } else {
            z = GestureSettingValue.OFF;
        }
        c16281m.m61472a(new C14587a(str, grandGestureType, gestureSettingType, z));
    }

    /* renamed from: d */
    public final void m55884d() {
        SelectableGrandGestureTarget selectableGrandGestureTarget = this.f46214a;
        if (selectableGrandGestureTarget == null) {
            C2668g.b("target");
        }
        selectableGrandGestureTarget.resetTargetPosition();
    }
}
