package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import java.lang.reflect.Field;
import java.util.NavigableSet;
import java.util.TreeSet;

public class UnmodifiableNavigableSetSerializer extends Serializer<NavigableSet<?>> {
    Field delegate;

    public UnmodifiableNavigableSetSerializer() {
        super(false);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Sets.class.getCanonicalName());
            stringBuilder.append("$UnmodifiableNavigableSet");
            this.delegate = Class.forName(stringBuilder.toString()).getDeclaredField("delegate");
            this.delegate.setAccessible(true);
        } catch (Throwable e) {
            throw new RuntimeException("Issues reflectively writing UnmodifiableNavigableSet", e);
        } catch (Throwable e2) {
            throw new RuntimeException("Issues reflectively writing UnmodifiableNavigableSet", e2);
        } catch (Throwable e22) {
            throw new RuntimeException("Issues reflectively writing UnmodifiableNavigableSet", e22);
        } catch (Throwable e222) {
            throw new RuntimeException("Issues reflectively writing UnmodifiableNavigableSet", e222);
        }
    }

    @VisibleForTesting
    protected Object getDelegateFromUnmodifiableNavigableSet(NavigableSet<?> navigableSet) {
        try {
            return this.delegate.get(navigableSet);
        } catch (NavigableSet<?> navigableSet2) {
            throw new RuntimeException("Issues reflectively writing UnmodifiableNavigableSet", navigableSet2);
        } catch (NavigableSet<?> navigableSet22) {
            throw new RuntimeException("Issues reflectively writing UnmodifiableNavigableSet", navigableSet22);
        }
    }

    public void write(Kryo kryo, Output output, NavigableSet<?> navigableSet) {
        kryo.writeClassAndObject(output, getDelegateFromUnmodifiableNavigableSet(navigableSet));
    }

    public NavigableSet<?> read(Kryo kryo, Input input, Class<NavigableSet<?>> cls) {
        return Sets.unmodifiableNavigableSet((NavigableSet) kryo.readClassAndObject(input));
    }

    public NavigableSet<?> copy(Kryo kryo, NavigableSet<?> navigableSet) {
        return Sets.unmodifiableNavigableSet((NavigableSet) kryo.copy(getDelegateFromUnmodifiableNavigableSet(navigableSet)));
    }

    public static void registerSerializers(Kryo kryo) {
        kryo.register(Sets.unmodifiableNavigableSet(new TreeSet()).getClass(), new UnmodifiableNavigableSetSerializer());
    }
}
