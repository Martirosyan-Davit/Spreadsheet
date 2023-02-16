package dates;
public class ToDate {
    private int day;
    private int month;
    private int year;

        public  void date(String s) {
            boolean flag = false;
            String st = null;
            for (int i = 0; i < s.length(); ++i) {
               if (s.charAt(i) == '/') {
                    st = String.valueOf(s.charAt(i));
                    flag = true;
                    break;
               }
               if (s.charAt(i) == '-') {
                    flag = true;
                    st = String.valueOf(s.charAt(i));
                    break;
               }
               if (s.charAt(i) == '.') {
                    flag = true;
                    st = String.valueOf(s.charAt(i));
                    break;
               }
            }
            if (flag) {
              String[] d =  s.split(st);
               for (int i = 0; i < d.length; ++i) {
                 int num = Integer.parseInt(d[i]);
                  if (num > 0) {
                     if (num <= 31) {
                        this.day = num;
                     }
                     if (num <= 12) {
                        this.month = num;
                     }
                     if (num >= 1000) {
                        this.year = num;
                     }
                  }
               }
            }
        }
//
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
}
