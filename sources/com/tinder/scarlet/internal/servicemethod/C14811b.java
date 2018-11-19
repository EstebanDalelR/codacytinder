package com.tinder.scarlet.internal.servicemethod;

import com.tinder.scarlet.MessageAdapter;
import com.tinder.scarlet.MessageAdapter.Factory;
import io.reactivex.exceptions.CompositeException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0010J'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/MessageAdapterResolver;", "", "messageAdapterFactories", "", "Lcom/tinder/scarlet/MessageAdapter$Factory;", "(Ljava/util/List;)V", "messageAdapterCache", "", "Lcom/tinder/scarlet/internal/servicemethod/MessageAdapterResolver$MessageAdapterKey;", "Lcom/tinder/scarlet/MessageAdapter;", "findMessageAdapter", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lcom/tinder/scarlet/MessageAdapter;", "resolve", "MessageAdapterKey", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.internal.servicemethod.b */
public final class C14811b {
    /* renamed from: a */
    private final Map<C14810a, MessageAdapter<Object>> f46410a = ((Map) new LinkedHashMap());
    /* renamed from: b */
    private final List<Factory> f46411b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ(\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/MessageAdapterResolver$MessageAdapterKey;", "", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V", "getAnnotations", "()[Ljava/lang/annotation/Annotation;", "[Ljava/lang/annotation/Annotation;", "getType", "()Ljava/lang/reflect/Type;", "component1", "component2", "copy", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lcom/tinder/scarlet/internal/servicemethod/MessageAdapterResolver$MessageAdapterKey;", "equals", "", "other", "hashCode", "", "toString", "", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.b$a */
    private static final class C14810a {
        @NotNull
        /* renamed from: a */
        private final Type f46408a;
        @NotNull
        /* renamed from: b */
        private final Annotation[] f46409b;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MessageAdapterKey(type=");
            stringBuilder.append(this.f46408a);
            stringBuilder.append(", annotations=");
            stringBuilder.append(Arrays.toString(this.f46409b));
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14810a(@NotNull Type type, @NotNull Annotation[] annotationArr) {
            C2668g.b(type, "type");
            C2668g.b(annotationArr, "annotations");
            this.f46408a = type;
            this.f46409b = annotationArr;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((C2668g.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
                return false;
            }
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.scarlet.internal.servicemethod.MessageAdapterResolver.MessageAdapterKey");
            }
            C14810a c14810a = (C14810a) obj;
            if ((C2668g.a(this.f46408a, c14810a.f46408a) ^ 1) == 0 && Arrays.equals((Object[]) this.f46409b, (Object[]) c14810a.f46409b) != null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f46408a.hashCode() * 31) + Arrays.hashCode((Object[]) this.f46409b);
        }
    }

    public C14811b(@NotNull List<? extends Factory> list) {
        C2668g.b(list, "messageAdapterFactories");
        this.f46411b = list;
    }

    @NotNull
    /* renamed from: a */
    public final MessageAdapter<Object> m56153a(@NotNull Type type, @NotNull Annotation[] annotationArr) {
        C2668g.b(type, "type");
        C2668g.b(annotationArr, "annotations");
        C14810a c14810a = new C14810a(type, annotationArr);
        if (this.f46410a.containsKey(c14810a)) {
            type = this.f46410a.get(c14810a);
            if (type == null) {
                C2668g.a();
            }
            return (MessageAdapter) type;
        }
        type = m56152b(type, annotationArr);
        this.f46410a.put(c14810a, type);
        return type;
    }

    /* renamed from: b */
    private final MessageAdapter<Object> m56152b(Type type, Annotation[] annotationArr) {
        List arrayList = new ArrayList();
        for (Factory create : this.f46411b) {
            try {
                MessageAdapter<Object> create2 = create.create(type, annotationArr);
                if (create2 != null) {
                    return create2;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.scarlet.MessageAdapter<kotlin.Any>");
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
        stringBuilder.append("Cannot resolve message adapter for type: ");
        stringBuilder.append(type);
        stringBuilder.append(", annotations: ");
        stringBuilder.append(annotationArr);
        stringBuilder.append('.');
        throw new IllegalStateException(stringBuilder.toString(), compositeException);
    }
}
