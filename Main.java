import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.*;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.ArrayList;

public class Main {

    
    public static void main(String args[]) throws IOException, ParseException{

      

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of shipment entity");

        int shipNo;

        String response;

        String inputStr;

        shipNo=Integer.parseInt(br.readLine());
 
        ArrayList<Customer> custArray = new ArrayList<Customer>();

        ArrayList<Company> compArray = new ArrayList<Company>();

        ArrayList<Agent> agentArray = new ArrayList<Agent>();

        ArrayList<Carrier> carrArray = new ArrayList<Carrier>();

        
for(int i=0;i<shipNo;i++){

            System.out.println("Enter the shipment entity "+(i+1)+" details :");

            System.out.println("Select the shipment entity type");

            System.out.println("1)Customer");

            System.out.println("2)Company");

            System.out.println("3)Agent");

            System.out.println("4)Carrier");

            response=br.readLine();

            inputStr=br.readLine();

            
            if(response.equals("1")){

                    	custArray.add(new Customer(inputStr.split(",")[0], inputStr.split(",")[1],Integer.parseInt(inputStr.split(",")[2]),inputStr.split(",")[3]));

            }

            else if(response.equals("2")){

                compArray.add(new Company(inputStr.split(",")[0], inputStr.split(",")[1],inputStr.split(",")[2],inputStr.split(",")[3],inputStr.split(",")[4]));  
            }

            else if(response.equals("3")){

                agentArray.add(new Agent(inputStr.split(",")[0], inputStr.split(",")[1],inputStr.split(",")[2],inputStr.split(",")[3],inputStr.split(",")[4]));                    
            }

            else if(response.equals("4")){

                carrArray.add(new Carrier(inputStr.split(",")[0], inputStr.split(",")[1],inputStr.split(",")[2],inputStr.split(",")[3]));                  
            }

        }

        System.out.println("Shipment details are");

        System.out.println("Enter the shipment entity type to display");

        response=br.readLine();

        if(response.equals("Customer")){
 
           System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Customer Id","Customer Name");

            for(int i=0;i<custArray.size();i++){

                custArray.get(i).display();

            }

        }

        else if(response.equals("Agent")){

            System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number ","Agent Name","IATA","FMC");

            for(int i=0;i<agentArray.size();i++){

                agentArray.get(i).display();

            }

        }

        else if(response.equals("Carrier")){

            System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Code Name","IATA");

            for(int i=0;i<carrArray.size();i++){

                carrArray.get(i).display();

            }

        }

        else{

            System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number","Company Name","IATA","FMC");

            for(int i=0;i<compArray.size();i++){
 
               compArray.get(i).display();

            }

        }

    }

}

