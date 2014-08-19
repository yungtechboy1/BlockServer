package net.blockserver;

import net.blockserver.player.DummyPlayerDatabase;
import net.blockserver.utility.MinecraftVersion;

public class BlockServer {
	public static void main(String[] args) {
        try {
            Server server = new Server("BlockServer - A cool MCPE server written in java!",
                    "0.0.0.0", 19132, 5, MinecraftVersion.V095, DummyPlayerDatabase.class); // TODO change the default player database
            server.run();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

	}

}
