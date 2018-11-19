package com.google.android.exoplayer2.offline;

import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.util.C2289a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class DownloadManager {
    /* renamed from: a */
    private final C2161c f6178a;
    /* renamed from: b */
    private final int f6179b;
    /* renamed from: c */
    private final C2159a f6180c;
    /* renamed from: d */
    private final ArrayList<Task> f6181d;
    /* renamed from: e */
    private final ArrayList<Task> f6182e;
    /* renamed from: f */
    private final Handler f6183f;
    /* renamed from: g */
    private final Handler f6184g;
    /* renamed from: h */
    private final CopyOnWriteArraySet<Listener> f6185h;
    /* renamed from: i */
    private boolean f6186i;
    /* renamed from: j */
    private boolean f6187j;
    /* renamed from: k */
    private boolean f6188k;

    /* renamed from: com.google.android.exoplayer2.offline.DownloadManager$1 */
    class C21551 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ConditionVariable f6158a;

        public void run() {
            this.f6158a.open();
        }
    }

    public interface Listener {
        void onIdle(DownloadManager downloadManager);

        void onInitialized(DownloadManager downloadManager);

        void onTaskStateChanged(DownloadManager downloadManager, TaskState taskState);
    }

    private static final class Task implements Runnable {
        /* renamed from: a */
        private final int f6164a;
        /* renamed from: b */
        private final DownloadManager f6165b;
        /* renamed from: c */
        private final C2160b f6166c;
        /* renamed from: d */
        private final int f6167d;
        /* renamed from: e */
        private volatile int f6168e;
        /* renamed from: f */
        private volatile Downloader f6169f;
        /* renamed from: g */
        private Thread f6170g;
        /* renamed from: h */
        private Throwable f6171h;

        /* renamed from: com.google.android.exoplayer2.offline.DownloadManager$Task$1 */
        class C21571 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ Task f6161a;

            C21571(Task task) {
                this.f6161a = task;
            }

            public void run() {
                this.f6161a.m7733a(5, 3);
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface InternalState {
        }

        /* renamed from: a */
        public TaskState m7746a() {
            return new TaskState(this.f6164a, this.f6166c, m7741f(), m7749d(), m7750e(), this.f6171h);
        }

        /* renamed from: b */
        public boolean m7747b() {
            if (!(this.f6168e == 4 || this.f6168e == 2)) {
                if (this.f6168e != 3) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public boolean m7748c() {
            if (this.f6168e == 5 || this.f6168e == 1 || this.f6168e == 7) {
                return true;
            }
            return this.f6168e == 6;
        }

        /* renamed from: d */
        public float m7749d() {
            return this.f6169f != null ? this.f6169f.getDownloadPercentage() : -1.0f;
        }

        /* renamed from: e */
        public long m7750e() {
            return this.f6169f != null ? this.f6169f.getDownloadedBytes() : 0;
        }

        public String toString() {
            return super.toString();
        }

        /* renamed from: f */
        private int m7741f() {
            switch (this.f6168e) {
                case 5:
                    return 0;
                case 6:
                case 7:
                    return 1;
                default:
                    return this.f6168e;
            }
        }

        /* renamed from: g */
        private void m7742g() {
            if (m7733a(0, 1)) {
                this.f6170g = new Thread(this);
                this.f6170g.start();
            }
        }

        /* renamed from: h */
        private boolean m7743h() {
            return this.f6168e == 0;
        }

        /* renamed from: i */
        private void m7744i() {
            if (m7733a(0, 5)) {
                this.f6165b.f6183f.post(new C21571(this));
            } else if (m7733a(1, 6)) {
                m7745j();
            }
        }

        /* renamed from: a */
        private boolean m7733a(int i, int i2) {
            return m7734a(i, i2, null);
        }

        /* renamed from: a */
        private boolean m7734a(int i, int i2, Throwable th) {
            boolean z = false;
            if (this.f6168e != i) {
                return false;
            }
            this.f6168e = i2;
            this.f6171h = th;
            if (this.f6168e != m7741f()) {
                z = true;
            }
            if (!z) {
                this.f6165b.m7752a(this);
            }
            return true;
        }

        /* renamed from: j */
        private void m7745j() {
            if (this.f6169f != null) {
                this.f6169f.cancel();
            }
            this.f6170g.interrupt();
        }

        public void run() {
            long j;
            int i;
            Throwable th;
            DownloadManager.m7760b("Task is started", this);
            try {
                this.f6169f = this.f6166c.m7767a(this.f6165b.f6178a);
                if (this.f6166c.f6194d) {
                    this.f6169f.remove();
                } else {
                    j = -1;
                    i = 0;
                    while (!Thread.interrupted()) {
                        this.f6169f.download();
                    }
                }
                th = null;
            } catch (IOException e) {
                long downloadedBytes = this.f6169f.getDownloadedBytes();
                if (downloadedBytes != j) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Reset error count. downloadedBytes = ");
                    stringBuilder.append(downloadedBytes);
                    DownloadManager.m7760b(stringBuilder.toString(), this);
                    j = downloadedBytes;
                    i = 0;
                }
                if (this.f6168e == 1) {
                    i++;
                    if (i <= this.f6167d) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Download error. Retry ");
                        stringBuilder2.append(i);
                        DownloadManager.m7760b(stringBuilder2.toString(), this);
                        Thread.sleep((long) m7732a(i));
                    }
                }
                throw e;
            } catch (Throwable th2) {
                th = th2;
            }
            this.f6165b.f6183f.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ Task f6163b;

                public void run() {
                    if (!this.f6163b.m7734a(1, th != null ? 4 : 2, th) && !this.f6163b.m7733a(6, 3)) {
                        if (!this.f6163b.m7733a(7, 0)) {
                            throw new IllegalStateException();
                        }
                    }
                }
            });
        }

        /* renamed from: a */
        private int m7732a(int i) {
            return Math.min((i - 1) * AdError.NETWORK_ERROR_CODE, 5000);
        }
    }

    public static final class TaskState {
        /* renamed from: a */
        public final int f6172a;
        /* renamed from: b */
        public final C2160b f6173b;
        /* renamed from: c */
        public final int f6174c;
        /* renamed from: d */
        public final float f6175d;
        /* renamed from: e */
        public final long f6176e;
        /* renamed from: f */
        public final Throwable f6177f;

        @Retention(RetentionPolicy.SOURCE)
        public @interface State {
        }

        private TaskState(int i, C2160b c2160b, int i2, float f, long j, Throwable th) {
            this.f6172a = i;
            this.f6173b = c2160b;
            this.f6174c = i2;
            this.f6175d = f;
            this.f6176e = j;
            this.f6177f = th;
        }
    }

    /* renamed from: b */
    private static void m7759b(String str) {
    }

    /* renamed from: a */
    public boolean m7764a() {
        C2289a.m8313b(this.f6187j ^ true);
        if (!this.f6186i) {
            return false;
        }
        for (int i = 0; i < this.f6181d.size(); i++) {
            if (((Task) this.f6181d.get(i)).m7748c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m7757b() {
        if (this.f6186i) {
            if (!this.f6187j) {
                Object obj;
                Object obj2;
                int i;
                Task task;
                C2160b b;
                boolean z;
                Object obj3;
                int i2;
                Task task2;
                StringBuilder stringBuilder;
                if (!this.f6188k) {
                    if (this.f6182e.size() != this.f6179b) {
                        obj = null;
                        obj2 = obj;
                        for (i = 0; i < this.f6181d.size(); i++) {
                            task = (Task) this.f6181d.get(i);
                            if (!task.m7743h()) {
                                b = task.f6166c;
                                z = b.f6194d;
                                if (!z || r3 == null) {
                                    obj3 = 1;
                                    for (i2 = 0; i2 < i; i2++) {
                                        task2 = (Task) this.f6181d.get(i2);
                                        if (!task2.f6166c.m7769a(b)) {
                                            if (!z) {
                                                stringBuilder = new StringBuilder();
                                                stringBuilder.append(task);
                                                stringBuilder.append(" clashes with ");
                                                stringBuilder.append(task2);
                                                m7759b(stringBuilder.toString());
                                                task2.m7744i();
                                                obj3 = null;
                                            } else if (task2.f6166c.f6194d) {
                                                obj2 = 1;
                                                obj3 = null;
                                                break;
                                            }
                                        }
                                    }
                                    if (obj3 != null) {
                                        task.m7742g();
                                        if (!z) {
                                            this.f6182e.add(task);
                                            obj2 = this.f6182e.size() != this.f6179b ? 1 : null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                obj = 1;
                obj2 = obj;
                for (i = 0; i < this.f6181d.size(); i++) {
                    task = (Task) this.f6181d.get(i);
                    if (!task.m7743h()) {
                        b = task.f6166c;
                        z = b.f6194d;
                        if (z) {
                        }
                        obj3 = 1;
                        for (i2 = 0; i2 < i; i2++) {
                            task2 = (Task) this.f6181d.get(i2);
                            if (!task2.f6166c.m7769a(b)) {
                                if (!z) {
                                    if (task2.f6166c.f6194d) {
                                        obj2 = 1;
                                        obj3 = null;
                                        break;
                                    }
                                } else {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(task);
                                    stringBuilder.append(" clashes with ");
                                    stringBuilder.append(task2);
                                    m7759b(stringBuilder.toString());
                                    task2.m7744i();
                                    obj3 = null;
                                }
                            }
                        }
                        if (obj3 != null) {
                            task.m7742g();
                            if (!z) {
                                this.f6182e.add(task);
                                if (this.f6182e.size() != this.f6179b) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m7762c() {
        if (m7764a()) {
            m7759b("Notify idle state");
            Iterator it = this.f6185h.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onIdle(this);
            }
        }
    }

    /* renamed from: a */
    private void m7752a(Task task) {
        if (!this.f6187j) {
            int c = task.m7748c() ^ 1;
            if (c != 0) {
                this.f6182e.remove(task);
            }
            m7758b(task);
            if (task.m7747b()) {
                this.f6181d.remove(task);
                m7763d();
            }
            if (c != 0) {
                m7757b();
                m7762c();
            }
        }
    }

    /* renamed from: b */
    private void m7758b(Task task) {
        m7760b("Task state is changed", task);
        task = task.m7746a();
        Iterator it = this.f6185h.iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).onTaskStateChanged(this, task);
        }
    }

    /* renamed from: d */
    private void m7763d() {
        if (!this.f6187j) {
            final C2160b[] c2160bArr = new C2160b[this.f6181d.size()];
            for (int i = 0; i < this.f6181d.size(); i++) {
                c2160bArr[i] = ((Task) this.f6181d.get(i)).f6166c;
            }
            this.f6184g.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ DownloadManager f6160b;

                public void run() {
                    try {
                        this.f6160b.f6180c.m7765a(c2160bArr);
                        DownloadManager.m7759b("Actions persisted.");
                    } catch (Throwable e) {
                        Log.e("DownloadManager", "Persisting actions failed.", e);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private static void m7760b(String str, Task task) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append(task);
        m7759b(stringBuilder.toString());
    }
}
