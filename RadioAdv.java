import java.util.*;

class RadioAdv extends Advertisement{

    private float price1; //timh sthn prwinh zwnh
    private float price2; //timh sthn meshmerianh zwnh
    private float price3; //timh sthn apogeumatinh zwnh
    private float price4; //timh sthn bradinh zwnh
    private float secduration; //diarkeia diafhmishs se deuterolepta
    private float timezone; //xronikh zwnh emfanishs ths diafhmishs 
    private float totalcost; //synoliko kostos

    RadioAdv(int adcode, String addesc, int taxid, int adtype, String product, int duration, String details, int price1, int price2, int price3, int price4, int secduration, int timezone, float totalcost){        
        super(adcode,addesc,taxid,adtype,product,duration,details);
        
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
        this.price4 = price4;
        this.secduration = secduration;
        this.timezone = timezone;
 
        this.totalcost = totalcost;   }


    float getTotalcost(){
        this.totalcost = this.secduration * this.duration;
        if(this.timezone == 1){
            this.totalcost += this.price1;
        }
        else if(this.timezone == 2){
            this.totalcost += this.price2;
        }
        else if(this.timezone == 3){
            this.totalcost += this.price3;
        }
        else if(this.timezone == 4){
            this.totalcost += this.price4;
        }
        else{
            System.out.println("Wrong input...");
        }
        
        return this.totalcost;
    }
    

    



}//panouski