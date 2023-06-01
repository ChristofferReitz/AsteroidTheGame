package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IGamePluginService {

    /**
     * Start the plugin.
     *
     * Pre-condition: The game is starting and the plugin has not yet been started.<br />
     * Post-condition: The plugin has been started and entities have been added to the world.
     *
     * @param gameData Data for the game
     * @param world World of the game
     *

     */
    void start(GameData gameData, World world);

    /**
     * Stop the plugin.

     * Pre-condition: The game is stopping and the plugin has not yet been stopped.
     * Post-condition: The plugin has been stopped and entities have been removed from the world.
     *
     * @param gameData Data for the game
     * @param world World of the game
     *
     * @see GameData
     * @see World
     */
    void stop(GameData gameData, World world);
}
