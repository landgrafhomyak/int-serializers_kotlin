package ru.landgrafhomyak.utility;

import org.jetbrains.annotations.NotNull;

class IntSerializers {
    private IntSerializers() {
    }

    @NotNull
    static public byte[] encode8B(@NotNull final byte[] dst, final byte value, final int offset) {
        dst[offset] = value;
        return dst;
    }

    @NotNull
    static public byte[] encode8H(@NotNull final byte[] dst, final short value, final int offset) {
        dst[offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode8I(@NotNull final byte[] dst, final int value, final int offset) {
        dst[offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode8L(@NotNull final byte[] dst, final long value, final int offset) {
        dst[offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode16leB(@NotNull final byte[] dst, final byte value, int offset) {
        dst[offset] = value;
        dst[++offset] = (byte) (value < 0 ? 0xFF : 0x0);
        return dst;
    }

    @NotNull
    static public byte[] encode16beB(@NotNull final byte[] dst, final byte value, int offset) {
        dst[offset] = (byte) (value < 0 ? 0xFF : 0x0);
        dst[++offset] = value;
        return dst;
    }

    @NotNull
    static public byte[] encode16leBu(@NotNull final byte[] dst, final byte value, int offset) {
        dst[offset] = value;
        dst[++offset] = 0;
        return dst;
    }

    @NotNull
    static public byte[] encode16beBu(@NotNull final byte[] dst, final byte value, int offset) {
        dst[offset] = 0;
        dst[++offset] = value;
        return dst;
    }

    @NotNull
    static public byte[] encode16leH(@NotNull final byte[] dst, final short value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        return dst;
    }

    @NotNull
    static public byte[] encode16beH(@NotNull final byte[] dst, final short value, int offset) {
        dst[offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode16leI(@NotNull final byte[] dst, final int value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        return dst;
    }

    @NotNull
    static public byte[] encode16beI(@NotNull final byte[] dst, final int value, int offset) {
        dst[offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode16leL(@NotNull final byte[] dst, final long value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        return dst;
    }

    @NotNull
    static public byte[] encode16beL(@NotNull final byte[] dst, final long value, int offset) {
        dst[offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode24leB(@NotNull final byte[] dst, final byte value, int offset) {
        dst[offset] = value;
        dst[++offset] = 0;
        dst[++offset] = 0;
        return dst;
    }

    @NotNull
    static public byte[] encode24beB(@NotNull final byte[] dst, final byte value, int offset) {
        final byte sign = (byte) (value < 0 ? 0xFF : 0);
        dst[offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = value;
        return dst;
    }

    @NotNull
    static public byte[] encode24leBu(@NotNull final byte[] dst, final byte value, int offset) {
        final byte sign = (byte) (value < 0 ? 0xFF : 0);
        dst[offset] = value;
        dst[++offset] = sign;
        dst[++offset] = sign;
        return dst;
    }

    @NotNull
    static public byte[] encode24beBu(@NotNull final byte[] dst, final byte value, int offset) {
        dst[offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = value;
        return dst;
    }

    @NotNull
    static public byte[] encode24leH(@NotNull final byte[] dst, final short value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) (value < 0 ? 0xFF : 0);
        return dst;
    }

    @NotNull
    static public byte[] encode24beH(@NotNull final byte[] dst, final short value, int offset) {
        dst[offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        dst[++offset] = (byte) (value < 0 ? 0xFF : 0);
        return dst;
    }

    @NotNull
    static public byte[] encode24leHu(@NotNull final byte[] dst, final short value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = 0;
        return dst;
    }

    @NotNull
    static public byte[] encode24beHu(@NotNull final byte[] dst, final short value, int offset) {
        dst[offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        dst[++offset] = 0;
        return dst;
    }

    @NotNull
    static public byte[] encode24leI(@NotNull final byte[] dst, int value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) (value >>> 16);
        return dst;
    }

    @NotNull
    static public byte[] encode24beI(@NotNull final byte[] dst, int value, int offset) {
        dst[offset] = (byte) (value >>> 16);
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode24leL(@NotNull final byte[] dst, long value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) (value >>> 16);
        return dst;
    }

    @NotNull
    static public byte[] encode24beL(@NotNull final byte[] dst, long value, int offset) {
        dst[offset] = (byte) (value >>> 16);
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode32leB(@NotNull final byte[] dst, final byte value, int offset) {
        final byte sign = (byte) (value < 0 ? 0xFF : 0);
        dst[offset] = value;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        return dst;
    }

    @NotNull
    static public byte[] encode32beB(@NotNull final byte[] dst, final byte value, int offset) {
        final byte sign = (byte) (value < 0 ? 0xFF : 0);
        dst[offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = value;
        return dst;
    }

    @NotNull
    static public byte[] encode32leBu(@NotNull final byte[] dst, final byte value, int offset) {
        dst[offset] = value;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        return dst;
    }

    @NotNull
    static public byte[] encode32beBu(@NotNull final byte[] dst, final byte value, int offset) {
        dst[offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = value;
        return dst;
    }

    @NotNull
    static public byte[] encode32leH(@NotNull final byte[] dst, final short value, int offset) {
        final byte sign = (byte) (value < 0 ? 0xFF : 0);
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = sign;
        dst[++offset] = sign;
        return dst;
    }

    @NotNull
    static public byte[] encode32beH(@NotNull final byte[] dst, final short value, int offset) {
        final byte sign = (byte) (value < 0 ? 0xFF : 0);
        dst[offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode32leHu(@NotNull final byte[] dst, final short value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = 0;
        dst[++offset] = 0;
        return dst;
    }

    @NotNull
    static public byte[] encode32beHu(@NotNull final byte[] dst, final short value, int offset) {
        dst[offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode32leI(@NotNull final byte[] dst, int value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) (value >>> 16);
        dst[++offset] = (byte) (value >>> 24);
        return dst;
    }

    @NotNull
    static public byte[] encode32beI(@NotNull final byte[] dst, int value, int offset) {
        dst[offset] = (byte) (value >>> 24);
        dst[++offset] = (byte) (value >>> 16);
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode32leL(@NotNull final byte[] dst, long value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) (value >>> 16);
        dst[++offset] = (byte) (value >>> 24);
        return dst;
    }

    @NotNull
    static public byte[] encode32beL(@NotNull final byte[] dst, long value, int offset) {
        dst[offset] = (byte) (value >>> 24);
        dst[++offset] = (byte) (value >>> 16);
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode64leB(@NotNull final byte[] dst, final byte value, int offset) {
        final byte sign = (byte) (value < 0 ? 0xFF : 0);
        dst[offset] = value;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        return dst;
    }

    @NotNull
    static public byte[] encode64beB(@NotNull final byte[] dst, final byte value, int offset) {
        final byte sign = (byte) (value < 0 ? 0xFF : 0);
        dst[offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = value;
        return dst;
    }

    @NotNull
    static public byte[] encode64leBu(@NotNull final byte[] dst, final byte value, int offset) {
        dst[offset] = value;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        return dst;
    }

    @NotNull
    static public byte[] encode64beBu(@NotNull final byte[] dst, final byte value, int offset) {
        dst[offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = value;
        return dst;
    }

    @NotNull
    static public byte[] encode64leH(@NotNull final byte[] dst, final short value, int offset) {
        final byte sign = (byte) (value < 0 ? 0xFF : 0);
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        return dst;
    }

    @NotNull
    static public byte[] encode64beH(@NotNull final byte[] dst, final short value, int offset) {
        final byte sign = (byte) (value < 0 ? 0xFF : 0);
        dst[offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode64leHu(@NotNull final byte[] dst, final short value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        return dst;
    }

    @NotNull
    static public byte[] encode64beHu(@NotNull final byte[] dst, final short value, int offset) {
        dst[offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode64leI(@NotNull final byte[] dst, int value, int offset) {
        final byte sign = (byte) (value < 0 ? 0xFF : 0);
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) (value >>> 16);
        dst[++offset] = (byte) (value >>> 24);
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        return dst;
    }

    @NotNull
    static public byte[] encode64beI(@NotNull final byte[] dst, int value, int offset) {
        final byte sign = (byte) (value < 0 ? 0xFF : 0);
        dst[offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = sign;
        dst[++offset] = (byte) (value >>> 24);
        dst[++offset] = (byte) (value >>> 16);
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode64leIu(@NotNull final byte[] dst, int value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) (value >>> 16);
        dst[++offset] = (byte) (value >>> 24);
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        return dst;
    }

    @NotNull
    static public byte[] encode64beIu(@NotNull final byte[] dst, int value, int offset) {
        dst[offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = 0;
        dst[++offset] = (byte) (value >>> 24);
        dst[++offset] = (byte) (value >>> 16);
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }

    @NotNull
    static public byte[] encode64leL(@NotNull final byte[] dst, long value, int offset) {
        dst[offset] = (byte) value;
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) (value >>> 16);
        dst[++offset] = (byte) (value >>> 24);
        dst[++offset] = (byte) (value >>> 32);
        dst[++offset] = (byte) (value >>> 40);
        dst[++offset] = (byte) (value >>> 48);
        dst[++offset] = (byte) (value >>> 56);
        return dst;
    }

    @NotNull
    static public byte[] encode64beL(@NotNull final byte[] dst, long value, int offset) {
        dst[offset] = (byte) (value >>> 56);
        dst[++offset] = (byte) (value >>> 48);
        dst[++offset] = (byte) (value >>> 40);
        dst[++offset] = (byte) (value >>> 32);
        dst[++offset] = (byte) (value >>> 24);
        dst[++offset] = (byte) (value >>> 16);
        dst[++offset] = (byte) (value >>> 8);
        dst[++offset] = (byte) value;
        return dst;
    }


    static public byte decode8B(@NotNull final byte[] src, final int offset) {
        return src[offset];
    }

    static public short decode8H(@NotNull final byte[] src, final int offset) {
        return src[offset];
    }

    static public short decode8Hu(@NotNull final byte[] src, final int offset) {
        return (short) (((int) src[offset]) & 0xFF);
    }

    static public int decode8I(@NotNull final byte[] src, final int offset) {
        return src[offset];
    }

    static public int decode8Iu(@NotNull final byte[] src, final int offset) {
        return ((int) src[offset]) & 0xFF;
    }

    static public long decode8L(@NotNull final byte[] src, final int offset) {
        return src[offset];
    }

    static public long decode8Lu(@NotNull final byte[] src, final int offset) {
        return ((long) src[offset]) & 0xFF;
    }

    static public short decode16leH(@NotNull final byte[] src, int offset) {
        return (short) ((((int) src[offset + 1]) << 8) | (((int) src[offset]) & 0xFF));
    }

    static public short decode16beH(@NotNull final byte[] src, int offset) {
        return (short) ((((int) src[offset]) << 8) | (((int) src[offset + 1]) & 0xFF));
    }

    static public int decode16leI(@NotNull final byte[] src, int offset) {
        return (((int) src[offset + 1]) << 8) | (((int) src[offset]) & 0xFF);
    }

    static public int decode16beI(@NotNull final byte[] src, final int offset) {
        return (((int) src[offset]) << 8) | (((int) src[offset + 1]) & 0xFF);
    }

    static public int decode16leIu(@NotNull final byte[] src, int offset) {
        return ((((int) src[offset + 1]) & 0xFF) << 8) | (((int) src[offset]) & 0xFF);
    }

    static public int decode16beIu(@NotNull final byte[] src, final int offset) {
        return ((((int) src[offset]) & 0xFF) << 8) | (((int) src[offset + 1]) & 0xFF);
    }

    static public long decode16leL(@NotNull final byte[] src, int offset) {
        return (((long) src[offset + 1]) << 8) | (((long) src[offset]) & 0xFF);
    }

    static public long decode16beL(@NotNull final byte[] src, final int offset) {
        return (((long) src[offset]) << 8) | (((long) src[offset + 1]) & 0xFF);
    }

    static public long decode16leLu(@NotNull final byte[] src, int offset) {
        return ((((long) src[offset + 1]) & 0xFF) << 8) | (((long) src[offset]) & 0xFF);
    }

    static public long decode16beLu(@NotNull final byte[] src, final int offset) {
        return ((((long) src[offset]) & 0xFF) << 8) | (((long) src[offset + 1]) & 0xFF);
    }

    static public int decode24leI(@NotNull final byte[] src, int offset) {
        int result = ((int) src[offset]) & 0xFF;
        result |= (((int) src[++offset]) & 0xFF) << 8;
        return result | (((int) src[++offset]) << 16);
    }

    static public int decode24beI(@NotNull final byte[] src, int offset) {
        int result = ((int) src[offset]) << 16;
        result |= (((int) src[++offset]) & 0xFF) << 8;
        return result | (((int) src[++offset]) & 0xFF);
    }

    static public int decode24leIu(@NotNull final byte[] src, int offset) {
        int result = ((int) src[offset]) & 0xFF;
        result |= (((int) src[++offset]) & 0xFF) << 8;
        return result | ((((int) src[++offset]) & 0xFF) << 16);
    }

    static public int decode24beIu(@NotNull final byte[] src, int offset) {
        int result = (((int) src[offset]) & 0xFF) << 16;
        result |= (((int) src[++offset]) & 0xFF) << 8;
        return result | (((int) src[++offset]) & 0xFF);
    }

    static public long decode24leL(@NotNull final byte[] src, int offset) {
        long result = ((long) src[offset]) & 0xFF;
        result |= (((long) src[++offset]) & 0xFF) << 8;
        return result | (((long) src[++offset]) << 16);
    }

    static public long decode24beL(@NotNull final byte[] src, int offset) {
        long result = ((long) src[offset]) << 16;
        result |= (((long) src[++offset]) & 0xFF) << 8;
        return result | (((long) src[++offset]) & 0xFF);
    }

    static public long decode24leLu(@NotNull final byte[] src, int offset) {
        long result = ((long) src[offset]) & 0xFF;
        result |= (((long) src[++offset]) & 0xFF) << 8;
        return result | ((((long) src[++offset]) & 0xFF) << 16);
    }

    static public long decode24beLu(@NotNull final byte[] src, int offset) {
        long result = (((long) src[offset]) & 0xFF) << 16;
        result |= (((long) src[++offset]) & 0xFF) << 8;
        return result | (((long) src[++offset]) & 0xFF);
    }


    static public int decode32leI(@NotNull final byte[] src, int offset) {
        int result = ((int) src[offset]) & 0xFF;
        result |= (((int) src[++offset]) & 0xFF) << 8;
        result |= (((int) src[++offset]) & 0xFF) << 16;
        return result | (((int) src[++offset]) << 24);
    }

    static public int decode32beI(@NotNull final byte[] src, int offset) {
        int result = ((int) src[offset]) << 24;
        result |= (((int) src[++offset]) & 0xFF) << 16;
        result |= (((int) src[++offset]) & 0xFF) << 8;
        return result | (((int) src[++offset]) & 0xFF);
    }

    static public long decode32leL(@NotNull final byte[] src, int offset) {
        long result = ((long) src[offset]) & 0xFF;
        result |= (((long) src[++offset]) & 0xFF) << 8;
        result |= (((long) src[++offset]) & 0xFF) << 16;
        return result | (((long) src[++offset]) << 24);
    }

    static public long decode32beL(@NotNull final byte[] src, int offset) {
        long result = ((long) src[offset]) << 24;
        result |= (((long) src[++offset]) & 0xFF) << 16;
        result |= (((long) src[++offset]) & 0xFF) << 8;
        return result | (((long) src[++offset]) & 0xFF);
    }

    static public long decode32leLu(@NotNull final byte[] src, int offset) {
        long result = ((long) src[offset]) & 0xFF;
        result |= (((long) src[++offset]) & 0xFF) << 8;
        result |= (((long) src[++offset]) & 0xFF) << 16;
        return result | ((((long) src[++offset]) & 0xFF) << 24);
    }

    static public long decode32beLu(@NotNull final byte[] src, int offset) {
        long result = (((long) src[offset]) & 0xFF) << 24;
        result |= (((long) src[++offset]) & 0xFF) << 16;
        result |= (((long) src[++offset]) & 0xFF) << 8;
        return result | (((long) src[++offset]) & 0xFF);
    }

    static public long decode64leL(@NotNull final byte[] src, int offset) {
        long result = ((long) src[offset]) & 0xFF;
        result |= (((long) src[++offset]) & 0xFF) << 8;
        result |= (((long) src[++offset]) & 0xFF) << 16;
        result |= (((long) src[++offset]) & 0xFF) << 24;
        result |= (((long) src[++offset]) & 0xFF) << 32;
        result |= (((long) src[++offset]) & 0xFF) << 40;
        result |= (((long) src[++offset]) & 0xFF) << 48;
        return result | ((((long) src[++offset]) & 0xFF) << 56);
    }

    static public long decode64beL(@NotNull final byte[] src, int offset) {
        long result = ((long) src[offset]) << 56;
        result |= (((long) src[++offset]) & 0xFF) << 48;
        result |= (((long) src[++offset]) & 0xFF) << 40;
        result |= (((long) src[++offset]) & 0xFF) << 32;
        result |= (((long) src[++offset]) & 0xFF) << 24;
        result |= (((long) src[++offset]) & 0xFF) << 16;
        result |= (((long) src[++offset]) & 0xFF) << 8;
        return result | (((long) src[++offset]) & 0xFF);
    }
}
