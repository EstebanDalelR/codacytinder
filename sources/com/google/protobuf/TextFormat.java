package com.google.protobuf;

import com.google.android.exoplayer2.Format;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor.JavaType;
import com.google.protobuf.Descriptors.FieldDescriptor.Type;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.ExtensionRegistry.ExtensionInfo;
import com.google.protobuf.Message.Builder;
import com.google.protobuf.UnknownFieldSet.Field;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TextFormat {
    private static final Parser PARSER = Parser.newBuilder().build();
    private static final Logger logger = Logger.getLogger(TextFormat.class.getName());

    public static class InvalidEscapeSequenceException extends IOException {
        private static final long serialVersionUID = -8164033650142593304L;

        InvalidEscapeSequenceException(String str) {
            super(str);
        }
    }

    public static class ParseException extends IOException {
        private static final long serialVersionUID = 3196188060225107702L;
        private final int column;
        private final int line;

        public ParseException(String str) {
            this(-1, -1, str);
        }

        public ParseException(int i, int i2, String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Integer.toString(i));
            stringBuilder.append(":");
            stringBuilder.append(i2);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            super(stringBuilder.toString());
            this.line = i;
            this.column = i2;
        }

        public int getLine() {
            return this.line;
        }

        public int getColumn() {
            return this.column;
        }
    }

    public static class Parser {
        private static final int BUFFER_SIZE = 4096;
        private final boolean allowUnknownFields;
        private com.google.protobuf.TextFormatParseInfoTree.Builder parseInfoTreeBuilder;
        private final SingularOverwritePolicy singularOverwritePolicy;

        public static class Builder {
            private boolean allowUnknownFields = false;
            private com.google.protobuf.TextFormatParseInfoTree.Builder parseInfoTreeBuilder = null;
            private SingularOverwritePolicy singularOverwritePolicy = SingularOverwritePolicy.ALLOW_SINGULAR_OVERWRITES;

            public Builder setSingularOverwritePolicy(SingularOverwritePolicy singularOverwritePolicy) {
                this.singularOverwritePolicy = singularOverwritePolicy;
                return this;
            }

            public Builder setParseInfoTreeBuilder(com.google.protobuf.TextFormatParseInfoTree.Builder builder) {
                this.parseInfoTreeBuilder = builder;
                return this;
            }

            public Parser build() {
                return new Parser(this.allowUnknownFields, this.singularOverwritePolicy, this.parseInfoTreeBuilder);
            }
        }

        public enum SingularOverwritePolicy {
            ALLOW_SINGULAR_OVERWRITES,
            FORBID_SINGULAR_OVERWRITES
        }

        private Parser(boolean z, SingularOverwritePolicy singularOverwritePolicy, com.google.protobuf.TextFormatParseInfoTree.Builder builder) {
            this.allowUnknownFields = z;
            this.singularOverwritePolicy = singularOverwritePolicy;
            this.parseInfoTreeBuilder = builder;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public void merge(Readable readable, com.google.protobuf.Message.Builder builder) throws IOException {
            merge(readable, ExtensionRegistry.getEmptyRegistry(), builder);
        }

        public void merge(CharSequence charSequence, com.google.protobuf.Message.Builder builder) throws ParseException {
            merge(charSequence, ExtensionRegistry.getEmptyRegistry(), builder);
        }

        public void merge(Readable readable, ExtensionRegistry extensionRegistry, com.google.protobuf.Message.Builder builder) throws IOException {
            merge(toStringBuilder(readable), extensionRegistry, builder);
        }

        private static StringBuilder toStringBuilder(Readable readable) throws IOException {
            StringBuilder stringBuilder = new StringBuilder();
            CharSequence allocate = CharBuffer.allocate(4096);
            while (true) {
                int read = readable.read(allocate);
                if (read == -1) {
                    return stringBuilder;
                }
                allocate.flip();
                stringBuilder.append(allocate, 0, read);
            }
        }

        private void checkUnknownFields(List<String> list) throws ParseException {
            if (!list.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder("Input contains unknown fields and/or extensions:");
                for (String str : list) {
                    stringBuilder.append('\n');
                    stringBuilder.append(str);
                }
                if (this.allowUnknownFields) {
                    TextFormat.logger.warning(stringBuilder.toString());
                } else {
                    list = ((String) list.get(0)).split(":");
                    throw new ParseException(Integer.valueOf(list[0]).intValue(), Integer.valueOf(list[1]).intValue(), stringBuilder.toString());
                }
            }
        }

        public void merge(CharSequence charSequence, ExtensionRegistry extensionRegistry, com.google.protobuf.Message.Builder builder) throws ParseException {
            Tokenizer tokenizer = new Tokenizer(charSequence);
            charSequence = new BuilderAdapter(builder);
            builder = new ArrayList();
            while (!tokenizer.atEnd()) {
                mergeField(tokenizer, extensionRegistry, charSequence, builder);
            }
            checkUnknownFields(builder);
        }

        private void mergeField(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MergeTarget mergeTarget, List<String> list) throws ParseException {
            mergeField(tokenizer, extensionRegistry, mergeTarget, this.parseInfoTreeBuilder, list);
        }

        private void mergeField(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MergeTarget mergeTarget, com.google.protobuf.TextFormatParseInfoTree.Builder builder, List<String> list) throws ParseException {
            ExtensionRegistry extensionRegistry2;
            MergeTarget mergeTarget2;
            FieldDescriptor fieldDescriptor;
            ExtensionInfo extensionInfo;
            Tokenizer tokenizer2 = tokenizer;
            com.google.protobuf.TextFormatParseInfoTree.Builder builder2 = builder;
            List<String> list2 = list;
            int line = tokenizer2.getLine();
            int column = tokenizer2.getColumn();
            Descriptor descriptorForType = mergeTarget.getDescriptorForType();
            FieldDescriptor fieldDescriptor2 = null;
            StringBuilder stringBuilder;
            if (tokenizer2.tryConsume("[")) {
                StringBuilder stringBuilder2 = new StringBuilder(tokenizer2.consumeIdentifier());
                while (tokenizer2.tryConsume(".")) {
                    stringBuilder2.append('.');
                    stringBuilder2.append(tokenizer2.consumeIdentifier());
                }
                extensionRegistry2 = extensionRegistry;
                mergeTarget2 = mergeTarget;
                ExtensionInfo findExtensionByName = mergeTarget2.findExtensionByName(extensionRegistry2, stringBuilder2.toString());
                if (findExtensionByName == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(tokenizer2.getPreviousLine() + 1);
                    stringBuilder.append(":");
                    stringBuilder.append(tokenizer2.getPreviousColumn() + 1);
                    stringBuilder.append(":\t");
                    stringBuilder.append(descriptorForType.getFullName());
                    stringBuilder.append(".[");
                    stringBuilder.append(stringBuilder2);
                    stringBuilder.append("]");
                    list2.add(stringBuilder.toString());
                } else if (findExtensionByName.descriptor.getContainingType() != descriptorForType) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Extension \"");
                    stringBuilder3.append(stringBuilder2);
                    stringBuilder3.append("\" does not extend message type \"");
                    stringBuilder3.append(descriptorForType.getFullName());
                    stringBuilder3.append("\".");
                    throw tokenizer2.parseExceptionPreviousToken(stringBuilder3.toString());
                } else {
                    fieldDescriptor2 = findExtensionByName.descriptor;
                }
                tokenizer2.consume("]");
                fieldDescriptor = fieldDescriptor2;
                extensionInfo = findExtensionByName;
            } else {
                extensionRegistry2 = extensionRegistry;
                mergeTarget2 = mergeTarget;
                String consumeIdentifier = tokenizer2.consumeIdentifier();
                FieldDescriptor findFieldByName = descriptorForType.findFieldByName(consumeIdentifier);
                if (findFieldByName == null) {
                    findFieldByName = descriptorForType.findFieldByName(consumeIdentifier.toLowerCase(Locale.US));
                    if (!(findFieldByName == null || findFieldByName.getType() == Type.GROUP)) {
                        findFieldByName = null;
                    }
                }
                if (!(findFieldByName == null || findFieldByName.getType() != Type.GROUP || findFieldByName.getMessageType().getName().equals(consumeIdentifier))) {
                    findFieldByName = null;
                }
                if (findFieldByName == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(tokenizer2.getPreviousLine() + 1);
                    stringBuilder.append(":");
                    stringBuilder.append(tokenizer2.getPreviousColumn() + 1);
                    stringBuilder.append(":\t");
                    stringBuilder.append(descriptorForType.getFullName());
                    stringBuilder.append(".");
                    stringBuilder.append(consumeIdentifier);
                    list2.add(stringBuilder.toString());
                }
                extensionInfo = null;
                fieldDescriptor = findFieldByName;
            }
            if (fieldDescriptor == null) {
                if (!tokenizer2.tryConsume(":") || tokenizer2.lookingAt("{") || tokenizer2.lookingAt("<")) {
                    skipFieldMessage(tokenizer2);
                } else {
                    skipFieldValue(tokenizer2);
                }
                return;
            }
            if (fieldDescriptor.getJavaType() == JavaType.MESSAGE) {
                tokenizer2.tryConsume(":");
                if (builder2 != null) {
                    consumeFieldValues(tokenizer2, extensionRegistry2, mergeTarget2, fieldDescriptor, extensionInfo, builder2.getBuilderForSubMessageField(fieldDescriptor), list2);
                } else {
                    consumeFieldValues(tokenizer2, extensionRegistry2, mergeTarget2, fieldDescriptor, extensionInfo, builder2, list2);
                }
            } else {
                tokenizer2.consume(":");
                consumeFieldValues(tokenizer2, extensionRegistry2, mergeTarget2, fieldDescriptor, extensionInfo, builder2, list2);
            }
            if (builder2 != null) {
                builder2.setLocation(fieldDescriptor, TextFormatParseLocation.create(line, column));
            }
            if (!tokenizer2.tryConsume(";")) {
                tokenizer2.tryConsume(",");
            }
        }

        private void consumeFieldValues(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MergeTarget mergeTarget, FieldDescriptor fieldDescriptor, ExtensionInfo extensionInfo, com.google.protobuf.TextFormatParseInfoTree.Builder builder, List<String> list) throws ParseException {
            if (!fieldDescriptor.isRepeated() || !tokenizer.tryConsume("[")) {
                consumeFieldValue(tokenizer, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfo, builder, list);
            } else if (!tokenizer.tryConsume("]")) {
                while (true) {
                    consumeFieldValue(tokenizer, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfo, builder, list);
                    if (!tokenizer.tryConsume("]")) {
                        tokenizer.consume(",");
                    } else {
                        return;
                    }
                }
            }
        }

        private void consumeFieldValue(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MergeTarget mergeTarget, FieldDescriptor fieldDescriptor, ExtensionInfo extensionInfo, com.google.protobuf.TextFormatParseInfoTree.Builder builder, List<String> list) throws ParseException {
            Parser parser = this;
            Tokenizer tokenizer2 = tokenizer;
            MergeTarget mergeTarget2 = mergeTarget;
            FieldDescriptor fieldDescriptor2 = fieldDescriptor;
            ExtensionInfo extensionInfo2 = extensionInfo;
            Object obj = null;
            String consumeIdentifier;
            if (fieldDescriptor.getJavaType() != JavaType.MESSAGE) {
                switch (fieldDescriptor.getType()) {
                    case INT32:
                    case SINT32:
                    case SFIXED32:
                        obj = Integer.valueOf(tokenizer2.consumeInt32());
                        break;
                    case INT64:
                    case SINT64:
                    case SFIXED64:
                        obj = Long.valueOf(tokenizer2.consumeInt64());
                        break;
                    case BOOL:
                        obj = Boolean.valueOf(tokenizer2.consumeBoolean());
                        break;
                    case FLOAT:
                        obj = Float.valueOf(tokenizer2.consumeFloat());
                        break;
                    case DOUBLE:
                        obj = Double.valueOf(tokenizer2.consumeDouble());
                        break;
                    case UINT32:
                    case FIXED32:
                        obj = Integer.valueOf(tokenizer2.consumeUInt32());
                        break;
                    case UINT64:
                    case FIXED64:
                        obj = Long.valueOf(tokenizer2.consumeUInt64());
                        break;
                    case STRING:
                        obj = tokenizer2.consumeString();
                        break;
                    case BYTES:
                        obj = tokenizer2.consumeByteString();
                        break;
                    case ENUM:
                        EnumDescriptor enumType = fieldDescriptor.getEnumType();
                        StringBuilder stringBuilder;
                        if (tokenizer2.lookingAtInteger()) {
                            int consumeInt32 = tokenizer2.consumeInt32();
                            obj = enumType.findValueByNumber(consumeInt32);
                            if (obj == null) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Enum type \"");
                                stringBuilder.append(enumType.getFullName());
                                stringBuilder.append("\" has no value with number ");
                                stringBuilder.append(consumeInt32);
                                stringBuilder.append('.');
                                throw tokenizer2.parseExceptionPreviousToken(stringBuilder.toString());
                            }
                        }
                        consumeIdentifier = tokenizer2.consumeIdentifier();
                        obj = enumType.findValueByName(consumeIdentifier);
                        if (obj == null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Enum type \"");
                            stringBuilder.append(enumType.getFullName());
                            stringBuilder.append("\" has no value named \"");
                            stringBuilder.append(consumeIdentifier);
                            stringBuilder.append("\".");
                            throw tokenizer2.parseExceptionPreviousToken(stringBuilder.toString());
                        }
                        break;
                    case MESSAGE:
                    case GROUP:
                        throw new RuntimeException("Can't get here.");
                    default:
                        break;
                }
            }
            Message message;
            if (tokenizer2.tryConsume("<")) {
                consumeIdentifier = ">";
            } else {
                tokenizer2.consume("{");
                consumeIdentifier = "}";
            }
            String str = consumeIdentifier;
            if (extensionInfo2 != null) {
                message = extensionInfo2.defaultInstance;
            }
            MergeTarget newMergeTargetForField = mergeTarget2.newMergeTargetForField(fieldDescriptor2, message);
            while (!tokenizer2.tryConsume(str)) {
                if (tokenizer2.atEnd()) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Expected \"");
                    stringBuilder2.append(str);
                    stringBuilder2.append("\".");
                    throw tokenizer2.parseException(stringBuilder2.toString());
                }
                mergeField(tokenizer2, extensionRegistry, newMergeTargetForField, builder, list);
            }
            obj = newMergeTargetForField.finish();
            if (fieldDescriptor.isRepeated()) {
                mergeTarget2.addRepeatedField(fieldDescriptor2, obj);
            } else if (parser.singularOverwritePolicy == SingularOverwritePolicy.FORBID_SINGULAR_OVERWRITES && mergeTarget.hasField(fieldDescriptor)) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Non-repeated field \"");
                stringBuilder2.append(fieldDescriptor.getFullName());
                stringBuilder2.append("\" cannot be overwritten.");
                throw tokenizer2.parseExceptionPreviousToken(stringBuilder2.toString());
            } else if (parser.singularOverwritePolicy == SingularOverwritePolicy.FORBID_SINGULAR_OVERWRITES && fieldDescriptor.getContainingOneof() != null && mergeTarget2.hasOneof(fieldDescriptor.getContainingOneof())) {
                OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Field \"");
                stringBuilder3.append(fieldDescriptor.getFullName());
                stringBuilder3.append("\" is specified along with field \"");
                stringBuilder3.append(mergeTarget2.getOneofFieldDescriptor(containingOneof).getFullName());
                stringBuilder3.append("\", another member of oneof \"");
                stringBuilder3.append(containingOneof.getName());
                stringBuilder3.append("\".");
                throw tokenizer2.parseExceptionPreviousToken(stringBuilder3.toString());
            } else {
                mergeTarget2.setField(fieldDescriptor2, obj);
            }
        }

        private void skipField(Tokenizer tokenizer) throws ParseException {
            if (tokenizer.tryConsume("[")) {
                do {
                    tokenizer.consumeIdentifier();
                } while (tokenizer.tryConsume("."));
                tokenizer.consume("]");
            } else {
                tokenizer.consumeIdentifier();
            }
            if (!tokenizer.tryConsume(":") || tokenizer.lookingAt("<") || tokenizer.lookingAt("{")) {
                skipFieldMessage(tokenizer);
            } else {
                skipFieldValue(tokenizer);
            }
            if (!tokenizer.tryConsume(";")) {
                tokenizer.tryConsume(",");
            }
        }

        private void skipFieldMessage(Tokenizer tokenizer) throws ParseException {
            String str;
            if (tokenizer.tryConsume("<")) {
                str = ">";
            } else {
                tokenizer.consume("{");
                str = "}";
            }
            while (!tokenizer.lookingAt(">") && !tokenizer.lookingAt("}")) {
                skipField(tokenizer);
            }
            tokenizer.consume(str);
        }

        private void skipFieldValue(Tokenizer tokenizer) throws ParseException {
            if (tokenizer.tryConsumeString()) {
                while (tokenizer.tryConsumeString()) {
                }
            } else if (!tokenizer.tryConsumeIdentifier() && !tokenizer.tryConsumeInt64() && !tokenizer.tryConsumeUInt64() && !tokenizer.tryConsumeDouble() && !tokenizer.tryConsumeFloat()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid field value: ");
                stringBuilder.append(tokenizer.currentToken);
                throw tokenizer.parseException(stringBuilder.toString());
            }
        }
    }

    private static final class Printer {
        static final Printer DEFAULT = new Printer(true);
        static final Printer UNICODE = new Printer(false);
        private final boolean escapeNonAscii;

        private Printer(boolean z) {
            this.escapeNonAscii = z;
        }

        private void print(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            for (Entry entry : messageOrBuilder.getAllFields().entrySet()) {
                printField((FieldDescriptor) entry.getKey(), entry.getValue(), textGenerator);
            }
            printUnknownFields(messageOrBuilder.getUnknownFields(), textGenerator);
        }

        private void printField(FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (fieldDescriptor.isRepeated()) {
                for (Object printSingleField : (List) obj) {
                    printSingleField(fieldDescriptor, printSingleField, textGenerator);
                }
                return;
            }
            printSingleField(fieldDescriptor, obj, textGenerator);
        }

        private void printSingleField(FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (fieldDescriptor.isExtension()) {
                textGenerator.print("[");
                if (fieldDescriptor.getContainingType().getOptions().getMessageSetWireFormat() && fieldDescriptor.getType() == Type.MESSAGE && fieldDescriptor.isOptional() && fieldDescriptor.getExtensionScope() == fieldDescriptor.getMessageType()) {
                    textGenerator.print(fieldDescriptor.getMessageType().getFullName());
                } else {
                    textGenerator.print(fieldDescriptor.getFullName());
                }
                textGenerator.print("]");
            } else if (fieldDescriptor.getType() == Type.GROUP) {
                textGenerator.print(fieldDescriptor.getMessageType().getName());
            } else {
                textGenerator.print(fieldDescriptor.getName());
            }
            if (fieldDescriptor.getJavaType() == JavaType.MESSAGE) {
                textGenerator.print(" {");
                textGenerator.eol();
                textGenerator.indent();
            } else {
                textGenerator.print(": ");
            }
            printFieldValue(fieldDescriptor, obj, textGenerator);
            if (fieldDescriptor.getJavaType() == JavaType.MESSAGE) {
                textGenerator.outdent();
                textGenerator.print("}");
            }
            textGenerator.eol();
        }

        private void printFieldValue(FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            switch (fieldDescriptor.getType()) {
                case INT32:
                case SINT32:
                case SFIXED32:
                    textGenerator.print(((Integer) obj).toString());
                    return;
                case INT64:
                case SINT64:
                case SFIXED64:
                    textGenerator.print(((Long) obj).toString());
                    return;
                case BOOL:
                    textGenerator.print(((Boolean) obj).toString());
                    return;
                case FLOAT:
                    textGenerator.print(((Float) obj).toString());
                    return;
                case DOUBLE:
                    textGenerator.print(((Double) obj).toString());
                    return;
                case UINT32:
                case FIXED32:
                    textGenerator.print(TextFormat.unsignedToString(((Integer) obj).intValue()));
                    return;
                case UINT64:
                case FIXED64:
                    textGenerator.print(TextFormat.unsignedToString(((Long) obj).longValue()));
                    return;
                case STRING:
                    textGenerator.print("\"");
                    if (this.escapeNonAscii != null) {
                        fieldDescriptor = TextFormatEscaper.escapeText((String) obj);
                    } else {
                        fieldDescriptor = TextFormat.escapeDoubleQuotesAndBackslashes((String) obj).replace("\n", "\\n");
                    }
                    textGenerator.print(fieldDescriptor);
                    textGenerator.print("\"");
                    return;
                case BYTES:
                    textGenerator.print("\"");
                    if ((obj instanceof ByteString) != null) {
                        textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
                    } else {
                        textGenerator.print(TextFormat.escapeBytes((byte[]) obj));
                    }
                    textGenerator.print("\"");
                    return;
                case ENUM:
                    textGenerator.print(((EnumValueDescriptor) obj).getName());
                    return;
                case MESSAGE:
                case GROUP:
                    print((Message) obj, textGenerator);
                    return;
                default:
                    return;
            }
        }

        private void printUnknownFields(UnknownFieldSet unknownFieldSet, TextGenerator textGenerator) throws IOException {
            for (Entry entry : unknownFieldSet.asMap().entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                Field field = (Field) entry.getValue();
                printUnknownField(intValue, 0, field.getVarintList(), textGenerator);
                printUnknownField(intValue, 5, field.getFixed32List(), textGenerator);
                printUnknownField(intValue, 1, field.getFixed64List(), textGenerator);
                printUnknownField(intValue, 2, field.getLengthDelimitedList(), textGenerator);
                for (UnknownFieldSet unknownFieldSet2 : field.getGroupList()) {
                    textGenerator.print(((Integer) entry.getKey()).toString());
                    textGenerator.print(" {");
                    textGenerator.eol();
                    textGenerator.indent();
                    printUnknownFields(unknownFieldSet2, textGenerator);
                    textGenerator.outdent();
                    textGenerator.print("}");
                    textGenerator.eol();
                }
            }
        }

        private void printUnknownField(int i, int i2, List<?> list, TextGenerator textGenerator) throws IOException {
            for (Object next : list) {
                textGenerator.print(String.valueOf(i));
                textGenerator.print(": ");
                TextFormat.printUnknownFieldValue(i2, next, textGenerator);
                textGenerator.eol();
            }
        }
    }

    private static final class TextGenerator {
        private boolean atStartOfLine;
        private final StringBuilder indent;
        private final Appendable output;
        private final boolean singleLineMode;

        private TextGenerator(Appendable appendable, boolean z) {
            this.indent = new StringBuilder();
            this.atStartOfLine = false;
            this.output = appendable;
            this.singleLineMode = z;
        }

        public void indent() {
            this.indent.append("  ");
        }

        public void outdent() {
            int length = this.indent.length();
            if (length == 0) {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            }
            this.indent.setLength(length - 2);
        }

        public void print(CharSequence charSequence) throws IOException {
            if (this.atStartOfLine) {
                this.atStartOfLine = false;
                this.output.append(this.singleLineMode ? " " : this.indent);
            }
            this.output.append(charSequence);
        }

        public void eol() throws IOException {
            if (!this.singleLineMode) {
                this.output.append("\n");
            }
            this.atStartOfLine = true;
        }
    }

    private static final class Tokenizer {
        private static final Pattern DOUBLE_INFINITY = Pattern.compile("-?inf(inity)?", 2);
        private static final Pattern FLOAT_INFINITY = Pattern.compile("-?inf(inity)?f?", 2);
        private static final Pattern FLOAT_NAN = Pattern.compile("nanf?", 2);
        private static final Pattern TOKEN = Pattern.compile("[a-zA-Z_][0-9a-zA-Z_+-]*+|[.]?[0-9+-][0-9a-zA-Z_.+-]*+|\"([^\"\n\\\\]|\\\\.)*+(\"|\\\\?$)|'([^'\n\\\\]|\\\\.)*+('|\\\\?$)", 8);
        private static final Pattern WHITESPACE = Pattern.compile("(\\s|(#.*$))++", 8);
        private int column;
        private String currentToken;
        private int line;
        private final Matcher matcher;
        private int pos;
        private int previousColumn;
        private int previousLine;
        private final CharSequence text;

        private Tokenizer(CharSequence charSequence) {
            this.pos = 0;
            this.line = 0;
            this.column = 0;
            this.previousLine = 0;
            this.previousColumn = 0;
            this.text = charSequence;
            this.matcher = WHITESPACE.matcher(charSequence);
            skipWhitespace();
            nextToken();
        }

        int getPreviousLine() {
            return this.previousLine;
        }

        int getPreviousColumn() {
            return this.previousColumn;
        }

        int getLine() {
            return this.line;
        }

        int getColumn() {
            return this.column;
        }

        public boolean atEnd() {
            return this.currentToken.length() == 0;
        }

        public void nextToken() {
            this.previousLine = this.line;
            this.previousColumn = this.column;
            while (this.pos < this.matcher.regionStart()) {
                if (this.text.charAt(this.pos) == '\n') {
                    this.line++;
                    this.column = 0;
                } else {
                    this.column++;
                }
                this.pos++;
            }
            if (this.matcher.regionStart() == this.matcher.regionEnd()) {
                this.currentToken = "";
                return;
            }
            this.matcher.usePattern(TOKEN);
            if (this.matcher.lookingAt()) {
                this.currentToken = this.matcher.group();
                this.matcher.region(this.matcher.end(), this.matcher.regionEnd());
            } else {
                this.currentToken = String.valueOf(this.text.charAt(this.pos));
                this.matcher.region(this.pos + 1, this.matcher.regionEnd());
            }
            skipWhitespace();
        }

        private void skipWhitespace() {
            this.matcher.usePattern(WHITESPACE);
            if (this.matcher.lookingAt()) {
                this.matcher.region(this.matcher.end(), this.matcher.regionEnd());
            }
        }

        public boolean tryConsume(String str) {
            if (this.currentToken.equals(str) == null) {
                return null;
            }
            nextToken();
            return true;
        }

        public void consume(String str) throws ParseException {
            if (!tryConsume(str)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected \"");
                stringBuilder.append(str);
                stringBuilder.append("\".");
                throw parseException(stringBuilder.toString());
            }
        }

        public boolean lookingAtInteger() {
            boolean z = false;
            if (this.currentToken.length() == 0) {
                return false;
            }
            char charAt = this.currentToken.charAt(0);
            if (('0' <= charAt && charAt <= '9') || charAt == '-' || charAt == '+') {
                z = true;
            }
            return z;
        }

        public boolean lookingAt(String str) {
            return this.currentToken.equals(str);
        }

        public String consumeIdentifier() throws ParseException {
            for (int i = 0; i < this.currentToken.length(); i++) {
                char charAt = this.currentToken.charAt(i);
                if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && (('0' > charAt || charAt > '9') && charAt != '_'))) {
                    if (charAt != '.') {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected identifier. Found '");
                        stringBuilder.append(this.currentToken);
                        stringBuilder.append("'");
                        throw parseException(stringBuilder.toString());
                    }
                }
            }
            String str = this.currentToken;
            nextToken();
            return str;
        }

        public boolean tryConsumeIdentifier() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r1.consumeIdentifier();	 Catch:{ ParseException -> 0x0005 }
            r0 = 1;
            return r0;
        L_0x0005:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.TextFormat.Tokenizer.tryConsumeIdentifier():boolean");
        }

        public int consumeInt32() throws ParseException {
            try {
                int parseInt32 = TextFormat.parseInt32(this.currentToken);
                nextToken();
                return parseInt32;
            } catch (NumberFormatException e) {
                throw integerParseException(e);
            }
        }

        public int consumeUInt32() throws ParseException {
            try {
                int parseUInt32 = TextFormat.parseUInt32(this.currentToken);
                nextToken();
                return parseUInt32;
            } catch (NumberFormatException e) {
                throw integerParseException(e);
            }
        }

        public long consumeInt64() throws ParseException {
            try {
                long parseInt64 = TextFormat.parseInt64(this.currentToken);
                nextToken();
                return parseInt64;
            } catch (NumberFormatException e) {
                throw integerParseException(e);
            }
        }

        public boolean tryConsumeInt64() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r1.consumeInt64();	 Catch:{ ParseException -> 0x0005 }
            r0 = 1;
            return r0;
        L_0x0005:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.TextFormat.Tokenizer.tryConsumeInt64():boolean");
        }

        public long consumeUInt64() throws ParseException {
            try {
                long parseUInt64 = TextFormat.parseUInt64(this.currentToken);
                nextToken();
                return parseUInt64;
            } catch (NumberFormatException e) {
                throw integerParseException(e);
            }
        }

        public boolean tryConsumeUInt64() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r1.consumeUInt64();	 Catch:{ ParseException -> 0x0005 }
            r0 = 1;
            return r0;
        L_0x0005:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.TextFormat.Tokenizer.tryConsumeUInt64():boolean");
        }

        public double consumeDouble() throws ParseException {
            if (DOUBLE_INFINITY.matcher(this.currentToken).matches()) {
                boolean startsWith = this.currentToken.startsWith("-");
                nextToken();
                return startsWith ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            } else if (this.currentToken.equalsIgnoreCase("nan")) {
                nextToken();
                return Double.NaN;
            } else {
                try {
                    double parseDouble = Double.parseDouble(this.currentToken);
                    nextToken();
                    return parseDouble;
                } catch (NumberFormatException e) {
                    throw floatParseException(e);
                }
            }
        }

        public boolean tryConsumeDouble() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r1.consumeDouble();	 Catch:{ ParseException -> 0x0005 }
            r0 = 1;
            return r0;
        L_0x0005:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.TextFormat.Tokenizer.tryConsumeDouble():boolean");
        }

        public float consumeFloat() throws ParseException {
            if (FLOAT_INFINITY.matcher(this.currentToken).matches()) {
                boolean startsWith = this.currentToken.startsWith("-");
                nextToken();
                return startsWith ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            } else if (FLOAT_NAN.matcher(this.currentToken).matches()) {
                nextToken();
                return Float.NaN;
            } else {
                try {
                    float parseFloat = Float.parseFloat(this.currentToken);
                    nextToken();
                    return parseFloat;
                } catch (NumberFormatException e) {
                    throw floatParseException(e);
                }
            }
        }

        public boolean tryConsumeFloat() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r1.consumeFloat();	 Catch:{ ParseException -> 0x0005 }
            r0 = 1;
            return r0;
        L_0x0005:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.TextFormat.Tokenizer.tryConsumeFloat():boolean");
        }

        public boolean consumeBoolean() throws ParseException {
            if (!(this.currentToken.equals("true") || this.currentToken.equals("True") || this.currentToken.equals("t"))) {
                if (!this.currentToken.equals("1")) {
                    if (!(this.currentToken.equals("false") || this.currentToken.equals("False") || this.currentToken.equals("f"))) {
                        if (!this.currentToken.equals("0")) {
                            throw parseException("Expected \"true\" or \"false\".");
                        }
                    }
                    nextToken();
                    return false;
                }
            }
            nextToken();
            return true;
        }

        public String consumeString() throws ParseException {
            return consumeByteString().toStringUtf8();
        }

        public boolean tryConsumeString() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r1.consumeString();	 Catch:{ ParseException -> 0x0005 }
            r0 = 1;
            return r0;
        L_0x0005:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.TextFormat.Tokenizer.tryConsumeString():boolean");
        }

        public ByteString consumeByteString() throws ParseException {
            Iterable arrayList = new ArrayList();
            consumeByteString(arrayList);
            while (true) {
                if (!this.currentToken.startsWith("'")) {
                    if (!this.currentToken.startsWith("\"")) {
                        return ByteString.copyFrom(arrayList);
                    }
                }
                consumeByteString(arrayList);
            }
        }

        private void consumeByteString(List<ByteString> list) throws ParseException {
            char c = '\u0000';
            if (this.currentToken.length() > 0) {
                c = this.currentToken.charAt(0);
            }
            if (c == '\"' || c == '\'') {
                if (this.currentToken.length() >= 2) {
                    if (this.currentToken.charAt(this.currentToken.length() - 1) == c) {
                        try {
                            ByteString unescapeBytes = TextFormat.unescapeBytes(this.currentToken.substring(1, this.currentToken.length() - 1));
                            nextToken();
                            list.add(unescapeBytes);
                            return;
                        } catch (List<ByteString> list2) {
                            throw parseException(list2.getMessage());
                        }
                    }
                }
                throw parseException("String missing ending quote.");
            }
            throw parseException("Expected string.");
        }

        public ParseException parseException(String str) {
            return new ParseException(this.line + 1, this.column + 1, str);
        }

        public ParseException parseExceptionPreviousToken(String str) {
            return new ParseException(this.previousLine + 1, this.previousColumn + 1, str);
        }

        private ParseException integerParseException(NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't parse integer: ");
            stringBuilder.append(numberFormatException.getMessage());
            return parseException(stringBuilder.toString());
        }

        private ParseException floatParseException(NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't parse number: ");
            stringBuilder.append(numberFormatException.getMessage());
            return parseException(stringBuilder.toString());
        }

        public UnknownFieldParseException unknownFieldParseExceptionPreviousToken(String str, String str2) {
            return new UnknownFieldParseException(this.previousLine + 1, this.previousColumn + 1, str, str2);
        }
    }

    public static class UnknownFieldParseException extends ParseException {
        private final String unknownField;

        public UnknownFieldParseException(String str) {
            this(-1, -1, "", str);
        }

        public UnknownFieldParseException(int i, int i2, String str, String str2) {
            super(i, i2, str2);
            this.unknownField = str;
        }

        public String getUnknownField() {
            return this.unknownField;
        }
    }

    private static int digitValue(byte b) {
        return ((byte) 48 > b || b > (byte) 57) ? ((byte) 97 > b || b > (byte) 122) ? (b - 65) + 10 : (b - 97) + 10 : b - 48;
    }

    private static boolean isHex(byte b) {
        return ((byte) 48 <= b && b <= (byte) 57) || (((byte) 97 <= b && b <= (byte) 102) || ((byte) 65 <= b && b <= (byte) 70));
    }

    private static boolean isOctal(byte b) {
        return (byte) 48 <= b && b <= (byte) 55;
    }

    private TextFormat() {
    }

    public static void print(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
        Printer.DEFAULT.print(messageOrBuilder, multiLineOutput(appendable));
    }

    public static void print(UnknownFieldSet unknownFieldSet, Appendable appendable) throws IOException {
        Printer.DEFAULT.printUnknownFields(unknownFieldSet, multiLineOutput(appendable));
    }

    public static void printUnicode(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
        Printer.UNICODE.print(messageOrBuilder, multiLineOutput(appendable));
    }

    public static void printUnicode(UnknownFieldSet unknownFieldSet, Appendable appendable) throws IOException {
        Printer.UNICODE.printUnknownFields(unknownFieldSet, multiLineOutput(appendable));
    }

    public static String shortDebugString(MessageOrBuilder messageOrBuilder) {
        try {
            Appendable stringBuilder = new StringBuilder();
            Printer.DEFAULT.print(messageOrBuilder, singleLineOutput(stringBuilder));
            return stringBuilder.toString();
        } catch (MessageOrBuilder messageOrBuilder2) {
            throw new IllegalStateException(messageOrBuilder2);
        }
    }

    public static String shortDebugString(FieldDescriptor fieldDescriptor, Object obj) {
        try {
            Appendable stringBuilder = new StringBuilder();
            Printer.DEFAULT.printField(fieldDescriptor, obj, singleLineOutput(stringBuilder));
            return stringBuilder.toString();
        } catch (FieldDescriptor fieldDescriptor2) {
            throw new IllegalStateException(fieldDescriptor2);
        }
    }

    public static String shortDebugString(UnknownFieldSet unknownFieldSet) {
        try {
            Appendable stringBuilder = new StringBuilder();
            Printer.DEFAULT.printUnknownFields(unknownFieldSet, singleLineOutput(stringBuilder));
            return stringBuilder.toString();
        } catch (UnknownFieldSet unknownFieldSet2) {
            throw new IllegalStateException(unknownFieldSet2);
        }
    }

    public static String printToString(MessageOrBuilder messageOrBuilder) {
        try {
            Appendable stringBuilder = new StringBuilder();
            print(messageOrBuilder, stringBuilder);
            return stringBuilder.toString();
        } catch (MessageOrBuilder messageOrBuilder2) {
            throw new IllegalStateException(messageOrBuilder2);
        }
    }

    public static String printToString(UnknownFieldSet unknownFieldSet) {
        try {
            Appendable stringBuilder = new StringBuilder();
            print(unknownFieldSet, stringBuilder);
            return stringBuilder.toString();
        } catch (UnknownFieldSet unknownFieldSet2) {
            throw new IllegalStateException(unknownFieldSet2);
        }
    }

    public static String printToUnicodeString(MessageOrBuilder messageOrBuilder) {
        try {
            Appendable stringBuilder = new StringBuilder();
            Printer.UNICODE.print(messageOrBuilder, multiLineOutput(stringBuilder));
            return stringBuilder.toString();
        } catch (MessageOrBuilder messageOrBuilder2) {
            throw new IllegalStateException(messageOrBuilder2);
        }
    }

    public static String printToUnicodeString(UnknownFieldSet unknownFieldSet) {
        try {
            Appendable stringBuilder = new StringBuilder();
            Printer.UNICODE.printUnknownFields(unknownFieldSet, multiLineOutput(stringBuilder));
            return stringBuilder.toString();
        } catch (UnknownFieldSet unknownFieldSet2) {
            throw new IllegalStateException(unknownFieldSet2);
        }
    }

    public static void printField(FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        Printer.DEFAULT.printField(fieldDescriptor, obj, multiLineOutput(appendable));
    }

    public static String printFieldToString(FieldDescriptor fieldDescriptor, Object obj) {
        try {
            Appendable stringBuilder = new StringBuilder();
            printField(fieldDescriptor, obj, stringBuilder);
            return stringBuilder.toString();
        } catch (FieldDescriptor fieldDescriptor2) {
            throw new IllegalStateException(fieldDescriptor2);
        }
    }

    public static void printUnicodeFieldValue(FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        Printer.UNICODE.printFieldValue(fieldDescriptor, obj, multiLineOutput(appendable));
    }

    public static void printFieldValue(FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        Printer.DEFAULT.printFieldValue(fieldDescriptor, obj, multiLineOutput(appendable));
    }

    public static void printUnknownFieldValue(int i, Object obj, Appendable appendable) throws IOException {
        printUnknownFieldValue(i, obj, multiLineOutput(appendable));
    }

    private static void printUnknownFieldValue(int i, Object obj, TextGenerator textGenerator) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType != 5) {
            switch (tagWireType) {
                case 0:
                    textGenerator.print(unsignedToString(((Long) obj).longValue()));
                    return;
                case 1:
                    textGenerator.print(String.format((Locale) null, "0x%016x", new Object[]{(Long) obj}));
                    return;
                case 2:
                    textGenerator.print("\"");
                    textGenerator.print(escapeBytes((ByteString) obj));
                    textGenerator.print("\"");
                    return;
                case 3:
                    Printer.DEFAULT.printUnknownFields((UnknownFieldSet) obj, textGenerator);
                    return;
                default:
                    textGenerator = new StringBuilder();
                    textGenerator.append("Bad tag: ");
                    textGenerator.append(i);
                    throw new IllegalArgumentException(textGenerator.toString());
            }
        }
        textGenerator.print(String.format((Locale) null, "0x%08x", new Object[]{(Integer) obj}));
    }

    public static String unsignedToString(int i) {
        if (i >= 0) {
            return Integer.toString(i);
        }
        return Long.toString(((long) i) & 4294967295L);
    }

    public static String unsignedToString(long j) {
        if (j >= 0) {
            return Long.toString(j);
        }
        return BigInteger.valueOf(j & Format.OFFSET_SAMPLE_RELATIVE).setBit(63).toString();
    }

    private static TextGenerator multiLineOutput(Appendable appendable) {
        return new TextGenerator(appendable, false);
    }

    private static TextGenerator singleLineOutput(Appendable appendable) {
        return new TextGenerator(appendable, true);
    }

    public static Parser getParser() {
        return PARSER;
    }

    public static void merge(Readable readable, Builder builder) throws IOException {
        PARSER.merge(readable, builder);
    }

    public static void merge(CharSequence charSequence, Builder builder) throws ParseException {
        PARSER.merge(charSequence, builder);
    }

    public static void merge(Readable readable, ExtensionRegistry extensionRegistry, Builder builder) throws IOException {
        PARSER.merge(readable, extensionRegistry, builder);
    }

    public static void merge(CharSequence charSequence, ExtensionRegistry extensionRegistry, Builder builder) throws ParseException {
        PARSER.merge(charSequence, extensionRegistry, builder);
    }

    public static String escapeBytes(ByteString byteString) {
        return TextFormatEscaper.escapeBytes(byteString);
    }

    public static String escapeBytes(byte[] bArr) {
        return TextFormatEscaper.escapeBytes(bArr);
    }

    public static ByteString unescapeBytes(CharSequence charSequence) throws InvalidEscapeSequenceException {
        charSequence = ByteString.copyFromUtf8(charSequence.toString());
        byte[] bArr = new byte[charSequence.size()];
        int i = 0;
        int i2 = 0;
        while (i < charSequence.size()) {
            int i3;
            byte byteAt = charSequence.byteAt(i);
            if (byteAt == (byte) 92) {
                i++;
                if (i < charSequence.size()) {
                    byteAt = charSequence.byteAt(i);
                    int digitValue;
                    if (isOctal(byteAt)) {
                        digitValue = digitValue(byteAt);
                        i3 = i + 1;
                        if (i3 < charSequence.size() && isOctal(charSequence.byteAt(i3))) {
                            digitValue = (digitValue * 8) + digitValue(charSequence.byteAt(i3));
                            i = i3;
                        }
                        i3 = i + 1;
                        if (i3 < charSequence.size() && isOctal(charSequence.byteAt(i3))) {
                            digitValue = (digitValue * 8) + digitValue(charSequence.byteAt(i3));
                            i = i3;
                        }
                        i3 = i2 + 1;
                        bArr[i2] = (byte) digitValue;
                    } else {
                        if (byteAt == (byte) 34) {
                            digitValue = i2 + 1;
                            bArr[i2] = (byte) 34;
                        } else if (byteAt == (byte) 39) {
                            digitValue = i2 + 1;
                            bArr[i2] = (byte) 39;
                        } else if (byteAt == (byte) 92) {
                            digitValue = i2 + 1;
                            bArr[i2] = (byte) 92;
                        } else if (byteAt == (byte) 102) {
                            digitValue = i2 + 1;
                            bArr[i2] = (byte) 12;
                        } else if (byteAt == (byte) 110) {
                            digitValue = i2 + 1;
                            bArr[i2] = (byte) 10;
                        } else if (byteAt == (byte) 114) {
                            digitValue = i2 + 1;
                            bArr[i2] = (byte) 13;
                        } else if (byteAt == (byte) 116) {
                            digitValue = i2 + 1;
                            bArr[i2] = (byte) 9;
                        } else if (byteAt == (byte) 118) {
                            digitValue = i2 + 1;
                            bArr[i2] = (byte) 11;
                        } else if (byteAt != (byte) 120) {
                            switch (byteAt) {
                                case (byte) 97:
                                    digitValue = i2 + 1;
                                    bArr[i2] = (byte) 7;
                                    break;
                                case (byte) 98:
                                    digitValue = i2 + 1;
                                    bArr[i2] = (byte) 8;
                                    break;
                                default:
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid escape sequence: '\\");
                                    stringBuilder.append((char) byteAt);
                                    stringBuilder.append('\'');
                                    throw new InvalidEscapeSequenceException(stringBuilder.toString());
                            }
                        } else {
                            i++;
                            if (i >= charSequence.size() || !isHex(charSequence.byteAt(i))) {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\x' with no digits");
                            }
                            digitValue = digitValue(charSequence.byteAt(i));
                            i3 = i + 1;
                            if (i3 < charSequence.size() && isHex(charSequence.byteAt(i3))) {
                                digitValue = (digitValue * 16) + digitValue(charSequence.byteAt(i3));
                                i = i3;
                            }
                            i3 = i2 + 1;
                            bArr[i2] = (byte) digitValue;
                        }
                        i2 = digitValue;
                        i++;
                    }
                } else {
                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\' at end of string.");
                }
            }
            i3 = i2 + 1;
            bArr[i2] = byteAt;
            i2 = i3;
            i++;
        }
        if (bArr.length == i2) {
            return ByteString.wrap(bArr);
        }
        return ByteString.copyFrom(bArr, 0, i2);
    }

    static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return TextFormatEscaper.escapeDoubleQuotesAndBackslashes(str);
    }

    static String unescapeText(String str) throws InvalidEscapeSequenceException {
        return unescapeBytes(str).toStringUtf8();
    }

    static int parseInt32(String str) throws NumberFormatException {
        return (int) parseInteger(str, true, false);
    }

    static int parseUInt32(String str) throws NumberFormatException {
        return (int) parseInteger(str, false, false);
    }

    static long parseInt64(String str) throws NumberFormatException {
        return parseInteger(str, true, true);
    }

    static long parseUInt64(String str) throws NumberFormatException {
        return parseInteger(str, false, true);
    }

    private static long parseInteger(String str, boolean z, boolean z2) throws NumberFormatException {
        int i = 0;
        Object obj = 1;
        if (!str.startsWith("-", 0)) {
            obj = null;
        } else if (z) {
            i = 1;
        } else {
            z2 = new StringBuilder();
            z2.append("Number must be positive: ");
            z2.append(str);
            throw new NumberFormatException(z2.toString());
        }
        int i2 = 10;
        if (str.startsWith("0x", i)) {
            i += 2;
            i2 = 16;
        } else if (str.startsWith("0", i)) {
            i2 = 8;
        }
        String substring = str.substring(i);
        if (substring.length() < 16) {
            long parseLong = Long.parseLong(substring, i2);
            if (obj != null) {
                parseLong = -parseLong;
            }
            if (z2) {
                return parseLong;
            }
            if (z) {
                if (parseLong <= true && parseLong >= true) {
                    return parseLong;
                }
                z2 = new StringBuilder();
                z2.append("Number out of range for 32-bit signed integer: ");
                z2.append(str);
                throw new NumberFormatException(z2.toString());
            } else if (parseLong < true && parseLong >= false) {
                return parseLong;
            } else {
                z2 = new StringBuilder();
                z2.append("Number out of range for 32-bit unsigned integer: ");
                z2.append(str);
                throw new NumberFormatException(z2.toString());
            }
        }
        BigInteger bigInteger = new BigInteger(substring, i2);
        if (obj != null) {
            bigInteger = bigInteger.negate();
        }
        if (z2) {
            if (z) {
                if (bigInteger.bitLength() > true) {
                    z2 = new StringBuilder();
                    z2.append("Number out of range for 64-bit signed integer: ");
                    z2.append(str);
                    throw new NumberFormatException(z2.toString());
                }
            } else if (bigInteger.bitLength() > true) {
                z2 = new StringBuilder();
                z2.append("Number out of range for 64-bit unsigned integer: ");
                z2.append(str);
                throw new NumberFormatException(z2.toString());
            }
        } else if (z) {
            if (bigInteger.bitLength() > true) {
                z2 = new StringBuilder();
                z2.append("Number out of range for 32-bit signed integer: ");
                z2.append(str);
                throw new NumberFormatException(z2.toString());
            }
        } else if (bigInteger.bitLength() > true) {
            z2 = new StringBuilder();
            z2.append("Number out of range for 32-bit unsigned integer: ");
            z2.append(str);
            throw new NumberFormatException(z2.toString());
        }
        return bigInteger.longValue();
    }
}
