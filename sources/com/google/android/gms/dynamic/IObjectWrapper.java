package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.aav;

public interface IObjectWrapper extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.IObjectWrapper$a */
    public static abstract class C3828a extends aav implements IObjectWrapper {
        public C3828a() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static IObjectWrapper m14461a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof IObjectWrapper ? (IObjectWrapper) queryLocalInterface : new C3829a(iBinder);
        }
    }
}
