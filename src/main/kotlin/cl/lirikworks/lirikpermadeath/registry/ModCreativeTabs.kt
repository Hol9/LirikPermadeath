package cl.lirikworks.lirikpermadeath.registry

import cl.lirikworks.lirikpermadeath.util.ModConstants
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredRegister
import java.util.function.Supplier

object ModCreativeTabs {

    private val TABS: DeferredRegister<CreativeModeTab> =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModConstants.MOD_ID)

    val MAIN_TAB: Supplier<CreativeModeTab> = TABS.register("main", Supplier {
        CreativeModeTab.builder()
            .title("Lirik Permadeath")
            .icon {
                ItemStack(ModItems.TEST_ITEM.get)
            }
            .displayItems { _, output ->
                output.accept(ModItems.TEST_ITEM.get())
            }
            .build()
    })

    fun register(modBus: IEventBus) {
        TABS.register(modBus)
    }
}