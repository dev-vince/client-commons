package dev.vince.commons.util;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

/**
 * The ChatUtil class is used to send messages in the chat.
 * The messages are formatted with the client's name and color.
 * The syntax of the prefix can be altered using the {@link #setPrefix(String, EnumChatFormatting, EnumChatFormatting, EnumChatFormatting)} method.
 * The default prefix is {@code [PREFIX_TEXT]}.
 * Individual constants can be altered using their respected setters
 */
@Getter @Setter
public final class ChatUtil implements MinecraftInterface{
    private static String BOARDER_COLOR = EnumChatFormatting.GRAY.toString();
    private static String PREFIX_COLOR = EnumChatFormatting.GREEN.toString();
    private static String TEXT_COLOR = EnumChatFormatting.WHITE.toString();
    private static String PREFIX_TEXT = "Client";

    /**
     * Used to get the formatted prefix in the ChatUtil class.
     * @return the formatted prefix
     */
    private static String getPrefixText() {
        return String.format("%s[%s%s%s]%s", BOARDER_COLOR, PREFIX_COLOR, PREFIX_TEXT, BOARDER_COLOR, TEXT_COLOR);
    }

    /**
     * Prints a message in the chat with the prefix client side
     * @param message the message to print
     */
    public static void print(final String message) {
        if (mc.thePlayer != null && mc.theWorld != null)
            mc.thePlayer.addChatMessage(new ChatComponentText(getPrefixText() + " " + message));
    }

    /**
     * Prints a message in the chat with the prefix client side and a color specified for the message text
     * @param message the message to print
     */
    public static void print(final String message, final EnumChatFormatting color) {
        if (mc.thePlayer != null && mc.theWorld != null)
            mc.thePlayer.addChatMessage(new ChatComponentText(getPrefixText() + " " + color + message));
    }

    /**
     * Sends message in chat with the supplied text
     * @param message the message to send
     */
    public static void sendMessage(final String message) {
        if (mc.thePlayer != null && mc.theWorld != null)
            mc.thePlayer.sendChatMessage(message);
    }


    /**
     * Sends message in chat with the prefix and the supplied text
     * @param message the message to send
     */
    public static void sendMessageWithPrefix(final String message) {
        if (mc.thePlayer != null && mc.theWorld != null)
            mc.thePlayer.sendChatMessage(getPrefixText() + " " + message);
    }

    /**
     * Sets the prefix of the ChatUtil
     * @param prefix the prefix to set
     * @param boarderColor the color of the boarder of the prefix
     * @param prefixColor the color of the prefix
     * @param textColor the color of the text
     */
    public static void setPrefix(final String prefix, final EnumChatFormatting boarderColor, final EnumChatFormatting prefixColor, final EnumChatFormatting textColor) {
        BOARDER_COLOR = boarderColor.toString();
        PREFIX_COLOR = prefixColor.toString();
        TEXT_COLOR = textColor.toString();
        PREFIX_TEXT = prefix;
    }
}
