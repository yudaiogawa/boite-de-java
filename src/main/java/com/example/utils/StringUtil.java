package com.example.utils;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

class StringUtil {

    void getBytesString(String str) {

        if (str.isEmpty()) {
        } else {
            Charset enc = Charset.forName("Shift_JIS");
            int bytes = str.getBytes(enc).length;
            System.out.println("Encodes by Shift_JIS: " + Integer.toString(bytes) + " bytes.");

            enc = StandardCharsets.UTF_8;
            bytes = str.getBytes(enc).length;
            System.out.println("Encodes by UTF_8: " + Integer.toString(bytes) + " bytes.");
        }
    }

    /**
     * 指定のバイト数以内に切り捨てた文字列を返します
     * 文字セットはS-JIS（全角1文字2byte）
     *
     * @param str 文字列
     * @param truncateByteSize バイト数
     * @return 文字列
     */
    String truncateWithByteShiftJis(String str, int truncateByteSize) {
        Charset charset = Charset.forName("Shift_JIS");
        return truncateWithByte(charset, str, truncateByteSize);
    }

    /**
     * 指定の文字セットおよびバイト数以内に切り捨てた文字列を返します
     *
     * @param str 文字列
     * @param charset 文字セット
     * @param truncateByteSize バイト数
     * @return 文字列
     */
    public String truncateWithByte(Charset charset, String str, int truncateByteSize) {
        byte[] bytes = str.getBytes(charset);

        int strByteSize = bytes.length;
        if (strByteSize <= truncateByteSize) return str;

        ByteBuffer byteBuf = ByteBuffer.wrap(bytes, 0, truncateByteSize);
        CharBuffer charBuf = CharBuffer.allocate(truncateByteSize);

        CharsetDecoder decoder = charset.newDecoder();
        decoder.onMalformedInput(CodingErrorAction.IGNORE);
        decoder.decode(byteBuf, charBuf, true);
        decoder.flush(charBuf);

        return new String(charBuf.array(), 0, charBuf.position());
    }
}
