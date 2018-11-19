package com.google.android.m4b.maps.bo;

import java.io.DataInput;

public final class av {
    /* renamed from: a */
    private final as f17687a;
    /* renamed from: b */
    private final String f17688b;
    /* renamed from: c */
    private final int f17689c;

    public av(as asVar, String str, int i) {
        this.f17687a = asVar;
        this.f17688b = str;
        this.f17689c = i;
    }

    /* renamed from: a */
    public static av m21574a(DataInput dataInput, bc bcVar) {
        as b;
        if (bcVar.m21629a() == 11) {
            dataInput = bl.m21698a(dataInput);
            bcVar = bcVar.m21631b(dataInput);
            if (bcVar != null) {
                b = bcVar.m21571b();
                bcVar = bcVar.m21570a();
            } else {
                b = as.m21553a();
                bcVar = "";
            }
        } else {
            b = bcVar.m21630a(bl.m21698a(dataInput));
            dataInput = bl.m21698a(dataInput);
            bcVar = bcVar.m21633c(dataInput);
        }
        return new av(b, bcVar, dataInput);
    }

    /* renamed from: a */
    public final as m21575a() {
        return this.f17687a;
    }

    /* renamed from: b */
    public final String m21576b() {
        return this.f17688b;
    }

    /* renamed from: c */
    public final int m21577c() {
        return this.f17689c;
    }
}
