package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C15811g;
import kotlin.C15813i;
import kotlin.Pair;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

final class SignatureEnhancementBuilder {
    private final Map<String, PredefinedFunctionEnhancementInfo> signatures = new LinkedHashMap();

    public final class ClassEnhancementBuilder {
        @NotNull
        private final String className;
        final /* synthetic */ SignatureEnhancementBuilder this$0;

        public final class FunctionEnhancementBuilder {
            @NotNull
            private final String functionName;
            private final List<Pair<String, TypeEnhancementInfo>> parameters = ((List) new ArrayList());
            private Pair<String, TypeEnhancementInfo> returnType = C15811g.m59834a("V", null);
            final /* synthetic */ ClassEnhancementBuilder this$0;

            public FunctionEnhancementBuilder(ClassEnhancementBuilder classEnhancementBuilder, @NotNull String str) {
                C2668g.b(str, "functionName");
                this.this$0 = classEnhancementBuilder;
                this.functionName = str;
            }

            public final void parameter(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers... r6) {
                /* JADX: method processing error */
/*
Error: java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:410)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:308)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:249)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:68)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r4 = this;
                r0 = "type";
                kotlin.jvm.internal.C2668g.b(r5, r0);
                r0 = "qualifiers";
                kotlin.jvm.internal.C2668g.b(r6, r0);
                r0 = r4.parameters;
                r0 = (java.util.Collection) r0;
                r1 = r6.length;
                if (r1 != 0) goto L_0x0013;
            L_0x0011:
                r1 = 1;
                goto L_0x0014;
            L_0x0013:
                r1 = 0;
            L_0x0014:
                if (r1 == 0) goto L_0x0018;
            L_0x0016:
                r6 = 0;
                goto L_0x005a;
            L_0x0018:
                r6 = kotlin.collections.C19066k.m68010l(r6);
                r1 = 10;
                r1 = kotlin.collections.C18457p.m66906a(r6, r1);
                r1 = kotlin.collections.ah.m66883a(r1);
                r2 = 16;
                r1 = kotlin.ranges.C18464j.m66926c(r1, r2);
                r2 = new java.util.LinkedHashMap;
                r2.<init>(r1);
                r2 = (java.util.Map) r2;
                r6 = r6.iterator();
            L_0x0037:
                r1 = r6.hasNext();
                if (r1 == 0) goto L_0x0055;
            L_0x003d:
                r1 = r6.next();
                r1 = (kotlin.collections.C15808y) r1;
                r3 = r1.m59828a();
                r3 = java.lang.Integer.valueOf(r3);
                r1 = r1.m59829b();
                r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) r1;
                r2.put(r3, r1);
                goto L_0x0037;
            L_0x0055:
                r6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo;
                r6.<init>(r2);
            L_0x005a:
                r5 = kotlin.C15811g.m59834a(r5, r6);
                r0.add(r5);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.parameter(java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[]):void");
            }

            public final void returns(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers... r5) {
                /* JADX: method processing error */
/*
Error: java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:410)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:308)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:249)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:68)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r3 = this;
                r0 = "type";
                kotlin.jvm.internal.C2668g.b(r4, r0);
                r0 = "qualifiers";
                kotlin.jvm.internal.C2668g.b(r5, r0);
                r5 = kotlin.collections.C19066k.m68010l(r5);
                r0 = 10;
                r0 = kotlin.collections.C18457p.m66906a(r5, r0);
                r0 = kotlin.collections.ah.m66883a(r0);
                r1 = 16;
                r0 = kotlin.ranges.C18464j.m66926c(r0, r1);
                r1 = new java.util.LinkedHashMap;
                r1.<init>(r0);
                r1 = (java.util.Map) r1;
                r5 = r5.iterator();
            L_0x0029:
                r0 = r5.hasNext();
                if (r0 == 0) goto L_0x0047;
            L_0x002f:
                r0 = r5.next();
                r0 = (kotlin.collections.C15808y) r0;
                r2 = r0.m59828a();
                r2 = java.lang.Integer.valueOf(r2);
                r0 = r0.m59829b();
                r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) r0;
                r1.put(r2, r0);
                goto L_0x0029;
            L_0x0047:
                r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo;
                r5.<init>(r1);
                r4 = kotlin.C15811g.m59834a(r4, r5);
                r3.returnType = r4;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.returns(java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[]):void");
            }

            public final void returns(@NotNull JvmPrimitiveType jvmPrimitiveType) {
                C2668g.b(jvmPrimitiveType, "type");
                this.returnType = C15811g.m59834a(jvmPrimitiveType.getDesc(), null);
            }

            @NotNull
            public final Pair<String, PredefinedFunctionEnhancementInfo> build() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                String className = this.this$0.getClassName();
                String str = this.functionName;
                Iterable<Pair> iterable = this.parameters;
                Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                for (Pair a : iterable) {
                    arrayList.add((String) a.m59803a());
                }
                String signature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(str, (List) arrayList, (String) this.returnType.m59803a()));
                TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) this.returnType.m59804b();
                Iterable<Pair> iterable2 = this.parameters;
                Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
                for (Pair b : iterable2) {
                    arrayList2.add((TypeEnhancementInfo) b.m59804b());
                }
                return C15811g.m59834a(signature, new PredefinedFunctionEnhancementInfo(typeEnhancementInfo, (List) arrayList2));
            }
        }

        public ClassEnhancementBuilder(SignatureEnhancementBuilder signatureEnhancementBuilder, @NotNull String str) {
            C2668g.b(str, "className");
            this.this$0 = signatureEnhancementBuilder;
            this.className = str;
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        public final void function(@NotNull String str, @NotNull Function1<? super FunctionEnhancementBuilder, C15813i> function1) {
            C2668g.b(str, "name");
            C2668g.b(function1, "block");
            Map access$getSignatures$p = this.this$0.signatures;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, str);
            function1.invoke(functionEnhancementBuilder);
            str = functionEnhancementBuilder.build();
            access$getSignatures$p.put(str.m59803a(), str.m59804b());
        }
    }

    @NotNull
    public final Map<String, PredefinedFunctionEnhancementInfo> build() {
        return this.signatures;
    }
}
