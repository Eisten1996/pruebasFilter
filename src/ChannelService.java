/**
 * @author Dipper
 * @project pruebasFilter
 * @created 14/07/2021 - 1:03
 */
public class ChannelService {
    private String serviceId;
    private String flag;

    public ChannelService(String serviceId, String flag) {
        this.serviceId = serviceId;
        this.flag = flag;
    }

    public ChannelService(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "{" +
                "serviceId:" + serviceId + '\n' +
                ", flag:" + flag + '\n' +
                '}';
    }
}
