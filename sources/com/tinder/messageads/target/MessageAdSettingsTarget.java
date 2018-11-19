package com.tinder.messageads.target;

import com.tinder.messageads.model.C9912b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/tinder/messageads/target/MessageAdSettingsTarget;", "", "disableAllSettings", "", "enableAllSettings", "exitMessageAdSettings", "showMessageAdMatchSettings", "messageAdMatchSettings", "Lcom/tinder/messageads/model/MessageAdMatchSettings;", "message-ads_release"}, k = 1, mv = {1, 1, 10})
public interface MessageAdSettingsTarget {
    void disableAllSettings();

    void enableAllSettings();

    void exitMessageAdSettings();

    void showMessageAdMatchSettings(@NotNull C9912b c9912b);
}
