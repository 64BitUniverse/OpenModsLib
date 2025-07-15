package openmods.utils;

import java.io.File;
import openmods.OpenModsOld;

public class MCUtils {
	public static String getLogFileName() {
		return OpenModsOld.proxy.getLogFileName();
	}

	public static String getMinecraftDir() {
		return OpenModsOld.proxy.getMinecraftDir().getAbsolutePath();
	}

	public static String getConfigDir() {
		return new File(OpenModsOld.proxy.getMinecraftDir(), "config").getAbsolutePath();
	}
}
