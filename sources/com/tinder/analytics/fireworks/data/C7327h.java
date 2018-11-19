package com.tinder.analytics.fireworks.data;

import android.support.annotation.NonNull;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.CompatibleFieldSerializer;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.squareup.sqldelight.ColumnAdapter;
import com.tinder.analytics.fireworks.C2632i;
import com.tinder.analytics.fireworks.C2633r;
import de.javakaffee.kryoserializers.ArraysAsListSerializer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: com.tinder.analytics.fireworks.data.h */
class C7327h implements ColumnAdapter<C2632i, byte[]> {
    /* renamed from: a */
    private final ThreadLocal<Kryo> f26479a = new C62281(this);

    /* renamed from: com.tinder.analytics.fireworks.data.h$1 */
    class C62281 extends ThreadLocal<Kryo> {
        /* renamed from: a */
        final /* synthetic */ C7327h f22799a;

        C62281(C7327h c7327h) {
            this.f22799a = c7327h;
        }

        protected /* synthetic */ Object initialValue() {
            return m26887a();
        }

        /* renamed from: a */
        protected Kryo m26887a() {
            return this.f22799a.m31272a();
        }
    }

    C7327h() {
    }

    @NonNull
    public /* synthetic */ Object decode(Object obj) {
        return m31274a((byte[]) obj);
    }

    public /* synthetic */ Object encode(@NonNull Object obj) {
        return m31275a((C2632i) obj);
    }

    @NonNull
    /* renamed from: a */
    public C2632i m31274a(byte[] bArr) {
        bArr = new Input(new ByteArrayInputStream(bArr));
        C2632i c2632i = (C2632i) ((Kryo) this.f26479a.get()).readObject(bArr, C2632i.class);
        bArr.close();
        return c2632i;
    }

    /* renamed from: a */
    public byte[] m31275a(@NonNull C2632i c2632i) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Output output = new Output(byteArrayOutputStream);
        ((Kryo) this.f26479a.get()).writeObject(output, c2632i);
        output.close();
        return byteArrayOutputStream.toByteArray();
    }

    @NonNull
    /* renamed from: a */
    private Kryo m31272a() {
        Kryo kryo = new Kryo();
        kryo.setDefaultSerializer(CompatibleFieldSerializer.class);
        kryo.register(C2632i.class, new FieldSerializer<C2632i>(this, kryo, C2632i.class) {
            /* renamed from: a */
            final /* synthetic */ C7327h f28647a;

            public /* synthetic */ Object create(Kryo kryo, Input input, Class cls) {
                return m33917a(kryo, input, cls);
            }

            /* renamed from: a */
            public C2632i m33917a(Kryo kryo, Input input, Class cls) {
                return C2632i.a("").a();
            }
        });
        kryo.register(C2633r.class, new FieldSerializer<C2633r>(this, kryo, C2633r.class) {
            /* renamed from: a */
            final /* synthetic */ C7327h f28648a;

            protected /* synthetic */ Object create(Kryo kryo, Input input, Class cls) {
                return m33918a(kryo, input, cls);
            }

            /* renamed from: a */
            protected C2633r m33918a(Kryo kryo, Input input, Class cls) {
                return C2633r.a("", String.class);
            }
        });
        kryo.register(Arrays.asList(new String[]{""}).getClass(), new ArraysAsListSerializer());
        return kryo;
    }
}
