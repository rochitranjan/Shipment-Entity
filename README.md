# Logistics Management Console Application
Console App that will retrieve the details of the Shipment Entity based on 4 types of people who handle it namely, Customer, Agent, Carrier and Company. Get all the details related to the Shipment Entity as input from the user through console. The app adds all of the user to a list and lets you run a search against all of the added entities and displayes the search result in following format


Parameters for Customer - String shipmentEntityName,String identificationNumber,Integer id,String name    
Search Results format for Customer - "Name","Identification Number","Customer Id","Customer Name"  
Parameters for Company - String name,String identificationNumber,String identifier,String iata,String fmc  
Search Results format for Company - "Name","Identification Number","Company Name","IATA","FMC"  
Parameters for Agent - String shipmentEntityName,String identificationNumber,String name,String iata,String fmc 
Search Results format for Agent - "Name","Identification Number ","Agent Name","IATA","FMC"  
Parameters for Carrier - String name,String identificationNumber,String carrierCode,String iata  
Search Results format for Carrier - "Name","Identification Number","Code Name","IATA"  

IATA - IATA number for accredited travel agents/company  
FMC - FMC license number for accredited company/agents  

# Input and Output Format:

Enter the number of shipment entity  
3  
Enter the shipment entity 1 details:  
Select the shipment entity type  
1)Customer  
2)Company  
3)Agent  
4)Carrier  
1  
Laptop,800101,111,Rahul  
Enter the shipment entity 2 details:  
Select the shipment entity type  
1)Customer  
2)Company  
3)Agent  
4)Carrier  
1  
Micro phone,801102,211,Mitharan  
Enter the shipment entity 3 details:  
Select the shipment entity type  
1)Customer  
2)Company  
3)Agent  
4)Carrier  
3  
Electric Fan,912115,Rahul,USCTG1230,PMI/SJC/1361  
Shipment details are  
Enter the shipment entity type to display  
Customer  
Name            Identification Number     Customer Id     Customer Name  
Laptop          800101                    111             Rahul          
Micro phone     801102                    211             Mitharan       
