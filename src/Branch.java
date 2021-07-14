import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Dipper
 * @project pruebasFilter
 * @created 14/07/2021 - 1:01
 */
public class Branch {
    private final String id;
    private String name;
    private List<Channel> channels = new ArrayList<>();

    public Branch(String id, String name, List<Channel> channels) {
        this.id = id;
        this.name = name;
        this.channels = channels;
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

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id + '\n' +
                ", name:" + name + '\n' +
                ", channels:" + channels + '\n' +
                '}';
    }
}
