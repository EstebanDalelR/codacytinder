package com.tinder.reactions.gestures.p394b;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.analytics.C16279k;
import com.tinder.reactions.analytics.C16279k.C14585a;
import com.tinder.reactions.analytics.GestureShowPreviewFrom;
import com.tinder.reactions.audio.C14589a.C14588a;
import com.tinder.reactions.gestures.p395c.C16345a;
import com.tinder.reactions.gestures.target.GrandGestureSelectorTarget;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\r\u0010\u0016\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0019J!\u0010\u001a\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u001cH\u0000¢\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/tinder/reactions/gestures/presenter/GrandGestureSelectorPresenter;", "", "currentChatBubbleProvider", "Lcom/tinder/reactions/gestures/provider/CurrentChatBubbleProvider;", "grandGestureShowPreviewEventDispatcher", "Lcom/tinder/reactions/analytics/GrandGestureShowPreviewEventDispatcher;", "matchId", "", "(Lcom/tinder/reactions/gestures/provider/CurrentChatBubbleProvider;Lcom/tinder/reactions/analytics/GrandGestureShowPreviewEventDispatcher;Ljava/lang/String;)V", "gestureTypePositionMap", "", "", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "selectedAnimationItemPosition", "target", "Lcom/tinder/reactions/gestures/target/GrandGestureSelectorTarget;", "getTarget$Tinder_release", "()Lcom/tinder/reactions/gestures/target/GrandGestureSelectorTarget;", "setTarget$Tinder_release", "(Lcom/tinder/reactions/gestures/target/GrandGestureSelectorTarget;)V", "addGrandGestureShowPreviewEvent", "", "getSelectedGrandGestureType", "getSelectedGrandGestureType$Tinder_release", "handleGrandGestureClicked", "handleGrandGestureClicked$Tinder_release", "initializeSelectableAnimations", "gestureTypeAnimatonMap", "", "initializeSelectableAnimations$Tinder_release", "updateChatBubbleProvider", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.b.e */
public final class C14655e {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public GrandGestureSelectorTarget f46208a;
    /* renamed from: b */
    private int f46209b;
    /* renamed from: c */
    private final Map<Integer, GrandGestureType> f46210c = ((Map) new LinkedHashMap());
    /* renamed from: d */
    private final C16345a f46211d;
    /* renamed from: e */
    private final C16279k f46212e;
    /* renamed from: f */
    private final String f46213f;

    @Inject
    public C14655e(@NotNull C16345a c16345a, @NotNull C16279k c16279k, @NotNull String str) {
        C2668g.b(c16345a, "currentChatBubbleProvider");
        C2668g.b(c16279k, "grandGestureShowPreviewEventDispatcher");
        C2668g.b(str, "matchId");
        this.f46211d = c16345a;
        this.f46212e = c16279k;
        this.f46213f = str;
    }

    /* renamed from: a */
    public final void m55876a(@NotNull Map<GrandGestureType, String> map) {
        C2668g.b(map, "gestureTypeAnimatonMap");
        map = map.entrySet().iterator();
        int i = 0;
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            GrandGestureType grandGestureType = (GrandGestureType) entry.getKey();
            String str = (String) entry.getValue();
            GrandGestureSelectorTarget grandGestureSelectorTarget = this.f46208a;
            if (grandGestureSelectorTarget == null) {
                C2668g.b("target");
            }
            grandGestureSelectorTarget.addAnimationViewAt(str, i);
            this.f46210c.put(Integer.valueOf(i), grandGestureType);
            i++;
        }
        map = this.f46208a;
        if (map == null) {
            C2668g.b("target");
        }
        map.setCurrentAnimation(this.f46209b);
    }

    /* renamed from: a */
    public final void m55875a() {
        this.f46209b = (this.f46209b + 1) % this.f46210c.size();
        GrandGestureSelectorTarget grandGestureSelectorTarget = this.f46208a;
        if (grandGestureSelectorTarget == null) {
            C2668g.b("target");
        }
        grandGestureSelectorTarget.setCurrentAnimation(this.f46209b);
        C14588a c14588a = new C14588a(m55877b(), false);
        GrandGestureSelectorTarget grandGestureSelectorTarget2 = this.f46208a;
        if (grandGestureSelectorTarget2 == null) {
            C2668g.b("target");
        }
        grandGestureSelectorTarget2.playAudio(c14588a);
        m55873c();
        m55874d();
    }

    @NotNull
    /* renamed from: b */
    public final GrandGestureType m55877b() {
        return (GrandGestureType) ah.m66893b(this.f46210c, Integer.valueOf(this.f46209b));
    }

    /* renamed from: c */
    private final void m55873c() {
        this.f46211d.m61654a(m55877b());
    }

    /* renamed from: d */
    private final void m55874d() {
        this.f46212e.m61467a(new C14585a(this.f46213f, GestureShowPreviewFrom.TAP_ELEMENT, false));
    }
}
