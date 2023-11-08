package ie.atu.warehouseservice.pd.warehouseservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseService {
}

@Autowired
public WarehouseService(GetWarehouseById getWarehouseById){this.GetWarehouseById = getWarehouseById}
public void registerID(String location, int capacity, int warehouseId) {

}
}