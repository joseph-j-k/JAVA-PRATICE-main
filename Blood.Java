public class Blood{
    int id;
    String bloodgrp;
    String blooddonr;

    public Blood(int id,String bloodgrp,string blooddonr){
        this.id=id;
        this.bloodgrp=bloodgrp;
        this.blooddonr=blooddonr;
    }
    public String to String(){
        return " Blood [id="+id+",bloodgrp="+bloodgrp+",blooddonr="+blooddonr+"];
    }
}