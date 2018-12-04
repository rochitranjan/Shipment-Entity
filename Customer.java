
public class Customer extends ShipmentEntity{

    
    private Integer id;

    private String name;

    
    

    Customer(String shipmentEntityName,String identificationNumber,Integer id,String name){

        super(shipmentEntityName, identificationNumber);

        setId(id);

        setName(name);

    }


    public void setId(Integer id){

      this.id = id;

    }

    
    public Integer getId(){

    return id;

    }
 
   
    public void setName(String name){

      this.name = name;

    }

    
    public String getName(){

    return name;

    }

        

    void display(){

        System.out.format("%-15s %-25s %-15s %-15s\n",this.getShipmentEntityName(),this.getIdentificationNumber(),this.getId(),this.getName());

    }

}
