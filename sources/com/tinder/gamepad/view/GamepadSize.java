package com.tinder.gamepad.view;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/tinder/gamepad/view/GamepadSize;", "", "size", "", "dimension", "(Ljava/lang/String;III)V", "getDimension", "()I", "getSize", "SMALL", "LARGE", "Companion", "gamepad_release"}, k = 1, mv = {1, 1, 10})
public enum GamepadSize {
    ;
    
    public static final C9659a Companion = null;
    private final int dimension;
    private final int size;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/gamepad/view/GamepadSize$Companion;", "", "()V", "fromSizeValue", "Lcom/tinder/gamepad/view/GamepadSize;", "value", "", "gamepad_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepad.view.GamepadSize$a */
    public static final class C9659a {
        private C9659a() {
        }

        @NotNull
        /* renamed from: a */
        public final GamepadSize m40065a(int i) {
            for (GamepadSize gamepadSize : GamepadSize.values()) {
                if ((gamepadSize.getSize() == i ? 1 : null) != null) {
                    break;
                }
            }
            GamepadSize gamepadSize2 = null;
            return gamepadSize2 != null ? gamepadSize2 : GamepadSize.SMALL;
        }
    }

    protected GamepadSize(int i, int i2) {
        this.size = i;
        this.dimension = i2;
    }

    public final int getDimension() {
        return this.dimension;
    }

    public final int getSize() {
        return this.size;
    }

    static {
        Companion = new C9659a();
    }
}
