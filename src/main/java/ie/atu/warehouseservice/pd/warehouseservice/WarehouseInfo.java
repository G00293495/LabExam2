package ie.atu.warehouseservice.pd.warehouseservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class WarehouseInfo {
    private String location;
    private int capacity;
    private int warehouseId;

}
