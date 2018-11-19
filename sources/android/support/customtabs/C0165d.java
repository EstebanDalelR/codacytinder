package android.support.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService.C2743a;

/* renamed from: android.support.customtabs.d */
public abstract class C0165d implements ServiceConnection {
    /* renamed from: a */
    public abstract void m602a(ComponentName componentName, C0161b c0161b);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m602a(componentName, new C0161b(this, C2743a.m10671a(iBinder), componentName) {
            /* renamed from: a */
            final /* synthetic */ C0165d f8615a;
        });
    }
}
