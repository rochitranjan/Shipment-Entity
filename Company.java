
public class Company extends ShipmentEntity{

    
     private String identifier;

     private String iata;

     private String fmc;

    
    Company(String name,String identificationNumber,String identifier,String iata,String fmc){

        super(name, identificationNumber);

        setIdentifier(identifier);

        setIata(iata);

        setFmc(fmc);

    }

    
     public void setIdentifier(String identifier){

      this.identifier = identifier;

     }

     public String getIdentifier(){

      return identifier;

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

        System.out.format("%-15s %-25s %-15s %-15s %-15s\n",this.getShipmentEntityName(),this.getIdentificationNumber(),this.getIdentifier(),this.getIata(),this.getFmc());

    }

}
