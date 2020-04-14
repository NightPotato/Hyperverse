//
// Hyperverse - A minecraft world management plugin
// Copyright © 2020 Alexander Söderberg (sauilitired@gmail.com)
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program. If not, see <http://www.gnu.org/licenses/>.
//

package com.intellectualsites.hyperverse;

import com.intellectualsites.hyperverse.listeners.WorldListener;
import com.intellectualsites.hyperverse.world.WorldManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class Hyperverse extends JavaPlugin {

    @Getter private WorldManager worldManager;

    @Override public void onEnable() {
        this.worldManager = new WorldManager(this);
        // Register event listeners
        this.getServer().getPluginManager()
            .registerEvents(new WorldListener(this.worldManager), this);
    }

    @Override public void onDisable() {
        // Plugin shutdown logic
    }
}
