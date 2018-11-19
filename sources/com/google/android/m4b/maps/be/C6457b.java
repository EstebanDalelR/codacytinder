package com.google.android.m4b.maps.be;

/* renamed from: com.google.android.m4b.maps.be.b */
public final class C6457b extends C4775a<byte[]> {
    /* renamed from: e */
    private static final C4777c<byte[]> f23972e = new C64561(100);

    /* renamed from: com.google.android.m4b.maps.be.b$a */
    public interface C4776a {
        /* renamed from: a */
        void mo5266a(byte[] bArr, int i);
    }

    /* renamed from: com.google.android.m4b.maps.be.b$1 */
    class C64561 extends C4777c<byte[]> {
        C64561(int i) {
            super(100);
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo5015a() {
            return new byte[4106];
        }
    }

    public C6457b(int i) {
        super(i, 12, f23972e);
    }

    /* renamed from: a */
    public final void m28314a(C4776a c4776a) {
        for (int i = 0; i < this.b; i++) {
            c4776a.mo5266a((byte[]) this.a.get(i), 4096);
        }
        if (this.b != this.a.size()) {
            c4776a.mo5266a((byte[]) this.c, this.d);
        }
    }
}
