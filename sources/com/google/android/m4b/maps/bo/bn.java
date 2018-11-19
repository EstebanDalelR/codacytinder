package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ax.C4699a.C6405b;
import java.io.DataInput;

public class bn {
    /* renamed from: a */
    protected final C4699a f17788a;
    /* renamed from: b */
    protected final C4848k f17789b;
    /* renamed from: c */
    protected final int f17790c;
    /* renamed from: d */
    protected final int f17791d;

    /* renamed from: com.google.android.m4b.maps.bo.bn$a */
    public static class C6511a extends bn {
        public C6511a(C4848k c4848k, int i, int i2) {
            super(null, c4848k, i | 1, i2);
        }

        /* renamed from: a */
        public final C4848k m28645a() {
            return this.b;
        }

        /* renamed from: b */
        public final boolean m28646b() {
            return ac.m21434a(this.c, 2);
        }

        /* renamed from: c */
        public final int m28647c() {
            return this.d;
        }

        /* renamed from: d */
        public final boolean m28648d() {
            return ac.m21434a(this.c, 4);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bn$b */
    public static class C6512b extends bn {
        /* renamed from: e */
        private int f24133e;

        public C6512b(int i, C4848k c4848k) {
            super(null, c4848k, 0, 0);
            this.f24133e = i;
        }

        /* renamed from: a */
        public final C4848k m28649a() {
            return this.b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bn$c */
    public static class C6513c extends bn {
        public C6513c(C4699a c4699a) {
            super(c4699a, null, c4699a instanceof C6405b ? 2 : 0, -1);
        }

        /* renamed from: a */
        public final C4699a m28650a() {
            return this.a;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bn$d */
    public static class C6514d extends bn {
        /* renamed from: e */
        private int f24134e;

        public C6514d(int i) {
            super(null, null, 0, 0);
            this.f24134e = i;
        }
    }

    protected bn(C4699a c4699a, C4848k c4848k, int i, int i2) {
        this.f17788a = c4699a;
        this.f17789b = c4848k;
        this.f17790c = i;
        this.f17791d = i2;
    }

    /* renamed from: a */
    public static bn m21713a(DataInput dataInput, bc bcVar) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        int a;
        if (bcVar.m21629a() == 11) {
            a = bl.m21698a(dataInput);
            if (ac.m21434a(readUnsignedByte, 1)) {
                return new C6512b(a, bo.m32231a(dataInput, bcVar));
            }
            return new C6514d(a);
        }
        a = -1;
        if (ac.m21434a(readUnsignedByte, 1)) {
            bcVar = bo.m32231a(dataInput, bcVar);
            if (ac.m21434a(readUnsignedByte, 2)) {
                a = bl.m21698a(dataInput);
            }
            return new C6511a(bcVar, readUnsignedByte, a);
        }
        if (ac.m21434a(readUnsignedByte, 2) != null) {
            dataInput = C4699a.m20897b(dataInput);
        } else {
            dataInput = C4699a.m20894a(dataInput);
        }
        return new C6513c(dataInput);
    }
}
