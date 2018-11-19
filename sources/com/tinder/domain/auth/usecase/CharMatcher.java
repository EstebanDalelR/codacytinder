package com.tinder.domain.auth.usecase;

import android.support.annotation.NonNull;
import com.tinder.common.p076a.C2640a;
import rx.functions.Func1;

public abstract class CharMatcher implements Func1<Character, Boolean> {

    private static final class Digit extends CharMatcher {
        static final Digit INSTANCE = new Digit();

        private Digit() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ Object call(Object obj) {
            return super.call((Character) obj);
        }

        public boolean matches(char c) {
            return Character.isDigit(c);
        }
    }

    private static final class Letter extends CharMatcher {
        static final Letter INSTANCE = new Letter();

        private Letter() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ Object call(Object obj) {
            return super.call((Character) obj);
        }

        public boolean matches(char c) {
            return Character.isLetter(c);
        }
    }

    public abstract boolean matches(char c);

    public static CharMatcher digit() {
        return Digit.INSTANCE;
    }

    public static CharMatcher letter() {
        return Letter.INSTANCE;
    }

    @Deprecated
    public Boolean call(Character ch) {
        return Boolean.valueOf(matches(ch.charValue()));
    }

    public boolean matchesNoneOf(@NonNull CharSequence charSequence) {
        return matchesAnyOf(charSequence) ^ 1;
    }

    public boolean matchesAnyOf(@NonNull CharSequence charSequence) {
        C2640a.a(charSequence);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (matches(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
