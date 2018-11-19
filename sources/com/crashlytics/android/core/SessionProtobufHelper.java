package com.crashlytics.android.core;

import android.app.ActivityManager.RunningAppProcessInfo;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class SessionProtobufHelper {
    private static final String SIGNAL_DEFAULT = "0";
    private static final ByteString SIGNAL_DEFAULT_BYTE_STRING = ByteString.copyFromUtf8(SIGNAL_DEFAULT);
    private static final ByteString UNITY_PLATFORM_BYTE_STRING = ByteString.copyFromUtf8("Unity");

    private SessionProtobufHelper() {
    }

    public static void writeBeginSession(CodedOutputStream codedOutputStream, String str, String str2, long j) throws Exception {
        codedOutputStream.writeBytes(1, ByteString.copyFromUtf8(str2));
        codedOutputStream.writeBytes(2, ByteString.copyFromUtf8(str));
        codedOutputStream.writeUInt64(3, j);
    }

    public static void writeSessionApp(CodedOutputStream codedOutputStream, String str, String str2, String str3, String str4, String str5, int i, String str6) throws Exception {
        str = ByteString.copyFromUtf8(str);
        str2 = ByteString.copyFromUtf8(str2);
        str3 = ByteString.copyFromUtf8(str3);
        str4 = ByteString.copyFromUtf8(str4);
        str5 = ByteString.copyFromUtf8(str5);
        str6 = str6 != null ? ByteString.copyFromUtf8(str6) : null;
        codedOutputStream.writeTag(7, 2);
        codedOutputStream.writeRawVarint32(getSessionAppSize(str, str2, str3, str4, str5, i, str6));
        codedOutputStream.writeBytes(1, str);
        codedOutputStream.writeBytes(2, str3);
        codedOutputStream.writeBytes(3, str4);
        codedOutputStream.writeTag(5, 2);
        codedOutputStream.writeRawVarint32(getSessionAppOrgSize(str2));
        codedOutputStream.writeBytes(1, str2);
        codedOutputStream.writeBytes(6, str5);
        if (str6 != null) {
            codedOutputStream.writeBytes(8, UNITY_PLATFORM_BYTE_STRING);
            codedOutputStream.writeBytes(9, str6);
        }
        codedOutputStream.writeEnum(10, i);
    }

    public static void writeSessionOS(CodedOutputStream codedOutputStream, String str, String str2, boolean z) throws Exception {
        str = ByteString.copyFromUtf8(str);
        str2 = ByteString.copyFromUtf8(str2);
        codedOutputStream.writeTag(8, 2);
        codedOutputStream.writeRawVarint32(getSessionOSSize(str, str2, z));
        codedOutputStream.writeEnum(1, 3);
        codedOutputStream.writeBytes(2, str);
        codedOutputStream.writeBytes(3, str2);
        codedOutputStream.writeBool(4, z);
    }

    public static void writeSessionDevice(CodedOutputStream codedOutputStream, int i, String str, int i2, long j, long j2, boolean z, Map<DeviceIdentifierType, String> map, int i3, String str2, String str3) throws Exception {
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        ByteString stringToByteString = stringToByteString(str);
        ByteString stringToByteString2 = stringToByteString(str3);
        ByteString stringToByteString3 = stringToByteString(str2);
        codedOutputStream2.writeTag(9, 2);
        ByteString byteString = stringToByteString3;
        codedOutputStream2.writeRawVarint32(getSessionDeviceSize(i, stringToByteString, i2, j, j2, z, map, i3, stringToByteString3, stringToByteString2));
        codedOutputStream2.writeEnum(3, i);
        codedOutputStream2.writeBytes(4, stringToByteString);
        codedOutputStream2.writeUInt32(5, i2);
        codedOutputStream2.writeUInt64(6, j);
        codedOutputStream2.writeUInt64(7, j2);
        codedOutputStream2.writeBool(10, z);
        for (Entry entry : map.entrySet()) {
            codedOutputStream2.writeTag(11, 2);
            codedOutputStream2.writeRawVarint32(getDeviceIdentifierSize((DeviceIdentifierType) entry.getKey(), (String) entry.getValue()));
            codedOutputStream2.writeEnum(1, ((DeviceIdentifierType) entry.getKey()).protobufIndex);
            codedOutputStream2.writeBytes(2, ByteString.copyFromUtf8((String) entry.getValue()));
        }
        codedOutputStream2.writeUInt32(12, i3);
        if (byteString != null) {
            codedOutputStream2.writeBytes(13, byteString);
        }
        if (stringToByteString2 != null) {
            codedOutputStream2.writeBytes(14, stringToByteString2);
        }
    }

    public static void writeSessionUser(CodedOutputStream codedOutputStream, String str, String str2, String str3) throws Exception {
        if (str == null) {
            str = "";
        }
        str = ByteString.copyFromUtf8(str);
        ByteString stringToByteString = stringToByteString(str2);
        ByteString stringToByteString2 = stringToByteString(str3);
        int computeBytesSize = CodedOutputStream.computeBytesSize(1, str) + 0;
        if (str2 != null) {
            computeBytesSize += CodedOutputStream.computeBytesSize(2, stringToByteString);
        }
        if (str3 != null) {
            computeBytesSize += CodedOutputStream.computeBytesSize(3, stringToByteString2);
        }
        codedOutputStream.writeTag(6, 2);
        codedOutputStream.writeRawVarint32(computeBytesSize);
        codedOutputStream.writeBytes(1, str);
        if (str2 != null) {
            codedOutputStream.writeBytes(2, stringToByteString);
        }
        if (str3 != null) {
            codedOutputStream.writeBytes(3, stringToByteString2);
        }
    }

    public static void writeSessionEvent(CodedOutputStream codedOutputStream, long j, String str, TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, LogFileManager logFileManager, RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) throws Exception {
        ByteString byteString;
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        String str4 = str3;
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(str2);
        if (str4 == null) {
            byteString = null;
        } else {
            byteString = ByteString.copyFromUtf8(str4.replace("-", ""));
        }
        ByteString byteString2 = byteString;
        ByteString byteStringForLog = logFileManager.getByteStringForLog();
        if (byteStringForLog == null) {
            C15608c.h().d(CrashlyticsCore.TAG, "No log data to include with this event.");
        }
        logFileManager.clearLog();
        codedOutputStream2.writeTag(10, 2);
        codedOutputStream2.writeRawVarint32(getSessionEventSize(j, str, trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, 8, map, runningAppProcessInfo, i, copyFromUtf8, byteString2, f, i2, z, j2, j3, byteStringForLog));
        codedOutputStream2.writeUInt64(1, j);
        codedOutputStream2.writeBytes(2, ByteString.copyFromUtf8(str));
        CodedOutputStream codedOutputStream3 = codedOutputStream2;
        ByteString byteString3 = byteStringForLog;
        writeSessionEventApp(codedOutputStream3, trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, 8, copyFromUtf8, byteString2, map, runningAppProcessInfo, i);
        writeSessionEventDevice(codedOutputStream3, f, i2, z, i, j2, j3);
        writeSessionEventLog(codedOutputStream2, byteString3);
    }

    private static void writeSessionEventApp(CodedOutputStream codedOutputStream, TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, ByteString byteString, ByteString byteString2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) throws Exception {
        codedOutputStream.writeTag(3, 2);
        codedOutputStream.writeRawVarint32(getEventAppSize(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2, map, runningAppProcessInfo, i2));
        writeSessionEventAppExecution(codedOutputStream, trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2);
        if (map != null && map.isEmpty() == null) {
            writeSessionEventAppCustomAttributes(codedOutputStream, map);
        }
        if (runningAppProcessInfo != null) {
            codedOutputStream.writeBool(3, runningAppProcessInfo.importance != 100 ? true : null);
        }
        codedOutputStream.writeUInt32(4, i2);
    }

    private static void writeSessionEventAppExecution(CodedOutputStream codedOutputStream, TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, ByteString byteString, ByteString byteString2) throws Exception {
        codedOutputStream.writeTag(1, 2);
        codedOutputStream.writeRawVarint32(getEventAppExecutionSize(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2));
        writeThread(codedOutputStream, thread, stackTraceElementArr, 4, true);
        thread = threadArr.length;
        for (int i2 = 0; i2 < thread; i2++) {
            writeThread(codedOutputStream, threadArr[i2], (StackTraceElement[]) list.get(i2), 0, false);
        }
        writeSessionEventAppExecutionException(codedOutputStream, trimmedThrowableData, 1, i, 2);
        codedOutputStream.writeTag(3, 2);
        codedOutputStream.writeRawVarint32(getEventAppExecutionSignalSize());
        codedOutputStream.writeBytes(1, SIGNAL_DEFAULT_BYTE_STRING);
        codedOutputStream.writeBytes(2, SIGNAL_DEFAULT_BYTE_STRING);
        codedOutputStream.writeUInt64(3, 0);
        codedOutputStream.writeTag(4, 2);
        codedOutputStream.writeRawVarint32(getBinaryImageSize(byteString, byteString2));
        codedOutputStream.writeUInt64(1, 0);
        codedOutputStream.writeUInt64(2, 0);
        codedOutputStream.writeBytes(3, byteString);
        if (byteString2 != null) {
            codedOutputStream.writeBytes(4, byteString2);
        }
    }

    private static void writeSessionEventAppCustomAttributes(CodedOutputStream codedOutputStream, Map<String, String> map) throws Exception {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            codedOutputStream.writeTag(2, 2);
            codedOutputStream.writeRawVarint32(getEventAppCustomAttributeSize((String) entry.getKey(), (String) entry.getValue()));
            codedOutputStream.writeBytes(1, ByteString.copyFromUtf8((String) entry.getKey()));
            String str = (String) entry.getValue();
            if (str == null) {
                str = "";
            }
            codedOutputStream.writeBytes(2, ByteString.copyFromUtf8(str));
        }
    }

    private static void writeSessionEventAppExecutionException(CodedOutputStream codedOutputStream, TrimmedThrowableData trimmedThrowableData, int i, int i2, int i3) throws Exception {
        codedOutputStream.writeTag(i3, 2);
        codedOutputStream.writeRawVarint32(getEventAppExecutionExceptionSize(trimmedThrowableData, 1, i2));
        codedOutputStream.writeBytes(1, ByteString.copyFromUtf8(trimmedThrowableData.className));
        String str = trimmedThrowableData.localizedMessage;
        if (str != null) {
            codedOutputStream.writeBytes(3, ByteString.copyFromUtf8(str));
        }
        int i4 = 0;
        for (StackTraceElement writeFrame : trimmedThrowableData.stacktrace) {
            writeFrame(codedOutputStream, 4, writeFrame, true);
        }
        trimmedThrowableData = trimmedThrowableData.cause;
        if (trimmedThrowableData == null) {
            return;
        }
        if (i < i2) {
            writeSessionEventAppExecutionException(codedOutputStream, trimmedThrowableData, i + 1, i2, 6);
            return;
        }
        while (trimmedThrowableData != null) {
            trimmedThrowableData = trimmedThrowableData.cause;
            i4++;
        }
        codedOutputStream.writeUInt32(7, i4);
    }

    private static void writeThread(CodedOutputStream codedOutputStream, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) throws Exception {
        codedOutputStream.writeTag(1, 2);
        codedOutputStream.writeRawVarint32(getThreadSize(thread, stackTraceElementArr, i, z));
        codedOutputStream.writeBytes(1, ByteString.copyFromUtf8(thread.getName()));
        codedOutputStream.writeUInt32(2, i);
        for (StackTraceElement writeFrame : stackTraceElementArr) {
            writeFrame(codedOutputStream, 3, writeFrame, z);
        }
    }

    private static void writeFrame(CodedOutputStream codedOutputStream, int i, StackTraceElement stackTraceElement, boolean z) throws Exception {
        codedOutputStream.writeTag(i, 2);
        codedOutputStream.writeRawVarint32(getFrameSize(stackTraceElement, z));
        if (stackTraceElement.isNativeMethod() != 0) {
            codedOutputStream.writeUInt64(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            codedOutputStream.writeUInt64(1, 0);
        }
        i = new StringBuilder();
        i.append(stackTraceElement.getClassName());
        i.append(".");
        i.append(stackTraceElement.getMethodName());
        codedOutputStream.writeBytes(2, ByteString.copyFromUtf8(i.toString()));
        if (stackTraceElement.getFileName() != 0) {
            codedOutputStream.writeBytes(3, ByteString.copyFromUtf8(stackTraceElement.getFileName()));
        }
        int i2 = 4;
        if (stackTraceElement.isNativeMethod() == 0 && stackTraceElement.getLineNumber() > 0) {
            codedOutputStream.writeUInt64(4, (long) stackTraceElement.getLineNumber());
        }
        if (!z) {
            i2 = 0;
        }
        codedOutputStream.writeUInt32(5, i2);
    }

    private static void writeSessionEventDevice(CodedOutputStream codedOutputStream, Float f, int i, boolean z, int i2, long j, long j2) throws Exception {
        codedOutputStream.writeTag(5, 2);
        codedOutputStream.writeRawVarint32(getEventDeviceSize(f, i, z, i2, j, j2));
        if (f != null) {
            codedOutputStream.writeFloat(1, f.floatValue());
        }
        codedOutputStream.writeSInt32(2, i);
        codedOutputStream.writeBool(3, z);
        codedOutputStream.writeUInt32(4, i2);
        codedOutputStream.writeUInt64(5, j);
        codedOutputStream.writeUInt64(6, j2);
    }

    private static void writeSessionEventLog(CodedOutputStream codedOutputStream, ByteString byteString) throws Exception {
        if (byteString != null) {
            codedOutputStream.writeTag(6, 2);
            codedOutputStream.writeRawVarint32(getEventLogSize(byteString));
            codedOutputStream.writeBytes(1, byteString);
        }
    }

    private static int getSessionAppSize(ByteString byteString, ByteString byteString2, ByteString byteString3, ByteString byteString4, ByteString byteString5, int i, ByteString byteString6) {
        byteString = ((CodedOutputStream.computeBytesSize(1, byteString) + 0) + CodedOutputStream.computeBytesSize(2, byteString3)) + CodedOutputStream.computeBytesSize(3, byteString4);
        byteString2 = getSessionAppOrgSize(byteString2);
        byteString = (byteString + ((CodedOutputStream.computeTagSize(5) + CodedOutputStream.computeRawVarint32Size(byteString2)) + byteString2)) + CodedOutputStream.computeBytesSize(6, byteString5);
        if (byteString6 != null) {
            byteString = (byteString + CodedOutputStream.computeBytesSize(8, UNITY_PLATFORM_BYTE_STRING)) + CodedOutputStream.computeBytesSize(9, byteString6);
        }
        return byteString + CodedOutputStream.computeEnumSize(10, i);
    }

    private static int getSessionAppOrgSize(ByteString byteString) {
        return CodedOutputStream.computeBytesSize(1, byteString) + 0;
    }

    private static int getSessionOSSize(ByteString byteString, ByteString byteString2, boolean z) {
        return (((CodedOutputStream.computeEnumSize(1, 3) + 0) + CodedOutputStream.computeBytesSize(2, byteString)) + CodedOutputStream.computeBytesSize(3, byteString2)) + CodedOutputStream.computeBoolSize(4, z);
    }

    private static int getDeviceIdentifierSize(DeviceIdentifierType deviceIdentifierType, String str) {
        return CodedOutputStream.computeEnumSize(1, deviceIdentifierType.protobufIndex) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(str));
    }

    private static int getSessionDeviceSize(int i, ByteString byteString, int i2, long j, long j2, boolean z, Map<DeviceIdentifierType, String> map, int i3, ByteString byteString2, ByteString byteString3) {
        int i4 = 0;
        i = CodedOutputStream.computeEnumSize(3, i) + 0;
        if (byteString == null) {
            byteString = null;
        } else {
            byteString = CodedOutputStream.computeBytesSize(4, byteString);
        }
        i = ((((i + byteString) + CodedOutputStream.computeUInt32Size(5, i2)) + CodedOutputStream.computeUInt64Size(6, j)) + CodedOutputStream.computeUInt64Size(7, j2)) + CodedOutputStream.computeBoolSize(10, z);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                i2 = getDeviceIdentifierSize((DeviceIdentifierType) entry.getKey(), (String) entry.getValue());
                i += (CodedOutputStream.computeTagSize(11) + CodedOutputStream.computeRawVarint32Size(i2)) + i2;
            }
        }
        i += CodedOutputStream.computeUInt32Size(12, i3);
        if (byteString2 == null) {
            byteString = null;
        } else {
            byteString = CodedOutputStream.computeBytesSize(13, byteString2);
        }
        i += byteString;
        if (byteString3 != null) {
            i4 = CodedOutputStream.computeBytesSize(14, byteString3);
        }
        return i + i4;
    }

    private static int getBinaryImageSize(ByteString byteString, ByteString byteString2) {
        int computeUInt64Size = ((CodedOutputStream.computeUInt64Size(1, 0) + 0) + CodedOutputStream.computeUInt64Size(2, 0)) + CodedOutputStream.computeBytesSize(3, byteString);
        return byteString2 != null ? computeUInt64Size + CodedOutputStream.computeBytesSize(4, byteString2) : computeUInt64Size;
    }

    private static int getSessionEventSize(long j, String str, TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2, ByteString byteString, ByteString byteString2, Float f, int i3, boolean z, long j2, long j3, ByteString byteString3) {
        int computeUInt64Size = (CodedOutputStream.computeUInt64Size(1, j) + 0) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(str));
        int eventAppSize = getEventAppSize(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2, map, runningAppProcessInfo, i2);
        computeUInt64Size += (CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(eventAppSize)) + eventAppSize;
        eventAppSize = getEventDeviceSize(f, i3, z, i2, j2, j3);
        computeUInt64Size += (CodedOutputStream.computeTagSize(5) + CodedOutputStream.computeRawVarint32Size(eventAppSize)) + eventAppSize;
        if (byteString3 == null) {
            return computeUInt64Size;
        }
        eventAppSize = getEventLogSize(byteString3);
        return computeUInt64Size + ((CodedOutputStream.computeTagSize(6) + CodedOutputStream.computeRawVarint32Size(eventAppSize)) + eventAppSize);
    }

    private static int getEventAppSize(TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, ByteString byteString, ByteString byteString2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        trimmedThrowableData = getEventAppExecutionSize(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2);
        stackTraceElementArr = (CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(trimmedThrowableData)) + trimmedThrowableData;
        trimmedThrowableData = null;
        stackTraceElementArr += null;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                list = getEventAppCustomAttributeSize((String) entry.getKey(), (String) entry.getValue());
                stackTraceElementArr += (CodedOutputStream.computeTagSize(2) + CodedOutputStream.computeRawVarint32Size(list)) + list;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                trimmedThrowableData = true;
            }
            stackTraceElementArr += CodedOutputStream.computeBoolSize(3, trimmedThrowableData);
        }
        return stackTraceElementArr + CodedOutputStream.computeUInt32Size(4, i2);
    }

    private static int getEventAppExecutionSize(TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, ByteString byteString, ByteString byteString2) {
        thread = getThreadSize(thread, stackTraceElementArr, 4, true);
        stackTraceElementArr = ((CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(thread)) + thread) + null;
        int length = threadArr.length;
        int i2 = stackTraceElementArr;
        for (stackTraceElementArr = null; stackTraceElementArr < length; stackTraceElementArr++) {
            int threadSize = getThreadSize(threadArr[stackTraceElementArr], (StackTraceElement[]) list.get(stackTraceElementArr), 0, false);
            i2 += (CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(threadSize)) + threadSize;
        }
        trimmedThrowableData = getEventAppExecutionExceptionSize(trimmedThrowableData, 1, i);
        i2 += (CodedOutputStream.computeTagSize(2) + CodedOutputStream.computeRawVarint32Size(trimmedThrowableData)) + trimmedThrowableData;
        trimmedThrowableData = getEventAppExecutionSignalSize();
        i2 += (CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(trimmedThrowableData)) + trimmedThrowableData;
        trimmedThrowableData = getBinaryImageSize(byteString, byteString2);
        return i2 + ((CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(trimmedThrowableData)) + trimmedThrowableData);
    }

    private static int getEventAppCustomAttributeSize(String str, String str2) {
        str = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(str));
        if (str2 == null) {
            str2 = "";
        }
        return str + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(str2));
    }

    private static int getEventDeviceSize(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + CodedOutputStream.computeFloatSize(1, f.floatValue());
        }
        return ((((i3 + CodedOutputStream.computeSInt32Size(2, i)) + CodedOutputStream.computeBoolSize(3, z)) + CodedOutputStream.computeUInt32Size(4, i2)) + CodedOutputStream.computeUInt64Size(5, j)) + CodedOutputStream.computeUInt64Size(6, j2);
    }

    private static int getEventLogSize(ByteString byteString) {
        return CodedOutputStream.computeBytesSize(1, byteString);
    }

    private static int getEventAppExecutionExceptionSize(TrimmedThrowableData trimmedThrowableData, int i, int i2) {
        int i3 = 0;
        int computeBytesSize = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(trimmedThrowableData.className)) + 0;
        String str = trimmedThrowableData.localizedMessage;
        if (str != null) {
            computeBytesSize += CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(str));
        }
        int i4 = computeBytesSize;
        for (StackTraceElement frameSize : trimmedThrowableData.stacktrace) {
            int frameSize2 = getFrameSize(frameSize, true);
            i4 += (CodedOutputStream.computeTagSize(4) + CodedOutputStream.computeRawVarint32Size(frameSize2)) + frameSize2;
        }
        trimmedThrowableData = trimmedThrowableData.cause;
        if (trimmedThrowableData == null) {
            return i4;
        }
        if (i < i2) {
            trimmedThrowableData = getEventAppExecutionExceptionSize(trimmedThrowableData, i + 1, i2);
            return i4 + ((CodedOutputStream.computeTagSize(6) + CodedOutputStream.computeRawVarint32Size(trimmedThrowableData)) + trimmedThrowableData);
        }
        while (trimmedThrowableData != null) {
            trimmedThrowableData = trimmedThrowableData.cause;
            i3++;
        }
        return i4 + CodedOutputStream.computeUInt32Size(7, i3);
    }

    private static int getEventAppExecutionSignalSize() {
        return ((CodedOutputStream.computeBytesSize(1, SIGNAL_DEFAULT_BYTE_STRING) + 0) + CodedOutputStream.computeBytesSize(2, SIGNAL_DEFAULT_BYTE_STRING)) + CodedOutputStream.computeUInt64Size(3, 0);
    }

    private static int getFrameSize(StackTraceElement stackTraceElement, boolean z) {
        int computeUInt64Size;
        int i = 0;
        if (stackTraceElement.isNativeMethod()) {
            computeUInt64Size = CodedOutputStream.computeUInt64Size(1, (long) Math.max(stackTraceElement.getLineNumber(), 0)) + 0;
        } else {
            computeUInt64Size = CodedOutputStream.computeUInt64Size(1, 0) + 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stackTraceElement.getClassName());
        stringBuilder.append(".");
        stringBuilder.append(stackTraceElement.getMethodName());
        computeUInt64Size += CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(stringBuilder.toString()));
        if (stackTraceElement.getFileName() != null) {
            computeUInt64Size += CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            computeUInt64Size += CodedOutputStream.computeUInt64Size(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i = 2;
        }
        return computeUInt64Size + CodedOutputStream.computeUInt32Size(5, i);
    }

    private static int getThreadSize(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        thread = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(thread.getName())) + CodedOutputStream.computeUInt32Size(2, i);
        for (StackTraceElement frameSize : stackTraceElementArr) {
            int frameSize2 = getFrameSize(frameSize, z);
            thread += (CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(frameSize2)) + frameSize2;
        }
        return thread;
    }

    private static ByteString stringToByteString(String str) {
        return str == null ? null : ByteString.copyFromUtf8(str);
    }
}
