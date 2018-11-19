package com.google.android.m4b.maps.ct;

import com.google.android.m4b.maps.ct.C5265i.C5264a;
import com.google.android.m4b.maps.ct.C5273l.C5271a;
import com.google.android.m4b.maps.ct.C5273l.C5272b;
import com.google.android.m4b.maps.ct.C5292x.C5291a;
import com.google.android.m4b.maps.ct.C5299z.C5296a;
import com.google.android.m4b.maps.ct.C5299z.C5297b;
import com.google.android.m4b.maps.ct.C6656q.C6655a;
import com.google.android.m4b.maps.ct.C7527a.C7526a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.m4b.maps.ct.j */
public abstract class C8085j<MessageType extends C8085j<MessageType, BuilderType>, BuilderType extends C8084a<MessageType, BuilderType>> extends C7527a implements Serializable {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    protected C5292x f29039a = C5292x.m23466a();
    /* renamed from: b */
    protected int f29040b = -1;

    /* renamed from: com.google.android.m4b.maps.ct.j$h */
    public enum C5268h {
        IS_INITIALIZED,
        PARSE_PARTIAL_FROM,
        MERGE_FROM,
        MAKE_IMMUTABLE,
        NEW_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: com.google.android.m4b.maps.ct.j$i */
    static final class C5269i implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final String f19587a;
        /* renamed from: b */
        private final byte[] f19588b;

        C5269i(C6656q c6656q) {
            this.f19587a = c6656q.getClass().getName();
            this.f19588b = c6656q.mo7225f();
        }

        protected final Object readResolve() {
            String str;
            String valueOf;
            try {
                Field declaredField = Class.forName(this.f19587a).getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((C6656q) declaredField.get(null)).mo7581m().mo7222a(this.f19588b).mo7576f();
            } catch (Throwable e) {
                str = "Unable to find proto buffer class: ";
                valueOf = String.valueOf(this.f19587a);
                throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            } catch (Throwable e2) {
                str = "Unable to find DEFAULT_INSTANCE in ";
                valueOf = String.valueOf(this.f19587a);
                throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e2);
            } catch (Throwable e22) {
                str = "Unable to call DEFAULT_INSTANCE in ";
                valueOf = String.valueOf(this.f19587a);
                throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e22);
            } catch (Throwable e222) {
                throw new RuntimeException("Unable to call parsePartialFrom", e222);
            } catch (Throwable e2222) {
                throw new RuntimeException("Unable to understand proto buffer", e2222);
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.j$e */
    public interface C6649e<MessageType extends C8208d<MessageType, BuilderType>, BuilderType extends C8207c<MessageType, BuilderType>> extends C5278r {
    }

    /* renamed from: com.google.android.m4b.maps.ct.j$f */
    static final class C6650f implements C5264a<C6650f> {
        /* renamed from: a */
        final C5272b<?> f24929a;
        /* renamed from: b */
        final int f24930b;
        /* renamed from: c */
        final C5296a f24931c;
        /* renamed from: d */
        final boolean f24932d;
        /* renamed from: e */
        private boolean f24933e;

        public final /* synthetic */ int compareTo(Object obj) {
            return this.f24930b - ((C6650f) obj).f24930b;
        }

        /* renamed from: a */
        public final int mo5370a() {
            return this.f24930b;
        }

        /* renamed from: b */
        public final C5296a mo5373b() {
            return this.f24931c;
        }

        /* renamed from: c */
        public final C5297b mo5374c() {
            return this.f24931c.m23478a();
        }

        /* renamed from: d */
        public final boolean mo5375d() {
            return this.f24932d;
        }

        /* renamed from: e */
        public final boolean mo5376e() {
            return this.f24933e;
        }

        /* renamed from: a */
        public final C6655a mo5371a(C6655a c6655a, C6656q c6656q) {
            return ((C8084a) c6655a).m34388a((C8085j) c6656q);
        }

        /* renamed from: a */
        public final C7529s mo5372a(C7529s c7529s, C7529s c7529s2) {
            return ((C8209k) c7529s).m35013c();
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.j$g */
    public static class C6651g<ContainingType extends C6656q, Type> extends C5260g<ContainingType, Type> {
        /* renamed from: a */
        final C6656q f24934a;
        /* renamed from: b */
        final C6650f f24935b;

        /* renamed from: a */
        final Object m29682a(Object obj) {
            return this.f24935b.f24931c.m23478a() == C5297b.ENUM ? Integer.valueOf(((C5271a) obj).m23406a()) : obj;
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.j$b */
    public static class C7528b<T extends C8085j<T, ?>> extends C6648c<T> {
        /* renamed from: a */
        private T f28126a;

        public C7528b(T t) {
            this.f28126a = t;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo7226a(C5257e c5257e, C5262h c5262h) {
            return C8085j.m34397a(this.f28126a, c5257e, c5262h);
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.j$a */
    public static abstract class C8084a<MessageType extends C8085j<MessageType, BuilderType>, BuilderType extends C8084a<MessageType, BuilderType>> extends C7526a<BuilderType> {
        /* renamed from: a */
        protected MessageType f29036a;
        /* renamed from: b */
        protected boolean f29037b = null;
        /* renamed from: c */
        private final MessageType f29038c;

        /* renamed from: a */
        public /* synthetic */ C7526a mo7573a() {
            return mo7641c();
        }

        /* renamed from: a */
        public final /* synthetic */ C7526a mo7574a(C5257e c5257e, C5262h c5262h) {
            return m34385c(c5257e, c5262h);
        }

        /* renamed from: b */
        public final /* synthetic */ C6655a mo7223b(C5257e c5257e, C5262h c5262h) {
            return m34385c(c5257e, c5262h);
        }

        public /* synthetic */ Object clone() {
            return mo7641c();
        }

        /* renamed from: f */
        public /* synthetic */ C6656q mo7576f() {
            return mo7642d();
        }

        /* renamed from: g */
        public final /* synthetic */ C6656q mo7577g() {
            return m34393e();
        }

        protected C8084a(MessageType messageType) {
            this.f29038c = messageType;
            this.f29036a = (C8085j) messageType.m34400a(C5268h.NEW_INSTANCE);
        }

        /* renamed from: b */
        protected void mo7640b() {
            if (this.f29037b) {
                C8085j c8085j = (C8085j) this.f29036a.m34400a(C5268h.NEW_INSTANCE);
                c8085j.m34401a(C5268h.MERGE_FROM, this.f29036a);
                this.f29036a = c8085j;
                this.f29037b = false;
            }
        }

        /* renamed from: j */
        public final boolean mo7578j() {
            return C8085j.m34399a(this.f29036a, false);
        }

        /* renamed from: d */
        public MessageType mo7642d() {
            this.f29036a.m34400a(C5268h.MAKE_IMMUTABLE);
            this.f29037b = true;
            return this.f29036a;
        }

        /* renamed from: e */
        public final MessageType m34393e() {
            MessageType d = mo7642d();
            if (d.mo7578j()) {
                return d;
            }
            throw new C5290w();
        }

        /* renamed from: a */
        public final BuilderType m34388a(MessageType messageType) {
            mo7640b();
            this.f29036a.m34401a(C5268h.MERGE_FROM, (Object) messageType);
            return this;
        }

        /* renamed from: c */
        public BuilderType mo7641c() {
            BuilderType i = this.f29038c.m34406i();
            i.m34388a(mo7642d());
            return i;
        }

        /* renamed from: c */
        private BuilderType m34385c(C5257e c5257e, C5262h c5262h) {
            C8085j c8085j;
            C8085j c8085j2 = null;
            try {
                C8085j c8085j3 = (C8085j) this.f29038c.mo7579g().mo7226a(c5257e, c5262h);
                if (c8085j3 != null) {
                    m34388a(c8085j3);
                }
                return this;
            } catch (C5257e c5257e2) {
                c8085j = (C8085j) c5257e2.m23419a();
                throw c5257e2;
            } catch (Throwable th) {
                c5257e2 = th;
                c8085j2 = c8085j;
            }
            if (c8085j2 != null) {
                m34388a(c8085j2);
            }
            throw c5257e2;
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.j$c */
    public static abstract class C8207c<MessageType extends C8208d<MessageType, BuilderType>, BuilderType extends C8207c<MessageType, BuilderType>> extends C8084a<MessageType, BuilderType> implements C6649e<MessageType, BuilderType> {
        /* renamed from: d */
        public final /* synthetic */ C8085j mo7642d() {
            return m34998h();
        }

        /* renamed from: f */
        public final /* synthetic */ C6656q mo7576f() {
            return m34998h();
        }

        protected C8207c(MessageType messageType) {
            super(messageType);
        }

        /* renamed from: b */
        protected final void mo7640b() {
            if (this.b) {
                super.mo7640b();
                ((C8208d) this.a).f29351c = ((C8208d) this.a).f29351c.m23400d();
            }
        }

        /* renamed from: h */
        private MessageType m34998h() {
            if (this.b) {
                return (C8208d) this.a;
            }
            ((C8208d) this.a).f29351c.m23397b();
            return (C8208d) super.mo7642d();
        }

        /* renamed from: c */
        public final /* synthetic */ C8084a mo7641c() {
            return (C8207c) super.mo7641c();
        }

        /* renamed from: a */
        public final /* synthetic */ C7526a mo7573a() {
            return (C8207c) super.mo7641c();
        }

        public /* synthetic */ Object clone() {
            return (C8207c) super.mo7641c();
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.j$d */
    public static abstract class C8208d<MessageType extends C8208d<MessageType, BuilderType>, BuilderType extends C8207c<MessageType, BuilderType>> extends C8085j<MessageType, BuilderType> implements C6649e<MessageType, BuilderType> {
        /* renamed from: c */
        protected C5265i<C6650f> f29351c = C5265i.m23382a();

        /* renamed from: com.google.android.m4b.maps.ct.j$d$a */
        public class C5267a {
            /* renamed from: a */
            private final Iterator<Entry<C6650f, Object>> f19574a;
            /* renamed from: b */
            private Entry<C6650f, Object> f19575b;
            /* renamed from: c */
            private final boolean f19576c;
            /* renamed from: d */
            private /* synthetic */ C8208d f19577d;

            private C5267a(C8208d c8208d, boolean z) {
                this.f19577d = c8208d;
                this.f19574a = this.f19577d.f29351c.m23401e();
                if (this.f19574a.hasNext() != null) {
                    this.f19575b = (Entry) this.f19574a.next();
                }
                this.f19576c = z;
            }

            /* renamed from: a */
            public final void m23405a(int i, C5259f c5259f) {
                while (this.f19575b != null && ((C6650f) this.f19575b.getKey()).f24930b < i) {
                    C5264a c5264a = (C6650f) this.f19575b.getKey();
                    if (this.f19576c && c5264a.f24931c.m23478a() == C5297b.MESSAGE && !c5264a.f24932d) {
                        int i2 = c5264a.f24930b;
                        C6656q c6656q = (C6656q) this.f19575b.getValue();
                        c5259f.m23360b(1, 3);
                        c5259f.m23360b(2, 0);
                        c5259f.m23362c(i2);
                        c5259f.m23360b(3, 2);
                        c5259f.m23357a(c6656q);
                        c5259f.m23360b(1, 4);
                    } else {
                        C5265i.m23387a(c5264a, this.f19575b.getValue(), c5259f);
                    }
                    if (this.f19574a.hasNext()) {
                        this.f19575b = (Entry) this.f19574a.next();
                    } else {
                        this.f19575b = null;
                    }
                }
            }
        }

        /* renamed from: l */
        public final /* synthetic */ C6655a mo7580l() {
            return super.m34408k();
        }

        /* renamed from: m */
        public final /* synthetic */ C6655a mo7581m() {
            return super.m34406i();
        }

        /* renamed from: a */
        protected final void m35005a(MessageType messageType) {
            if (this.f29351c.m23399c()) {
                this.f29351c = this.f29351c.m23400d();
            }
            this.f29351c.m23396a(messageType.f29351c);
        }

        /* renamed from: b */
        protected final boolean m35006b() {
            return this.f29351c.m23402f();
        }

        /* renamed from: a */
        protected static void m35004a(C5265i<C6650f> c5265i) {
            c5265i.m23397b();
        }

        /* renamed from: c */
        protected final C5267a m35007c() {
            return new C5267a(false);
        }

        /* renamed from: d */
        protected final C5267a m35008d() {
            return new C5267a(true);
        }

        /* renamed from: n */
        protected final int m35011n() {
            return this.f29351c.m23403g();
        }

        /* renamed from: o */
        protected final int m35012o() {
            return this.f29351c.m23404h();
        }
    }

    /* renamed from: a */
    protected abstract Object mo7635a(C5268h c5268h, Object obj, Object obj2);

    /* renamed from: l */
    public /* synthetic */ C6655a mo7580l() {
        return m34408k();
    }

    /* renamed from: m */
    public /* synthetic */ C6655a mo7581m() {
        return m34406i();
    }

    /* renamed from: g */
    public final C5279t<MessageType> mo7579g() {
        return (C5279t) mo7635a(C5268h.GET_PARSER, null, null);
    }

    /* renamed from: h */
    public final MessageType m34405h() {
        return (C8085j) mo7635a(C5268h.GET_DEFAULT_INSTANCE, null, null);
    }

    /* renamed from: i */
    public final BuilderType m34406i() {
        return (C8084a) mo7635a(C5268h.NEW_BUILDER, null, null);
    }

    /* renamed from: j */
    public final boolean mo7578j() {
        return mo7635a(C5268h.IS_INITIALIZED, Boolean.TRUE, null) != null;
    }

    /* renamed from: k */
    public final BuilderType m34408k() {
        C8084a c8084a = (C8084a) mo7635a(C5268h.NEW_BUILDER, null, null);
        c8084a.m34388a(this);
        return c8084a;
    }

    /* renamed from: a */
    protected final Object m34401a(C5268h c5268h, Object obj) {
        return mo7635a(c5268h, obj, null);
    }

    /* renamed from: a */
    protected final Object m34400a(C5268h c5268h) {
        return mo7635a(c5268h, null, null);
    }

    /* renamed from: a */
    protected final void m34403a(C5292x c5292x) {
        this.f29039a = C5292x.m23467a(this.f29039a, c5292x);
    }

    /* renamed from: a */
    protected static <MessageType extends C6656q> boolean m34398a(C5265i<C6650f> c5265i, MessageType messageType, C5257e c5257e, C5291a c5291a, C5262h c5262h, int i) {
        Object obj;
        Object obj2;
        C6655a c6655a;
        C6656q c6656q;
        int n;
        int a = C5299z.m23482a(i);
        int b = C5299z.m23485b(i);
        messageType = c5262h.m23372a(messageType, b);
        if (messageType != null) {
            if (a == C5265i.m23381a(messageType.f24935b.f24931c, false)) {
                obj = null;
                obj2 = null;
                if (obj == null) {
                    return c5291a.m23465a(i, c5257e);
                }
                if (obj2 != null) {
                    c5291a = c5257e.m23296b(c5257e.m23314s());
                    if (messageType.f24935b.f24931c == C5296a.ENUM) {
                        while (c5257e.m23315t() > null) {
                            c5257e.m23309n();
                            c5262h = messageType.f24935b.f24929a.m23407a();
                            if (c5262h != null) {
                                return true;
                            }
                            c5265i.m23398b(messageType.f24935b, messageType.m29682a(c5262h));
                        }
                    } else {
                        while (c5257e.m23315t() > null) {
                            c5265i.m23398b(messageType.f24935b, C5265i.m23383a(c5257e, messageType.f24935b.f24931c, false));
                        }
                    }
                    c5257e.m23298c(c5291a);
                } else {
                    switch (messageType.f24935b.f24931c.m23478a()) {
                        case MESSAGE:
                            c6655a = null;
                            if (messageType.f24935b.f24932d == 0) {
                                c6656q = (C6656q) c5265i.m23394a(messageType.f24935b);
                                if (c6656q != null) {
                                    c6655a = c6656q.mo7580l();
                                }
                            }
                            if (c6655a == null) {
                                c6655a = messageType.f24934a.mo7581m();
                            }
                            if (messageType.f24935b.f24931c == C5296a.GROUP) {
                                c5257e.m23293a(messageType.f24935b.f24930b, c6655a, c5262h);
                            } else {
                                c5257e.m23294a(c6655a, c5262h);
                            }
                            c5262h = c6655a.mo7577g();
                            break;
                        case ENUM:
                            n = c5257e.m23309n();
                            c5262h = messageType.f24935b.f24929a.m23407a();
                            if (c5262h == null) {
                                c5291a.m23463a(b, n);
                                return true;
                            }
                            break;
                        default:
                            c5262h = C5265i.m23383a(c5257e, messageType.f24935b.f24931c, false);
                            break;
                    }
                    if (messageType.f24935b.f24932d != null) {
                        c5265i.m23398b(messageType.f24935b, messageType.m29682a(c5262h));
                    } else {
                        c5265i.m23395a(messageType.f24935b, messageType.m29682a(c5262h));
                    }
                }
                return true;
            } else if (messageType.f24935b.f24932d && messageType.f24935b.f24931c.mo5390c() && a == C5265i.m23381a(messageType.f24935b.f24931c, true)) {
                obj = null;
                obj2 = 1;
                if (obj == null) {
                    return c5291a.m23465a(i, c5257e);
                }
                if (obj2 != null) {
                    switch (messageType.f24935b.f24931c.m23478a()) {
                        case MESSAGE:
                            c6655a = null;
                            if (messageType.f24935b.f24932d == 0) {
                                c6656q = (C6656q) c5265i.m23394a(messageType.f24935b);
                                if (c6656q != null) {
                                    c6655a = c6656q.mo7580l();
                                }
                            }
                            if (c6655a == null) {
                                c6655a = messageType.f24934a.mo7581m();
                            }
                            if (messageType.f24935b.f24931c == C5296a.GROUP) {
                                c5257e.m23294a(c6655a, c5262h);
                            } else {
                                c5257e.m23293a(messageType.f24935b.f24930b, c6655a, c5262h);
                            }
                            c5262h = c6655a.mo7577g();
                            break;
                        case ENUM:
                            n = c5257e.m23309n();
                            c5262h = messageType.f24935b.f24929a.m23407a();
                            if (c5262h == null) {
                                c5291a.m23463a(b, n);
                                return true;
                            }
                            break;
                        default:
                            c5262h = C5265i.m23383a(c5257e, messageType.f24935b.f24931c, false);
                            break;
                    }
                    if (messageType.f24935b.f24932d != null) {
                        c5265i.m23395a(messageType.f24935b, messageType.m29682a(c5262h));
                    } else {
                        c5265i.m23398b(messageType.f24935b, messageType.m29682a(c5262h));
                    }
                } else {
                    c5291a = c5257e.m23296b(c5257e.m23314s());
                    if (messageType.f24935b.f24931c == C5296a.ENUM) {
                        while (c5257e.m23315t() > null) {
                            c5265i.m23398b(messageType.f24935b, C5265i.m23383a(c5257e, messageType.f24935b.f24931c, false));
                        }
                    } else {
                        while (c5257e.m23315t() > null) {
                            c5257e.m23309n();
                            c5262h = messageType.f24935b.f24929a.m23407a();
                            if (c5262h != null) {
                                return true;
                            }
                            c5265i.m23398b(messageType.f24935b, messageType.m29682a(c5262h));
                        }
                    }
                    c5257e.m23298c(c5291a);
                }
                return true;
            }
        }
        obj = 1;
        obj2 = null;
        if (obj == null) {
            return c5291a.m23465a(i, c5257e);
        }
        if (obj2 != null) {
            c5291a = c5257e.m23296b(c5257e.m23314s());
            if (messageType.f24935b.f24931c == C5296a.ENUM) {
                while (c5257e.m23315t() > null) {
                    c5257e.m23309n();
                    c5262h = messageType.f24935b.f24929a.m23407a();
                    if (c5262h != null) {
                        return true;
                    }
                    c5265i.m23398b(messageType.f24935b, messageType.m29682a(c5262h));
                }
            } else {
                while (c5257e.m23315t() > null) {
                    c5265i.m23398b(messageType.f24935b, C5265i.m23383a(c5257e, messageType.f24935b.f24931c, false));
                }
            }
            c5257e.m23298c(c5291a);
        } else {
            switch (messageType.f24935b.f24931c.m23478a()) {
                case MESSAGE:
                    c6655a = null;
                    if (messageType.f24935b.f24932d == 0) {
                        c6656q = (C6656q) c5265i.m23394a(messageType.f24935b);
                        if (c6656q != null) {
                            c6655a = c6656q.mo7580l();
                        }
                    }
                    if (c6655a == null) {
                        c6655a = messageType.f24934a.mo7581m();
                    }
                    if (messageType.f24935b.f24931c == C5296a.GROUP) {
                        c5257e.m23293a(messageType.f24935b.f24930b, c6655a, c5262h);
                    } else {
                        c5257e.m23294a(c6655a, c5262h);
                    }
                    c5262h = c6655a.mo7577g();
                    break;
                case ENUM:
                    n = c5257e.m23309n();
                    c5262h = messageType.f24935b.f24929a.m23407a();
                    if (c5262h == null) {
                        c5291a.m23463a(b, n);
                        return true;
                    }
                    break;
                default:
                    c5262h = C5265i.m23383a(c5257e, messageType.f24935b.f24931c, false);
                    break;
            }
            if (messageType.f24935b.f24932d != null) {
                c5265i.m23398b(messageType.f24935b, messageType.m29682a(c5262h));
            } else {
                c5265i.m23395a(messageType.f24935b, messageType.m29682a(c5262h));
            }
        }
        return true;
    }

    protected Object writeReplace() {
        return new C5269i(this);
    }

    /* renamed from: a */
    protected static final <T extends C8085j<T, ?>> boolean m34399a(T t, boolean z) {
        return t.mo7635a(C5268h.IS_INITIALIZED, Boolean.valueOf(false), null) != null;
    }

    /* renamed from: a */
    static <T extends C8085j<T, ?>> T m34397a(T t, C5257e c5257e, C5262h c5262h) {
        try {
            return (C8085j) t.mo7635a(C5268h.PARSE_PARTIAL_FROM, (Object) c5257e, (Object) c5262h);
        } catch (T t2) {
            if ((t2.getCause() instanceof C5274m) != null) {
                throw ((C5274m) t2.getCause());
            }
            throw t2;
        }
    }
}
