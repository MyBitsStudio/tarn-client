package org.necrotic.client.renderable;

import org.necrotic.client.ItemEffect;
import org.necrotic.client.ItemRarity;
import org.necrotic.client.cache.definition.ItemDefinition;
import org.necrotic.client.world.Model;

public final class Item extends Animable {

	public int amount;
	public int id;

	@Override
	public Model getRotatedModel() {
		ItemDefinition definition = ItemDefinition.get(id);
		return definition.getInventoryModel(amount);
	}

}