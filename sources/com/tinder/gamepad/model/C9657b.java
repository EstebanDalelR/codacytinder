package com.tinder.gamepad.model;

import com.tinder.fireboarding.domain.Level;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\u0012"}, d2 = {"Lcom/tinder/gamepad/model/GamepadButtonViewModelFactory;", "", "()V", "createBoostButtonViewModel", "Lcom/tinder/gamepad/model/GamepadButtonViewModel;", "completedLevels", "", "Lcom/tinder/fireboarding/domain/Level;", "createDefaultGamepadButtonViewModels", "createGamepadButtonViewModels", "isRewindButtonEnabled", "", "isRecsQueueEmpty", "isTopRecSuperlikable", "createLikeButtonViewModel", "createPassButtonViewModel", "createRewindButtonViewModel", "createSuperLikeButtonViewModel", "gamepad_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.gamepad.model.b */
public final class C9657b {
    /* renamed from: a */
    public static final C9657b f32194a = new C9657b();

    private C9657b() {
    }

    @NotNull
    /* renamed from: a */
    public final Set<C9656a> m40063a() {
        GamepadButtonType[] values = GamepadButtonType.values();
        Collection arrayList = new ArrayList(values.length);
        for (GamepadButtonType c9656a : values) {
            arrayList.add(new C9656a(c9656a, GamepadButtonState.HIDDEN));
        }
        return C19301m.n((List) arrayList);
    }

    @NotNull
    /* renamed from: a */
    public final Set<C9656a> m40064a(boolean z, boolean z2, boolean z3, @NotNull Set<? extends Level> set) {
        C2668g.b(set, "completedLevels");
        return ak.a(new C9656a[]{m40060a(z, set), m40059a(z2), m40062b(z2), m40061a(z2, z3, set), m40058a((Set) set)});
    }

    /* renamed from: a */
    private final C9656a m40060a(boolean z, Set<? extends Level> set) {
        if (set.contains(Level.REWIND) == null) {
            return new C9656a(GamepadButtonType.REWIND, GamepadButtonState.HIDDEN);
        }
        if (z) {
            return new C9656a(GamepadButtonType.REWIND, GamepadButtonState.ENABLED);
        }
        return new C9656a(GamepadButtonType.REWIND, GamepadButtonState.DISABLED);
    }

    /* renamed from: a */
    private final C9656a m40059a(boolean z) {
        if (z) {
            return new C9656a(GamepadButtonType.LIKE, GamepadButtonState.DISABLED);
        }
        return new C9656a(GamepadButtonType.LIKE, GamepadButtonState.ENABLED);
    }

    /* renamed from: b */
    private final C9656a m40062b(boolean z) {
        if (z) {
            return new C9656a(GamepadButtonType.PASS, GamepadButtonState.DISABLED);
        }
        return new C9656a(GamepadButtonType.PASS, GamepadButtonState.ENABLED);
    }

    /* renamed from: a */
    private final C9656a m40061a(boolean z, boolean z2, Set<? extends Level> set) {
        if (set.contains(Level.SUPERLIKE) == null) {
            return new C9656a(GamepadButtonType.SUPER_LIKE, GamepadButtonState.HIDDEN);
        }
        if (z || !z2) {
            return new C9656a(GamepadButtonType.SUPER_LIKE, GamepadButtonState.DISABLED);
        }
        return new C9656a(GamepadButtonType.SUPER_LIKE, GamepadButtonState.ENABLED);
    }

    /* renamed from: a */
    private final C9656a m40058a(Set<? extends Level> set) {
        if (set.contains(Level.BOOST) == null) {
            return new C9656a(GamepadButtonType.BOOST, GamepadButtonState.HIDDEN);
        }
        return new C9656a(GamepadButtonType.BOOST, GamepadButtonState.ENABLED);
    }
}
