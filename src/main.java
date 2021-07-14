import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Dipper
 * @project pruebasFilter
 * @created 14/07/2021 - 1:05
 */
public class main {
    public static void main(String[] args) {

        List<Branch> branches = new ArrayList<>();
        List<Channel> channels1 = new ArrayList<>();
        List<Channel> channels2 = new ArrayList<>();
        List<ChannelService> channelServices1 = new ArrayList<>();
        List<ChannelService> channelServices2 = new ArrayList<>();
        List<ChannelService> channelServices3 = new ArrayList<>();
        List<ChannelService> channelServices4 = new ArrayList<>();

        channelServices1.add(new ChannelService("X001", "BOTH"));
        channelServices1.add(new ChannelService("X002", "BOOKING"));
        channelServices1.add(new ChannelService("X009", "TICKET"));

        channelServices2.add(new ChannelService("X001"));
        channelServices2.add(new ChannelService("X002"));
        channelServices2.add(new ChannelService("X002"));

        channelServices3.add(new ChannelService("X001", "BOOKING"));
        channelServices3.add(new ChannelService("X002", "BOOKING"));
        channelServices3.add(new ChannelService("X009", "TICKET"));

        channelServices4.add(new ChannelService("X001"));
        channelServices4.add(new ChannelService("X002"));
        channelServices4.add(new ChannelService("X002"));

        channels1.add(new Channel("001", "AGENCIA TICKETERA", channelServices1));
        channels1.add(new Channel("07016", "Canal2", channelServices2));

        channels2.add(new Channel("001", "AGENCIA TICKETERA", channelServices3));
        channels2.add(new Channel("07016", "Canal2", channelServices4));

        branches.add(new Branch("AG001", "BCP Huaral", channels1));
        branches.add(new Branch("AG002", "BCP Agendamiento", channels2));

        branches =  branches.stream()
                .map(branch -> branch.getChannels().stream()
                        .filter(channel -> channel.getId().equals("001")));


        System.out.println(branches);
    }


}
