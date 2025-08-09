package com.eldonred;

import com.eldonred.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class LiminalityClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {


		EntityRendererRegistry.register(ModEntities.FIRESALTPROJECTILE, FlyingItemEntityRenderer::new);
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
	}
}