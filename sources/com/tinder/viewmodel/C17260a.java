package com.tinder.viewmodel;

import android.arch.lifecycle.C0029n;
import android.arch.lifecycle.ViewModelProvider.Factory;
import java.util.Map;
import java.util.Map.Entry;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B.\b\u0007\u0012%\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0006¢\u0006\u0002\b\u00070\u0003¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004H\u0016¢\u0006\u0002\u0010\fR-\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0006¢\u0006\u0002\b\u00070\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/viewmodel/DemoViewModelFactory;", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "creators", "", "Ljava/lang/Class;", "Landroid/arch/lifecycle/ViewModel;", "Ljavax/inject/Provider;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;)V", "create", "T", "modelClass", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "viewmodel_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.viewmodel.a */
public final class C17260a implements Factory {
    /* renamed from: a */
    private final Map<Class<? extends C0029n>, Provider<C0029n>> f52887a;

    @Inject
    public C17260a(@NotNull Map<Class<? extends C0029n>, Provider<C0029n>> map) {
        C2668g.b(map, "creators");
        this.f52887a = map;
    }

    @NotNull
    public <T extends C0029n> T create(@NotNull Class<T> cls) {
        C2668g.b(cls, "modelClass");
        Provider provider = (Provider) this.f52887a.get(cls);
        if (provider == null) {
            for (Entry entry : this.f52887a.entrySet()) {
                Class cls2 = (Class) entry.getKey();
                Provider provider2 = (Provider) entry.getValue();
                if (cls.isAssignableFrom(cls2)) {
                    provider = provider2;
                    break;
                }
            }
        }
        if (provider == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unknown model class ");
            stringBuilder.append(cls);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        try {
            cls = provider.get();
            if (cls != null) {
                return (C0029n) cls;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } catch (Class<T> cls3) {
            throw new RuntimeException((Throwable) cls3);
        }
    }
}
