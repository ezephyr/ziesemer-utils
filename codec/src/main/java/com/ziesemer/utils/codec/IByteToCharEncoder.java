package com.ziesemer.utils.codec;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * @author Mark A. Ziesemer
 * 	<a href="http://www.ziesemer.com.">&lt;www.ziesemer.com&gt;</a>
 */
public interface IByteToCharEncoder extends ICoder<ByteBuffer, CharBuffer>{
	// Below not currently supported by javac: http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6294779
	// public IByteToCharEncoder clone() throws CloneNotSupportedException;
}
