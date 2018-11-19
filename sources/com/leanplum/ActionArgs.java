package com.leanplum;

import com.leanplum.p069a.C2586c;
import com.leanplum.p069a.ao;
import java.util.ArrayList;
import java.util.List;

public class ActionArgs {
    /* renamed from: a */
    private List<C2586c<?>> f7803a = new ArrayList();

    public <T> ActionArgs with(String str, T t) {
        if (str == null) {
            ao.m9516a("with - Invalid name parameter provided.");
            return this;
        }
        this.f7803a.add(C2586c.m9681a(str, (Object) t));
        return this;
    }

    public ActionArgs withColor(String str, int i) {
        if (str == null) {
            ao.m9516a("withColor - Invalid name parameter provided.");
            return this;
        }
        this.f7803a.add(C2586c.m9680a(str, i));
        return this;
    }

    public ActionArgs withFile(String str, String str2) {
        if (str == null) {
            ao.m9516a("withFile - Invalid name parameter provided.");
            return this;
        }
        this.f7803a.add(C2586c.m9683a(str, str2));
        return this;
    }

    public ActionArgs withAsset(String str, String str2) {
        if (str == null) {
            ao.m9516a("withAsset - Invalid name parameter provided.");
            return this;
        }
        this.f7803a.add(C2586c.m9684b(str, str2));
        return this;
    }

    public ActionArgs withAction(String str, String str2) {
        if (str == null) {
            ao.m9516a("withAction - Invalid name parameter provided.");
            return this;
        }
        this.f7803a.add(C2586c.m9685c(str, str2));
        return this;
    }

    /* renamed from: a */
    final List<C2586c<?>> m9341a() {
        return this.f7803a;
    }
}
