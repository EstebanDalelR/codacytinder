package com.leanplum.messagetemplates;

import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;

public class WebInterstitialOptions {
    /* renamed from: a */
    private String f21359a;
    /* renamed from: b */
    private String f21360b;
    /* renamed from: c */
    private boolean f21361c;

    protected WebInterstitialOptions(ActionContext actionContext) {
        this.f21359a = actionContext.stringNamed("URL");
        this.f21361c = actionContext.booleanNamed("Has dismiss button");
        this.f21360b = actionContext.stringNamed("Close URL");
    }

    public String getUrl() {
        return this.f21359a;
    }

    /* renamed from: a */
    private void m25233a(String str) {
        this.f21359a = str;
    }

    public boolean hasDismissButton() {
        return this.f21361c;
    }

    /* renamed from: a */
    private void m25234a(boolean z) {
        this.f21361c = z;
    }

    public String getCloseUrl() {
        return this.f21360b;
    }

    /* renamed from: b */
    private void m25235b(String str) {
        this.f21360b = str;
    }

    public static ActionArgs toArgs() {
        return new ActionArgs().with("URL", "http://www.example.com").with("Close URL", "http://leanplum:close").with("Has dismiss button", Boolean.valueOf(true));
    }
}
