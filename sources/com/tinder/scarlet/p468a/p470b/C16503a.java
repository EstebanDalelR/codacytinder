package com.tinder.scarlet.p468a.p470b;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.tinder.api.ManagerWebServices;
import com.tinder.scarlet.C14789c;
import com.tinder.scarlet.C14789c.C16513a;
import com.tinder.scarlet.C14789c.C16514b;
import com.tinder.scarlet.MessageAdapter;
import com.tinder.scarlet.MessageAdapter.Factory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0010B\u001f\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/scarlet/messageadapter/protobuf/ProtobufMessageAdapter;", "T", "Lcom/google/protobuf/MessageLite;", "Lcom/tinder/scarlet/MessageAdapter;", "parser", "Lcom/google/protobuf/Parser;", "registry", "Lcom/google/protobuf/ExtensionRegistryLite;", "(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)V", "fromMessage", "message", "Lcom/tinder/scarlet/Message;", "(Lcom/tinder/scarlet/Message;)Lcom/google/protobuf/MessageLite;", "toMessage", "data", "(Lcom/google/protobuf/MessageLite;)Lcom/tinder/scarlet/Message;", "Factory", "scarlet-message-adapter-protobuf"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.a.b.a */
public final class C16503a<T extends MessageLite> implements MessageAdapter<T> {
    /* renamed from: a */
    private final Parser<T> f51176a;
    /* renamed from: b */
    private final ExtensionRegistryLite f51177b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0002\u0010\fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/scarlet/messageadapter/protobuf/ProtobufMessageAdapter$Factory;", "Lcom/tinder/scarlet/MessageAdapter$Factory;", "registry", "Lcom/google/protobuf/ExtensionRegistryLite;", "(Lcom/google/protobuf/ExtensionRegistryLite;)V", "create", "Lcom/tinder/scarlet/MessageAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lcom/tinder/scarlet/MessageAdapter;", "scarlet-message-adapter-protobuf"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.a.b.a$a */
    public static final class C16502a implements Factory {
        /* renamed from: a */
        private final ExtensionRegistryLite f51175a;

        public C16502a() {
            this(null, 1, null);
        }

        public C16502a(@Nullable ExtensionRegistryLite extensionRegistryLite) {
            this.f51175a = extensionRegistryLite;
        }

        public /* synthetic */ C16502a(ExtensionRegistryLite extensionRegistryLite, int i, C15823e c15823e) {
            if ((i & 1) != 0) {
                extensionRegistryLite = null;
            }
            this(extensionRegistryLite);
        }

        @org.jetbrains.annotations.NotNull
        public com.tinder.scarlet.MessageAdapter<?> create(@org.jetbrains.annotations.NotNull java.lang.reflect.Type r4, @org.jetbrains.annotations.NotNull java.lang.annotation.Annotation[] r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            r0 = "type";
            kotlin.jvm.internal.C2668g.b(r4, r0);
            r0 = "annotations";
            kotlin.jvm.internal.C2668g.b(r5, r0);
            r5 = r4 instanceof java.lang.Class;
            if (r5 != 0) goto L_0x001c;
        L_0x000e:
            r4 = "Failed requirement.";
            r5 = new java.lang.IllegalArgumentException;
            r4 = r4.toString();
            r5.<init>(r4);
            r5 = (java.lang.Throwable) r5;
            throw r5;
        L_0x001c:
            r4 = (java.lang.Class) r4;
            r5 = com.google.protobuf.MessageLite.class;
            r5 = r5.isAssignableFrom(r4);
            if (r5 != 0) goto L_0x0034;
        L_0x0026:
            r4 = "Failed requirement.";
            r5 = new java.lang.IllegalArgumentException;
            r4 = r4.toString();
            r5.<init>(r4);
            r5 = (java.lang.Throwable) r5;
            throw r5;
        L_0x0034:
            r5 = 0;
            r0 = "parser";	 Catch:{ InvocationTargetException -> 0x0110, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0051 }
            r1 = 0;	 Catch:{ InvocationTargetException -> 0x0110, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0051 }
            r2 = new java.lang.Class[r1];	 Catch:{ InvocationTargetException -> 0x0110, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0051 }
            r0 = r4.getDeclaredMethod(r0, r2);	 Catch:{ InvocationTargetException -> 0x0110, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0051 }
            r1 = new java.lang.Object[r1];	 Catch:{ InvocationTargetException -> 0x0110, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0051 }
            r0 = r0.invoke(r5, r1);	 Catch:{ InvocationTargetException -> 0x0110, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0051 }
            if (r0 != 0) goto L_0x004e;	 Catch:{ InvocationTargetException -> 0x0110, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0051 }
        L_0x0046:
            r0 = new kotlin.TypeCastException;	 Catch:{ InvocationTargetException -> 0x0110, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0051 }
            r1 = "null cannot be cast to non-null type com.google.protobuf.Parser<com.google.protobuf.MessageLite>";	 Catch:{ InvocationTargetException -> 0x0110, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0051 }
            r0.<init>(r1);	 Catch:{ InvocationTargetException -> 0x0110, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0051 }
            throw r0;	 Catch:{ InvocationTargetException -> 0x0110, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0051 }
        L_0x004e:
            r0 = (com.google.protobuf.Parser) r0;	 Catch:{ InvocationTargetException -> 0x0110, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0051 }
            goto L_0x00c2;
        L_0x0051:
            r0 = "PARSER";	 Catch:{ NoSuchFieldException -> 0x008a, IllegalAccessException -> 0x0068 }
            r0 = r4.getDeclaredField(r0);	 Catch:{ NoSuchFieldException -> 0x008a, IllegalAccessException -> 0x0068 }
            r0 = r0.get(r5);	 Catch:{ NoSuchFieldException -> 0x008a, IllegalAccessException -> 0x0068 }
            if (r0 != 0) goto L_0x0065;	 Catch:{ NoSuchFieldException -> 0x008a, IllegalAccessException -> 0x0068 }
        L_0x005d:
            r5 = new kotlin.TypeCastException;	 Catch:{ NoSuchFieldException -> 0x008a, IllegalAccessException -> 0x0068 }
            r0 = "null cannot be cast to non-null type com.google.protobuf.Parser<com.google.protobuf.MessageLite>";	 Catch:{ NoSuchFieldException -> 0x008a, IllegalAccessException -> 0x0068 }
            r5.<init>(r0);	 Catch:{ NoSuchFieldException -> 0x008a, IllegalAccessException -> 0x0068 }
            throw r5;	 Catch:{ NoSuchFieldException -> 0x008a, IllegalAccessException -> 0x0068 }
        L_0x0065:
            r0 = (com.google.protobuf.Parser) r0;	 Catch:{ NoSuchFieldException -> 0x008a, IllegalAccessException -> 0x0068 }
            goto L_0x00c2;
        L_0x0068:
            r5 = new java.lang.IllegalArgumentException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "Found a protobuf message but ";
            r0.append(r1);
            r4 = r4.getName();
            r0.append(r4);
            r4 = " had no parser() method or PARSER field.";
            r0.append(r4);
            r4 = r0.toString();
            r5.<init>(r4);
            r5 = (java.lang.Throwable) r5;
            throw r5;
        L_0x008a:
            r5 = new java.lang.IllegalArgumentException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "Found a protobuf message but ";
            r0.append(r1);
            r4 = r4.getName();
            r0.append(r4);
            r4 = " had no parser() method or PARSER field.";
            r0.append(r4);
            r4 = r0.toString();
            r5.<init>(r4);
            r5 = (java.lang.Throwable) r5;
            throw r5;
        L_0x00ac:
            r0 = "PARSER";	 Catch:{ NoSuchFieldException -> 0x00ee, IllegalAccessException -> 0x00cc }
            r0 = r4.getDeclaredField(r0);	 Catch:{ NoSuchFieldException -> 0x00ee, IllegalAccessException -> 0x00cc }
            r0 = r0.get(r5);	 Catch:{ NoSuchFieldException -> 0x00ee, IllegalAccessException -> 0x00cc }
            if (r0 != 0) goto L_0x00c0;	 Catch:{ NoSuchFieldException -> 0x00ee, IllegalAccessException -> 0x00cc }
        L_0x00b8:
            r5 = new kotlin.TypeCastException;	 Catch:{ NoSuchFieldException -> 0x00ee, IllegalAccessException -> 0x00cc }
            r0 = "null cannot be cast to non-null type com.google.protobuf.Parser<com.google.protobuf.MessageLite>";	 Catch:{ NoSuchFieldException -> 0x00ee, IllegalAccessException -> 0x00cc }
            r5.<init>(r0);	 Catch:{ NoSuchFieldException -> 0x00ee, IllegalAccessException -> 0x00cc }
            throw r5;	 Catch:{ NoSuchFieldException -> 0x00ee, IllegalAccessException -> 0x00cc }
        L_0x00c0:
            r0 = (com.google.protobuf.Parser) r0;	 Catch:{ NoSuchFieldException -> 0x00ee, IllegalAccessException -> 0x00cc }
        L_0x00c2:
            r4 = new com.tinder.scarlet.a.b.a;
            r1 = r3.f51175a;
            r4.<init>(r0, r1);
            r4 = (com.tinder.scarlet.MessageAdapter) r4;
            return r4;
        L_0x00cc:
            r5 = new java.lang.IllegalArgumentException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "Found a protobuf message but ";
            r0.append(r1);
            r4 = r4.getName();
            r0.append(r4);
            r4 = " had no parser() method or PARSER field.";
            r0.append(r4);
            r4 = r0.toString();
            r5.<init>(r4);
            r5 = (java.lang.Throwable) r5;
            throw r5;
        L_0x00ee:
            r5 = new java.lang.IllegalArgumentException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "Found a protobuf message but ";
            r0.append(r1);
            r4 = r4.getName();
            r0.append(r4);
            r4 = " had no parser() method or PARSER field.";
            r0.append(r4);
            r4 = r0.toString();
            r5.<init>(r4);
            r5 = (java.lang.Throwable) r5;
            throw r5;
        L_0x0110:
            r4 = move-exception;
            r5 = new java.lang.RuntimeException;
            r4 = r4.getCause();
            r5.<init>(r4);
            r5 = (java.lang.Throwable) r5;
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.scarlet.a.b.a.a.create(java.lang.reflect.Type, java.lang.annotation.Annotation[]):com.tinder.scarlet.MessageAdapter<?>");
        }
    }

    private C16503a(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) {
        this.f51176a = parser;
        this.f51177b = extensionRegistryLite;
    }

    public /* synthetic */ Object fromMessage(C14789c c14789c) {
        return m61926a(c14789c);
    }

    public /* synthetic */ C14789c toMessage(Object obj) {
        return m61927a((MessageLite) obj);
    }

    @NotNull
    /* renamed from: a */
    public T m61926a(@NotNull C14789c c14789c) {
        C2668g.b(c14789c, "message");
        if (c14789c instanceof C16514b) {
            throw ((Throwable) new IllegalArgumentException("Text messages are not supported"));
        } else if (c14789c instanceof C16513a) {
            try {
                c14789c = this.f51176a.parseFrom(((C16513a) c14789c).m61932a(), this.f51177b);
                C2668g.a(c14789c, "parser.parseFrom(bytesValue, registry)");
                return (MessageLite) c14789c;
            } catch (C14789c c14789c2) {
                throw new RuntimeException((Throwable) c14789c2);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    /* renamed from: a */
    public C14789c m61927a(@NotNull T t) {
        C2668g.b(t, ManagerWebServices.FB_DATA);
        t = t.toByteArray();
        C2668g.a(t, "data.toByteArray()");
        return new C16513a(t);
    }
}
