package testaboutclass.others;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午9:01 18-5-29
 * @Modified: null
 */
public class Girl {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy)
    {
        System.out.println(this.name + "　和　" + boy.getName() + "结婚了");
    }
}