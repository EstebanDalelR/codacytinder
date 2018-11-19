package android.support.text.emoji;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.AnyThread;
import android.support.annotation.CheckResult;
import android.support.annotation.ColorInt;
import android.support.annotation.GuardedBy;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.util.C0546b;
import android.support.v4.util.C0561l;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@AnyThread
public class EmojiCompat {
    /* renamed from: a */
    private static final Object f1006a = new Object();
    @GuardedBy("sInstanceLock")
    /* renamed from: b */
    private static volatile EmojiCompat f1007b;
    /* renamed from: c */
    private final ReadWriteLock f1008c = new ReentrantReadWriteLock();
    @GuardedBy("mInitLock")
    /* renamed from: d */
    private final Set<C0283d> f1009d;
    @GuardedBy("mInitLock")
    /* renamed from: e */
    private int f1010e;
    /* renamed from: f */
    private final Handler f1011f;
    /* renamed from: g */
    private final C0281a f1012g;
    /* renamed from: h */
    private final MetadataRepoLoader f1013h;
    /* renamed from: i */
    private final boolean f1014i;
    /* renamed from: j */
    private final boolean f1015j;
    /* renamed from: k */
    private final int[] f1016k;
    /* renamed from: l */
    private final boolean f1017l;
    /* renamed from: m */
    private final int f1018m;

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LoadState {
    }

    public interface MetadataRepoLoader {
        void load(@NonNull C0285f c0285f);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReplaceStrategy {
    }

    /* renamed from: android.support.text.emoji.EmojiCompat$a */
    private static class C0281a {
        /* renamed from: a */
        final EmojiCompat f995a;

        /* renamed from: a */
        CharSequence mo291a(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, boolean z) {
            return charSequence;
        }

        /* renamed from: a */
        void mo293a(@NonNull EditorInfo editorInfo) {
        }

        C0281a(EmojiCompat emojiCompat) {
            this.f995a = emojiCompat;
        }

        /* renamed from: a */
        void mo292a() {
            this.f995a.m1065f();
        }
    }

    /* renamed from: android.support.text.emoji.EmojiCompat$c */
    public static abstract class C0282c {
        /* renamed from: a */
        private final MetadataRepoLoader f996a;
        /* renamed from: b */
        private boolean f997b;
        /* renamed from: c */
        private boolean f998c;
        /* renamed from: d */
        private int[] f999d;
        /* renamed from: e */
        private Set<C0283d> f1000e;
        /* renamed from: f */
        private boolean f1001f;
        /* renamed from: g */
        private int f1002g = -16711936;

        protected C0282c(@NonNull MetadataRepoLoader metadataRepoLoader) {
            C0561l.m2062a((Object) metadataRepoLoader, (Object) "metadataLoader cannot be null.");
            this.f996a = metadataRepoLoader;
        }
    }

    /* renamed from: android.support.text.emoji.EmojiCompat$d */
    public static abstract class C0283d {
        /* renamed from: a */
        public void mo304a() {
        }

        /* renamed from: a */
        public void m1049a(@Nullable Throwable th) {
        }
    }

    /* renamed from: android.support.text.emoji.EmojiCompat$e */
    private static class C0284e implements Runnable {
        /* renamed from: a */
        private final List<C0283d> f1003a;
        /* renamed from: b */
        private final Throwable f1004b;
        /* renamed from: c */
        private final int f1005c;

        C0284e(@NonNull C0283d c0283d, int i) {
            this(Arrays.asList(new C0283d[]{(C0283d) C0561l.m2062a((Object) c0283d, (Object) "initCallback cannot be null")}), i, null);
        }

        C0284e(@NonNull Collection<C0283d> collection, int i) {
            this(collection, i, null);
        }

        C0284e(@NonNull Collection<C0283d> collection, int i, @Nullable Throwable th) {
            C0561l.m2062a((Object) collection, (Object) "initCallbacks cannot be null");
            this.f1003a = new ArrayList(collection);
            this.f1005c = i;
            this.f1004b = th;
        }

        public void run() {
            int size = this.f1003a.size();
            int i = 0;
            if (this.f1005c != 1) {
                while (i < size) {
                    ((C0283d) this.f1003a.get(i)).m1049a(this.f1004b);
                    i++;
                }
                return;
            }
            while (i < size) {
                ((C0283d) this.f1003a.get(i)).mo304a();
                i++;
            }
        }
    }

    /* renamed from: android.support.text.emoji.EmojiCompat$f */
    public static abstract class C0285f {
        /* renamed from: a */
        public abstract void mo289a(@NonNull C0299d c0299d);

        /* renamed from: a */
        public abstract void mo290a(@Nullable Throwable th);
    }

    @RequiresApi(19)
    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: android.support.text.emoji.EmojiCompat$g */
    static class C0286g {
        C0286g() {
        }

        /* renamed from: a */
        C0293b m1052a(@NonNull EmojiMetadata emojiMetadata) {
            return new C2790f(emojiMetadata);
        }
    }

    @RequiresApi(19)
    /* renamed from: android.support.text.emoji.EmojiCompat$b */
    private static final class C2786b extends C0281a {
        /* renamed from: b */
        private volatile C0292a f8832b;
        /* renamed from: c */
        private volatile C0299d f8833c;

        /* renamed from: android.support.text.emoji.EmojiCompat$b$1 */
        class C27851 extends C0285f {
            /* renamed from: a */
            final /* synthetic */ C2786b f8831a;

            C27851(C2786b c2786b) {
                this.f8831a = c2786b;
            }

            /* renamed from: a */
            public void mo289a(@NonNull C0299d c0299d) {
                this.f8831a.m10849a(c0299d);
            }

            /* renamed from: a */
            public void mo290a(@Nullable Throwable th) {
                this.f8831a.a.m1057a(th);
            }
        }

        C2786b(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        /* renamed from: a */
        void mo292a() {
            try {
                this.a.f1013h.load(new C27851(this));
            } catch (Throwable th) {
                this.a.m1057a(th);
            }
        }

        /* renamed from: a */
        private void m10849a(@NonNull C0299d c0299d) {
            if (c0299d == null) {
                this.a.m1057a(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f8833c = c0299d;
            this.f8832b = new C0292a(this.f8833c, new C0286g(), this.a.f1015j, this.a.f1016k);
            this.a.m1065f();
        }

        /* renamed from: a */
        CharSequence mo291a(@NonNull CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f8832b.m1108a(charSequence, i, i2, i3, z);
        }

        /* renamed from: a */
        void mo293a(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f8833c.m1133b());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.a.f1014i);
        }
    }

    private EmojiCompat(@NonNull C0282c c0282c) {
        this.f1014i = c0282c.f997b;
        this.f1015j = c0282c.f998c;
        this.f1016k = c0282c.f999d;
        this.f1017l = c0282c.f1001f;
        this.f1018m = c0282c.f1002g;
        this.f1013h = c0282c.f996a;
        this.f1011f = new Handler(Looper.getMainLooper());
        this.f1009d = new C0546b();
        if (!(c0282c.f1000e == null || c0282c.f1000e.isEmpty())) {
            this.f1009d.addAll(c0282c.f1000e);
        }
        this.f1012g = VERSION.SDK_INT < 19 ? new C0281a(this) : new C2786b(this);
        m1063e();
    }

    /* renamed from: a */
    public static EmojiCompat m1054a(@NonNull C0282c c0282c) {
        if (f1007b == null) {
            synchronized (f1006a) {
                if (f1007b == null) {
                    f1007b = new EmojiCompat(c0282c);
                }
            }
        }
        return f1007b;
    }

    /* renamed from: a */
    public static EmojiCompat m1053a() {
        EmojiCompat emojiCompat;
        synchronized (f1006a) {
            C0561l.m2064a(f1007b != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            emojiCompat = f1007b;
        }
        return emojiCompat;
    }

    /* renamed from: e */
    private void m1063e() {
        this.f1008c.writeLock().lock();
        try {
            this.f1010e = 0;
            this.f1012g.mo292a();
        } finally {
            this.f1008c.writeLock().unlock();
        }
    }

    /* renamed from: f */
    private void m1065f() {
        Collection arrayList = new ArrayList();
        this.f1008c.writeLock().lock();
        try {
            this.f1010e = 1;
            arrayList.addAll(this.f1009d);
            this.f1009d.clear();
            this.f1011f.post(new C0284e(arrayList, this.f1010e));
        } finally {
            this.f1008c.writeLock().unlock();
        }
    }

    /* renamed from: a */
    private void m1057a(@Nullable Throwable th) {
        Collection arrayList = new ArrayList();
        this.f1008c.writeLock().lock();
        try {
            this.f1010e = 2;
            arrayList.addAll(this.f1009d);
            this.f1009d.clear();
            this.f1011f.post(new C0284e(arrayList, this.f1010e, th));
        } finally {
            arrayList = this.f1008c.writeLock();
            arrayList.unlock();
        }
    }

    /* renamed from: a */
    public void m1071a(@NonNull C0283d c0283d) {
        C0561l.m2062a((Object) c0283d, (Object) "initCallback cannot be null");
        this.f1008c.writeLock().lock();
        try {
            if (this.f1010e != 1) {
                if (this.f1010e != 2) {
                    this.f1009d.add(c0283d);
                    this.f1008c.writeLock().unlock();
                }
            }
            this.f1011f.post(new C0284e(c0283d, this.f1010e));
            this.f1008c.writeLock().unlock();
        } catch (Throwable th) {
            this.f1008c.writeLock().unlock();
        }
    }

    /* renamed from: b */
    public int m1073b() {
        this.f1008c.readLock().lock();
        try {
            int i = this.f1010e;
            return i;
        } finally {
            this.f1008c.readLock().unlock();
        }
    }

    /* renamed from: g */
    private boolean m1066g() {
        return m1073b() == 1;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: c */
    boolean m1074c() {
        return this.f1017l;
    }

    @ColorInt
    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: d */
    int m1075d() {
        return this.f1018m;
    }

    /* renamed from: a */
    public static boolean m1058a(@NonNull Editable editable, int i, KeyEvent keyEvent) {
        return VERSION.SDK_INT >= 19 ? C0292a.m1103a(editable, i, keyEvent) : null;
    }

    /* renamed from: a */
    public static boolean m1059a(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, boolean z) {
        return VERSION.SDK_INT >= 19 ? C0292a.m1106a(inputConnection, editable, i, i2, z) : null;
    }

    @CheckResult
    /* renamed from: a */
    public CharSequence m1067a(@NonNull CharSequence charSequence) {
        return m1068a(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @CheckResult
    /* renamed from: a */
    public CharSequence m1068a(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        return m1069a(charSequence, i, i2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    @CheckResult
    /* renamed from: a */
    public CharSequence m1069a(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3) {
        return m1070a(charSequence, i, i2, i3, 0);
    }

    @CheckResult
    /* renamed from: a */
    public CharSequence m1070a(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, int i4) {
        C0561l.m2064a(m1066g(), "Not initialized yet");
        C0561l.m2060a(i, "start cannot be negative");
        C0561l.m2060a(i2, "end cannot be negative");
        C0561l.m2060a(i3, "maxEmojiCount cannot be negative");
        C0561l.m2063a(i <= i2, (Object) "start should be <= than end");
        if (charSequence == null) {
            return charSequence;
        }
        C0561l.m2063a(i <= charSequence.length(), (Object) "start should be < than charSequence length");
        C0561l.m2063a(i2 <= charSequence.length(), (Object) "end should be < than charSequence length");
        if (charSequence.length() != 0) {
            if (i != i2) {
                boolean z;
                switch (i4) {
                    case 1:
                        z = true;
                        break;
                    case 2:
                        z = false;
                        break;
                    default:
                        z = this.f1014i;
                        break;
                }
                return this.f1012g.mo291a(charSequence, i, i2, i3, z);
            }
        }
        return charSequence;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public void m1072a(@NonNull EditorInfo editorInfo) {
        if (m1066g() && editorInfo != null && editorInfo.extras != null) {
            this.f1012g.mo293a(editorInfo);
        }
    }
}
