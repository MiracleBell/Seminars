package seminar.half1.sem4;

public class ParamService {
    public static Param[] parse(String str) {
        String[] items = str.split(",");
        Param[] params = new Param[items.length];
        for (int i = 0; i < items.length; i++) {
            String[] nameAndValue = items[i].split("=");
            params[i] = new Param(nameAndValue[0], nameAndValue[1]);
        }
        return params;
    }
}
