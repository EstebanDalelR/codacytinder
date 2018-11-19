package com.facebook.accountkit.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.AccountKitException;

/* renamed from: com.facebook.accountkit.internal.x */
final class C1252x {
    /* renamed from: a */
    static void m4526a(@NonNull Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    /* renamed from: a */
    static void m4525a() {
        if (!AccountKit.m4113b()) {
            throw new AccountKitException(Type.INITIALIZATION_ERROR, InternalAccountKitError.SDK_NOT_INITIALIZED);
        }
    }

    /* renamed from: a */
    static void m4527a(LoginModelImpl loginModelImpl) {
        if (loginModelImpl == null) {
            throw new AccountKitException(Type.ARGUMENT_ERROR, InternalAccountKitError.NO_LOGIN_ATTEMPT_IN_PROGRESS);
        }
    }

    /* renamed from: a */
    static void m4528a(LoginModelImpl loginModelImpl, LoginModelImpl loginModelImpl2) {
        if (C1251w.m4499a((Object) loginModelImpl, (Object) loginModelImpl2) != null) {
            throw new AccountKitException(Type.ARGUMENT_ERROR, InternalAccountKitError.DIFFERENT_LOGIN_ATTEMPT_IN_PROGRESS);
        }
    }

    /* renamed from: a */
    static void m4529a(Object obj, Object obj2, String str) {
        if (C1251w.m4499a(obj, obj2) != null) {
            throw new AccountKitException(Type.ARGUMENT_ERROR, InternalAccountKitError.NOT_EQUAL_OBJECTS, str);
        }
    }
}
