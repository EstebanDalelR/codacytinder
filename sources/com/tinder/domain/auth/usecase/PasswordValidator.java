package com.tinder.domain.auth.usecase;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.common.p077b.C8524b;
import com.tinder.common.utils.C8578a;
import com.tinder.domain.common.usecase.UseCase;
import java.util.Set;
import rx.Observable;

public class PasswordValidator implements UseCase<CharSequence, State> {
    private static final int MIN_LENGTH = 8;
    private static final int MIN_REPEATED_CHARS_ALLOWED = 2;
    private static final Set<CharSequence> SIMPLE_PASSWORDS = C8524b.m36481a("password", "123456", "12345678", "abc123", "querty", "monkey", "letmein", "dragon", "111111", "baseball", "iloveyou", "trustno1", "1234567", "sunshine", "master", "123123", "welcome", "shadow", "ashley", "footbal", "jesus", "michael", "ninja", "mustang", "password1");

    public enum State {
        EMPTY,
        TOO_SIMPLE,
        STRONG,
        MISSING_LETTER,
        MISSING_NUMBER,
        TOO_SHORT,
        REPEATING_CHARS
    }

    @NonNull
    public Observable<State> execute(@Nullable CharSequence charSequence) {
        return Observable.a(charSequence).k(new PasswordValidator$$Lambda$0(this));
    }

    @NonNull
    public State validate(@Nullable CharSequence charSequence) {
        if (C8578a.m36596a(charSequence)) {
            return State.EMPTY;
        }
        if (charSequence.length() < 8) {
            return State.TOO_SHORT;
        }
        if (CharMatcher.digit().matchesNoneOf(charSequence)) {
            return State.MISSING_NUMBER;
        }
        if (CharMatcher.letter().matchesNoneOf(charSequence)) {
            return State.MISSING_LETTER;
        }
        if (SIMPLE_PASSWORDS.contains(charSequence)) {
            return State.TOO_SIMPLE;
        }
        if (hasRepeatingChars(charSequence, 2) != null) {
            return State.REPEATING_CHARS;
        }
        return State.STRONG;
    }

    private boolean hasRepeatingChars(@NonNull CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(0);
        int i2 = 1;
        for (int i3 = 1; i3 < charSequence.length(); i3++) {
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 == charAt) {
                i2++;
                if (i2 > i) {
                    return true;
                }
            } else {
                charAt = charAt2;
                i2 = 1;
            }
        }
        return false;
    }
}
