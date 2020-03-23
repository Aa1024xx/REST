package contents;

import api.utils.UtilsMethod;

public class Contents {

   // https://maps.googleapis.com/maps/api/place/findplacefromtext/output?parameters

   // domain name
    public static class ServerName{
        public static String GOOGLE_PLACE_SERVE = "https://maps.googleapis.com/";
   }

   // path
   public static class Path{
       public static String GOOGLE_PLACE_PATH = "maps/api/place/";
   }

   // endpoint
   public static class EndPoint{
       public static String GOOGLE_PLACE_ENDPOINT_SEARCH = "findplacefromtext/json";
   }

   public static final String API_TOKEN = UtilsMethod.getValue("TOKEN");
}
