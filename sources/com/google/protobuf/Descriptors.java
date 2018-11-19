package com.google.protobuf;

import com.google.protobuf.DescriptorProtos.DescriptorProto;
import com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange;
import com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange;
import com.google.protobuf.DescriptorProtos.EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos.EnumOptions;
import com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto;
import com.google.protobuf.DescriptorProtos.EnumValueOptions;
import com.google.protobuf.DescriptorProtos.FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label;
import com.google.protobuf.DescriptorProtos.FieldOptions;
import com.google.protobuf.DescriptorProtos.FileDescriptorProto;
import com.google.protobuf.DescriptorProtos.FileOptions;
import com.google.protobuf.DescriptorProtos.MessageOptions;
import com.google.protobuf.DescriptorProtos.MethodDescriptorProto;
import com.google.protobuf.DescriptorProtos.MethodOptions;
import com.google.protobuf.DescriptorProtos.OneofDescriptorProto;
import com.google.protobuf.DescriptorProtos.OneofOptions;
import com.google.protobuf.DescriptorProtos.ServiceDescriptorProto;
import com.google.protobuf.DescriptorProtos.ServiceOptions;
import com.google.protobuf.FieldSet.FieldDescriptorLite;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.MessageLite.Builder;
import com.google.protobuf.WireFormat.FieldType;
import io.fabric.sdk.android.services.events.C15645a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;

public final class Descriptors {
    private static final Logger logger = Logger.getLogger(Descriptors.class.getName());

    private static final class DescriptorPool {
        private boolean allowUnknownDependencies;
        private final Set<FileDescriptor> dependencies = new HashSet();
        private final Map<String, GenericDescriptor> descriptorsByName = new HashMap();
        private final Map<DescriptorIntPair, EnumValueDescriptor> enumValuesByNumber = new HashMap();
        private final Map<DescriptorIntPair, FieldDescriptor> fieldsByNumber = new HashMap();

        private static final class DescriptorIntPair {
            private final GenericDescriptor descriptor;
            private final int number;

            DescriptorIntPair(GenericDescriptor genericDescriptor, int i) {
                this.descriptor = genericDescriptor;
                this.number = i;
            }

            public int hashCode() {
                return (this.descriptor.hashCode() * 65535) + this.number;
            }

            public boolean equals(Object obj) {
                boolean z = false;
                if (!(obj instanceof DescriptorIntPair)) {
                    return false;
                }
                DescriptorIntPair descriptorIntPair = (DescriptorIntPair) obj;
                if (this.descriptor == descriptorIntPair.descriptor && this.number == descriptorIntPair.number) {
                    z = true;
                }
                return z;
            }
        }

        enum SearchFilter {
            TYPES_ONLY,
            AGGREGATES_ONLY,
            ALL_SYMBOLS
        }

        private static final class PackageDescriptor extends GenericDescriptor {
            private final FileDescriptor file;
            private final String fullName;
            private final String name;

            public Message toProto() {
                return this.file.toProto();
            }

            public String getName() {
                return this.name;
            }

            public String getFullName() {
                return this.fullName;
            }

            public FileDescriptor getFile() {
                return this.file;
            }

            PackageDescriptor(String str, String str2, FileDescriptor fileDescriptor) {
                this.file = fileDescriptor;
                this.fullName = str2;
                this.name = str;
            }
        }

        DescriptorPool(FileDescriptor[] fileDescriptorArr, boolean z) {
            this.allowUnknownDependencies = z;
            for (z = false; z < fileDescriptorArr.length; z++) {
                this.dependencies.add(fileDescriptorArr[z]);
                importPublicDependencies(fileDescriptorArr[z]);
            }
            for (FileDescriptor fileDescriptor : this.dependencies) {
                try {
                    addPackage(fileDescriptor.getPackage(), fileDescriptor);
                } catch (FileDescriptor[] fileDescriptorArr2) {
                    throw new AssertionError(fileDescriptorArr2);
                }
            }
        }

        private void importPublicDependencies(FileDescriptor fileDescriptor) {
            for (FileDescriptor fileDescriptor2 : fileDescriptor.getPublicDependencies()) {
                if (this.dependencies.add(fileDescriptor2)) {
                    importPublicDependencies(fileDescriptor2);
                }
            }
        }

        GenericDescriptor findSymbol(String str) {
            return findSymbol(str, SearchFilter.ALL_SYMBOLS);
        }

        GenericDescriptor findSymbol(String str, SearchFilter searchFilter) {
            GenericDescriptor genericDescriptor = (GenericDescriptor) this.descriptorsByName.get(str);
            if (genericDescriptor != null && (searchFilter == SearchFilter.ALL_SYMBOLS || ((searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor)) || (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor))))) {
                return genericDescriptor;
            }
            for (FileDescriptor access$1400 : this.dependencies) {
                GenericDescriptor genericDescriptor2 = (GenericDescriptor) access$1400.pool.descriptorsByName.get(str);
                if (genericDescriptor2 != null && (searchFilter == SearchFilter.ALL_SYMBOLS || ((searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor2)) || (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor2))))) {
                    return genericDescriptor2;
                }
            }
            return null;
        }

        boolean isType(GenericDescriptor genericDescriptor) {
            if (!(genericDescriptor instanceof Descriptor)) {
                if ((genericDescriptor instanceof EnumDescriptor) == null) {
                    return null;
                }
            }
            return true;
        }

        boolean isAggregate(GenericDescriptor genericDescriptor) {
            if (!((genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor) || (genericDescriptor instanceof PackageDescriptor))) {
                if ((genericDescriptor instanceof ServiceDescriptor) == null) {
                    return null;
                }
            }
            return true;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        com.google.protobuf.Descriptors.GenericDescriptor lookupSymbol(java.lang.String r9, com.google.protobuf.Descriptors.GenericDescriptor r10, com.google.protobuf.Descriptors.DescriptorPool.SearchFilter r11) throws com.google.protobuf.Descriptors.DescriptorValidationException {
            /*
            r8 = this;
            r0 = ".";
            r0 = r9.startsWith(r0);
            if (r0 == 0) goto L_0x0012;
        L_0x0008:
            r0 = 1;
            r0 = r9.substring(r0);
            r1 = r8.findSymbol(r0, r11);
            goto L_0x0064;
        L_0x0012:
            r0 = 46;
            r0 = r9.indexOf(r0);
            r1 = -1;
            if (r0 != r1) goto L_0x001d;
        L_0x001b:
            r2 = r9;
            goto L_0x0022;
        L_0x001d:
            r2 = 0;
            r2 = r9.substring(r2, r0);
        L_0x0022:
            r3 = new java.lang.StringBuilder;
            r4 = r10.getFullName();
            r3.<init>(r4);
        L_0x002b:
            r4 = ".";
            r4 = r3.lastIndexOf(r4);
            if (r4 != r1) goto L_0x0039;
        L_0x0033:
            r1 = r8.findSymbol(r9, r11);
            r0 = r9;
            goto L_0x0064;
        L_0x0039:
            r5 = r4 + 1;
            r3.setLength(r5);
            r3.append(r2);
            r6 = r3.toString();
            r7 = com.google.protobuf.Descriptors.DescriptorPool.SearchFilter.AGGREGATES_ONLY;
            r6 = r8.findSymbol(r6, r7);
            if (r6 == 0) goto L_0x00b8;
        L_0x004d:
            if (r0 == r1) goto L_0x005f;
        L_0x004f:
            r3.setLength(r5);
            r3.append(r9);
            r0 = r3.toString();
            r0 = r8.findSymbol(r0, r11);
            r1 = r0;
            goto L_0x0060;
        L_0x005f:
            r1 = r6;
        L_0x0060:
            r0 = r3.toString();
        L_0x0064:
            if (r1 != 0) goto L_0x00b7;
        L_0x0066:
            r1 = r8.allowUnknownDependencies;
            if (r1 == 0) goto L_0x009a;
        L_0x006a:
            r1 = com.google.protobuf.Descriptors.DescriptorPool.SearchFilter.TYPES_ONLY;
            if (r11 != r1) goto L_0x009a;
        L_0x006e:
            r10 = com.google.protobuf.Descriptors.logger;
            r11 = new java.lang.StringBuilder;
            r11.<init>();
            r1 = "The descriptor for message type \"";
            r11.append(r1);
            r11.append(r9);
            r9 = "\" can not be found and a placeholder is created for it";
            r11.append(r9);
            r9 = r11.toString();
            r10.warning(r9);
            r9 = new com.google.protobuf.Descriptors$Descriptor;
            r9.<init>(r0);
            r10 = r8.dependencies;
            r11 = r9.getFile();
            r10.add(r11);
            return r9;
        L_0x009a:
            r11 = new com.google.protobuf.Descriptors$DescriptorValidationException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = 34;
            r0.append(r1);
            r0.append(r9);
            r9 = "\" is not defined.";
            r0.append(r9);
            r9 = r0.toString();
            r0 = 0;
            r11.<init>(r10, r9);
            throw r11;
        L_0x00b7:
            return r1;
        L_0x00b8:
            r3.setLength(r4);
            goto L_0x002b;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Descriptors.DescriptorPool.lookupSymbol(java.lang.String, com.google.protobuf.Descriptors$GenericDescriptor, com.google.protobuf.Descriptors$DescriptorPool$SearchFilter):com.google.protobuf.Descriptors$GenericDescriptor");
        }

        void addSymbol(GenericDescriptor genericDescriptor) throws DescriptorValidationException {
            validateSymbolName(genericDescriptor);
            String fullName = genericDescriptor.getFullName();
            int lastIndexOf = fullName.lastIndexOf(46);
            GenericDescriptor genericDescriptor2 = (GenericDescriptor) this.descriptorsByName.put(fullName, genericDescriptor);
            if (genericDescriptor2 != null) {
                this.descriptorsByName.put(fullName, genericDescriptor2);
                StringBuilder stringBuilder;
                if (genericDescriptor.getFile() != genericDescriptor2.getFile()) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append('\"');
                    stringBuilder.append(fullName);
                    stringBuilder.append("\" is already defined in file \"");
                    stringBuilder.append(genericDescriptor2.getFile().getName());
                    stringBuilder.append("\".");
                    throw new DescriptorValidationException(genericDescriptor, stringBuilder.toString());
                } else if (lastIndexOf == -1) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append('\"');
                    stringBuilder2.append(fullName);
                    stringBuilder2.append("\" is already defined.");
                    throw new DescriptorValidationException(genericDescriptor, stringBuilder2.toString());
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append('\"');
                    stringBuilder.append(fullName.substring(lastIndexOf + 1));
                    stringBuilder.append("\" is already defined in \"");
                    stringBuilder.append(fullName.substring(0, lastIndexOf));
                    stringBuilder.append("\".");
                    throw new DescriptorValidationException(genericDescriptor, stringBuilder.toString());
                }
            }
        }

        void addPackage(String str, FileDescriptor fileDescriptor) throws DescriptorValidationException {
            String str2;
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf == -1) {
                str2 = str;
            } else {
                addPackage(str.substring(0, lastIndexOf), fileDescriptor);
                str2 = str.substring(lastIndexOf + 1);
            }
            GenericDescriptor genericDescriptor = (GenericDescriptor) this.descriptorsByName.put(str, new PackageDescriptor(str2, str, fileDescriptor));
            if (genericDescriptor != null) {
                this.descriptorsByName.put(str, genericDescriptor);
                if ((genericDescriptor instanceof PackageDescriptor) == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append('\"');
                    stringBuilder.append(str2);
                    stringBuilder.append("\" is already defined (as something other than a package) in file \"");
                    stringBuilder.append(genericDescriptor.getFile().getName());
                    stringBuilder.append("\".");
                    throw new DescriptorValidationException(fileDescriptor, stringBuilder.toString());
                }
            }
        }

        void addFieldByNumber(FieldDescriptor fieldDescriptor) throws DescriptorValidationException {
            DescriptorIntPair descriptorIntPair = new DescriptorIntPair(fieldDescriptor.getContainingType(), fieldDescriptor.getNumber());
            FieldDescriptor fieldDescriptor2 = (FieldDescriptor) this.fieldsByNumber.put(descriptorIntPair, fieldDescriptor);
            if (fieldDescriptor2 != null) {
                this.fieldsByNumber.put(descriptorIntPair, fieldDescriptor2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Field number ");
                stringBuilder.append(fieldDescriptor.getNumber());
                stringBuilder.append(" has already been used in \"");
                stringBuilder.append(fieldDescriptor.getContainingType().getFullName());
                stringBuilder.append("\" by field \"");
                stringBuilder.append(fieldDescriptor2.getName());
                stringBuilder.append("\".");
                throw new DescriptorValidationException((GenericDescriptor) fieldDescriptor, stringBuilder.toString());
            }
        }

        void addEnumValueByNumber(EnumValueDescriptor enumValueDescriptor) {
            DescriptorIntPair descriptorIntPair = new DescriptorIntPair(enumValueDescriptor.getType(), enumValueDescriptor.getNumber());
            enumValueDescriptor = (EnumValueDescriptor) this.enumValuesByNumber.put(descriptorIntPair, enumValueDescriptor);
            if (enumValueDescriptor != null) {
                this.enumValuesByNumber.put(descriptorIntPair, enumValueDescriptor);
            }
        }

        static void validateSymbolName(GenericDescriptor genericDescriptor) throws DescriptorValidationException {
            String name = genericDescriptor.getName();
            if (name.length() == 0) {
                throw new DescriptorValidationException(genericDescriptor, "Missing name.");
            }
            int i = 0;
            Object obj = 1;
            while (i < name.length()) {
                char charAt = name.charAt(i);
                if (charAt >= '') {
                    obj = null;
                }
                if (!(Character.isLetter(charAt) || charAt == '_')) {
                    if (!Character.isDigit(charAt) || i <= 0) {
                        obj = null;
                    }
                }
                i++;
            }
            if (obj == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append('\"');
                stringBuilder.append(name);
                stringBuilder.append("\" is not a valid identifier.");
                throw new DescriptorValidationException(genericDescriptor, stringBuilder.toString());
            }
        }
    }

    public static class DescriptorValidationException extends Exception {
        private static final long serialVersionUID = 5750205775490483148L;
        private final String description;
        private final String name;
        private final Message proto;

        public String getProblemSymbolName() {
            return this.name;
        }

        public Message getProblemProto() {
            return this.proto;
        }

        public String getDescription() {
            return this.description;
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(genericDescriptor.getFullName());
            stringBuilder.append(": ");
            stringBuilder.append(str);
            super(stringBuilder.toString());
            this.name = genericDescriptor.getFullName();
            this.proto = genericDescriptor.toProto();
            this.description = str;
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str, Throwable th) {
            this(genericDescriptor, str);
            initCause(th);
        }

        private DescriptorValidationException(FileDescriptor fileDescriptor, String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(fileDescriptor.getName());
            stringBuilder.append(": ");
            stringBuilder.append(str);
            super(stringBuilder.toString());
            this.name = fileDescriptor.getName();
            this.proto = fileDescriptor.toProto();
            this.description = str;
        }
    }

    public static abstract class GenericDescriptor {
        public abstract FileDescriptor getFile();

        public abstract String getFullName();

        public abstract String getName();

        public abstract Message toProto();
    }

    public static final class OneofDescriptor {
        private Descriptor containingType;
        private int fieldCount;
        private FieldDescriptor[] fields;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private OneofDescriptorProto proto;

        public int getIndex() {
            return this.index;
        }

        public String getName() {
            return this.proto.getName();
        }

        public FileDescriptor getFile() {
            return this.file;
        }

        public String getFullName() {
            return this.fullName;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public int getFieldCount() {
            return this.fieldCount;
        }

        public OneofOptions getOptions() {
            return this.proto.getOptions();
        }

        public List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        public FieldDescriptor getField(int i) {
            return this.fields[i];
        }

        private void setProto(OneofDescriptorProto oneofDescriptorProto) {
            this.proto = oneofDescriptorProto;
        }

        private OneofDescriptor(OneofDescriptorProto oneofDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i) throws DescriptorValidationException {
            this.proto = oneofDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, oneofDescriptorProto.getName());
            this.file = fileDescriptor;
            this.index = i;
            this.containingType = descriptor;
            this.fieldCount = null;
        }
    }

    public static final class Descriptor extends GenericDescriptor {
        private final Descriptor containingType;
        private final EnumDescriptor[] enumTypes;
        private final FieldDescriptor[] extensions;
        private final FieldDescriptor[] fields;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final Descriptor[] nestedTypes;
        private final OneofDescriptor[] oneofs;
        private DescriptorProto proto;

        public int getIndex() {
            return this.index;
        }

        public DescriptorProto toProto() {
            return this.proto;
        }

        public String getName() {
            return this.proto.getName();
        }

        public String getFullName() {
            return this.fullName;
        }

        public FileDescriptor getFile() {
            return this.file;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public MessageOptions getOptions() {
            return this.proto.getOptions();
        }

        public List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        public List<OneofDescriptor> getOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.oneofs));
        }

        public List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        public List<Descriptor> getNestedTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.nestedTypes));
        }

        public List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public boolean isExtensionNumber(int i) {
            for (ExtensionRange extensionRange : this.proto.getExtensionRangeList()) {
                if (extensionRange.getStart() <= i && i < extensionRange.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        public boolean isReservedNumber(int i) {
            for (ReservedRange reservedRange : this.proto.getReservedRangeList()) {
                if (reservedRange.getStart() <= i && i < reservedRange.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        public boolean isReservedName(String str) {
            Internal.checkNotNull(str);
            for (String equals : this.proto.getReservedNameList()) {
                if (equals.equals(str)) {
                    return true;
                }
            }
            return null;
        }

        public boolean isExtendable() {
            return this.proto.getExtensionRangeList().size() != 0;
        }

        public FieldDescriptor findFieldByName(String str) {
            DescriptorPool access$1400 = this.file.pool;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.fullName);
            stringBuilder.append('.');
            stringBuilder.append(str);
            str = access$1400.findSymbol(stringBuilder.toString());
            return (str == null || !(str instanceof FieldDescriptor)) ? null : (FieldDescriptor) str;
        }

        public FieldDescriptor findFieldByNumber(int i) {
            return (FieldDescriptor) this.file.pool.fieldsByNumber.get(new DescriptorIntPair(this, i));
        }

        public Descriptor findNestedTypeByName(String str) {
            DescriptorPool access$1400 = this.file.pool;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.fullName);
            stringBuilder.append('.');
            stringBuilder.append(str);
            str = access$1400.findSymbol(stringBuilder.toString());
            return (str == null || !(str instanceof Descriptor)) ? null : (Descriptor) str;
        }

        public EnumDescriptor findEnumTypeByName(String str) {
            DescriptorPool access$1400 = this.file.pool;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.fullName);
            stringBuilder.append('.');
            stringBuilder.append(str);
            str = access$1400.findSymbol(stringBuilder.toString());
            return (str == null || !(str instanceof EnumDescriptor)) ? null : (EnumDescriptor) str;
        }

        Descriptor(String str) throws DescriptorValidationException {
            String substring;
            String str2 = "";
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str2 = str.substring(lastIndexOf + 1);
                substring = str.substring(0, lastIndexOf);
            } else {
                substring = str2;
                str2 = str;
            }
            this.index = 0;
            this.proto = DescriptorProto.newBuilder().setName(str2).addExtensionRange(ExtensionRange.newBuilder().setStart(1).setEnd(536870912).build()).build();
            this.fullName = str;
            this.containingType = null;
            this.nestedTypes = new Descriptor[0];
            this.enumTypes = new EnumDescriptor[0];
            this.fields = new FieldDescriptor[0];
            this.extensions = new FieldDescriptor[0];
            this.oneofs = new OneofDescriptor[0];
            this.file = new FileDescriptor(substring, this);
        }

        private Descriptor(DescriptorProto descriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i) throws DescriptorValidationException {
            this.index = i;
            this.proto = descriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, descriptorProto.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            this.oneofs = new OneofDescriptor[descriptorProto.getOneofDeclCount()];
            descriptor = null;
            for (i = 0; i < descriptorProto.getOneofDeclCount(); i++) {
                this.oneofs[i] = new OneofDescriptor(descriptorProto.getOneofDecl(i), fileDescriptor, this, i);
            }
            this.nestedTypes = new Descriptor[descriptorProto.getNestedTypeCount()];
            for (i = 0; i < descriptorProto.getNestedTypeCount(); i++) {
                this.nestedTypes[i] = new Descriptor(descriptorProto.getNestedType(i), fileDescriptor, this, i);
            }
            this.enumTypes = new EnumDescriptor[descriptorProto.getEnumTypeCount()];
            for (i = 0; i < descriptorProto.getEnumTypeCount(); i++) {
                this.enumTypes[i] = new EnumDescriptor(descriptorProto.getEnumType(i), fileDescriptor, this, i);
            }
            this.fields = new FieldDescriptor[descriptorProto.getFieldCount()];
            for (i = 0; i < descriptorProto.getFieldCount(); i++) {
                this.fields[i] = new FieldDescriptor(descriptorProto.getField(i), fileDescriptor, this, i, false);
            }
            this.extensions = new FieldDescriptor[descriptorProto.getExtensionCount()];
            for (i = 0; i < descriptorProto.getExtensionCount(); i++) {
                this.extensions[i] = new FieldDescriptor(descriptorProto.getExtension(i), fileDescriptor, this, i, true);
            }
            for (i = 0; i < descriptorProto.getOneofDeclCount(); i++) {
                this.oneofs[i].fields = new FieldDescriptor[this.oneofs[i].getFieldCount()];
                this.oneofs[i].fieldCount = 0;
            }
            while (descriptor < descriptorProto.getFieldCount()) {
                i = this.fields[descriptor].getContainingOneof();
                if (i != 0) {
                    i.fields[i.fieldCount = i.fieldCount + 1] = this.fields[descriptor];
                }
                descriptor++;
            }
            fileDescriptor.pool.addSymbol(this);
        }

        private void crossLink() throws DescriptorValidationException {
            for (Descriptor crossLink : this.nestedTypes) {
                crossLink.crossLink();
            }
            for (FieldDescriptor access$900 : this.fields) {
                access$900.crossLink();
            }
            for (FieldDescriptor access$9002 : this.extensions) {
                access$9002.crossLink();
            }
        }

        private void setProto(DescriptorProto descriptorProto) {
            int i;
            this.proto = descriptorProto;
            for (i = 0; i < this.nestedTypes.length; i++) {
                this.nestedTypes[i].setProto(descriptorProto.getNestedType(i));
            }
            for (i = 0; i < this.oneofs.length; i++) {
                this.oneofs[i].setProto(descriptorProto.getOneofDecl(i));
            }
            for (i = 0; i < this.enumTypes.length; i++) {
                this.enumTypes[i].setProto(descriptorProto.getEnumType(i));
            }
            for (i = 0; i < this.fields.length; i++) {
                this.fields[i].setProto(descriptorProto.getField(i));
            }
            for (int i2 = 0; i2 < this.extensions.length; i2++) {
                this.extensions[i2].setProto(descriptorProto.getExtension(i2));
            }
        }
    }

    public static final class EnumDescriptor extends GenericDescriptor implements EnumLiteMap<EnumValueDescriptor> {
        private final Descriptor containingType;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private EnumDescriptorProto proto;
        private final WeakHashMap<Integer, WeakReference<EnumValueDescriptor>> unknownValues;
        private EnumValueDescriptor[] values;

        public int getIndex() {
            return this.index;
        }

        public EnumDescriptorProto toProto() {
            return this.proto;
        }

        public String getName() {
            return this.proto.getName();
        }

        public String getFullName() {
            return this.fullName;
        }

        public FileDescriptor getFile() {
            return this.file;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public EnumOptions getOptions() {
            return this.proto.getOptions();
        }

        public List<EnumValueDescriptor> getValues() {
            return Collections.unmodifiableList(Arrays.asList(this.values));
        }

        public EnumValueDescriptor findValueByName(String str) {
            DescriptorPool access$1400 = this.file.pool;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.fullName);
            stringBuilder.append('.');
            stringBuilder.append(str);
            str = access$1400.findSymbol(stringBuilder.toString());
            return (str == null || !(str instanceof EnumValueDescriptor)) ? null : (EnumValueDescriptor) str;
        }

        public EnumValueDescriptor findValueByNumber(int i) {
            return (EnumValueDescriptor) this.file.pool.enumValuesByNumber.get(new DescriptorIntPair(this, i));
        }

        public EnumValueDescriptor findValueByNumberCreatingIfUnknown(int i) {
            EnumValueDescriptor findValueByNumber = findValueByNumber(i);
            if (findValueByNumber != null) {
                return findValueByNumber;
            }
            synchronized (this) {
                Integer num = new Integer(i);
                WeakReference weakReference = (WeakReference) this.unknownValues.get(num);
                if (weakReference != null) {
                    findValueByNumber = (EnumValueDescriptor) weakReference.get();
                }
                if (findValueByNumber == null) {
                    findValueByNumber = new EnumValueDescriptor(this.file, this, num);
                    this.unknownValues.put(num, new WeakReference(findValueByNumber));
                }
            }
            return findValueByNumber;
        }

        int getUnknownEnumValueDescriptorCount() {
            return this.unknownValues.size();
        }

        private EnumDescriptor(EnumDescriptorProto enumDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i) throws DescriptorValidationException {
            this.unknownValues = new WeakHashMap();
            this.index = i;
            this.proto = enumDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, enumDescriptorProto.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            if (enumDescriptorProto.getValueCount() == null) {
                throw new DescriptorValidationException((GenericDescriptor) this, "Enums must contain at least one value.");
            }
            this.values = new EnumValueDescriptor[enumDescriptorProto.getValueCount()];
            for (descriptor = null; descriptor < enumDescriptorProto.getValueCount(); descriptor++) {
                this.values[descriptor] = new EnumValueDescriptor(enumDescriptorProto.getValue(descriptor), fileDescriptor, this, descriptor);
            }
            fileDescriptor.pool.addSymbol(this);
        }

        private void setProto(EnumDescriptorProto enumDescriptorProto) {
            this.proto = enumDescriptorProto;
            for (int i = 0; i < this.values.length; i++) {
                this.values[i].setProto(enumDescriptorProto.getValue(i));
            }
        }
    }

    public static final class EnumValueDescriptor extends GenericDescriptor implements EnumLite {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private Integer number;
        private EnumValueDescriptorProto proto;
        private final EnumDescriptor type;

        public int getIndex() {
            return this.index;
        }

        public EnumValueDescriptorProto toProto() {
            return this.proto;
        }

        public String getName() {
            return this.proto.getName();
        }

        public int getNumber() {
            return this.proto.getNumber();
        }

        public String toString() {
            return this.proto.getName();
        }

        public String getFullName() {
            return this.fullName;
        }

        public FileDescriptor getFile() {
            return this.file;
        }

        public EnumDescriptor getType() {
            return this.type;
        }

        public EnumValueOptions getOptions() {
            return this.proto.getOptions();
        }

        private EnumValueDescriptor(EnumValueDescriptorProto enumValueDescriptorProto, FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, int i) throws DescriptorValidationException {
            this.index = i;
            this.proto = enumValueDescriptorProto;
            this.file = fileDescriptor;
            this.type = enumDescriptor;
            i = new StringBuilder();
            i.append(enumDescriptor.getFullName());
            i.append('.');
            i.append(enumValueDescriptorProto.getName());
            this.fullName = i.toString();
            fileDescriptor.pool.addSymbol(this);
            fileDescriptor.pool.addEnumValueByNumber(this);
        }

        private EnumValueDescriptor(FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, Integer num) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("UNKNOWN_ENUM_VALUE_");
            stringBuilder.append(enumDescriptor.getName());
            stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
            stringBuilder.append(num);
            EnumValueDescriptorProto build = EnumValueDescriptorProto.newBuilder().setName(stringBuilder.toString()).setNumber(num.intValue()).build();
            this.index = -1;
            this.proto = build;
            this.file = fileDescriptor;
            this.type = enumDescriptor;
            fileDescriptor = new StringBuilder();
            fileDescriptor.append(enumDescriptor.getFullName());
            fileDescriptor.append('.');
            fileDescriptor.append(build.getName());
            this.fullName = fileDescriptor.toString();
            this.number = num;
        }

        private void setProto(EnumValueDescriptorProto enumValueDescriptorProto) {
            this.proto = enumValueDescriptorProto;
        }
    }

    public static final class FieldDescriptor extends GenericDescriptor implements FieldDescriptorLite<FieldDescriptor>, Comparable<FieldDescriptor> {
        private static final FieldType[] table = FieldType.values();
        private OneofDescriptor containingOneof;
        private Descriptor containingType;
        private Object defaultValue;
        private EnumDescriptor enumType;
        private final Descriptor extensionScope;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final String jsonName;
        private Descriptor messageType;
        private FieldDescriptorProto proto;
        private Type type;

        public enum JavaType {
            INT(Integer.valueOf(0)),
            LONG(Long.valueOf(0)),
            FLOAT(Float.valueOf(0.0f)),
            DOUBLE(Double.valueOf(0.0d)),
            BOOLEAN(Boolean.valueOf(false)),
            STRING(""),
            BYTE_STRING(ByteString.EMPTY),
            ENUM(null),
            MESSAGE(null);
            
            private final Object defaultDefault;

            private JavaType(Object obj) {
                this.defaultDefault = obj;
            }
        }

        public enum Type {
            DOUBLE(JavaType.DOUBLE),
            FLOAT(JavaType.FLOAT),
            INT64(JavaType.LONG),
            UINT64(JavaType.LONG),
            INT32(JavaType.INT),
            FIXED64(JavaType.LONG),
            FIXED32(JavaType.INT),
            BOOL(JavaType.BOOLEAN),
            STRING(JavaType.STRING),
            GROUP(JavaType.MESSAGE),
            MESSAGE(JavaType.MESSAGE),
            BYTES(JavaType.BYTE_STRING),
            UINT32(JavaType.INT),
            ENUM(JavaType.ENUM),
            SFIXED32(JavaType.INT),
            SFIXED64(JavaType.LONG),
            SINT32(JavaType.INT),
            SINT64(JavaType.LONG);
            
            private JavaType javaType;

            private Type(JavaType javaType) {
                this.javaType = javaType;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type toProto() {
                return com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.forNumber(ordinal() + 1);
            }

            public JavaType getJavaType() {
                return this.javaType;
            }

            public static Type valueOf(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type type) {
                return values()[type.getNumber() - 1];
            }
        }

        public int getIndex() {
            return this.index;
        }

        public FieldDescriptorProto toProto() {
            return this.proto;
        }

        public String getName() {
            return this.proto.getName();
        }

        public int getNumber() {
            return this.proto.getNumber();
        }

        public String getFullName() {
            return this.fullName;
        }

        public String getJsonName() {
            return this.jsonName;
        }

        public JavaType getJavaType() {
            return this.type.getJavaType();
        }

        public com.google.protobuf.WireFormat.JavaType getLiteJavaType() {
            return getLiteType().getJavaType();
        }

        public FileDescriptor getFile() {
            return this.file;
        }

        public Type getType() {
            return this.type;
        }

        public FieldType getLiteType() {
            return table[this.type.ordinal()];
        }

        public boolean needsUtf8Check() {
            if (this.type != Type.STRING) {
                return false;
            }
            if (getContainingType().getOptions().getMapEntry() || getFile().getSyntax() == Syntax.PROTO3) {
                return true;
            }
            return getFile().getOptions().getJavaStringCheckUtf8();
        }

        public boolean isMapField() {
            return getType() == Type.MESSAGE && isRepeated() && getMessageType().getOptions().getMapEntry();
        }

        static {
            if (Type.values().length != com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.values().length) {
                throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
            }
        }

        public boolean isRequired() {
            return this.proto.getLabel() == Label.LABEL_REQUIRED;
        }

        public boolean isOptional() {
            return this.proto.getLabel() == Label.LABEL_OPTIONAL;
        }

        public boolean isRepeated() {
            return this.proto.getLabel() == Label.LABEL_REPEATED;
        }

        public boolean isPacked() {
            boolean z = false;
            if (!isPackable()) {
                return false;
            }
            if (getFile().getSyntax() == Syntax.PROTO2) {
                return getOptions().getPacked();
            }
            if (!getOptions().hasPacked() || getOptions().getPacked()) {
                z = true;
            }
            return z;
        }

        public boolean isPackable() {
            return isRepeated() && getLiteType().isPackable();
        }

        public boolean hasDefaultValue() {
            return this.proto.hasDefaultValue();
        }

        public Object getDefaultValue() {
            if (getJavaType() != JavaType.MESSAGE) {
                return this.defaultValue;
            }
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }

        public FieldOptions getOptions() {
            return this.proto.getOptions();
        }

        public boolean isExtension() {
            return this.proto.hasExtendee();
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public OneofDescriptor getContainingOneof() {
            return this.containingOneof;
        }

        public Descriptor getExtensionScope() {
            if (isExtension()) {
                return this.extensionScope;
            }
            throw new UnsupportedOperationException("This field is not an extension.");
        }

        public Descriptor getMessageType() {
            if (getJavaType() == JavaType.MESSAGE) {
                return this.messageType;
            }
            throw new UnsupportedOperationException("This field is not of message type.");
        }

        public EnumDescriptor getEnumType() {
            if (getJavaType() == JavaType.ENUM) {
                return this.enumType;
            }
            throw new UnsupportedOperationException("This field is not of enum type.");
        }

        public int compareTo(FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.containingType == this.containingType) {
                return getNumber() - fieldDescriptor.getNumber();
            }
            throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        }

        public String toString() {
            return getFullName();
        }

        private static String fieldNameToJsonName(String str) {
            StringBuilder stringBuilder = new StringBuilder(str.length());
            Object obj = null;
            for (int i = 0; i < str.length(); i++) {
                Character valueOf = Character.valueOf(str.charAt(i));
                if (valueOf.charValue() == '_') {
                    obj = 1;
                } else if (obj != null) {
                    stringBuilder.append(Character.toUpperCase(valueOf.charValue()));
                    obj = null;
                } else {
                    stringBuilder.append(valueOf);
                }
            }
            return stringBuilder.toString();
        }

        private FieldDescriptor(FieldDescriptorProto fieldDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i, boolean z) throws DescriptorValidationException {
            this.index = i;
            this.proto = fieldDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, fieldDescriptorProto.getName());
            this.file = fileDescriptor;
            if (fieldDescriptorProto.hasJsonName() != 0) {
                this.jsonName = fieldDescriptorProto.getJsonName();
            } else {
                this.jsonName = fieldNameToJsonName(fieldDescriptorProto.getName());
            }
            if (fieldDescriptorProto.hasType() != 0) {
                this.type = Type.valueOf(fieldDescriptorProto.getType());
            }
            if (getNumber() <= 0) {
                throw new DescriptorValidationException((GenericDescriptor) this, "Field numbers must be positive integers.");
            }
            if (z) {
                if (fieldDescriptorProto.hasExtendee() == 0) {
                    throw new DescriptorValidationException((GenericDescriptor) this, "FieldDescriptorProto.extendee not set for extension field.");
                }
                this.containingType = null;
                if (descriptor != null) {
                    this.extensionScope = descriptor;
                } else {
                    this.extensionScope = null;
                }
                if (fieldDescriptorProto.hasOneofIndex() != null) {
                    throw new DescriptorValidationException((GenericDescriptor) this, "FieldDescriptorProto.oneof_index set for extension field.");
                }
                this.containingOneof = null;
            } else if (fieldDescriptorProto.hasExtendee() != 0) {
                throw new DescriptorValidationException((GenericDescriptor) this, "FieldDescriptorProto.extendee set for non-extension field.");
            } else {
                this.containingType = descriptor;
                if (fieldDescriptorProto.hasOneofIndex() != 0) {
                    if (fieldDescriptorProto.getOneofIndex() >= 0) {
                        if (fieldDescriptorProto.getOneofIndex() < descriptor.toProto().getOneofDeclCount()) {
                            this.containingOneof = (OneofDescriptor) descriptor.getOneofs().get(fieldDescriptorProto.getOneofIndex());
                            this.containingOneof.fieldCount = this.containingOneof.fieldCount + 1;
                        }
                    }
                    fileDescriptor = new StringBuilder();
                    fileDescriptor.append("FieldDescriptorProto.oneof_index is out of range for type ");
                    fileDescriptor.append(descriptor.getName());
                    throw new DescriptorValidationException((GenericDescriptor) this, fileDescriptor.toString());
                }
                this.containingOneof = null;
                this.extensionScope = null;
            }
            fileDescriptor.pool.addSymbol(this);
        }

        private void crossLink() throws DescriptorValidationException {
            GenericDescriptor lookupSymbol;
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            if (this.proto.hasExtendee()) {
                lookupSymbol = this.file.pool.lookupSymbol(this.proto.getExtendee(), this, SearchFilter.TYPES_ONLY);
                if (lookupSymbol instanceof Descriptor) {
                    this.containingType = (Descriptor) lookupSymbol;
                    if (!getContainingType().isExtensionNumber(getNumber())) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append('\"');
                        stringBuilder.append(getContainingType().getFullName());
                        stringBuilder.append("\" does not declare ");
                        stringBuilder.append(getNumber());
                        stringBuilder.append(" as an extension number.");
                        throw new DescriptorValidationException((GenericDescriptor) this, stringBuilder.toString());
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append('\"');
                stringBuilder.append(this.proto.getExtendee());
                stringBuilder.append("\" is not a message type.");
                throw new DescriptorValidationException((GenericDescriptor) this, stringBuilder.toString());
            }
            if (this.proto.hasTypeName()) {
                lookupSymbol = this.file.pool.lookupSymbol(this.proto.getTypeName(), this, SearchFilter.TYPES_ONLY);
                if (!this.proto.hasType()) {
                    if (lookupSymbol instanceof Descriptor) {
                        this.type = Type.MESSAGE;
                    } else if (lookupSymbol instanceof EnumDescriptor) {
                        this.type = Type.ENUM;
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append('\"');
                        stringBuilder.append(this.proto.getTypeName());
                        stringBuilder.append("\" is not a type.");
                        throw new DescriptorValidationException((GenericDescriptor) this, stringBuilder.toString());
                    }
                }
                if (getJavaType() == JavaType.MESSAGE) {
                    if (lookupSymbol instanceof Descriptor) {
                        this.messageType = (Descriptor) lookupSymbol;
                        if (this.proto.hasDefaultValue()) {
                            throw new DescriptorValidationException((GenericDescriptor) this, "Messages can't have default values.");
                        }
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append('\"');
                    stringBuilder.append(this.proto.getTypeName());
                    stringBuilder.append("\" is not a message type.");
                    throw new DescriptorValidationException((GenericDescriptor) this, stringBuilder.toString());
                } else if (getJavaType() != JavaType.ENUM) {
                    throw new DescriptorValidationException((GenericDescriptor) this, "Field with primitive type has type_name.");
                } else if (lookupSymbol instanceof EnumDescriptor) {
                    this.enumType = (EnumDescriptor) lookupSymbol;
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append('\"');
                    stringBuilder.append(this.proto.getTypeName());
                    stringBuilder.append("\" is not an enum type.");
                    throw new DescriptorValidationException((GenericDescriptor) this, stringBuilder.toString());
                }
            }
            if (getJavaType() != JavaType.MESSAGE) {
                if (getJavaType() == JavaType.ENUM) {
                }
            }
            throw new DescriptorValidationException((GenericDescriptor) this, "Field with message or enum type missing type_name.");
            if (!this.proto.getOptions().getPacked() || isPackable()) {
                if (!this.proto.hasDefaultValue()) {
                    if (!isRepeated()) {
                        switch (getJavaType()) {
                            case ENUM:
                                this.defaultValue = this.enumType.getValues().get(0);
                                break;
                            case MESSAGE:
                                this.defaultValue = null;
                                break;
                            default:
                                this.defaultValue = getJavaType().defaultDefault;
                                break;
                        }
                    }
                    this.defaultValue = Collections.emptyList();
                } else if (isRepeated()) {
                    throw new DescriptorValidationException((GenericDescriptor) this, "Repeated fields cannot have default values.");
                } else {
                    try {
                        switch (getType()) {
                            case INT32:
                            case SINT32:
                            case SFIXED32:
                                this.defaultValue = Integer.valueOf(TextFormat.parseInt32(this.proto.getDefaultValue()));
                                break;
                            case UINT32:
                            case FIXED32:
                                this.defaultValue = Integer.valueOf(TextFormat.parseUInt32(this.proto.getDefaultValue()));
                                break;
                            case INT64:
                            case SINT64:
                            case SFIXED64:
                                this.defaultValue = Long.valueOf(TextFormat.parseInt64(this.proto.getDefaultValue()));
                                break;
                            case UINT64:
                            case FIXED64:
                                this.defaultValue = Long.valueOf(TextFormat.parseUInt64(this.proto.getDefaultValue()));
                                break;
                            case FLOAT:
                                if (!this.proto.getDefaultValue().equals("inf")) {
                                    if (!this.proto.getDefaultValue().equals("-inf")) {
                                        if (!this.proto.getDefaultValue().equals("nan")) {
                                            this.defaultValue = Float.valueOf(this.proto.getDefaultValue());
                                            break;
                                        } else {
                                            this.defaultValue = Float.valueOf(Float.NaN);
                                            break;
                                        }
                                    }
                                    this.defaultValue = Float.valueOf(Float.NEGATIVE_INFINITY);
                                    break;
                                }
                                this.defaultValue = Float.valueOf(Float.POSITIVE_INFINITY);
                                break;
                            case DOUBLE:
                                if (!this.proto.getDefaultValue().equals("inf")) {
                                    if (!this.proto.getDefaultValue().equals("-inf")) {
                                        if (!this.proto.getDefaultValue().equals("nan")) {
                                            this.defaultValue = Double.valueOf(this.proto.getDefaultValue());
                                            break;
                                        } else {
                                            this.defaultValue = Double.valueOf(Double.NaN);
                                            break;
                                        }
                                    }
                                    this.defaultValue = Double.valueOf(Double.NEGATIVE_INFINITY);
                                    break;
                                }
                                this.defaultValue = Double.valueOf(Double.POSITIVE_INFINITY);
                                break;
                            case BOOL:
                                this.defaultValue = Boolean.valueOf(this.proto.getDefaultValue());
                                break;
                            case STRING:
                                this.defaultValue = this.proto.getDefaultValue();
                                break;
                            case BYTES:
                                this.defaultValue = TextFormat.unescapeBytes(this.proto.getDefaultValue());
                                break;
                            case ENUM:
                                this.defaultValue = this.enumType.findValueByName(this.proto.getDefaultValue());
                                if (this.defaultValue == null) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unknown enum default value: \"");
                                    stringBuilder.append(this.proto.getDefaultValue());
                                    stringBuilder.append('\"');
                                    throw new DescriptorValidationException((GenericDescriptor) this, stringBuilder.toString());
                                }
                                break;
                            case MESSAGE:
                            case GROUP:
                                throw new DescriptorValidationException((GenericDescriptor) this, "Message type had default value.");
                            default:
                                break;
                        }
                    } catch (Throwable e) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Couldn't parse default value: ");
                        stringBuilder2.append(e.getMessage());
                        throw new DescriptorValidationException(this, stringBuilder2.toString(), e);
                    } catch (Throwable e2) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Could not parse default value: \"");
                        stringBuilder2.append(this.proto.getDefaultValue());
                        stringBuilder2.append('\"');
                        throw new DescriptorValidationException(this, stringBuilder2.toString(), e2);
                    }
                }
                if (!isExtension()) {
                    this.file.pool.addFieldByNumber(this);
                }
                if (this.containingType != null && this.containingType.getOptions().getMessageSetWireFormat()) {
                    if (!isExtension()) {
                        throw new DescriptorValidationException((GenericDescriptor) this, "MessageSets cannot have fields, only extensions.");
                    } else if (!isOptional() || getType() != Type.MESSAGE) {
                        throw new DescriptorValidationException((GenericDescriptor) this, "Extensions of MessageSets must be optional messages.");
                    } else {
                        return;
                    }
                }
                return;
            }
            throw new DescriptorValidationException((GenericDescriptor) this, "[packed = true] can only be specified for repeated primitive fields.");
        }

        private void setProto(FieldDescriptorProto fieldDescriptorProto) {
            this.proto = fieldDescriptorProto;
        }

        public Builder internalMergeFrom(Builder builder, MessageLite messageLite) {
            return ((Message.Builder) builder).mergeFrom((Message) messageLite);
        }
    }

    public static final class FileDescriptor extends GenericDescriptor {
        private final FileDescriptor[] dependencies;
        private final EnumDescriptor[] enumTypes;
        private final FieldDescriptor[] extensions;
        private final Descriptor[] messageTypes;
        private final DescriptorPool pool;
        private FileDescriptorProto proto;
        private final FileDescriptor[] publicDependencies;
        private final ServiceDescriptor[] services;

        public interface InternalDescriptorAssigner {
            ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
        }

        public enum Syntax {
            UNKNOWN("unknown"),
            PROTO2("proto2"),
            PROTO3("proto3");
            
            private final String name;

            private Syntax(String str) {
                this.name = str;
            }
        }

        public FileDescriptor getFile() {
            return this;
        }

        public FileDescriptorProto toProto() {
            return this.proto;
        }

        public String getName() {
            return this.proto.getName();
        }

        public String getFullName() {
            return this.proto.getName();
        }

        public String getPackage() {
            return this.proto.getPackage();
        }

        public FileOptions getOptions() {
            return this.proto.getOptions();
        }

        public List<Descriptor> getMessageTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.messageTypes));
        }

        public List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public List<ServiceDescriptor> getServices() {
            return Collections.unmodifiableList(Arrays.asList(this.services));
        }

        public List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        public List<FileDescriptor> getDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.dependencies));
        }

        public List<FileDescriptor> getPublicDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.publicDependencies));
        }

        public Syntax getSyntax() {
            if (Syntax.PROTO3.name.equals(this.proto.getSyntax())) {
                return Syntax.PROTO3;
            }
            return Syntax.PROTO2;
        }

        public Descriptor findMessageTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (getPackage().length() > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(getPackage());
                stringBuilder.append('.');
                stringBuilder.append(str);
                str = stringBuilder.toString();
            }
            str = this.pool.findSymbol(str);
            if (str != null && (str instanceof Descriptor) && str.getFile() == this) {
                return (Descriptor) str;
            }
            return null;
        }

        public EnumDescriptor findEnumTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (getPackage().length() > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(getPackage());
                stringBuilder.append('.');
                stringBuilder.append(str);
                str = stringBuilder.toString();
            }
            str = this.pool.findSymbol(str);
            if (str != null && (str instanceof EnumDescriptor) && str.getFile() == this) {
                return (EnumDescriptor) str;
            }
            return null;
        }

        public ServiceDescriptor findServiceByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (getPackage().length() > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(getPackage());
                stringBuilder.append('.');
                stringBuilder.append(str);
                str = stringBuilder.toString();
            }
            str = this.pool.findSymbol(str);
            if (str != null && (str instanceof ServiceDescriptor) && str.getFile() == this) {
                return (ServiceDescriptor) str;
            }
            return null;
        }

        public FieldDescriptor findExtensionByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (getPackage().length() > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(getPackage());
                stringBuilder.append('.');
                stringBuilder.append(str);
                str = stringBuilder.toString();
            }
            str = this.pool.findSymbol(str);
            if (str != null && (str instanceof FieldDescriptor) && str.getFile() == this) {
                return (FieldDescriptor) str;
            }
            return null;
        }

        public static FileDescriptor buildFrom(FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr) throws DescriptorValidationException {
            return buildFrom(fileDescriptorProto, fileDescriptorArr, false);
        }

        public static FileDescriptor buildFrom(FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, boolean z) throws DescriptorValidationException {
            FileDescriptor fileDescriptor = new FileDescriptor(fileDescriptorProto, fileDescriptorArr, new DescriptorPool(fileDescriptorArr, z), z);
            fileDescriptor.crossLink();
            return fileDescriptor;
        }

        public static void internalBuildGeneratedFileFrom(String[] strArr, FileDescriptor[] fileDescriptorArr, InternalDescriptorAssigner internalDescriptorAssigner) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String append : strArr) {
                stringBuilder.append(append);
            }
            byte[] bytes = stringBuilder.toString().getBytes(Internal.ISO_8859_1);
            try {
                FileDescriptorProto parseFrom = FileDescriptorProto.parseFrom(bytes);
                try {
                    fileDescriptorArr = buildFrom(parseFrom, fileDescriptorArr, true);
                    ExtensionRegistryLite assignDescriptors = internalDescriptorAssigner.assignDescriptors(fileDescriptorArr);
                    if (assignDescriptors != null) {
                        try {
                            fileDescriptorArr.setProto(FileDescriptorProto.parseFrom(bytes, assignDescriptors));
                        } catch (String[] strArr2) {
                            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", strArr2);
                        }
                    }
                } catch (String[] strArr22) {
                    internalDescriptorAssigner = new StringBuilder();
                    internalDescriptorAssigner.append("Invalid embedded descriptor for \"");
                    internalDescriptorAssigner.append(parseFrom.getName());
                    internalDescriptorAssigner.append("\".");
                    throw new IllegalArgumentException(internalDescriptorAssigner.toString(), strArr22);
                }
            } catch (String[] strArr222) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", strArr222);
            }
        }

        public static void internalBuildGeneratedFileFrom(java.lang.String[] r5, java.lang.Class<?> r6, java.lang.String[] r7, java.lang.String[] r8, com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner r9) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
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
            r0 = new java.util.ArrayList;
            r0.<init>();
            r1 = 0;
        L_0x0006:
            r2 = r7.length;
            if (r1 >= r2) goto L_0x0046;
        L_0x0009:
            r2 = r6.getClassLoader();	 Catch:{ Exception -> 0x0024 }
            r3 = r7[r1];	 Catch:{ Exception -> 0x0024 }
            r2 = r2.loadClass(r3);	 Catch:{ Exception -> 0x0024 }
            r3 = "descriptor";	 Catch:{ Exception -> 0x0024 }
            r2 = r2.getField(r3);	 Catch:{ Exception -> 0x0024 }
            r3 = 0;	 Catch:{ Exception -> 0x0024 }
            r2 = r2.get(r3);	 Catch:{ Exception -> 0x0024 }
            r2 = (com.google.protobuf.Descriptors.FileDescriptor) r2;	 Catch:{ Exception -> 0x0024 }
            r0.add(r2);	 Catch:{ Exception -> 0x0024 }
            goto L_0x0043;
        L_0x0024:
            r2 = com.google.protobuf.Descriptors.logger;
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r4 = "Descriptors for \"";
            r3.append(r4);
            r4 = r8[r1];
            r3.append(r4);
            r4 = "\" can not be found.";
            r3.append(r4);
            r3 = r3.toString();
            r2.warning(r3);
        L_0x0043:
            r1 = r1 + 1;
            goto L_0x0006;
        L_0x0046:
            r6 = r0.size();
            r6 = new com.google.protobuf.Descriptors.FileDescriptor[r6];
            r0.toArray(r6);
            internalBuildGeneratedFileFrom(r5, r6, r9);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(java.lang.String[], java.lang.Class, java.lang.String[], java.lang.String[], com.google.protobuf.Descriptors$FileDescriptor$InternalDescriptorAssigner):void");
        }

        public static void internalUpdateFileDescriptor(FileDescriptor fileDescriptor, ExtensionRegistry extensionRegistry) {
            try {
                fileDescriptor.setProto(FileDescriptorProto.parseFrom(fileDescriptor.proto.toByteString(), (ExtensionRegistryLite) extensionRegistry));
            } catch (FileDescriptor fileDescriptor2) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", fileDescriptor2);
            }
        }

        private FileDescriptor(FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, DescriptorPool descriptorPool, boolean z) throws DescriptorValidationException {
            int publicDependency;
            this.pool = descriptorPool;
            this.proto = fileDescriptorProto;
            this.dependencies = (FileDescriptor[]) fileDescriptorArr.clone();
            HashMap hashMap = new HashMap();
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                hashMap.put(fileDescriptor.getName(), fileDescriptor);
            }
            fileDescriptorArr = new ArrayList();
            int i = 0;
            while (i < fileDescriptorProto.getPublicDependencyCount()) {
                publicDependency = fileDescriptorProto.getPublicDependency(i);
                if (publicDependency >= 0) {
                    if (publicDependency < fileDescriptorProto.getDependencyCount()) {
                        String dependency = fileDescriptorProto.getDependency(publicDependency);
                        FileDescriptor fileDescriptor2 = (FileDescriptor) hashMap.get(dependency);
                        if (fileDescriptor2 != null) {
                            fileDescriptorArr.add(fileDescriptor2);
                        } else if (!z) {
                            fileDescriptorArr = new StringBuilder();
                            fileDescriptorArr.append("Invalid public dependency: ");
                            fileDescriptorArr.append(dependency);
                            throw new DescriptorValidationException(this, fileDescriptorArr.toString());
                        }
                        i++;
                    }
                }
                throw new DescriptorValidationException(this, "Invalid public dependency index.");
            }
            this.publicDependencies = new FileDescriptor[fileDescriptorArr.size()];
            fileDescriptorArr.toArray(this.publicDependencies);
            descriptorPool.addPackage(getPackage(), this);
            this.messageTypes = new Descriptor[fileDescriptorProto.getMessageTypeCount()];
            for (fileDescriptorArr = null; fileDescriptorArr < fileDescriptorProto.getMessageTypeCount(); fileDescriptorArr++) {
                this.messageTypes[fileDescriptorArr] = new Descriptor(fileDescriptorProto.getMessageType(fileDescriptorArr), this, null, fileDescriptorArr);
            }
            this.enumTypes = new EnumDescriptor[fileDescriptorProto.getEnumTypeCount()];
            for (fileDescriptorArr = null; fileDescriptorArr < fileDescriptorProto.getEnumTypeCount(); fileDescriptorArr++) {
                this.enumTypes[fileDescriptorArr] = new EnumDescriptor(fileDescriptorProto.getEnumType(fileDescriptorArr), this, null, fileDescriptorArr);
            }
            this.services = new ServiceDescriptor[fileDescriptorProto.getServiceCount()];
            for (fileDescriptorArr = null; fileDescriptorArr < fileDescriptorProto.getServiceCount(); fileDescriptorArr++) {
                this.services[fileDescriptorArr] = new ServiceDescriptor(fileDescriptorProto.getService(fileDescriptorArr), this, fileDescriptorArr);
            }
            this.extensions = new FieldDescriptor[fileDescriptorProto.getExtensionCount()];
            for (int i2 = 0; i2 < fileDescriptorProto.getExtensionCount(); i2++) {
                this.extensions[i2] = new FieldDescriptor(fileDescriptorProto.getExtension(i2), this, null, i2, true);
            }
        }

        FileDescriptor(String str, Descriptor descriptor) throws DescriptorValidationException {
            this.pool = new DescriptorPool(new FileDescriptor[0], true);
            FileDescriptorProto.Builder newBuilder = FileDescriptorProto.newBuilder();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(descriptor.getFullName());
            stringBuilder.append(".placeholder.proto");
            this.proto = newBuilder.setName(stringBuilder.toString()).setPackage(str).addMessageType(descriptor.toProto()).build();
            this.dependencies = new FileDescriptor[0];
            this.publicDependencies = new FileDescriptor[0];
            this.messageTypes = new Descriptor[]{descriptor};
            this.enumTypes = new EnumDescriptor[0];
            this.services = new ServiceDescriptor[0];
            this.extensions = new FieldDescriptor[0];
            this.pool.addPackage(str, this);
            this.pool.addSymbol(descriptor);
        }

        private void crossLink() throws DescriptorValidationException {
            for (Descriptor access$700 : this.messageTypes) {
                access$700.crossLink();
            }
            for (ServiceDescriptor access$800 : this.services) {
                access$800.crossLink();
            }
            for (FieldDescriptor access$900 : this.extensions) {
                access$900.crossLink();
            }
        }

        private void setProto(FileDescriptorProto fileDescriptorProto) {
            int i;
            this.proto = fileDescriptorProto;
            for (i = 0; i < this.messageTypes.length; i++) {
                this.messageTypes[i].setProto(fileDescriptorProto.getMessageType(i));
            }
            for (i = 0; i < this.enumTypes.length; i++) {
                this.enumTypes[i].setProto(fileDescriptorProto.getEnumType(i));
            }
            for (i = 0; i < this.services.length; i++) {
                this.services[i].setProto(fileDescriptorProto.getService(i));
            }
            for (int i2 = 0; i2 < this.extensions.length; i2++) {
                this.extensions[i2].setProto(fileDescriptorProto.getExtension(i2));
            }
        }

        boolean supportsUnknownEnumValue() {
            return getSyntax() == Syntax.PROTO3;
        }
    }

    public static final class MethodDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private Descriptor inputType;
        private Descriptor outputType;
        private MethodDescriptorProto proto;
        private final ServiceDescriptor service;

        public int getIndex() {
            return this.index;
        }

        public MethodDescriptorProto toProto() {
            return this.proto;
        }

        public String getName() {
            return this.proto.getName();
        }

        public String getFullName() {
            return this.fullName;
        }

        public FileDescriptor getFile() {
            return this.file;
        }

        public ServiceDescriptor getService() {
            return this.service;
        }

        public Descriptor getInputType() {
            return this.inputType;
        }

        public Descriptor getOutputType() {
            return this.outputType;
        }

        public MethodOptions getOptions() {
            return this.proto.getOptions();
        }

        private MethodDescriptor(MethodDescriptorProto methodDescriptorProto, FileDescriptor fileDescriptor, ServiceDescriptor serviceDescriptor, int i) throws DescriptorValidationException {
            this.index = i;
            this.proto = methodDescriptorProto;
            this.file = fileDescriptor;
            this.service = serviceDescriptor;
            i = new StringBuilder();
            i.append(serviceDescriptor.getFullName());
            i.append('.');
            i.append(methodDescriptorProto.getName());
            this.fullName = i.toString();
            fileDescriptor.pool.addSymbol(this);
        }

        private void crossLink() throws DescriptorValidationException {
            GenericDescriptor lookupSymbol = this.file.pool.lookupSymbol(this.proto.getInputType(), this, SearchFilter.TYPES_ONLY);
            if (lookupSymbol instanceof Descriptor) {
                this.inputType = (Descriptor) lookupSymbol;
                lookupSymbol = this.file.pool.lookupSymbol(this.proto.getOutputType(), this, SearchFilter.TYPES_ONLY);
                if (lookupSymbol instanceof Descriptor) {
                    this.outputType = (Descriptor) lookupSymbol;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append('\"');
                stringBuilder.append(this.proto.getOutputType());
                stringBuilder.append("\" is not a message type.");
                throw new DescriptorValidationException((GenericDescriptor) this, stringBuilder.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append('\"');
            stringBuilder.append(this.proto.getInputType());
            stringBuilder.append("\" is not a message type.");
            throw new DescriptorValidationException((GenericDescriptor) this, stringBuilder.toString());
        }

        private void setProto(MethodDescriptorProto methodDescriptorProto) {
            this.proto = methodDescriptorProto;
        }
    }

    public static final class ServiceDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private MethodDescriptor[] methods;
        private ServiceDescriptorProto proto;

        public int getIndex() {
            return this.index;
        }

        public ServiceDescriptorProto toProto() {
            return this.proto;
        }

        public String getName() {
            return this.proto.getName();
        }

        public String getFullName() {
            return this.fullName;
        }

        public FileDescriptor getFile() {
            return this.file;
        }

        public ServiceOptions getOptions() {
            return this.proto.getOptions();
        }

        public List<MethodDescriptor> getMethods() {
            return Collections.unmodifiableList(Arrays.asList(this.methods));
        }

        public MethodDescriptor findMethodByName(String str) {
            DescriptorPool access$1400 = this.file.pool;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.fullName);
            stringBuilder.append('.');
            stringBuilder.append(str);
            str = access$1400.findSymbol(stringBuilder.toString());
            return (str == null || !(str instanceof MethodDescriptor)) ? null : (MethodDescriptor) str;
        }

        private ServiceDescriptor(ServiceDescriptorProto serviceDescriptorProto, FileDescriptor fileDescriptor, int i) throws DescriptorValidationException {
            this.index = i;
            this.proto = serviceDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, null, serviceDescriptorProto.getName());
            this.file = fileDescriptor;
            this.methods = new MethodDescriptor[serviceDescriptorProto.getMethodCount()];
            for (i = 0; i < serviceDescriptorProto.getMethodCount(); i++) {
                this.methods[i] = new MethodDescriptor(serviceDescriptorProto.getMethod(i), fileDescriptor, this, i);
            }
            fileDescriptor.pool.addSymbol(this);
        }

        private void crossLink() throws DescriptorValidationException {
            for (MethodDescriptor access$2900 : this.methods) {
                access$2900.crossLink();
            }
        }

        private void setProto(ServiceDescriptorProto serviceDescriptorProto) {
            this.proto = serviceDescriptorProto;
            for (int i = 0; i < this.methods.length; i++) {
                this.methods[i].setProto(serviceDescriptorProto.getMethod(i));
            }
        }
    }

    private static String computeFullName(FileDescriptor fileDescriptor, Descriptor descriptor, String str) {
        if (descriptor != null) {
            fileDescriptor = new StringBuilder();
            fileDescriptor.append(descriptor.getFullName());
            fileDescriptor.append('.');
            fileDescriptor.append(str);
            return fileDescriptor.toString();
        } else if (fileDescriptor.getPackage().length() <= null) {
            return str;
        } else {
            descriptor = new StringBuilder();
            descriptor.append(fileDescriptor.getPackage());
            descriptor.append('.');
            descriptor.append(str);
            return descriptor.toString();
        }
    }
}
