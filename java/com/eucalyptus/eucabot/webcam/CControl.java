package com.eucalyptus.eucabot.webcam;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CControl extends Structure {
	/**
	 * The identifier of the control<br>
	 * @see CControlId<br>
	 * C type : CControlId
	 */
	public int id;
	/**
	 * The human-readable name of the control<br>
	 * C type : char*
	 */
	public Pointer name;
	/**
	 * The type of the control<br>
	 * @see CControlType<br>
	 * C type : CControlType
	 */
	public int type;
	/**
	 * Flags describing properties and capabilities of the control<br>
	 * @see CControlFlags<br>
	 * C type : CControlFlags
	 */
	public int flags;
	/**
	 * The current value of the control<br>
	 * C type : CControlValue
	 */
	public CControlValue value;
	/**
	 * The default value of the control<br>
	 * C type : CControlValue
	 */
	public CControlValue def;
	public CControl() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new java.lang.String[]{"id", "name", "type", "flags", "value", "def"});
	}
	/**
	 * @param id The identifier of the control<br>
	 * @see CControlId<br>
	 * C type : CControlId<br>
	 * @param name The human-readable name of the control<br>
	 * C type : char*<br>
	 * @param type The type of the control<br>
	 * @see CControlType<br>
	 * C type : CControlType<br>
	 * @param flags Flags describing properties and capabilities of the control<br>
	 * @see CControlFlags<br>
	 * C type : CControlFlags<br>
	 * @param value The current value of the control<br>
	 * C type : CControlValue<br>
	 * @param def The default value of the control<br>
	 * C type : CControlValue
	 */
	public CControl(int id, Pointer name, int type, int flags, CControlValue value, CControlValue def) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.flags = flags;
		this.value = value;
		this.def = def;
		initFieldOrder();
	}
	public static class ByReference extends CControl implements Structure.ByReference {
		
	};
	public static class ByValue extends CControl implements Structure.ByValue {
		
	};
}
