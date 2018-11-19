package android.arch.lifecycle;

import android.app.Application;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;

public class ViewModelProvider {
    /* renamed from: a */
    private final Factory f31a;
    /* renamed from: b */
    private final C0031p f32b;

    public interface Factory {
        @NonNull
        <T extends C0029n> T create(@NonNull Class<T> cls);
    }

    /* renamed from: android.arch.lifecycle.ViewModelProvider$b */
    public static class C2679b implements Factory {
        @NonNull
        public <T extends C0029n> T create(@NonNull Class<T> cls) {
            StringBuilder stringBuilder;
            try {
                return (C0029n) cls.newInstance();
            } catch (Throwable e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot create an instance of ");
                stringBuilder.append(cls);
                throw new RuntimeException(stringBuilder.toString(), e);
            } catch (Throwable e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot create an instance of ");
                stringBuilder.append(cls);
                throw new RuntimeException(stringBuilder.toString(), e2);
            }
        }
    }

    /* renamed from: android.arch.lifecycle.ViewModelProvider$a */
    public static class C3976a extends C2679b {
        /* renamed from: a */
        private static C3976a f12633a;
        /* renamed from: b */
        private Application f12634b;

        @NonNull
        /* renamed from: a */
        public static C3976a m15516a(@NonNull Application application) {
            if (f12633a == null) {
                f12633a = new C3976a(application);
            }
            return f12633a;
        }

        public C3976a(@NonNull Application application) {
            this.f12634b = application;
        }

        @NonNull
        public <T extends C0029n> T create(@NonNull Class<T> cls) {
            StringBuilder stringBuilder;
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                return (C0029n) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f12634b});
            } catch (Throwable e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot create an instance of ");
                stringBuilder.append(cls);
                throw new RuntimeException(stringBuilder.toString(), e);
            } catch (Throwable e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot create an instance of ");
                stringBuilder.append(cls);
                throw new RuntimeException(stringBuilder.toString(), e2);
            } catch (Throwable e22) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot create an instance of ");
                stringBuilder.append(cls);
                throw new RuntimeException(stringBuilder.toString(), e22);
            } catch (Throwable e222) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot create an instance of ");
                stringBuilder.append(cls);
                throw new RuntimeException(stringBuilder.toString(), e222);
            }
        }
    }

    public ViewModelProvider(@NonNull C0031p c0031p, @NonNull Factory factory) {
        this.f31a = factory;
        this.f32b = c0031p;
    }

    @MainThread
    @NonNull
    /* renamed from: a */
    public <T extends C0029n> T m76a(@NonNull Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
        stringBuilder.append(canonicalName);
        return m77a(stringBuilder.toString(), cls);
    }

    @MainThread
    @NonNull
    /* renamed from: a */
    public <T extends C0029n> T m77a(@NonNull String str, @NonNull Class<T> cls) {
        T a = this.f32b.m131a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        cls = this.f31a.create(cls);
        this.f32b.m133a(str, cls);
        return cls;
    }
}
