import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Chalao Na Naino Se Baan Re", "Chalao na naino se baan re.. jaan lelo na jaan re... aauoooooooo");
        trackList.put("Sajna Ji Vari Vari",
                "Sajna ji vari vari jaungi mai, tu he to mera sansaar hai.. kaisa mera pyaar hai, aisa mera pyaar haaaaiiiiii");
        trackList.put("Tere Bin",
                "Tere bin there is no desire.. tere bin my world's on fire.. tere bin i can't fly high high high higherrr");
        trackList.put("Jab Tak Hai Jaan",
                "OOOOO jab tak hai jaan, jaane jigar main naachongi... main nachoongi... main nachoongi...");

        Set<String> keys = trackList.keySet();
        System.out.println("\nSong by Name: \n");
        System.out.println(trackList.containsKey("Tere Bin"));
        for (String key : keys) {
            System.out.println("\n");
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}