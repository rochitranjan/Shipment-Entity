



public class ShipmentEntity {
    
    protected String shipmentEntityName;
    protected String identificationNumber;
    
    
    ShipmentEntity(String shipmentEntityName,String identificationNumber){
       setShipmentEntityName(shipmentEntityName);
       setIdentificationNumber(identificationNumber);
    }
    
    public void setShipmentEntityName(String shipmentEntityName){
      this.shipmentEntityName = shipmentEntityName;
    }
    
    public String getShipmentEntityName(){
    return shipmentEntityName;
    }
    
    public void setIdentificationNumber(String identificationNumber){
      this.identificationNumber = identificationNumber;
    }
    
    public String getIdentificationNumber(){
    return identificationNumber;
    }
        
    void display(){
        
    }
}
