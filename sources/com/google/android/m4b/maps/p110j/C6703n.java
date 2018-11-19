package com.google.android.m4b.maps.p110j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.m4b.maps.p112l.C5470c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.j.n */
final class C6703n extends C5450m implements Callback {
    /* renamed from: a */
    private final HashMap<C5451a, C5453b> f25098a = new HashMap();
    /* renamed from: b */
    private final Context f25099b;
    /* renamed from: c */
    private final Handler f25100c;
    /* renamed from: d */
    private final C5470c f25101d;
    /* renamed from: e */
    private final long f25102e;

    /* renamed from: com.google.android.m4b.maps.j.n$a */
    static final class C5451a {
        /* renamed from: a */
        private final String f20434a;
        /* renamed from: b */
        private final ComponentName f20435b;

        public C5451a(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Given String is empty or null");
            }
            this.f20434a = str;
            this.f20435b = null;
        }

        public final String toString() {
            if (this.f20434a != null) {
                return this.f20434a;
            }
            ComponentName componentName = null;
            return componentName.flattenToString();
        }

        /* renamed from: a */
        public final Intent m23696a() {
            if (this.f20434a != null) {
                return new Intent(this.f20434a).setPackage("com.google.android.gms");
            }
            return new Intent().setComponent(null);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f20434a, null});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5451a)) {
                return false;
            }
            return (C5461u.m23766a(this.f20434a, ((C5451a) obj).f20434a) == null || C5461u.m23766a(null, null) == null) ? false : true;
        }
    }

    /* renamed from: com.google.android.m4b.maps.j.n$b */
    final class C5453b {
        /* renamed from: a */
        final /* synthetic */ C6703n f20437a;
        /* renamed from: b */
        private final C5452a f20438b = new C5452a(this);
        /* renamed from: c */
        private final Set<ServiceConnection> f20439c = new HashSet();
        /* renamed from: d */
        private int f20440d = 2;
        /* renamed from: e */
        private boolean f20441e;
        /* renamed from: f */
        private IBinder f20442f;
        /* renamed from: g */
        private final C5451a f20443g;
        /* renamed from: h */
        private ComponentName f20444h;

        /* renamed from: com.google.android.m4b.maps.j.n$b$a */
        public class C5452a implements ServiceConnection {
            /* renamed from: a */
            private /* synthetic */ C5453b f20436a;

            public C5452a(C5453b c5453b) {
                this.f20436a = c5453b;
            }

            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                synchronized (this.f20436a.f20437a.f25098a) {
                    this.f20436a.f20442f = iBinder;
                    this.f20436a.f20444h = componentName;
                    for (ServiceConnection onServiceConnected : this.f20436a.f20439c) {
                        onServiceConnected.onServiceConnected(componentName, iBinder);
                    }
                    this.f20436a.f20440d = 1;
                }
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                synchronized (this.f20436a.f20437a.f25098a) {
                    this.f20436a.f20442f = null;
                    this.f20436a.f20444h = componentName;
                    for (ServiceConnection onServiceDisconnected : this.f20436a.f20439c) {
                        onServiceDisconnected.onServiceDisconnected(componentName);
                    }
                    this.f20436a.f20440d = 2;
                }
            }
        }

        public C5453b(C6703n c6703n, C5451a c5451a) {
            this.f20437a = c6703n;
            this.f20443g = c5451a;
        }

        @android.annotation.TargetApi(14)
        /* renamed from: a */
        public final void m23705a(java.lang.String r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r7 = this;
            r0 = r7.f20437a;
            r1 = r0.f25101d;
            r0 = r7.f20437a;
            r2 = r0.f25099b;
            r0 = r7.f20443g;
            r4 = r0.m23696a();
            r5 = r7.f20438b;
            r6 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
            r3 = r8;
            r8 = r1.m23825a(r2, r3, r4, r5, r6);
            r7.f20441e = r8;
            r8 = r7.f20441e;
            if (r8 == 0) goto L_0x0025;
        L_0x0021:
            r8 = 3;
            r7.f20440d = r8;
            return;
        L_0x0025:
            r8 = r7.f20437a;	 Catch:{ IllegalArgumentException -> 0x0037 }
            r8 = r8.f25101d;	 Catch:{ IllegalArgumentException -> 0x0037 }
            r0 = r7.f20437a;	 Catch:{ IllegalArgumentException -> 0x0037 }
            r0 = r0.f25099b;	 Catch:{ IllegalArgumentException -> 0x0037 }
            r1 = r7.f20438b;	 Catch:{ IllegalArgumentException -> 0x0037 }
            r8.m23823a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0037 }
            return;
        L_0x0037:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.j.n.b.a(java.lang.String):void");
        }

        /* renamed from: a */
        public final void m23702a() {
            this.f20437a.f25101d.m23823a(this.f20437a.f25099b, this.f20438b);
            this.f20441e = false;
            this.f20440d = 2;
        }

        /* renamed from: a */
        public final void m23704a(ServiceConnection serviceConnection, String str) {
            this.f20437a.f25101d.m23824a(this.f20437a.f25099b, serviceConnection, str, this.f20443g.m23696a());
            this.f20439c.add(serviceConnection);
        }

        /* renamed from: a */
        public final void m23703a(ServiceConnection serviceConnection) {
            this.f20437a.f25101d.m23826b(this.f20437a.f25099b, serviceConnection);
            this.f20439c.remove(serviceConnection);
        }

        /* renamed from: b */
        public final boolean m23706b() {
            return this.f20441e;
        }

        /* renamed from: c */
        public final int m23708c() {
            return this.f20440d;
        }

        /* renamed from: b */
        public final boolean m23707b(ServiceConnection serviceConnection) {
            return this.f20439c.contains(serviceConnection);
        }

        /* renamed from: d */
        public final boolean m23709d() {
            return this.f20439c.isEmpty();
        }

        /* renamed from: e */
        public final IBinder m23710e() {
            return this.f20442f;
        }

        /* renamed from: f */
        public final ComponentName m23711f() {
            return this.f20444h;
        }
    }

    C6703n(Context context) {
        this.f25099b = context.getApplicationContext();
        this.f25100c = new Handler(context.getMainLooper(), this);
        this.f25101d = C5470c.m23820a();
        this.f25102e = 5000;
    }

    /* renamed from: a */
    public final boolean mo5434a(String str, ServiceConnection serviceConnection, String str2) {
        return m29909a(new C5451a(str), serviceConnection, str2);
    }

    /* renamed from: a */
    private boolean m29909a(C5451a c5451a, ServiceConnection serviceConnection, String str) {
        C5462v.m23768a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f25098a) {
            C5453b c5453b = (C5453b) this.f25098a.get(c5451a);
            if (c5453b != null) {
                this.f25100c.removeMessages(0, c5453b);
                if (!c5453b.m23707b(serviceConnection)) {
                    c5453b.m23704a(serviceConnection, str);
                    switch (c5453b.m23708c()) {
                        case 1:
                            serviceConnection.onServiceConnected(c5453b.m23711f(), c5453b.m23710e());
                            break;
                        case 2:
                            c5453b.m23705a(str);
                            break;
                        default:
                            break;
                    }
                }
                str = String.valueOf("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                c5451a = String.valueOf(c5451a);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 0) + String.valueOf(c5451a).length());
                stringBuilder.append(str);
                stringBuilder.append(c5451a);
                throw new IllegalStateException(stringBuilder.toString());
            }
            c5453b = new C5453b(this, c5451a);
            c5453b.m23704a(serviceConnection, str);
            c5453b.m23705a(str);
            this.f25098a.put(c5451a, c5453b);
            c5451a = c5453b.m23706b();
        }
        return c5451a;
    }

    /* renamed from: b */
    public final void mo5435b(String str, ServiceConnection serviceConnection, String str2) {
        str2 = new C5451a(str);
        C5462v.m23768a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f25098a) {
            C5453b c5453b = (C5453b) this.f25098a.get(str2);
            String valueOf;
            StringBuilder stringBuilder;
            if (c5453b == null) {
                valueOf = String.valueOf("Nonexistent connection status for service config: ");
                str2 = String.valueOf(str2);
                stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(str2).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(str2);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (c5453b.m23707b(serviceConnection)) {
                c5453b.m23703a(serviceConnection);
                if (c5453b.m23709d() != null) {
                    this.f25100c.sendMessageDelayed(this.f25100c.obtainMessage(0, c5453b), 5000);
                }
            } else {
                valueOf = String.valueOf("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                str2 = String.valueOf(str2);
                stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(str2).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(str2);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return null;
        }
        C5453b c5453b = (C5453b) message.obj;
        synchronized (this.f25098a) {
            if (c5453b.m23709d()) {
                if (c5453b.m23706b()) {
                    c5453b.m23702a();
                }
                this.f25098a.remove(c5453b.f20443g);
            }
        }
        return true;
    }
}
