package MyBatisthree.pojo;

public class provice {
    private int pid;

    private String pName;

    private country  cou;

    public country getCou() {
        return cou;
    }

    public void setCou(country cou) {
        this.cou = cou;
    }

    @Override
    public String toString() {
        return "provice{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                ", cou=" + cou +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
}
