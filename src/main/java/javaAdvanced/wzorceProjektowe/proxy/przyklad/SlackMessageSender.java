package javaAdvanced.wzorceProjektowe.proxy.przyklad;

public class SlackMessageSender implements MessageSender{
    @Override
    public void sendMessage(String wiadosc) {
        System.out.println(wiadosc);
    }
}
