package com.eucalyptus.eucabot.webcam;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CPixelFormat extends Structure {
	/**
	 * to be treated like a NUL terminated string.<br>
	 * C type : char[5]
	 */
	public byte[] fourcc = new byte[(5)];
	/**
	 * A human-readable description of the pixel format.<br>
	 * C type : char*
	 */
	public Pointer name;
	/**
	 * This member can be NULL.<br>
	 * C type : char*
	 */
	public Pointer mimeType;
	public CPixelFormat() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new java.lang.String[]{"fourcc", "name", "mimeType"});
	}
	/**
	 * @param fourcc to be treated like a NUL terminated string.<br>
	 * C type : char[5]<br>
	 * @param name A human-readable description of the pixel format.<br>
	 * C type : char*<br>
	 * @param mimeType This member can be NULL.<br>
	 * C type : char*
	 */
	public CPixelFormat(byte fourcc[], Pointer name, Pointer mimeType) {
		super();
		if (fourcc.length != this.fourcc.length) 
			throw new IllegalArgumentException("Wrong array size !");
		this.fourcc = fourcc;
		this.name = name;
		this.mimeType = mimeType;
		initFieldOrder();
	}
	public static class ByReference extends CPixelFormat implements Structure.ByReference {
		
	};
	public static class ByValue extends CPixelFormat implements Structure.ByValue {
		
	};
}
