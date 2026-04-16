package Themes;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class My_theme
	extends FlatMacLightLaf
{
	public static final String NAME = "My_theme";

	public static boolean setup() {
		return setup( new My_theme() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, My_theme.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
