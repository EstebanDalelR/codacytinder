package com.tinder.gamepad;

import com.tinder.gamepad.model.C9656a;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/gamepad/Gamepad;", "", "bind", "", "buttons", "", "Lcom/tinder/gamepad/model/GamepadButtonViewModel;", "gamepad_release"}, k = 1, mv = {1, 1, 10})
public interface Gamepad {
    void bind(@NotNull Set<C9656a> set);
}
