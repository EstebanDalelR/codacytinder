package com.google.protobuf.compiler;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.DescriptorProtos.FileDescriptorProto;
import com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PluginProtos {
    private static FileDescriptor descriptor;
    /* renamed from: internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor */
    private static final Descriptor f20930x36d642 = ((Descriptor) getDescriptor().getMessageTypes().get(1));
    /* renamed from: internal_static_google_protobuf_compiler_CodeGeneratorRequest_fieldAccessorTable */
    private static final FieldAccessorTable f20931xfc149ac0 = new FieldAccessorTable(f20930x36d642, new String[]{"FileToGenerate", "Parameter", "ProtoFile", "CompilerVersion"});
    /* renamed from: internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor */
    private static final Descriptor f20932xcaba06d7 = ((Descriptor) f20934x140ff76a.getNestedTypes().get(0));
    /* renamed from: internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_fieldAccessorTable */
    private static final FieldAccessorTable f20933xb43c6655 = new FieldAccessorTable(f20932xcaba06d7, new String[]{"Name", "InsertionPoint", "Content"});
    /* renamed from: internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor */
    private static final Descriptor f20934x140ff76a = ((Descriptor) getDescriptor().getMessageTypes().get(2));
    /* renamed from: internal_static_google_protobuf_compiler_CodeGeneratorResponse_fieldAccessorTable */
    private static final FieldAccessorTable f20935x23ee13e8 = new FieldAccessorTable(f20934x140ff76a, new String[]{"Error", "File"});
    private static final Descriptor internal_static_google_protobuf_compiler_Version_descriptor = ((Descriptor) getDescriptor().getMessageTypes().get(0));
    /* renamed from: internal_static_google_protobuf_compiler_Version_fieldAccessorTable */
    private static final FieldAccessorTable f20936xc9007e77 = new FieldAccessorTable(internal_static_google_protobuf_compiler_Version_descriptor, new String[]{"Major", "Minor", "Patch", "Suffix"});

    /* renamed from: com.google.protobuf.compiler.PluginProtos$1 */
    static class C69901 implements InternalDescriptorAssigner {
        C69901() {
        }

        public ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor) {
            PluginProtos.descriptor = fileDescriptor;
            return null;
        }
    }

    public interface CodeGeneratorRequestOrBuilder extends MessageOrBuilder {
        Version getCompilerVersion();

        VersionOrBuilder getCompilerVersionOrBuilder();

        String getFileToGenerate(int i);

        ByteString getFileToGenerateBytes(int i);

        int getFileToGenerateCount();

        List<String> getFileToGenerateList();

        String getParameter();

        ByteString getParameterBytes();

        FileDescriptorProto getProtoFile(int i);

        int getProtoFileCount();

        List<FileDescriptorProto> getProtoFileList();

        FileDescriptorProtoOrBuilder getProtoFileOrBuilder(int i);

        List<? extends FileDescriptorProtoOrBuilder> getProtoFileOrBuilderList();

        boolean hasCompilerVersion();

        boolean hasParameter();
    }

    public interface CodeGeneratorResponseOrBuilder extends MessageOrBuilder {
        String getError();

        ByteString getErrorBytes();

        File getFile(int i);

        int getFileCount();

        List<File> getFileList();

        FileOrBuilder getFileOrBuilder(int i);

        List<? extends FileOrBuilder> getFileOrBuilderList();

        boolean hasError();
    }

    public interface VersionOrBuilder extends MessageOrBuilder {
        int getMajor();

        int getMinor();

        int getPatch();

        String getSuffix();

        ByteString getSuffixBytes();

        boolean hasMajor();

        boolean hasMinor();

        boolean hasPatch();

        boolean hasSuffix();
    }

    public static final class CodeGeneratorRequest extends GeneratedMessageV3 implements CodeGeneratorRequestOrBuilder {
        public static final int COMPILER_VERSION_FIELD_NUMBER = 3;
        private static final CodeGeneratorRequest DEFAULT_INSTANCE = new CodeGeneratorRequest();
        public static final int FILE_TO_GENERATE_FIELD_NUMBER = 1;
        public static final int PARAMETER_FIELD_NUMBER = 2;
        @Deprecated
        public static final Parser<CodeGeneratorRequest> PARSER = new C77961();
        public static final int PROTO_FILE_FIELD_NUMBER = 15;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Version compilerVersion_;
        private LazyStringList fileToGenerate_;
        private byte memoizedIsInitialized;
        private volatile Object parameter_;
        private List<FileDescriptorProto> protoFile_;

        /* renamed from: com.google.protobuf.compiler.PluginProtos$CodeGeneratorRequest$1 */
        static class C77961 extends AbstractParser<CodeGeneratorRequest> {
            C77961() {
            }

            public CodeGeneratorRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CodeGeneratorRequest(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements CodeGeneratorRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Version, Builder, VersionOrBuilder> compilerVersionBuilder_;
            private Version compilerVersion_;
            private LazyStringList fileToGenerate_;
            private Object parameter_;
            private RepeatedFieldBuilderV3<FileDescriptorProto, com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder, FileDescriptorProtoOrBuilder> protoFileBuilder_;
            private List<FileDescriptorProto> protoFile_;

            public static final Descriptor getDescriptor() {
                return PluginProtos.f20930x36d642;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PluginProtos.f20931xfc149ac0.ensureFieldAccessorsInitialized(CodeGeneratorRequest.class, Builder.class);
            }

            private Builder() {
                this.fileToGenerate_ = LazyStringArrayList.EMPTY;
                this.parameter_ = "";
                this.protoFile_ = Collections.emptyList();
                this.compilerVersion_ = null;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.fileToGenerate_ = LazyStringArrayList.EMPTY;
                this.parameter_ = "";
                this.protoFile_ = Collections.emptyList();
                this.compilerVersion_ = null;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (CodeGeneratorRequest.alwaysUseFieldBuilders) {
                    getProtoFileFieldBuilder();
                    getCompilerVersionFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.fileToGenerate_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.parameter_ = "";
                this.bitField0_ &= -3;
                if (this.protoFileBuilder_ == null) {
                    this.protoFile_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    this.protoFileBuilder_.clear();
                }
                if (this.compilerVersionBuilder_ == null) {
                    this.compilerVersion_ = null;
                } else {
                    this.compilerVersionBuilder_.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public Descriptor getDescriptorForType() {
                return PluginProtos.f20930x36d642;
            }

            public CodeGeneratorRequest getDefaultInstanceForType() {
                return CodeGeneratorRequest.getDefaultInstance();
            }

            public CodeGeneratorRequest build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public CodeGeneratorRequest buildPartial() {
                CodeGeneratorRequest codeGeneratorRequest = new CodeGeneratorRequest((com.google.protobuf.GeneratedMessageV3.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((this.bitField0_ & 1) == 1) {
                    this.fileToGenerate_ = this.fileToGenerate_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                codeGeneratorRequest.fileToGenerate_ = this.fileToGenerate_;
                if ((i & 2) != 2) {
                    i2 = 0;
                }
                codeGeneratorRequest.parameter_ = this.parameter_;
                if (this.protoFileBuilder_ == null) {
                    if ((this.bitField0_ & 4) == 4) {
                        this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                        this.bitField0_ &= -5;
                    }
                    codeGeneratorRequest.protoFile_ = this.protoFile_;
                } else {
                    codeGeneratorRequest.protoFile_ = this.protoFileBuilder_.build();
                }
                if ((i & 8) == 8) {
                    i2 |= 2;
                }
                if (this.compilerVersionBuilder_ == null) {
                    codeGeneratorRequest.compilerVersion_ = this.compilerVersion_;
                } else {
                    codeGeneratorRequest.compilerVersion_ = (Version) this.compilerVersionBuilder_.build();
                }
                codeGeneratorRequest.bitField0_ = i2;
                onBuilt();
                return codeGeneratorRequest;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CodeGeneratorRequest) {
                    return mergeFrom((CodeGeneratorRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CodeGeneratorRequest codeGeneratorRequest) {
                if (codeGeneratorRequest == CodeGeneratorRequest.getDefaultInstance()) {
                    return this;
                }
                if (!codeGeneratorRequest.fileToGenerate_.isEmpty()) {
                    if (this.fileToGenerate_.isEmpty()) {
                        this.fileToGenerate_ = codeGeneratorRequest.fileToGenerate_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFileToGenerateIsMutable();
                        this.fileToGenerate_.addAll(codeGeneratorRequest.fileToGenerate_);
                    }
                    onChanged();
                }
                if (codeGeneratorRequest.hasParameter()) {
                    this.bitField0_ |= 2;
                    this.parameter_ = codeGeneratorRequest.parameter_;
                    onChanged();
                }
                if (this.protoFileBuilder_ == null) {
                    if (!codeGeneratorRequest.protoFile_.isEmpty()) {
                        if (this.protoFile_.isEmpty()) {
                            this.protoFile_ = codeGeneratorRequest.protoFile_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureProtoFileIsMutable();
                            this.protoFile_.addAll(codeGeneratorRequest.protoFile_);
                        }
                        onChanged();
                    }
                } else if (!codeGeneratorRequest.protoFile_.isEmpty()) {
                    if (this.protoFileBuilder_.isEmpty()) {
                        this.protoFileBuilder_.dispose();
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = null;
                        this.protoFileBuilder_ = null;
                        this.protoFile_ = codeGeneratorRequest.protoFile_;
                        this.bitField0_ &= -5;
                        if (CodeGeneratorRequest.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getProtoFileFieldBuilder();
                        }
                        this.protoFileBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.protoFileBuilder_.addAllMessages(codeGeneratorRequest.protoFile_);
                    }
                }
                if (codeGeneratorRequest.hasCompilerVersion()) {
                    mergeCompilerVersion(codeGeneratorRequest.getCompilerVersion());
                }
                mergeUnknownFields(codeGeneratorRequest.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getProtoFileCount(); i++) {
                    if (!getProtoFile(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                CodeGeneratorRequest codeGeneratorRequest;
                CodeGeneratorRequest codeGeneratorRequest2 = null;
                try {
                    CodeGeneratorRequest codeGeneratorRequest3 = (CodeGeneratorRequest) CodeGeneratorRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (codeGeneratorRequest3 != null) {
                        mergeFrom(codeGeneratorRequest3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    codeGeneratorRequest = (CodeGeneratorRequest) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    codeGeneratorRequest2 = codeGeneratorRequest;
                    if (codeGeneratorRequest2 != null) {
                        mergeFrom(codeGeneratorRequest2);
                    }
                    throw codedInputStream2;
                }
            }

            private void ensureFileToGenerateIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.fileToGenerate_ = new LazyStringArrayList(this.fileToGenerate_);
                    this.bitField0_ |= 1;
                }
            }

            public ProtocolStringList getFileToGenerateList() {
                return this.fileToGenerate_.getUnmodifiableView();
            }

            public int getFileToGenerateCount() {
                return this.fileToGenerate_.size();
            }

            public String getFileToGenerate(int i) {
                return (String) this.fileToGenerate_.get(i);
            }

            public ByteString getFileToGenerateBytes(int i) {
                return this.fileToGenerate_.getByteString(i);
            }

            public Builder setFileToGenerate(int i, String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                ensureFileToGenerateIsMutable();
                this.fileToGenerate_.set(i, str);
                onChanged();
                return this;
            }

            public Builder addFileToGenerate(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                ensureFileToGenerateIsMutable();
                this.fileToGenerate_.add(str);
                onChanged();
                return this;
            }

            public Builder addAllFileToGenerate(Iterable<String> iterable) {
                ensureFileToGenerateIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.fileToGenerate_);
                onChanged();
                return this;
            }

            public Builder clearFileToGenerate() {
                this.fileToGenerate_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder addFileToGenerateBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                ensureFileToGenerateIsMutable();
                this.fileToGenerate_.add(byteString);
                onChanged();
                return this;
            }

            public boolean hasParameter() {
                return (this.bitField0_ & 2) == 2;
            }

            public String getParameter() {
                Object obj = this.parameter_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.parameter_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public ByteString getParameterBytes() {
                Object obj = this.parameter_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.parameter_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setParameter(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 2;
                this.parameter_ = str;
                onChanged();
                return this;
            }

            public Builder clearParameter() {
                this.bitField0_ &= -3;
                this.parameter_ = CodeGeneratorRequest.getDefaultInstance().getParameter();
                onChanged();
                return this;
            }

            public Builder setParameterBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 2;
                this.parameter_ = byteString;
                onChanged();
                return this;
            }

            private void ensureProtoFileIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.protoFile_ = new ArrayList(this.protoFile_);
                    this.bitField0_ |= 4;
                }
            }

            public List<FileDescriptorProto> getProtoFileList() {
                if (this.protoFileBuilder_ == null) {
                    return Collections.unmodifiableList(this.protoFile_);
                }
                return this.protoFileBuilder_.getMessageList();
            }

            public int getProtoFileCount() {
                if (this.protoFileBuilder_ == null) {
                    return this.protoFile_.size();
                }
                return this.protoFileBuilder_.getCount();
            }

            public FileDescriptorProto getProtoFile(int i) {
                if (this.protoFileBuilder_ == null) {
                    return (FileDescriptorProto) this.protoFile_.get(i);
                }
                return (FileDescriptorProto) this.protoFileBuilder_.getMessage(i);
            }

            public Builder setProtoFile(int i, FileDescriptorProto fileDescriptorProto) {
                if (this.protoFileBuilder_ != null) {
                    this.protoFileBuilder_.setMessage(i, fileDescriptorProto);
                } else if (fileDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureProtoFileIsMutable();
                    this.protoFile_.set(i, fileDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public Builder setProtoFile(int i, com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder) {
                if (this.protoFileBuilder_ == null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.set(i, builder.build());
                    onChanged();
                } else {
                    this.protoFileBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addProtoFile(FileDescriptorProto fileDescriptorProto) {
                if (this.protoFileBuilder_ != null) {
                    this.protoFileBuilder_.addMessage(fileDescriptorProto);
                } else if (fileDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureProtoFileIsMutable();
                    this.protoFile_.add(fileDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public Builder addProtoFile(int i, FileDescriptorProto fileDescriptorProto) {
                if (this.protoFileBuilder_ != null) {
                    this.protoFileBuilder_.addMessage(i, fileDescriptorProto);
                } else if (fileDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureProtoFileIsMutable();
                    this.protoFile_.add(i, fileDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public Builder addProtoFile(com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder) {
                if (this.protoFileBuilder_ == null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.add(builder.build());
                    onChanged();
                } else {
                    this.protoFileBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public Builder addProtoFile(int i, com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder) {
                if (this.protoFileBuilder_ == null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.add(i, builder.build());
                    onChanged();
                } else {
                    this.protoFileBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllProtoFile(Iterable<? extends FileDescriptorProto> iterable) {
                if (this.protoFileBuilder_ == null) {
                    ensureProtoFileIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.protoFile_);
                    onChanged();
                } else {
                    this.protoFileBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearProtoFile() {
                if (this.protoFileBuilder_ == null) {
                    this.protoFile_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    this.protoFileBuilder_.clear();
                }
                return this;
            }

            public Builder removeProtoFile(int i) {
                if (this.protoFileBuilder_ == null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.remove(i);
                    onChanged();
                } else {
                    this.protoFileBuilder_.remove(i);
                }
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder getProtoFileBuilder(int i) {
                return (com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder) getProtoFileFieldBuilder().getBuilder(i);
            }

            public FileDescriptorProtoOrBuilder getProtoFileOrBuilder(int i) {
                if (this.protoFileBuilder_ == null) {
                    return (FileDescriptorProtoOrBuilder) this.protoFile_.get(i);
                }
                return (FileDescriptorProtoOrBuilder) this.protoFileBuilder_.getMessageOrBuilder(i);
            }

            public List<? extends FileDescriptorProtoOrBuilder> getProtoFileOrBuilderList() {
                if (this.protoFileBuilder_ != null) {
                    return this.protoFileBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.protoFile_);
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addProtoFileBuilder() {
                return (com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder) getProtoFileFieldBuilder().addBuilder(FileDescriptorProto.getDefaultInstance());
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addProtoFileBuilder(int i) {
                return (com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder) getProtoFileFieldBuilder().addBuilder(i, FileDescriptorProto.getDefaultInstance());
            }

            public List<com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder> getProtoFileBuilderList() {
                return getProtoFileFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<FileDescriptorProto, com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder, FileDescriptorProtoOrBuilder> getProtoFileFieldBuilder() {
                if (this.protoFileBuilder_ == null) {
                    this.protoFileBuilder_ = new RepeatedFieldBuilderV3(this.protoFile_, (this.bitField0_ & 4) == 4, getParentForChildren(), isClean());
                    this.protoFile_ = null;
                }
                return this.protoFileBuilder_;
            }

            public boolean hasCompilerVersion() {
                return (this.bitField0_ & 8) == 8;
            }

            public Version getCompilerVersion() {
                if (this.compilerVersionBuilder_ != null) {
                    return (Version) this.compilerVersionBuilder_.getMessage();
                }
                return this.compilerVersion_ == null ? Version.getDefaultInstance() : this.compilerVersion_;
            }

            public Builder setCompilerVersion(Version version) {
                if (this.compilerVersionBuilder_ != null) {
                    this.compilerVersionBuilder_.setMessage(version);
                } else if (version == null) {
                    throw new NullPointerException();
                } else {
                    this.compilerVersion_ = version;
                    onChanged();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setCompilerVersion(Builder builder) {
                if (this.compilerVersionBuilder_ == null) {
                    this.compilerVersion_ = builder.build();
                    onChanged();
                } else {
                    this.compilerVersionBuilder_.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeCompilerVersion(Version version) {
                if (this.compilerVersionBuilder_ == null) {
                    if ((this.bitField0_ & 8) != 8 || this.compilerVersion_ == null || this.compilerVersion_ == Version.getDefaultInstance()) {
                        this.compilerVersion_ = version;
                    } else {
                        this.compilerVersion_ = Version.newBuilder(this.compilerVersion_).mergeFrom(version).buildPartial();
                    }
                    onChanged();
                } else {
                    this.compilerVersionBuilder_.mergeFrom(version);
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder clearCompilerVersion() {
                if (this.compilerVersionBuilder_ == null) {
                    this.compilerVersion_ = null;
                    onChanged();
                } else {
                    this.compilerVersionBuilder_.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public Builder getCompilerVersionBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (Builder) getCompilerVersionFieldBuilder().getBuilder();
            }

            public VersionOrBuilder getCompilerVersionOrBuilder() {
                if (this.compilerVersionBuilder_ != null) {
                    return (VersionOrBuilder) this.compilerVersionBuilder_.getMessageOrBuilder();
                }
                return this.compilerVersion_ == null ? Version.getDefaultInstance() : this.compilerVersion_;
            }

            private SingleFieldBuilderV3<Version, Builder, VersionOrBuilder> getCompilerVersionFieldBuilder() {
                if (this.compilerVersionBuilder_ == null) {
                    this.compilerVersionBuilder_ = new SingleFieldBuilderV3(getCompilerVersion(), getParentForChildren(), isClean());
                    this.compilerVersion_ = null;
                }
                return this.compilerVersionBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        private CodeGeneratorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private CodeGeneratorRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.fileToGenerate_ = LazyStringArrayList.EMPTY;
            this.parameter_ = "";
            this.protoFile_ = Collections.emptyList();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CodeGeneratorRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            Object obj = null;
            int i = 0;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        ByteString readBytes;
                        if (readTag == 10) {
                            readBytes = codedInputStream.readBytes();
                            if ((i & 1) != 1) {
                                this.fileToGenerate_ = new LazyStringArrayList();
                                i |= 1;
                            }
                            this.fileToGenerate_.add(readBytes);
                        } else if (readTag == 18) {
                            readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= 1;
                            this.parameter_ = readBytes;
                        } else if (readTag == 26) {
                            Builder builder = null;
                            if ((this.bitField0_ & 2) == 2) {
                                builder = this.compilerVersion_.toBuilder();
                            }
                            this.compilerVersion_ = (Version) codedInputStream.readMessage(Version.PARSER, extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.compilerVersion_);
                                this.compilerVersion_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 2;
                        } else if (readTag == 122) {
                            if ((i & 4) != 4) {
                                this.protoFile_ = new ArrayList();
                                i |= 4;
                            }
                            this.protoFile_.add(codedInputStream.readMessage(FileDescriptorProto.PARSER, extensionRegistryLite));
                        } else if (parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    obj = 1;
                } catch (CodedInputStream codedInputStream2) {
                    throw codedInputStream2.setUnfinishedMessage(this);
                } catch (IOException e) {
                    throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.fileToGenerate_ = this.fileToGenerate_.getUnmodifiableView();
                    }
                    if ((i & 4) == 4) {
                        this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
            if ((i & 1) == 1) {
                this.fileToGenerate_ = this.fileToGenerate_.getUnmodifiableView();
            }
            if ((i & 4) == 4) {
                this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptor getDescriptor() {
            return PluginProtos.f20930x36d642;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.f20931xfc149ac0.ensureFieldAccessorsInitialized(CodeGeneratorRequest.class, Builder.class);
        }

        public ProtocolStringList getFileToGenerateList() {
            return this.fileToGenerate_;
        }

        public int getFileToGenerateCount() {
            return this.fileToGenerate_.size();
        }

        public String getFileToGenerate(int i) {
            return (String) this.fileToGenerate_.get(i);
        }

        public ByteString getFileToGenerateBytes(int i) {
            return this.fileToGenerate_.getByteString(i);
        }

        public boolean hasParameter() {
            return (this.bitField0_ & 1) == 1;
        }

        public String getParameter() {
            Object obj = this.parameter_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.parameter_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public ByteString getParameterBytes() {
            Object obj = this.parameter_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.parameter_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public List<FileDescriptorProto> getProtoFileList() {
            return this.protoFile_;
        }

        public List<? extends FileDescriptorProtoOrBuilder> getProtoFileOrBuilderList() {
            return this.protoFile_;
        }

        public int getProtoFileCount() {
            return this.protoFile_.size();
        }

        public FileDescriptorProto getProtoFile(int i) {
            return (FileDescriptorProto) this.protoFile_.get(i);
        }

        public FileDescriptorProtoOrBuilder getProtoFileOrBuilder(int i) {
            return (FileDescriptorProtoOrBuilder) this.protoFile_.get(i);
        }

        public boolean hasCompilerVersion() {
            return (this.bitField0_ & 2) == 2;
        }

        public Version getCompilerVersion() {
            return this.compilerVersion_ == null ? Version.getDefaultInstance() : this.compilerVersion_;
        }

        public VersionOrBuilder getCompilerVersionOrBuilder() {
            return this.compilerVersion_ == null ? Version.getDefaultInstance() : this.compilerVersion_;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            int i = 0;
            while (i < getProtoFileCount()) {
                if (getProtoFile(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = 0;
            for (int i2 = 0; i2 < this.fileToGenerate_.size(); i2++) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.fileToGenerate_.getRaw(i2));
            }
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.parameter_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(3, getCompilerVersion());
            }
            while (i < this.protoFile_.size()) {
                codedOutputStream.writeMessage(15, (MessageLite) this.protoFile_.get(i));
                i++;
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.fileToGenerate_.size(); i3++) {
                i2 += GeneratedMessageV3.computeStringSizeNoTag(this.fileToGenerate_.getRaw(i3));
            }
            i2 = (i2 + 0) + (getFileToGenerateList().size() * 1);
            if ((this.bitField0_ & 1) == 1) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.parameter_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeMessageSize(3, getCompilerVersion());
            }
            while (i < this.protoFile_.size()) {
                i2 += CodedOutputStream.computeMessageSize(15, (MessageLite) this.protoFile_.get(i));
                i++;
            }
            i2 += this.unknownFields.getSerializedSize();
            this.memoizedSize = i2;
            return i2;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeGeneratorRequest)) {
                return super.equals(obj);
            }
            CodeGeneratorRequest codeGeneratorRequest = (CodeGeneratorRequest) obj;
            Object obj2 = ((getFileToGenerateList().equals(codeGeneratorRequest.getFileToGenerateList()) ? 1 : null) == null || hasParameter() != codeGeneratorRequest.hasParameter()) ? null : 1;
            if (hasParameter()) {
                obj2 = (obj2 == null || !getParameter().equals(codeGeneratorRequest.getParameter())) ? null : 1;
            }
            obj2 = (obj2 == null || !getProtoFileList().equals(codeGeneratorRequest.getProtoFileList())) ? null : 1;
            obj2 = (obj2 == null || hasCompilerVersion() != codeGeneratorRequest.hasCompilerVersion()) ? null : 1;
            if (hasCompilerVersion()) {
                obj2 = (obj2 == null || !getCompilerVersion().equals(codeGeneratorRequest.getCompilerVersion())) ? null : 1;
            }
            if (obj2 == null || this.unknownFields.equals(codeGeneratorRequest.unknownFields) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (getFileToGenerateCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getFileToGenerateList().hashCode();
            }
            if (hasParameter()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getParameter().hashCode();
            }
            if (getProtoFileCount() > 0) {
                hashCode = (((hashCode * 37) + 15) * 53) + getProtoFileList().hashCode();
            }
            if (hasCompilerVersion()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getCompilerVersion().hashCode();
            }
            hashCode = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CodeGeneratorRequest) PARSER.parseFrom(byteBuffer);
        }

        public static CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CodeGeneratorRequest) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CodeGeneratorRequest) PARSER.parseFrom(byteString);
        }

        public static CodeGeneratorRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CodeGeneratorRequest) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CodeGeneratorRequest) PARSER.parseFrom(bArr);
        }

        public static CodeGeneratorRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CodeGeneratorRequest) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CodeGeneratorRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CodeGeneratorRequest codeGeneratorRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(codeGeneratorRequest);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        protected Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static CodeGeneratorRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CodeGeneratorRequest> parser() {
            return PARSER;
        }

        public Parser<CodeGeneratorRequest> getParserForType() {
            return PARSER;
        }

        public CodeGeneratorRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CodeGeneratorResponse extends GeneratedMessageV3 implements CodeGeneratorResponseOrBuilder {
        private static final CodeGeneratorResponse DEFAULT_INSTANCE = new CodeGeneratorResponse();
        public static final int ERROR_FIELD_NUMBER = 1;
        public static final int FILE_FIELD_NUMBER = 15;
        @Deprecated
        public static final Parser<CodeGeneratorResponse> PARSER = new C77971();
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object error_;
        private List<File> file_;
        private byte memoizedIsInitialized;

        /* renamed from: com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$1 */
        static class C77971 extends AbstractParser<CodeGeneratorResponse> {
            C77971() {
            }

            public CodeGeneratorResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CodeGeneratorResponse(codedInputStream, extensionRegistryLite);
            }
        }

        public interface FileOrBuilder extends MessageOrBuilder {
            String getContent();

            ByteString getContentBytes();

            String getInsertionPoint();

            ByteString getInsertionPointBytes();

            String getName();

            ByteString getNameBytes();

            boolean hasContent();

            boolean hasInsertionPoint();

            boolean hasName();
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements CodeGeneratorResponseOrBuilder {
            private int bitField0_;
            private Object error_;
            private RepeatedFieldBuilderV3<File, Builder, FileOrBuilder> fileBuilder_;
            private List<File> file_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptor getDescriptor() {
                return PluginProtos.f20934x140ff76a;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PluginProtos.f20935x23ee13e8.ensureFieldAccessorsInitialized(CodeGeneratorResponse.class, Builder.class);
            }

            private Builder() {
                this.error_ = "";
                this.file_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.error_ = "";
                this.file_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (CodeGeneratorResponse.alwaysUseFieldBuilders) {
                    getFileFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.error_ = "";
                this.bitField0_ &= -2;
                if (this.fileBuilder_ == null) {
                    this.file_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.fileBuilder_.clear();
                }
                return this;
            }

            public Descriptor getDescriptorForType() {
                return PluginProtos.f20934x140ff76a;
            }

            public CodeGeneratorResponse getDefaultInstanceForType() {
                return CodeGeneratorResponse.getDefaultInstance();
            }

            public CodeGeneratorResponse build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public CodeGeneratorResponse buildPartial() {
                CodeGeneratorResponse codeGeneratorResponse = new CodeGeneratorResponse((com.google.protobuf.GeneratedMessageV3.Builder) this);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                codeGeneratorResponse.error_ = this.error_;
                if (this.fileBuilder_ == null) {
                    if ((this.bitField0_ & 2) == 2) {
                        this.file_ = Collections.unmodifiableList(this.file_);
                        this.bitField0_ &= -3;
                    }
                    codeGeneratorResponse.file_ = this.file_;
                } else {
                    codeGeneratorResponse.file_ = this.fileBuilder_.build();
                }
                codeGeneratorResponse.bitField0_ = i;
                onBuilt();
                return codeGeneratorResponse;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CodeGeneratorResponse) {
                    return mergeFrom((CodeGeneratorResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CodeGeneratorResponse codeGeneratorResponse) {
                if (codeGeneratorResponse == CodeGeneratorResponse.getDefaultInstance()) {
                    return this;
                }
                if (codeGeneratorResponse.hasError()) {
                    this.bitField0_ |= 1;
                    this.error_ = codeGeneratorResponse.error_;
                    onChanged();
                }
                if (this.fileBuilder_ == null) {
                    if (!codeGeneratorResponse.file_.isEmpty()) {
                        if (this.file_.isEmpty()) {
                            this.file_ = codeGeneratorResponse.file_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureFileIsMutable();
                            this.file_.addAll(codeGeneratorResponse.file_);
                        }
                        onChanged();
                    }
                } else if (!codeGeneratorResponse.file_.isEmpty()) {
                    if (this.fileBuilder_.isEmpty()) {
                        this.fileBuilder_.dispose();
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = null;
                        this.fileBuilder_ = null;
                        this.file_ = codeGeneratorResponse.file_;
                        this.bitField0_ &= -3;
                        if (CodeGeneratorResponse.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getFileFieldBuilder();
                        }
                        this.fileBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.fileBuilder_.addAllMessages(codeGeneratorResponse.file_);
                    }
                }
                mergeUnknownFields(codeGeneratorResponse.unknownFields);
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                CodeGeneratorResponse codeGeneratorResponse;
                CodeGeneratorResponse codeGeneratorResponse2 = null;
                try {
                    CodeGeneratorResponse codeGeneratorResponse3 = (CodeGeneratorResponse) CodeGeneratorResponse.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (codeGeneratorResponse3 != null) {
                        mergeFrom(codeGeneratorResponse3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    codeGeneratorResponse = (CodeGeneratorResponse) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    codeGeneratorResponse2 = codeGeneratorResponse;
                    if (codeGeneratorResponse2 != null) {
                        mergeFrom(codeGeneratorResponse2);
                    }
                    throw codedInputStream2;
                }
            }

            public boolean hasError() {
                return (this.bitField0_ & 1) == 1;
            }

            public String getError() {
                Object obj = this.error_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.error_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public ByteString getErrorBytes() {
                Object obj = this.error_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.error_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setError(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 1;
                this.error_ = str;
                onChanged();
                return this;
            }

            public Builder clearError() {
                this.bitField0_ &= -2;
                this.error_ = CodeGeneratorResponse.getDefaultInstance().getError();
                onChanged();
                return this;
            }

            public Builder setErrorBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 1;
                this.error_ = byteString;
                onChanged();
                return this;
            }

            private void ensureFileIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.file_ = new ArrayList(this.file_);
                    this.bitField0_ |= 2;
                }
            }

            public List<File> getFileList() {
                if (this.fileBuilder_ == null) {
                    return Collections.unmodifiableList(this.file_);
                }
                return this.fileBuilder_.getMessageList();
            }

            public int getFileCount() {
                if (this.fileBuilder_ == null) {
                    return this.file_.size();
                }
                return this.fileBuilder_.getCount();
            }

            public File getFile(int i) {
                if (this.fileBuilder_ == null) {
                    return (File) this.file_.get(i);
                }
                return (File) this.fileBuilder_.getMessage(i);
            }

            public Builder setFile(int i, File file) {
                if (this.fileBuilder_ != null) {
                    this.fileBuilder_.setMessage(i, file);
                } else if (file == null) {
                    throw new NullPointerException();
                } else {
                    ensureFileIsMutable();
                    this.file_.set(i, file);
                    onChanged();
                }
                return this;
            }

            public Builder setFile(int i, Builder builder) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    this.file_.set(i, builder.build());
                    onChanged();
                } else {
                    this.fileBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addFile(File file) {
                if (this.fileBuilder_ != null) {
                    this.fileBuilder_.addMessage(file);
                } else if (file == null) {
                    throw new NullPointerException();
                } else {
                    ensureFileIsMutable();
                    this.file_.add(file);
                    onChanged();
                }
                return this;
            }

            public Builder addFile(int i, File file) {
                if (this.fileBuilder_ != null) {
                    this.fileBuilder_.addMessage(i, file);
                } else if (file == null) {
                    throw new NullPointerException();
                } else {
                    ensureFileIsMutable();
                    this.file_.add(i, file);
                    onChanged();
                }
                return this;
            }

            public Builder addFile(Builder builder) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    this.file_.add(builder.build());
                    onChanged();
                } else {
                    this.fileBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public Builder addFile(int i, Builder builder) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    this.file_.add(i, builder.build());
                    onChanged();
                } else {
                    this.fileBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllFile(Iterable<? extends File> iterable) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.file_);
                    onChanged();
                } else {
                    this.fileBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearFile() {
                if (this.fileBuilder_ == null) {
                    this.file_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    this.fileBuilder_.clear();
                }
                return this;
            }

            public Builder removeFile(int i) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    this.file_.remove(i);
                    onChanged();
                } else {
                    this.fileBuilder_.remove(i);
                }
                return this;
            }

            public Builder getFileBuilder(int i) {
                return (Builder) getFileFieldBuilder().getBuilder(i);
            }

            public FileOrBuilder getFileOrBuilder(int i) {
                if (this.fileBuilder_ == null) {
                    return (FileOrBuilder) this.file_.get(i);
                }
                return (FileOrBuilder) this.fileBuilder_.getMessageOrBuilder(i);
            }

            public List<? extends FileOrBuilder> getFileOrBuilderList() {
                if (this.fileBuilder_ != null) {
                    return this.fileBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.file_);
            }

            public Builder addFileBuilder() {
                return (Builder) getFileFieldBuilder().addBuilder(File.getDefaultInstance());
            }

            public Builder addFileBuilder(int i) {
                return (Builder) getFileFieldBuilder().addBuilder(i, File.getDefaultInstance());
            }

            public List<Builder> getFileBuilderList() {
                return getFileFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<File, Builder, FileOrBuilder> getFileFieldBuilder() {
                if (this.fileBuilder_ == null) {
                    this.fileBuilder_ = new RepeatedFieldBuilderV3(this.file_, (this.bitField0_ & 2) == 2, getParentForChildren(), isClean());
                    this.file_ = null;
                }
                return this.fileBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static final class File extends GeneratedMessageV3 implements FileOrBuilder {
            public static final int CONTENT_FIELD_NUMBER = 15;
            private static final File DEFAULT_INSTANCE = new File();
            public static final int INSERTION_POINT_FIELD_NUMBER = 2;
            public static final int NAME_FIELD_NUMBER = 1;
            @Deprecated
            public static final Parser<File> PARSER = new C77981();
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object content_;
            private volatile Object insertionPoint_;
            private byte memoizedIsInitialized;
            private volatile Object name_;

            /* renamed from: com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$File$1 */
            static class C77981 extends AbstractParser<File> {
                C77981() {
                }

                public File parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new File(codedInputStream, extensionRegistryLite);
                }
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements FileOrBuilder {
                private int bitField0_;
                private Object content_;
                private Object insertionPoint_;
                private Object name_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptor getDescriptor() {
                    return PluginProtos.f20932xcaba06d7;
                }

                protected FieldAccessorTable internalGetFieldAccessorTable() {
                    return PluginProtos.f20933xb43c6655.ensureFieldAccessorsInitialized(File.class, Builder.class);
                }

                private Builder() {
                    this.name_ = "";
                    this.insertionPoint_ = "";
                    this.content_ = "";
                    maybeForceBuilderInitialization();
                }

                private Builder(BuilderParent builderParent) {
                    super(builderParent);
                    this.name_ = "";
                    this.insertionPoint_ = "";
                    this.content_ = "";
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    File.alwaysUseFieldBuilders;
                }

                public Builder clear() {
                    super.clear();
                    this.name_ = "";
                    this.bitField0_ &= -2;
                    this.insertionPoint_ = "";
                    this.bitField0_ &= -3;
                    this.content_ = "";
                    this.bitField0_ &= -5;
                    return this;
                }

                public Descriptor getDescriptorForType() {
                    return PluginProtos.f20932xcaba06d7;
                }

                public File getDefaultInstanceForType() {
                    return File.getDefaultInstance();
                }

                public File build() {
                    Object buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
                }

                public File buildPartial() {
                    File file = new File((com.google.protobuf.GeneratedMessageV3.Builder) this);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    file.name_ = this.name_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    file.insertionPoint_ = this.insertionPoint_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    file.content_ = this.content_;
                    file.bitField0_ = i2;
                    onBuilt();
                    return file;
                }

                public Builder clone() {
                    return (Builder) super.clone();
                }

                public Builder setField(FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder clearField(FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearOneof(OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
                }

                public Builder addRepeatedField(FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                public Builder mergeFrom(Message message) {
                    if (message instanceof File) {
                        return mergeFrom((File) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(File file) {
                    if (file == File.getDefaultInstance()) {
                        return this;
                    }
                    if (file.hasName()) {
                        this.bitField0_ |= 1;
                        this.name_ = file.name_;
                        onChanged();
                    }
                    if (file.hasInsertionPoint()) {
                        this.bitField0_ |= 2;
                        this.insertionPoint_ = file.insertionPoint_;
                        onChanged();
                    }
                    if (file.hasContent()) {
                        this.bitField0_ |= 4;
                        this.content_ = file.content_;
                        onChanged();
                    }
                    mergeUnknownFields(file.unknownFields);
                    onChanged();
                    return this;
                }

                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    File file;
                    File file2 = null;
                    try {
                        File file3 = (File) File.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (file3 != null) {
                            mergeFrom(file3);
                        }
                        return this;
                    } catch (CodedInputStream codedInputStream2) {
                        file = (File) codedInputStream2.getUnfinishedMessage();
                        throw codedInputStream2.unwrapIOException();
                    } catch (Throwable th) {
                        codedInputStream2 = th;
                        file2 = file;
                        if (file2 != null) {
                            mergeFrom(file2);
                        }
                        throw codedInputStream2;
                    }
                }

                public boolean hasName() {
                    return (this.bitField0_ & 1) == 1;
                }

                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String toStringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.name_ = toStringUtf8;
                    }
                    return toStringUtf8;
                }

                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setName(String str) {
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 1;
                    this.name_ = str;
                    onChanged();
                    return this;
                }

                public Builder clearName() {
                    this.bitField0_ &= -2;
                    this.name_ = File.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    if (byteString == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 1;
                    this.name_ = byteString;
                    onChanged();
                    return this;
                }

                public boolean hasInsertionPoint() {
                    return (this.bitField0_ & 2) == 2;
                }

                public String getInsertionPoint() {
                    Object obj = this.insertionPoint_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String toStringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.insertionPoint_ = toStringUtf8;
                    }
                    return toStringUtf8;
                }

                public ByteString getInsertionPointBytes() {
                    Object obj = this.insertionPoint_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.insertionPoint_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setInsertionPoint(String str) {
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 2;
                    this.insertionPoint_ = str;
                    onChanged();
                    return this;
                }

                public Builder clearInsertionPoint() {
                    this.bitField0_ &= -3;
                    this.insertionPoint_ = File.getDefaultInstance().getInsertionPoint();
                    onChanged();
                    return this;
                }

                public Builder setInsertionPointBytes(ByteString byteString) {
                    if (byteString == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 2;
                    this.insertionPoint_ = byteString;
                    onChanged();
                    return this;
                }

                public boolean hasContent() {
                    return (this.bitField0_ & 4) == 4;
                }

                public String getContent() {
                    Object obj = this.content_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String toStringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.content_ = toStringUtf8;
                    }
                    return toStringUtf8;
                }

                public ByteString getContentBytes() {
                    Object obj = this.content_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.content_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setContent(String str) {
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 4;
                    this.content_ = str;
                    onChanged();
                    return this;
                }

                public Builder clearContent() {
                    this.bitField0_ &= -5;
                    this.content_ = File.getDefaultInstance().getContent();
                    onChanged();
                    return this;
                }

                public Builder setContentBytes(ByteString byteString) {
                    if (byteString == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 4;
                    this.content_ = byteString;
                    onChanged();
                    return this;
                }

                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            private File(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            private File() {
                this.memoizedIsInitialized = (byte) -1;
                this.name_ = "";
                this.insertionPoint_ = "";
                this.content_ = "";
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private File(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                Object obj = null;
                while (obj == null) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            ByteString readBytes;
                            if (readTag == 10) {
                                readBytes = codedInputStream.readBytes();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.name_ = readBytes;
                            } else if (readTag == 18) {
                                readBytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.insertionPoint_ = readBytes;
                            } else if (readTag == 122) {
                                readBytes = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.content_ = readBytes;
                            } else if (parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        obj = 1;
                    } catch (CodedInputStream codedInputStream2) {
                        throw codedInputStream2.setUnfinishedMessage(this);
                    } catch (IOException e) {
                        throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }

            public static final Descriptor getDescriptor() {
                return PluginProtos.f20932xcaba06d7;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PluginProtos.f20933xb43c6655.ensureFieldAccessorsInitialized(File.class, Builder.class);
            }

            public boolean hasName() {
                return (this.bitField0_ & 1) == 1;
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public boolean hasInsertionPoint() {
                return (this.bitField0_ & 2) == 2;
            }

            public String getInsertionPoint() {
                Object obj = this.insertionPoint_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.insertionPoint_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public ByteString getInsertionPointBytes() {
                Object obj = this.insertionPoint_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.insertionPoint_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public boolean hasContent() {
                return (this.bitField0_ & 4) == 4;
            }

            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.content_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == (byte) 1) {
                    return true;
                }
                if (b == (byte) 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) == 1) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.insertionPoint_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    GeneratedMessageV3.writeString(codedOutputStream, 15, this.content_);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                i = 0;
                if ((this.bitField0_ & 1) == 1) {
                    i = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    i += GeneratedMessageV3.computeStringSize(2, this.insertionPoint_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    i += GeneratedMessageV3.computeStringSize(15, this.content_);
                }
                i += this.unknownFields.getSerializedSize();
                this.memoizedSize = i;
                return i;
            }

            public boolean equals(Object obj) {
                boolean z = true;
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof File)) {
                    return super.equals(obj);
                }
                File file = (File) obj;
                Object obj2 = hasName() == file.hasName() ? 1 : null;
                if (hasName()) {
                    obj2 = (obj2 == null || !getName().equals(file.getName())) ? null : 1;
                }
                obj2 = (obj2 == null || hasInsertionPoint() != file.hasInsertionPoint()) ? null : 1;
                if (hasInsertionPoint()) {
                    obj2 = (obj2 == null || !getInsertionPoint().equals(file.getInsertionPoint())) ? null : 1;
                }
                obj2 = (obj2 == null || hasContent() != file.hasContent()) ? null : 1;
                if (hasContent()) {
                    obj2 = (obj2 == null || !getContent().equals(file.getContent())) ? null : 1;
                }
                if (obj2 == null || this.unknownFields.equals(file.unknownFields) == null) {
                    z = false;
                }
                return z;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = 779 + getDescriptor().hashCode();
                if (hasName()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
                }
                if (hasInsertionPoint()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getInsertionPoint().hashCode();
                }
                if (hasContent()) {
                    hashCode = (((hashCode * 37) + 15) * 53) + getContent().hashCode();
                }
                hashCode = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode;
                return hashCode;
            }

            public static File parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (File) PARSER.parseFrom(byteBuffer);
            }

            public static File parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (File) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static File parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (File) PARSER.parseFrom(byteString);
            }

            public static File parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (File) PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static File parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (File) PARSER.parseFrom(bArr);
            }

            public static File parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (File) PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static File parseFrom(InputStream inputStream) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static File parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static File parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (File) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static File parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (File) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static File parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static File parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(File file) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(file);
            }

            public Builder toBuilder() {
                if (this == DEFAULT_INSTANCE) {
                    return new Builder();
                }
                return new Builder().mergeFrom(this);
            }

            protected Builder newBuilderForType(BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static File getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<File> parser() {
                return PARSER;
            }

            public Parser<File> getParserForType() {
                return PARSER;
            }

            public File getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        private CodeGeneratorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private CodeGeneratorResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.error_ = "";
            this.file_ = Collections.emptyList();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CodeGeneratorResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            Object obj = null;
            int i = 0;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            ByteString readBytes = codedInputStream.readBytes();
                            this.bitField0_ = 1 | this.bitField0_;
                            this.error_ = readBytes;
                        } else if (readTag == 122) {
                            if ((i & 2) != 2) {
                                this.file_ = new ArrayList();
                                i |= 2;
                            }
                            this.file_.add(codedInputStream.readMessage(File.PARSER, extensionRegistryLite));
                        } else if (parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    obj = 1;
                } catch (CodedInputStream codedInputStream2) {
                    throw codedInputStream2.setUnfinishedMessage(this);
                } catch (IOException e) {
                    throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.file_ = Collections.unmodifiableList(this.file_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
            if ((i & 2) == 2) {
                this.file_ = Collections.unmodifiableList(this.file_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptor getDescriptor() {
            return PluginProtos.f20934x140ff76a;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.f20935x23ee13e8.ensureFieldAccessorsInitialized(CodeGeneratorResponse.class, Builder.class);
        }

        public boolean hasError() {
            return (this.bitField0_ & 1) == 1;
        }

        public String getError() {
            Object obj = this.error_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.error_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public ByteString getErrorBytes() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public List<File> getFileList() {
            return this.file_;
        }

        public List<? extends FileOrBuilder> getFileOrBuilderList() {
            return this.file_;
        }

        public int getFileCount() {
            return this.file_.size();
        }

        public File getFile(int i) {
            return (File) this.file_.get(i);
        }

        public FileOrBuilder getFileOrBuilder(int i) {
            return (FileOrBuilder) this.file_.get(i);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.error_);
            }
            for (int i = 0; i < this.file_.size(); i++) {
                codedOutputStream.writeMessage(15, (MessageLite) this.file_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            i = (this.bitField0_ & 1) == 1 ? GeneratedMessageV3.computeStringSize(1, this.error_) + 0 : 0;
            while (i2 < this.file_.size()) {
                i += CodedOutputStream.computeMessageSize(15, (MessageLite) this.file_.get(i2));
                i2++;
            }
            i += this.unknownFields.getSerializedSize();
            this.memoizedSize = i;
            return i;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeGeneratorResponse)) {
                return super.equals(obj);
            }
            CodeGeneratorResponse codeGeneratorResponse = (CodeGeneratorResponse) obj;
            Object obj2 = hasError() == codeGeneratorResponse.hasError() ? 1 : null;
            if (hasError()) {
                obj2 = (obj2 == null || !getError().equals(codeGeneratorResponse.getError())) ? null : 1;
            }
            obj2 = (obj2 == null || !getFileList().equals(codeGeneratorResponse.getFileList())) ? null : 1;
            if (obj2 == null || this.unknownFields.equals(codeGeneratorResponse.unknownFields) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (hasError()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getError().hashCode();
            }
            if (getFileCount() > 0) {
                hashCode = (((hashCode * 37) + 15) * 53) + getFileList().hashCode();
            }
            hashCode = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CodeGeneratorResponse) PARSER.parseFrom(byteBuffer);
        }

        public static CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CodeGeneratorResponse) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CodeGeneratorResponse) PARSER.parseFrom(byteString);
        }

        public static CodeGeneratorResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CodeGeneratorResponse) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CodeGeneratorResponse) PARSER.parseFrom(bArr);
        }

        public static CodeGeneratorResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CodeGeneratorResponse) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CodeGeneratorResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CodeGeneratorResponse codeGeneratorResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(codeGeneratorResponse);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        protected Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static CodeGeneratorResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CodeGeneratorResponse> parser() {
            return PARSER;
        }

        public Parser<CodeGeneratorResponse> getParserForType() {
            return PARSER;
        }

        public CodeGeneratorResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Version extends GeneratedMessageV3 implements VersionOrBuilder {
        private static final Version DEFAULT_INSTANCE = new Version();
        public static final int MAJOR_FIELD_NUMBER = 1;
        public static final int MINOR_FIELD_NUMBER = 2;
        @Deprecated
        public static final Parser<Version> PARSER = new C77991();
        public static final int PATCH_FIELD_NUMBER = 3;
        public static final int SUFFIX_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int major_;
        private byte memoizedIsInitialized;
        private int minor_;
        private int patch_;
        private volatile Object suffix_;

        /* renamed from: com.google.protobuf.compiler.PluginProtos$Version$1 */
        static class C77991 extends AbstractParser<Version> {
            C77991() {
            }

            public Version parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Version(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements VersionOrBuilder {
            private int bitField0_;
            private int major_;
            private int minor_;
            private int patch_;
            private Object suffix_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptor getDescriptor() {
                return PluginProtos.internal_static_google_protobuf_compiler_Version_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PluginProtos.f20936xc9007e77.ensureFieldAccessorsInitialized(Version.class, Builder.class);
            }

            private Builder() {
                this.suffix_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.suffix_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                Version.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.major_ = 0;
                this.bitField0_ &= -2;
                this.minor_ = 0;
                this.bitField0_ &= -3;
                this.patch_ = 0;
                this.bitField0_ &= -5;
                this.suffix_ = "";
                this.bitField0_ &= -9;
                return this;
            }

            public Descriptor getDescriptorForType() {
                return PluginProtos.internal_static_google_protobuf_compiler_Version_descriptor;
            }

            public Version getDefaultInstanceForType() {
                return Version.getDefaultInstance();
            }

            public Version build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public Version buildPartial() {
                Version version = new Version((com.google.protobuf.GeneratedMessageV3.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                version.major_ = this.major_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                version.minor_ = this.minor_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                version.patch_ = this.patch_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                version.suffix_ = this.suffix_;
                version.bitField0_ = i2;
                onBuilt();
                return version;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof Version) {
                    return mergeFrom((Version) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Version version) {
                if (version == Version.getDefaultInstance()) {
                    return this;
                }
                if (version.hasMajor()) {
                    setMajor(version.getMajor());
                }
                if (version.hasMinor()) {
                    setMinor(version.getMinor());
                }
                if (version.hasPatch()) {
                    setPatch(version.getPatch());
                }
                if (version.hasSuffix()) {
                    this.bitField0_ |= 8;
                    this.suffix_ = version.suffix_;
                    onChanged();
                }
                mergeUnknownFields(version.unknownFields);
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Version version;
                Version version2 = null;
                try {
                    Version version3 = (Version) Version.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (version3 != null) {
                        mergeFrom(version3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    version = (Version) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    version2 = version;
                    if (version2 != null) {
                        mergeFrom(version2);
                    }
                    throw codedInputStream2;
                }
            }

            public boolean hasMajor() {
                return (this.bitField0_ & 1) == 1;
            }

            public int getMajor() {
                return this.major_;
            }

            public Builder setMajor(int i) {
                this.bitField0_ |= 1;
                this.major_ = i;
                onChanged();
                return this;
            }

            public Builder clearMajor() {
                this.bitField0_ &= -2;
                this.major_ = 0;
                onChanged();
                return this;
            }

            public boolean hasMinor() {
                return (this.bitField0_ & 2) == 2;
            }

            public int getMinor() {
                return this.minor_;
            }

            public Builder setMinor(int i) {
                this.bitField0_ |= 2;
                this.minor_ = i;
                onChanged();
                return this;
            }

            public Builder clearMinor() {
                this.bitField0_ &= -3;
                this.minor_ = 0;
                onChanged();
                return this;
            }

            public boolean hasPatch() {
                return (this.bitField0_ & 4) == 4;
            }

            public int getPatch() {
                return this.patch_;
            }

            public Builder setPatch(int i) {
                this.bitField0_ |= 4;
                this.patch_ = i;
                onChanged();
                return this;
            }

            public Builder clearPatch() {
                this.bitField0_ &= -5;
                this.patch_ = 0;
                onChanged();
                return this;
            }

            public boolean hasSuffix() {
                return (this.bitField0_ & 8) == 8;
            }

            public String getSuffix() {
                Object obj = this.suffix_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.suffix_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public ByteString getSuffixBytes() {
                Object obj = this.suffix_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.suffix_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSuffix(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.suffix_ = str;
                onChanged();
                return this;
            }

            public Builder clearSuffix() {
                this.bitField0_ &= -9;
                this.suffix_ = Version.getDefaultInstance().getSuffix();
                onChanged();
                return this;
            }

            public Builder setSuffixBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.suffix_ = byteString;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        private Version(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Version() {
            this.memoizedIsInitialized = (byte) -1;
            this.major_ = 0;
            this.minor_ = 0;
            this.patch_ = 0;
            this.suffix_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Version(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            Object obj = null;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.major_ = codedInputStream.readInt32();
                        } else if (readTag == 16) {
                            this.bitField0_ |= 2;
                            this.minor_ = codedInputStream.readInt32();
                        } else if (readTag == 24) {
                            this.bitField0_ |= 4;
                            this.patch_ = codedInputStream.readInt32();
                        } else if (readTag == 34) {
                            ByteString readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= 8;
                            this.suffix_ = readBytes;
                        } else if (parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    obj = 1;
                } catch (CodedInputStream codedInputStream2) {
                    throw codedInputStream2.setUnfinishedMessage(this);
                } catch (IOException e) {
                    throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptor getDescriptor() {
            return PluginProtos.internal_static_google_protobuf_compiler_Version_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.f20936xc9007e77.ensureFieldAccessorsInitialized(Version.class, Builder.class);
        }

        public boolean hasMajor() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getMajor() {
            return this.major_;
        }

        public boolean hasMinor() {
            return (this.bitField0_ & 2) == 2;
        }

        public int getMinor() {
            return this.minor_;
        }

        public boolean hasPatch() {
            return (this.bitField0_ & 4) == 4;
        }

        public int getPatch() {
            return this.patch_;
        }

        public boolean hasSuffix() {
            return (this.bitField0_ & 8) == 8;
        }

        public String getSuffix() {
            Object obj = this.suffix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.suffix_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public ByteString getSuffixBytes() {
            Object obj = this.suffix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.suffix_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.major_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.minor_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(3, this.patch_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.suffix_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.bitField0_ & 1) == 1) {
                i = 0 + CodedOutputStream.computeInt32Size(1, this.major_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.computeInt32Size(2, this.minor_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.computeInt32Size(3, this.patch_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += GeneratedMessageV3.computeStringSize(4, this.suffix_);
            }
            i += this.unknownFields.getSerializedSize();
            this.memoizedSize = i;
            return i;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Version)) {
                return super.equals(obj);
            }
            Version version = (Version) obj;
            Object obj2 = hasMajor() == version.hasMajor() ? 1 : null;
            if (hasMajor()) {
                obj2 = (obj2 == null || getMajor() != version.getMajor()) ? null : 1;
            }
            obj2 = (obj2 == null || hasMinor() != version.hasMinor()) ? null : 1;
            if (hasMinor()) {
                obj2 = (obj2 == null || getMinor() != version.getMinor()) ? null : 1;
            }
            obj2 = (obj2 == null || hasPatch() != version.hasPatch()) ? null : 1;
            if (hasPatch()) {
                obj2 = (obj2 == null || getPatch() != version.getPatch()) ? null : 1;
            }
            obj2 = (obj2 == null || hasSuffix() != version.hasSuffix()) ? null : 1;
            if (hasSuffix()) {
                obj2 = (obj2 == null || !getSuffix().equals(version.getSuffix())) ? null : 1;
            }
            if (obj2 == null || this.unknownFields.equals(version.unknownFields) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (hasMajor()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getMajor();
            }
            if (hasMinor()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getMinor();
            }
            if (hasPatch()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getPatch();
            }
            if (hasSuffix()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getSuffix().hashCode();
            }
            hashCode = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static Version parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Version) PARSER.parseFrom(byteBuffer);
        }

        public static Version parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Version) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Version parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Version) PARSER.parseFrom(byteString);
        }

        public static Version parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Version) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Version parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Version) PARSER.parseFrom(bArr);
        }

        public static Version parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Version) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Version parseFrom(InputStream inputStream) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Version parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Version parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Version) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Version parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Version) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Version parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Version parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Version version) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(version);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        protected Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Version getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Version> parser() {
            return PARSER;
        }

        public Parser<Version> getParserForType() {
            return PARSER;
        }

        public Version getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private PluginProtos() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{DescriptorProtos.getDescriptor()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n%google/protobuf/compiler/plugin.proto\u0012\u0018google.protobuf.compiler\u001a google/protobuf/descriptor.proto\"F\n\u0007Version\u0012\r\n\u0005major\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005minor\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005patch\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006suffix\u0018\u0004 \u0001(\t\"º\u0001\n\u0014CodeGeneratorRequest\u0012\u0018\n\u0010file_to_generate\u0018\u0001 \u0003(\t\u0012\u0011\n\tparameter\u0018\u0002 \u0001(\t\u00128\n\nproto_file\u0018\u000f \u0003(\u000b2$.google.protobuf.FileDescriptorProto\u0012;\n\u0010compiler_version\u0018\u0003 \u0001(\u000b2!.google.protobuf.compiler.Version\"ª\u0001\n\u0015CodeGeneratorResponse\u0012\r\n\u0005error\u0018\u0001 \u0001(", "\t\u0012B\n\u0004file\u0018\u000f \u0003(\u000b24.google.protobuf.compiler.CodeGeneratorResponse.File\u001a>\n\u0004File\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0017\n\u000finsertion_point\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007content\u0018\u000f \u0001(\tBg\n\u001ccom.google.protobuf.compilerB\fPluginProtosZ9github.com/golang/protobuf/protoc-gen-go/plugin;plugin_go"}, fileDescriptorArr, new C69901());
        DescriptorProtos.getDescriptor();
    }
}
