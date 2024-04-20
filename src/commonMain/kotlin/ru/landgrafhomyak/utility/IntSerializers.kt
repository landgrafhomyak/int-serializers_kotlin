package ru.landgrafhomyak.utility

import kotlin.jvm.JvmStatic

@Suppress("NAME_SHADOWING", "unused", "DuplicatedCode")
object IntSerializers {
    @JvmStatic
    fun encode8B(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        dst[offset] = value
        return dst
    }

    @JvmStatic
    fun encode8H(dst: ByteArray, value: Short, offset: Int): ByteArray {
        dst[offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode8I(dst: ByteArray, value: Int, offset: Int): ByteArray {
        dst[offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode8L(dst: ByteArray, value: Long, offset: Int): ByteArray {
        dst[offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode16leB(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value
        dst[++offset] = (if (value < 0) 0xFF else 0x0).toByte()
        return dst
    }

    @JvmStatic
    fun encode16beB(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = (if (value < 0) 0xFF else 0x0).toByte()
        dst[++offset] = value
        return dst
    }

    @JvmStatic
    fun encode16leBu(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value
        dst[++offset] = 0
        return dst
    }

    @JvmStatic
    fun encode16beBu(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = value
        return dst
    }

    @JvmStatic
    fun encode16leH(dst: ByteArray, value: Short, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value.toInt() ushr 8).toByte()
        return dst
    }

    @JvmStatic
    fun encode16beH(dst: ByteArray, value: Short, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode16leI(dst: ByteArray, value: Int, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        return dst
    }

    @JvmStatic
    fun encode16beI(dst: ByteArray, value: Int, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode16leL(dst: ByteArray, value: Long, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        return dst
    }

    @JvmStatic
    fun encode16beL(dst: ByteArray, value: Long, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode24leB(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmStatic
    fun encode24beB(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = sign
        dst[++offset] = sign
        dst[++offset] = value
        return dst
    }

    @JvmStatic
    fun encode24leBu(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = value
        dst[++offset] = sign
        dst[++offset] = sign
        return dst
    }

    @JvmStatic
    fun encode24beBu(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = 0
        dst[++offset] = value
        return dst
    }

    @JvmStatic
    fun encode24leH(dst: ByteArray, value: Short, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = (if (value < 0) 0xFF else 0).toByte()
        return dst
    }

    @JvmStatic
    fun encode24beH(dst: ByteArray, value: Short, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        dst[++offset] = (if (value < 0) 0xFF else 0).toByte()
        return dst
    }

    @JvmStatic
    fun encode24leHu(dst: ByteArray, value: Short, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = 0
        return dst
    }

    @JvmStatic
    fun encode24beHu(dst: ByteArray, value: Short, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        dst[++offset] = 0
        return dst
    }

    @JvmStatic
    fun encode24leI(dst: ByteArray, value: Int, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = (value ushr 16).toByte()
        return dst
    }

    @JvmStatic
    fun encode24beI(dst: ByteArray, value: Int, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode24leL(dst: ByteArray, value: Long, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = (value ushr 16).toByte()
        return dst
    }

    @JvmStatic
    fun encode24beL(dst: ByteArray, value: Long, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode32leB(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0x0).toByte()
        dst[offset] = value
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        return dst
    }

    @JvmStatic
    fun encode32beB(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = sign
        dst[++offset] = sign
        dst[++offset] = sign
        dst[++offset] = value
        return dst
    }

    @JvmStatic
    fun encode32leBu(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmStatic
    fun encode32beBu(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = value
        return dst
    }

    @JvmStatic
    fun encode32leH(dst: ByteArray, value: Short, offset: Int): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = value.toByte()
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = sign
        dst[++offset] = sign
        return dst
    }

    @JvmStatic
    fun encode32beH(dst: ByteArray, value: Short, offset: Int): ByteArray {
        var offset = offset
        val sign = (if (value < 0) 0xFF else 0).toByte()
        dst[offset] = sign
        dst[++offset] = sign
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode32leHu(dst: ByteArray, value: Short, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmStatic
    fun encode32beHu(dst: ByteArray, value: Short, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = 0
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode32leI(dst: ByteArray, value: Int, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 24).toByte()
        return dst
    }

    @JvmStatic
    fun encode32beI(dst: ByteArray, value: Int, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 24).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode32leL(dst: ByteArray, value: Long, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 24).toByte()
        return dst
    }

    @JvmStatic
    fun encode32beL(dst: ByteArray, value: Long, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = (value ushr 24).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode64leB(dst: ByteArray, value: Byte, offset: Int): ByteArray {
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

    @JvmStatic
    fun encode64beB(dst: ByteArray, value: Byte, offset: Int): ByteArray {
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

    @JvmStatic
    fun encode64leBu(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmStatic
    fun encode64beBu(dst: ByteArray, value: Byte, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = value
        return dst
    }

    @JvmStatic
    fun encode64leH(dst: ByteArray, value: Short, offset: Int): ByteArray {
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

    @JvmStatic
    fun encode64beH(dst: ByteArray, value: Short, offset: Int): ByteArray {
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

    @JvmStatic
    fun encode64leHu(dst: ByteArray, value: Short, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmStatic
    fun encode64beHu(dst: ByteArray, value: Short, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = (value.toInt() ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode64leI(dst: ByteArray, value: Int, offset: Int): ByteArray {
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

    @JvmStatic
    fun encode64beI(dst: ByteArray, value: Int, offset: Int): ByteArray {
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

    @JvmStatic
    fun encode64leIu(dst: ByteArray, value: Int, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = value.toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 24).toByte()
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        return dst
    }

    @JvmStatic
    fun encode64beIu(dst: ByteArray, value: Int, offset: Int): ByteArray {
        var offset = offset
        dst[offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = 0
        dst[++offset] = (value ushr 24).toByte()
        dst[++offset] = (value ushr 16).toByte()
        dst[++offset] = (value ushr 8).toByte()
        dst[++offset] = value.toByte()
        return dst
    }

    @JvmStatic
    fun encode64leL(dst: ByteArray, value: Long, offset: Int): ByteArray {
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

    @JvmStatic
    fun encode64beL(dst: ByteArray, value: Long, offset: Int): ByteArray {
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

    @JvmStatic
    fun decode8B(src: ByteArray, offset: Int): Byte {
        return src[offset]
    }

    @JvmStatic
    fun decode8H(src: ByteArray, offset: Int): Short {
        return src[offset].toShort()
    }

    @JvmStatic
    fun decode8Hu(src: ByteArray, offset: Int): Short {
        return (src[offset].toInt() and 0xFF).toShort()
    }

    @JvmStatic
    fun decode8I(src: ByteArray, offset: Int): Int {
        return src[offset].toInt()
    }

    @JvmStatic
    fun decode8Iu(src: ByteArray, offset: Int): Int {
        return src[offset].toInt() and 0xFF
    }

    @JvmStatic
    fun decode8L(src: ByteArray, offset: Int): Long {
        return src[offset].toLong()
    }

    @JvmStatic
    fun decode8Lu(src: ByteArray, offset: Int): Long {
        return src[offset].toLong() and 0xFFL
    }

    @JvmStatic
    fun decode16leH(src: ByteArray, offset: Int): Short {
        return ((src[offset + 1].toInt() shl 8) or (src[offset].toInt() and 0xFF)).toShort()
    }

    @JvmStatic
    fun decode16beH(src: ByteArray, offset: Int): Short {
        return ((src[offset].toInt() shl 8) or (src[offset + 1].toInt() and 0xFF)).toShort()
    }

    @JvmStatic
    fun decode16leI(src: ByteArray, offset: Int): Int {
        return (src[offset + 1].toInt() shl 8) or (src[offset].toInt() and 0xFF)
    }

    @JvmStatic
    fun decode16beI(src: ByteArray, offset: Int): Int {
        return (src[offset].toInt() shl 8) or (src[offset + 1].toInt() and 0xFF)
    }

    @JvmStatic
    fun decode16leIu(src: ByteArray, offset: Int): Int {
        return ((src[offset + 1].toInt() and 0xFF) shl 8) or (src[offset].toInt() and 0xFF)
    }

    @JvmStatic
    fun decode16beIu(src: ByteArray, offset: Int): Int {
        return ((src[offset].toInt() and 0xFF) shl 8) or (src[offset + 1].toInt() and 0xFF)
    }

    @JvmStatic
    fun decode16leL(src: ByteArray, offset: Int): Long {
        return (src[offset + 1].toLong() shl 8) or (src[offset].toLong() and 0xFFL)
    }

    @JvmStatic
    fun decode16beL(src: ByteArray, offset: Int): Long {
        return (src[offset].toLong() shl 8) or (src[offset + 1].toLong() and 0xFFL)
    }

    @JvmStatic
    fun decode16leLu(src: ByteArray, offset: Int): Long {
        return ((src[offset + 1].toLong() and 0xFFL) shl 8) or (src[offset].toLong() and 0xFFL)
    }

    @JvmStatic
    fun decode16beLu(src: ByteArray, offset: Int): Long {
        return ((src[offset].toLong() and 0xFFL) shl 8) or (src[offset + 1].toLong() and 0xFFL)
    }

    @JvmStatic
    fun decode24leI(src: ByteArray, offset: Int): Int {
        var offset = offset
        var result = src[offset].toInt() and 0xFF
        result = result or (src[++offset].toInt() and 0xFF shl 8)
        return result or (src[++offset].toInt() shl 16)
    }

    @JvmStatic
    fun decode24beI(src: ByteArray, offset: Int): Int {
        var offset = offset
        var result = src[offset].toInt() shl 16
        result = result or (src[++offset].toInt() and 0xFF shl 8)
        return result or (src[++offset].toInt() and 0xFF)
    }

    @JvmStatic
    fun decode24leIu(src: ByteArray, offset: Int): Int {
        var offset = offset
        var result = src[offset].toInt() and 0xFF
        result = result or (src[++offset].toInt() and 0xFF shl 8)
        return result or (src[++offset].toInt() and 0xFF shl 16)
    }

    @JvmStatic
    fun decode24beIu(src: ByteArray, offset: Int): Int {
        var offset = offset
        var result = src[offset].toInt() and 0xFF shl 16
        result = result or (src[++offset].toInt() and 0xFF shl 8)
        return result or (src[++offset].toInt() and 0xFF)
    }

    @JvmStatic
    fun decode24leL(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return result or (src[++offset].toLong() shl 16)
    }

    @JvmStatic
    fun decode24beL(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() shl 16
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return result or (src[++offset].toLong() and 0xFFL)
    }

    @JvmStatic
    fun decode24leLu(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return result or (src[++offset].toLong() and 0xFFL shl 16)
    }

    @JvmStatic
    fun decode24beLu(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL shl 16
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return result or (src[++offset].toLong() and 0xFFL)
    }

    @JvmStatic
    fun decode32leI(src: ByteArray, offset: Int): Int {
        var offset = offset
        var result = src[offset].toInt() and 0xFF
        result = result or (src[++offset].toInt() and 0xFF shl 8)
        result = result or (src[++offset].toInt() and 0xFF shl 16)
        return result or (src[++offset].toInt() shl 24)
    }

    @JvmStatic
    fun decode32beI(src: ByteArray, offset: Int): Int {
        var offset = offset
        var result = src[offset].toInt() shl 24
        result = result or (src[++offset].toInt() and 0xFF shl 16)
        result = result or (src[++offset].toInt() and 0xFF shl 8)
        return result or (src[++offset].toInt() and 0xFF)
    }

    @JvmStatic
    fun decode32leL(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        result = result or (src[++offset].toLong() and 0xFFL shl 16)
        return result or (src[++offset].toLong() shl 24)
    }

    @JvmStatic
    fun decode32beL(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() shl 24
        result = result or (src[++offset].toLong() and 0xFFL shl 16)
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return result or (src[++offset].toLong() and 0xFFL)
    }

    @JvmStatic
    fun decode32leLu(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        result = result or (src[++offset].toLong() and 0xFFL shl 16)
        return result or (src[++offset].toLong() and 0xFFL shl 24)
    }

    @JvmStatic
    fun decode32beLu(src: ByteArray, offset: Int): Long {
        var offset = offset
        var result = src[offset].toLong() and 0xFFL shl 24
        result = result or (src[++offset].toLong() and 0xFFL shl 16)
        result = result or (src[++offset].toLong() and 0xFFL shl 8)
        return result or (src[++offset].toLong() and 0xFFL)
    }

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
        return result or (src[++offset].toLong() and 0xFFL shl 56)
    }

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
}