package com.squareup.moshi;

import com.squareup.moshi.JsonReader.Token;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import javax.annotation.Nullable;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C18549c;

public abstract class JsonAdapter<T> {

    public interface Factory {
        @Nullable
        JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C5987p c5987p);
    }

    @Nullable
    public abstract T fromJson(JsonReader jsonReader) throws IOException;

    public abstract void toJson(C5983k c5983k, @Nullable T t) throws IOException;

    @Nullable
    public final T fromJson(BufferedSource bufferedSource) throws IOException {
        return fromJson(JsonReader.m25581a(bufferedSource));
    }

    @Nullable
    public final T fromJson(String str) throws IOException {
        return fromJson(new C18549c().a(str));
    }

    public final void toJson(BufferedSink bufferedSink, @Nullable T t) throws IOException {
        toJson(C5983k.m25635a(bufferedSink), (Object) t);
    }

    public final String toJson(@Nullable T t) {
        BufferedSink c18549c = new C18549c();
        try {
            toJson(c18549c, (Object) t);
            return c18549c.readUtf8();
        } catch (T t2) {
            throw new AssertionError(t2);
        }
    }

    @Nullable
    public final Object toJsonValue(@Nullable T t) {
        C5983k c7188j = new C7188j();
        try {
            toJson(c7188j, (Object) t);
            return c7188j.m30924f();
        } catch (T t2) {
            throw new AssertionError(t2);
        }
    }

    @Nullable
    public final T fromJsonValue(@Nullable Object obj) {
        try {
            return fromJson(new C7187i(obj));
        } catch (Object obj2) {
            throw new AssertionError(obj2);
        }
    }

    public final JsonAdapter<T> serializeNulls() {
        return new JsonAdapter<T>(this) {
            /* renamed from: b */
            final /* synthetic */ JsonAdapter f25938b;

            @Nullable
            public T fromJson(JsonReader jsonReader) throws IOException {
                return this.fromJson(jsonReader);
            }

            public void toJson(C5983k c5983k, @Nullable T t) throws IOException {
                boolean j = c5983k.m25655j();
                c5983k.m25649c(true);
                try {
                    this.toJson(c5983k, (Object) t);
                } finally {
                    c5983k.m25649c(j);
                }
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this);
                stringBuilder.append(".serializeNulls()");
                return stringBuilder.toString();
            }
        };
    }

    public final JsonAdapter<T> nullSafe() {
        return new JsonAdapter<T>(this) {
            /* renamed from: b */
            final /* synthetic */ JsonAdapter f25940b;

            @Nullable
            public T fromJson(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo6454h() == Token.NULL) {
                    return jsonReader.mo6458l();
                }
                return this.fromJson(jsonReader);
            }

            public void toJson(C5983k c5983k, @Nullable T t) throws IOException {
                if (t == null) {
                    c5983k.mo6475e();
                } else {
                    this.toJson(c5983k, (Object) t);
                }
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this);
                stringBuilder.append(".nullSafe()");
                return stringBuilder.toString();
            }
        };
    }

    public final JsonAdapter<T> lenient() {
        return new JsonAdapter<T>(this) {
            /* renamed from: b */
            final /* synthetic */ JsonAdapter f25942b;

            @Nullable
            public T fromJson(JsonReader jsonReader) throws IOException {
                boolean a = jsonReader.m25587a();
                jsonReader.m25586a(true);
                try {
                    T fromJson = this.fromJson(jsonReader);
                    return fromJson;
                } finally {
                    jsonReader.m25586a(a);
                }
            }

            public void toJson(C5983k c5983k, @Nullable T t) throws IOException {
                boolean i = c5983k.m25654i();
                c5983k.m25646b(true);
                try {
                    this.toJson(c5983k, (Object) t);
                } finally {
                    c5983k.m25646b(i);
                }
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this);
                stringBuilder.append(".lenient()");
                return stringBuilder.toString();
            }
        };
    }

    public final JsonAdapter<T> failOnUnknown() {
        return new JsonAdapter<T>(this) {
            /* renamed from: b */
            final /* synthetic */ JsonAdapter f25944b;

            @Nullable
            public T fromJson(JsonReader jsonReader) throws IOException {
                boolean b = jsonReader.m25590b();
                jsonReader.m25589b(true);
                try {
                    T fromJson = this.fromJson(jsonReader);
                    return fromJson;
                } finally {
                    jsonReader.m25589b(b);
                }
            }

            public void toJson(C5983k c5983k, @Nullable T t) throws IOException {
                this.toJson(c5983k, (Object) t);
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this);
                stringBuilder.append(".failOnUnknown()");
                return stringBuilder.toString();
            }
        };
    }

    public JsonAdapter<T> indent(final String str) {
        if (str != null) {
            return new JsonAdapter<T>(this) {
                /* renamed from: c */
                final /* synthetic */ JsonAdapter f25947c;

                @Nullable
                public T fromJson(JsonReader jsonReader) throws IOException {
                    return this.fromJson(jsonReader);
                }

                public void toJson(C5983k c5983k, @Nullable T t) throws IOException {
                    String h = c5983k.m25653h();
                    c5983k.mo6469a(str);
                    try {
                        this.toJson(c5983k, (Object) t);
                    } finally {
                        c5983k.mo6469a(h);
                    }
                }

                public String toString() {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this);
                    stringBuilder.append(".indent(\"");
                    stringBuilder.append(str);
                    stringBuilder.append("\")");
                    return stringBuilder.toString();
                }
            };
        }
        throw new NullPointerException("indent == null");
    }
}
