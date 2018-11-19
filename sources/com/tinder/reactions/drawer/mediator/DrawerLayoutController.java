package com.tinder.reactions.drawer.mediator;

import com.tinder.grandgesturessdk.common.interfaces.LayoutChangedInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/reactions/drawer/mediator/DrawerLayoutController;", "", "addAnimatorController", "animatorController", "Lcom/tinder/reactions/drawer/mediator/AnimatorControllerInterface;", "setLayoutChangedController", "layoutChangedInterface", "Lcom/tinder/grandgesturessdk/common/interfaces/LayoutChangedInterface;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface DrawerLayoutController {
    @NotNull
    DrawerLayoutController addAnimatorController(@NotNull AnimatorControllerInterface animatorControllerInterface);

    @NotNull
    DrawerLayoutController setLayoutChangedController(@NotNull LayoutChangedInterface layoutChangedInterface);
}
