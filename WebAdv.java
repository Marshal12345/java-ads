import java.util.*;

class WebAdv extends Advertisement{

    private float price;  //timh ana hmera
    private float autocost;  //kostos automaths emfanishs
    private float extracost; //timh epipleon selidas emfanishs
    private int auto;  //h yparxh automaths emfanishs (0,1)
    private int extrapages; //plh8os epipleon  selidvn
    private float totalcost; // kostos diafhmishs

    WebAdv (int adcode, String addesc, int taxid, int adtype, String product, int duration, String details, float price, float autocost, float extracost, int auto, int extrapages, float totalcost) {
        super(adcode,addesc,taxid,adtype,product,duration,details);
        
        this.price = price;
        this.autocost = autocost;
        this.extracost = extracost;
        this.auto = auto;
        this.extrapages = extrapages;
        this.totalcost = totalcost;

    }    

    float getTotalcost(){

        this.totalcost = this.price * this.duration;
        if (this.auto == 1){
            this.totalcost += this.autocost;
        }

        this.totalcost += (this.extrapages * this.extracost);
        return this.totalcost;  

    }

}//Marashll 
