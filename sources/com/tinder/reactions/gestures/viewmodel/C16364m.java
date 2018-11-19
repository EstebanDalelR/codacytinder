package com.tinder.reactions.gestures.viewmodel;

import com.tinder.domain.reactions.model.GrandGestureType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/tinder/reactions/gestures/viewmodel/SelectableGrandGestureViewModel;", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewModel;", "gestureChoicesAnimationFileMap", "", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "", "activatorAnimationFile", "activationType", "Lcom/tinder/reactions/gestures/viewmodel/GestureActivationType;", "(Ljava/util/Map;Ljava/lang/String;Lcom/tinder/reactions/gestures/viewmodel/GestureActivationType;)V", "getActivatorAnimationFile", "()Ljava/lang/String;", "getGestureChoicesAnimationFileMap", "()Ljava/util/Map;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.viewmodel.m */
public final class C16364m extends C14678h {
    @NotNull
    /* renamed from: a */
    private final Map<GrandGestureType, String> f50898a;
    @NotNull
    /* renamed from: b */
    private final String f50899b;

    @NotNull
    /* renamed from: a */
    public final Map<GrandGestureType, String> m61723a() {
        return this.f50898a;
    }

    @NotNull
    /* renamed from: b */
    public final String m61724b() {
        return this.f50899b;
    }

    public C16364m(@NotNull Map<GrandGestureType, String> map, @NotNull String str, @NotNull GestureActivationType gestureActivationType) {
        C2668g.b(map, "gestureChoicesAnimationFileMap");
        C2668g.b(str, "activatorAnimationFile");
        C2668g.b(gestureActivationType, "activationType");
        super(gestureActivationType);
        this.f50898a = map;
        this.f50899b = str;
    }
}
