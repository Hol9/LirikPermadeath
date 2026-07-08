package cl.lirikworks.lirikpermadeath

import cl.lirikworks.lirikpermadeath.registry.ModCreativeTabs
import cl.lirikworks.lirikpermadeath.registry.ModItems
import cl.lirikworks.lirikpermadeath.util.ModConstants.MOD_ID
import cl.lirikworks.lirikpermadeath.util.ModConstants.MOD_NAME

import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.ModContainer
import net.neoforged.fml.common.Mod
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Mod(MOD_ID)
class LirikPermadeath(
    modBus: IEventBus,
    modContainer: ModContainer
) {
    init {
        LOGGER.info("Inicializando $MOD_NAME")

        registerContent(modBus)
        registerConfig()
    }

    private fun registerContent(modBus: IEventBus) {
        ModItems.register(modBus)
        ModCreativeTabs.register(modBus)
    }

    private fun registerConfig() {

    }

    companion object {
        val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)
    }
}