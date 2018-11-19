package io.reactivex.exceptions;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.util.ExceptionHelper;

/* renamed from: io.reactivex.exceptions.a */
public final class C15678a {
    @NonNull
    /* renamed from: a */
    public static RuntimeException m58849a(@NonNull Throwable th) {
        throw ExceptionHelper.m58962a(th);
    }

    /* renamed from: b */
    public static void m58850b(@NonNull Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
