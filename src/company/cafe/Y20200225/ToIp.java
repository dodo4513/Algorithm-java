package company.cafe.Y20200225;

/**
 * @author cyclamen on 2/26/20
 */
public class ToIp {

  public static String defangIPaddr(String address) {
    return address.replaceAll("\\.", "[.]");
  }

  public static void main(String[] args) {
    System.out.println(defangIPaddr("1.1.1.1"));

    String a= "++123+dddd+qwenkqwnje+";
    System.out.println(a.replaceAll("\\+", "%20"));


    String c= "131231(23213";

    System.out.println(c.split("\\(")[0]);
  }
}
