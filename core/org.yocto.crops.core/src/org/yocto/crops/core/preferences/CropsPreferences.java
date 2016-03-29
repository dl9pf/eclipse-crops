package org.yocto.crops.core.preferences;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.yocto.crops.core.CropsCorePlugin;
import org.yocto.crops.core.CropsUtils;

public class CropsPreferences {

	private static final String CROPS_HOME = "cropsHome"; //$NON-NLS-1$
	
	private static String defaultHome = null;
	
	private static String getDefaultHome() {
		if (CropsUtils.isWin()) {
			defaultHome = Paths.get(System.getenv("USERPROFILE"), ".crops").toString(); //$NON-NLS-1$ //$NON-NLS-2$
		} else {
			defaultHome = Paths.get(System.getProperty("user.home"), "/.crops").toString(); //$NON-NLS-1$ //$NON-NLS-2$
		}
		return defaultHome;
	}
	
	private static IEclipsePreferences getPrefs() {
		return InstanceScope.INSTANCE.getNode(CropsCorePlugin.getId());
	}
	
	public static Path getCropsHome() {
		return Paths.get(getPrefs().get(CROPS_HOME, getDefaultHome()));
	}
	
}
