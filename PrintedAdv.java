import java.util.*;

class PrintedAdv extends Advertisement{

    private int wordcount; //plhthos leksewn
    private String listingpos; // thesh diafhmishs
    private float fpprice; //frontpage price
    private float mpprice; //midpages price
    private float lpprice; //lastpage price
    private float wordprice; //price per word
    private float totalcost; //kostos diafhmishs 
    float price;

    PrintedAdv(int adcode, String addesc, int taxid, int adtype, String product, int duration, String details ,int wordcount, String listingpos, float fpprice, float mpprice, float lpprice, float wordprice){
        super(adcode,addesc,taxid,adtype,product,duration,details);

        this.wordcount = wordcount;
        this.listingpos = listingpos;
        this.fpprice = fpprice;
        this.mpprice = mpprice;
        this.lpprice = lpprice;
    
    }

    float Pricing(){
        
        while(true){ 
        if (this.listingpos == "first"){
            return this.wordcount*this.fpprice*this.duration;
        }
        else if (this.listingpos == "mid"){
            return this.wordcount*this.mpprice*this.duration;
        }
        else if (this.listingpos == "last"){
            return this.wordcount*this.lpprice*this.duration;
        }
        else{
            System.out.println("False input.");
        }
    }
    }

    }

    //fouse kissmyass
