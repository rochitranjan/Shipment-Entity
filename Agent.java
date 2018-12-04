
public class Agent extends ShipmentEntity{

    
    String name;
    String iata;

    String fmc;

    
 

    Agent(String shipmentEntityName,String identificationNumber,String name,String iata,String fmc){

        super(shipmentEntityName, identificationNumber);

        setName(name);

        setIata(iata);

        setFmc(fmc);

    }
    
    
public void setName(String name){

      this.name = name;

    }
    
    public String getName(){

    return name;

    }

    
     public void setIata(String iata){

      this.iata = iata;

     }

     public String getIata(){

      return iata;

     }

     
      public void setFmc(String fmc){

      this.fmc = fmc;

     }

     public String getFmc(){

      return fmc;

     }

    

    void display(){

        System.out.format("%-15s %-25s %-15s %-15s %-15s\n",this.getShipmentEntityName(),this.getIdentificationNumber(),this.getName(),this.getIata(),this.getFmc());
    }
}
