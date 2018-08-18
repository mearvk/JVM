package java.jvm.components;

import java.math.BigInteger;

/** */
public abstract class JVMInstrument extends JVMObject
{
	/** @return BigInteger Instrument ID */
	public BigInteger getInstrumentID()
	{
		return BigInteger.ONE;
	}
	
	/** @return String Instrument Name */
	public String getInstrumentName()
	{
		return "";
	}
}