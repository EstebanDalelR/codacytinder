package com.tinder.scarlet.internal.servicemethod;

import com.tinder.scarlet.StreamAdapter;
import com.tinder.scarlet.StreamAdapter.Factory;
import io.reactivex.exceptions.CompositeException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/StreamAdapterResolver;", "", "streamAdapterFactories", "", "Lcom/tinder/scarlet/StreamAdapter$Factory;", "(Ljava/util/List;)V", "resolve", "Lcom/tinder/scarlet/StreamAdapter;", "type", "Ljava/lang/reflect/Type;", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.internal.servicemethod.e */
public final class C14814e {
    /* renamed from: a */
    private final List<Factory> f46416a;

    public C14814e(@NotNull List<? extends Factory> list) {
        C2668g.b(list, "streamAdapterFactories");
        this.f46416a = list;
    }

    @NotNull
    /* renamed from: a */
    public final StreamAdapter<Object, Object> m56159a(@NotNull Type type) {
        C2668g.b(type, "type");
        List arrayList = new ArrayList();
        for (Factory create : this.f46416a) {
            try {
                return create.create(type);
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        Collection collection = arrayList;
        Object[] toArray = collection.toArray(new Throwable[collection.size()]);
        if (toArray == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Throwable[] thArr = (Throwable[]) toArray;
        CompositeException compositeException = new CompositeException((Throwable[]) Arrays.copyOf(thArr, thArr.length));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot resolve stream adapter for type ");
        stringBuilder.append(type);
        stringBuilder.append('.');
        throw new IllegalStateException(stringBuilder.toString(), compositeException);
    }
}
