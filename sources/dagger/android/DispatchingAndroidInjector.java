package dagger.android;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.internal.C15521i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;

public final class DispatchingAndroidInjector<T> implements AndroidInjector<T> {
    /* renamed from: a */
    private final Map<Class<? extends T>, Provider<AndroidInjector$Factory<? extends T>>> f52950a;

    public static final class InvalidInjectorBindingException extends RuntimeException {
        InvalidInjectorBindingException(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    @Inject
    DispatchingAndroidInjector(Map<Class<? extends T>, Provider<AndroidInjector$Factory<? extends T>>> map) {
        this.f52950a = map;
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public boolean m63226a(T t) {
        Provider provider = (Provider) this.f52950a.get(t.getClass());
        if (provider == null) {
            return false;
        }
        AndroidInjector$Factory androidInjector$Factory = (AndroidInjector$Factory) provider.get();
        try {
            ((AndroidInjector) C15521i.m58002a(androidInjector$Factory.create(t), "%s.create(I) should not return null.", androidInjector$Factory.getClass())).inject(t);
            return true;
        } catch (ClassCastException e) {
            throw new InvalidInjectorBindingException(String.format("%s does not implement AndroidInjector.Factory<%s>", new Object[]{androidInjector$Factory.getClass().getCanonicalName(), t.getClass().getCanonicalName()}), e);
        }
    }

    public void inject(T t) {
        if (!m63226a(t)) {
            throw new IllegalArgumentException(m63225b(t));
        }
    }

    /* renamed from: b */
    private String m63225b(T t) {
        List arrayList = new ArrayList();
        for (Class cls : this.f52950a.keySet()) {
            if (cls.isInstance(t)) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            return String.format("No injector factory bound for Class<%s>", new Object[]{t.getClass().getCanonicalName()});
        }
        return String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[]{t.getClass().getCanonicalName(), arrayList});
    }
}
