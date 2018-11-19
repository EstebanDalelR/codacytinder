package com.google.android.m4b.maps.bo;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.DataInput;
import java.io.DataOutput;

public final class bl {
    /* renamed from: a */
    public static int m21698a(DataInput dataInput) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            return readUnsignedByte;
        }
        readUnsignedByte &= 127;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        readUnsignedByte |= (readUnsignedByte2 & 127) << 7;
        if (readUnsignedByte2 < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            return readUnsignedByte;
        }
        readUnsignedByte2 = dataInput.readUnsignedByte();
        readUnsignedByte |= (readUnsignedByte2 & 127) << 14;
        if (readUnsignedByte2 < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            return readUnsignedByte;
        }
        readUnsignedByte2 = dataInput.readUnsignedByte();
        readUnsignedByte |= (readUnsignedByte2 & 127) << 21;
        if (readUnsignedByte2 < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            return readUnsignedByte;
        }
        readUnsignedByte2 = dataInput.readUnsignedByte();
        readUnsignedByte |= (readUnsignedByte2 & 127) << 28;
        if (readUnsignedByte2 < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            return readUnsignedByte;
        }
        while (readUnsignedByte2 >= ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            readUnsignedByte2 = dataInput.readUnsignedByte();
        }
        return readUnsignedByte;
    }

    /* renamed from: a */
    public static void m21699a(DataOutput dataOutput, int i) {
        if (i < 0) {
            long j = ((long) i) + 4294967296L;
            dataOutput.write((int) (j | 128));
            dataOutput.write((int) ((j >> 7) | 128));
            dataOutput.write((int) ((j >> 14) | 128));
            dataOutput.write((int) ((j >> 21) | 128));
            dataOutput.write((int) (j >> 28));
        } else if (i < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            dataOutput.write(i);
        } else if (i < 16384) {
            dataOutput.write(i | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            dataOutput.write(i >> 7);
        } else if (i < 2097152) {
            dataOutput.write(i | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            dataOutput.write((i >> 7) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            dataOutput.write(i >> 14);
        } else if (i < 268435456) {
            dataOutput.write(i | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            dataOutput.write((i >> 7) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            dataOutput.write((i >> 14) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            dataOutput.write(i >> 21);
        } else {
            dataOutput.write(i | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            dataOutput.write((i >> 7) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            dataOutput.write((i >> 14) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            dataOutput.write((i >> 21) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            dataOutput.write(i >> 28);
        }
    }

    /* renamed from: b */
    public static int m21700b(DataInput dataInput) {
        dataInput = m21698a(dataInput);
        return (-(dataInput & 1)) ^ (dataInput >>> 1);
    }
}
