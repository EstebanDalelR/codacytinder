package com.tinder.common.utils;

import javax.annotation.Nonnull;

public interface StringLinkDetector {
    boolean containsAddress(@Nonnull String str);

    boolean containsEmail(@Nonnull String str);

    boolean containsPhoneNumber(@Nonnull String str);

    boolean containsURL(@Nonnull String str);
}
