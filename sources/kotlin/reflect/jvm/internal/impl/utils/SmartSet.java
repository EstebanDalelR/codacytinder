package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.C19066k;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C15821b;
import kotlin.jvm.internal.C15829m;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

public final class SmartSet<T> extends AbstractSet<T> {
    private static final int ARRAY_THRESHOLD = 5;
    public static final Companion Companion = new Companion();
    private Object data;
    private int size;

    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final <T> SmartSet<T> create() {
            return new SmartSet();
        }

        @JvmStatic
        @NotNull
        public final <T> SmartSet<T> create(@NotNull Collection<? extends T> collection) {
            C2668g.b(collection, "set");
            SmartSet<T> smartSet = new SmartSet();
            smartSet.addAll(collection);
            return smartSet;
        }
    }

    private static final class ArrayIterator<T> implements Iterator<T>, KMutableIterator {
        private final Iterator<T> arrayIterator;

        public ArrayIterator(@NotNull T[] tArr) {
            C2668g.b(tArr, "array");
            this.arrayIterator = C15821b.m59855a(tArr);
        }

        public boolean hasNext() {
            return this.arrayIterator.hasNext();
        }

        public T next() {
            return this.arrayIterator.next();
        }

        @NotNull
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class SingletonIterator<T> implements Iterator<T>, KMutableIterator {
        private final T element;
        private boolean hasNext = true;

        public SingletonIterator(T t) {
            this.element = t;
        }

        public T next() {
            if (this.hasNext) {
                this.hasNext = false;
                return this.element;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.hasNext;
        }

        @NotNull
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @JvmStatic
    @NotNull
    public static final <T> SmartSet<T> create() {
        return Companion.create();
    }

    private SmartSet() {
    }

    public final int size() {
        return getSize();
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int i) {
        this.size = i;
    }

    @NotNull
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new SingletonIterator(this.data);
        }
        if (size() < ARRAY_THRESHOLD) {
            Object obj = this.data;
            if (obj != null) {
                return new ArrayIterator((Object[]) obj);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj2 = this.data;
        if (obj2 != null) {
            return C15829m.m59882e(obj2).iterator();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
    }

    public boolean add(T t) {
        if (size() == 0) {
            this.data = t;
        } else if (size() == 1) {
            if (C2668g.a(this.data, t)) {
                return false;
            }
            this.data = new Object[]{this.data, t};
        } else if (size() < ARRAY_THRESHOLD) {
            r0 = this.data;
            if (r0 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Object[] objArr = (Object[]) r0;
            if (C19066k.m67979a(objArr, (Object) t)) {
                return false;
            }
            if (size() == ARRAY_THRESHOLD - 1) {
                r0 = am.m64180c(Arrays.copyOf(objArr, objArr.length));
                r0.add(t);
            } else {
                r0 = Arrays.copyOf(objArr, size() + 1);
                r0[r0.length - 1] = t;
            }
            this.data = r0;
        } else {
            r0 = this.data;
            if (r0 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
            } else if (C15829m.m59882e(r0).add(t) == null) {
                return false;
            }
        }
        setSize(size() + 1);
        return true;
    }

    public void clear() {
        this.data = null;
        setSize(0);
    }

    public boolean contains(Object obj) {
        if (size() == 0) {
            return null;
        }
        if (size() == 1) {
            return C2668g.a(this.data, obj);
        }
        Object obj2;
        if (size() < ARRAY_THRESHOLD) {
            obj2 = this.data;
            if (obj2 != null) {
                return C19066k.m67979a((Object[]) obj2, obj);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        obj2 = this.data;
        if (obj2 != null) {
            return ((Set) obj2).contains(obj);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Set<T>");
    }
}
