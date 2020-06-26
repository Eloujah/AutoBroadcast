/*
 * Copyright © 2020 Property of Rían Errity Licensed under GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007. See <LICENSE.md>
 */

package io.paradaux.AutoBroadcast.Commands;

import io.paradaux.AutoBroadcast.API.LocaleCache;
import io.paradaux.AutoBroadcast.AutoBroadcast;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AutoBroadcastCMD implements CommandExecutor {
    LocaleCache locale = AutoBroadcast.getLocaleCache();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage(locale.getAutoBroadcastHelpHeader());
        sender.sendMessage(locale.getAutoBroadcastHelpContent());
        return true;
    }
}
