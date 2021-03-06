package com.ebiggz.postalservice.backend;

import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.ebiggz.postalservice.config.WorldGroup;
import com.ebiggz.postalservice.mail.Mail;
import com.ebiggz.postalservice.mail.MailType;
import com.ebiggz.postalservice.mail.MailManager.BoxType;

public interface User {

	public boolean isReal();

	public void createUser();

	public String getIdentifier();

	public UUID getUUID();

	public String getPlayerName();

	public void setPlayerName(String playerName);

	public List<Mail> getInbox();

	public List<Mail> getSentbox();

	public List<ItemStack> getDropbox(WorldGroup worldGroup);

	public void saveDropbox(List<ItemStack> items, WorldGroup worldGroup);

	public List<Mail> getBoxFromType(BoxType type);

	public int getUnreadMailCount();

	public boolean inboxIsFull();

	public int getBoxSizeFromType(BoxType type);

	public boolean sendMail(String recipient, String message, String attachmentData, MailType mailType, WorldGroup worldGroup);

	public boolean receieveMail(Player sender, MailType mailType);

	public boolean markAllMailAsRead();

	public boolean markMailAsClaimed(Mail mail);

	public boolean markMailAsDeleted(Mail mail, BoxType type);

	public String getTimeZone();

	public void setTimeZone(String timezone);

}
