package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.JvmBytecodeBinaryVersion;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ReadKotlinClassHeaderAnnotationVisitor implements AnnotationVisitor {
    private static final Map<ClassId, Kind> HEADER_KINDS = new HashMap();
    private static final boolean IGNORE_OLD_METADATA = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
    private JvmBytecodeBinaryVersion bytecodeVersion = null;
    private String[] data = null;
    private int extraInt = 0;
    private String extraString = null;
    private Kind headerKind = null;
    private String[] incompatibleData = null;
    private JvmMetadataVersion metadataVersion = null;
    private String packageName = null;
    private String[] strings = null;

    private static abstract class CollectStringArrayAnnotationVisitor implements AnnotationArrayArgumentVisitor {
        private final List<String> strings = new ArrayList();

        protected abstract void visitEnd(@NotNull String[] strArr);

        public void visitEnum(@NotNull ClassId classId, @NotNull Name name) {
        }

        public void visit(@Nullable Object obj) {
            if (obj instanceof String) {
                this.strings.add((String) obj);
            }
        }

        public void visitEnd() {
            visitEnd((String[]) this.strings.toArray(new String[this.strings.size()]));
        }
    }

    private class KotlinMetadataArgumentVisitor implements AnnotationArgumentVisitor {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1 */
        class C184841 extends CollectStringArrayAnnotationVisitor {
            C184841() {
            }

            protected void visitEnd(@NotNull String[] strArr) {
                ReadKotlinClassHeaderAnnotationVisitor.this.data = strArr;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2 */
        class C184852 extends CollectStringArrayAnnotationVisitor {
            C184852() {
            }

            protected void visitEnd(@NotNull String[] strArr) {
                ReadKotlinClassHeaderAnnotationVisitor.this.strings = strArr;
            }
        }

        @Nullable
        public AnnotationArgumentVisitor visitAnnotation(@NotNull Name name, @NotNull ClassId classId) {
            return null;
        }

        public void visitEnd() {
        }

        public void visitEnum(@NotNull Name name, @NotNull ClassId classId, @NotNull Name name2) {
        }

        private KotlinMetadataArgumentVisitor() {
        }

        public void visit(@Nullable Name name, @Nullable Object obj) {
            if (name != null) {
                name = name.asString();
                if ("k".equals(name)) {
                    if ((obj instanceof Integer) != null) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.headerKind = Kind.getById(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(name)) {
                    if ((obj instanceof int[]) != null) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.metadataVersion = new JvmMetadataVersion((int[]) obj);
                    }
                } else if ("bv".equals(name)) {
                    if ((obj instanceof int[]) != null) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.bytecodeVersion = new JvmBytecodeBinaryVersion((int[]) obj);
                    }
                } else if ("xs".equals(name)) {
                    if ((obj instanceof String) != null) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.extraString = (String) obj;
                    }
                } else if ("xi".equals(name)) {
                    if ((obj instanceof Integer) != null) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.extraInt = ((Integer) obj).intValue();
                    }
                } else if (!("pn".equals(name) == null || (obj instanceof String) == null)) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.packageName = (String) obj;
                }
            }
        }

        @Nullable
        public AnnotationArrayArgumentVisitor visitArray(@NotNull Name name) {
            name = name.asString();
            if ("d1".equals(name)) {
                return dataArrayVisitor();
            }
            return "d2".equals(name) != null ? stringsArrayVisitor() : null;
        }

        @NotNull
        private AnnotationArrayArgumentVisitor dataArrayVisitor() {
            return new C184841();
        }

        @NotNull
        private AnnotationArrayArgumentVisitor stringsArrayVisitor() {
            return new C184852();
        }
    }

    private class OldDeprecatedAnnotationArgumentVisitor implements AnnotationArgumentVisitor {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1 */
        class C184861 extends CollectStringArrayAnnotationVisitor {
            C184861() {
            }

            protected void visitEnd(@NotNull String[] strArr) {
                ReadKotlinClassHeaderAnnotationVisitor.this.data = strArr;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2 */
        class C184872 extends CollectStringArrayAnnotationVisitor {
            C184872() {
            }

            protected void visitEnd(@NotNull String[] strArr) {
                ReadKotlinClassHeaderAnnotationVisitor.this.strings = strArr;
            }
        }

        @Nullable
        public AnnotationArgumentVisitor visitAnnotation(@NotNull Name name, @NotNull ClassId classId) {
            return null;
        }

        public void visitEnd() {
        }

        public void visitEnum(@NotNull Name name, @NotNull ClassId classId, @NotNull Name name2) {
        }

        private OldDeprecatedAnnotationArgumentVisitor() {
        }

        public void visit(@Nullable Name name, @Nullable Object obj) {
            if (name != null) {
                name = name.asString();
                if ("version".equals(name)) {
                    if ((obj instanceof int[]) != null) {
                        int[] iArr = (int[]) obj;
                        ReadKotlinClassHeaderAnnotationVisitor.this.metadataVersion = new JvmMetadataVersion(iArr);
                        if (ReadKotlinClassHeaderAnnotationVisitor.this.bytecodeVersion == null) {
                            ReadKotlinClassHeaderAnnotationVisitor.this.bytecodeVersion = new JvmBytecodeBinaryVersion(iArr);
                        }
                    }
                } else if ("multifileClassName".equals(name) != null) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.extraString = obj instanceof String ? (String) obj : null;
                }
            }
        }

        @Nullable
        public AnnotationArrayArgumentVisitor visitArray(@NotNull Name name) {
            name = name.asString();
            if (!ManagerWebServices.FB_DATA.equals(name)) {
                if (!"filePartClassNames".equals(name)) {
                    return "strings".equals(name) != null ? stringsArrayVisitor() : null;
                }
            }
            return dataArrayVisitor();
        }

        @NotNull
        private AnnotationArrayArgumentVisitor dataArrayVisitor() {
            return new C184861();
        }

        @NotNull
        private AnnotationArrayArgumentVisitor stringsArrayVisitor() {
            return new C184872();
        }
    }

    public void visitEnd() {
    }

    static {
        HEADER_KINDS.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinClass")), Kind.CLASS);
        HEADER_KINDS.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinFileFacade")), Kind.FILE_FACADE);
        HEADER_KINDS.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), Kind.MULTIFILE_CLASS);
        HEADER_KINDS.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), Kind.MULTIFILE_CLASS_PART);
        HEADER_KINDS.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), Kind.SYNTHETIC_CLASS);
    }

    @Nullable
    public KotlinClassHeader createHeader() {
        if (this.headerKind == null) {
            return null;
        }
        if (!this.metadataVersion.isCompatible()) {
            this.incompatibleData = this.data;
        }
        if (this.metadataVersion != null) {
            if (this.metadataVersion.isCompatible()) {
                if (shouldHaveData() && this.data == null) {
                    return null;
                }
                return new KotlinClassHeader(this.headerKind, this.metadataVersion == null ? this.metadataVersion : JvmMetadataVersion.INVALID_VERSION, this.bytecodeVersion == null ? this.bytecodeVersion : JvmBytecodeBinaryVersion.INVALID_VERSION, this.data, this.incompatibleData, this.strings, this.extraString, this.extraInt, this.packageName);
            }
        }
        this.data = null;
        if (this.metadataVersion == null) {
        }
        if (this.bytecodeVersion == null) {
        }
        return new KotlinClassHeader(this.headerKind, this.metadataVersion == null ? this.metadataVersion : JvmMetadataVersion.INVALID_VERSION, this.bytecodeVersion == null ? this.bytecodeVersion : JvmBytecodeBinaryVersion.INVALID_VERSION, this.data, this.incompatibleData, this.strings, this.extraString, this.extraInt, this.packageName);
    }

    private boolean shouldHaveData() {
        if (!(this.headerKind == Kind.CLASS || this.headerKind == Kind.FILE_FACADE)) {
            if (this.headerKind != Kind.MULTIFILE_CLASS_PART) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement) {
        if (classId.asSingleFqName().equals(JvmAnnotationNames.METADATA_FQ_NAME) != null) {
            return new KotlinMetadataArgumentVisitor();
        }
        if (IGNORE_OLD_METADATA != null || this.headerKind != null) {
            return null;
        }
        Kind kind = (Kind) HEADER_KINDS.get(classId);
        if (kind == null) {
            return null;
        }
        this.headerKind = kind;
        return new OldDeprecatedAnnotationArgumentVisitor();
    }
}
