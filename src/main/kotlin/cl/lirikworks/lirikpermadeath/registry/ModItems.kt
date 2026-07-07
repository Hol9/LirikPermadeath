package cl.lirikworks.lirikpermadeath.registry

import cl.lirikworks.lirikpermadeath.util.ModConstants
import net.minecraft.world.item.Item
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredItem
import net.neoforged.neoforge.registries.DeferredRegister
import java.util.function.Supplier

object ModItems {

    val ITEMS: DeferredRegister.Items =
        DeferredRegister.createItems(ModConstants.MOD_ID)

    val TEST_ITEM: DeferredItem<Item> = ITEMS.registerSimpleItem(
        "test_item",
        Supplier { Item.Properties() }
    )

    fun register(eventBus: IEventBus) {
        ITEMS.register(eventBus)
    }
}