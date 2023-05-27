import java.util.*;

class Advertisement{
    
    public int adcode; //kwdikos diafhmishs
    public String addesc; //perigrafh diafhmishs
    public int taxid; //afm forea
    public int adtype; //kwdikos typou diafhmishs
    public String product; //kwdikos proiontos
    public int duration; //diarkeia diafhmishs se meres
    public String details; //aitiologia

    Advertisement(int adcode, String addesc, int taxid, int adtype, String product, int duration, String details){
        this.adcode = adcode;
        this.addesc = addesc;
        this.taxid = taxid;
        this.adtype = adtype;
        this.product = product;
        this.duration = duration;
        this.details = details;
    }

    //setters & getters 
}
