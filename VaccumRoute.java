import java.util.HashMap;
import java.util.Map;

public class VaccumRoute {
    public static void main(String[] args) {
        System.out.println(willReturn("LR"));
        System.out.println(willReturn("URURD"));
        System.out.println(willReturn("RUULLDRD"));
    }

    public static boolean willReturn(String s) {
        Map<Character, Integer> routeMap = new HashMap<>();
        // Adding all the directions
        routeMap.put('L', 0);
        routeMap.put('R', 0);
        routeMap.put('U', 0);
        routeMap.put('D', 0);

        for (int i = 0; i < s.length(); i++) {
            if (!routeMap.containsKey(s.charAt(i))) {
                return false;
            }

            routeMap.put(s.charAt(i), routeMap.get(s.charAt(i)) + 1);
        }

        if (routeMap.get('L') == routeMap.get('R') && routeMap.get('U') == routeMap.get('D')) {
            return true;
        }

        return false;
    }
}
