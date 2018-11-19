package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.C2314v;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.video.d */
public final class C2334d {
    /* renamed from: a */
    private final WindowManager f7011a;
    /* renamed from: b */
    private final C2333b f7012b;
    /* renamed from: c */
    private final C2332a f7013c;
    /* renamed from: d */
    private long f7014d;
    /* renamed from: e */
    private long f7015e;
    /* renamed from: f */
    private long f7016f;
    /* renamed from: g */
    private long f7017g;
    /* renamed from: h */
    private long f7018h;
    /* renamed from: i */
    private boolean f7019i;
    /* renamed from: j */
    private long f7020j;
    /* renamed from: k */
    private long f7021k;
    /* renamed from: l */
    private long f7022l;

    @TargetApi(17)
    /* renamed from: com.google.android.exoplayer2.video.d$a */
    private final class C2332a implements DisplayListener {
        /* renamed from: a */
        final /* synthetic */ C2334d f7003a;
        /* renamed from: b */
        private final DisplayManager f7004b;

        public void onDisplayAdded(int i) {
        }

        public void onDisplayRemoved(int i) {
        }

        public C2332a(C2334d c2334d, DisplayManager displayManager) {
            this.f7003a = c2334d;
            this.f7004b = displayManager;
        }

        /* renamed from: a */
        public void m8524a() {
            this.f7004b.registerDisplayListener(this, null);
        }

        /* renamed from: b */
        public void m8525b() {
            this.f7004b.unregisterDisplayListener(this);
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                this.f7003a.m8536c();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.video.d$b */
    private static final class C2333b implements Callback, FrameCallback {
        /* renamed from: b */
        private static final C2333b f7005b = new C2333b();
        /* renamed from: a */
        public volatile long f7006a = -9223372036854775807L;
        /* renamed from: c */
        private final Handler f7007c;
        /* renamed from: d */
        private final HandlerThread f7008d = new HandlerThread("ChoreographerOwner:Handler");
        /* renamed from: e */
        private Choreographer f7009e;
        /* renamed from: f */
        private int f7010f;

        /* renamed from: a */
        public static C2333b m8526a() {
            return f7005b;
        }

        private C2333b() {
            this.f7008d.start();
            this.f7007c = new Handler(this.f7008d.getLooper(), this);
            this.f7007c.sendEmptyMessage(0);
        }

        /* renamed from: b */
        public void m8530b() {
            this.f7007c.sendEmptyMessage(1);
        }

        /* renamed from: c */
        public void m8531c() {
            this.f7007c.sendEmptyMessage(2);
        }

        public void doFrame(long j) {
            this.f7006a = j;
            this.f7009e.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case null:
                    m8527d();
                    return true;
                case 1:
                    m8528e();
                    return true;
                case 2:
                    m8529f();
                    return true;
                default:
                    return null;
            }
        }

        /* renamed from: d */
        private void m8527d() {
            this.f7009e = Choreographer.getInstance();
        }

        /* renamed from: e */
        private void m8528e() {
            this.f7010f++;
            if (this.f7010f == 1) {
                this.f7009e.postFrameCallback(this);
            }
        }

        /* renamed from: f */
        private void m8529f() {
            this.f7010f--;
            if (this.f7010f == 0) {
                this.f7009e.removeFrameCallback(this);
                this.f7006a = -9223372036854775807L;
            }
        }
    }

    public C2334d() {
        this(null);
    }

    public C2334d(@Nullable Context context) {
        WindowManager windowManager;
        C2332a c2332a = null;
        if (context == null) {
            windowManager = null;
        } else {
            windowManager = (WindowManager) context.getSystemService("window");
        }
        this.f7011a = windowManager;
        if (this.f7011a != null) {
            if (C2314v.f6956a >= 17) {
                c2332a = m8533a(context);
            }
            this.f7013c = c2332a;
            this.f7012b = C2333b.m8526a();
        } else {
            this.f7013c = null;
            this.f7012b = null;
        }
        this.f7014d = -9223372036854775807L;
        this.f7015e = -9223372036854775807L;
    }

    /* renamed from: a */
    public void m8538a() {
        this.f7019i = false;
        if (this.f7011a != null) {
            this.f7012b.m8530b();
            if (this.f7013c != null) {
                this.f7013c.m8524a();
            }
            m8536c();
        }
    }

    /* renamed from: b */
    public void m8539b() {
        if (this.f7011a != null) {
            if (this.f7013c != null) {
                this.f7013c.m8525b();
            }
            this.f7012b.m8531c();
        }
    }

    /* renamed from: a */
    public long m8537a(long j, long j2) {
        long j3;
        long j4;
        long j5 = j;
        long j6 = j2;
        long j7 = 1000 * j5;
        if (this.f7019i) {
            if (j5 != r0.f7016f) {
                r0.f7022l++;
                r0.f7017g = r0.f7018h;
            }
            if (r0.f7022l >= 6) {
                j3 = r0.f7017g + ((j7 - r0.f7021k) / r0.f7022l);
                if (m8535b(j3, j6)) {
                    r0.f7019i = false;
                } else {
                    j4 = (r0.f7020j + j3) - r0.f7021k;
                    if (!r0.f7019i) {
                        r0.f7021k = j7;
                        r0.f7020j = j6;
                        r0.f7022l = 0;
                        r0.f7019i = true;
                    }
                    r0.f7016f = j5;
                    r0.f7018h = j3;
                    if (r0.f7012b != null) {
                        if (r0.f7014d == -9223372036854775807L) {
                            j5 = r0.f7012b.f7006a;
                            if (j5 != -9223372036854775807L) {
                                return j4;
                            }
                            return C2334d.m8532a(j4, j5, r0.f7014d) - r0.f7015e;
                        }
                    }
                    return j4;
                }
            } else if (m8535b(j7, j6)) {
                r0.f7019i = false;
            }
        }
        j4 = j6;
        j3 = j7;
        if (r0.f7019i) {
            r0.f7021k = j7;
            r0.f7020j = j6;
            r0.f7022l = 0;
            r0.f7019i = true;
        }
        r0.f7016f = j5;
        r0.f7018h = j3;
        if (r0.f7012b != null) {
            if (r0.f7014d == -9223372036854775807L) {
                j5 = r0.f7012b.f7006a;
                if (j5 != -9223372036854775807L) {
                    return C2334d.m8532a(j4, j5, r0.f7014d) - r0.f7015e;
                }
                return j4;
            }
        }
        return j4;
    }

    @TargetApi(17)
    /* renamed from: a */
    private C2332a m8533a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new C2332a(this, displayManager);
    }

    /* renamed from: c */
    private void m8536c() {
        Display defaultDisplay = this.f7011a.getDefaultDisplay();
        if (defaultDisplay != null) {
            this.f7014d = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f7015e = (this.f7014d * 80) / 100;
        }
    }

    /* renamed from: b */
    private boolean m8535b(long j, long j2) {
        return Math.abs((j2 - this.f7020j) - (j - this.f7021k)) > 20000000 ? 1 : 0;
    }

    /* renamed from: a */
    private static long m8532a(long j, long j2, long j3) {
        long j4 = j2 + (((j - j2) / j3) * j3);
        if (j <= j4) {
            j2 = j4;
            j4 -= j3;
        } else {
            j2 = j4 + j3;
        }
        return j2 - j < j - j4 ? j2 : j4;
    }
}
