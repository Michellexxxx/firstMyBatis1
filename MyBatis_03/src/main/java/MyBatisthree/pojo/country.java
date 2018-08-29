package MyBatisthree.pojo;

import java.io.Serializable;
import java.util.Set;

public class country implements Serializable {
    private  int cid;

    private  String cName;

   private Set<provice> provices;

    @Override
    public String toString() {
        return "country{" +
                "cid=" + cid +
                ", cName='" + cName + '\'' +
                ", provices=" + provices +
                '}';
    }

    public country(){}

   public country(int cid,String cName,Set<provice> provice){
       this.cid=cid;
       this.cName=cName;
       this.provices=provice;
   }

    public Set<provice> getProvices() {
        return provices;
    }

    public void setProvices(Set<provice> provices) {
        this.provices = provices;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
