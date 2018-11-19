package com.google.android.m4b.maps.bo;

import java.io.DataInput;
import java.util.ArrayList;

public final class au {
    /* renamed from: a */
    private final ArrayList<at> f17686a = new ArrayList();

    /* renamed from: a */
    public static au m21572a(DataInput dataInput, aw awVar) {
        au auVar = new au();
        int a = bl.m21698a(dataInput);
        for (int i = 0; i < a; i++) {
            auVar.f17686a.add(new at(dataInput.readUTF().intern(), awVar.m21579a(bl.m21698a(dataInput))));
        }
        return auVar;
    }

    /* renamed from: a */
    public final at m21573a(int i) {
        if (i >= this.f17686a.size()) {
            return 0;
        }
        return (at) this.f17686a.get(i);
    }
}
