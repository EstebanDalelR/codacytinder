package com.google.android.m4b.maps.ct;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.m4b.maps.ct.k */
public abstract class C8209k<MessageType extends C8209k<MessageType>> extends C8083b implements Serializable {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private C5292x f29352a = C5292x.m23466a();

    /* renamed from: com.google.android.m4b.maps.ct.k$a */
    static final class C5270a implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final String f19589a;
        /* renamed from: b */
        private final byte[] f19590b;

        C5270a(C7529s c7529s) {
            this.f19589a = c7529s.getClass().getName();
            this.f19590b = c7529s.mo7225f();
        }

        protected final Object readResolve() {
            try {
                C7529s c7529s = (C7529s) Class.forName(this.f19589a).getMethod("newMessage", new Class[0]).invoke(null, new Object[0]);
                byte[] bArr = this.f19590b;
                if (c7529s.m33202a(C5257e.m23281a(bArr, 0, bArr.length))) {
                    return c7529s;
                }
                throw new RuntimeException("Unable to understand proto buffer");
            } catch (Throwable e) {
                throw new RuntimeException("Unable to find proto buffer class", e);
            } catch (Throwable e2) {
                throw new RuntimeException("Unable to find newMessage method", e2);
            } catch (Throwable e22) {
                throw new RuntimeException("Unable to call newMessage method", e22);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Error calling newMessage", e3.getCause());
            }
        }
    }

    /* renamed from: c */
    public abstract MessageType m35013c();

    protected Object writeReplace() {
        return new C5270a(this);
    }
}
