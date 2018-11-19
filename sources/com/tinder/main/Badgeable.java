package com.tinder.main;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/tinder/main/Badgeable;", "", "addTrigger", "", "trigger", "Lcom/tinder/main/Badgeable$Trigger;", "hideBadge", "removeTrigger", "showBadge", "Trigger", "main_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "Use Trigger from :base module", replaceWith = @ReplaceWith(expression = "Trigger", imports = {"com.tinder.base.trigger.Trigger"}))
public interface Badgeable {
    void addTrigger(@NotNull Badgeable$Trigger badgeable$Trigger);

    void hideBadge();

    void removeTrigger(@NotNull Badgeable$Trigger badgeable$Trigger);

    void showBadge();
}
