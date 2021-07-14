import java.util.ArrayList;
import java.util.List;

/**
 * @author Dipper
 * @project pruebasFilter
 * @created 14/07/2021 - 1:02
 */
public class Channel {
    private final String id;
    private String name;
    private List<ChannelService> channelServices = new ArrayList<>();

    public Channel(String id, String name, List<ChannelService> channelServices) {
        this.id = id;
        this.name = name;
        this.channelServices = channelServices;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChannelService> getChannelServices() {
        return channelServices;
    }

    public void setChannelServices(List<ChannelService> channelServices) {
        this.channelServices = channelServices;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id + '\n' +
                ", name:" + name + '\n' +
                ", channelServices:" + channelServices + '\n' +
                '}';
    }
}
