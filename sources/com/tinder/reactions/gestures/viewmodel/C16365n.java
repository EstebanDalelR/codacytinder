package com.tinder.reactions.gestures.viewmodel;

import com.tinder.domain.reactions.model.GrandGestureType;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/tinder/reactions/gestures/viewmodel/SingleGrandGestureViewModel;", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewModel;", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "animationFile", "", "animationScale", "", "background", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewBackground;", "activationType", "Lcom/tinder/reactions/gestures/viewmodel/GestureActivationType;", "(Lcom/tinder/domain/reactions/model/GrandGestureType;Ljava/lang/String;FLcom/tinder/reactions/gestures/viewmodel/GrandGestureViewBackground;Lcom/tinder/reactions/gestures/viewmodel/GestureActivationType;)V", "getAnimationFile", "()Ljava/lang/String;", "getAnimationScale", "()F", "getBackground", "()Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewBackground;", "getGrandGestureType", "()Lcom/tinder/domain/reactions/model/GrandGestureType;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.viewmodel.n */
public final class C16365n extends C14678h {
    /* renamed from: a */
    public static final C14681a f50900a = new C14681a();
    /* renamed from: f */
    private static final C16363i f50901f = new C16363i();
    @NotNull
    /* renamed from: b */
    private final GrandGestureType f50902b;
    @NotNull
    /* renamed from: c */
    private final String f50903c;
    /* renamed from: d */
    private final float f50904d;
    @NotNull
    /* renamed from: e */
    private final C14677g f50905e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/reactions/gestures/viewmodel/SingleGrandGestureViewModel$Companion;", "", "()V", "DEFAULT_NO_BACKGROUND", "Lcom/tinder/reactions/gestures/viewmodel/NoBackground;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.viewmodel.n$a */
    public static final class C14681a {
        private C14681a() {
        }
    }

    @NotNull
    /* renamed from: a */
    public final GrandGestureType m61725a() {
        return this.f50902b;
    }

    @NotNull
    /* renamed from: b */
    public final String m61726b() {
        return this.f50903c;
    }

    /* renamed from: d */
    public final float m61727d() {
        return this.f50904d;
    }

    public /* synthetic */ C16365n(GrandGestureType grandGestureType, String str, float f, C14677g c14677g, GestureActivationType gestureActivationType, int i, C15823e c15823e) {
        float f2 = (i & 4) != null ? 1.0f : f;
        if ((i & 8) != null) {
            c14677g = (C14677g) f50901f;
        }
        this(grandGestureType, str, f2, c14677g, gestureActivationType);
    }

    @NotNull
    /* renamed from: e */
    public final C14677g m61728e() {
        return this.f50905e;
    }

    public C16365n(@NotNull GrandGestureType grandGestureType, @NotNull String str, float f, @NotNull C14677g c14677g, @NotNull GestureActivationType gestureActivationType) {
        C2668g.b(grandGestureType, "grandGestureType");
        C2668g.b(str, "animationFile");
        C2668g.b(c14677g, "background");
        C2668g.b(gestureActivationType, "activationType");
        super(gestureActivationType);
        this.f50902b = grandGestureType;
        this.f50903c = str;
        this.f50904d = f;
        this.f50905e = c14677g;
    }
}
