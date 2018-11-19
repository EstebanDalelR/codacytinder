package com.tinder.main;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/main/Badgeable$Trigger;", "", "register", "", "badgeable", "Lcom/tinder/main/Badgeable;", "unregister", "main_release"}, k = 1, mv = {1, 1, 10})
public interface Badgeable$Trigger {
    void register(@NotNull Badgeable badgeable);

    void unregister();
}
