package android.support.v4.media;

import android.app.Service;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.C0390f;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.C0559j;
import android.support.v4.util.C2880a;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {
    /* renamed from: a */
    static final boolean f1594a = Log.isLoggable("MBServiceCompat", 3);
    /* renamed from: b */
    final C2880a<IBinder, C0475b> f1595b = new C2880a();
    /* renamed from: c */
    C0475b f1596c;
    /* renamed from: d */
    final C0488g f1597d = new C0488g(this);
    /* renamed from: e */
    Token f1598e;

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$a */
    public static final class C0473a {
        /* renamed from: a */
        private final String f1542a;
        /* renamed from: b */
        private final Bundle f1543b;

        /* renamed from: a */
        public String m1801a() {
            return this.f1542a;
        }

        /* renamed from: b */
        public Bundle m1802b() {
            return this.f1543b;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$b */
    private class C0475b implements DeathRecipient {
        /* renamed from: a */
        String f1545a;
        /* renamed from: b */
        Bundle f1546b;
        /* renamed from: c */
        C0487e f1547c;
        /* renamed from: d */
        C0473a f1548d;
        /* renamed from: e */
        HashMap<String, List<C0559j<IBinder, Bundle>>> f1549e = new HashMap();
        /* renamed from: f */
        final /* synthetic */ MediaBrowserServiceCompat f1550f;

        /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$b$1 */
        class C04741 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C0475b f1544a;

            C04741(C0475b c0475b) {
                this.f1544a = c0475b;
            }

            public void run() {
                this.f1544a.f1550f.f1595b.remove(this.f1544a.f1547c.mo488a());
            }
        }

        C0475b(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f1550f = mediaBrowserServiceCompat;
        }

        public void binderDied() {
            this.f1550f.f1597d.post(new C04741(this));
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$c */
    public static class C0476c<T> {
        /* renamed from: a */
        private final Object f1551a;
        /* renamed from: b */
        private boolean f1552b;
        /* renamed from: c */
        private boolean f1553c;
        /* renamed from: d */
        private boolean f1554d;
        /* renamed from: e */
        private int f1555e;

        /* renamed from: a */
        void mo486a(T t) {
        }

        C0476c(Object obj) {
            this.f1551a = obj;
        }

        /* renamed from: b */
        public void m1808b(T t) {
            if (!this.f1553c) {
                if (!this.f1554d) {
                    this.f1553c = true;
                    mo486a((Object) t);
                    return;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
            stringBuilder.append(this.f1551a);
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: c */
        public void m1809c(Bundle bundle) {
            if (!this.f1553c) {
                if (!this.f1554d) {
                    this.f1554d = true;
                    mo487b(bundle);
                    return;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sendError() called when either sendResult() or sendError() had already been called for: ");
            stringBuilder.append(this.f1551a);
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        boolean m1805a() {
            if (!(this.f1552b || this.f1553c)) {
                if (!this.f1554d) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        void m1803a(int i) {
            this.f1555e = i;
        }

        /* renamed from: b */
        int m1806b() {
            return this.f1555e;
        }

        /* renamed from: b */
        void mo487b(Bundle bundle) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("It is not supported to send an error for ");
            stringBuilder.append(this.f1551a);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d */
    private class C0486d {
        /* renamed from: a */
        final /* synthetic */ MediaBrowserServiceCompat f1591a;

        C0486d(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f1591a = mediaBrowserServiceCompat;
        }

        /* renamed from: a */
        public void m1812a(String str, int i, Bundle bundle, C0487e c0487e) {
            if (this.f1591a.m1833a(str, i)) {
                final C0487e c0487e2 = c0487e;
                final String str2 = str;
                final Bundle bundle2 = bundle;
                final int i2 = i;
                this.f1591a.f1597d.m1823a(new Runnable(this) {
                    /* renamed from: e */
                    final /* synthetic */ C0486d f1560e;

                    public void run() {
                        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r6 = this;
                        r0 = r3;
                        r0 = r0.mo488a();
                        r1 = r6.f1560e;
                        r1 = r1.f1591a;
                        r1 = r1.f1595b;
                        r1.remove(r0);
                        r1 = new android.support.v4.media.MediaBrowserServiceCompat$b;
                        r2 = r6.f1560e;
                        r2 = r2.f1591a;
                        r1.<init>(r2);
                        r2 = r4;
                        r1.f1545a = r2;
                        r2 = r5;
                        r1.f1546b = r2;
                        r2 = r3;
                        r1.f1547c = r2;
                        r2 = r6.f1560e;
                        r2 = r2.f1591a;
                        r3 = r4;
                        r4 = r6;
                        r5 = r5;
                        r2 = r2.m1824a(r3, r4, r5);
                        r1.f1548d = r2;
                        r2 = r1.f1548d;
                        if (r2 != 0) goto L_0x007f;
                    L_0x0038:
                        r0 = "MBServiceCompat";
                        r1 = new java.lang.StringBuilder;
                        r1.<init>();
                        r2 = "No root for client ";
                        r1.append(r2);
                        r2 = r4;
                        r1.append(r2);
                        r2 = " from service ";
                        r1.append(r2);
                        r2 = r6.getClass();
                        r2 = r2.getName();
                        r1.append(r2);
                        r1 = r1.toString();
                        android.util.Log.i(r0, r1);
                        r0 = r3;	 Catch:{ RemoteException -> 0x0066 }
                        r0.mo491b();	 Catch:{ RemoteException -> 0x0066 }
                        goto L_0x00cd;
                    L_0x0066:
                        r0 = "MBServiceCompat";
                        r1 = new java.lang.StringBuilder;
                        r1.<init>();
                        r2 = "Calling onConnectFailed() failed. Ignoring. pkg=";
                        r1.append(r2);
                        r2 = r4;
                        r1.append(r2);
                        r1 = r1.toString();
                        android.util.Log.w(r0, r1);
                        goto L_0x00cd;
                    L_0x007f:
                        r2 = r6.f1560e;	 Catch:{ RemoteException -> 0x00ac }
                        r2 = r2.f1591a;	 Catch:{ RemoteException -> 0x00ac }
                        r2 = r2.f1595b;	 Catch:{ RemoteException -> 0x00ac }
                        r2.put(r0, r1);	 Catch:{ RemoteException -> 0x00ac }
                        r2 = 0;	 Catch:{ RemoteException -> 0x00ac }
                        r0.linkToDeath(r1, r2);	 Catch:{ RemoteException -> 0x00ac }
                        r2 = r6.f1560e;	 Catch:{ RemoteException -> 0x00ac }
                        r2 = r2.f1591a;	 Catch:{ RemoteException -> 0x00ac }
                        r2 = r2.f1598e;	 Catch:{ RemoteException -> 0x00ac }
                        if (r2 == 0) goto L_0x00cd;	 Catch:{ RemoteException -> 0x00ac }
                    L_0x0094:
                        r2 = r3;	 Catch:{ RemoteException -> 0x00ac }
                        r3 = r1.f1548d;	 Catch:{ RemoteException -> 0x00ac }
                        r3 = r3.m1801a();	 Catch:{ RemoteException -> 0x00ac }
                        r4 = r6.f1560e;	 Catch:{ RemoteException -> 0x00ac }
                        r4 = r4.f1591a;	 Catch:{ RemoteException -> 0x00ac }
                        r4 = r4.f1598e;	 Catch:{ RemoteException -> 0x00ac }
                        r1 = r1.f1548d;	 Catch:{ RemoteException -> 0x00ac }
                        r1 = r1.m1802b();	 Catch:{ RemoteException -> 0x00ac }
                        r2.mo489a(r3, r4, r1);	 Catch:{ RemoteException -> 0x00ac }
                        goto L_0x00cd;
                    L_0x00ac:
                        r1 = "MBServiceCompat";
                        r2 = new java.lang.StringBuilder;
                        r2.<init>();
                        r3 = "Calling onConnect() failed. Dropping client. pkg=";
                        r2.append(r3);
                        r3 = r4;
                        r2.append(r3);
                        r2 = r2.toString();
                        android.util.Log.w(r1, r2);
                        r1 = r6.f1560e;
                        r1 = r1.f1591a;
                        r1 = r1.f1595b;
                        r1.remove(r0);
                    L_0x00cd:
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserServiceCompat.d.1.run():void");
                    }
                });
                return;
            }
            c0487e = new StringBuilder();
            c0487e.append("Package/uid mismatch: uid=");
            c0487e.append(i);
            c0487e.append(" package=");
            c0487e.append(str);
            throw new IllegalArgumentException(c0487e.toString());
        }

        /* renamed from: a */
        public void m1810a(final C0487e c0487e) {
            this.f1591a.f1597d.m1823a(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0486d f1562b;

                public void run() {
                    C0475b c0475b = (C0475b) this.f1562b.f1591a.f1595b.remove(c0487e.mo488a());
                    if (c0475b != null) {
                        c0475b.f1547c.mo488a().unlinkToDeath(c0475b, 0);
                    }
                }
            });
        }

        /* renamed from: a */
        public void m1814a(String str, IBinder iBinder, Bundle bundle, C0487e c0487e) {
            final C0487e c0487e2 = c0487e;
            final String str2 = str;
            final IBinder iBinder2 = iBinder;
            final Bundle bundle2 = bundle;
            this.f1591a.f1597d.m1823a(new Runnable(this) {
                /* renamed from: e */
                final /* synthetic */ C0486d f1567e;

                public void run() {
                    C0475b c0475b = (C0475b) this.f1567e.f1591a.f1595b.get(c0487e2.mo488a());
                    if (c0475b == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("addSubscription for callback that isn't registered id=");
                        stringBuilder.append(str2);
                        Log.w("MBServiceCompat", stringBuilder.toString());
                        return;
                    }
                    this.f1567e.f1591a.m1829a(str2, c0475b, iBinder2, bundle2);
                }
            });
        }

        /* renamed from: a */
        public void m1815a(final String str, final IBinder iBinder, final C0487e c0487e) {
            this.f1591a.f1597d.m1823a(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ C0486d f1571d;

                public void run() {
                    C0475b c0475b = (C0475b) this.f1571d.f1591a.f1595b.get(c0487e.mo488a());
                    if (c0475b == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("removeSubscription for callback that isn't registered id=");
                        stringBuilder.append(str);
                        Log.w("MBServiceCompat", stringBuilder.toString());
                        return;
                    }
                    if (!this.f1571d.f1591a.m1834a(str, c0475b, iBinder)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("removeSubscription called for ");
                        stringBuilder.append(str);
                        stringBuilder.append(" which is not subscribed");
                        Log.w("MBServiceCompat", stringBuilder.toString());
                    }
                }
            });
        }

        /* renamed from: a */
        public void m1816a(final String str, final ResultReceiver resultReceiver, final C0487e c0487e) {
            if (!TextUtils.isEmpty(str)) {
                if (resultReceiver != null) {
                    this.f1591a.f1597d.m1823a(new Runnable(this) {
                        /* renamed from: d */
                        final /* synthetic */ C0486d f1575d;

                        public void run() {
                            C0475b c0475b = (C0475b) this.f1575d.f1591a.f1595b.get(c0487e.mo488a());
                            if (c0475b == null) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("getMediaItem for callback that isn't registered id=");
                                stringBuilder.append(str);
                                Log.w("MBServiceCompat", stringBuilder.toString());
                                return;
                            }
                            this.f1575d.f1591a.m1830a(str, c0475b, resultReceiver);
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        public void m1811a(final C0487e c0487e, final Bundle bundle) {
            this.f1591a.f1597d.m1823a(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ C0486d f1578c;

                public void run() {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r3 = this;
                    r0 = r3;
                    r0 = r0.mo488a();
                    r1 = r3.f1578c;
                    r1 = r1.f1591a;
                    r1 = r1.f1595b;
                    r1.remove(r0);
                    r1 = new android.support.v4.media.MediaBrowserServiceCompat$b;
                    r2 = r3.f1578c;
                    r2 = r2.f1591a;
                    r1.<init>(r2);
                    r2 = r3;
                    r1.f1547c = r2;
                    r2 = r4;
                    r1.f1546b = r2;
                    r2 = r3.f1578c;
                    r2 = r2.f1591a;
                    r2 = r2.f1595b;
                    r2.put(r0, r1);
                    r2 = 0;
                    r0.linkToDeath(r1, r2);	 Catch:{ RemoteException -> 0x002e }
                    goto L_0x0035;
                L_0x002e:
                    r0 = "MBServiceCompat";
                    r1 = "IBinder is already dead.";
                    android.util.Log.w(r0, r1);
                L_0x0035:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserServiceCompat.d.6.run():void");
                }
            });
        }

        /* renamed from: b */
        public void m1817b(final C0487e c0487e) {
            this.f1591a.f1597d.m1823a(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0486d f1580b;

                public void run() {
                    IBinder a = c0487e.mo488a();
                    C0475b c0475b = (C0475b) this.f1580b.f1591a.f1595b.remove(a);
                    if (c0475b != null) {
                        a.unlinkToDeath(c0475b, 0);
                    }
                }
            });
        }

        /* renamed from: a */
        public void m1813a(String str, Bundle bundle, ResultReceiver resultReceiver, C0487e c0487e) {
            if (!TextUtils.isEmpty(str)) {
                if (resultReceiver != null) {
                    final C0487e c0487e2 = c0487e;
                    final String str2 = str;
                    final Bundle bundle2 = bundle;
                    final ResultReceiver resultReceiver2 = resultReceiver;
                    this.f1591a.f1597d.m1823a(new Runnable(this) {
                        /* renamed from: e */
                        final /* synthetic */ C0486d f1585e;

                        public void run() {
                            C0475b c0475b = (C0475b) this.f1585e.f1591a.f1595b.get(c0487e2.mo488a());
                            if (c0475b == null) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("search for callback that isn't registered query=");
                                stringBuilder.append(str2);
                                Log.w("MBServiceCompat", stringBuilder.toString());
                                return;
                            }
                            this.f1585e.f1591a.m1826a(str2, bundle2, c0475b, resultReceiver2);
                        }
                    });
                }
            }
        }

        /* renamed from: b */
        public void m1818b(String str, Bundle bundle, ResultReceiver resultReceiver, C0487e c0487e) {
            if (!TextUtils.isEmpty(str)) {
                if (resultReceiver != null) {
                    final C0487e c0487e2 = c0487e;
                    final String str2 = str;
                    final Bundle bundle2 = bundle;
                    final ResultReceiver resultReceiver2 = resultReceiver;
                    this.f1591a.f1597d.m1823a(new Runnable(this) {
                        /* renamed from: e */
                        final /* synthetic */ C0486d f1590e;

                        public void run() {
                            C0475b c0475b = (C0475b) this.f1590e.f1591a.f1595b.get(c0487e2.mo488a());
                            if (c0475b == null) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("sendCustomAction for callback that isn't registered action=");
                                stringBuilder.append(str2);
                                stringBuilder.append(", extras=");
                                stringBuilder.append(bundle2);
                                Log.w("MBServiceCompat", stringBuilder.toString());
                                return;
                            }
                            this.f1590e.f1591a.m1835b(str2, bundle2, c0475b, resultReceiver2);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$e */
    private interface C0487e {
        /* renamed from: a */
        IBinder mo488a();

        /* renamed from: a */
        void mo489a(String str, Token token, Bundle bundle) throws RemoteException;

        /* renamed from: a */
        void mo490a(String str, List<MediaItem> list, Bundle bundle) throws RemoteException;

        /* renamed from: b */
        void mo491b() throws RemoteException;
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$g */
    private final class C0488g extends Handler {
        /* renamed from: a */
        final /* synthetic */ MediaBrowserServiceCompat f1592a;
        /* renamed from: b */
        private final C0486d f1593b = new C0486d(this.f1592a);

        C0488g(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f1592a = mediaBrowserServiceCompat;
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    this.f1593b.m1812a(data.getString("data_package_name"), data.getInt("data_calling_uid"), data.getBundle("data_root_hints"), new C2859f(message.replyTo));
                    return;
                case 2:
                    this.f1593b.m1810a(new C2859f(message.replyTo));
                    return;
                case 3:
                    this.f1593b.m1814a(data.getString("data_media_item_id"), C0390f.m1453a(data, "data_callback_token"), data.getBundle("data_options"), new C2859f(message.replyTo));
                    return;
                case 4:
                    this.f1593b.m1815a(data.getString("data_media_item_id"), C0390f.m1453a(data, "data_callback_token"), new C2859f(message.replyTo));
                    return;
                case 5:
                    this.f1593b.m1816a(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C2859f(message.replyTo));
                    return;
                case 6:
                    this.f1593b.m1811a(new C2859f(message.replyTo), data.getBundle("data_root_hints"));
                    return;
                case 7:
                    this.f1593b.m1817b(new C2859f(message.replyTo));
                    return;
                case 8:
                    this.f1593b.m1813a(data.getString("data_search_query"), data.getBundle("data_search_extras"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C2859f(message.replyTo));
                    return;
                case 9:
                    this.f1593b.m1818b(data.getString("data_custom_action"), data.getBundle("data_custom_action_extras"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C2859f(message.replyTo));
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unhandled message: ");
                    stringBuilder.append(message);
                    stringBuilder.append("\n  Service version: ");
                    stringBuilder.append(2);
                    stringBuilder.append("\n  Client version: ");
                    stringBuilder.append(message.arg1);
                    Log.w("MBServiceCompat", stringBuilder.toString());
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            return super.sendMessageAtTime(message, j);
        }

        /* renamed from: a */
        public void m1823a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$f */
    private static class C2859f implements C0487e {
        /* renamed from: a */
        final Messenger f9078a;

        C2859f(Messenger messenger) {
            this.f9078a = messenger;
        }

        /* renamed from: a */
        public IBinder mo488a() {
            return this.f9078a.getBinder();
        }

        /* renamed from: a */
        public void mo489a(String str, Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m11302a(1, bundle2);
        }

        /* renamed from: b */
        public void mo491b() throws RemoteException {
            m11302a(2, null);
        }

        /* renamed from: a */
        public void mo490a(String str, List<MediaItem> list, Bundle bundle) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            if (list != null) {
                bundle2.putParcelableArrayList("data_media_item_list", (list instanceof ArrayList) != null ? (ArrayList) list : new ArrayList(list));
            }
            m11302a(3, bundle2);
        }

        /* renamed from: a */
        private void m11302a(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f9078a.send(obtain);
        }
    }

    @Nullable
    /* renamed from: a */
    public abstract C0473a m1824a(@NonNull String str, int i, @Nullable Bundle bundle);

    /* renamed from: a */
    public abstract void m1831a(@NonNull String str, @NonNull C0476c<List<MediaItem>> c0476c);

    /* renamed from: a */
    public void m1832a(@NonNull String str, @NonNull C0476c<List<MediaItem>> c0476c, @NonNull Bundle bundle) {
        c0476c.m1803a(1);
        m1831a(str, (C0476c) c0476c);
    }

    /* renamed from: b */
    public void m1837b(String str, @NonNull C0476c<MediaItem> c0476c) {
        c0476c.m1803a(2);
        c0476c.m1808b((Object) null);
    }

    /* renamed from: a */
    public void m1827a(@NonNull String str, Bundle bundle, @NonNull C0476c<List<MediaItem>> c0476c) {
        c0476c.m1803a(4);
        c0476c.m1808b((Object) null);
    }

    /* renamed from: b */
    public void m1836b(@NonNull String str, Bundle bundle, @NonNull C0476c<Bundle> c0476c) {
        c0476c.m1809c(null);
    }

    /* renamed from: a */
    boolean m1833a(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    void m1829a(String str, C0475b c0475b, IBinder iBinder, Bundle bundle) {
        List list = (List) c0475b.f1549e.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (C0559j c0559j : r0) {
            if (iBinder == c0559j.f1724a && C0505d.m1870a(bundle, (Bundle) c0559j.f1725b)) {
                return;
            }
        }
        r0.add(new C0559j(iBinder, bundle));
        c0475b.f1549e.put(str, r0);
        m1828a(str, c0475b, bundle);
    }

    /* renamed from: a */
    boolean m1834a(String str, C0475b c0475b, IBinder iBinder) {
        boolean z = false;
        if (iBinder == null) {
            if (c0475b.f1549e.remove(str) != null) {
                z = true;
            }
            return z;
        }
        List list = (List) c0475b.f1549e.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == ((C0559j) it.next()).f1724a) {
                    it.remove();
                    z = true;
                }
            }
            if (list.size() == null) {
                c0475b.f1549e.remove(str);
            }
        }
        return z;
    }

    /* renamed from: a */
    void m1828a(String str, C0475b c0475b, Bundle bundle) {
        final C0475b c0475b2 = c0475b;
        final String str2 = str;
        final Bundle bundle2 = bundle;
        C0476c c28551 = new C0476c<List<MediaItem>>(this, str) {
            /* renamed from: d */
            final /* synthetic */ MediaBrowserServiceCompat f9071d;

            /* renamed from: a */
            void m11294a(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r4) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r3 = this;
                r0 = r3.f9071d;
                r0 = r0.f1595b;
                r1 = r3;
                r1 = r1.f1547c;
                r1 = r1.mo488a();
                r0 = r0.get(r1);
                r1 = r3;
                if (r0 == r1) goto L_0x003d;
            L_0x0014:
                r4 = android.support.v4.media.MediaBrowserServiceCompat.f1594a;
                if (r4 == 0) goto L_0x003c;
            L_0x0018:
                r4 = "MBServiceCompat";
                r0 = new java.lang.StringBuilder;
                r0.<init>();
                r1 = "Not sending onLoadChildren result for connection that has been disconnected. pkg=";
                r0.append(r1);
                r1 = r3;
                r1 = r1.f1545a;
                r0.append(r1);
                r1 = " id=";
                r0.append(r1);
                r1 = r4;
                r0.append(r1);
                r0 = r0.toString();
                android.util.Log.d(r4, r0);
            L_0x003c:
                return;
            L_0x003d:
                r0 = r3.m1806b();
                r0 = r0 & 1;
                if (r0 == 0) goto L_0x004d;
            L_0x0045:
                r0 = r3.f9071d;
                r1 = r5;
                r4 = r0.m1825a(r4, r1);
            L_0x004d:
                r0 = r3;	 Catch:{ RemoteException -> 0x0059 }
                r0 = r0.f1547c;	 Catch:{ RemoteException -> 0x0059 }
                r1 = r4;	 Catch:{ RemoteException -> 0x0059 }
                r2 = r5;	 Catch:{ RemoteException -> 0x0059 }
                r0.mo490a(r1, r4, r2);	 Catch:{ RemoteException -> 0x0059 }
                goto L_0x007d;
            L_0x0059:
                r4 = "MBServiceCompat";
                r0 = new java.lang.StringBuilder;
                r0.<init>();
                r1 = "Calling onLoadChildren() failed for id=";
                r0.append(r1);
                r1 = r4;
                r0.append(r1);
                r1 = " package=";
                r0.append(r1);
                r1 = r3;
                r1 = r1.f1545a;
                r0.append(r1);
                r0 = r0.toString();
                android.util.Log.w(r4, r0);
            L_0x007d:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserServiceCompat.1.a(java.util.List):void");
            }
        };
        this.f1596c = c0475b;
        if (bundle == null) {
            m1831a(str, c28551);
        } else {
            m1832a(str, c28551, bundle);
        }
        this.f1596c = null;
        if (c28551.m1805a() == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onLoadChildren must call detach() or sendResult() before returning for package=");
            stringBuilder.append(c0475b.f1545a);
            stringBuilder.append(" id=");
            stringBuilder.append(str);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    List<MediaItem> m1825a(List<MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        bundle = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && bundle == -1) {
            return list;
        }
        int i2 = bundle * i;
        int i3 = i2 + bundle;
        if (i >= 0 && bundle >= 1) {
            if (i2 < list.size()) {
                if (i3 > list.size()) {
                    i3 = list.size();
                }
                return list.subList(i2, i3);
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: a */
    void m1830a(String str, C0475b c0475b, final ResultReceiver resultReceiver) {
        C0476c c28562 = new C0476c<MediaItem>(this, str) {
            /* renamed from: b */
            final /* synthetic */ MediaBrowserServiceCompat f9073b;

            /* renamed from: a */
            void m11295a(MediaItem mediaItem) {
                if ((m1806b() & 2) != 0) {
                    resultReceiver.send(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", mediaItem);
                resultReceiver.send(0, bundle);
            }
        };
        this.f1596c = c0475b;
        m1837b(str, c28562);
        this.f1596c = null;
        if (c28562.m1805a() == null) {
            resultReceiver = new StringBuilder();
            resultReceiver.append("onLoadItem must call detach() or sendResult() before returning for id=");
            resultReceiver.append(str);
            throw new IllegalStateException(resultReceiver.toString());
        }
    }

    /* renamed from: a */
    void m1826a(String str, Bundle bundle, C0475b c0475b, final ResultReceiver resultReceiver) {
        C0476c c28573 = new C0476c<List<MediaItem>>(this, str) {
            /* renamed from: b */
            final /* synthetic */ MediaBrowserServiceCompat f9075b;

            /* renamed from: a */
            void m11298a(List<MediaItem> list) {
                if ((m1806b() & 4) == 0) {
                    if (list != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaItem[0]));
                        resultReceiver.send(0, bundle);
                        return;
                    }
                }
                resultReceiver.send(-1, null);
            }
        };
        this.f1596c = c0475b;
        m1827a(str, bundle, c28573);
        this.f1596c = null;
        if (c28573.m1805a() == null) {
            c0475b = new StringBuilder();
            c0475b.append("onSearch must call detach() or sendResult() before returning for query=");
            c0475b.append(str);
            throw new IllegalStateException(c0475b.toString());
        }
    }

    /* renamed from: b */
    void m1835b(String str, Bundle bundle, C0475b c0475b, final ResultReceiver resultReceiver) {
        C0476c c28584 = new C0476c<Bundle>(this, str) {
            /* renamed from: b */
            final /* synthetic */ MediaBrowserServiceCompat f9077b;

            /* renamed from: a */
            void m11299a(Bundle bundle) {
                resultReceiver.send(0, bundle);
            }

            /* renamed from: b */
            void mo487b(Bundle bundle) {
                resultReceiver.send(-1, bundle);
            }
        };
        this.f1596c = c0475b;
        m1836b(str, bundle, c28584);
        this.f1596c = null;
        if (c28584.m1805a() == null) {
            resultReceiver = new StringBuilder();
            resultReceiver.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
            resultReceiver.append(str);
            resultReceiver.append(" extras=");
            resultReceiver.append(bundle);
            throw new IllegalStateException(resultReceiver.toString());
        }
    }
}
