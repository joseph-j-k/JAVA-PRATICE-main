import java.util.ArrayList;
public calss BloodManagement{
    String name;
    ArrayList<Blood>blood=new ArrayList<>();
    public BloodManagement(String name){
        this.name=name;
    }
    public Blood findBlood(String bloodgrp,String blooddnr){
        for(Blood a:bloods){
            if(a.bloodgrp.equals(bloodgrp)&& a.blooddnr.equals(blooddnr)){
                return a;
            }
        }
        reurn null;
    }
    public void NewDonar(int id,String bloodgrp,blooddonr)
    Blood a1=findBlood(bloodgrp,blooddnr);
    if(a1!=null){
        if(a1.id==donarid){
            a1.id+=donarid;
            
        }
        else
        {
            System.out.println("The donor is not available");
        }
    }
}
public void SpecificBloodgrp(int id,String bloodgrp,blooddonr){
    int i=3;
    int month;
    if(i>month){
        System.out.println("This will set the availability status of that donor to true.");
    }
}
public void order(int id,String bloodgrp,String blooddonr){
    Blood a1=findBlood(bloodgrp,blooddnr);
    if(a1!=null){
        a1.id=donarid;
    }
    else{
        Blood a=NewBlooddnr(id,bloodgrp,blooddnr);
        blooddnr.add(a);

    }
}
public void display(){
    for(Blood a:blooddnr){
        System.out.println(a);
    }
}
}