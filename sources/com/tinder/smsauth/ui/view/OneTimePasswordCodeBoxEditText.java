package com.tinder.smsauth.ui.view;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.jakewharton.rxbinding2.p141c.C5717c;
import com.jakewharton.rxbinding2.p141c.C5718d;
import com.jakewharton.rxbinding2.p141c.C5719f;
import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001.B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\fH\u0002J\b\u0010#\u001a\u00020\fH\u0014J\b\u0010$\u001a\u00020\fH\u0014J\u0018\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u0006\u0010*\u001a\u00020\fJ\u0006\u0010+\u001a\u00020\fJ\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020!J\b\u0010-\u001a\u00020\fH\u0002R7\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R7\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText;", "Landroid/support/v7/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onBackspaceKeyPressedOnEmptyText", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "box", "", "getOnBackspaceKeyPressedOnEmptyText", "()Lkotlin/jvm/functions/Function1;", "setOnBackspaceKeyPressedOnEmptyText", "(Lkotlin/jvm/functions/Function1;)V", "onTextUpdated", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate;", "update", "getOnTextUpdated", "setOnTextUpdated", "newValue", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "textChangesDisposable", "Lio/reactivex/disposables/Disposable;", "clearText", "shouldNotifyChange", "", "observeTextChanges", "onAttachedToWindow", "onDetachedFromWindow", "onKeyDown", "keyCode", "", "event", "Landroid/view/KeyEvent;", "selectText", "setCursorAtEnd", "newText", "stopObservingTextChanges", "BoxTextUpdate", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class OneTimePasswordCodeBoxEditText extends AppCompatEditText {
    @Nullable
    /* renamed from: a */
    private Function1<? super C15012a, C15813i> f56292a;
    @Nullable
    /* renamed from: b */
    private Function1<? super OneTimePasswordCodeBoxEditText, C15813i> f56293b;
    /* renamed from: c */
    private Disposable f56294c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate;", "", "box", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText;", "oldValue", "", "newValue", "type", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate$Type;", "(Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate$Type;)V", "getBox", "()Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText;", "getNewValue", "()Ljava/lang/String;", "getOldValue", "getType", "()Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate$Type;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText$a */
    public static final class C15012a {
        @NotNull
        /* renamed from: a */
        private final OneTimePasswordCodeBoxEditText f46774a;
        @NotNull
        /* renamed from: b */
        private final String f46775b;
        @NotNull
        /* renamed from: c */
        private final String f46776c;
        @NotNull
        /* renamed from: d */
        private final C15011a f46777d;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate$Type;", "", "()V", "Clear", "Update", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate$Type$Clear;", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate$Type$Update;", "ui_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText$a$a */
        public static abstract class C15011a {

            @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate$Type$Clear;", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate$Type;", "()V", "ui_release"}, k = 1, mv = {1, 1, 10})
            /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText$a$a$a */
            public static final class C16792a extends C15011a {
                /* renamed from: a */
                public static final C16792a f51824a = new C16792a();

                private C16792a() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = 0;
                    r1.<init>(r0);
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.a.a.a.<init>():void");
                }
            }

            @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate$Type$Update;", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate$Type;", "()V", "ui_release"}, k = 1, mv = {1, 1, 10})
            /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText$a$a$b */
            public static final class C16793b extends C15011a {
                /* renamed from: a */
                public static final C16793b f51825a = new C16793b();

                private C16793b() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = 0;
                    r1.<init>(r0);
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.a.a.b.<init>():void");
                }
            }

            private C15011a() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r0 = this;
                r0.<init>();
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.a.a.<init>():void");
            }
        }

        public boolean equals(java.lang.Object r3) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0033;
        L_0x0002:
            r0 = r3 instanceof com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.C15012a;
            if (r0 == 0) goto L_0x0031;
        L_0x0006:
            r3 = (com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.C15012a) r3;
            r0 = r2.f46774a;
            r1 = r3.f46774a;
            r0 = kotlin.jvm.internal.C2668g.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0012:
            r0 = r2.f46775b;
            r1 = r3.f46775b;
            r0 = kotlin.jvm.internal.C2668g.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x001c:
            r0 = r2.f46776c;
            r1 = r3.f46776c;
            r0 = kotlin.jvm.internal.C2668g.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0026:
            r0 = r2.f46777d;
            r3 = r3.f46777d;
            r3 = kotlin.jvm.internal.C2668g.a(r0, r3);
            if (r3 == 0) goto L_0x0031;
        L_0x0030:
            goto L_0x0033;
        L_0x0031:
            r3 = 0;
            return r3;
        L_0x0033:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = r3.f46774a;
            r1 = 0;
            if (r0 == 0) goto L_0x000a;
        L_0x0005:
            r0 = r0.hashCode();
            goto L_0x000b;
        L_0x000a:
            r0 = 0;
        L_0x000b:
            r0 = r0 * 31;
            r2 = r3.f46775b;
            if (r2 == 0) goto L_0x0016;
        L_0x0011:
            r2 = r2.hashCode();
            goto L_0x0017;
        L_0x0016:
            r2 = 0;
        L_0x0017:
            r0 = r0 + r2;
            r0 = r0 * 31;
            r2 = r3.f46776c;
            if (r2 == 0) goto L_0x0023;
        L_0x001e:
            r2 = r2.hashCode();
            goto L_0x0024;
        L_0x0023:
            r2 = 0;
        L_0x0024:
            r0 = r0 + r2;
            r0 = r0 * 31;
            r2 = r3.f46777d;
            if (r2 == 0) goto L_0x002f;
        L_0x002b:
            r1 = r2.hashCode();
        L_0x002f:
            r0 = r0 + r1;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.a.hashCode():int");
        }

        public java.lang.String toString() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "BoxTextUpdate(box=";
            r0.append(r1);
            r1 = r2.f46774a;
            r0.append(r1);
            r1 = ", oldValue=";
            r0.append(r1);
            r1 = r2.f46775b;
            r0.append(r1);
            r1 = ", newValue=";
            r0.append(r1);
            r1 = r2.f46776c;
            r0.append(r1);
            r1 = ", type=";
            r0.append(r1);
            r1 = r2.f46777d;
            r0.append(r1);
            r1 = ")";
            r0.append(r1);
            r0 = r0.toString();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.a.toString():java.lang.String");
        }

        public C15012a(@org.jetbrains.annotations.NotNull com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.C15012a.C15011a r5) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = "box";
            kotlin.jvm.internal.C2668g.b(r2, r0);
            r0 = "oldValue";
            kotlin.jvm.internal.C2668g.b(r3, r0);
            r0 = "newValue";
            kotlin.jvm.internal.C2668g.b(r4, r0);
            r0 = "type";
            kotlin.jvm.internal.C2668g.b(r5, r0);
            r1.<init>();
            r1.f46774a = r2;
            r1.f46775b = r3;
            r1.f46776c = r4;
            r1.f46777d = r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.a.<init>(com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText, java.lang.String, java.lang.String, com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText$a$a):void");
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: a */
        public final com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText m56607a() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f46774a;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.a.a():com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText");
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: b */
        public final java.lang.String m56608b() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f46775b;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.a.b():java.lang.String");
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: c */
        public final java.lang.String m56609c() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f46776c;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.a.c():java.lang.String");
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: d */
        public final com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.C15012a.C15011a m56610d() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f46777d;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.a.d():com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText$a$a");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/jakewharton/rxbinding2/widget/TextViewBeforeTextChangeEvent;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText$b */
    static final class C16794b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16794b f51826a = new C16794b();

        C16794b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62323a((C5719f) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m62323a(@NotNull C5719f c5719f) {
            C2668g.b(c5719f, "event");
            return c5719f.b().toString();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/jakewharton/rxbinding2/widget/TextViewAfterTextChangeEvent;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText$c */
    static final class C16795c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16795c f51827a = new C16795c();

        C16795c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62324a((C5718d) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m62324a(@NotNull C5718d c5718d) {
            C2668g.b(c5718d, "event");
            return String.valueOf(c5718d.b());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate;", "oldValue", "", "newValue", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText$d */
    static final class C16796d<T1, T2, R> implements BiFunction<String, String, C15012a> {
        /* renamed from: a */
        final /* synthetic */ OneTimePasswordCodeBoxEditText f51828a;

        C16796d(OneTimePasswordCodeBoxEditText oneTimePasswordCodeBoxEditText) {
            this.f51828a = oneTimePasswordCodeBoxEditText;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m62325a((String) obj, (String) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final C15012a m62325a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "oldValue");
            C2668g.b(str2, "newValue");
            return new C15012a(this.f51828a, str, str2, (((CharSequence) str2).length() == 0 ? 1 : null) != null ? C16792a.f51824a : C16793b.f51825a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText$e */
    static final class C16797e<T> implements Predicate<C15012a> {
        /* renamed from: a */
        public static final C16797e f51829a = new C16797e();

        C16797e() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62326a((C15012a) obj);
        }

        /* renamed from: a */
        public final boolean m62326a(@NotNull C15012a c15012a) {
            C2668g.b(c15012a, "it");
            return C2668g.a(c15012a.m56608b(), c15012a.m56609c()) ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText$f */
    static final class C16798f<T> implements Consumer<C15012a> {
        /* renamed from: a */
        final /* synthetic */ OneTimePasswordCodeBoxEditText f51830a;

        C16798f(OneTimePasswordCodeBoxEditText oneTimePasswordCodeBoxEditText) {
            this.f51830a = oneTimePasswordCodeBoxEditText;
        }

        public /* synthetic */ void accept(Object obj) {
            m62327a((C15012a) obj);
        }

        /* renamed from: a */
        public final void m62327a(C15012a c15012a) {
            Function1 onTextUpdated = this.f51830a.getOnTextUpdated();
            if (onTextUpdated != null) {
                C2668g.a(c15012a, "it");
                C15813i c15813i = (C15813i) onTextUpdated.invoke(c15012a);
            }
        }
    }

    public /* synthetic */ OneTimePasswordCodeBoxEditText(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public OneTimePasswordCodeBoxEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        setSelectAllOnFocus(true);
        setInputType(2);
    }

    @Nullable
    public final Function1<C15012a, C15813i> getOnTextUpdated() {
        return this.f56292a;
    }

    public final void setOnTextUpdated(@Nullable Function1<? super C15012a, C15813i> function1) {
        this.f56292a = function1;
    }

    @Nullable
    public final Function1<OneTimePasswordCodeBoxEditText, C15813i> getOnBackspaceKeyPressedOnEmptyText() {
        return this.f56293b;
    }

    public final void setOnBackspaceKeyPressedOnEmptyText(@Nullable Function1<? super OneTimePasswordCodeBoxEditText, C15813i> function1) {
        this.f56293b = function1;
    }

    @NotNull
    public final String getText() {
        if (this != null) {
            return getText().toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final void setText(@NotNull String str) {
        C2668g.b(str, "newValue");
        setText(str, BufferType.EDITABLE);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m65822c();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m65823d();
    }

    public boolean onKeyDown(int i, @NotNull KeyEvent keyEvent) {
        C2668g.b(keyEvent, "event");
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
            if ((((CharSequence) getText()).length() == 0 ? 1 : null) != null) {
                Function1 function1 = this.f56293b;
                if (function1 != null) {
                    C15813i c15813i = (C15813i) function1.invoke(this);
                }
            } else {
                m65821a(this, false, 1, null);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    public final void m65825a(@NotNull String str, boolean z) {
        C2668g.b(str, "newText");
        if (!C2668g.a(getText(), str)) {
            if (z) {
                setText(str);
            } else {
                m65823d();
                setText(str);
                m65822c();
            }
        }
    }

    /* renamed from: a */
    public final void m65824a() {
        requestFocus();
        selectAll();
    }

    /* renamed from: b */
    public final void m65827b() {
        requestFocus();
        setSelection(getText().length());
    }

    /* renamed from: a */
    public static /* synthetic */ void m65821a(OneTimePasswordCodeBoxEditText oneTimePasswordCodeBoxEditText, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        oneTimePasswordCodeBoxEditText.m65826a(z);
    }

    /* renamed from: a */
    public final void m65826a(boolean z) {
        m65825a("", z);
    }

    /* renamed from: c */
    private final void m65822c() {
        TextView textView = this;
        this.f56294c = C3959e.zip(C5717c.b(textView).map(C16794b.f51826a), C5717c.c(textView).map(C16795c.f51827a), new C16796d(this)).filter(C16797e.f51829a).subscribe(new C16798f(this));
    }

    /* renamed from: d */
    private final void m65823d() {
        Disposable disposable = this.f56294c;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
