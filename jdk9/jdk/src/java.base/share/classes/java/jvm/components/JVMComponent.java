package java.jvm.components;

import java.math.BigInteger;

/** */
public abstract class JVMComponent extends JVMInstrument
{
	/** @return BigInteger Component ID*/
	public BigInteger getComponentID()
	{
		return BigInteger.ONE;
	}
	
	/** @return String Component Name */
	public String getComponentName()
	{
		return "";
	}
}