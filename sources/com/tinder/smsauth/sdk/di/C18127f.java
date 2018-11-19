package com.tinder.smsauth.sdk.di;

import android.arch.lifecycle.C0029n;
import com.tinder.smsauth.core.di.scope.SmsAuthScope;
import com.tinder.smsauth.ui.SmsAuthViewModelFactory;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@SmsAuthScope
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B.\b\u0001\u0012%\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0006¢\u0006\u0002\b\u00070\u0003¢\u0006\u0002\u0010\bJ'\u0010\t\u001a\u0002H\n\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004H\u0016¢\u0006\u0002\u0010\fR-\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0006¢\u0006\u0002\b\u00070\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/smsauth/sdk/di/InjectingSmsAuthViewModelFactory;", "Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;", "creators", "", "Ljava/lang/Class;", "Landroid/arch/lifecycle/ViewModel;", "Ljavax/inject/Provider;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;)V", "create", "T", "modelClass", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "sdk_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.sdk.di.f */
public final class C18127f implements SmsAuthViewModelFactory {
    /* renamed from: a */
    private final Map<Class<? extends C0029n>, Provider<C0029n>> f56257a;

    @Inject
    public C18127f(@NotNull Map<Class<? extends C0029n>, Provider<C0029n>> map) {
        C2668g.b(map, "creators");
        this.f56257a = map;
    }

    public <T extends C0029n> T create(@NotNull Class<T> cls) {
        C2668g.b(cls, "modelClass");
        Object obj = this.f56257a.get(cls);
        if (obj != null) {
            return (C0029n) ((Provider) obj).get();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown modelClass: ");
        stringBuilder.append(cls);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }
}
