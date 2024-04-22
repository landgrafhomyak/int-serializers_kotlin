package ru.landgrafhomyak.utility

import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

@OptIn(ExperimentalUnsignedTypes::class)
@Suppress("NAME_SHADOWING", "unused", "DuplicatedCode")
object IntSerializers {
    @JvmName("encode8B")
    @JvmStatic
    fun encode8B(dst: ByteArray, offset: Int, value: Byte): ByteArray {
        dst[offset] = value
        return dst
    }

    @JvmName("encode8B\$ua")
    @JvmStatic
    fun encode8B(dst: UByteArray, offset: Int, value: Byte): UByteArray {
        dst[offset] = value.toUByte()
        return dst
    }

    @JvmName("encode8Bu")
    @JvmStatic
    fun encode8Bu(dst: ByteArray, offset: Int, value: UByte): ByteArray {
        dst[offset] = value.toByte()
        return dst
    }

    @JvmName("encode8Bu\$ua")
    @JvmStatic
    fun encode8Bu(dst: UByteArray, offset: Int, value: UByte): UByteArray {
        dst[offset] = value
        return dst
    }

    @JvmName("encode8H")
    @JvmStatic
    fun encode8H(dst: ByteArray, offset: Int, value: Short): ByteArray {
        dst[offset] = value.toByte()
        return dst
    }

    @JvmName("encode8H\$ua")
    @JvmStatic
    fun encode8H(dst: UByteArray, offset: Int, value: Short): UByteArray {
        dst[offset] = value.toUByte()
        return dst
    }

    @JvmName("encode8Hu")
    @JvmStatic
    fun encode8Hu(dst: ByteArray, offset: Int, value: UShort): ByteArray {
        dst[offset] = value.toByte()
        return dst
    }

    @JvmName("encode8Hu\$ua")
    @JvmStatic
    fun encode8Hu(dst: UByteArray, offset: Int, value: UShort): UByteArray {
        dst[offset] = value.toUByte()
        return dst
    }

    @JvmName("encode8I")
    @JvmStatic
    fun encode8I(dst: ByteArray, offset: Int, value: Int): ByteArray {
        dst[offset] = value.toByte()
        return dst
    }

    @JvmName("encode8I\$ua")
    @JvmStatic
    fun encode8I(dst: UByteArray, offset: Int, value: Int): UByteArray {
        dst[offset] = value.toUByte()
        return dst
    }

    @JvmName("encode8Iu")
    @JvmStatic
    fun encode8Iu(dst: ByteArray, offset: Int, value: UInt): ByteArray {
        dst[offset] = value.toByte()
        return dst
    }

    @JvmName("encode8Iu\$ua")
    @JvmStatic
    fun encode8Iu(dst: UByteArray, offset: Int, value: UInt): UByteArray {
        dst[offset] = value.toUByte()
        return dst
    }

    @JvmName("encode8L")
    @JvmStatic
    fun encode8L(dst: ByteArray, offset: Int, value: Long): ByteArray {
        dst[offset] = value.toByte()
        return dst
    }

    @JvmName("encode8L\$ua")
    @JvmStatic
    fun encode8L(dst: UByteArray, offset: Int, value: Long): UByteArray {
        dst[offset] = value.toUByte()
        return dst
    }

    @JvmName("encode8Lu")
    @JvmStatic
    fun encode8Lu(dst: ByteArray, offset: Int, value: ULong): ByteArray {
        dst[offset] = value.toByte()
        return dst
    }

    @JvmName("encode8Lu\$ua")
    @JvmStatic
    fun encode8Lu(dst: UByteArray, offset: Int, value: ULong): UByteArray {
        dst[offset] = value.toUByte()
        return dst
    }

    @JvmName("encode16leB")
    @JvmStatic
    fun encode16leB(dst: ByteArray, offset: Int, value: Byte): ByteArray {
        var offset = offset
        dst[offset] = value
        dst[++offset] = (if (value < 0) 0xFF else 0x0).toByte()
        return dst
    }

    @JvmName("encode16leB\$ua")
    @JvmStatic
    fun encode16leB(dst: UByteArray, offset: Int, value: Byte): UByteArray =
        this.encode16leB(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16beB")
    @JvmStatic
    fun encode16beB(dst: ByteArray, offset: Int, value: Byte): ByteArray {
        var offset = offset
        dst[offset] = (if (value < 0) 0xFF else 0x0).toByte()
        dst[++offset] = value
        return dst
    }

    @JvmName("encode16beB\$ua")
    @JvmStatic
    fun encode16beB(dst: UByteArray, offset: Int, value: Byte): UByteArray =
        this.encode16beB(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16leBu")
    @JvmStatic
    fun encode16leBu(dst: ByteArray, offset: Int, value: UByte): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = 0
        return dst
    }

    @JvmName("encode16leBu\$ua")
    @JvmStatic
    fun encode16leBu(dst: UByteArray, offset: Int, value: UByte): UByteArray =
        this.encode16leBu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16beBu")
    @JvmStatic
    fun encode16beBu(dst: ByteArray, offset: Int, value: UByte): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode16beBu\$ua")
    @JvmStatic
    fun encode16beBu(dst: UByteArray, offset: Int, value: UByte): UByteArray =
        this.encode16beBu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16leH")
    @JvmStatic
    fun encode16leH(dst: ByteArray, offset: Int, value: Short): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value.toInt() ushr 8).toByte()
        return dst
    }

    @JvmName("encode16leH\$ua")
    @JvmStatic
    fun encode16leH(dst: UByteArray, offset: Int, value: Short): UByteArray =
        this.encode16leH(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16beH")
    @JvmStatic
    fun encode16beH(dst: ByteArray, offset: Int, value: Short): ByteArray {
        var offset = offset
        dst[offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode16beH\$ua")
    @JvmStatic
    fun encode16beH(dst: UByteArray, offset: Int, value: Short): UByteArray =
        this.encode16beH(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16leHu")
    @JvmStatic
    fun encode16leHu(dst: ByteArray, offset: Int, value: UShort): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value.toShort().toInt() ushr 8).toByte()
        return dst
    }

    @JvmName("encode16leHu\$ua")
    @JvmStatic
    fun encode16leHu(dst: UByteArray, offset: Int, value: UShort): UByteArray =
        this.encode16leHu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16beHu")
    @JvmStatic
    fun encode16beHu(dst: ByteArray, offset: Int, value: UShort): ByteArray {
        var offset = offset
        dst[offset] = (value.toShort().toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode16beHu\$ua")
    @JvmStatic
    fun encode16beHu(dst: UByteArray, offset: Int, value: UShort): UByteArray =
        this.encode16beHu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16leI")
    @JvmStatic
    fun encode16leI(dst: ByteArray, offset: Int, value: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        return dst
    }

    @JvmName("encode16leI\$ua")
    @JvmStatic
    fun encode16leI(dst: UByteArray, offset: Int, value: Int): UByteArray =
        this.encode16leI(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16beI")
    @JvmStatic
    fun encode16beI(dst: ByteArray, offset: Int, value: Int): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode16beI\$ua")
    @JvmStatic
    fun encode16beI(dst: UByteArray, offset: Int, value: Int): UByteArray =
        this.encode16beI(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16leIu")
    @JvmStatic
    fun encode16leIu(dst: ByteArray, offset: Int, value: UInt): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value shr 8).toByte()
        return dst
    }

    @JvmName("encode16leIu\$ua")
    @JvmStatic
    fun encode16leIu(dst: UByteArray, offset: Int, value: UInt): UByteArray =
        this.encode16leIu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16beIu")
    @JvmStatic
    fun encode16beIu(dst: ByteArray, offset: Int, value: UInt): ByteArray {
        var offset = offset
        dst[offset] = (value shr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode16beIu\$ua")
    @JvmStatic
    fun encode16beIu(dst: UByteArray, offset: Int, value: UInt): UByteArray =
        this.encode16beIu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16leL")
    @JvmStatic
    fun encode16leL(dst: ByteArray, offset: Int, value: Long): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        return dst
    }

    @JvmName("encode16leL\$ua")
    @JvmStatic
    fun encode16leL(dst: UByteArray, offset: Int, value: Long): UByteArray =
        this.encode16leL(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16beL")
    @JvmStatic
    fun encode16beL(dst: ByteArray, offset: Int, value: Long): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode16beL\$ua")
    @JvmStatic
    fun encode16beL(dst: UByteArray, offset: Int, value: Long): UByteArray =
        this.encode16leL(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16leLu")
    @JvmStatic
    fun encode16leLu(dst: ByteArray, offset: Int, value: ULong): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value shr 8).toByte()
        return dst
    }

    @JvmName("encode16leLu\$ua")
    @JvmStatic
    fun encode16leLu(dst: UByteArray, offset: Int, value: ULong): UByteArray =
        this.encode16leLu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode16beLu")
    @JvmStatic
    fun encode16beLu(dst: ByteArray, offset: Int, value: ULong): ByteArray {
        var offset = offset
        dst[offset] = (value shr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode16beLu\$ua")
    @JvmStatic
    fun encode16beLu(dst: UByteArray, offset: Int, value: ULong): UByteArray =
        this.encode16leLu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24leB")
    @JvmStatic
    fun encode24leB(dst: ByteArray, offset: Int, value: Byte): ByteArray {
        var offset = offset
        dst[offset] = value
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmName("encode24leB\$ua")
    @JvmStatic
    fun encode24leB(dst: UByteArray, offset: Int, value: Byte): UByteArray =
        this.encode24leB(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24beB")
    @JvmStatic
    fun encode24beB(dst: ByteArray, offset: Int, value: Byte): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = sign
        dst[++offset] = sign
        dst[++offset] = value
        return dst
    }

    @JvmName("encode24beB\$ua")
    @JvmStatic
    fun encode24beB(dst: UByteArray, offset: Int, value: Byte): UByteArray =
        this.encode24beB(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24leBu")
    @JvmStatic
    fun encode24leBu(dst: ByteArray, offset: Int, value: UByte): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmName("encode24leBu\$ua")
    @JvmStatic
    fun encode24leBu(dst: UByteArray, offset: Int, value: UByte): UByteArray =
        this.encode24leBu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24beBu")
    @JvmStatic
    fun encode24beBu(dst: ByteArray, offset: Int, value: UByte): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = 0
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode24beBu\$ua")
    @JvmStatic
    fun encode24beBu(dst: UByteArray, offset: Int, value: UByte): UByteArray =
        this.encode24beBu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24leH")
    @JvmStatic
    fun encode24leH(dst: ByteArray, offset: Int, value: Short): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = (if (value < 0) 0xFF else 0).toByte()
        return dst
    }

    @JvmName("encode24leH\$ua")
    @JvmStatic
    fun encode24leH(dst: UByteArray, offset: Int, value: Short): UByteArray =
        this.encode24leH(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24beH")
    @JvmStatic
    fun encode24beH(dst: ByteArray, offset: Int, value: Short): ByteArray {
        var offset = offset
        dst[offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        dst[++offset] = (if (value < 0) 0xFF else 0).toByte()
        return dst
    }

    @JvmName("encode24beH\$ua")
    @JvmStatic
    fun encode24beH(dst: UByteArray, offset: Int, value: Short): UByteArray =
        this.encode24beH(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24leHu")
    @JvmStatic
    fun encode24leHu(dst: ByteArray, offset: Int, value: UShort): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value.toShort().toInt() ushr 8).toByte()
        dst[++offset] = 0
        return dst
    }

    @JvmName("encode24leHu\$ua")
    @JvmStatic
    fun encode24leHu(dst: UByteArray, offset: Int, value: UShort): UByteArray =
        this.encode24leHu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24beHu")
    @JvmStatic
    fun encode24beHu(dst: ByteArray, offset: Int, value: UShort): ByteArray {
        var offset = offset
        dst[offset] = (value.toShort().toInt() ushr 8).toByte()
        dst[++offset] = value.toShort().toByte()
        dst[++offset] = 0
        return dst
    }

    @JvmName("encode24beHu\$ua")
    @JvmStatic
    fun encode24beHu(dst: UByteArray, offset: Int, value: UShort): UByteArray =
        this.encode24beHu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24leI")
    @JvmStatic
    fun encode24leI(dst: ByteArray, offset: Int, value: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = (value ushr 16).toByte()
        return dst
    }

    @JvmName("encode24leI\$ua")
    @JvmStatic
    fun encode24leI(dst: UByteArray, offset: Int, value: Int): UByteArray =
        this.encode24leI(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24beI")
    @JvmStatic
    fun encode24beI(dst: ByteArray, offset: Int, value: Int): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode24beI\$ua")
    @JvmStatic
    fun encode24beI(dst: UByteArray, offset: Int, value: Int): UByteArray =
        this.encode24beI(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24leIu")
    @JvmStatic
    fun encode24leIu(dst: ByteArray, offset: Int, value: UInt): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value shr 8).toByte()
        dst[++offset] = (value shr 16).toByte()
        return dst
    }

    @JvmName("encode24leIu\$ua")
    @JvmStatic
    fun encode24leIu(dst: UByteArray, offset: Int, value: UInt): UByteArray =
        this.encode24leIu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24beIu")
    @JvmStatic
    fun encode24beIu(dst: ByteArray, offset: Int, value: UInt): ByteArray {
        var offset = offset
        dst[offset] = (value shr 16).toByte()
        dst[++offset] = (value shr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode24beIu\$ua")
    @JvmStatic
    fun encode24beIu(dst: UByteArray, offset: Int, value: UInt): UByteArray =
        this.encode24beIu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24leL")
    @JvmStatic
    fun encode24leL(dst: ByteArray, offset: Int, value: Long): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = (value ushr 16).toByte()
        return dst
    }

    @JvmName("encode24leL\$ua")
    @JvmStatic
    fun encode24leL(dst: UByteArray, offset: Int, value: Long): UByteArray =
        this.encode24leL(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24beL")
    @JvmStatic
    fun encode24beL(dst: ByteArray, offset: Int, value: Long): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode24beL\$ua")
    @JvmStatic
    fun encode24beL(dst: UByteArray, offset: Int, value: Long): UByteArray =
        this.encode24beL(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24leLu")
    @JvmStatic
    fun encode24leLu(dst: ByteArray, offset: Int, value: ULong): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value shr 8).toByte()
        dst[++offset] = (value shr 16).toByte()
        return dst
    }

    @JvmName("encode24leLu\$ua")
    @JvmStatic
    fun encode24leLu(dst: UByteArray, offset: Int, value: ULong): UByteArray =
        this.encode24leLu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode24beLu")
    @JvmStatic
    fun encode24beLu(dst: ByteArray, offset: Int, value: ULong): ByteArray {
        var offset = offset
        dst[offset] = (value shr 16).toByte()
        dst[++offset] = (value shr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode24beLu\$ua")
    @JvmStatic
    fun encode24beLu(dst: UByteArray, offset: Int, value: ULong): UByteArray =
        this.encode24beLu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32leB")
    @JvmStatic
    fun encode32leB(dst: ByteArray, offset: Int, value: Byte): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0x0).toByte()
        dst[offset] = value
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        return dst
    }

    @JvmName("encode32leB\$ua")
    @JvmStatic
    fun encode32leB(dst: UByteArray, offset: Int, value: Byte): UByteArray =
        this.encode32leB(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32beB")
    @JvmStatic
    fun encode32beB(dst: ByteArray, offset: Int, value: Byte): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = value
        return dst
    }

    @JvmName("encode32beB\$ua")
    @JvmStatic
    fun encode32beB(dst: UByteArray, offset: Int, value: Byte): UByteArray =
        this.encode32beB(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32leBu")
    @JvmStatic
    fun encode32leBu(dst: ByteArray, offset: Int, value: UByte): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmName("encode32leBu\$ua")
    @JvmStatic
    fun encode32leBu(dst: UByteArray, offset: Int, value: UByte): UByteArray =
        this.encode32leBu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32beBu")
    @JvmStatic
    fun encode32beBu(dst: ByteArray, offset: Int, value: UByte): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode32beBu\$ua")
    @JvmStatic
    fun encode32beBu(dst: UByteArray, offset: Int, value: UByte): UByteArray =
        this.encode32beBu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32leH")
    @JvmStatic
    fun encode32leH(dst: ByteArray, offset: Int, value: Short): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = value.toByte()
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = sign
        dst[++offset] = sign
        return dst
    }

    @JvmName("encode32leH\$ua")
    @JvmStatic
    fun encode32leH(dst: UByteArray, offset: Int, value: Short): UByteArray =
        this.encode32leH(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32beH")
    @JvmStatic
    fun encode32beH(dst: ByteArray, offset: Int, value: Short): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = sign
        dst[++offset] = sign
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode32beH\$ua")
    @JvmStatic
    fun encode32beH(dst: UByteArray, offset: Int, value: Short): UByteArray =
        this.encode32beH(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32leHu")
    @JvmStatic
    fun encode32leHu(dst: ByteArray, offset: Int, value: UShort): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value.toShort().toInt() ushr 8).toByte()
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmName("encode32leHu\$ua")
    @JvmStatic
    fun encode32leHu(dst: UByteArray, offset: Int, value: UShort): UByteArray =
        this.encode32leHu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32beHu")
    @JvmStatic
    fun encode32beHu(dst: ByteArray, offset: Int, value: UShort): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = 0
        dst[++offset] = (value.toShort().toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode32beHu\$ua")
    @JvmStatic
    fun encode32beHu(dst: UByteArray, offset: Int, value: UShort): UByteArray =
        this.encode32beHu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32leI")
    @JvmStatic
    fun encode32leI(dst: ByteArray, offset: Int, value: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 24).toByte()
        return dst
    }

    @JvmName("encode32leI\$ua")
    @JvmStatic
    fun encode32leI(dst: UByteArray, offset: Int, value: Int): UByteArray =
        this.encode32leI(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32beI")
    @JvmStatic
    fun encode32beI(dst: ByteArray, offset: Int, value: Int): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 24).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode32beI\$ua")
    @JvmStatic
    fun encode32beI(dst: UByteArray, offset: Int, value: Int): UByteArray =
        this.encode32beI(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32leIu")
    @JvmStatic
    fun encode32leIu(dst: ByteArray, offset: Int, value: UInt): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value shr 8).toByte()
        dst[++offset] = (value shr 16).toByte()
        dst[++offset] = (value shr 24).toByte()
        return dst
    }

    @JvmName("encode32leIu\$ua")
    @JvmStatic
    fun encode32leIu(dst: UByteArray, offset: Int, value: UInt): UByteArray =
        this.encode32leIu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32beIu")
    @JvmStatic
    fun encode32beIu(dst: ByteArray, offset: Int, value: UInt): ByteArray {
        var offset = offset
        dst[offset] = (value shr 24).toByte()
        dst[++offset] = (value shr 16).toByte()
        dst[++offset] = (value shr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode32beIu\$ua")
    @JvmStatic
    fun encode32beIu(dst: UByteArray, offset: Int, value: UInt): UByteArray =
        this.encode32beIu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32leL")
    @JvmStatic
    fun encode32leL(dst: ByteArray, offset: Int, value: Long): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 24).toByte()
        return dst
    }

    @JvmName("encode32leL\$ua")
    @JvmStatic
    fun encode32leL(dst: UByteArray, offset: Int, value: Long): UByteArray =
        this.encode32leL(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32beL")
    @JvmStatic
    fun encode32beL(dst: ByteArray, offset: Int, value: Long): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 24).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode32beL\$ua")
    @JvmStatic
    fun encode32beL(dst: UByteArray, offset: Int, value: Long): UByteArray =
        this.encode32beL(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32leLu")
    @JvmStatic
    fun encode32leLu(dst: ByteArray, offset: Int, value: ULong): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value shr 8).toByte()
        dst[++offset] = (value shr 16).toByte()
        dst[++offset] = (value shr 24).toByte()
        return dst
    }

    @JvmName("encode32leLu\$ua")
    @JvmStatic
    fun encode32leLu(dst: UByteArray, offset: Int, value: ULong): UByteArray =
        this.encode32leLu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode32beLu")
    @JvmStatic
    fun encode32beLu(dst: ByteArray, offset: Int, value: ULong): ByteArray {
        var offset = offset
        dst[offset] = (value shr 24).toByte()
        dst[++offset] = (value shr 16).toByte()
        dst[++offset] = (value shr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode32beLu\$ua")
    @JvmStatic
    fun encode32beLu(dst: UByteArray, offset: Int, value: ULong): UByteArray =
        this.encode32beLu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64leB")
    @JvmStatic
    fun encode64leB(dst: ByteArray, offset: Int, value: Byte): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = value
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        return dst
    }

    @JvmName("encode64leB\$ua")
    @JvmStatic
    fun encode64leB(dst: UByteArray, offset: Int, value: Byte): UByteArray =
        this.encode64leB(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64beB")
    @JvmStatic
    fun encode64beB(dst: ByteArray, offset: Int, value: Byte): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = value
        return dst
    }

    @JvmName("encode64beB\$ua")
    @JvmStatic
    fun encode64beB(dst: UByteArray, offset: Int, value: Byte): UByteArray =
        this.encode64beB(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64leBu")
    @JvmStatic
    fun encode64leBu(dst: ByteArray, offset: Int, value: UByte): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmName("encode64leBu\$ua")
    @JvmStatic
    fun encode64leBu(dst: UByteArray, offset: Int, value: UByte): UByteArray =
        this.encode64leBu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64beBu")
    @JvmStatic
    fun encode64beBu(dst: ByteArray, offset: Int, value: UByte): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode64beBu\$ua")
    @JvmStatic
    fun encode64beBu(dst: UByteArray, offset: Int, value: UByte): UByteArray =
        this.encode64beBu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64leH")
    @JvmStatic
    fun encode64leH(dst: ByteArray, offset: Int, value: Short): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = value.toByte()
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        return dst
    }

    @JvmName("encode64leH\$ua")
    @JvmStatic
    fun encode64leH(dst: UByteArray, offset: Int, value: Short): UByteArray =
        this.encode64leH(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64beH")
    @JvmStatic
    fun encode64beH(dst: ByteArray, offset: Int, value: Short): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode64beH\$ua")
    @JvmStatic
    fun encode64beH(dst: UByteArray, offset: Int, value: Short): UByteArray =
        this.encode64beH(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64leHu")
    @JvmStatic
    fun encode64leHu(dst: ByteArray, offset: Int, value: UShort): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value.toShort().toInt() ushr 8).toByte()
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmName("encode64leHu\$ua")
    @JvmStatic
    fun encode64leHu(dst: UByteArray, offset: Int, value: UShort): UByteArray =
        this.encode64leHu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64beHu")
    @JvmStatic
    fun encode64beHu(dst: ByteArray, offset: Int, value: UShort): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = (value.toShort().toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode64beHu\$ua")
    @JvmStatic
    fun encode64beHu(dst: UByteArray, offset: Int, value: UShort): UByteArray =
        this.encode64beHu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64leI")
    @JvmStatic
    fun encode64leI(dst: ByteArray, offset: Int, value: Int): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 24).toByte()
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        return dst
    }

    @JvmName("encode64leI\$ua")
    @JvmStatic
    fun encode64leI(dst: UByteArray, offset: Int, value: Int): UByteArray =
        this.encode64leI(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64beI")
    @JvmStatic
    fun encode64beI(dst: ByteArray, offset: Int, value: Int): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = (value ushr 24).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode64beI\$ua")
    @JvmStatic
    fun encode64beI(dst: UByteArray, offset: Int, value: Int): UByteArray =
        this.encode64beI(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64leIu")
    @JvmStatic
    fun encode64leIu(dst: ByteArray, offset: Int, value: UInt): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value shr 8).toByte()
        dst[++offset] = (value shr 16).toByte()
        dst[++offset] = (value shr 24).toByte()
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmName("encode64leIu\$ua")
    @JvmStatic
    fun encode64leIu(dst: UByteArray, offset: Int, value: UInt): UByteArray =
        this.encode64leIu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64beIu")
    @JvmStatic
    fun encode64beIu(dst: ByteArray, offset: Int, value: UInt): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = (value shr 24).toByte()
        dst[++offset] = (value shr 16).toByte()
        dst[++offset] = (value shr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode64beIu\$ua")
    @JvmStatic
    fun encode64beIu(dst: UByteArray, offset: Int, value: UInt): UByteArray =
        this.encode64beIu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64leL")
    @JvmStatic
    fun encode64leL(dst: ByteArray, offset: Int, value: Long): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 24).toByte()
        dst[++offset] = (value ushr 32).toByte()
        dst[++offset] = (value ushr 40).toByte()
        dst[++offset] = (value ushr 48).toByte()
        dst[++offset] = (value ushr 56).toByte()
        return dst
    }

    @JvmName("encode64leL\$ua")
    @JvmStatic
    fun encode64leL(dst: UByteArray, offset: Int, value: Long): UByteArray =
        this.encode64leL(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64beL")
    @JvmStatic
    fun encode64beL(dst: ByteArray, offset: Int, value: Long): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 56).toByte()
        dst[++offset] = (value ushr 48).toByte()
        dst[++offset] = (value ushr 40).toByte()
        dst[++offset] = (value ushr 32).toByte()
        dst[++offset] = (value ushr 24).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode64beL\$ua")
    @JvmStatic
    fun encode64beL(dst: UByteArray, offset: Int, value: Long): UByteArray =
        this.encode64beL(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64leLu")
    @JvmStatic
    fun encode64leLu(dst: ByteArray, offset: Int, value: ULong): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value shr 8).toByte()
        dst[++offset] = (value shr 16).toByte()
        dst[++offset] = (value shr 24).toByte()
        dst[++offset] = (value shr 32).toByte()
        dst[++offset] = (value shr 40).toByte()
        dst[++offset] = (value shr 48).toByte()
        dst[++offset] = (value shr 56).toByte()
        return dst
    }

    @JvmName("encode64leLu\$ua")
    @JvmStatic
    fun encode64leLu(dst: UByteArray, offset: Int, value: ULong): UByteArray =
        this.encode64leLu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("encode64beLu")
    @JvmStatic
    fun encode64beLu(dst: ByteArray, offset: Int, value: ULong): ByteArray {
        var offset = offset
        dst[offset] = (value shr 56).toByte()
        dst[++offset] = (value shr 48).toByte()
        dst[++offset] = (value shr 40).toByte()
        dst[++offset] = (value shr 32).toByte()
        dst[++offset] = (value shr 24).toByte()
        dst[++offset] = (value shr 16).toByte()
        dst[++offset] = (value shr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmName("encode64beLu\$ua")
    @JvmStatic
    fun encode64beLu(dst: UByteArray, offset: Int, value: ULong): UByteArray =
        this.encode64beLu(dst.asByteArray(), offset, value).asUByteArray()

    @JvmName("decode8B")
    @JvmStatic
    fun decode8B(src: ByteArray, offset: Int): Byte {
        return src[offset]
    }

    @JvmName("decode8B\$ua")
    @JvmStatic
    fun decode8B(src: UByteArray, offset: Int): Byte {
        return src[offset].toByte()
    }

    @JvmName("decode8Bu")
    @JvmStatic
    fun decode8Bu(src: ByteArray, offset: Int): UByte {
        return src[offset].toUByte()
    }

    @JvmName("decode8Bu\$ua")
    @JvmStatic
    fun decode8Bu(src: UByteArray, offset: Int): UByte {
        return src[offset]
    }

    @JvmName("decode8H")
    @JvmStatic
    fun decode8H(src: ByteArray, offset: Int): Short {
        return src[offset].toShort()
    }

    @JvmName("decode8H\$ua")
    @JvmStatic
    fun decode8H(src: UByteArray, offset: Int): Short {
        return src[offset].toByte().toShort()
    }

    @JvmName("decode8Hu")
    @JvmStatic
    fun decode8Hu(src: ByteArray, offset: Int): UShort {
        return src[offset].toUByte().toUShort()
    }

    @JvmName("decode8Hu\$ua")
    @JvmStatic
    fun decode8Hu(src: UByteArray, offset: Int): UShort {
        return src[offset].toUShort()
    }

    @JvmName("decode8I")
    @JvmStatic
    fun decode8I(src: ByteArray, offset: Int): Int {
        return src[offset].toInt()
    }

    @JvmName("decode8I\$ua")
    @JvmStatic
    fun decode8I(src: UByteArray, offset: Int): Int {
        return src[offset].toByte().toInt()
    }

    @JvmName("decode8Iu")
    @JvmStatic
    fun decode8Iu(src: ByteArray, offset: Int): UInt {
        return src[offset].toUByte().toUInt()
    }

    @JvmName("decode8Iu\$ua")
    @JvmStatic
    fun decode8Iu(src: UByteArray, offset: Int): UInt {
        return src[offset].toUInt()
    }

    @JvmName("decode8L")
    @JvmStatic
    fun decode8L(src: ByteArray, offset: Int): Long {
        return src[offset].toLong()
    }

    @JvmName("decode8L\$ua")
    @JvmStatic
    fun decode8L(src: UByteArray, offset: Int): Long {
        return src[offset].toByte().toLong()
    }

    @JvmName("decode8Lu")
    @JvmStatic
    fun decode8Lu(src: ByteArray, offset: Int): ULong {
        return src[offset].toUByte().toULong()
    }

    @JvmName("decode8Lu\$ua")
    @JvmStatic
    fun decode8Lu(src: UByteArray, offset: Int): ULong {
        return src[offset].toULong()
    }

    @JvmName("decode16leH")
    @JvmStatic
    fun decode16leH(src: ByteArray, offset: Int): Short {
        return ((src[offset + 1].toInt() shl 8) or (src[offset].toInt() and 0xFF)).toShort()
    }

    @JvmName("decode16leH\$ua")
    @JvmStatic
    fun decode16leH(src: UByteArray, offset: Int): Short =
        this.decode16leH(src.asByteArray(), offset)

    @JvmName("decode16leHu")
    @JvmStatic
    fun decode16leHu(src: ByteArray, offset: Int): UShort {
        return ((src[offset + 1].toInt() shl 8) or (src[offset].toInt() and 0xFF)).toShort().toUShort()
    }

    @JvmName("decode16leHu\$ua")
    @JvmStatic
    fun decode16leHu(src: UByteArray, offset: Int): UShort =
        this.decode16leHu(src.asByteArray(), offset)

    @JvmName("decode16beH")
    @JvmStatic
    fun decode16beH(src: ByteArray, offset: Int): Short {
        return ((src[offset].toInt() shl 8) or (src[offset + 1].toInt() and 0xFF)).toShort()
    }

    @JvmName("decode16beH\$ua")
    @JvmStatic
    fun decode16beH(src: UByteArray, offset: Int): Short =
        this.decode16leH(src.asByteArray(), offset)

    @JvmName("decode16beHu")
    @JvmStatic
    fun decode16beHu(src: ByteArray, offset: Int): UShort {
        return ((src[offset].toInt() shl 8) or (src[offset + 1].toInt() and 0xFF)).toShort().toUShort()
    }

    @JvmName("decode16beHu\$ua")
    @JvmStatic
    fun decode16beHu(src: UByteArray, offset: Int): UShort =
        this.decode16beHu(src.asByteArray(), offset)


    @JvmName("decode16leI")
    @JvmStatic
    fun decode16leI(src: ByteArray, offset: Int): Int {
        return (src[offset + 1].toInt() shl 8) or (src[offset].toInt() and 0xFF)
    }

    @JvmName("decode16leI\$ua")
    @JvmStatic
    fun decode16leI(src: UByteArray, offset: Int): Int =
        this.decode16leI(src.asByteArray(), offset)

    @JvmName("decode16leIu")
    @JvmStatic
    fun decode16leIu(src: ByteArray, offset: Int): UInt {
        return (((src[offset + 1].toInt() and 0xFF) shl 8) or (src[offset].toInt() and 0xFF)).toUInt()
    }

    @JvmName("decode16leIu\$ua")
    @JvmStatic
    fun decode16leIu(src: UByteArray, offset: Int): UInt =
        this.decode16leIu(src.asByteArray(), offset)

    @JvmName("decode16beI")
    @JvmStatic
    fun decode16beI(src: ByteArray, offset: Int): Int {
        return (src[offset].toInt() shl 8) or (src[offset + 1].toInt() and 0xFF)
    }

    @JvmName("decode16beI\$ua")
    @JvmStatic
    fun decode16beI(src: UByteArray, offset: Int): Int =
        this.decode16beI(src.asByteArray(), offset)


    @JvmName("decode16beIu")
    @JvmStatic
    fun decode16beIu(src: ByteArray, offset: Int): UInt {
        return (((src[offset].toInt() and 0xFF) shl 8) or (src[offset + 1].toInt() and 0xFF)).toUInt()
    }

    @JvmName("decode16beIu\$ua")
    @JvmStatic
    fun decode16beIu(src: UByteArray, offset: Int): UInt =
        this.decode16beIu(src.asByteArray(), offset)

    @JvmName("decode16leL")
    @JvmStatic
    fun decode16leL(src: ByteArray, offset: Int): Long {
        return (src[offset + 1].toLong() shl 8) or (src[offset].toLong() and 0xFFL)
    }

    @JvmName("decode16leL\$ua")
    @JvmStatic
    fun decode16leL(src: UByteArray, offset: Int): Long =
        this.decode16leL(src.asByteArray(), offset)

    @JvmName("decode16leLu")
    @JvmStatic
    fun decode16leLu(src: ByteArray, offset: Int): ULong {
        return (((src[offset + 1].toLong() and 0xFFL) shl 8) or (src[offset].toLong() and 0xFFL)).toULong()
    }

    @JvmName("decode16leLu\$ua")
    @JvmStatic
    fun decode16leLu(src: UByteArray, offset: Int): ULong =
        this.decode16leLu(src.asByteArray(), offset)

    @JvmName("decode16beL")
    @JvmStatic
    fun decode16beL(src: ByteArray, offset: Int): Long {
        return (src[offset].toLong() shl 8) or (src[offset + 1].toLong() and 0xFFL)
    }

    @JvmName("decode16beL\$ua")
    @JvmStatic
    fun decode16beL(src: UByteArray, offset: Int): Long =
        this.decode16beL(src.asByteArray(), offset)

    @JvmName("decode16beLu")
    @JvmStatic
    fun decode16beLu(src: ByteArray, offset: Int): ULong {
        return (((src[offset].toLong() and 0xFFL) shl 8) or (src[offset + 1].toLong() and 0xFFL)).toULong()
    }

    @JvmName("decode16beLu\$ua")
    @JvmStatic
    fun decode16beLu(src: UByteArray, offset: Int): ULong =
        this.decode16beLu(src.asByteArray(), offset)

    @JvmName("decode24leI")
    @JvmStatic
    fun decode24leI(src: ByteArray, offset: Int): Int {
        var offset = offset
        var result = src[offset].toInt() and 0xFF
        result = result or (src[++offset].toInt() and 0xFF shl 8)
        return result or (src[++offset].toInt() shl 16)
    }

    @JvmName("decode24leI\$ua")
    @JvmStatic
    fun decode24leI(src: UByteArray, offset: Int): Int =
        this.decode24leI(src.asByteArray(), offset)

    @JvmName("decode24leIu")
    @JvmStatic
    fun decode24leIu(src: ByteArray, offset: Int): UInt {
        var offset = offset
        var result = src[offset].toInt() and 0xFF
        result = result or (src[++offset].toInt() and 0xFF shl 8)
        return (result or (src[++offset].toInt() and 0xFF shl 16)).toUInt()
    }

    @JvmName("decode24leIu\$ua")
    @JvmStatic
    fun decode24leIu(src: UByteArray, offset: Int): UInt =
        this.decode24leIu(src.asByteArray(), offset)

    @JvmName("decode24beI")
    @JvmStatic
    fun decode24beI(src: ByteArray, offset: Int): Int {
        var offset = offset
        var result = src[offset].toInt() shl 16
        result = result or (src[++offset].toInt() and 0xFF shl 8)
        return result or (src[++offset].toInt() and 0xFF)
    }

    @JvmName("decode24beI\$ua")
    @JvmStatic
    fun decode24beI(src: UByteArray, offset: Int): Int =
        this.decode24beI(src.asByteArray(), offset)


    @JvmName("decode24beIu")
    @JvmStatic
    fun decode24beIu(src: ByteArray, offset: Int): UInt {
        var offset = offset
        var result = src[offset].toInt() and 0xFF shl 16
        result = result or (src[++offset].toInt() and 0xFF shl 8)
        return (result or (src[++offset].toInt() and 0xFF)).toUInt()
    }

    @JvmName("decode24beIu\$ua")
    @JvmStatic
    fun decode24beIu(src: UByteArray, offset: Int): UInt =
        this.decode24beIu(src.asByteArray(), offset)


    @JvmName("decode24leL")
    @JvmStatic
    fun decode24leL(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return result or (src[++offset].toLong() shl 16)
    }

    @JvmName("decode24leL\$ua")
    @JvmStatic
    fun decode24leL(src: UByteArray, offset: Int): Long =
        this.decode24leL(src.asByteArray(), offset)

    @JvmName("decode24leLu")
    @JvmStatic
    fun decode24leLu(src: ByteArray, offset: Int): ULong {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return (result or (src[++offset].toLong() and 0xFFL shl 16)).toULong()
    }

    @JvmName("decode24leLu\$ua")
    @JvmStatic
    fun decode24leLu(src: UByteArray, offset: Int): ULong =
        this.decode24leLu(src.asByteArray(), offset)

    @JvmName("decode24beL")
    @JvmStatic
    fun decode24beL(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() shl 16
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return result or (src[++offset].toLong() and 0xFFL)
    }


    @JvmName("decode24beL\$ua")
    @JvmStatic
    fun decode24beL(src: UByteArray, offset: Int): Long =
        this.decode24beL(src.asByteArray(), offset)

    @JvmName("decode24beLu")
    @JvmStatic
    fun decode24beLu(src: ByteArray, offset: Int): ULong {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL shl 16
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return (result or (src[++offset].toLong() and 0xFFL)).toULong()
    }

    @JvmName("decode24beLu\$ua")
    @JvmStatic
    fun decode24beLu(src: UByteArray, offset: Int): ULong =
        this.decode24beLu(src.asByteArray(), offset)


    @JvmName("decode32leI")
    @JvmStatic
    fun decode32leI(src: ByteArray, offset: Int): Int {
        var offset = offset
        var result = src[offset].toInt() and 0xFF
        result = result or (src[++offset].toInt() and 0xFF shl 8)
        result = result or (src[++offset].toInt() and 0xFF shl 16)
        return result or (src[++offset].toInt() shl 24)
    }

    @JvmName("decode32leI\$ua")
    @JvmStatic
    fun decode32leI(src: UByteArray, offset: Int): Int =
        this.decode32leI(src.asByteArray(), offset)

    @JvmName("decode32leIu")
    @JvmStatic
    fun decode32leIu(src: ByteArray, offset: Int): UInt =
        this.decode32leI(src, offset).toUInt()

    @JvmName("decode32leIu\$ua")
    @JvmStatic
    fun decode32leIu(src: UByteArray, offset: Int): UInt =
        this.decode32leI(src.asByteArray(), offset).toUInt()

    @JvmName("decode32beI")
    @JvmStatic
    fun decode32beI(src: ByteArray, offset: Int): Int {
        var offset = offset
        var result = src[offset].toInt() shl 24
        result = result or (src[++offset].toInt() and 0xFF shl 16)
        result = result or (src[++offset].toInt() and 0xFF shl 8)
        return result or (src[++offset].toInt() and 0xFF)
    }


    @JvmName("decode32beI\$ua")
    @JvmStatic
    fun decode32beI(src: UByteArray, offset: Int): Int =
        this.decode32beI(src.asByteArray(), offset)

    @JvmName("decode32beIu")
    @JvmStatic
    fun decode32beIu(src: ByteArray, offset: Int): UInt =
        this.decode32beI(src, offset).toUInt()

    @JvmName("decode32beIu\$ua")
    @JvmStatic
    fun decode32beIu(src: UByteArray, offset: Int): UInt =
        this.decode32beI(src.asByteArray(), offset).toUInt()


    @JvmName("decode32leL")
    @JvmStatic
    fun decode32leL(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        result = result or (src[++offset].toLong() and 0xFFL shl 16)
        return result or (src[++offset].toLong() shl 24)
    }

    @JvmName("decode32leL\$ua")
    @JvmStatic
    fun decode32leL(src: UByteArray, offset: Int): Long =
        this.decode32leL(src.asByteArray(), offset)


    @JvmName("decode32leLu")
    @JvmStatic
    fun decode32leLu(src: ByteArray, offset: Int): ULong {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        result = result or (src[++offset].toLong() and 0xFFL shl 16)
        return (result or (src[++offset].toLong() and 0xFFL shl 24)).toULong()
    }

    @JvmName("decode32leLu\$ua")
    @JvmStatic
    fun decode32leLu(src: UByteArray, offset: Int): ULong =
        this.decode32leLu(src.asByteArray(), offset)

    @JvmName("decode32beL")
    @JvmStatic
    fun decode32beL(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() shl 24
        result = result or (src[++offset].toLong() and 0xFFL shl 16)
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return result or (src[++offset].toLong() and 0xFFL)
    }

    @JvmName("decode32beL\$ua")
    @JvmStatic
    fun decode32beL(src: UByteArray, offset: Int): Long =
        this.decode32beL(src.asByteArray(), offset)


    @JvmName("decode32beLu")
    @JvmStatic
    fun decode32beLu(src: ByteArray, offset: Int): ULong {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL shl 24
        result = result or (src[++offset].toLong() and 0xFFL shl 16)
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return (result or (src[++offset].toLong() and 0xFFL)).toULong()
    }

    @JvmName("decode32beLu\$ua")
    @JvmStatic
    fun decode32beLu(src: UByteArray, offset: Int): ULong =
        this.decode32beLu(src.asByteArray(), offset)

    @JvmName("decode64leL")
    @JvmStatic
    fun decode64leL(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        result = result or (src[++offset].toLong() and 0xFFL shl 16)
        result = result or (src[++offset].toLong() and 0xFFL shl 24)
        result = result or (src[++offset].toLong() and 0xFFL shl 32)
        result = result or (src[++offset].toLong() and 0xFFL shl 40)
        result = result or (src[++offset].toLong() and 0xFFL shl 48)
        return result or (src[++offset].toLong() shl 56)
    }

    @JvmName("decode64leL\$ua")
    @JvmStatic
    fun decode64leL(src: UByteArray, offset: Int): Long =
        this.decode64leL(src.asByteArray(), offset)

    @JvmName("decode64leLu")
    @JvmStatic
    fun decode64leLu(src: ByteArray, offset: Int): ULong =
        this.decode64leL(src, offset).toULong()

    @JvmName("decode64leLu\$ua")
    @JvmStatic
    fun decode64leLu(src: UByteArray, offset: Int): ULong =
        this.decode64leL(src.asByteArray(), offset).toULong()

    @JvmName("decode64beL")
    @JvmStatic
    fun decode64beL(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() shl 56
        result = result or (src[++offset].toLong() and 0xFFL shl 48)
        result = result or (src[++offset].toLong() and 0xFFL shl 40)
        result = result or (src[++offset].toLong() and 0xFFL shl 32)
        result = result or (src[++offset].toLong() and 0xFFL shl 24)
        result = result or (src[++offset].toLong() and 0xFFL shl 16)
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return result or (src[++offset].toLong() and 0xFFL)
    }

    @JvmName("decode64beL\$ua")
    @JvmStatic
    fun decode64beL(src: UByteArray, offset: Int): Long =
        this.decode64beL(src.asByteArray(), offset)

    @JvmName("decode64beLu")
    @JvmStatic
    fun decode64beLu(src: ByteArray, offset: Int): ULong =
        this.decode64beL(src, offset).toULong()

    @JvmName("decode64beLu\$ua")
    @JvmStatic
    fun decode64beLu(src: UByteArray, offset: Int): ULong =
        this.decode64beL(src.asByteArray(), offset).toULong()
}