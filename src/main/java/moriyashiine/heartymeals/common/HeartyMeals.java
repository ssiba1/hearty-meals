/*
 * All Rights Reserved (c) MoriyaShiine
 */

package moriyashiine.heartymeals.common;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

public class HeartyMeals implements ModInitializer {
	public static final String MOD_ID = "heartymeals";

	public static boolean farmersDelightLoaded = false;

	@Override
	public void onInitialize() {
		MidnightConfig.init(MOD_ID, ModConfig.class);
		farmersDelightLoaded = FabricLoader.getInstance().isModLoaded("farmersdelight");
	}

	public static Identifier id(String value) {
		return new Identifier(MOD_ID, value);
	}
}