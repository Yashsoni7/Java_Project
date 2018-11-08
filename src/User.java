/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viram
 */
public class User {
    private int Id;
    private String Company;
    private String Model;
    private String CarNo;
    private String Seater;
    private int Charges;
     
    public User(String Company,String Model,String CarNo,String Seater,int Charges){
         this.Company=Company;
         this.Model=Model;
         this.CarNo=CarNo;
         this.Seater=Seater;
         this.Charges=Charges;
    }
    public String getCompany(){
        return Company;
    }
      public String getModel(){
        return Model;
    }
       public String getCarNo(){
        return CarNo;
    }
        public String getSeater(){
        return Seater;
    }
        public int getCharges(){
        return Charges;
    }
    
    
}
