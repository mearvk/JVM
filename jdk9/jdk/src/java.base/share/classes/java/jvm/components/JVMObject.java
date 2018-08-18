package java.jvm.components;

import java.math.BigInteger;

/** */
public abstract class JVMObject
{
	/** @return BigInteger Hashcode ID */
	public BigInteger getUniqueHashcode()
	{
		return BigInteger.ONE; //namespace, organization, department, project, hardware, system name, application, etc.
	}
	
	/** @return String JVM Version */
	public String getJVMVersion()
	{
		return System.getProperty("java.runtime.version");
	}	
	
	/** @return String OS Name */
	public String getOSName()
	{
		return System.getProperty("os.name");
	}	
}