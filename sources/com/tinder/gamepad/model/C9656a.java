package com.tinder.gamepad.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/gamepad/model/GamepadButtonViewModel;", "", "gamepadButtonType", "Lcom/tinder/gamepad/model/GamepadButtonType;", "gamepadButtonState", "Lcom/tinder/gamepad/model/GamepadButtonState;", "(Lcom/tinder/gamepad/model/GamepadButtonType;Lcom/tinder/gamepad/model/GamepadButtonState;)V", "getGamepadButtonState", "()Lcom/tinder/gamepad/model/GamepadButtonState;", "getGamepadButtonType", "()Lcom/tinder/gamepad/model/GamepadButtonType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "gamepad_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.gamepad.model.a */
public final class C9656a {
    @NotNull
    /* renamed from: a */
    private final GamepadButtonType f32192a;
    @NotNull
    /* renamed from: b */
    private final GamepadButtonState f32193b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9656a) {
                C9656a c9656a = (C9656a) obj;
                if (C2668g.a(this.f32192a, c9656a.f32192a) && C2668g.a(this.f32193b, c9656a.f32193b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        GamepadButtonType gamepadButtonType = this.f32192a;
        int i = 0;
        int hashCode = (gamepadButtonType != null ? gamepadButtonType.hashCode() : 0) * 31;
        GamepadButtonState gamepadButtonState = this.f32193b;
        if (gamepadButtonState != null) {
            i = gamepadButtonState.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GamepadButtonViewModel(gamepadButtonType=");
        stringBuilder.append(this.f32192a);
        stringBuilder.append(", gamepadButtonState=");
        stringBuilder.append(this.f32193b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9656a(@NotNull GamepadButtonType gamepadButtonType, @NotNull GamepadButtonState gamepadButtonState) {
        C2668g.b(gamepadButtonType, "gamepadButtonType");
        C2668g.b(gamepadButtonState, "gamepadButtonState");
        this.f32192a = gamepadButtonType;
        this.f32193b = gamepadButtonState;
    }

    @NotNull
    /* renamed from: a */
    public final GamepadButtonType m40056a() {
        return this.f32192a;
    }

    @NotNull
    /* renamed from: b */
    public final GamepadButtonState m40057b() {
        return this.f32193b;
    }
}
