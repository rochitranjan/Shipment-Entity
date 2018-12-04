
public class Carrier extends ShipmentEntity{

    
   private String carrierCode;

   private String iata;

  
   
    Carrier(String name,String identificationNumber,String carrierCode,String iata){

        super(name, identificationNumber);

        setCarrierCode(carrierCode);

        setIata(iata);

    }

    
    public void setCarrierCode(String carrierCode){

      this.carrierCode = carrierCode;

    }

    
    public String getCarrierCode(){

      return carrierCode;

     }
     
    public void setIata(String iata){

      this.iata = iata;

    }

    public String getIata(){
 
     return iata;

    }

    

     void display(){

         System.out.format("%-15s %-25s %-15s %-15s\n",this.getShipmentEntityName(),this.getIdentificationNumber(),this.getCarrierCode(),this.getIata());

     }

}
