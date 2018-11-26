import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class IdentityMap {
    private DataMapper dataMapper;
    private Map<Long, Product> identityMap=new HashMap<>();


    public IdentityMap(DataMapper dataMapper) {
        this.dataMapper = dataMapper;
    }

    public Product getProduct (Long id) {
        if(identityMap.get(id)!=null)return identityMap.get(id);
        else try {
            identityMap.put(id,dataMapper.findById(id));
        } catch (SQLException e){};
        return identityMap.get(id);
    }

}
