package view;

public enum LookAndFeel 
{
	DEFAULT(null), 
	WINDOWS("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"), 
	NIMBUS("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"), 
	MOTIF("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
	
	private String constants = null;
	
	private LookAndFeel(String constants)
	{
		this.constants = constants;
	}
	
	public String getLAF()
	{
		return constants;
	}
}
